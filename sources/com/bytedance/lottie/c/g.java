package com.bytedance.lottie.c;

import androidx.c.e;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f40652a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final e<String, com.bytedance.lottie.g> f40653b = new e<>(10485760);

    static {
        Covode.recordClassIndex(24932);
    }

    g() {
    }

    public final com.bytedance.lottie.g a(String str) {
        if (str == null) {
            return null;
        }
        return this.f40653b.a(str);
    }

    public final void a(String str, com.bytedance.lottie.g gVar) {
        if (str != null) {
            this.f40653b.a(str, gVar);
        }
    }
}
