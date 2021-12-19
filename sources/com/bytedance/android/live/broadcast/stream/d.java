package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.stream.a.b;
import com.bytedance.android.livesdk.model.l;
import com.bytedance.covode.number.Covode;

public final class d {
    boolean A = true;
    int B;
    boolean C;
    boolean D;
    String E;
    boolean F;
    String G;
    String H;
    AssetManager I;
    Object J;
    String K;
    boolean L;
    int M;
    String N;
    boolean O;

    /* renamed from: a  reason: collision with root package name */
    Context f8569a;

    /* renamed from: b  reason: collision with root package name */
    String f8570b;

    /* renamed from: c  reason: collision with root package name */
    int f8571c;

    /* renamed from: d  reason: collision with root package name */
    int f8572d;

    /* renamed from: e  reason: collision with root package name */
    int f8573e;

    /* renamed from: f  reason: collision with root package name */
    int f8574f;

    /* renamed from: g  reason: collision with root package name */
    int f8575g;

    /* renamed from: h  reason: collision with root package name */
    int f8576h;

    /* renamed from: i  reason: collision with root package name */
    int f8577i;

    /* renamed from: j  reason: collision with root package name */
    int f8578j;

    /* renamed from: k  reason: collision with root package name */
    int f8579k;

    /* renamed from: l  reason: collision with root package name */
    boolean f8580l;

    /* renamed from: m  reason: collision with root package name */
    int f8581m;
    int n;
    long o;
    int p;
    int q;
    com.bytedance.android.live.broadcast.stream.a.a r;
    com.bytedance.android.live.broadcast.stream.b.a s;
    b t;
    Intent u;
    int v;
    int w;
    l x;
    int y;
    float z;

    static {
        Covode.recordClassIndex(4394);
    }

    public static class a {
        public boolean A;
        public String B;
        public boolean C = true;
        public String D;
        public com.bytedance.android.live.broadcast.stream.a.a E;
        public com.bytedance.android.live.broadcast.stream.b.a F;
        AssetManager G;
        public String H;
        public Object I;
        public boolean J;
        int K;
        int L;
        public int M = 2;
        public String N;
        public boolean O;

        /* renamed from: a  reason: collision with root package name */
        Context f8582a;

        /* renamed from: b  reason: collision with root package name */
        String f8583b;

        /* renamed from: c  reason: collision with root package name */
        public int f8584c;

        /* renamed from: d  reason: collision with root package name */
        public int f8585d;

        /* renamed from: e  reason: collision with root package name */
        public int f8586e;

        /* renamed from: f  reason: collision with root package name */
        public int f8587f;

        /* renamed from: g  reason: collision with root package name */
        public int f8588g;

        /* renamed from: h  reason: collision with root package name */
        public int f8589h;

        /* renamed from: i  reason: collision with root package name */
        public int f8590i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8591j;

        /* renamed from: k  reason: collision with root package name */
        public int f8592k;

        /* renamed from: l  reason: collision with root package name */
        int f8593l;

        /* renamed from: m  reason: collision with root package name */
        public long f8594m;
        int n;
        public int o;
        public Intent p;
        public int q = -1;
        public int r = -1;
        public l s;
        public b t;
        public int u;
        public String v;
        public float w;
        public boolean x;
        public int y;
        public boolean z;

        static {
            Covode.recordClassIndex(4395);
        }

        public final d a() {
            String str;
            int min;
            String str2;
            int i2 = this.f8585d;
            if (i2 == 0) {
                i2 = 500;
            }
            this.f8585d = i2;
            int i3 = this.f8586e;
            if (i3 == 0) {
                i3 = 200;
            }
            this.f8586e = i3;
            int i4 = this.f8587f;
            if (i4 == 0) {
                i4 = 800;
            }
            this.f8587f = i4;
            int i5 = this.f8589h;
            if (i5 == 0) {
                i5 = 360;
            }
            this.f8589h = i5;
            int i6 = this.f8590i;
            if (i6 == 0) {
                i6 = 640;
            }
            this.f8590i = i6;
            int i7 = this.f8588g;
            if (i7 == 0) {
                i7 = 15;
            }
            this.f8588g = i7;
            int i8 = this.f8593l;
            if (i8 == 0) {
                i8 = 9;
            }
            this.f8593l = i8;
            long j2 = this.f8594m;
            if (j2 == 0) {
                j2 = 60000;
            }
            this.f8594m = j2;
            int i9 = this.n;
            if (i9 == 0) {
                i9 = 44100;
            }
            this.n = i9;
            int i10 = 2;
            int i11 = 1;
            if (this.o != 2) {
                i10 = 1;
            }
            this.o = i10;
            String str3 = "";
            if (TextUtils.isEmpty(this.f8583b)) {
                str = str3;
            } else {
                str = this.f8583b;
            }
            this.f8583b = str;
            int i12 = this.f8592k;
            if (i12 == 0) {
                min = 1;
            } else {
                min = Math.min(i12, 3);
            }
            this.f8592k = min;
            int i13 = this.q;
            if (i13 == -1) {
                i13 = 4;
            }
            this.q = i13;
            int i14 = this.r;
            if (i14 == -1) {
                i14 = 1;
            }
            this.r = i14;
            if (str3.equals(this.v)) {
                str2 = "live-stream-sdk";
            } else {
                str2 = this.v;
            }
            this.v = str2;
            int i15 = this.y;
            if (i15 != 0) {
                i11 = i15;
            }
            this.y = i11;
            float f2 = this.w;
            if (f2 == 0.0f) {
                f2 = 2.0f;
            }
            this.w = f2;
            String str4 = this.D;
            if (str4 == null) {
                str4 = str3;
            }
            this.D = str4;
            String str5 = this.B;
            if (str5 != null) {
                str3 = str5;
            }
            this.B = str3;
            return new d(this);
        }

        public a(Context context) {
            this.f8582a = context;
        }

        public final a a(int i2, int i3) {
            this.K = i2;
            this.L = i3;
            return this;
        }
    }

    d(a aVar) {
        this.f8569a = aVar.f8582a;
        this.f8570b = aVar.f8583b;
        this.f8571c = aVar.f8584c;
        this.f8572d = aVar.f8585d;
        this.f8573e = aVar.f8586e;
        this.f8574f = aVar.f8587f;
        this.f8575g = aVar.f8588g;
        this.f8578j = aVar.f8589h;
        this.f8579k = aVar.f8590i;
        this.f8580l = aVar.f8591j;
        this.f8581m = aVar.f8592k;
        this.n = aVar.f8593l;
        this.o = aVar.f8594m;
        this.p = aVar.n;
        this.q = aVar.o;
        this.r = aVar.E;
        this.t = aVar.t;
        this.s = aVar.F;
        this.u = aVar.p;
        this.v = aVar.q;
        this.w = aVar.r;
        this.x = aVar.s;
        this.y = aVar.u;
        this.G = aVar.v;
        this.z = aVar.w;
        this.A = aVar.x;
        this.B = aVar.y;
        this.C = aVar.z;
        this.D = aVar.A;
        this.E = aVar.B;
        this.F = aVar.C;
        this.H = aVar.D;
        this.I = aVar.G;
        this.K = aVar.H;
        this.J = aVar.I;
        this.L = aVar.J;
        this.f8577i = aVar.L;
        this.f8576h = aVar.K;
        this.M = aVar.M;
        this.N = aVar.N;
        this.O = aVar.O;
    }
}
