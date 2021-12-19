package com.snapchat.kit.sdk.creative.d;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.creative.c.e;
import java.io.File;

public final class d extends a {

    /* renamed from: d  reason: collision with root package name */
    private e f57313d;

    static {
        Covode.recordClassIndex(35836);
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final String a() {
        return "preview";
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final String b() {
        return "snapvideo/*";
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final File c() {
        return this.f57313d.f57305a;
    }

    public d(e eVar) {
        this.f57313d = eVar;
    }
}
