package com.cnbbx

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody



@Controller
@RequestMapping("/web")
class web {
    val index: String
        @RequestMapping(value = "/index", method = arrayOf(RequestMethod.GET))
        @ResponseBody
        get() = "home"
}
