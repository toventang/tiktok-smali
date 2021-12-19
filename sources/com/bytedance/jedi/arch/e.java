package com.bytedance.jedi.arch;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ad.b f39405a = new a();

    public static final class a implements ad.b {
        static {
            Covode.recordClassIndex(24186);
        }

        a() {
        }

        @Override // androidx.lifecycle.ad.b
        public final <T extends ac> T a(Class<T> cls) {
            l.c(cls, "");
            throw new as(cls.getSimpleName() + " should be created in the host before being used.");
        }
    }

    static {
        Covode.recordClassIndex(24185);
    }
}
