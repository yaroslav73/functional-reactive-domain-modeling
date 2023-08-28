package frdomain.ch3
package algebra.interpreter

import frdomain.ch3.algebra.interpreter.Account.{ Balance, today }

import java.util.{ Calendar, Date }

final case class Account(
  no: String,
  name: String,
  dateOfOpening: Date = today,
  dateOfClosing: Option[Date] = None,
  balance: Balance = Balance()
)

object Account {
  type Amount = BigDecimal

  def today: Date = Calendar.getInstance.getTime

  final case class Balance(amount: Amount = 0)
}
