package com.squareup.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {
    private static final long s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    int f58112a;

    /* renamed from: b  reason: collision with root package name */
    long f58113b;

    /* renamed from: c  reason: collision with root package name */
    int f58114c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f58115d;

    /* renamed from: e  reason: collision with root package name */
    public final int f58116e;

    /* renamed from: f  reason: collision with root package name */
    public final String f58117f;

    /* renamed from: g  reason: collision with root package name */
    public final List<ac> f58118g;

    /* renamed from: h  reason: collision with root package name */
    public final int f58119h;

    /* renamed from: i  reason: collision with root package name */
    public final int f58120i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f58121j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f58122k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f58123l;

    /* renamed from: m  reason: collision with root package name */
    public final float f58124m;
    public final float n;
    public final float o;
    public final boolean p;
    public final Bitmap.Config q;
    public final t.e r;

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f58118g != null) {
            return true;
        }
        return false;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Uri f58125a;

        /* renamed from: b  reason: collision with root package name */
        private int f58126b = 0;

        /* renamed from: c  reason: collision with root package name */
        private String f58127c;

        /* renamed from: d  reason: collision with root package name */
        private int f58128d;

        /* renamed from: e  reason: collision with root package name */
        private int f58129e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f58130f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f58131g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f58132h;

        /* renamed from: i  reason: collision with root package name */
        private float f58133i;

        /* renamed from: j  reason: collision with root package name */
        private float f58134j;

        /* renamed from: k  reason: collision with root package name */
        private float f58135k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f58136l;

        /* renamed from: m  reason: collision with root package name */
        private List<ac> f58137m;
        private Bitmap.Config n;
        private t.e o;

        static {
            Covode.recordClassIndex(36090);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f58125a == null && this.f58126b == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (this.f58128d == 0 && this.f58129e == 0) {
                return false;
            }
            return true;
        }

        public final w c() {
            boolean z = this.f58131g;
            if (z && this.f58130f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f58130f && this.f58128d == 0 && this.f58129e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.f58128d == 0 && this.f58129e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.o == null) {
                    this.o = t.e.NORMAL;
                }
                return new w(this.f58125a, this.f58126b, this.f58127c, this.f58137m, this.f58128d, this.f58129e, this.f58130f, this.f58131g, this.f58132h, this.f58133i, this.f58134j, this.f58135k, this.f58136l, this.n, this.o, (byte) 0);
            }
        }

        a(Uri uri, Bitmap.Config config) {
            this.f58125a = uri;
            this.n = config;
        }

        public final a a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f58128d = i2;
                this.f58129e = i3;
                return this;
            }
        }
    }

    public final boolean c() {
        if (this.f58119h == 0 && this.f58120i == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(36089);
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return "[R" + this.f58112a + ']';
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (c() || this.f58124m != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        long nanoTime = System.nanoTime() - this.f58113b;
        if (nanoTime > s) {
            return b() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return b() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.f58116e;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.f58115d);
        }
        List<ac> list = this.f58118g;
        if (list != null && !list.isEmpty()) {
            for (ac acVar : this.f58118g) {
                sb.append(' ').append(acVar.b());
            }
        }
        if (this.f58117f != null) {
            sb.append(" stableKey(").append(this.f58117f).append(')');
        }
        if (this.f58119h > 0) {
            sb.append(" resize(").append(this.f58119h).append(',').append(this.f58120i).append(')');
        }
        if (this.f58121j) {
            sb.append(" centerCrop");
        }
        if (this.f58122k) {
            sb.append(" centerInside");
        }
        if (this.f58124m != 0.0f) {
            sb.append(" rotation(").append(this.f58124m);
            if (this.p) {
                sb.append(" @ ").append(this.n).append(',').append(this.o);
            }
            sb.append(')');
        }
        if (this.q != null) {
            sb.append(' ').append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }

    private w(Uri uri, int i2, String str, List<ac> list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Bitmap.Config config, t.e eVar) {
        this.f58115d = uri;
        this.f58116e = i2;
        this.f58117f = str;
        if (list == null) {
            this.f58118g = null;
        } else {
            this.f58118g = Collections.unmodifiableList(list);
        }
        this.f58119h = i3;
        this.f58120i = i4;
        this.f58121j = z;
        this.f58122k = z2;
        this.f58123l = z3;
        this.f58124m = f2;
        this.n = f3;
        this.o = f4;
        this.p = z4;
        this.q = config;
        this.r = eVar;
    }

    /* synthetic */ w(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Bitmap.Config config, t.e eVar, byte b2) {
        this(uri, i2, str, list, i3, i4, z, z2, z3, f2, f3, f4, z4, config, eVar);
    }
}
