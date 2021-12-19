package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.a.h;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.b;
import com.facebook.j;
import com.facebook.m;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final String f46914f = a.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    public String f46915a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f46916b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f46917c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f46918d;

    /* renamed from: e  reason: collision with root package name */
    public String f46919e;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f46920g;

    /* renamed from: com.facebook.applinks.a$a  reason: collision with other inner class name */
    public interface AbstractC1163a {
        static {
            Covode.recordClassIndex(28557);
        }

        void a(a aVar);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(28555);
    }

    private static JSONObject a(Uri uri) {
        if (com.facebook.internal.a.b.a.a(a.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i2 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            bundleArr[i2] = a(jSONArray.getJSONObject(i2));
                            i2++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            strArr[i2] = jSONArray.get(i2).toString();
                            i2++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new j("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    static a a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                a aVar = new a();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                aVar.f46917c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    aVar.f46915a = aVar.f46917c.getString("ref");
                } else if (aVar.f46917c.has("referer_data")) {
                    JSONObject jSONObject3 = aVar.f46917c.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        aVar.f46915a = jSONObject3.getString("fb_ref");
                    }
                }
                if (aVar.f46917c.has("target_url")) {
                    Uri parse = Uri.parse(aVar.f46917c.getString("target_url"));
                    aVar.f46916b = parse;
                    aVar.f46920g = a(parse);
                }
                if (aVar.f46917c.has("extras")) {
                    JSONObject jSONObject4 = aVar.f46917c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            aVar.f46919e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                aVar.f46918d = a(aVar.f46917c);
                return aVar;
            }
        } catch (JSONException unused) {
            ad.d(f46914f);
        } catch (j unused2) {
            ad.d(f46914f);
        }
        return null;
    }

    public static void a(Context context, final AbstractC1163a aVar) {
        ae.a((Object) context, "context");
        ae.a(aVar, "completionHandler");
        final String a2 = ad.a(context);
        ae.a((Object) a2, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        m.c().execute(new Runnable() {
            /* class com.facebook.applinks.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28556);
            }

            public final void run() {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        Context context = applicationContext;
                        String str = a2;
                        AbstractC1163a aVar = aVar;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("event", "DEFERRED_APP_LINK");
                            ad.a(jSONObject, b.a(context), h.a(context), m.c(context));
                            ae.a();
                            ad.a(jSONObject, m.f48921g);
                            jSONObject.put("application_package_name", context.getPackageName());
                            a aVar2 = null;
                            JSONObject jSONObject2 = GraphRequest.a(GraphRequest.a((AccessToken) null, com.a.a("%s/activities", new Object[]{str}), jSONObject, (GraphRequest.b) null)).f49017b;
                            if (jSONObject2 != null) {
                                String optString = jSONObject2.optString("applink_args");
                                long optLong = jSONObject2.optLong("click_time", -1);
                                String optString2 = jSONObject2.optString("applink_class");
                                String optString3 = jSONObject2.optString("applink_url");
                                if (!TextUtils.isEmpty(optString) && (aVar2 = a.a(optString)) != null) {
                                    if (optLong != -1) {
                                        try {
                                            if (aVar2.f46917c != null) {
                                                aVar2.f46917c.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                            }
                                            if (aVar2.f46918d != null) {
                                                aVar2.f46918d.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                            }
                                        } catch (JSONException unused) {
                                        }
                                    }
                                    if (optString2 != null) {
                                        try {
                                            if (aVar2.f46917c != null) {
                                                aVar2.f46917c.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                            }
                                            if (aVar2.f46918d != null) {
                                                aVar2.f46918d.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                            }
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                    if (optString3 != null) {
                                        try {
                                            if (aVar2.f46917c != null) {
                                                aVar2.f46917c.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                            }
                                            if (aVar2.f46918d != null) {
                                                aVar2.f46918d.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                            }
                                        } catch (Exception unused3) {
                                        }
                                    }
                                }
                            }
                            aVar.a(aVar2);
                        } catch (JSONException e2) {
                            throw new j("An error occurred while preparing deferred app link", e2);
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        });
    }
}
