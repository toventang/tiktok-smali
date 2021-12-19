package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n extends c<n> {

    /* renamed from: a  reason: collision with root package name */
    public static long f121262a;

    /* renamed from: b  reason: collision with root package name */
    public static long f121263b;
    public static final a q = new a((byte) 0);

    static {
        Covode.recordClassIndex(79033);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79034);
        }

        private a() {
        }

        private static void a() {
            n.f121262a = 0;
            n.f121263b = 0;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2) {
            if (i2 == 0) {
                n.f121262a = System.currentTimeMillis();
            } else {
                n.f121263b = System.currentTimeMillis();
            }
        }

        public static void a(String str) {
            l.d(str, "");
            n r = new n().r(str);
            long j2 = n.f121263b - n.f121262a;
            if (j2 > 0) {
                r.c("suggest_words_loadtime", String.valueOf(j2));
                r.f();
                a();
            }
        }
    }

    public n() {
        super("history_sug_words_loadtime");
    }

    public final n r(String str) {
        l.d(str, "");
        c("load_type", str);
        return this;
    }
}
