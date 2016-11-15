
// https://www.hackerrank.com/challenges/eval-ex/
object Solution {

    def main(args: Array[String]) {
        import scala.collection.mutable.ListBuffer
        System.out.print("Enter number of test cases: ")
        val sc = new java.util.Scanner (System.in)
        var n = sc.nextInt();
        var a0 = 0;
        val buf = new ListBuffer[Double]
        System.out.println("Enter the numbers one after the other below...")
        while(a0 < n){
            var x = sc.nextDouble();
            buf += x;
            a0+=1;
        }
        val inputList = buf.toList
        val outputList = inputList.map(ePowerX)
        val printList = inputList.zip(outputList)
        println("\n\ne Power X of ..")
        printList.foreach { case(i,j) => printf("\t\t %8.4f = %.4f\n", i, j) }
    }
    
import scala.annotation.tailrec
import math._

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
            pow(num, count) / factorial(abs(count.toInt))
        }

        @tailrec
        def tailRecEPowerX(count: Double, acc: Double): Double = {
            count match {
                case 0 => acc
                case _ => tailRecEPowerX((count-1), (acc + findPower(count)))
            }
        }
        //Default the acc value to 1 and then on sum up, as the equation is: 1 + x + x^y/y! + ....
        tailRecEPowerX(9, 1)
    }
}
