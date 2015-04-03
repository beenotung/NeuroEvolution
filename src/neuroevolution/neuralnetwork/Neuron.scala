package neuroevolution.neuralnetwork

/**
 * Created by beenotung on 1/11/15.
 */


class Neuron(var inputWeights: Array[Double], activationFunction: ActivationFunction) {
  var bias: Double = 0d
  var sum: Double = 0d
  var output: Double = 0d

  def this(activationFunction: ActivationFunction) = {
    this(inputWeights = null, activationFunction)
  }

  def setInputWeightNum(n: Int) = {
    inputWeights = Array.fill[Double](n)(0d)
  }

  def run(inputs: Array[Double]): Double = {
    sum = 0
    for (i <- inputs.indices)
      sum += inputs(i) * inputWeights(i)
    output = activationFunction.eval(sum - bias)
    output
  }
}
