case class BankAccount(){
    @volatile private var balance : Option[Int] = Some(0)

    def incrementBalance(value : Int) : Option[Int] = synchronized {
        balance = balance.map( _ + value) 
        balance
    }
    
    def getBalance : Option[Int] = synchronized { balance }
    
    def closeAccount() : Unit = synchronized {
        balance = None
    }
}
