package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.h.b;
import com.google.android.gms.internal.h.c;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

public final class e extends d {

    /* renamed from: a  reason: collision with root package name */
    int f5820a;

    /* renamed from: b  reason: collision with root package name */
    final String f5821b;

    /* renamed from: c  reason: collision with root package name */
    v f5822c;

    /* renamed from: d  reason: collision with root package name */
    Context f5823d;

    /* renamed from: e  reason: collision with root package name */
    com.google.android.gms.internal.h.a f5824e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5825f;

    /* renamed from: g  reason: collision with root package name */
    boolean f5826g;

    /* renamed from: h  reason: collision with root package name */
    boolean f5827h;

    /* renamed from: i  reason: collision with root package name */
    boolean f5828i;

    /* renamed from: j  reason: collision with root package name */
    boolean f5829j;

    /* renamed from: k  reason: collision with root package name */
    boolean f5830k;

    /* renamed from: l  reason: collision with root package name */
    boolean f5831l;

    /* renamed from: m  reason: collision with root package name */
    boolean f5832m;
    private final Handler n;
    private Context o;
    private a p;
    private boolean q;
    private ExecutorService r;
    private String s;
    private final ResultReceiver t;

    static {
        Covode.recordClassIndex(2442);
    }

    @Override // com.android.billingclient.api.d
    public final boolean a() {
        return (this.f5820a != 2 || this.f5824e == null || this.p == null) ? false : true;
    }

    @Override // com.android.billingclient.api.d
    public final void a(l lVar, m mVar) {
        if (!a()) {
            mVar.b(u.o, null);
            return;
        }
        String str = lVar.f5858a;
        List<String> list = lVar.f5860c;
        String str2 = lVar.f5859b;
        if (TextUtils.isEmpty(str)) {
            mVar.b(u.f5887g, null);
        } else if (list == null) {
            mVar.b(u.f5886f, null);
        } else if (!this.f5832m && str2 != null) {
            mVar.b(u.f5885e, null);
        } else if (a(new x(this, str, list, str2, mVar), 30000, new y(mVar)) == null) {
            mVar.b(b(), null);
        }
    }

    @Override // com.android.billingclient.api.d
    public final void a(i iVar, j jVar) {
        if (!a()) {
            jVar.a(u.o, iVar.f5856a);
        } else if (a(new ab(this, iVar, jVar), 30000, new aa(jVar, iVar)) == null) {
            jVar.a(b(), iVar.f5856a);
        }
    }

    /* access modifiers changed from: package-private */
    public final h b() {
        int i2 = this.f5820a;
        if (i2 == 0 || i2 == 3) {
            return u.o;
        }
        return u.f5892l;
    }

    private static String c() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "3.0.0";
        }
    }

    final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final Object f5833a;

        /* renamed from: b  reason: collision with root package name */
        boolean f5834b;

        /* renamed from: c  reason: collision with root package name */
        f f5835c;

        static {
            Covode.recordClassIndex(2443);
        }

        /* access modifiers changed from: package-private */
        public final void a(h hVar) {
            e.this.a(new r(this, hVar));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            MethodCollector.i(6358);
            e.this.f5824e = null;
            e.this.f5820a = 0;
            synchronized (this.f5833a) {
                try {
                    f fVar = this.f5835c;
                    if (fVar != null) {
                        fVar.a();
                    }
                } finally {
                    MethodCollector.o(6358);
                }
            }
        }

        private a(f fVar) {
            this.f5833a = new Object();
            this.f5834b = false;
            this.f5835c = fVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.google.android.gms.internal.h.a cVar;
            e eVar = e.this;
            if (iBinder == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface instanceof com.google.android.gms.internal.h.a) {
                    cVar = (com.google.android.gms.internal.h.a) queryLocalInterface;
                } else {
                    cVar = new c(iBinder);
                }
            }
            eVar.f5824e = cVar;
            if (e.this.a(new t(this), 30000, new s(this)) == null) {
                a(e.this.b());
            }
        }

        /* synthetic */ a(e eVar, f fVar, byte b2) {
            this(fVar);
        }
    }

    private final h a(h hVar) {
        this.f5822c.f5895b.f5896a.a(hVar, null);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.n.post(runnable);
        }
    }

    private final h d(String str) {
        try {
            if (((Integer) a(new ah(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS)).intValue() == 0) {
                return u.n;
            }
            return u.f5889i;
        } catch (Exception unused) {
            return u.o;
        }
    }

    @Override // com.android.billingclient.api.d
    public final Purchase.a b(String str) {
        if (!a()) {
            return new Purchase.a(u.o, null);
        }
        if (TextUtils.isEmpty(str)) {
            return new Purchase.a(u.f5887g, null);
        }
        try {
            return (Purchase.a) a(new p(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.a(u.p, null);
        } catch (Exception unused2) {
            return new Purchase.a(u.f5892l, null);
        }
    }

    @Override // com.android.billingclient.api.d
    public final h a(String str) {
        if (!a()) {
            return u.o;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    if (this.f5826g) {
                        return u.n;
                    }
                    return u.f5889i;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    if (this.f5828i) {
                        return u.n;
                    }
                    return u.f5889i;
                }
                break;
            case 292218239:
                if (str.equals("inAppItemsOnVr")) {
                    return d("inapp");
                }
                break;
            case 1219490065:
                if (str.equals("subscriptionsOnVr")) {
                    return d("subs");
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    if (this.f5825f) {
                        return u.n;
                    }
                    return u.f5889i;
                }
                break;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Unsupported feature: ".concat(valueOf);
        } else {
            new String("Unsupported feature: ");
        }
        return u.s;
    }

    /* access modifiers changed from: package-private */
    public final Purchase.a c(String str) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Querying owned items, item type: ".concat(valueOf);
        } else {
            new String("Querying owned items, item type: ");
        }
        ArrayList arrayList = new ArrayList();
        boolean z = this.f5829j;
        boolean z2 = this.q;
        String str2 = this.f5821b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("playBillingLibraryVersion", str2);
        if (z && z2) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        String str3 = null;
        do {
            try {
                if (this.f5829j) {
                    bundle = this.f5824e.a(this.f5823d.getPackageName(), str, str3, bundle2);
                } else {
                    bundle = this.f5824e.b(this.f5823d.getPackageName(), str, str3);
                }
                h hVar = u.f5892l;
                if (bundle == null) {
                    com.a.a("%s got null owned items list", new Object[]{"getPurchase()"});
                } else {
                    int a2 = b.a(bundle);
                    String b2 = b.b(bundle);
                    h.a a3 = h.a();
                    a3.f5854a = a2;
                    a3.f5855b = b2;
                    h a4 = a3.a();
                    if (a2 != 0) {
                        com.a.a("%s failed. Response code: %s", new Object[]{"getPurchase()", Integer.valueOf(a2)});
                        hVar = a4;
                    } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        com.a.a("Bundle returned from %s doesn't contain required fields.", new Object[]{"getPurchase()"});
                    } else {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.a.a("Bundle returned from %s contains null SKUs list.", new Object[]{"getPurchase()"});
                        } else if (stringArrayList2 == null) {
                            com.a.a("Bundle returned from %s contains null purchases list.", new Object[]{"getPurchase()"});
                        } else if (stringArrayList3 == null) {
                            com.a.a("Bundle returned from %s contains null signatures list.", new Object[]{"getPurchase()"});
                        } else {
                            hVar = u.n;
                        }
                    }
                }
                if (hVar != u.n) {
                    return new Purchase.a(hVar, null);
                }
                ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
                    String str4 = stringArrayList5.get(i2);
                    String str5 = stringArrayList6.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList4.get(i2));
                    if (valueOf2.length() != 0) {
                        "Sku is owned: ".concat(valueOf2);
                    } else {
                        new String("Sku is owned: ");
                    }
                    try {
                        Purchase purchase = new Purchase(str4, str5);
                        TextUtils.isEmpty(purchase.c());
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        String.valueOf(String.valueOf(e2)).length();
                        return new Purchase.a(u.f5892l, null);
                    }
                }
                str3 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf3 = String.valueOf(str3);
                if (valueOf3.length() != 0) {
                    "Continuation token: ".concat(valueOf3);
                } else {
                    new String("Continuation token: ");
                }
            } catch (Exception e3) {
                String.valueOf(String.valueOf(e3)).length();
                return new Purchase.a(u.o, null);
            }
        } while (!TextUtils.isEmpty(str3));
        return new Purchase.a(u.n, arrayList);
    }

    @Override // com.android.billingclient.api.d
    public final void a(f fVar) {
        boolean z;
        if (a()) {
            fVar.b(u.n);
            return;
        }
        int i2 = this.f5820a;
        if (i2 == 1) {
            fVar.b(u.f5884d);
        } else if (i2 == 3) {
            fVar.b(u.o);
        } else {
            this.f5820a = 1;
            v vVar = this.f5822c;
            w wVar = vVar.f5895b;
            Context context = vVar.f5894a;
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            if (!wVar.f5897b) {
                w.a(context, wVar.f5898c.f5895b, intentFilter);
                wVar.f5897b = true;
            }
            this.p = new a(this, fVar, (byte) 0);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f5823d.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f5821b);
                        Context context2 = this.f5823d;
                        a aVar = this.p;
                        if (context2 == null || !(context2 instanceof Context)) {
                            z = context2.bindService(intent2, aVar, 1);
                        } else if (!d.a(context2, intent2)) {
                            z = context2.bindService(intent2, aVar, 1);
                        } else {
                            return;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
            }
            this.f5820a = 0;
            fVar.b(u.f5883c);
        }
    }

    @Override // com.android.billingclient.api.d
    public final void a(b bVar, c cVar) {
        if (!a()) {
            cVar.a(u.o);
        } else if (TextUtils.isEmpty(bVar.f5815a)) {
            cVar.a(u.f5891k);
        } else if (!this.f5829j) {
            cVar.a(u.f5882b);
        } else if (a(new ac(this, bVar, cVar), 30000, new ag(cVar)) == null) {
            cVar.a(b());
        }
    }

    @Override // com.android.billingclient.api.d
    public final h a(Activity activity, g gVar) {
        boolean z;
        Future future;
        long j2;
        int i2;
        if (!a()) {
            return a(u.o);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f5843g);
        SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
        String c2 = skuDetails.c();
        if (c2.equals("subs") && !this.f5825f) {
            return a(u.q);
        }
        if (gVar.f5839c != null) {
            z = true;
            if (!this.f5826g) {
                return a(u.r);
            }
        } else {
            z = false;
        }
        if (gVar.a() && !this.f5827h) {
            return a(u.f5888h);
        }
        String str = "";
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(arrayList.get(i3));
            str = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
            if (i3 < arrayList.size() - 1) {
                str = String.valueOf(str).concat(", ");
            }
        }
        String.valueOf(str).length();
        String.valueOf(c2).length();
        if (this.f5827h) {
            boolean z2 = this.f5829j;
            boolean z3 = this.q;
            String str2 = this.f5821b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str2);
            if (gVar.f5842f != 0) {
                bundle.putInt("prorationMode", gVar.f5842f);
            }
            if (!TextUtils.isEmpty(gVar.f5838b)) {
                bundle.putString("accountId", gVar.f5838b);
            }
            if (!TextUtils.isEmpty(gVar.f5841e)) {
                bundle.putString("obfuscatedProfileId", gVar.f5841e);
            }
            if (gVar.f5844h) {
                bundle.putBoolean("vr", true);
            }
            if (!TextUtils.isEmpty(gVar.f5839c)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(gVar.f5839c)));
            }
            if (!TextUtils.isEmpty(gVar.f5840d)) {
                bundle.putString("oldSkuPurchaseToken", gVar.f5840d);
            }
            if (z2 && z3) {
                bundle.putBoolean("enablePendingPurchases", true);
            }
            if (!skuDetails.d().isEmpty()) {
                bundle.putString("skuDetailsToken", skuDetails.d());
            }
            if (!TextUtils.isEmpty(skuDetails.b())) {
                bundle.putString("skuPackageName", skuDetails.b());
            }
            if (!TextUtils.isEmpty(this.s)) {
                bundle.putString("accountName", this.s);
            }
            if (arrayList.size() > 1) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size() - 1);
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    arrayList2.add(((SkuDetails) arrayList.get(i4)).a());
                }
                bundle.putStringArrayList("additionalSkus", arrayList2);
            }
            if (this.f5829j) {
                i2 = 9;
            } else if (gVar.f5844h) {
                i2 = 7;
            } else {
                i2 = 6;
            }
            o oVar = new o(this, i2, skuDetails, c2, gVar, bundle);
            j2 = 5000;
            future = a(oVar, 5000, (Runnable) null);
        } else {
            j2 = 5000;
            if (z) {
                future = a(new n(this, gVar, skuDetails), 5000, (Runnable) null);
            } else {
                future = a(new q(this, skuDetails, c2), 5000, (Runnable) null);
            }
        }
        try {
            Bundle bundle2 = (Bundle) future.get(j2, TimeUnit.MILLISECONDS);
            int a2 = b.a(bundle2);
            String b2 = b.b(bundle2);
            if (a2 != 0) {
                h.a a3 = h.a();
                a3.f5854a = a2;
                a3.f5855b = b2;
                return a(a3.a());
            }
            Intent intent = new Intent(activity, ProxyBillingActivity.class);
            intent.putExtra("result_receiver", this.t);
            intent.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
            return u.n;
        } catch (CancellationException | TimeoutException unused) {
            String.valueOf(str).length();
            return a(u.p);
        } catch (Exception unused2) {
            String.valueOf(str).length();
            return a(u.o);
        }
    }

    public e(boolean z, Context context, k kVar) {
        this(context, z, kVar, c());
    }

    /* access modifiers changed from: package-private */
    public final <T> Future<T> a(Callable<T> callable, long j2, Runnable runnable) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        long j3 = (long) (d2 * 0.95d);
        if (this.r == null) {
            int i2 = b.f50615a;
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = i2;
            this.r = g.a(a2.a());
        }
        try {
            Future<T> submit = this.r.submit(callable);
            this.n.postDelayed(new af(submit, runnable), j3);
            return submit;
        } catch (Exception e2) {
            String.valueOf(String.valueOf(e2)).length();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final SkuDetails.a a(String str, List<String> list, String str2) {
        int i2;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 20;
            if (i4 > size) {
                i2 = size;
            } else {
                i2 = i4;
            }
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i3, i2));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.f5821b);
            try {
                if (this.f5830k) {
                    com.google.android.gms.internal.h.a aVar = this.f5824e;
                    String packageName = this.f5823d.getPackageName();
                    boolean z = this.f5829j;
                    boolean z2 = this.f5832m;
                    boolean z3 = this.q;
                    String str3 = this.f5821b;
                    Bundle bundle3 = new Bundle();
                    if (z) {
                        bundle3.putString("playBillingLibraryVersion", str3);
                        if (z3) {
                            bundle3.putBoolean("enablePendingPurchases", true);
                        }
                    }
                    if (z2 && str2 != null) {
                        bundle3.putString("SKU_PACKAGE_NAME", str2);
                    }
                    bundle = aVar.a(packageName, str, bundle2, bundle3);
                } else {
                    bundle = this.f5824e.a(this.f5823d.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    return new SkuDetails.a(4, "Null sku details list", null);
                }
                if (!bundle.containsKey("DETAILS_LIST")) {
                    int a2 = b.a(bundle);
                    String b2 = b.b(bundle);
                    if (a2 != 0) {
                        return new SkuDetails.a(a2, b2, arrayList);
                    }
                    return new SkuDetails.a(6, b2, arrayList);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return new SkuDetails.a(4, "querySkuDetailsAsync got null response list", null);
                }
                for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                    try {
                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                        String.valueOf(String.valueOf(skuDetails)).length();
                        arrayList.add(skuDetails);
                    } catch (JSONException unused) {
                        return new SkuDetails.a(6, "Error trying to decode SkuDetails.", null);
                    }
                }
                i3 = i4;
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2);
                "querySkuDetailsAsync got a remote exception (try to reconnect).".length();
                String.valueOf(valueOf).length();
                return new SkuDetails.a(-1, "Service connection is disconnected.", null);
            }
        }
        return new SkuDetails.a(0, "", arrayList);
    }

    private e(Context context, boolean z, k kVar, String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.n = handler;
        this.t = new zzh(this, handler);
        this.s = null;
        this.f5821b = str;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f5823d = applicationContext;
        this.f5822c = new v(this.f5823d, kVar);
        this.o = context;
        this.q = z;
    }
}
