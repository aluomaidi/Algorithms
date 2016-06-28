package test.sort

import sort.InsertionSort


/**
  * Created by admin on 2016/6/28.
  */
object InsertionSortTest {

  def main(args: Array[String]) {
    var data = Array(1,4,5,2,3)
//    var array = InsertionSort(data)
//    var array = InsertionSort(data, false)
    var array = InsertionSort(false,1,4,5,2,3)
    for (item <- array) print(item + " ")

  }
}
