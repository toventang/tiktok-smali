package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class aq {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f54424a;

    /* renamed from: b  reason: collision with root package name */
    final Context f54425b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f54426c = new androidx.c.a();

    static {
        Covode.recordClassIndex(33786);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final long f54427a = TimeUnit.DAYS.toMillis(7);

        /* renamed from: b  reason: collision with root package name */
        final String f54428b;

        /* renamed from: c  reason: collision with root package name */
        final String f54429c;

        /* renamed from: d  reason: collision with root package name */
        final long f54430d;

        static {
            Covode.recordClassIndex(33787);
        }

        static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String.valueOf(String.valueOf(e2)).length();
                return null;
            }
        }

        private a(String str, String str2, long j2) {
            this.f54428b = str;
            this.f54429c = str2;
            this.f54430d = j2;
        }

        static String a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String.valueOf(String.valueOf(e2)).length();
                return null;
            }
        }
    }

    private synchronized boolean b() {
        boolean isEmpty;
        MethodCollector.i(12313);
        isEmpty = this.f54424a.getAll().isEmpty();
        MethodCollector.o(12313);
        return isEmpty;
    }

    public final synchronized void a() {
        MethodCollector.i(12315);
        this.f54426c.clear();
        this.f54424a.edit().clear().commit();
        MethodCollector.o(12315);
    }

    private long d(String str) {
        String string = this.f54424a.getString(a(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public aq(Context context) {
        File a2;
        this.f54425b = context;
        this.f54424a = d.a(context, "com.google.android.gms.appid", 0);
        if (Build.VERSION.SDK_INT >= 21) {
            a2 = context.getNoBackupFilesDir();
        } else {
            a2 = b.a(new File(context.getApplicationInfo().dataDir, "no_backup"));
        }
        File file = new File(a2, "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !b()) {
                    a();
                    FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        new String("Error creating file in no backup dir: ");
                    }
                }
            }
        }
    }

    public final synchronized long a(String str) {
        MethodCollector.i(12455);
        Long l2 = this.f54426c.get(str);
        if (l2 != null) {
            long longValue = l2.longValue();
            MethodCollector.o(12455);
            return longValue;
        }
        long d2 = d(str);
        MethodCollector.o(12455);
        return d2;
    }

    public final synchronized long b(String str) {
        long currentTimeMillis;
        MethodCollector.i(12584);
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f54424a.contains(a(str, "cre"))) {
            SharedPreferences.Editor edit = this.f54424a.edit();
            edit.putString(a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = d(str);
        }
        this.f54426c.put(str, Long.valueOf(currentTimeMillis));
        MethodCollector.o(12584);
        return currentTimeMillis;
    }

    public final synchronized void c(String str) {
        MethodCollector.i(12692);
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f54424a.edit();
        for (String str2 : this.f54424a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
        MethodCollector.o(12692);
    }

    private static String a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    public final synchronized a a(String str, String str2, String str3) {
        a a2;
        MethodCollector.i(12452);
        a2 = a.a(this.f54424a.getString(c(str, str2, str3), null));
        MethodCollector.o(12452);
        return a2;
    }

    private static String c(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    public final synchronized void b(String str, String str2, String str3) {
        MethodCollector.i(12454);
        String c2 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f54424a.edit();
        edit.remove(c2);
        edit.commit();
        MethodCollector.o(12454);
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        MethodCollector.i(12453);
        String a2 = a.a(str4, str5, System.currentTimeMillis());
        if (a2 == null) {
            MethodCollector.o(12453);
            return;
        }
        SharedPreferences.Editor edit = this.f54424a.edit();
        edit.putString(c(str, str2, str3), a2);
        edit.commit();
        MethodCollector.o(12453);
    }
}
