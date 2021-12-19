package com.lynx.tasm.ui.image.a;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.o.c;
import com.lynx.react.bridge.ReadableMap;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public final ReadableMap f56926a;

    static {
        Covode.recordClassIndex(35426);
    }

    private d(c cVar, ReadableMap readableMap) {
        super(cVar);
        this.f56926a = readableMap;
    }

    public static d a(c cVar, ReadableMap readableMap) {
        return new d(cVar, readableMap);
    }
}
