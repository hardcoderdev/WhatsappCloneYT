package hardcoder.dev.whatsappcloneyt.ui.base.extensions

@Suppress("UNCHECKED_CAST")
inline fun <reified T> Any?.castOrNull(): T? = this as? T

fun Any?.isNull() = this == null