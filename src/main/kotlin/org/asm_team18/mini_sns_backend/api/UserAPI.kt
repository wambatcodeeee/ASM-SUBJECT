package org.asm_team18.mini_sns_backend.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

interface UserAPI {
    @GetMapping("/health")
    fun health(): ResponseEntity<String>
}