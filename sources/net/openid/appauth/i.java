package net.openid.appauth;

import android.net.Uri;
import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import net.openid.appauth.e;
import net.openid.appauth.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f159688a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f159689b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f159690c;

    /* renamed from: d  reason: collision with root package name */
    public final j f159691d;

    public interface b {
        static {
            Covode.recordClassIndex(106088);
        }

        void a(i iVar, e eVar);
    }

    static {
        Covode.recordClassIndex(106086);
    }

    public static class a extends AsyncTask<Void, Void, i> {

        /* renamed from: a  reason: collision with root package name */
        private Uri f159692a;

        /* renamed from: b  reason: collision with root package name */
        private net.openid.appauth.b.a f159693b;

        /* renamed from: c  reason: collision with root package name */
        private b f159694c;

        /* renamed from: d  reason: collision with root package name */
        private e f159695d;

        static {
            Covode.recordClassIndex(106087);
        }

        private i a() {
            InputStream inputStream;
            Throwable th;
            IOException e2;
            JSONException e3;
            j.a e4;
            try {
                HttpURLConnection a2 = this.f159693b.a(this.f159692a);
                a2.setRequestMethod("GET");
                a2.setDoInput(true);
                a2.connect();
                inputStream = a2.getInputStream();
                try {
                    i iVar = new i(new j(new JSONObject(t.a(inputStream))));
                    t.b(inputStream);
                    return iVar;
                } catch (IOException e5) {
                    e2 = e5;
                    net.openid.appauth.c.a.b(e2, "Network error when retrieving discovery document", new Object[0]);
                    this.f159695d = e.fromTemplate(e.b.f159619d, e2);
                    t.b(inputStream);
                    return null;
                } catch (JSONException e6) {
                    e3 = e6;
                    net.openid.appauth.c.a.b(e3, "Error parsing discovery document", new Object[0]);
                    this.f159695d = e.fromTemplate(e.b.f159621f, e3);
                    t.b(inputStream);
                    return null;
                } catch (j.a e7) {
                    e4 = e7;
                    try {
                        net.openid.appauth.c.a.b(e4, "Malformed discovery document", new Object[0]);
                        this.f159695d = e.fromTemplate(e.b.f159616a, e4);
                        t.b(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException e8) {
                e2 = e8;
                inputStream = null;
                net.openid.appauth.c.a.b(e2, "Network error when retrieving discovery document", new Object[0]);
                this.f159695d = e.fromTemplate(e.b.f159619d, e2);
                t.b(inputStream);
                return null;
            } catch (JSONException e9) {
                e3 = e9;
                inputStream = null;
                net.openid.appauth.c.a.b(e3, "Error parsing discovery document", new Object[0]);
                this.f159695d = e.fromTemplate(e.b.f159621f, e3);
                t.b(inputStream);
                return null;
            } catch (j.a e10) {
                e4 = e10;
                inputStream = null;
                net.openid.appauth.c.a.b(e4, "Malformed discovery document", new Object[0]);
                this.f159695d = e.fromTemplate(e.b.f159616a, e4);
                t.b(inputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                t.b(inputStream);
                throw th;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ i doInBackground(Void[] voidArr) {
            return a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(i iVar) {
            i iVar2 = iVar;
            e eVar = this.f159695d;
            if (eVar != null) {
                this.f159694c.a(null, eVar);
            } else {
                this.f159694c.a(iVar2, null);
            }
        }

        public a(Uri uri, net.openid.appauth.b.a aVar, b bVar) {
            this.f159692a = uri;
            this.f159693b = aVar;
            this.f159694c = bVar;
        }
    }

    public i(j jVar) {
        p.a(jVar, "docJson cannot be null");
        this.f159691d = jVar;
        this.f159688a = (Uri) jVar.a(j.f159697b);
        this.f159689b = (Uri) jVar.a(j.f159698c);
        this.f159690c = (Uri) jVar.a(j.f159701f);
    }

    public static i a(JSONObject jSONObject) {
        p.a(jSONObject, "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new i(new j(jSONObject.optJSONObject("discoveryDoc")));
            } catch (j.a e2) {
                throw new JSONException("Missing required field in discovery doc: " + e2.getMissingField());
            }
        } else {
            p.a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            p.a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new i(n.c(jSONObject, "authorizationEndpoint"), n.c(jSONObject, "tokenEndpoint"), n.d(jSONObject, "registrationEndpoint"));
        }
    }

    public i(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    private i(Uri uri, Uri uri2, Uri uri3) {
        this.f159688a = (Uri) p.a(uri);
        this.f159689b = (Uri) p.a(uri2);
        this.f159690c = uri3;
        this.f159691d = null;
    }
}
