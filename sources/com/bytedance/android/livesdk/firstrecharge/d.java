package com.bytedance.android.livesdk.firstrecharge;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeEnableV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftPidSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynx;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class d implements com.bytedance.android.livesdk.gift.a.b {
    public static final d u = c.f17747a;
    public static final a v = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f17733a;

    /* renamed from: b  reason: collision with root package name */
    public long f17734b;

    /* renamed from: c  reason: collision with root package name */
    public int f17735c;

    /* renamed from: d  reason: collision with root package name */
    public p f17736d;

    /* renamed from: e  reason: collision with root package name */
    public long f17737e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17738f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17739g;

    /* renamed from: h  reason: collision with root package name */
    public String f17740h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.d.h f17741i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<String> f17742j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f17743k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17744l;

    /* renamed from: m  reason: collision with root package name */
    public String f17745m;
    public WeakReference<Activity> n;
    public String o;
    public boolean p;
    public a q;
    public com.bytedance.android.livesdk.wallet.c r;
    public Application.ActivityLifecycleCallbacks s;
    public com.bytedance.android.live.wallet.g t;
    private final f.a.b.a w;

    public enum b {
        StyleUnknown,
        StyleWithoutDiamond,
        StyleShowDiamond;

        static {
            Covode.recordClassIndex(9844);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f17757a = new i();

        static {
            Covode.recordClassIndex(9852);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static u h() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9843);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final d f17747a = new d((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final c f17748b = new c();

        private c() {
        }

        static {
            Covode.recordClassIndex(9845);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f17753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f17754c;

        static {
            Covode.recordClassIndex(9849);
        }

        f(d dVar, Context context, String str) {
            this.f17752a = dVar;
            this.f17753b = context;
            this.f17754c = str;
        }

        public final void run() {
            this.f17752a.a(this.f17753b, false, this.f17754c);
        }
    }

    public final boolean b() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar.f17725a;
        }
        return false;
    }

    public final long i() {
        com.bytedance.android.livesdk.gift.model.u uVar;
        p pVar = this.f17736d;
        if (pVar == null || (uVar = pVar.f17916b) == null) {
            return 0;
        }
        return uVar.f17944a;
    }

    public final void k() {
        if (!this.f17738f) {
            this.f17739g = true;
        }
        this.f17738f = true;
    }

    public final long l() {
        com.bytedance.android.livesdk.gift.model.u uVar;
        p pVar = this.f17736d;
        if (pVar == null || (uVar = pVar.f17916b) == null) {
            return 0;
        }
        return uVar.f17945b;
    }

    static {
        Covode.recordClassIndex(9842);
    }

    public final boolean d() {
        if (this.p) {
            return false;
        }
        a aVar = this.q;
        if ((aVar == null || !aVar.f17725a || !LiveFirstRechargeEnableV2Setting.INSTANCE.getValue()) && !e()) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        u g2 = g();
        u h2 = h();
        if (this.p) {
            return false;
        }
        if (g2 != null && g2.f19770m) {
            return true;
        }
        if (h2 == null || !h2.f19770m) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        a aVar = this.q;
        if (aVar != null && aVar.f17725a) {
            return true;
        }
        u g2 = g();
        if (g2 == null || !g2.f19770m) {
            return false;
        }
        return true;
    }

    public final u g() {
        com.bytedance.android.livesdk.gift.model.u uVar;
        p pVar = this.f17736d;
        if (pVar == null || (uVar = pVar.f17916b) == null) {
            return null;
        }
        long j2 = uVar.f17944a;
        if (j2 == 0) {
            return null;
        }
        return GiftManager.inst().findGiftById(j2);
    }

    public final b m() {
        a aVar = this.q;
        if (aVar == null || aVar.f17728d == 0) {
            return b.StyleUnknown;
        }
        a aVar2 = this.q;
        if (aVar2 == null || aVar2.f17728d != 1) {
            return b.StyleShowDiamond;
        }
        return b.StyleWithoutDiamond;
    }

    public final void c() {
        this.w.a(((FirstRechargeApi) com.bytedance.android.live.network.e.a().a(FirstRechargeApi.class)).syncFirstRechargeInfo(12L, com.bytedance.android.live.wallet.e.f13122g.f13124a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), i.f17757a));
    }

    public final void j() {
        this.w.a(t.b(u.f17737e - (com.bytedance.android.livesdk.utils.a.a.a() / 1000), TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new g(this)));
    }

    private d() {
        this.w = new f.a.b.a();
        String str = "";
        this.f17740h = str;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f17742j = arrayList;
        this.f17743k = new com.bytedance.android.livesdk.wallet.c();
        this.f17745m = str;
        this.o = str;
        this.s = new C0370d(this);
        this.t = new e(this);
        this.f17743k.f22406b = LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
        this.f17743k.f22405a = LiveFirstRechargeGiftPidSetting.INSTANCE.getValue();
        String str2 = this.f17743k.f22406b;
        arrayList.add(str2 != null ? str2 : str);
    }

    public final void a() {
        Integer num;
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        com.bytedance.android.livesdk.an.a.a().a(new g());
        k();
        com.bytedance.android.livesdk.an.a.a().a(new f());
        ao.a(y.e(), (int) R.string.e9k);
        this.f17744l = true;
        Context e2 = y.e();
        l.b(e2, "");
        if (a(e2) instanceof Application) {
            Context e3 = y.e();
            l.b(e3, "");
            Context a2 = a(e3);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
            ((Application) a2).unregisterActivityLifecycleCallbacks(this.s);
        }
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        com.bytedance.android.livesdk.an.a.a().a(new f());
        ao.a(y.e(), (int) R.string.e9k);
        h.p[] pVarArr = new h.p[9];
        pVarArr[0] = v.a("pay_method", "google_pay");
        pVarArr[1] = v.a("charge_style", "window");
        pVarArr[2] = v.a("charge_reason", this.f17740h);
        pVarArr[3] = v.a("request_page", "live_detail");
        pVarArr[4] = v.a("panel_type", "first_charge");
        com.bytedance.android.livesdk.wallet.c cVar = this.r;
        if (cVar != null) {
            num = Integer.valueOf(cVar.f22408d);
        } else {
            num = null;
        }
        pVarArr[5] = v.a("recharge_package", String.valueOf(num));
        pVarArr[6] = v.a("is_first_recharge", "1");
        pVarArr[7] = v.a("second_entrance", "other_recharge");
        pVarArr[8] = v.a("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        Map<String, String> b2 = ag.b(pVarArr);
        com.bytedance.android.livesdk.chatroom.d a3 = com.bytedance.android.livesdk.chatroom.d.a();
        l.b(a3, "");
        if (!m.a(a3.e())) {
            com.bytedance.android.livesdk.chatroom.d a4 = com.bytedance.android.livesdk.chatroom.d.a();
            l.b(a4, "");
            String e4 = a4.e();
            l.b(e4, "");
            b2.put("enter_live_method", e4);
        }
        b.a.a("livesdk_recharge_success").a(b2).a().b();
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    public static final class e implements com.bytedance.android.live.wallet.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17750a;

        static {
            Covode.recordClassIndex(9847);
        }

        public static final class a implements com.bytedance.android.livesdkapi.depend.d.b.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f17751a;

            static {
                Covode.recordClassIndex(9848);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.c
            public final void a(Throwable th) {
                l.d(th, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(e eVar) {
                this.f17751a = eVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.c
            public final void a(long j2) {
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.wallet.d(true, (int) (j2 - ((long) this.f17751a.f17750a.f17735c))));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f17750a = dVar;
        }

        private static Context a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, Object obj) {
            Activity activity;
            Application application;
            if (i2 == 1) {
                String str = null;
                if (!(obj instanceof List)) {
                    obj = null;
                }
                List<com.bytedance.android.livesdk.wallet.c> list = (List) obj;
                if (list == null) {
                    return;
                }
                if (!(!list.isEmpty()) || !TextUtils.equals(this.f17750a.f17743k.f22406b, ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22406b)) {
                    if (!list.isEmpty()) {
                        com.bytedance.android.livesdk.wallet.c cVar = this.f17750a.r;
                        if (cVar != null) {
                            str = cVar.f22406b;
                        }
                        if (TextUtils.equals(str, ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22406b)) {
                            com.bytedance.android.livesdk.wallet.c cVar2 = this.f17750a.r;
                            if (cVar2 != null) {
                                cVar2.f22407c = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22407c;
                            }
                            com.bytedance.android.livesdk.wallet.c cVar3 = this.f17750a.r;
                            if (cVar3 != null) {
                                cVar3.f22412h = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22412h;
                            }
                            com.bytedance.android.livesdk.wallet.c cVar4 = this.f17750a.r;
                            if (cVar4 != null) {
                                cVar4.f22411g = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22411g;
                                return;
                            }
                            return;
                        }
                    }
                    com.bytedance.android.live.wallet.e eVar = com.bytedance.android.live.wallet.e.f13122g;
                    l.d(list, "");
                    if (!(list.isEmpty() || eVar.f13126c.isEmpty() || (!eVar.f13125b.isEmpty()))) {
                        for (com.bytedance.android.livesdk.wallet.c cVar5 : list) {
                            for (T t : eVar.f13126c) {
                                if (m.a(t.f22406b, cVar5.f22406b)) {
                                    t.f22407c = cVar5.f22407c;
                                    t.f22412h = cVar5.f22412h;
                                    t.f22411g = cVar5.f22411g;
                                }
                            }
                        }
                        eVar.a(eVar.f13126c);
                        return;
                    }
                    return;
                }
                this.f17750a.f17743k.f22407c = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22407c;
                this.f17750a.f17743k.f22412h = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22412h;
                this.f17750a.f17743k.f22411g = ((com.bytedance.android.livesdk.wallet.c) list.get(0)).f22411g;
                com.bytedance.android.live.wallet.e eVar2 = com.bytedance.android.live.wallet.e.f13122g;
                String str2 = this.f17750a.f17743k.f22411g;
                if (str2 == null) {
                    str2 = "";
                }
                eVar2.a(str2);
                com.bytedance.android.live.wallet.e eVar3 = com.bytedance.android.live.wallet.e.f13122g;
                com.bytedance.android.livesdk.wallet.c cVar6 = this.f17750a.f17743k;
                l.d(cVar6, "");
                eVar3.f13127d = cVar6;
                this.f17750a.c();
                if (com.bytedance.android.live.wallet.e.f13122g.a().isEmpty()) {
                    com.bytedance.android.live.wallet.e eVar4 = com.bytedance.android.live.wallet.e.f13122g;
                    long j2 = this.f17750a.f17733a;
                    long j3 = this.f17750a.f17734b;
                    if (eVar4.f13124a.length() != 0) {
                        long j4 = 0;
                        if (e.a.a()) {
                            j4 = 8;
                        }
                        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(eVar4.f13124a, j2, j3, j4).a(new e.c(eVar4), e.d.f13145a);
                    }
                }
            } else if (i2 == 2) {
                WeakReference<Activity> weakReference = this.f17750a.n;
                if (!(weakReference == null || (activity = weakReference.get()) == null || (application = activity.getApplication()) == null)) {
                    application.unregisterActivityLifecycleCallbacks(this.f17750a.s);
                }
            } else if (i2 == 3) {
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(new a(this));
            }
        }

        @Override // com.bytedance.android.live.wallet.g
        public final void a(int i2, int i3, int i4, Exception exc, com.bytedance.android.livesdk.wallet.g gVar) {
            Activity activity;
            WeakReference<Activity> weakReference;
            Activity activity2;
            l.d(gVar, "");
            if (i2 == 2) {
                WeakReference<Activity> weakReference2 = this.f17750a.n;
                if (!(weakReference2 == null || (activity = weakReference2.get()) == null)) {
                    ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).handleExceptionForAll(new com.bytedance.android.livesdk.wallet.a.a(i2, i3, i4, exc, true, "", 0, false), activity);
                }
                Context e2 = y.e();
                l.b(e2, "");
                if (a(e2) instanceof Application) {
                    Context e3 = y.e();
                    l.b(e3, "");
                    Context a2 = a(e3);
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
                    ((Application) a2).unregisterActivityLifecycleCallbacks(this.f17750a.s);
                }
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b(this);
            } else if (i2 == 3 && (weakReference = this.f17750a.n) != null && (activity2 = weakReference.get()) != null) {
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).handleExceptionForAll(new com.bytedance.android.livesdk.wallet.a.a(i2, i3, i4, exc, true, "", 0, false), activity2);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.firstrecharge.d$d  reason: collision with other inner class name */
    public static final class C0370d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17749a;

        static {
            Covode.recordClassIndex(9846);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.d(activity, "");
            l.d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            l.d(activity, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0370d(d dVar) {
            this.f17749a = dVar;
        }

        public final void onActivityResumed(Activity activity) {
            Integer num;
            String str;
            l.d(activity, "");
            ComponentName componentName = activity.getComponentName();
            l.b(componentName, "");
            if (m.a("com.android.billingclient.api.ProxyBillingActivity", componentName.getClassName())) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_recharge_pay");
                h.p[] pVarArr = new h.p[9];
                pVarArr[0] = v.a("request_page", "live_detail");
                pVarArr[1] = v.a("charge_reason", this.f17749a.f17740h);
                pVarArr[2] = v.a("charge_style", "window");
                pVarArr[3] = v.a("panel_type", "first_charge");
                pVarArr[4] = v.a("pay_method", "google_pay");
                com.bytedance.android.livesdk.wallet.c cVar = this.f17749a.r;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f22408d);
                } else {
                    num = null;
                }
                pVarArr[5] = v.a("recharge_package", String.valueOf(num));
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IGiftService.class);
                l.b(a3, "");
                if (((IGiftService) a3).isFirstRecharge()) {
                    str = "1";
                } else {
                    str = "0";
                }
                pVarArr[6] = v.a("is_first_recharge", str);
                pVarArr[7] = v.a("second_entrance", "other_recharge");
                pVarArr[8] = v.a("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
                a2.a(ag.a(pVarArr)).a().b();
            }
        }
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17755a;

        static {
            Covode.recordClassIndex(9850);
        }

        g(d dVar) {
            this.f17755a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f17755a.p = true;
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.service.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17756a;

        static {
            Covode.recordClassIndex(9851);
        }

        h(d dVar) {
            this.f17756a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar;
            com.bytedance.android.livesdk.wallet.c cVar;
            String str;
            a aVar2;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            d dVar2 = this.f17756a;
            String str2 = null;
            if (dVar != null) {
                aVar = (a) dVar.data;
            } else {
                aVar = null;
            }
            dVar2.q = aVar;
            d dVar3 = this.f17756a;
            if (dVar == null || (aVar2 = (a) dVar.data) == null) {
                cVar = null;
            } else {
                cVar = aVar2.f17726b;
            }
            dVar3.r = cVar;
            this.f17756a.f17742j.clear();
            ArrayList<String> arrayList = this.f17756a.f17742j;
            com.bytedance.android.livesdk.wallet.c cVar2 = this.f17756a.r;
            if (cVar2 == null || (str = cVar2.f22406b) == null) {
                str = "";
            }
            arrayList.add(str);
            com.bytedance.android.livesdk.wallet.c cVar3 = this.f17756a.r;
            if (cVar3 != null) {
                str2 = cVar3.f22406b;
            }
            if (!TextUtils.isEmpty(str2)) {
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(this.f17756a.f17742j);
            }
        }
    }

    public final boolean a(List<GiftPage> list) {
        p pVar;
        long j2;
        if (!(list == null || list.isEmpty() || (pVar = this.f17736d) == null)) {
            for (GiftPage giftPage : list) {
                Iterator<u> it = giftPage.gifts.iterator();
                while (true) {
                    if (it.hasNext()) {
                        u next = it.next();
                        l.b(next, "");
                        long j3 = next.f19761d;
                        com.bytedance.android.livesdk.gift.model.u uVar = pVar.f17916b;
                        if (uVar != null) {
                            j2 = uVar.f17944a;
                        } else {
                            j2 = 0;
                        }
                        if (j3 == j2) {
                            return next.f19770m;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.gift.a.b
    public final void b(Context context, String str) {
        a(context, true, str);
    }

    public final void a(Context context, String str) {
        if (this.f17744l) {
            ao.a(y.e(), (int) R.string.glj);
        } else if (y.f()) {
            a(context, false, str);
        } else {
            com.bytedance.android.livesdkapi.f.a aVar = new com.bytedance.android.livesdkapi.f.a(1);
            com.bytedance.android.livesdk.gift.d.h hVar = new com.bytedance.android.livesdk.gift.d.h();
            this.f17741i = hVar;
            hVar.f17851b = "first_recharge";
            com.bytedance.android.livesdk.gift.d.h hVar2 = this.f17741i;
            if (hVar2 != null) {
                hVar2.f17853d = new f(this, context, str);
            }
            com.bytedance.android.livesdk.an.a.a().a(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.a.b
    public final void a(long j2, long j3) {
        this.f17742j.clear();
        ArrayList<String> arrayList = this.f17742j;
        String str = this.f17743k.f22406b;
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        this.f17733a = j2;
        this.f17734b = j3;
        if (!e.a.a()) {
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(this.t);
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(this.f17742j);
        }
        this.p = false;
        this.f17736d = null;
        this.w.a();
        this.q = null;
    }

    public final void a(Context context, boolean z, String str) {
        com.bytedance.android.livesdk.wallet.c cVar;
        com.bytedance.android.livesdk.wallet.c cVar2;
        String str2;
        Integer num;
        String str3;
        String str4;
        if (context instanceof Activity) {
            com.bytedance.android.livesdk.wallet.c cVar3 = this.r;
            if (cVar3 != null) {
                Integer num2 = null;
                String str5 = cVar3.f22407c;
                if (!(str5 == null || str5.length() == 0 || (((cVar = this.r) != null && cVar.f22408d == 0) || ((cVar2 = this.r) != null && cVar2.f22409e == 0)))) {
                    e.a(this.o);
                    String value = LiveFirstRechargeWebUrlLynx.INSTANCE.getValue();
                    try {
                        Uri.Builder buildUpon = Uri.parse(value).buildUpon();
                        buildUpon.appendQueryParameter("gift_enter_from", this.o);
                        com.bytedance.android.livesdk.wallet.c cVar4 = this.r;
                        if (cVar4 == null || (str4 = cVar4.f22407c) == null) {
                            str2 = null;
                        } else {
                            str2 = str4.toString();
                        }
                        buildUpon.appendQueryParameter("price", str2);
                        com.bytedance.android.livesdk.wallet.c cVar5 = this.r;
                        if (cVar5 != null) {
                            num = Integer.valueOf(cVar5.f22408d);
                        } else {
                            num = null;
                        }
                        buildUpon.appendQueryParameter("diamond_count", String.valueOf(num));
                        com.bytedance.android.livesdk.wallet.c cVar6 = this.r;
                        if (cVar6 != null) {
                            num2 = Integer.valueOf(cVar6.f22409e);
                        }
                        buildUpon.appendQueryParameter("giving_count", String.valueOf(num2));
                        buildUpon.appendQueryParameter("charge_reason", str);
                        String str6 = "1";
                        if (z) {
                            str3 = str6;
                        } else {
                            str3 = "0";
                        }
                        buildUpon.appendQueryParameter("recall", str3);
                        buildUpon.appendQueryParameter("pay_method", "google_pay");
                        if (!LiveFirstRechargeTitle.INSTANCE.getValue()) {
                            str6 = "0";
                        }
                        buildUpon.appendQueryParameter("title_ab", str6);
                        String uri = buildUpon.build().toString();
                        l.b(uri, "");
                        value = uri;
                    } catch (Exception unused) {
                    }
                    ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(context, value);
                    return;
                }
            }
            ao.a(y.e(), (int) R.string.glj);
        }
    }
}
