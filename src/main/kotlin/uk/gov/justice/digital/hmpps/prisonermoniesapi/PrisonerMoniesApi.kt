package uk.gov.justice.digital.hmpps.prisonermoniesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrisonerMoniesApi

fun main(args: Array<String>) {
  runApplication<PrisonerMoniesApi>(*args)
}
