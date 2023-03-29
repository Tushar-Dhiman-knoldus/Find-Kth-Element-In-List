package com.knoldus.findkthelement

import scala.util.Try

class FindKthElementInList {

  // Function to find the kth element in the list.
  def kthElementInList[T](list: List[T], number: Int): Try[T] = {
    Try {
      val reversedList = list.reverse
      reversedList(number - 1)
    }
  }
}
