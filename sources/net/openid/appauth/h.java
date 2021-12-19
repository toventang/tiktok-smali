package net.openid.appauth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.a.d;
import net.openid.appauth.a.e;
import net.openid.appauth.e;
import net.openid.appauth.s;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    Context f159678a;

    /* renamed from: b  reason: collision with root package name */
    public final e f159679b;

    /* renamed from: c  reason: collision with root package name */
    public final net.openid.appauth.a.b f159680c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f159681d;

    /* renamed from: e  reason: collision with root package name */
    private final b f159682e;

    public interface b {
        static {
            Covode.recordClassIndex(106085);
        }

        void a(s sVar, e eVar);
    }

    static {
        Covode.recordClassIndex(106083);
    }

    private void b() {
        if (this.f159681d) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    private c.a a() {
        b();
        androidx.browser.a.b b2 = this.f159679b.b();
        androidx.browser.a.e eVar = null;
        if (b2 != null) {
            androidx.browser.a.e b3 = b2.b();
            if (b3 == null) {
                net.openid.appauth.c.a.c("Failed to create custom tabs session through custom tabs client", new Object[0]);
            } else {
                eVar = b3;
            }
        }
        return new c.a(eVar);
    }

    /* access modifiers changed from: package-private */
    public static class a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        private r f159683a;

        /* renamed from: b  reason: collision with root package name */
        private k f159684b;

        /* renamed from: c  reason: collision with root package name */
        private final net.openid.appauth.b.a f159685c;

        /* renamed from: d  reason: collision with root package name */
        private b f159686d;

        /* renamed from: e  reason: collision with root package name */
        private e f159687e;

        static {
            Covode.recordClassIndex(106084);
        }

        private JSONObject a() {
            Throwable th;
            InputStream inputStream;
            IOException e2;
            JSONException e3;
            MethodCollector.i(12773);
            InputStream inputStream2 = null;
            try {
                HttpURLConnection a2 = this.f159685c.a(this.f159683a.f159717b.f159689b);
                a2.setRequestMethod("POST");
                a2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                if (TextUtils.isEmpty(a2.getRequestProperty("Accept"))) {
                    a2.setRequestProperty("Accept", "application/json");
                }
                a2.setDoOutput(true);
                r rVar = this.f159683a;
                HashMap hashMap = new HashMap();
                hashMap.put("grant_type", rVar.f159719d);
                r.a(hashMap, "redirect_uri", rVar.f159720e);
                r.a(hashMap, "code", rVar.f159721f);
                r.a(hashMap, "refresh_token", rVar.f159723h);
                r.a(hashMap, "code_verifier", rVar.f159724i);
                r.a(hashMap, "scope", rVar.f159722g);
                for (Map.Entry<String, String> entry : rVar.f159725j.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                Map<String, String> a3 = this.f159684b.a(this.f159683a.f159718c);
                if (a3 != null) {
                    hashMap.putAll(a3);
                }
                String a4 = net.openid.appauth.c.b.a(hashMap);
                a2.setRequestProperty("Content-Length", String.valueOf(a4.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a2.getOutputStream());
                outputStreamWriter.write(a4);
                outputStreamWriter.flush();
                if (a2.getResponseCode() < 200 || a2.getResponseCode() >= 300) {
                    inputStream = a2.getErrorStream();
                } else {
                    inputStream = a2.getInputStream();
                }
                try {
                    JSONObject jSONObject = new JSONObject(t.a(inputStream));
                    t.b(inputStream);
                    MethodCollector.o(12773);
                    return jSONObject;
                } catch (IOException e4) {
                    e2 = e4;
                    net.openid.appauth.c.a.a(e2, "Failed to complete exchange request", new Object[0]);
                    this.f159687e = e.fromTemplate(e.b.f159619d, e2);
                    t.b(inputStream);
                    MethodCollector.o(12773);
                    return null;
                } catch (JSONException e5) {
                    e3 = e5;
                    try {
                        net.openid.appauth.c.a.a(e3, "Failed to complete exchange request", new Object[0]);
                        this.f159687e = e.fromTemplate(e.b.f159621f, e3);
                        t.b(inputStream);
                        MethodCollector.o(12773);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                    t.b(inputStream2);
                    MethodCollector.o(12773);
                    throw th;
                }
            } catch (IOException e6) {
                e2 = e6;
                inputStream = null;
                net.openid.appauth.c.a.a(e2, "Failed to complete exchange request", new Object[0]);
                this.f159687e = e.fromTemplate(e.b.f159619d, e2);
                t.b(inputStream);
                MethodCollector.o(12773);
                return null;
            } catch (JSONException e7) {
                e3 = e7;
                inputStream = null;
                net.openid.appauth.c.a.a(e3, "Failed to complete exchange request", new Object[0]);
                this.f159687e = e.fromTemplate(e.b.f159621f, e3);
                t.b(inputStream);
                MethodCollector.o(12773);
                return null;
            } catch (Throwable th4) {
                th = th4;
                t.b(inputStream2);
                MethodCollector.o(12773);
                throw th;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ JSONObject doInBackground(Void[] voidArr) {
            return a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(JSONObject jSONObject) {
            e eVar;
            Uri uri;
            JSONObject jSONObject2 = jSONObject;
            e eVar2 = this.f159687e;
            if (eVar2 != null) {
                this.f159686d.a(null, eVar2);
            } else if (jSONObject2.has("error")) {
                try {
                    String string = jSONObject2.getString("error");
                    e eVar3 = e.c.f159632i.get(string);
                    if (eVar3 == null) {
                        eVar3 = e.c.f159631h;
                    }
                    String optString = jSONObject2.optString("error_description", null);
                    String optString2 = jSONObject2.optString("error_uri");
                    if (optString2 == null) {
                        uri = null;
                    } else {
                        uri = Uri.parse(optString2);
                    }
                    eVar = e.fromOAuthTemplate(eVar3, string, optString, uri);
                } catch (JSONException e2) {
                    eVar = e.fromTemplate(e.b.f159621f, e2);
                }
                this.f159686d.a(null, eVar);
            } else {
                try {
                    s.a aVar = new s.a(this.f159683a);
                    aVar.f159745b = p.b(n.a(jSONObject2, "token_type"), "token type must not be empty if defined");
                    aVar.f159746c = p.b(n.b(jSONObject2, "access_token"), "access token cannot be empty if specified");
                    aVar.f159747d = n.e(jSONObject2, "expires_at");
                    if (jSONObject2.has("expires_in")) {
                        Long valueOf = Long.valueOf(jSONObject2.getLong("expires_in"));
                        q qVar = q.f159715a;
                        if (valueOf == null) {
                            aVar.f159747d = null;
                        } else {
                            aVar.f159747d = Long.valueOf(qVar.a() + TimeUnit.SECONDS.toMillis(valueOf.longValue()));
                        }
                    }
                    aVar.f159749f = p.b(n.b(jSONObject2, "refresh_token"), "refresh token must not be empty if defined");
                    aVar.f159748e = p.b(n.b(jSONObject2, "id_token"), "id token must not be empty if defined");
                    String b2 = n.b(jSONObject2, "scope");
                    if (TextUtils.isEmpty(b2)) {
                        aVar.f159750g = null;
                    } else {
                        String[] split = b2.split(" +");
                        if (split == null) {
                            split = new String[0];
                        }
                        aVar.f159750g = c.a(Arrays.asList(split));
                    }
                    Set<String> set = s.f159735a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!set.contains(next)) {
                            linkedHashMap.put(next, jSONObject2.get(next).toString());
                        }
                    }
                    aVar.f159751h = a.a(linkedHashMap, s.f159735a);
                    s sVar = new s(aVar.f159744a, aVar.f159745b, aVar.f159746c, aVar.f159747d, aVar.f159748e, aVar.f159749f, aVar.f159750g, aVar.f159751h);
                    net.openid.appauth.c.a.a("Token exchange with %s completed", this.f159683a.f159717b.f159689b);
                    this.f159686d.a(sVar, null);
                } catch (JSONException e3) {
                    this.f159686d.a(null, e.fromTemplate(e.b.f159621f, e3));
                }
            }
        }

        a(r rVar, k kVar, net.openid.appauth.b.a aVar, b bVar) {
            this.f159683a = rVar;
            this.f159684b = kVar;
            this.f159685c = aVar;
            this.f159686d = bVar;
        }
    }

    public h(Context context) {
        this(context, b.f159585a);
    }

    public final Intent a(f fVar) {
        return a(fVar, a().a());
    }

    public final void a(r rVar, b bVar) {
        a(rVar, o.f159714a, bVar);
    }

    private h(Context context, b bVar) {
        this(context, bVar, d.a(context), new net.openid.appauth.a.e(context));
    }

    private Intent a(f fVar, c cVar) {
        Intent intent;
        b();
        if (this.f159680c != null) {
            Uri a2 = fVar.a();
            if (this.f159680c.f159578d.booleanValue()) {
                intent = cVar.f1776a;
            } else {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.setPackage(this.f159680c.f159575a);
            intent.setData(a2);
            net.openid.appauth.c.a.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f159680c.f159578d.toString());
            net.openid.appauth.c.a.a("Initiating authorization request to %s", fVar.f159634b.f159688a);
            Intent a3 = AuthorizationManagementActivity.a(this.f159678a);
            a3.putExtra("authIntent", intent);
            a3.putExtra("authRequest", fVar.b().toString());
            a3.putExtra("completeIntent", (Parcelable) null);
            a3.putExtra("cancelIntent", (Parcelable) null);
            return a3;
        }
        throw new ActivityNotFoundException();
    }

    public final void a(r rVar, k kVar, b bVar) {
        b();
        net.openid.appauth.c.a.a("Initiating code exchange request to %s", rVar.f159717b.f159689b);
        new a(rVar, kVar, this.f159682e.f159587c, bVar).execute(new Void[0]);
    }

    private h(Context context, b bVar, net.openid.appauth.a.b bVar2, net.openid.appauth.a.e eVar) {
        this.f159678a = (Context) p.a(context);
        this.f159682e = bVar;
        this.f159679b = eVar;
        this.f159680c = bVar2;
        if (bVar2 != null && bVar2.f159578d.booleanValue()) {
            eVar.a(bVar2.f159575a);
        }
    }
}
