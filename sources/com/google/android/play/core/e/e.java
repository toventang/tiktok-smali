package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f53312a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Locale> f53313b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f53314a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<Locale> f53315b = new ArrayList();

        static {
            Covode.recordClassIndex(32933);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
        }

        public final a a(String str) {
            this.f53314a.add(str);
            return this;
        }

        public final e a() {
            return new e(this);
        }
    }

    static {
        Covode.recordClassIndex(32932);
    }

    public static a a() {
        return new a((byte) 0);
    }

    public final String toString() {
        return com.a.a("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f53312a, this.f53313b});
    }

    /* synthetic */ e(a aVar) {
        this.f53312a = new ArrayList(aVar.f53314a);
        this.f53313b = new ArrayList(aVar.f53315b);
    }
}
