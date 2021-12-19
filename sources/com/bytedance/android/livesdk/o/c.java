package com.bytedance.android.livesdk.o;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.i.b.b;
import com.bytedance.android.live.n.m;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveStreamStrategySdkEnableSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.b.d;
import h.f.b.l;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19993a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19994b;

    static {
        Covode.recordClassIndex(11811);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11812);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.o.c$c  reason: collision with other inner class name */
    public static final class C0405c implements com.ss.videoarch.strategy.a {
        static {
            Covode.recordClassIndex(11814);
        }

        C0405c() {
        }

        @Override // com.ss.videoarch.strategy.a
        public final <T> T a(String str, T t) {
            l.d(t, "");
            if (l.a((Object) str, (Object) "TTNet_NQE_INFO")) {
                T t2 = (T) com.bytedance.android.live.network.b.a.a().toString();
                return ((t2 instanceof Object) && t2 != null) ? t2 : t;
            }
            T t3 = (T) e.a(str, t);
            l.b(t3, "");
            return t3;
        }
    }

    public static final class d implements com.ss.videoarch.strategy.b.b {
        static {
            Covode.recordClassIndex(11815);
        }

        d() {
        }

        @Override // com.ss.videoarch.strategy.b.b
        public final String a(String str, byte[] bArr, String str2) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            f b2 = u.a().b();
            l.b(b2, "");
            buildUpon.appendQueryParameter("user_id", String.valueOf(b2.c()));
            com.bytedance.android.livesdkapi.model.a a2 = h.a().a(buildUpon.toString(), null, str2, bArr).a();
            l.b(a2, "");
            byte[] bArr2 = a2.f23268e;
            l.b(bArr2, "");
            return new String(bArr2, h.m.d.f158808a);
        }
    }

    @Override // com.bytedance.android.live.n.m
    public final void a() {
        String str;
        Context applicationContext;
        try {
            if (!i.a.a.a.a.a.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (LiveStreamStrategySdkEnableSetting.INSTANCE.getValue() != 0 && !f19994b) {
            if (com.bytedance.android.live.t.a.a(IHostApp.class) != null) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a2, "");
                if (!((IHostApp) a2).isInMusicallyRegion()) {
                    str = "https://hotapi-sg.tiktokv.com";
                    d.a aVar = new d.a();
                    aVar.f154430a = str;
                    aVar.f154431b = new d();
                    com.ss.videoarch.strategy.b.c.a().a(aVar.a());
                    LiveStrategyManager inst = LiveStrategyManager.inst();
                    Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
                    l.b(context, "");
                    applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    inst.init(applicationContext);
                    LiveStrategyManager.inst().setAppInfoBundle(new C0405c());
                    LiveStrategyManager.inst().start();
                    f19994b = true;
                }
            }
            str = "https://hotapi-va.tiktokv.com";
            d.a aVar2 = new d.a();
            aVar2.f154430a = str;
            aVar2.f154431b = new d();
            com.ss.videoarch.strategy.b.c.a().a(aVar2.a());
            LiveStrategyManager inst2 = LiveStrategyManager.inst();
            Context context2 = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
            l.b(context2, "");
            applicationContext = context2.getApplicationContext();
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            inst2.init(applicationContext);
            LiveStrategyManager.inst().setAppInfoBundle(new C0405c());
            try {
                LiveStrategyManager.inst().start();
            } catch (Exception unused2) {
            }
            f19994b = true;
        }
    }

    public static final class b implements b.AbstractC0153b<m> {
        static {
            Covode.recordClassIndex(11813);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<m> a(b.AbstractC0153b.a<m> aVar) {
            l.d(aVar, "");
            aVar.f9912a = (R) new c();
            aVar.f9913b = true;
            l.b(aVar, "");
            return aVar;
        }
    }
}
