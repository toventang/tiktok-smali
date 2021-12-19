package com.bytedance.bdturing.verify.a;

import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j extends a {

    /* renamed from: f  reason: collision with root package name */
    public final String f26587f;

    /* renamed from: g  reason: collision with root package name */
    private a f26588g;

    /* renamed from: h  reason: collision with root package name */
    private int f26589h;

    static {
        Covode.recordClassIndex(15623);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return this.f26589h;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final boolean a() {
        a aVar = this.f26588g;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        a aVar = this.f26588g;
        if (aVar != null) {
            return aVar.b();
        }
        return 0;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        String c2;
        a aVar = this.f26588g;
        if (aVar == null || (c2 = aVar.c()) == null) {
            return "";
        }
        return c2;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(boolean z) {
        a aVar = this.f26588g;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        a aVar = this.f26588g;
        if (aVar != null) {
            aVar.a(sb);
        }
        b.a(sb, "verify_data", this.f26587f);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (r4.equals("whirl") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r4.equals("slide") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r4.equals("text") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        if (r4.equals("3d") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        r10.f26588g = new com.bytedance.bdturing.verify.a.f();
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0131 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private j(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.verify.a.j.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(String str, byte b2) {
        this(str);
        l.c(str, "");
    }
}
