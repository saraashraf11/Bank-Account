/*
    Sara Ashraf
 */
fun main() {
    print("Enter your account number: ")
    val accountNumber:String = readLine().toString()
    print("Enter your balance: ")
    val balance:Double = readln().toDouble()
    print("Enter your account holder name: ")
    val accountHolderName:String = readLine().toString()

    val account = BankAccount(accountNumber,balance ,accountHolderName )
    account.displayDetails()

    var num:Int = 0
    while(num != 3) {
        println("If you want to deposit choose 1 else if you want to withdraw choose 2 else if you want to exit choose 3 :")
        num = readln().toInt()
        if (num == 1) {
            print("Enter the amount: ")
            val amount: Double = readln().toDouble()
            account.deposit(amount)
            account.displayDetails()
        } else if (num == 2) {
            print("Enter the amount: ")
            val amount: Double = readln().toDouble()
            account.withdraw(amount)
            account.displayDetails()
        } else {
            println("Invalid number.")
        }
    }
    println("End Program")
}