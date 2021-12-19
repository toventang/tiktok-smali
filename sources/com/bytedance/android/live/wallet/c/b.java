package com.bytedance.android.live.wallet.c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.base.PayOrderResultStruct;
import com.bytedance.android.live.wallet.base.SubOrderResultStruct;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.livesdk.livesetting.other.LivePipoHostSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePipoMonitorHostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.b.a;
import com.bytedance.globalpayment.payment.common.lib.b.c;
import com.ss.android.deviceregister.DeviceRegisterManager;
import f.a.t;
import f.a.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONObject;

public final class b implements com.bytedance.android.live.wallet.c {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.wallet.g f13087a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f13088b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    private final int f13089c;

    static {
        Covode.recordClassIndex(7265);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.bytedance.globalpayment.payment.common.lib.e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13096a = new d();

        static {
            Covode.recordClassIndex(7269);
        }

        d() {
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.e.a
        public final String a() {
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            return String.valueOf(b2.c());
        }
    }

    public static String a() {
        if (p.a((CharSequence) LivePipoHostSetting.INSTANCE.getValue())) {
            return LivePipoHostSetting.INSTANCE.getValue();
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
        h.f.b.l.b(a2, "");
        if (((IHostApp) a2).isInMusicallyRegion()) {
            return "https://gp-va.tiktokv.com";
        }
        return "https://gp-sg.tiktokv.com";
    }

    public b(int i2) {
        this.f13089c = i2;
    }

    @Override // com.bytedance.android.live.wallet.c
    public final void b(com.bytedance.android.live.wallet.g gVar) {
        this.f13087a = null;
        com.bytedance.android.live.wallet.api.b.a().b(gVar);
        this.f13088b.a();
    }

    static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13097a = new e();

        static {
            Covode.recordClassIndex(7270);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            h.f.b.l.d(dVar, "");
            if (((SubOrderResultStruct) dVar.data).status != 1) {
                return t.a(new Exception("retry"));
            }
            return t.b(dVar.data);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f13099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f13100c;

        static {
            Covode.recordClassIndex(7271);
        }

        f(b bVar, HashMap hashMap, long j2) {
            this.f13098a = bVar;
            this.f13099b = hashMap;
            this.f13100c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            SubOrderResultStruct subOrderResultStruct = (SubOrderResultStruct) obj;
            this.f13099b.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f13100c));
            c.a("ttlive_check_subscription", this.f13099b);
            com.bytedance.android.live.wallet.g gVar = this.f13098a.f13087a;
            if (gVar != null) {
                gVar.a(3, subOrderResultStruct.subChargeInfo.f13063a.f13064a);
            }
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f13102b;

        static {
            Covode.recordClassIndex(7272);
        }

        g(b bVar, HashMap hashMap) {
            this.f13101a = bVar;
            this.f13102b = hashMap;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            c.a("ttlive_check_subscription", 41, -1, "check order fail", this.f13102b);
            com.bytedance.android.live.wallet.g gVar = this.f13101a.f13087a;
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                gVar.a(3, 41, -1, exc, null);
            }
        }
    }

    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final h f13103a = new h();

        static {
            Covode.recordClassIndex(7273);
        }

        h() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            h.f.b.l.d(dVar, "");
            if (((PayOrderResultStruct) dVar.data).status != 1) {
                t a2 = t.a(new Exception("retry"));
                h.f.b.l.b(a2, "");
                return a2;
            }
            t b2 = t.b(dVar);
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f13105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f13106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f13107d;

        static {
            Covode.recordClassIndex(7274);
        }

        public i(b bVar, String str, long j2, String str2) {
            this.f13104a = bVar;
            this.f13105b = str;
            this.f13106c = j2;
            this.f13107d = str2;
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
            HashMap hashMap = new HashMap();
            hashMap.put("orderId", this.f13105b);
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f13106c));
            c.a("ttlive_wallet_check_order", hashMap);
            com.bytedance.android.live.wallet.g gVar = this.f13104a.f13087a;
            if (gVar != null) {
                gVar.a(3, new com.bytedance.android.livesdk.wallet.b(this.f13107d, this.f13105b));
            }
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f13109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f13110c;

        static {
            Covode.recordClassIndex(7275);
        }

        public j(b bVar, String str, String str2) {
            this.f13108a = bVar;
            this.f13109b = str;
            this.f13110c = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            c.a("ttlive_wallet_check_order", 41, -1, "check order fail");
            com.bytedance.android.live.wallet.g gVar = this.f13108a.f13087a;
            if (gVar != null) {
                if (!(th2 instanceof Exception)) {
                    th = null;
                } else {
                    th = th2;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                gVar.a(3, 41, -1, exc, new com.bytedance.android.livesdk.wallet.g(this.f13109b, this.f13110c));
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.c
    public final void b(List<String> list) {
        h.f.b.l.d(list, "");
        IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
        if (e.a.a()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            com.bytedance.globalpayment.c cVar = com.bytedance.globalpayment.a.f30140a;
            h.f.b.l.b(cVar, "");
            cVar.a().querySubscriptionDetails(iapPaymentMethod, list);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13115a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f13116b;

        static {
            Covode.recordClassIndex(7277);
        }

        l(b bVar, HashMap hashMap) {
            this.f13115a = bVar;
            this.f13116b = hashMap;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.wallet.g gVar;
            Throwable th = (Throwable) obj;
            int i2 = -1;
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                i2 = aVar.getErrorCode();
                com.bytedance.android.live.wallet.g gVar2 = this.f13115a.f13087a;
                if (gVar2 != null) {
                    gVar2.a(2, 71, aVar.getErrorCode(), (Exception) th, new com.bytedance.android.livesdk.wallet.g("", ""));
                }
                a.a(71, aVar.getErrorCode(), aVar.getPrompt());
            } else if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                com.bytedance.android.live.wallet.g gVar3 = this.f13115a.f13087a;
                if (gVar3 != null) {
                    gVar3.a(2, 71, -1, (Exception) th, new com.bytedance.android.livesdk.wallet.g("", ""));
                }
                a.a(71, -1, th.getMessage());
            } else if ((th instanceof Exception) && (gVar = this.f13115a.f13087a) != null) {
                gVar.a(2, 71, -1, (Exception) th, new com.bytedance.android.livesdk.wallet.g("", ""));
            }
            c.a("ttlive_create_subscription", 31, i2, th.getMessage(), this.f13116b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f13091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f13092c;

        static {
            Covode.recordClassIndex(7266);
        }

        a(b bVar, long j2, Activity activity) {
            this.f13090a = bVar;
            this.f13091b = j2;
            this.f13092c = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = ((com.bytedance.android.live.network.response.d) obj).data;
            h.f.b.l.b(obj2, "");
            com.bytedance.android.live.wallet.base.c cVar = ((com.bytedance.android.live.wallet.base.b) obj2).f13073a;
            com.bytedance.globalpayment.iap.common.ability.c cVar2 = new com.bytedance.globalpayment.iap.common.ability.c(this.f13091b);
            h.f.b.l.b(cVar, "");
            cVar2.f30261a = cVar.f13076a;
            cVar2.f30269i = "0";
            cVar2.f30262b = cVar.f13078c;
            Long l2 = cVar.f13079d;
            h.f.b.l.b(l2, "");
            cVar2.f30263c = l2.longValue();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            cVar2.f30265e = String.valueOf(b2.c());
            cVar2.f30264d = DeviceRegisterManager.getDeviceId();
            cVar2.f30266f = cVar.f13077b;
            if (!cVar.f13081f || !p.a((CharSequence) cVar.f13082g)) {
                h.f.b.l.b(cVar2, "");
                cVar2.f30270j = false;
                com.bytedance.globalpayment.c cVar3 = com.bytedance.globalpayment.a.f30140a;
                h.f.b.l.b(cVar3, "");
                cVar3.a().updateHost(b.a());
            } else {
                h.f.b.l.b(cVar2, "");
                cVar2.f30270j = true;
                com.bytedance.globalpayment.c cVar4 = com.bytedance.globalpayment.a.f30140a;
                h.f.b.l.b(cVar4, "");
                cVar4.a().updateHost(cVar.f13082g);
            }
            HashMap hashMap = new HashMap();
            String str = cVar.f13077b;
            h.f.b.l.b(str, "");
            hashMap.put("bizContent", str);
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f13091b));
            c.a("ttlive_wallet_create_order", hashMap);
            b.a(cVar2, this.f13092c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.c.b$b  reason: collision with other inner class name */
    public static final class C0276b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.wallet.c f13094b;

        static {
            Covode.recordClassIndex(7267);
        }

        C0276b(b bVar, com.bytedance.android.livesdk.wallet.c cVar) {
            this.f13093a = bVar;
            this.f13094b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.wallet.g gVar;
            Throwable th = (Throwable) obj;
            int i2 = -1;
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                i2 = aVar.getErrorCode();
                com.bytedance.android.live.wallet.g gVar2 = this.f13093a.f13087a;
                if (gVar2 != null) {
                    String str = this.f13094b.f22406b;
                    h.f.b.l.b(str, "");
                    gVar2.a(2, 31, aVar.getErrorCode(), (Exception) th, new com.bytedance.android.livesdk.wallet.g(str, ""));
                }
                a.a(31, aVar.getErrorCode(), aVar.getPrompt());
            } else if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                com.bytedance.android.live.wallet.g gVar3 = this.f13093a.f13087a;
                if (gVar3 != null) {
                    String str2 = this.f13094b.f22406b;
                    h.f.b.l.b(str2, "");
                    gVar3.a(2, 31, -1, (Exception) th, new com.bytedance.android.livesdk.wallet.g(str2, ""));
                }
                a.a(31, -1, th.getMessage());
            } else if ((th instanceof Exception) && (gVar = this.f13093a.f13087a) != null) {
                String str3 = this.f13094b.f22406b;
                h.f.b.l.b(str3, "");
                gVar.a(2, 31, -1, (Exception) th, new com.bytedance.android.livesdk.wallet.g(str3, ""));
            }
            c.a("ttlive_wallet_create_order", 31, i2, th.getMessage());
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f13112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f13113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f13114d;

        static {
            Covode.recordClassIndex(7276);
        }

        k(b bVar, long j2, HashMap hashMap, Activity activity) {
            this.f13111a = bVar;
            this.f13112b = j2;
            this.f13113c = hashMap;
            this.f13114d = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.bytedance.android.live.wallet.base.a.a aVar = (com.bytedance.android.live.wallet.base.a.a) ((com.bytedance.android.live.network.response.d) obj).data;
            if (aVar.f13071g == 2) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.globalpayment.iap.common.ability.c cVar = new com.bytedance.globalpayment.iap.common.ability.c(this.f13112b);
            cVar.f30261a = aVar.f13068d;
            cVar.f30269i = "0";
            cVar.f30262b = aVar.f13067c;
            String str = aVar.f13066b;
            h.f.b.l.b(str, "");
            cVar.f30263c = Long.parseLong(str);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            cVar.f30265e = String.valueOf(b2.c());
            cVar.f30264d = DeviceRegisterManager.getDeviceId();
            cVar.f30266f = aVar.f13065a;
            cVar.f30267g = z;
            cVar.f30270j = true;
            if (!m.a(aVar.f13070f)) {
                com.bytedance.globalpayment.c cVar2 = com.bytedance.globalpayment.a.f30140a;
                h.f.b.l.b(cVar2, "");
                cVar2.a().updateHost(aVar.f13070f);
            }
            HashMap hashMap = this.f13113c;
            String str2 = aVar.f13065a;
            h.f.b.l.b(str2, "");
            hashMap.put("bizContent", str2);
            this.f13113c.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.f13112b));
            c.a("ttlive_create_subscription", this.f13113c);
            h.f.b.l.b(cVar, "");
            b.a(cVar, this.f13114d);
            com.bytedance.android.live.wallet.g gVar = this.f13111a.f13087a;
            if (gVar != null) {
                gVar.a(5, aVar.f13072h);
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.c
    public final synchronized void a(com.bytedance.android.live.wallet.g gVar) {
        String str;
        MethodCollector.i(7291);
        if (gVar != null) {
            this.f13087a = gVar;
        }
        if (com.bytedance.android.live.wallet.api.b.a().f13044b) {
            com.bytedance.android.live.wallet.api.b.a().a(gVar);
            com.bytedance.android.live.wallet.api.b a2 = com.bytedance.android.live.wallet.api.b.a();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            h.f.b.l.b(b2, "");
            a2.f13043a = String.valueOf(b2.c());
            MethodCollector.o(7291);
            return;
        }
        com.bytedance.globalpayment.c cVar = com.bytedance.globalpayment.a.f30140a;
        h.f.b.l.b(cVar, "");
        cVar.a().addIapObserver(com.bytedance.android.live.wallet.api.b.a());
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostContext.class);
        h.f.b.l.b(a3, "");
        String iapKey = ((IHostContext) a3).getIapKey();
        String a4 = a();
        HashMap hashMap = new HashMap();
        hashMap.put("iapKey", iapKey);
        hashMap.put("pipoHost", a4);
        com.bytedance.globalpayment.payment.common.lib.f.a aVar = new com.bytedance.globalpayment.payment.common.lib.f.a();
        aVar.f30557a = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appId();
        aVar.f30562f = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appName();
        com.bytedance.android.live.base.a a5 = com.bytedance.android.live.t.a.a(IHostContext.class);
        h.f.b.l.b(a5, "");
        aVar.f30559c = ((IHostContext) a5).getLastVersionCode();
        com.bytedance.android.live.base.a a6 = com.bytedance.android.live.t.a.a(IHostContext.class);
        h.f.b.l.b(a6, "");
        aVar.f30560d = ((IHostContext) a6).getUpdateVersionCode();
        com.bytedance.android.live.base.a a7 = com.bytedance.android.live.t.a.a(IHostContext.class);
        h.f.b.l.b(a7, "");
        aVar.f30561e = ((IHostContext) a7).getChannel();
        aVar.f30563g = true;
        c.a aVar2 = new c.a();
        aVar2.f30550d = a();
        aVar2.f30547a = iapKey;
        aVar2.f30551e = d.f13096a;
        com.bytedance.android.live.base.a a8 = com.bytedance.android.live.t.a.a(IHostContext.class);
        h.f.b.l.b(a8, "");
        if (((IHostContext) a8).isBoe()) {
            str = "10202010Wm7uNj";
        } else {
            str = "05816USpPkJiyBnttk";
        }
        aVar2.f30549c = str;
        if (e.a.a()) {
            aVar2.f30554h = true;
            aVar2.f30553g = false;
            hashMap.put("pay_method", "amazon");
        } else {
            aVar2.f30554h = false;
            aVar2.f30553g = true;
            hashMap.put("pay_method", "GP");
        }
        com.bytedance.android.live.core.d.c.a("ttlive_pipo_init", 0, hashMap);
        com.bytedance.globalpayment.payment.common.lib.b.c cVar2 = new com.bytedance.globalpayment.payment.common.lib.b.c(aVar2);
        com.bytedance.android.live.wallet.api.b.a().a(gVar);
        com.bytedance.android.live.wallet.api.b a9 = com.bytedance.android.live.wallet.api.b.a();
        com.bytedance.android.livesdk.at.f b3 = u.a().b();
        h.f.b.l.b(b3, "");
        a9.f13043a = String.valueOf(b3.c());
        Context e2 = y.e();
        h.f.b.l.b(e2, "");
        Context applicationContext = e2.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        h.f.b.l.b(applicationContext, "");
        if (applicationContext instanceof Application) {
            a.C0640a aVar3 = new a.C0640a((Application) applicationContext, aVar);
            aVar3.f30522d = DeviceRegisterManager.getDeviceId();
            aVar3.s = new c(this);
            aVar3.f30525g = LivePipoMonitorHostSetting.INSTANCE.getValue();
            aVar3.r = cVar2;
            aVar3.f30524f = a();
            if (!aVar3.p) {
                if (aVar3.f30526h == null && TextUtils.isEmpty(aVar3.f30524f) && TextUtils.isEmpty(aVar3.f30522d)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("region and  host is null,please set region or host!");
                    MethodCollector.o(7291);
                    throw illegalArgumentException;
                } else if (TextUtils.isEmpty(aVar3.f30522d)) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("did is null,please set did by com.bytedance.globalpayment.payment.common.lib.configuration.Configuration.Builder.withDid!");
                    MethodCollector.o(7291);
                    throw illegalArgumentException2;
                } else if (TextUtils.isEmpty(aVar3.f30531m)) {
                    aVar3.f30531m = "en";
                }
            }
            com.bytedance.globalpayment.a.f30140a.a(new com.bytedance.globalpayment.payment.common.lib.b.a(aVar3));
            com.bytedance.globalpayment.c cVar3 = com.bytedance.globalpayment.a.f30140a;
            com.bytedance.android.live.base.a a10 = com.bytedance.android.live.t.a.a(IHostAction.class);
            h.f.b.l.b(a10, "");
            cVar3.a(((IHostAction) a10).getTTSetting());
            com.bytedance.android.live.wallet.api.b.a().f13044b = true;
        }
        MethodCollector.o(7291);
    }

    @Override // com.bytedance.android.live.wallet.c
    public final void a(List<String> list) {
        h.f.b.l.d(list, "");
        IapPaymentMethod iapPaymentMethod = IapPaymentMethod.GOOGLE;
        if (e.a.a()) {
            iapPaymentMethod = IapPaymentMethod.AMAZON;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            com.bytedance.globalpayment.c cVar = com.bytedance.globalpayment.a.f30140a;
            h.f.b.l.b(cVar, "");
            cVar.a().queryProductDetails(iapPaymentMethod, list, "0");
        }
    }

    public static void a(com.bytedance.globalpayment.iap.common.ability.c cVar, Activity activity) {
        com.bytedance.globalpayment.c cVar2 = com.bytedance.globalpayment.a.f30140a;
        h.f.b.l.b(cVar2, "");
        cVar2.a().newPay(activity, cVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements com.bytedance.globalpayment.payment.common.lib.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13095a;

        static {
            Covode.recordClassIndex(7268);
        }

        c(b bVar) {
            this.f13095a = bVar;
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.e.b
        public final void a(String str, JSONObject jSONObject) {
            h.f.b.l.b(str, "");
            h.f.b.l.b(jSONObject, "");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            h.f.b.l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                h.f.b.l.b(string, "");
                hashMap.put(next, string);
            }
            ((com.bytedance.android.livesdkapi.host.g) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.g.class)).a(str, hashMap);
        }
    }

    public final void a(com.bytedance.android.livesdk.wallet.c cVar, Activity activity) {
        t<com.bytedance.android.live.network.response.d<com.bytedance.android.live.wallet.base.b>> createOrder;
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(activity, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (cVar.f22414j == null || !e.a.a()) {
            int i2 = cVar.f22405a;
            String str = cVar.f22411g;
            int i3 = this.f13089c;
            long j2 = cVar.f22412h;
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a2, "");
            createOrder = ((IapApi) com.bytedance.android.live.network.e.a().a(IapApi.class)).createOrder(3, i2, str, i3, j2, ((IGiftService) a2).isFirstRecharge());
        } else {
            createOrder = ((IapApi) com.bytedance.android.live.network.e.a().a(IapApi.class)).createAmazonOrder(6, cVar.f22405a, cVar.f22411g, this.f13089c, cVar.f22412h, cVar.f22414j.f22393b, cVar.f22414j.f22392a);
        }
        this.f13088b.a(createOrder.a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a(this, uptimeMillis, activity), new C0276b(this, cVar)));
    }

    @Override // com.bytedance.android.live.wallet.c
    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("orderId", str2);
        hashMap.put("to_uid", str);
        this.f13088b.a(((IapApi) com.bytedance.android.live.network.e.a().a(IapApi.class)).checkSubOrder(str, str2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a((f.a.d.g<? super R, ? extends x<? extends R>>) e.f13097a, false).g(com.bytedance.android.livesdk.util.rxutils.i.a(InteractFirstFrameTimeOutDurationSetting.DEFAULT)).a(new f(this, hashMap, uptimeMillis), new g(this, hashMap)));
    }

    @Override // com.bytedance.android.live.wallet.c
    public final void a(String str, String str2, String str3, Activity activity) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(activity, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("tpl_id", str);
        hashMap.put("sku_name", str3);
        TimeZone timeZone = TimeZone.getDefault();
        h.f.b.l.b(timeZone, "");
        this.f13088b.a(((IapApi) com.bytedance.android.live.network.e.a().a(IapApi.class)).subscribeOrder(str, str2, str3, timeZone.getID()).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new k(this, uptimeMillis, hashMap, activity), new l(this, hashMap)));
    }
}
