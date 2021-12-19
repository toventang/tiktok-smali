package dmt.av.video;

import com.bytedance.covode.number.Covode;

public final class u {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f156956a;

    /* renamed from: b  reason: collision with root package name */
    public int f156957b;

    /* renamed from: c  reason: collision with root package name */
    public int f156958c;

    /* renamed from: d  reason: collision with root package name */
    public int f156959d;

    /* renamed from: e  reason: collision with root package name */
    public int f156960e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f156961f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f156962g;

    /* renamed from: h  reason: collision with root package name */
    public long f156963h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f156964i;

    /* renamed from: j  reason: collision with root package name */
    public int f156965j;

    /* renamed from: k  reason: collision with root package name */
    public int f156966k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f156967l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f156968m;

    static {
        Covode.recordClassIndex(104250);
    }

    public static final u a(int i2, int i3, int i4, int i5, int i6) {
        return a.a(i2, i3, i4, i5, i6, false, false, 960);
    }

    public static final u a(int i2, int i3, int i4, int i5, int i6, boolean z) {
        return a.a(i2, i3, i4, i5, i6, z);
    }

    public static final u a(int i2, int i3, int i4, int i5, boolean z) {
        return a.a(i2, 0, i3, i4, i5, true, z, 512);
    }

    public static final u b(int i2, int i3, int i4, int i5, int i6) {
        return a.a(i2, i3, i4, i5, i6);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104251);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static u a(int i2, int i3, int i4, int i5, int i6) {
            u uVar = new u(i2);
            uVar.f156956a = i6;
            uVar.f156957b = 0;
            uVar.f156958c = i3;
            uVar.f156959d = i4;
            uVar.f156960e = i5;
            return uVar;
        }

        public static u a(int i2, int i3, int i4, int i5, int i6, boolean z) {
            u uVar = new u(i2);
            uVar.f156956a = i6;
            uVar.f156957b = 0;
            uVar.f156958c = i3;
            uVar.f156959d = i4;
            uVar.f156960e = i5;
            uVar.f156961f = z;
            uVar.f156962g = true;
            return uVar;
        }

        public static /* synthetic */ u a(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, int i7) {
            boolean z3 = z;
            boolean z4 = z2;
            if ((i7 & 64) != 0) {
                z3 = true;
            }
            if ((i7 & 256) != 0) {
                z4 = false;
            }
            return a(i2, i3, i4, i5, i6, 0, z3, false, z4);
        }

        private static u a(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
            u uVar = new u(1, i2, z, false);
            uVar.f156956a = i6;
            uVar.f156957b = 0;
            uVar.f156958c = i3;
            uVar.f156959d = i4;
            uVar.f156960e = i5;
            uVar.f156961f = z3;
            uVar.f156962g = false;
            return uVar;
        }
    }

    public final u a() {
        this.f156964i = true;
        return this;
    }

    public /* synthetic */ u(int i2) {
        this(0, i2, true, false);
    }

    public u(int i2, int i3, boolean z, boolean z2) {
        this.f156965j = i2;
        this.f156966k = i3;
        this.f156967l = z;
        this.f156968m = z2;
        this.f156963h = 300;
    }
}
