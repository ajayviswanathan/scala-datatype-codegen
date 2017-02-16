package io.github.ajatix

import io.github.ajatix.Globals.PersonId

/**
  * Created by ajay on 16/02/17
  */
trait PersonDatabase {
  def addPerson(person: Person): Unit
  def getPersonById(personId: PersonId): Person
}

trait DbConnectionPool
trait DatabaseConfig
trait SecurityManager
trait TransactionManager

class RealPersonDatabase(dbConnectionPool: DbConnectionPool, databaseConfig: DatabaseConfig, securityManager: SecurityManager, transactionManager: TransactionManager) extends PersonDatabase {
  def addPerson(person: Person): Unit = ???
  def getPersonById(playerId: PersonId) = ???
}
