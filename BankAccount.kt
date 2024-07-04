class BankAccount(var accountNumber:String ,var balance:Double ,var accountHolderName:String) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance is $$balance.")
        } else {
            println("Invalid deposit amount.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance is $$balance.")
        } else if (amount > balance) {
            println("Insufficient funds. Available balance is $$balance.")
        } else {
            println("Invalid withdrawal amount.")
        }
    }

    fun displayDetails() {
        println("Account Number: $accountNumber")
        println("Account Holder Name: $accountHolderName")
        println("Balance: $$balance")
    }
}