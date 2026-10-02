package uk.gov.justice.digital.hmpps.prisonermoniesapi.resource

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Temporary placeholder endpoint until real API resources are added
@RestController
@RequestMapping("/debug")
@Tag(name = "Debug")
class DebugResource {

  @GetMapping("/ping")
  @Operation(summary = "Simple debug ping endpoint")
  fun ping(): String = "pong"
}
