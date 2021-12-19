package com.bytedance.android.a.b.d;

import com.bytedance.android.a.a.d.b;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.a.b.a f6726a;

    /* renamed from: b  reason: collision with root package name */
    private int f6727b;

    /* renamed from: c  reason: collision with root package name */
    private b f6728c;

    static {
        Covode.recordClassIndex(3236);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<b> b() {
        return this.f6728c.b();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<b> c() {
        return this.f6728c.c();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void d() {
        this.f6728c.d();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void a() {
        this.f6728c.a();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<b> a(List<b> list) {
        return this.f6728c.a(list);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void b(b bVar) {
        this.f6728c.b(bVar);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void c(b bVar) {
        this.f6728c.c(bVar);
    }

    public a(com.bytedance.android.a.b.a aVar) {
        this.f6726a = aVar;
        int i2 = aVar.f6680a.f6713d;
        this.f6727b = i2;
        this.f6728c = b(i2);
    }

    private static b b(int i2) {
        if (i2 == 0) {
            return new com.bytedance.android.a.b.d.c.a();
        }
        if (i2 == 1) {
            return new com.bytedance.android.a.b.d.a.a();
        }
        if (i2 != 2) {
            return null;
        }
        return new com.bytedance.android.a.b.d.b.a();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final boolean a(b bVar) {
        return this.f6728c.a(bVar);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void a(int i2) {
        b b2;
        if ((i2 != this.f6727b || this.f6728c == null) && (b2 = b(i2)) != null) {
            b bVar = this.f6728c;
            List<b> list = null;
            if (bVar != null) {
                list = bVar.b();
                bVar.a();
                bVar.d();
            }
            this.f6728c = b2;
            if (list != null) {
                b2.a(list);
            }
        }
    }
}
