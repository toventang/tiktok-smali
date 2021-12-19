package com.facebook.a.e;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.a.e;
import com.facebook.a.e.d;
import com.facebook.a.g;
import com.facebook.a.h;
import com.facebook.a.j;
import com.facebook.ab;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ae;
import com.facebook.internal.p;
import com.facebook.m;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f46735a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f46736b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f46737c = null;

    /* renamed from: d  reason: collision with root package name */
    public static ServiceConnection f46738d;

    /* renamed from: e  reason: collision with root package name */
    public static Application.ActivityLifecycleCallbacks f46739e;

    /* renamed from: f  reason: collision with root package name */
    public static Intent f46740f;

    /* renamed from: g  reason: collision with root package name */
    public static Object f46741g;

    /* renamed from: h  reason: collision with root package name */
    private static final String f46742h = g.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28479);
    }

    public static void a(Context context, ArrayList<String> arrayList, boolean z) {
        d.a a2;
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            for (Map.Entry<String, String> entry : h.a(context, arrayList2, f46741g, z).entrySet()) {
                String str = (String) hashMap.get(entry.getKey());
                String value = entry.getValue();
                if (d.a() && (a2 = d.a(str, value, new HashMap())) != null) {
                    boolean z2 = false;
                    if (z) {
                        ae.a();
                        if (p.a("app_events_if_auto_log_subs", m.f48915a, false)) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        h.a(value);
                        com.facebook.a.m mVar = d.f46727a;
                        BigDecimal bigDecimal = a2.f46729a;
                        Currency currency = a2.f46730b;
                        Bundle bundle = a2.f46731c;
                        if (ab.b()) {
                            h hVar = mVar.f46875a;
                            if (!(a.a(hVar) || bigDecimal == null || currency == null)) {
                                if (bundle == null) {
                                    try {
                                        bundle = new Bundle();
                                    } catch (Throwable th) {
                                        a.a(th, hVar);
                                    }
                                }
                                bundle.putString("fb_currency", currency.getCurrencyCode());
                                Double.valueOf(bigDecimal.doubleValue());
                            }
                        }
                    } else {
                        com.facebook.a.m mVar2 = d.f46727a;
                        BigDecimal bigDecimal2 = a2.f46729a;
                        Currency currency2 = a2.f46730b;
                        Bundle bundle2 = a2.f46731c;
                        if (ab.b()) {
                            h hVar2 = mVar2.f46875a;
                            if (!a.a(hVar2)) {
                                try {
                                    if (!a.a(hVar2)) {
                                        if (bigDecimal2 == null) {
                                            try {
                                                h.a("purchaseAmount cannot be null");
                                            } catch (Throwable th2) {
                                                a.a(th2, hVar2);
                                            }
                                        } else if (currency2 == null) {
                                            h.a("currency cannot be null");
                                        } else {
                                            if (bundle2 == null) {
                                                bundle2 = new Bundle();
                                            }
                                            bundle2.putString("fb_currency", currency2.getCurrencyCode());
                                            Double.valueOf(bigDecimal2.doubleValue());
                                            if (!a.a(h.class)) {
                                                try {
                                                    if (h.a() != g.a.EXPLICIT_ONLY) {
                                                        e.a(j.EAGER_FLUSHING_EVENT);
                                                    }
                                                } catch (Throwable th3) {
                                                    a.a(th3, h.class);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    a.a(th4, hVar2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
