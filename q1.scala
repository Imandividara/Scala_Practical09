object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = deposit => {
      if (deposit <= 20000) deposit * 0.02
      else if (deposit <= 200000) deposit * 0.04
      else if (deposit <= 2000000) deposit * 0.035
      else deposit * 0.065
    }

    
    val depositAmount = 1500000.0  
    val interest = calculateInterest(depositAmount)

    println(f"The interest earned on Rs. $depositAmount%.2f is Rs. $interest%.2f")
  }
}
