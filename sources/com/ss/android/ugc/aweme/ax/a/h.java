package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.android.monitor.g.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class h extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final h f67729c = b.f67732a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f67730d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public z f67731b;

    public static final class a {
        static {
            Covode.recordClassIndex(41690);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final h f67732a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final b f67733b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(41691);
        }
    }

    static {
        Covode.recordClassIndex(41689);
    }

    @Override // com.bytedance.android.monitor.g.c
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(str, "");
        z zVar = this.f67731b;
        if (zVar != null) {
            zVar.a(str, 0, null, jSONObject2, true);
        }
    }
}
