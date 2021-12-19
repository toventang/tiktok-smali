package com.ss.android.ugc.aweme.dsp.playerservice.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f83389a;

    /* renamed from: b  reason: collision with root package name */
    public String f83390b;

    /* renamed from: c  reason: collision with root package name */
    public String f83391c;

    /* renamed from: d  reason: collision with root package name */
    public String f83392d;

    /* renamed from: e  reason: collision with root package name */
    public String f83393e;

    static {
        Covode.recordClassIndex(52041);
    }

    public i() {
        this(null, null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f83389a, iVar.f83389a) && l.a(this.f83390b, iVar.f83390b) && l.a(this.f83391c, iVar.f83391c) && l.a(this.f83392d, iVar.f83392d) && l.a(this.f83393e, iVar.f83393e);
    }

    public final int hashCode() {
        String str = this.f83389a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83390b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83391c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83392d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f83393e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PlayableQueueEventData(fromGroupId=" + this.f83389a + ", fromGroupType=" + this.f83390b + ", sceneName=" + this.f83391c + ", enterFrom=" + this.f83392d + ", enterMethod=" + this.f83393e + ")";
    }

    private i(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f83389a = str;
        this.f83390b = str2;
        this.f83391c = str3;
        this.f83392d = str4;
        this.f83393e = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playerservice.b.i.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
