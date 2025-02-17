package com.example.piazza

import com.example.piazza.BuildConfig

class Api {
    companion object {
        private val baseUrl = if(BuildConfig.DEBUG)
            "http://10.0.2.2:3000"
        else
            "https://piazza-web-l1mc.onrender.com"

        val rootUrl = "$baseUrl/"
        val loginUrl = "$baseUrl/login"
    }
}