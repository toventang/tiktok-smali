package com.ss.android.ugc.aweme.comment.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class c {
    public boolean A;
    public boolean B;
    public String C;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f71987a;

    /* renamed from: b  reason: collision with root package name */
    public String f71988b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71989c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f71990d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f71991e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f71992f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f71993g;

    /* renamed from: h  reason: collision with root package name */
    public String f71994h;

    /* renamed from: i  reason: collision with root package name */
    public String f71995i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f71996j;

    /* renamed from: k  reason: collision with root package name */
    public ae f71997k;

    /* renamed from: l  reason: collision with root package name */
    public List<User> f71998l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f71999m;
    public String n;
    public boolean o;
    public boolean p;
    public Map<String, String> q;
    public int r;
    public String s;
    public int t;
    public int u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    static {
        Covode.recordClassIndex(44237);
    }

    public static final class a {
        private String A;
        private String B;
        private Aweme C;

        /* renamed from: a  reason: collision with root package name */
        public boolean f72000a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f72001b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f72002c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f72003d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f72004e;

        /* renamed from: f  reason: collision with root package name */
        public String f72005f;

        /* renamed from: g  reason: collision with root package name */
        public String f72006g;

        /* renamed from: h  reason: collision with root package name */
        public String f72007h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f72008i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f72009j;

        /* renamed from: k  reason: collision with root package name */
        public Map<String, String> f72010k;

        /* renamed from: l  reason: collision with root package name */
        public int f72011l;

        /* renamed from: m  reason: collision with root package name */
        public String f72012m;
        public int n;
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public String s;
        private List<String> t;
        private boolean u;
        private ae v;
        private List<User> w;
        private boolean x;
        private int y;
        private String z;

        static {
            Covode.recordClassIndex(44238);
        }

        private /* synthetic */ a() {
            this(null);
        }

        public final c a() {
            c cVar = new c((byte) 0);
            cVar.f71987a = this.C;
            String a2 = n.a(this.t, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
            l.d(a2, "");
            cVar.f71988b = a2;
            cVar.f71989c = this.f72000a;
            cVar.f71990d = this.f72001b;
            cVar.f71991e = this.f72003d;
            cVar.f71992f = this.f72002c;
            cVar.f71993g = this.f72004e;
            cVar.f71994h = this.f72005f;
            cVar.f71995i = this.f72006g;
            cVar.f71996j = this.u;
            cVar.f71997k = this.v;
            cVar.f71998l = this.w;
            cVar.f71999m = this.x;
            cVar.n = this.f72007h;
            cVar.o = this.f72008i;
            cVar.r = this.f72011l;
            cVar.s = this.f72012m;
            cVar.t = this.n;
            cVar.p = this.f72009j;
            cVar.q = this.f72010k;
            cVar.v = this.z;
            cVar.u = this.y;
            cVar.w = this.A;
            cVar.x = this.B;
            cVar.y = this.o;
            cVar.z = this.p;
            cVar.A = this.q;
            cVar.B = this.r;
            String str = this.s;
            l.d(str, "");
            cVar.C = str;
            return cVar;
        }

        public final a a(List<String> list) {
            this.t = n.g((Collection) list);
            return this;
        }

        public final a a(String str) {
            if (!(str == null || str.length() == 0)) {
                this.t.add(str);
            }
            return this;
        }

        public a(Aweme aweme) {
            this.C = aweme;
            this.t = new ArrayList();
            this.f72005f = "";
            this.f72006g = "";
            this.u = true;
            this.w = new ArrayList();
            this.f72007h = "";
            this.f72011l = -1;
            this.y = -1;
            this.s = "";
        }
    }

    private c() {
        this.f71988b = "";
        this.f71994h = "";
        this.f71995i = "";
        this.f71996j = true;
        this.n = "";
        this.r = -1;
        this.u = -1;
        this.C = "";
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
