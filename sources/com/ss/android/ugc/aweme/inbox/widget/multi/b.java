package com.ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b extends k {
    @c(a = "data_type")

    /* renamed from: a  reason: collision with root package name */
    public final e f104442a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f104443b;
    @c(a = "small_avatar_url")

    /* renamed from: c  reason: collision with root package name */
    public final a f104444c;
    @c(a = "new_notice_content")

    /* renamed from: d  reason: collision with root package name */
    public final String f104445d;
    @c(a = "read_point")

    /* renamed from: e  reason: collision with root package name */
    public final n f104446e;
    @c(a = "new_notice_time")

    /* renamed from: f  reason: collision with root package name */
    public final String f104447f;
    @c(a = "icon_res_id")

    /* renamed from: g  reason: collision with root package name */
    public final int f104448g;
    @c(a = "show_arrow")

    /* renamed from: h  reason: collision with root package name */
    public boolean f104449h;
    @c(a = "cache_time")

    /* renamed from: i  reason: collision with root package name */
    public final long f104450i;

    static {
        Covode.recordClassIndex(66885);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f104442a, bVar.f104442a) && l.a(this.f104443b, bVar.f104443b) && l.a(this.f104444c, bVar.f104444c) && l.a(this.f104445d, bVar.f104445d) && l.a(this.f104446e, bVar.f104446e) && l.a(this.f104447f, bVar.f104447f) && this.f104448g == bVar.f104448g && this.f104449h == bVar.f104449h && this.f104450i == bVar.f104450i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final int hashCode() {
        e eVar = this.f104442a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<String> list = this.f104443b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        a aVar = this.f104444c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f104445d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        n nVar = this.f104446e;
        int hashCode5 = (hashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str2 = this.f104447f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (((hashCode5 + i2) * 31) + this.f104448g) * 31;
        boolean z = this.f104449h;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long j2 = this.f104450i;
        return ((i3 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ActivityPod(dataType=" + this.f104442a + ", title=" + this.f104443b + ", smallAvatarUrl=" + this.f104444c + ", newNoticeContent=" + this.f104445d + ", readPoint=" + this.f104446e + ", newNoticeTime=" + this.f104447f + ", iconResId=" + this.f104448g + ", showArrow=" + this.f104449h + ", cacheTime=" + this.f104450i + ")";
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.k
    public final boolean a() {
        if (this.f104446e.f104496b > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(e eVar, List<String> list, a aVar, String str, n nVar, String str2, int i2, boolean z, long j2) {
        super(0);
        l.d(eVar, "");
        l.d(list, "");
        l.d(str, "");
        l.d(nVar, "");
        l.d(str2, "");
        this.f104442a = eVar;
        this.f104443b = list;
        this.f104444c = aVar;
        this.f104445d = str;
        this.f104446e = nVar;
        this.f104447f = str2;
        this.f104448g = i2;
        this.f104449h = z;
        this.f104450i = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(com.ss.android.ugc.aweme.inbox.widget.multi.e r12, java.util.List r13, com.ss.android.ugc.aweme.inbox.widget.multi.a r14, java.lang.String r15, com.ss.android.ugc.aweme.inbox.widget.multi.n r16, java.lang.String r17, int r18, boolean r19, long r20, int r22) {
        /*
            r11 = this;
            r1 = r22
            r9 = r20
            r8 = r19
            r7 = r18
            r2 = r13
            r4 = r15
            r3 = r14
            r5 = r16
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0013
            h.a.z r2 = h.a.z.INSTANCE
        L_0x0013:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0018
            r3 = 0
        L_0x0018:
            r0 = r1 & 8
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.inbox.widget.multi.n r5 = new com.ss.android.ugc.aweme.inbox.widget.multi.n
            com.ss.android.ugc.aweme.inbox.widget.multi.o r0 = com.ss.android.ugc.aweme.inbox.widget.multi.o.NONE
            r5.<init>(r0)
        L_0x002a:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0048
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0034
            r0 = -1
            r7 = -1
        L_0x0034:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            r8 = 0
        L_0x003a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0042
            long r9 = android.os.SystemClock.uptimeMillis()
        L_0x0042:
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0048:
            r6 = r17
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.b.<init>(com.ss.android.ugc.aweme.inbox.widget.multi.e, java.util.List, com.ss.android.ugc.aweme.inbox.widget.multi.a, java.lang.String, com.ss.android.ugc.aweme.inbox.widget.multi.n, java.lang.String, int, boolean, long, int):void");
    }
}
