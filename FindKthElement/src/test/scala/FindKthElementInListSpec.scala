package com.knoldus.findkthelement

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.{a, convertToAnyShouldWrapper}
import scala.util.{Failure, Success}


class FindKthElementInListSpec extends AnyFlatSpec {

  val findKthElementInListObject = new FindKthElementInList

  "kthElementInList" should "return the element at kth index" in {

    val index = 4
    val list = List(2, 8, 9, 5, 6, 8, 4)
    val expectedValue = 5
    assert(findKthElementInListObject.kthElementInList(list, index) == Success(expectedValue))
  }

  "kthElementInList" should "return failure if the kth element does not exist" in {

    val index = 8
    val list = List(2, 8, 9, 5, 6, 8, 4)
    findKthElementInListObject.kthElementInList(list, index) shouldBe a[Failure[_]]
  }

  "kthElementInList" should "return failure if the list is empty" in {

    val index = 8
    val list = List.empty[Int]
    findKthElementInListObject.kthElementInList(list, index) shouldBe a[Failure[_]]
  }
}
