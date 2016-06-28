package sort

/**
  * Created by admin on 2016/6/28.
  */
trait Sort[T] {
    def sort(array: Array[T], isAsc : Boolean) : Array[T]
}
