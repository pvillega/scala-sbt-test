package com.perevillega

import com.typesafe.scalalogging.LazyLogging
import org.scalactic.ConversionCheckedTripleEquals._
import org.scalactic.TolerantNumerics._

object Hello extends LazyLogging {

  def main(args: Array[String]): Unit = {
    // added to test scalaStyle checks
    val shouldTriggerScalaStyleError = null

    logger.info(s"Logging a message. Params received: [${args.toList}]")

    implicit val dblEquality = tolerantDoubleEquality(0.01)

    logger.info(s"Try Scalatic tolerance here [${2.00001 === 2.0}]")

    logger.warn("Shut down in progress!")

  }
}

