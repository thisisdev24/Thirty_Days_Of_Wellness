package com.example.thirtydaysofwellness.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysofwellness.R

data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val day: Int,
    @StringRes val header: Int,
    @StringRes val description: Int
)

val habits = listOf(
    Day(R.drawable.outdoors, R.string.d1, R.string.d1h, R.string.d1t),
    Day(R.drawable.podcast, R.string.d2, R.string.d2h, R.string.d2t),
    Day(R.drawable.sleep, R.string.d3, R.string.d3h, R.string.d3t),
    Day(R.drawable.water, R.string.d4, R.string.d4h, R.string.d4t),
    Day(R.drawable.rest, R.string.d5, R.string.d5h, R.string.d5t),
    Day(R.drawable.meditate, R.string.d6, R.string.d6h, R.string.d6t),
    Day(R.drawable.yoga, R.string.d7, R.string.d7h, R.string.d7t),
    Day(R.drawable.walk, R.string.d8, R.string.d8h, R.string.d8t),
    Day(R.drawable.run, R.string.d9, R.string.d9h, R.string.d9t),
    Day(R.drawable.music, R.string.d10, R.string.d10h, R.string.d10t),
    Day(R.drawable.dog, R.string.d11, R.string.d11h, R.string.d11t),
    Day(R.drawable.thankyou, R.string.d12, R.string.d12h, R.string.d12t),
    Day(R.drawable.bekind, R.string.d13, R.string.d13h, R.string.d13t),
    Day(R.drawable.pray, R.string.d14, R.string.d14h, R.string.d14t),
    Day(R.drawable.sayno, R.string.d15, R.string.d15h, R.string.d15t),
    Day(R.drawable.bepunctual, R.string.d16, R.string.d16h, R.string.d16t),
    Day(R.drawable.smile, R.string.d17, R.string.d17h, R.string.d17t),
    Day(R.drawable.workout, R.string.d18, R.string.d18h, R.string.d18t),
    Day(R.drawable.social, R.string.d19, R.string.d19h, R.string.d19t),
    Day(R.drawable.freshair, R.string.d20, R.string.d20h, R.string.d20t),
    Day(R.drawable.read, R.string.d21, R.string.d21h, R.string.d21t),
    Day(R.drawable.write, R.string.d22, R.string.d22h, R.string.d22t),
    Day(R.drawable.idea, R.string.d23, R.string.d23h, R.string.d23t),
    Day(R.drawable.talktosomeone, R.string.d24, R.string.d24h, R.string.d24t),
    Day(R.drawable.coffee, R.string.d25, R.string.d25h, R.string.d25t),
    Day(R.drawable.laugh, R.string.d26, R.string.d26h, R.string.d26t),
    Day(R.drawable.eathealthy, R.string.d27, R.string.d27h, R.string.d27t),
    Day(R.drawable.optimistic, R.string.d28, R.string.d28h, R.string.d28t),
    Day(R.drawable.tried, R.string.d29, R.string.d29h, R.string.d29t),
    Day(R.drawable.personalhygiene, R.string.d30, R.string.d30h, R.string.d30t)
)

