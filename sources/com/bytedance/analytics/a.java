package com.bytedance.analytics;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6502a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f6503b;

    /* renamed from: c  reason: collision with root package name */
    public String f6504c;

    /* renamed from: d  reason: collision with root package name */
    public c f6505d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Fragment> f6506e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6507f;

    /* renamed from: g  reason: collision with root package name */
    public String f6508g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f6509h;

    /* renamed from: i  reason: collision with root package name */
    public int f6510i;

    static {
        Covode.recordClassIndex(3135);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(3137);
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: com.bytedance.analytics.a$a  reason: collision with other inner class name */
    public static final class C0087a {

        /* renamed from: a  reason: collision with root package name */
        public String f6516a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f6517b = "";

        /* renamed from: c  reason: collision with root package name */
        public c f6518c = c.TODO;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<Fragment> f6519d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6520e;

        /* renamed from: f  reason: collision with root package name */
        public String f6521f = "";

        /* renamed from: g  reason: collision with root package name */
        public Map<String, String> f6522g;

        static {
            Covode.recordClassIndex(3136);
        }

        public final a a() {
            return new a(this);
        }

        public final void b(String str) {
            l.d(str, "");
            this.f6517b = str;
        }

        public final void a(c cVar) {
            l.d(cVar, "");
            this.f6518c = cVar;
        }

        public final void a(String str) {
            l.d(str, "");
            this.f6516a = str;
        }
    }

    public enum c {
        Activity,
        Fragment,
        Dialog,
        Other,
        TODO;

        static {
            Covode.recordClassIndex(3138);
        }
    }

    public a(C0087a aVar) {
        l.d(aVar, "");
        this.f6503b = aVar.f6516a;
        this.f6504c = aVar.f6517b;
        this.f6505d = aVar.f6518c;
        this.f6506e = aVar.f6519d;
        this.f6507f = aVar.f6520e;
        this.f6508g = aVar.f6521f;
        this.f6509h = aVar.f6522g;
    }
}
