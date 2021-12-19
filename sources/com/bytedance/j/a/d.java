package com.bytedance.j.a;

import android.app.Application;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.b.a;
import com.bytedance.ies.bullet.service.base.c.b;
import com.bytedance.ies.bullet.service.base.c.c;
import com.bytedance.j.a.c.d;
import com.bytedance.j.a.c.e;
import com.bytedance.j.a.c.f;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.f;
import h.f.b.l;
import h.f.b.z;
import h.w;
import java.util.List;

public final class d extends a implements b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.ies.bullet.service.base.c.a f39004a;

    static {
        Covode.recordClassIndex(23876);
    }

    @Override // com.bytedance.ies.bullet.service.base.c.b
    public final boolean b() {
        return com.bytedance.j.a.c.d.f38988b;
    }

    public d() {
        this(new com.bytedance.ies.bullet.service.base.c.a() {
            /* class com.bytedance.j.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23877);
            }
        });
    }

    @Override // com.bytedance.ies.bullet.service.base.c.b
    public final c b(o oVar) {
        l.c(oVar, "");
        return new e(oVar, this);
    }

    public d(com.bytedance.ies.bullet.service.base.c.a aVar) {
        l.c(aVar, "");
        this.f39004a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.c.b
    public final void a(o oVar) {
        f fVar;
        l.c(oVar, "");
        com.bytedance.ies.bullet.service.base.c.a aVar = this.f39004a;
        if (!(aVar instanceof com.bytedance.j.a.c.b) || aVar == null) {
            throw new w("null cannot be cast to non-null type");
        }
        com.bytedance.j.a.c.b bVar = (com.bytedance.j.a.c.b) aVar;
        l.c(bVar, "");
        l.c(oVar, "");
        if (com.bytedance.j.a.c.d.f38988b || com.bytedance.j.a.c.d.f38987a.compareAndSet(false, true)) {
            com.bytedance.j.a.c.d.f38991e = oVar;
            try {
                d.a aVar2 = new d.a();
                com.bytedance.j.a.c.d.f38989c = aVar2;
                com.lynx.tasm.e.c.a(aVar2);
                r.a(d.b.f38994a);
                l.c(bVar, "");
                l.c(oVar, "");
                LynxEnv.b();
                if (bVar.f38973a.f38976c == null) {
                    fVar = f.a.f39001a;
                } else {
                    fVar = bVar.f38973a.f38976c;
                }
                z.a aVar3 = new z.a();
                aVar3.element = false;
                LynxEnv b2 = LynxEnv.b();
                try {
                    aVar3.element = true;
                } catch (Throwable unused) {
                    new AndroidRuntimeException("Fresco Not Found, Image will not work normally").printStackTrace();
                }
                if (aVar3.element) {
                    if (!com.facebook.drawee.a.a.c.d()) {
                        com.facebook.drawee.a.a.c.a(e.a());
                    }
                    b2.p = new com.lynx.tasm.ui.image.b();
                }
                f.b bVar2 = new f.b(bVar, aVar3);
                LynxEnv b3 = LynxEnv.b();
                l.a((Object) b3, "");
                b3.f55533c = new com.bytedance.j.a.f.b(oVar);
                LynxEnv b4 = LynxEnv.b();
                l.a((Object) b4, "");
                b4.s = bVar.f38973a.f38974a;
                LynxEnv b5 = LynxEnv.b();
                Application a2 = e.a();
                com.lynx.tasm.provider.b bVar3 = bVar.f38973a.f38977d;
                if (bVar3 == null) {
                    bVar3 = new com.bytedance.j.a.f.c(oVar);
                }
                b5.a(a2, fVar, bVar3, bVar2);
                LynxEnv b6 = LynxEnv.b();
                l.a((Object) b6, "");
                if (b6.f()) {
                    LLog.a(com.bytedance.j.a.d.a.f39006e);
                    LLog.a(new com.bytedance.j.a.d.a(oVar));
                    com.bytedance.j.a.c.a aVar4 = bVar.f38973a.f38980g;
                    if (aVar4 != null) {
                        aVar4.a(e.a(), fVar);
                    }
                }
                for (T t : bVar.f38973a.f38979f.entrySet()) {
                    LynxEnv.b().a((String) t.getKey(), ((com.bytedance.j.a.e.b) t.getValue()).f39026a, ((com.bytedance.j.a.e.b) t.getValue()).f39027b);
                }
                h.f.a.b<? super LynxEnv, h.z> bVar4 = bVar.f38973a.f38981h;
                LynxEnv b7 = LynxEnv.b();
                l.a((Object) b7, "");
                bVar4.invoke(b7);
                if (!e.f38996b) {
                    LynxEnv.b().c(false);
                    LynxEnv.b().a(false);
                } else {
                    List<com.bytedance.j.a.b.a> list = bVar.f38973a.f38975b;
                    if (list.size() > 0) {
                        if (com.bytedance.j.a.b.b.f38956a) {
                            LynxEnv.b().a(true);
                            if (!e.f38997c) {
                                LynxEnv.b().b(true);
                            }
                            LynxDevtoolGlobalHelper.getInstance().registerCardListener(com.bytedance.j.a.b.b.f38958c);
                        }
                        for (T t2 : list) {
                            l.c(t2, "");
                            com.bytedance.j.a.b.b.f38957b.add(t2);
                        }
                    }
                }
                LynxEnv b8 = LynxEnv.b();
                l.a((Object) b8, "");
                if (b8.f()) {
                    com.bytedance.j.a.c.d.f38988b = true;
                } else {
                    com.bytedance.j.a.c.d.f38987a.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                com.bytedance.j.a.c.d.f38987a.set(false);
                oVar.printReject(th, "LynxKit Init Failed");
            }
        }
    }
}
