package com.snapchat.kit.sdk.creative.d;

import com.bytedance.covode.number.Covode;
import java.io.File;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private com.snapchat.kit.sdk.creative.c.c f57312d;

    static {
        Covode.recordClassIndex(35835);
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final String a() {
        return "preview";
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final String b() {
        return "image/*";
    }

    @Override // com.snapchat.kit.sdk.creative.d.a
    public final File c() {
        return this.f57312d.f57295a;
    }

    public c(com.snapchat.kit.sdk.creative.c.c cVar) {
        this.f57312d = cVar;
    }
}
