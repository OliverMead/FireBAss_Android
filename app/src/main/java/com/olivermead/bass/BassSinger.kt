package com.olivermead.bass

import java.net.URL
import java.util.*

data class BassSinger(val name: String = "",
                      val range: String = "",
                      val dob: Date = Date(),
                      val image_url:URL = URL(""));
