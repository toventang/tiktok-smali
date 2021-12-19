package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import java.util.Map;

public abstract class c {

    /* renamed from: b  reason: collision with root package name */
    c f107260b;

    static {
        Covode.recordClassIndex(68611);
    }

    /* access modifiers changed from: package-private */
    public abstract a a(g gVar, Request request, u uVar);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f107261a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f107262b;

        /* renamed from: c  reason: collision with root package name */
        final Map<String, String> f107263c;

        static {
            Covode.recordClassIndex(68612);
        }

        public a() {
            this(false, false);
        }

        public a(boolean z, boolean z2) {
            this.f107261a = z2;
            this.f107262b = z;
        }
    }

    public c(c cVar) {
        this.f107260b = cVar;
    }
}
