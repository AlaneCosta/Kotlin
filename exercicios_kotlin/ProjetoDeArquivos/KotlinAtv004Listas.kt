val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)        
val sudoers: List<Int> = systemUsers                              

fun addSystemUser(newUser: Int) {                                 
    systemUsers.add(newUser)                      
}

fun getSysSudoers(): List<Int> {                                  
    return sudoers
}

fun main() {
    addSystemUser(7)                                               
    println("Tot sudoers: ${getSysSudoers().size}")               
    addSystemUser(8)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {                                    
        i -> println("Some useful info on user $i")
    }
                    
}
