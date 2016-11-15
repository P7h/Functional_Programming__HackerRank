
// https://www.hackerrank.com/challenges/eval-ex/

import scala.annotation.tailrec
import math.pow

def factorial(num: Int): Int = {

    @tailrec
    def tailRecFact(innerNum: Int, acc: Int): Int = {
        innerNum match {
            case 0 => acc
            case _ => tailRecFact((innerNum-1), acc * innerNum)
        }
    }
    tailRecFact(num, 1)
}

def ePowerX(num: Double): Double = {

    def findPower(count: Double): Double = {
        pow(num, count) / factorial(count.toInt)
    }

    @tailrec
    def tailRecEPowerX(count: Double, acc: Double): Double = {
        count match {
            case 0 => acc
            case _ => tailRecEPowerX((count-1), (acc + findPower(count)))
        }
    }
    tailRecEPowerX(9, 0)
}
