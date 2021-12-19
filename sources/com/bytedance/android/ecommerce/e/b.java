package com.bytedance.android.ecommerce.e;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.a;
import com.bytedance.android.ecommerce.a.a.c;
import com.bytedance.android.ecommerce.a.a.d;
import com.bytedance.android.ecommerce.a.f;
import com.bytedance.android.ecommerce.a.h;
import com.bytedance.android.ecommerce.j.e;
import com.bytedance.android.ecommerce.k.i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f7055a = "ECommerceServiceImpl";

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f7056b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(3377);
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final boolean a() {
        return c.f7063a.a();
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void d(String str) {
        c.f7063a.d().r = str;
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final String b(String str) {
        if (this.f7056b.get()) {
            return i.a(c.f7063a.d().f7038j, str);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final boolean e(String str) {
        return TextUtils.equals(c.f7063a.i().a(str), "success");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final h a(String str) {
        f b2;
        if (this.f7056b.get()) {
            e b3 = c.f7063a.b();
            a a2 = b3.a(str);
            if (a2 == null || (b2 = b3.b(a2.f6876g)) == null) {
                return null;
            }
            return new h(a2, b2);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void c(String str) {
        if (this.f7056b.get()) {
            c.f7063a.d().q = str;
            c.f7063a.k().a(str);
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void a(a aVar) {
        if (aVar != null) {
            this.f7056b.getAndSet(true);
            long currentTimeMillis = System.currentTimeMillis();
            c.f7063a.a(aVar);
            c.f7063a.f().a(System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        throw new IllegalArgumentException("configuration should not be null!");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void a(final c cVar, final com.bytedance.android.ecommerce.c.e eVar) {
        if (this.f7056b.get()) {
            final long currentTimeMillis = System.currentTimeMillis();
            c.f7063a.c().a(cVar, new com.bytedance.android.ecommerce.c.e() {
                /* class com.bytedance.android.ecommerce.e.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3378);
                }

                @Override // com.bytedance.android.ecommerce.c.e
                public final void a(com.bytedance.android.ecommerce.a.b.c cVar) {
                    String str;
                    long currentTimeMillis = System.currentTimeMillis();
                    com.bytedance.android.ecommerce.j.f f2 = c.f7063a.f();
                    c cVar2 = cVar;
                    if (cVar2.f6888i == null) {
                        str = "";
                    } else {
                        str = cVar2.f6888i.f6982a;
                    }
                    f2.a(str, cVar.f6889j, cVar.f6913c, cVar.f6914d, cVar.f6915e, currentTimeMillis - currentTimeMillis, cVar.toString());
                    eVar.a(cVar);
                }
            });
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void a(d dVar, com.bytedance.android.ecommerce.c.f fVar) {
        if (this.f7056b.get()) {
            g gVar = new g(dVar, fVar);
            gVar.f7082e = System.currentTimeMillis();
            gVar.f7078a.sendEmptyMessage(1);
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final void a(String str, final com.bytedance.android.ecommerce.c.c cVar) {
        if (this.f7056b.get()) {
            a d2 = c.f7063a.d();
            c.f7063a.k().a(str, d2.r, d2.q, new com.bytedance.android.ecommerce.c.d() {
                /* class com.bytedance.android.ecommerce.e.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3379);
                }

                @Override // com.bytedance.android.ecommerce.c.d
                public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
                    cVar.a(i2, i3, str, bVar);
                }
            });
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final com.bytedance.android.ecommerce.a.d a(String str, String str2, String str3) {
        if (this.f7056b.get()) {
            e b2 = c.f7063a.b();
            f b3 = b2.b(str);
            if (b3 == null) {
                return com.bytedance.android.ecommerce.a.d.a("methodWithCardBrand is null");
            }
            com.bytedance.android.ecommerce.a.c a2 = b3.a(str2);
            if (a2 == null) {
                return com.bytedance.android.ecommerce.a.d.a("element is null");
            }
            if (TextUtils.equals("eg_ccdc_global_cvv", str2)) {
                a2.n = b2.d(str);
            }
            a2.f6943i = str3;
            return c.f7063a.e().a(a2);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.e.d
    public final com.bytedance.android.ecommerce.a.d b(String str, String str2, String str3) {
        if (this.f7056b.get()) {
            f b2 = c.f7063a.b().b(str);
            if (b2 == null) {
                return com.bytedance.android.ecommerce.a.d.a("methodWithCardBrand is null");
            }
            com.bytedance.android.ecommerce.a.c a2 = b2.a("eg_ccdc_global_expiration_year");
            if (a2 == null) {
                return com.bytedance.android.ecommerce.a.d.a("yearElement is null");
            }
            a2.f6943i = str2;
            com.bytedance.android.ecommerce.a.c a3 = b2.a("eg_ccdc_global_expiration_month");
            if (a3 == null) {
                return com.bytedance.android.ecommerce.a.d.a("monthElement is null");
            }
            a3.f6943i = str3;
            return c.f7063a.e().a(a2, a3);
        }
        throw new IllegalArgumentException("please init first");
    }
}
