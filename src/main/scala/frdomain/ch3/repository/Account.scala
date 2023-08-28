package frdomain.ch3
package repository

import java.util.{ Calendar, Date }

object common {
  type Amount = BigDecimal

  val today: Date = Calendar.getInstance.getTime
}

import frdomain.ch3.repository.common._

case class Balance(amount: Amount = 0)

final case class Account(
  no: String,
  name: String,
  dateOfOpening: Date = today,
  dateOfClosing: Option[Date] = None,
  balance: Balance = Balance(0)
)
