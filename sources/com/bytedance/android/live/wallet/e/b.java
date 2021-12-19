package com.bytedance.android.live.wallet.e;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.live.wallet.f.a.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public d f13136e;

    /* renamed from: f  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f13137f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f13138g;

    static {
        Covode.recordClassIndex(7289);
    }

    private void d() {
        d dVar = this.f13136e;
        if (dVar != null) {
            dVar.f();
        }
        this.f13136e = null;
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13139a;

        static {
            Covode.recordClassIndex(7290);
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
        a(b bVar) {
            this.f13139a = bVar;
        }

        public final void onActivityResumed(Activity activity) {
            d dVar;
            Integer num;
            l.d(activity, "");
            ComponentName componentName = activity.getComponentName();
            l.b(componentName, "");
            if (m.a(componentName.getClassName(), "com.android.billingclient.api.ProxyBillingActivity") && (dVar = this.f13139a.f13136e) != null) {
                HashMap hashMap = new HashMap();
                c cVar = dVar.f13152b;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f22408d);
                } else {
                    num = null;
                }
                hashMap.put("recharge_package", String.valueOf(num));
                hashMap.put("pay_method", e.a.b());
                hashMap.put("request_page", "my_profile");
                b.a.a("livesdk_recharge_pay").a((Map<String, String>) hashMap).b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.e.b$b  reason: collision with other inner class name */
    public static final class C0277b implements com.bytedance.android.livesdkapi.depend.d.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f13141b;

        static {
            Covode.recordClassIndex(7291);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(Throwable th) {
            int i2;
            l.d(th, "");
            if (th instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
            } else {
                i2 = 61;
            }
            com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", i2, -1, "update info fail");
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(long j2) {
            HashMap hashMap = new HashMap();
            long j3 = (long) this.f13140a;
            long j4 = this.f13141b;
            if (j3 + j4 == j2) {
                com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", hashMap);
                return;
            }
            hashMap.put("originCoins", Long.valueOf(j4));
            hashMap.put("preCoins", Integer.valueOf(this.f13140a));
            hashMap.put("serverCoins", Long.valueOf(j2));
            com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", 62, -1, "update info fail", hashMap);
        }

        C0277b(int i2, long j2) {
            this.f13140a = i2;
            this.f13141b = j2;
        }
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.android.live.wallet.f.b.c
    public final void b(int i2) {
        Application application;
        Integer num;
        com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
        l.b(walletCenter, "");
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(new C0277b(i2, walletCenter.b()));
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", "my_profile");
        hashMap.put("pay_method", e.a.b());
        d dVar = this.f13136e;
        if (dVar != null) {
            c cVar = dVar.f13152b;
            if (cVar != null) {
                num = Integer.valueOf(cVar.f22408d);
            } else {
                num = null;
            }
            hashMap.put("recharge_package", String.valueOf(num));
        }
        b.a.a("livesdk_recharge_success").a((Map<String, String>) hashMap).b();
        androidx.fragment.app.e a2 = p.a(this.f13132c);
        if (!(a2 == null || (application = a2.getApplication()) == null)) {
            application.unregisterActivityLifecycleCallbacks(this.f13137f);
        }
        try {
            b().put("code", 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f13133d.a(a().f35531b, b());
        d();
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        c a2;
        Application application;
        l.d(hVar, "");
        l.d(jSONObject, "");
        super.call(hVar, jSONObject);
        if (this.f13136e == null) {
            this.f13136e = this.f13138g.a(this.f13132c);
        }
        d dVar = this.f13136e;
        if (dVar != null) {
            dVar.a((com.bytedance.ies.a.a) this);
            dVar.e();
        }
        a().f35538i = false;
        JSONObject jSONObject2 = a().f35533d.getJSONObject("args");
        String string = jSONObject2.getString("iap_id");
        String string2 = jSONObject2.getString("diamond_id");
        HashMap hashMap = new HashMap();
        l.b(string, "");
        hashMap.put("iabId", string);
        l.b(string2, "");
        hashMap.put("diamondId", string2);
        hashMap.put("methodName", "ChargeMethod");
        com.bytedance.android.live.core.d.c.a("ttlive_wallet_H5_query", 0, hashMap);
        androidx.fragment.app.e a3 = p.a(this.f13132c);
        if (!(a3 == null || (application = a3.getApplication()) == null)) {
            application.registerActivityLifecycleCallbacks(this.f13137f);
        }
        d dVar2 = this.f13136e;
        if (dVar2 == null || (a2 = dVar2.a(string)) == null) {
            a(new Exception("diamond isn null"), 0);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("recharge_package", String.valueOf(a2.f22408d));
        hashMap2.put("request_page", "my_profile");
        hashMap2.put("pay_method", e.a.b());
        hashMap2.put("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        b.a.a("livesdk_recharge_click").a((Map<String, String>) hashMap2).b();
        d dVar3 = this.f13136e;
        if (dVar3 != null) {
            dVar3.a(a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, com.bytedance.ies.web.a.a aVar, d dVar) {
        super(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(dVar, "");
        this.f13138g = dVar;
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2, int i3, int i4, Exception exc) {
        androidx.fragment.app.e a2;
        Application application;
        int i5;
        l.d(exc, "");
        try {
            JSONObject b2 = b();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            b2.put("is_outside_channel", i5);
            b().put("code", -1);
            b().put("charge_error_code", i3);
            b().put("msg", "");
            if (i3 == 31) {
                b().put("source", 1);
            } else {
                b().put("source", i2);
            }
            if (!(exc instanceof com.bytedance.android.live.a.a.b.a) || i3 != 31) {
                if (i2 == 3 && i3 == 41) {
                    b().put("charge_error_code", 1);
                }
                this.f13133d.a(a().f35531b, b());
                d();
                a2 = p.a(this.f13132c);
                if (a2 != null && (application = a2.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(this.f13137f);
                    return;
                }
            }
            b().put("msg", ((com.bytedance.android.live.a.a.b.a) exc).getPrompt());
            b().put("charge_error_code", ((com.bytedance.android.live.a.a.a) exc).getErrorCode());
            this.f13133d.a(a().f35531b, b());
            d();
            a2 = p.a(this.f13132c);
            if (a2 != null) {
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
