package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.c;
import com.google.android.datatransport.f;
import com.google.firebase.a.a;
import com.google.firebase.b;
import com.google.firebase.messaging.k;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final a f54623a = new com.google.firebase.a.a.a().a(k.b.class, new k.c()).a(k.class, new k.a()).a();

    static {
        Covode.recordClassIndex(33894);
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        try {
            b.d();
            Context a2 = b.d().a();
            SharedPreferences a3 = d.a(a2, "com.google.firebase.messaging", 0);
            if (a3.contains("export_to_big_query")) {
                return a3.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = a2.getPackageManager();
            if (packageManager != null) {
                String packageName = a2.getPackageName();
                if (TextUtils.equals(packageName, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                    if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                        com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    public static Bundle d(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean b(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    static String e(Intent intent) {
        String a2 = a(intent, "from");
        if (a2 == null || !a2.startsWith("/topics/")) {
            return null;
        }
        return a2;
    }

    static int c(Intent intent) {
        Object a2 = a(d(intent), "google.ttl");
        if (a2 instanceof Integer) {
            return ((Integer) a2).intValue();
        }
        if (!(a2 instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) a2);
        } catch (NumberFormatException unused) {
            String.valueOf(String.valueOf(a2)).length();
            return 0;
        }
    }

    public static boolean a(Intent intent) {
        if (intent == null || b(intent)) {
            return false;
        }
        return "1".equals(a(intent, "google.c.a.e"));
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, f<String> fVar) {
        a("_nr", intent);
        if (fVar != null) {
            a("MESSAGE_DELIVERED", intent, fVar);
        }
    }

    public static void a(String str, Intent intent) {
        String str2;
        String a2;
        try {
            Bundle bundle = new Bundle();
            String a3 = a(intent, "google.c.a.c_id");
            if (a3 != null) {
                bundle.putString("_nmid", a3);
            }
            String a4 = a(intent, "google.c.a.c_l");
            if (a4 != null) {
                bundle.putString("_nmn", a4);
            }
            String a5 = a(intent, "google.c.a.m_l");
            if (!TextUtils.isEmpty(a5)) {
                bundle.putString("label", a5);
            }
            String a6 = a(intent, "google.c.a.m_c");
            if (!TextUtils.isEmpty(a6)) {
                bundle.putString("message_channel", a6);
            }
            String e2 = e(intent);
            if (e2 != null) {
                bundle.putString("_nt", e2);
            }
            String a7 = a(intent, "google.c.a.ts");
            if (a7 != null) {
                try {
                    bundle.putInt("_nmt", Integer.parseInt(a7));
                } catch (NumberFormatException unused) {
                }
            }
            if (intent.hasExtra("google.c.a.udt") && (a2 = a(intent, "google.c.a.udt")) != null) {
                try {
                    bundle.putInt("_ndt", Integer.parseInt(a2));
                } catch (NumberFormatException unused2) {
                }
            }
            if (d(intent) == null || !o.a(d(intent))) {
                str2 = "data";
            } else {
                str2 = "display";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(bundle);
                String.valueOf(str).length();
                String.valueOf(valueOf).length();
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) b.d().a(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle);
            }
        } catch (IllegalStateException e3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e3.toString());
                com.bytedance.apm.b.a("firebase_initialize_error", jSONObject, (JSONObject) null, (JSONObject) null);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            e3.printStackTrace();
        }
    }

    private static void a(String str, Intent intent, f<String> fVar) {
        try {
            fVar.a(c.a(f54623a.a(new k.b(new k(str, intent)))));
        } catch (com.google.firebase.a.c unused) {
        }
    }
}
