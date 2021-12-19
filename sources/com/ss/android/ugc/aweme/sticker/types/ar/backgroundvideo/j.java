package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public String f135807a;

    /* renamed from: b  reason: collision with root package name */
    public final String f135808b;

    /* renamed from: c  reason: collision with root package name */
    public final long f135809c;

    /* renamed from: d  reason: collision with root package name */
    public final int f135810d;

    /* renamed from: e  reason: collision with root package name */
    public final String f135811e;

    /* renamed from: f  reason: collision with root package name */
    public final String f135812f;

    /* renamed from: g  reason: collision with root package name */
    public final String f135813g;

    static {
        Covode.recordClassIndex(88765);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f135808b, jVar.f135808b) && this.f135809c == jVar.f135809c && this.f135810d == jVar.f135810d && l.a(this.f135811e, jVar.f135811e) && l.a(this.f135812f, jVar.f135812f) && l.a(this.f135813g, jVar.f135813g);
    }

    public final int hashCode() {
        String str = this.f135808b;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f135809c;
        int i3 = ((((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f135810d) * 31;
        String str2 = this.f135811e;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f135812f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f135813g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MediaData(filePath=" + this.f135808b + ", duration=" + this.f135809c + ", mediaType=" + this.f135810d + ", mediaId=" + this.f135811e + ", userName=" + this.f135812f + ", source=" + this.f135813g + ")";
    }

    public j(String str, long j2, int i2, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f135808b = str;
        this.f135809c = j2;
        this.f135810d = i2;
        this.f135811e = str2;
        this.f135812f = str3;
        this.f135813g = str4;
        this.f135807a = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(java.lang.String r9, long r10, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r4 = r12
            r5 = r13
            r7 = r15
            r0 = r16 & 4
            if (r0 == 0) goto L_0x0009
            r0 = 1
            r4 = 1
        L_0x0009:
            r0 = r16 & 8
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0010
            r5 = r6
        L_0x0010:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0021
        L_0x0014:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = "unknown"
        L_0x001a:
            r0 = r8
            r2 = r10
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        L_0x0021:
            r6 = r14
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j.<init>(java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
