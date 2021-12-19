package com.bytedance.webx.i.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.i.a.a;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static com.bytedance.webx.i.a.a f46067a;

    /* renamed from: e  reason: collision with root package name */
    public static long f46068e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static long f46069f = 1800000;

    /* renamed from: g  reason: collision with root package name */
    public static long f46070g = 1800000;

    /* renamed from: h  reason: collision with root package name */
    private static volatile c f46071h;

    /* renamed from: i  reason: collision with root package name */
    private static ExecutorService f46072i;

    /* renamed from: b  reason: collision with root package name */
    public int f46073b;

    /* renamed from: c  reason: collision with root package name */
    public long f46074c;

    /* renamed from: d  reason: collision with root package name */
    public long f46075d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.webx.i.d.c$c  reason: collision with other inner class name */
    public static class C1146c implements com.bytedance.webx.i.a.a {
        static {
            Covode.recordClassIndex(28165);
        }

        private C1146c() {
        }

        /* synthetic */ C1146c(byte b2) {
            this();
        }

        private static byte[] a(JSONObject jSONObject) {
            String optString = jSONObject.optString("target");
            jSONObject.put("target", "temp_sec_url_tag");
            return jSONObject.toString().replace("temp_sec_url_tag", optString).getBytes("utf-8");
        }

        private static String a(InputStream inputStream) {
            MethodCollector.i(11895);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    String sb2 = sb.toString();
                    MethodCollector.o(11895);
                    return sb2;
                }
            }
        }

        private static URLConnection a(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (m2.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && m2.f112459b != null) {
                R r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new com.ss.android.ugc.aweme.net.l.b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
                }
                return aVar2;
            } else if (m2.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || m2.f112462e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new com.ss.android.ugc.aweme.net.l.b((HttpsURLConnection) openConnection);
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

        private static void a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        private static HttpURLConnection b(String str, JSONObject jSONObject) {
            MethodCollector.i(11893);
            HttpURLConnection httpURLConnection = (HttpURLConnection) a(new URL(str));
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestProperty("Charset", "utf-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(a(jSONObject));
            outputStream.flush();
            outputStream.close();
            MethodCollector.o(11893);
            return httpURLConnection;
        }

        @Override // com.bytedance.webx.i.a.a
        public final String a(String str, JSONObject jSONObject) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            Exception e2;
            InputStream errorStream;
            try {
                httpURLConnection = b(str, jSONObject);
                try {
                    if (httpURLConnection.getResponseCode() == 200) {
                        errorStream = httpURLConnection.getInputStream();
                    } else {
                        errorStream = httpURLConnection.getErrorStream();
                    }
                    String a2 = a(errorStream);
                    a(errorStream, httpURLConnection);
                    return a2;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        String message = e2.getMessage();
                        a((InputStream) null, httpURLConnection);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        a((InputStream) null, httpURLConnection);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                httpURLConnection = null;
                String message2 = e2.getMessage();
                a((InputStream) null, httpURLConnection);
                return message2;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                a((InputStream) null, httpURLConnection);
                throw th;
            }
        }

        @Override // com.bytedance.webx.i.a.a
        public final void a(String str, JSONObject jSONObject, a.AbstractC1144a aVar) {
            HttpURLConnection httpURLConnection;
            Throwable th;
            Exception e2;
            InputStream inputStream;
            try {
                httpURLConnection = b(str, jSONObject);
                try {
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        aVar.a(a(inputStream));
                    } else {
                        inputStream = httpURLConnection.getErrorStream();
                        aVar.b(a(inputStream));
                    }
                    a(inputStream, httpURLConnection);
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        aVar.b(e2.getMessage());
                        a((InputStream) null, httpURLConnection);
                    } catch (Throwable th2) {
                        th = th2;
                        a((InputStream) null, httpURLConnection);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                httpURLConnection = null;
                aVar.b(e2.getMessage());
                a((InputStream) null, httpURLConnection);
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                a((InputStream) null, httpURLConnection);
                throw th;
            }
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(28162);
    }

    class d extends a implements Runnable {
        static {
            Covode.recordClassIndex(28166);
        }

        public final void run() {
            try {
                URL a2 = a();
                if (c.f46067a == null) {
                    c.f46067a = new C1146c((byte) 0);
                }
                c.f46067a.a(a2.toString(), b(), new a.AbstractC1144a() {
                    /* class com.bytedance.webx.i.d.c.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28167);
                    }

                    @Override // com.bytedance.webx.i.a.a.AbstractC1144a
                    public final void b(String str) {
                        d.this.b(str);
                    }

                    @Override // com.bytedance.webx.i.a.a.AbstractC1144a
                    public final void a(String str) {
                        try {
                            d.this.a(d.a(str));
                        } catch (JSONException e2) {
                            d.this.b("source:  " + str + "  case : " + e2.getMessage());
                        }
                    }
                });
            } catch (Exception e2) {
                b(e2.getMessage());
            }
        }

        protected d(d dVar) {
            super(dVar);
        }
    }

    public static c a() {
        MethodCollector.i(11397);
        if (f46071h == null) {
            synchronized (c.class) {
                try {
                    if (f46071h == null) {
                        f46071h = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11397);
                    throw th;
                }
            }
        }
        c cVar = f46071h;
        MethodCollector.o(11397);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        protected final d f46076a;

        static {
            Covode.recordClassIndex(28163);
        }

        protected static URL a() {
            if (com.bytedance.webx.i.a.f46036b.f46060c.endsWith("/")) {
                return new URL(com.bytedance.webx.i.a.f46036b.f46060c + "api/verify/v1");
            }
            return new URL(com.bytedance.webx.i.a.f46036b.f46060c + "/api/verify/v1");
        }

        /* access modifiers changed from: protected */
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", this.f46076a.f46081a);
            jSONObject.put("scene", this.f46076a.f46082b);
            jSONObject.put("ts", this.f46076a.f46084d);
            jSONObject.put("target", this.f46076a.f46083c);
            jSONObject.put("sync", this.f46076a.f46087g);
            if (this.f46076a.f46088h < 3) {
                jSONObject.put("flag", true);
            } else {
                jSONObject.put("flag", false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f46076a.f46081a).append("|").append(this.f46076a.f46082b).append("|").append(this.f46076a.f46083c).append("|").append(this.f46076a.f46084d).append("|").append(this.f46076a.f46085e);
            jSONObject.put("token", com.bytedance.webx.i.e.b.a(sb.toString()));
            return jSONObject;
        }

        protected static b a(String str) {
            JSONObject jSONObject = new JSONObject(str);
            b bVar = new b();
            bVar.f46064b = jSONObject.getInt("risk");
            bVar.f46065c = jSONObject.getBoolean("show_mid_page");
            bVar.f46066d = jSONObject.getLong("safe_duration");
            bVar.f46063a = true;
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.i.d.c.a.b(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        public final void a(b bVar) {
            if (bVar.f46066d > 0) {
                long j2 = bVar.f46066d * 1000;
                com.bytedance.webx.i.b.a a2 = com.bytedance.webx.i.b.a.a();
                if (j2 >= 0 && j2 != com.bytedance.webx.i.b.a.f46052a) {
                    com.bytedance.webx.i.b.a.f46052a = j2;
                    a2.f46054b.edit().putLong("valid_time", j2).apply();
                }
            }
            if (this.f46076a.f46089i != null) {
                this.f46076a.f46089i.a(this.f46076a.f46083c, bVar);
            }
        }

        protected a(d dVar) {
            this.f46076a = dVar;
        }
    }

    class b extends a implements Callable<b> {
        static {
            Covode.recordClassIndex(28164);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public b call() {
            try {
                URL a2 = a();
                if (c.f46067a == null) {
                    c.f46067a = new C1146c((byte) 0);
                }
                String a3 = c.f46067a.a(a2.toString(), b());
                if (TextUtils.isEmpty(a3)) {
                    return new b();
                }
                try {
                    return a(a3);
                } catch (JSONException e2) {
                    b bVar = new b();
                    b("source:  " + a3 + "  case : " + e2.getMessage());
                    return bVar;
                }
            } catch (Exception e3) {
                b bVar2 = new b();
                b(e3.getMessage());
                return bVar2;
            }
        }

        protected b(d dVar) {
            super(dVar);
        }
    }

    public final void a(d dVar) {
        if (f46072i == null) {
            f46072i = Executors.newCachedThreadPool();
        }
        f46072i.execute(new d(dVar));
    }

    public final Future<b> b(d dVar) {
        if (f46072i == null) {
            f46072i = Executors.newCachedThreadPool();
        }
        return f46072i.submit(new b(dVar));
    }
}
