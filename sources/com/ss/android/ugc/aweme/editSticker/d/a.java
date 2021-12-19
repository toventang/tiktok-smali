package com.ss.android.ugc.aweme.editSticker.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C2138a f88128i = new C2138a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f88129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f88130b;

    /* renamed from: c  reason: collision with root package name */
    public final String f88131c;

    /* renamed from: d  reason: collision with root package name */
    public final String f88132d;

    /* renamed from: e  reason: collision with root package name */
    public final String f88133e;

    /* renamed from: f  reason: collision with root package name */
    public final int f88134f;

    /* renamed from: g  reason: collision with root package name */
    public int f88135g;

    /* renamed from: h  reason: collision with root package name */
    public int f88136h;

    static {
        Covode.recordClassIndex(55395);
    }

    public a() {
        this(null, null, null, null, null, 0, 0, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f88129a, aVar.f88129a) && l.a(this.f88130b, aVar.f88130b) && l.a(this.f88131c, aVar.f88131c) && l.a(this.f88132d, aVar.f88132d) && l.a(this.f88133e, aVar.f88133e) && this.f88134f == aVar.f88134f && this.f88135g == aVar.f88135g && this.f88136h == aVar.f88136h;
    }

    public final int hashCode() {
        String str = this.f88129a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f88130b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f88131c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f88132d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f88133e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return ((((((hashCode4 + i2) * 31) + this.f88134f) * 31) + this.f88135g) * 31) + this.f88136h;
    }

    public final String toString() {
        return "EffectTextMobParams(textId=" + this.f88129a + ", fontId=" + this.f88130b + ", fontName=" + this.f88131c + ", textColor=" + this.f88132d + ", textStyle=" + this.f88133e + ", isText=" + this.f88134f + ", isPicAdjust=" + this.f88135g + ", isToasted=" + this.f88136h + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.d.a$a  reason: collision with other inner class name */
    public static final class C2138a {
        static {
            Covode.recordClassIndex(55396);
        }

        private C2138a() {
        }

        public /* synthetic */ C2138a(byte b2) {
            this();
        }
    }

    private a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f88129a = str;
        this.f88130b = str2;
        this.f88131c = str3;
        this.f88132d = str4;
        this.f88133e = str5;
        this.f88134f = i2;
        this.f88135g = i3;
        this.f88136h = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, int r19) {
        /*
            r10 = this;
            r1 = r19
            r8 = r17
            r7 = r16
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0 = r1 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x003b
        L_0x0024:
            r0 = r1 & 32
            r9 = 0
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x002f
            r8 = 0
        L_0x002f:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
        L_0x0033:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0038:
            r9 = r18
            goto L_0x0033
        L_0x003b:
            r6 = r15
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.d.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int):void");
    }
}
