package com.ss.android.ugc.aweme.be;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dc.e;
import h.f.b.l;

public abstract class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public e f68538a;

    /* renamed from: b  reason: collision with root package name */
    public String f68539b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f68540c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f68541d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f68542e;

    static {
        Covode.recordClassIndex(42209);
    }

    public a() {
        this(false, false, null, null, 15);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public boolean a() {
        return this.f68540c;
    }

    public boolean b() {
        return this.f68541d;
    }

    public Object c() {
        return this.f68542e;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f68539b = str;
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    private a(boolean z, boolean z2, Object obj, String str) {
        l.d(str, "");
        this.f68540c = z;
        this.f68541d = z2;
        this.f68542e = obj;
        this.f68539b = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(boolean r2, boolean r3, java.lang.Object r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000a
            r3 = 1
        L_0x000a:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x000f
            r4 = 0
        L_0x000f:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x0020
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = ""
            h.f.b.l.b(r5, r0)
        L_0x0020:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.be.a.<init>(boolean, boolean, java.lang.Object, java.lang.String, int):void");
    }
}
