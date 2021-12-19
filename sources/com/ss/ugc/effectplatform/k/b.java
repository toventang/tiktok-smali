package com.ss.ugc.effectplatform.k;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f153642a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(102438);
    }

    public static c a(String str, Object obj) {
        l.c(str, "");
        if (obj instanceof Context) {
            return new a((Context) obj, str);
        }
        throw new IllegalArgumentException("must parse context arguement in Settings!");
    }
}
