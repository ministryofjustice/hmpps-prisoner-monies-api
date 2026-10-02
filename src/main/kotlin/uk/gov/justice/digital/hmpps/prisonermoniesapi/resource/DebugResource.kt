package uk.gov.justice.digital.hmpps.prisonermoniesapi.resource

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Temporary placeholder endpoint until real API resources are added
@RestController
@RequestMapping("/debug")
@Tag(name = "Debug")
class DebugResource {

  @PreAuthorize("hasRole('ROLE_MTP_USER_ADMIN')")
  @GetMapping("/ping")
  @Operation(summary = "Simple debug ping endpoint accessible by Admin")
  fun ping(): String = "pong"
}
