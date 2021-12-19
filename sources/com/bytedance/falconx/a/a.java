package com.bytedance.falconx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<com.bytedance.falconx.a.a.a> f28761a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<C0616a> f28762b = new ArrayList();

    static {
        Covode.recordClassIndex(16915);
    }

    public static void a(String str, String str2, long j2) {
        MethodCollector.i(5763);
        if (!b.f28775a) {
            MethodCollector.o(5763);
            return;
        }
        List<C0616a> list = f28762b;
        synchronized (list) {
            try {
                list.add(new C0616a(false, str, str2, j2));
            } finally {
                MethodCollector.o(5763);
            }
        }
    }

    /* renamed from: com.bytedance.falconx.a.a$a  reason: collision with other inner class name */
    public static class C0616a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f28771a;

        /* renamed from: b  reason: collision with root package name */
        public String f28772b;

        /* renamed from: c  reason: collision with root package name */
        public String f28773c;

        /* renamed from: d  reason: collision with root package name */
        public long f28774d;

        static {
            Covode.recordClassIndex(16916);
        }

        public C0616a(boolean z, String str, String str2, long j2) {
            this.f28771a = z;
            this.f28772b = str;
            this.f28773c = str2;
            this.f28774d = j2;
        }
    }
}
