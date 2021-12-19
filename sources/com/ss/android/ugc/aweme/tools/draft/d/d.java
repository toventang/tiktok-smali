package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import h.f.b.l;
import java.util.List;

public final class d extends c {

    /* renamed from: i  reason: collision with root package name */
    public final int f139486i;

    /* renamed from: j  reason: collision with root package name */
    public String f139487j;

    /* renamed from: k  reason: collision with root package name */
    public List<? extends AVTextExtraStruct> f139488k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f139489l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f139490m;

    static {
        Covode.recordClassIndex(91209);
    }

    public d() {
        this(0, null, null, 0, null, null, null, null, false, 2047);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.d.a
    public final int a() {
        return this.f139486i;
    }

    public final int hashCode() {
        return ((c) this).f139480c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f139486i != this.f139486i || !l.a((Object) ((c) dVar).f139480c, (Object) ((c) this).f139480c) || !l.a((Object) dVar.f139481d, (Object) this.f139481d) || dVar.f139483f != this.f139483f || !l.a((Object) dVar.f139484g, (Object) this.f139484g) || !l.a((Object) dVar.f139485h, (Object) this.f139485h) || !l.a((Object) dVar.f139487j, (Object) this.f139487j) || !l.a(dVar.f139488k, this.f139488k)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(int i2, String str, String str2, long j2, String str3, String str4, String str5, List<? extends AVTextExtraStruct> list, boolean z) {
        super(str, str2, false, j2, str3, str4);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f139486i = i2;
        this.f139487j = str5;
        this.f139488k = list;
        this.f139489l = z;
        this.f139490m = false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(int r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, boolean r22, int r23) {
        /*
            r12 = this;
            r1 = r23
            r11 = r22
            r10 = r21
            r8 = r19
            r7 = r18
            r2 = r13
            r4 = r15
            r3 = r14
            r5 = r16
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0015
            r2 = 101(0x65, float:1.42E-43)
        L_0x0015:
            r0 = r1 & 2
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x001c
            r3 = r9
        L_0x001c:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0021
            r4 = r9
        L_0x0021:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0027
            r5 = 0
        L_0x0027:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002c
            r7 = r9
        L_0x002c:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0031
            r8 = r9
        L_0x0031:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0044
        L_0x0035:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            r10 = 0
        L_0x003a:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x003f
            r11 = 1
        L_0x003f:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        L_0x0044:
            r9 = r20
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.d.d.<init>(int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, int):void");
    }
}
