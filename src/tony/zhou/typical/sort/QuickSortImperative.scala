package tony.zhou.typical.sort

object QuickSortImperative {

  def sort(xs: Array[Int]): Array[Int] = {
    def swap(i: Int, j: Int) {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }

    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1

        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }

    sort1(0, xs.length - 1)

    xs
  }

  def main(args: Array[String]) {
    println(sort(Array(3, 97, 74, 29, 1, 9, 98, 4, 2, 7, 43, 9, 10, 101, 97, 192)).deep.mkString(", "))
  }
}
