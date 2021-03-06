package com.soywiz.kgl

import GL.*
import kotlinx.cinterop.*

internal fun wglGetProcAddressAny(name: String): CPointer<*> = memScoped {
    glXGetProcAddress(name.cstr.ptr.reinterpret())
        ?: throw RuntimeException("Can't find GL function: '$name'")
}
