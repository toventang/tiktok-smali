package com.bytedance.b.c.c.a;

import com.bytedance.b.c.c.d;
import com.bytedance.covode.number.Covode;

final class g extends a {

    /* renamed from: c  reason: collision with root package name */
    private int f26072c;

    static {
        Covode.recordClassIndex(15176);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.b.c.c.a.a
    public final long c() {
        if (this.f26052b) {
            return 300000;
        }
        return 5000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.b.c.c.a.a
    public final boolean d() {
        this.f26072c = 0;
        this.f26051a.c();
        return true;
    }

    public g(d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a.a, com.bytedance.b.c.c.a
    public final void a(boolean z) {
        if (z) {
            this.f26072c = 0;
        }
        super.a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.b.c.c.a.a
    public final boolean b(boolean z) {
        if (z) {
            int i2 = this.f26072c + 1;
            this.f26072c = i2;
            if (i2 < 2) {
                return false;
            }
            this.f26072c = 0;
            this.f26051a.e();
            return true;
        }
        this.f26072c = 0;
        this.f26051a.c();
        return true;
    }
}
