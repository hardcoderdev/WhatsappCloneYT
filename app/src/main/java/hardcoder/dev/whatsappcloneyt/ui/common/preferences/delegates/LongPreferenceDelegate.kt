package hardcoder.dev.whatsappcloneyt.ui.common.preferences.delegates

import android.content.SharedPreferences
import hardcoder.dev.whatsappcloneyt.ui.common.preferences.CommonPreferenceDelegate

class LongPreferenceDelegate(private val defValue: Long, name: String? = null) :
    CommonPreferenceDelegate<Long>(name) {
    override fun getValue(prefs: SharedPreferences, key: String) = prefs.getLong(key, defValue)
    override fun setValue(prefs: SharedPreferences, key: String, value: Long) {
        prefs.edit().putLong(key, value).apply()
    }
}