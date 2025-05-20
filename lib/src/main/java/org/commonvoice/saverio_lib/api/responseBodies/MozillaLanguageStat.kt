package org.commonvoice.saverio_lib.api.responseBodies

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MozillaLanguageStat(
    @Json(name = "locale") val locale: String,
    @Json(name = "speakersCount") val speakersCount: Int
    // We are only mapping fields relevant to the crash fix.
    // Other fields like 'id', 'recordedHours' etc., can be added later if needed.
)
