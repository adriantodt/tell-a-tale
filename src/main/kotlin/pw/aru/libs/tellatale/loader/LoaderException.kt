package pw.aru.libs.tellatale.loader

class LoaderException(override val message: String, override val cause: Throwable) : Exception(message, cause)