package com.bytedance.ies.im.core.service;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.c.a;
import com.bytedance.ies.im.core.b.c;
import com.bytedance.ies.im.core.b.e;
import com.bytedance.ies.im.core.e.e;
import com.bytedance.ies.im.core.e.t;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.s;
import com.bytedance.im.core.internal.utils.q;
import h.f.b.l;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b implements com.bytedance.ies.im.core.api.h.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34194a = new a((byte) 0);

    static {
        Covode.recordClassIndex(20366);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final Context d() {
        d a2 = d.a();
        l.b(a2, "");
        return a2.f37561a;
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void b() {
        com.bytedance.ies.im.core.api.a.b().b("PlatformService", "onTokenSDKReady");
        e.f34007c.a();
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void c() {
        e.a aVar = e.a.IM_BIZ;
        l.d(aVar, "");
        com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "manualPullMessage: ".concat(String.valueOf(aVar)));
        bz unused = i.a(com.bytedance.ies.im.core.e.e.f34059a, null, null, new e.c(null), 3);
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a() {
        c cVar = c.f34003b;
        com.bytedance.ies.im.core.api.a.b().b("PlatformManager", "initPlatform: " + c.f34002a + ", 0, " + (SystemClock.elapsedRealtime() - IMCoreProxyService.f34192a));
        if (!c.f34002a) {
            com.bytedance.ies.im.core.api.a.e().a(cVar);
            com.bytedance.ies.im.core.api.a.c().a(cVar);
            com.bytedance.ies.im.core.i.a.f34189a.a(cVar);
            c.f34002a = true;
            t tVar = t.f34128a;
            com.bytedance.ies.im.core.i.a.f34189a.a(tVar);
            com.bytedance.ies.im.core.b.e.a(tVar);
            com.bytedance.ies.im.core.api.a.e().a(tVar);
            com.bytedance.ies.im.core.f.d.f34136b.a();
        }
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a(com.bytedance.ies.im.core.api.b.a.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
        com.bytedance.ies.im.core.b.a.a().add(dVar);
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void b(s sVar) {
        l.d(sVar, "");
        q.a().f38789c = null;
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a(s sVar) {
        l.d(sVar, "");
        q.a().f38789c = sVar;
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void b(int[] iArr) {
        l.d(iArr, "");
        d a2 = d.a();
        l.b(a2, "");
        a2.b().s = iArr;
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a(a.EnumC0747a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        com.bytedance.ies.im.core.api.a.b().b("PlatformManager", "onBizSceneChanged: ".concat(String.valueOf(aVar)));
        int i2 = com.bytedance.ies.im.core.b.d.f34004a[aVar.ordinal()];
        if (i2 == 1) {
            com.bytedance.ies.im.core.f.d.f34136b.b();
            com.bytedance.ies.im.core.b.e.f34007c.b();
        } else if (i2 == 2) {
            com.bytedance.ies.im.core.f.d.f34136b.b();
            com.bytedance.ies.im.core.b.e.f34007c.b();
        } else if (i2 == 3) {
            com.bytedance.ies.im.core.f.d.f34136b.b();
            com.bytedance.ies.im.core.b.e.f34007c.b();
        }
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a(int[] iArr) {
        l.d(iArr, "");
        d a2 = d.a();
        l.b(a2, "");
        a2.b().t = iArr;
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void a(String str, com.bytedance.ies.im.core.api.b.a.d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        q.a().a(str, dVar);
    }

    @Override // com.bytedance.ies.im.core.api.h.b
    public final void b(String str, com.bytedance.ies.im.core.api.b.a.d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        q.a().b(str, dVar);
    }
}
