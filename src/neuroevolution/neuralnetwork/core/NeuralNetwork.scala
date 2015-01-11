package neuroevolution.neuralnetwork.core

/**
 * Created by beenotung on 1/11/15.
 */

import scala.math.exp

abstract class ActivationFunction {
  def eval(value: Double): Double
}

object Sigmoid extends ActivationFunction {
  override def eval(value: Double): Double = {
    1d / (1d + exp(-value))
  }
}

object NeuralNetworkApplication extends App {
  override def main(args: Array[String]): Unit = {
    println("start")

    menu

    println("end")
  }

  def menu: Unit = {
    println("loading")
    test
  }

  def test: Unit = {
    //TODO demo test
  }
}
