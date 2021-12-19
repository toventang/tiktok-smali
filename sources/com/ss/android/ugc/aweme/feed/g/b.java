package com.ss.android.ugc.aweme.feed.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ct.c;
import com.ss.android.ugc.aweme.ct.d;
import com.ss.android.ugc.aweme.feed.experiment.ai;

public class b {

    /* renamed from: f  reason: collision with root package name */
    public static final String f93175f = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f93176a;

    /* renamed from: b  reason: collision with root package name */
    public int f93177b;

    /* renamed from: c  reason: collision with root package name */
    public int f93178c;

    /* renamed from: d  reason: collision with root package name */
    public int f93179d;

    /* renamed from: e  reason: collision with root package name */
    public a<String, C2263b> f93180e;

    /* renamed from: g  reason: collision with root package name */
    private int f93181g;

    /* renamed from: h  reason: collision with root package name */
    private long f93182h;

    /* renamed from: com.ss.android.ugc.aweme.feed.g.b$b  reason: collision with other inner class name */
    public static final class C2263b {

        /* renamed from: a  reason: collision with root package name */
        public int f93184a;

        /* renamed from: b  reason: collision with root package name */
        public int f93185b;

        /* renamed from: c  reason: collision with root package name */
        public int f93186c;

        /* renamed from: d  reason: collision with root package name */
        public int f93187d;

        /* renamed from: e  reason: collision with root package name */
        public int f93188e;

        /* renamed from: f  reason: collision with root package name */
        public int f93189f;

        static {
            Covode.recordClassIndex(59104);
        }

        private C2263b() {
        }

        public /* synthetic */ C2263b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93183a = new b((byte) 0);

        static {
            Covode.recordClassIndex(59103);
        }
    }

    static {
        Covode.recordClassIndex(59102);
    }

    private b() {
        this.f93180e = new a<>();
        this.f93182h = -1;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(String str) {
        if (ai.f93042a) {
            C2263b a2 = this.f93180e.a(str);
            if (a2 == null) {
                a2 = new C2263b((byte) 0);
                this.f93180e.a(str, a2);
            }
            this.f93181g++;
            a2.f93184a = 1;
            d.a a3 = d.a().a(str, c.a.PROFILE);
            if (a3 != null) {
                a3.f79077a.a();
            }
        }
    }
}
