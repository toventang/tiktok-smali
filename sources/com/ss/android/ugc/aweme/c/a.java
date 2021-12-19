package com.ss.android.ugc.aweme.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f69576a;

    /* renamed from: b  reason: collision with root package name */
    public final long f69577b;

    /* renamed from: c  reason: collision with root package name */
    public final String f69578c;

    /* renamed from: d  reason: collision with root package name */
    public final String f69579d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f69580e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f69581f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f69582g;

    static {
        Covode.recordClassIndex(42923);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f69576a, aVar.f69576a) && this.f69577b == aVar.f69577b && l.a(this.f69578c, aVar.f69578c) && l.a(this.f69579d, aVar.f69579d) && this.f69580e == aVar.f69580e && this.f69581f == aVar.f69581f && this.f69582g == aVar.f69582g;
    }

    public final String toString() {
        return "AIMusicFetchTaskParam(uploadFrameTaskParam=" + this.f69576a + ", videoDuration=" + this.f69577b + ", creationId=" + this.f69578c + ", microAppId=" + this.f69579d + ", isPhotoMVMode=" + this.f69580e + ", requestAiMusicAdvance=" + this.f69581f + ", waitFrameUploaded=" + this.f69582g + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        e eVar = this.f69576a;
        int i4 = 0;
        if (eVar != null) {
            i2 = eVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f69577b;
        int i5 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f69578c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str2 = this.f69579d;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i7 = (i6 + i4) * 31;
        boolean z = this.f69580e;
        int i8 = 1;
        if (z) {
            z = true;
        }
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = (i7 + i9) * 31;
        boolean z2 = this.f69581f;
        if (z2) {
            z2 = true;
        }
        int i13 = z2 ? 1 : 0;
        int i14 = z2 ? 1 : 0;
        int i15 = z2 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        if (!this.f69582g) {
            i8 = 0;
        }
        return i16 + i8;
    }

    public final boolean a(a aVar) {
        l.d(aVar, "");
        e eVar = this.f69576a;
        if (eVar == null && aVar.f69576a == null) {
            return true;
        }
        e eVar2 = aVar.f69576a;
        if (eVar2 == null || eVar == null) {
            return false;
        }
        return eVar.a(eVar2);
    }

    private a(e eVar, long j2, String str, String str2, boolean z, boolean z2) {
        l.d(str, "");
        l.d(str2, "");
        this.f69576a = eVar;
        this.f69577b = j2;
        this.f69578c = str;
        this.f69579d = str2;
        this.f69580e = false;
        this.f69581f = z;
        this.f69582g = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(com.ss.android.ugc.aweme.c.e r9, long r10, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, int r16) {
        /*
            r8 = this;
            r2 = r10
            r7 = r15
            r4 = r12
            r6 = r14
            r0 = r16 & 2
            if (r0 == 0) goto L_0x000c
            r0 = -1
            r2 = -1
        L_0x000c:
            r0 = r16 & 4
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0013
            r4 = r5
        L_0x0013:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x0029
        L_0x0017:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001d
            r0 = 0
            r6 = 0
        L_0x001d:
            r0 = r16 & 64
            if (r0 == 0) goto L_0x0023
            r0 = 1
            r7 = 1
        L_0x0023:
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        L_0x0029:
            r5 = r13
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.c.a.<init>(com.ss.android.ugc.aweme.c.e, long, java.lang.String, java.lang.String, boolean, boolean, int):void");
    }
}
