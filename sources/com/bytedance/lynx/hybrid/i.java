package com.bytedance.lynx.hybrid;

import android.app.Application;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.bytedance.lynx.hybrid.e.d;
import com.facebook.drawee.a.a.c;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.f;
import com.ss.android.ugc.aweme.lancet.m;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f40984a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(25113);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.lynx.tasm.behavior.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lynx.hybrid.e.b f40993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f40994b;

        static {
            Covode.recordClassIndex(25115);
        }

        b(com.bytedance.lynx.hybrid.e.b bVar, z.a aVar) {
            this.f40993a = bVar;
            this.f40994b = aVar;
        }

        @Override // com.lynx.tasm.behavior.b
        public final /* synthetic */ List a() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f40993a.f40942e);
            if (this.f40994b.element) {
                arrayList.addAll(com.lynx.tasm.ui.image.i.a().a());
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40990a = new a();

        static {
            Covode.recordClassIndex(25114);
        }

        a() {
        }

        @Override // com.lynx.tasm.f
        public final void a(String str) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a(str);
                m.a(uptimeMillis, str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(com.bytedance.lynx.hybrid.e.b bVar) {
        l.c(bVar, "");
        com.lynx.tasm.b.a();
        f fVar = bVar.f40940c;
        if (fVar == null) {
            fVar = a.f40990a;
        }
        z.a aVar = new z.a();
        aVar.element = false;
        LynxEnv b2 = LynxEnv.b();
        try {
            aVar.element = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Fresco Not Found, Image will not work normally").printStackTrace();
        }
        if (aVar.element) {
            if (!c.d()) {
                c.a(d.a());
            }
            b2.p = new com.lynx.tasm.ui.image.b();
        }
        b bVar2 = new b(bVar, aVar);
        LynxEnv b3 = LynxEnv.b();
        l.a((Object) b3, "");
        b3.f55533c = new com.bytedance.lynx.hybrid.resource.c();
        LynxEnv b4 = LynxEnv.b();
        l.a((Object) b4, "");
        b4.s = bVar.f40938a;
        LynxEnv b5 = LynxEnv.b();
        Application a2 = d.a();
        com.lynx.tasm.provider.b bVar3 = bVar.f40941d;
        if (bVar3 == null) {
            bVar3 = new m();
        }
        b5.a(a2, fVar, bVar3, bVar2);
        LynxEnv b6 = LynxEnv.b();
        l.a((Object) b6, "");
        if (b6.f()) {
            LLog.a(com.bytedance.lynx.hybrid.f.a.f40965c);
            LLog.a(new com.bytedance.lynx.hybrid.f.a());
            com.bytedance.lynx.hybrid.e.a aVar2 = bVar.f40944g;
            if (aVar2 != null) {
                aVar2.a(d.a(), fVar);
            }
        }
        for (T t : bVar.f40943f.entrySet()) {
            LynxEnv.b().a((String) t.getKey(), ((com.bytedance.lynx.hybrid.g.b) t.getValue()).f40972a, ((com.bytedance.lynx.hybrid.g.b) t.getValue()).f40973b);
        }
        h.f.a.b<LynxEnv, h.z> bVar4 = bVar.f40945h;
        LynxEnv b7 = LynxEnv.b();
        l.a((Object) b7, "");
        bVar4.invoke(b7);
        if (!d.f40960b) {
            LynxEnv.b().c(false);
            LynxEnv.b().a(false);
            return;
        }
        List<com.bytedance.lynx.hybrid.d.a> list = bVar.f40939b;
        if (list.size() > 0) {
            com.bytedance.lynx.hybrid.d.b.a();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.lynx.hybrid.d.b.a(it.next());
            }
        }
    }
}
