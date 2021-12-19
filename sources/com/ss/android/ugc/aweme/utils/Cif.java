package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.z;
import h.f.b.l;

/* renamed from: com.ss.android.ugc.aweme.utils.if  reason: invalid class name */
public final class Cif {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143097a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final androidx.c.a<String, Boolean> f143098b = new androidx.c.a<>();

    static {
        Covode.recordClassIndex(93666);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.if$a */
    public static final class a {
        static {
            Covode.recordClassIndex(93667);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, long j2) {
            l.d(str, "");
            z A = g.a().A();
            if (A.b() && !A.a()) {
                d.a("tool_performance_ui_react_event", new d().a("action_name", str).a("react_duration", j2).f66730a);
            }
        }
    }

    public final void a(String str, long j2) {
        a(str, j2, false);
    }

    public final void a(String str, long j2, boolean z) {
        l.d(str, "");
        if (!z || !l.a((Object) this.f143098b.get(str), (Object) true)) {
            this.f143098b.put(str, true);
            a.a(str, j2);
        }
    }
}
