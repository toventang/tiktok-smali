package com.google.firebase.installations.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.i;
import com.google.firebase.c.c;
import com.google.firebase.f.h;
import com.google.firebase.installations.b.a;
import com.google.firebase.installations.b.d;
import com.google.firebase.installations.b.e;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f54555a = Pattern.compile("[0-9]+s");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f54556b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private final Context f54557c;

    /* renamed from: d  reason: collision with root package name */
    private final h f54558d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.c.c f54559e;

    public final d a(String str, String str2, String str3, String str4, String str5) {
        int i2 = 0;
        URL url = new URL(a.a("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", a.a("projects/%s/installations", new Object[]{str3})}));
        do {
            HttpURLConnection a2 = a(url, str);
            try {
                a2.setRequestMethod("POST");
                a2.setDoOutput(true);
                if (str5 != null) {
                    a2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                a(a2, a(a(str2, str4)));
                int responseCode = a2.getResponseCode();
                if (responseCode == 200) {
                    d a3 = a(a2);
                    a2.disconnect();
                    return a3;
                }
                a(a2, str4, str, str3);
                if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i2++;
                } else {
                    d a4 = new a.C1244a().a(d.b.BAD_CONFIG).a();
                    a2.disconnect();
                    return a4;
                }
            } finally {
                a2.disconnect();
            }
        } while (i2 <= 1);
        throw new IOException();
    }

    private static byte[] a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public final e a(String str, String str2, String str3, String str4) {
        int i2 = 0;
        URL url = new URL(com.a.a("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", com.a.a("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2})}));
        do {
            HttpURLConnection a2 = a(url, str);
            try {
                a2.setRequestMethod("POST");
                a2.addRequestProperty("Authorization", "FIS_v2 ".concat(String.valueOf(str4)));
                a(a2, a(a()));
                int responseCode = a2.getResponseCode();
                if (responseCode == 200) {
                    e b2 = b(a2);
                    a2.disconnect();
                    return b2;
                }
                a(a2, (String) null, str, str3);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                            i2++;
                        } else {
                            e a3 = e.d().a(e.b.BAD_CONFIG).a();
                            a2.disconnect();
                            return a3;
                        }
                    }
                }
                e a4 = e.d().a(e.b.AUTH_ERROR).a();
                a2.disconnect();
                return a4;
            } finally {
                a2.disconnect();
            }
        } while (i2 <= 1);
        throw new IOException();
    }

    public final HttpURLConnection a(URL url, String str) {
        c.a a2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) a(url);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f54557c.getPackageName());
        com.google.firebase.c.c cVar = this.f54559e;
        if (!(cVar == null || this.f54558d == null || (a2 = cVar.a("fire-installations-id")) == c.a.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f54558d.a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.getCode()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", b());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    static {
        Covode.recordClassIndex(33845);
    }

    private static JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String b() {
        try {
            Context context = this.f54557c;
            byte[] a2 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a2 != null) {
                return i.a(a2);
            }
            this.f54557c.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f54557c.getPackageName();
            return null;
        }
    }

    private static long a(String str) {
        r.b(f54555a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static e b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f54556b));
        e.a d2 = e.d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                d2.a(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                d2.a(a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return d2.a(e.b.OK).a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(java.net.HttpURLConnection r8) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.c.c(java.net.HttpURLConnection):java.lang.String");
    }

    private static d a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f54556b));
        e.a d2 = e.d();
        a.C1244a aVar = new a.C1244a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(StringSet.name)) {
                aVar.a(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                aVar.b(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                aVar.c(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        d2.a(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        d2.a(a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVar.a(d2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVar.a(d.b.OK).a();
    }

    private static URLConnection a(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> m2 = n.f112474e.m(new com.ss.android.ugc.aweme.net.model.e<>(url, null, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
        if (m2.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && m2.f112459b != null) {
            R r = m2.f112459b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
            }
            return aVar2;
        } else if (m2.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || m2.f112462e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m2.f112462e;
        }
    }

    private static JSONObject a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.2");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static void a(URLConnection uRLConnection, byte[] bArr) {
        MethodCollector.i(11928);
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                } catch (IOException unused) {
                    MethodCollector.o(11928);
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
                MethodCollector.o(11928);
            }
        } else {
            IOException iOException = new IOException("Cannot send request to FIS servers. No OutputStream available.");
            MethodCollector.o(11928);
            throw iOException;
        }
    }

    public c(Context context, h hVar, com.google.firebase.c.c cVar) {
        this.f54557c = context;
        this.f54558d = hVar;
        this.f54559e = cVar;
    }

    private static String a(String str, String str2, String str3) {
        String concat;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            concat = "";
        } else {
            concat = ", ".concat(String.valueOf(str));
        }
        objArr[2] = concat;
        return com.a.a("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    public static void a(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(c(httpURLConnection))) {
            a(str, str2, str3);
        }
    }
}
