package com.facebook.a.i;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.f.c;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.m;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Set<String> f46844a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    static final Set<String> f46845b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f46846c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(28529);
    }

    static /* synthetic */ AtomicBoolean b() {
        if (a.a(d.class)) {
            return null;
        }
        try {
            return f46846c;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    public static synchronized void a() {
        synchronized (d.class) {
            MethodCollector.i(1208);
            if (a.a(d.class)) {
                MethodCollector.o(1208);
                return;
            }
            try {
                m.c().execute(new Runnable() {
                    /* class com.facebook.a.i.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28530);
                    }

                    public final void run() {
                        Activity activity;
                        MethodCollector.i(3796);
                        if (a.a(this)) {
                            MethodCollector.o(3796);
                            return;
                        }
                        try {
                            if (d.b().get()) {
                                MethodCollector.o(3796);
                                return;
                            }
                            d.b().set(true);
                            if (!a.a(d.class)) {
                                try {
                                    if (!a.a(d.class)) {
                                        try {
                                            ae.a();
                                            q a2 = r.a(m.f48915a, false);
                                            if (a2 == null) {
                                                try {
                                                    MethodCollector.o(3796);
                                                    return;
                                                } catch (Throwable th) {
                                                    a.a(th, d.class);
                                                }
                                            } else {
                                                String str = a2.r;
                                                if (str == null) {
                                                    MethodCollector.o(3796);
                                                    return;
                                                }
                                                if (!a.a(d.class)) {
                                                    try {
                                                        JSONObject jSONObject = new JSONObject(str);
                                                        if (jSONObject.has("production_events")) {
                                                            JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                                                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                                                d.f46844a.add(jSONArray.getString(i2));
                                                            }
                                                        }
                                                        if (jSONObject.has("eligible_for_prediction_events")) {
                                                            JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                                                            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                                                                d.f46845b.add(jSONArray2.getString(i3));
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    } catch (Throwable th2) {
                                                        a.a(th2, d.class);
                                                    }
                                                }
                                                if (!d.f46844a.isEmpty() || !d.f46845b.isEmpty()) {
                                                    File a3 = c.a(c.a.MTML_APP_EVENT_PREDICTION);
                                                    if (a3 == null) {
                                                        MethodCollector.o(3796);
                                                        return;
                                                    }
                                                    if (!a.a(a.class)) {
                                                        try {
                                                            a.f46837d = new JSONObject();
                                                            FileInputStream fileInputStream = new FileInputStream(a3);
                                                            byte[] bArr = new byte[fileInputStream.available()];
                                                            fileInputStream.read(bArr);
                                                            fileInputStream.close();
                                                            a.f46837d = new JSONObject(new String(bArr, "UTF-8"));
                                                            try {
                                                                HashMap hashMap = new HashMap();
                                                                a.f46834a = hashMap;
                                                                hashMap.put("ENGLISH", "1");
                                                                a.f46834a.put("GERMAN", "2");
                                                                a.f46834a.put("SPANISH", "3");
                                                                a.f46834a.put("JAPANESE", "4");
                                                                HashMap hashMap2 = new HashMap();
                                                                a.f46835b = hashMap2;
                                                                hashMap2.put("VIEW_CONTENT", "0");
                                                                a.f46835b.put("SEARCH", "1");
                                                                a.f46835b.put("ADD_TO_CART", "2");
                                                                a.f46835b.put("ADD_TO_WISHLIST", "3");
                                                                a.f46835b.put("INITIATE_CHECKOUT", "4");
                                                                a.f46835b.put("ADD_PAYMENT_INFO", "5");
                                                                a.f46835b.put("PURCHASE", "6");
                                                                a.f46835b.put("LEAD", "7");
                                                                a.f46835b.put("COMPLETE_REGISTRATION", "8");
                                                                HashMap hashMap3 = new HashMap();
                                                                a.f46836c = hashMap3;
                                                                hashMap3.put("BUTTON_TEXT", "1");
                                                                a.f46836c.put("PAGE_TITLE", "2");
                                                                a.f46836c.put("RESOLVED_DOCUMENT_LINK", "3");
                                                                a.f46836c.put("BUTTON_ID", "4");
                                                                a.f46838e = true;
                                                            } catch (Throwable th3) {
                                                                a.a(th3, a.class);
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                    }
                                                    if (!(com.facebook.a.e.a.f46717j == null || (activity = com.facebook.a.e.a.f46717j.get()) == null)) {
                                                        d.a(activity);
                                                    }
                                                }
                                                MethodCollector.o(3796);
                                                return;
                                            }
                                        } catch (Exception unused3) {
                                            MethodCollector.o(3796);
                                            return;
                                        }
                                    }
                                    MethodCollector.o(3796);
                                    return;
                                } catch (Throwable th4) {
                                    a.a(th4, d.class);
                                }
                            }
                            MethodCollector.o(3796);
                        } catch (Throwable th5) {
                            a.a(th5, this);
                            MethodCollector.o(3796);
                        }
                    }
                });
                MethodCollector.o(1208);
            } catch (Throwable th) {
                a.a(th, d.class);
                MethodCollector.o(1208);
            }
        }
    }

    static boolean a(String str) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            return f46844a.contains(str);
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    static boolean b(String str) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            return f46845b.contains(str);
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    public static void a(Activity activity) {
        if (!a.a(d.class)) {
            try {
                if (!f46846c.get() || !a.a() || (f46844a.isEmpty() && f46845b.isEmpty())) {
                    e.b(activity);
                } else {
                    e.a(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }
}
