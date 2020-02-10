package com.adjectivecolournoun.helloworld

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping(path = '/greeting')
    Map<String, String> sayHello(@RequestParam(required = false) String name) {
        def greeting = "Hello, ${name ?: System.getenv('NAME') ?: 'World'}!".toString()
        [greeting: greeting]
    }
}
