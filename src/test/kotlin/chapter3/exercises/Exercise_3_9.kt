package chapter3.exercises

import chapter3.Cons
import chapter3.List
import chapter3.Nil
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

// tag::init[]
tailrec fun <A, B> foldLeft(xs: List<A>, z: B, f: (B, A) -> B): B = TODO()
// end::init[]

class Exercise_3_9 : WordSpec({
    "list foldLeft" should {
        "!apply a function f providing a zero accumulator from tail recursive position" {
            chapter3.solutions.foldLeft(List.of(1, 2, 3, 4, 5), 0, { x, y -> x + y }) shouldBe 15
        }
    }
})