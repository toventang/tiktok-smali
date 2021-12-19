package com.bytedance.ies.bullet.service.popup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.a;
import h.f.b.l;

public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final C0713a f32799m = new C0713a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f32800a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32801b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32802c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32803d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32804e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32805f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32806g;

    /* renamed from: h  reason: collision with root package name */
    public final a.b f32807h;

    /* renamed from: i  reason: collision with root package name */
    public int f32808i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f32809j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f32810k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f32811l;

    static {
        Covode.recordClassIndex(19610);
    }

    public a() {
        this(0, 0, 0, 0, 0, 0, null, 0, false, false, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32800a == aVar.f32800a && this.f32801b == aVar.f32801b && this.f32802c == aVar.f32802c && this.f32803d == aVar.f32803d && this.f32804e == aVar.f32804e && this.f32805f == aVar.f32805f && this.f32806g == aVar.f32806g && l.a(this.f32807h, aVar.f32807h) && this.f32808i == aVar.f32808i && this.f32809j == aVar.f32809j && this.f32810k == aVar.f32810k && this.f32811l == aVar.f32811l;
    }

    public final int hashCode() {
        int i2 = ((((((((((((this.f32800a * 31) + this.f32801b) * 31) + this.f32802c) * 31) + this.f32803d) * 31) + this.f32804e) * 31) + this.f32805f) * 31) + this.f32806g) * 31;
        a.b bVar = this.f32807h;
        int hashCode = (((i2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f32808i) * 31;
        boolean z = this.f32809j;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.f32810k;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f32811l) {
            i3 = 0;
        }
        return i11 + i3;
    }

    public final String toString() {
        return "BottomSheetConfig(mode=" + this.f32800a + ", worldWidth=" + this.f32801b + ", worldHeight=" + this.f32802c + ", touchLimit=" + this.f32803d + ", peekWidth=" + this.f32804e + ", peekHeight=" + this.f32805f + ", radius=" + this.f32806g + ", cancelableProvider=" + this.f32807h + ", dragMaxHeight=" + this.f32808i + ", dragByGesture=" + this.f32809j + ", dragFollowGesture=" + this.f32810k + ", dragBack=" + this.f32811l + ")";
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.a$a  reason: collision with other inner class name */
    public static final class C0713a {
        static {
            Covode.recordClassIndex(19611);
        }

        private C0713a() {
        }

        public /* synthetic */ C0713a(byte b2) {
            this();
        }
    }

    private a(int i2, int i3, int i4, int i5, int i6, int i7, a.b bVar, int i8, boolean z, boolean z2, boolean z3) {
        this.f32800a = 0;
        this.f32801b = i2;
        this.f32802c = i3;
        this.f32803d = i4;
        this.f32804e = i5;
        this.f32805f = i6;
        this.f32806g = i7;
        this.f32807h = bVar;
        this.f32808i = i8;
        this.f32809j = z;
        this.f32810k = z2;
        this.f32811l = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(int r15, int r16, int r17, int r18, int r19, int r20, com.bytedance.ies.bullet.service.popup.a.b r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        /*
            r14 = this;
            r1 = r26
            r12 = r24
            r7 = r19
            r3 = r15
            r8 = r20
            r4 = r16
            r9 = r21
            r5 = r17
            r10 = r22
            r6 = r18
            r0 = r1 & 2
            r11 = 0
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001e
            r4 = 0
        L_0x001e:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0023
            r5 = 0
        L_0x0023:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0028
            r6 = r3
        L_0x0028:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0032
            float r2 = (float) r4
            r0 = 1060823368(0x3f3ae148, float:0.73)
            float r2 = r2 * r0
            int r7 = (int) r2
        L_0x0032:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0037
            r8 = -1
        L_0x0037:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
            r9 = 0
        L_0x003c:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            r10 = 0
        L_0x0041:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0057
        L_0x0045:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            r13 = 1
            if (r0 == 0) goto L_0x004b
            r12 = 1
        L_0x004b:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0054
        L_0x004f:
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0054:
            r13 = r25
            goto L_0x004f
        L_0x0057:
            r11 = r23
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.a.a.<init>(int, int, int, int, int, int, com.bytedance.ies.bullet.service.popup.a$b, int, boolean, boolean, boolean, int):void");
    }
}
