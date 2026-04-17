package org.asm_team18.mini_sns_backend.user.controller

import org.asm_team18.mini_sns_backend.api.UserAPI
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController: UserAPI {
    override fun health(): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }
}