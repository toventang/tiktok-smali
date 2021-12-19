package com.ss.android.ugc.aweme.net.l;

import android.os.Build;
import android.util.Pair;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.gn;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f112443a;

    /* renamed from: b  reason: collision with root package name */
    public int f112444b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f112445c;

    /* renamed from: d  reason: collision with root package name */
    public final long f112446d = gn.f143021a.incrementAndGet();

    /* renamed from: e  reason: collision with root package name */
    private final HttpsURLConnection f112447e;

    static {
        Covode.recordClassIndex(72259);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f112447e.connect();
    }

    public final void disconnect() {
        this.f112447e.disconnect();
    }

    public final boolean getAllowUserInteraction() {
        return this.f112447e.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        return this.f112447e.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.f112447e.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.f112447e.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f112447e.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f112447e.getDoOutput();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f112447e.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.f112447e.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f112447e.getInstanceFollowRedirects();
    }

    public final Certificate[] getLocalCertificates() {
        return this.f112447e.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.f112447e.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f112447e.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f112447e.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f112447e.getPermission();
    }

    public final int getReadTimeout() {
        return this.f112447e.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f112447e.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f112447e.getRequestProperties();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f112447e.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f112447e.getServerCertificates();
    }

    public final URL getURL() {
        return this.f112447e.getURL();
    }

    public final boolean getUseCaches() {
        return this.f112447e.getUseCaches();
    }

    public final String toString() {
        return this.f112447e.toString();
    }

    public final boolean usingProxy() {
        return this.f112447e.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (this.f112444b != -1) {
            return this.f112445c;
        }
        return this.f112447e.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        if (this.f112444b != -1) {
            return new HashMap();
        }
        return this.f112447e.getHeaderFields();
    }

    public final boolean a() {
        Object invoke;
        try {
            Reflect field = Reflect.on(this.f112447e).field("delegate", new Class[0]).field("httpEngine", new Class[0]);
            Method exactMethod = field.exactMethod("hasResponse", new Class[0], new Object[0]);
            Object obj = field.get();
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a2 = a.a(exactMethod, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_net_wrapper_HttpsURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = exactMethod.invoke(obj, objArr);
                a.a(invoke, exactMethod, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_net_wrapper_HttpsURLConnectionWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return ((Boolean) invoke).booleanValue();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return true;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return true;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final InputStream getErrorStream() {
        MethodCollector.i(1732);
        if (this.f112444b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f112445c.getBytes());
            MethodCollector.o(1732);
            return byteArrayInputStream;
        }
        e<HttpURLConnection, InputStream> g2 = n.f112474e.g(new e<>(this, null, null, d.CONTINUE));
        if (g2.f112463f == d.INTERCEPT && g2.f112459b != null) {
            R r = g2.f112459b;
            MethodCollector.o(1732);
            return r;
        } else if (g2.f112463f != d.EXCEPTION || g2.f112462e == null) {
            g2.f112459b = (R) this.f112447e.getErrorStream();
            e<HttpURLConnection, InputStream> h2 = n.f112474e.h(g2);
            if (h2.f112463f != d.EXCEPTION || h2.f112462e == null) {
                R r2 = h2.f112459b;
                MethodCollector.o(1732);
                return r2;
            }
            RuntimeException runtimeException = h2.f112462e;
            MethodCollector.o(1732);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = g2.f112462e;
            MethodCollector.o(1732);
            throw runtimeException2;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        MethodCollector.i(1737);
        if (this.f112444b != -1) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f112445c.getBytes());
            MethodCollector.o(1737);
            return byteArrayInputStream;
        }
        e<HttpURLConnection, InputStream> e2 = n.f112474e.e(new e<>(this, null, null, d.CONTINUE));
        if (e2.f112463f == d.INTERCEPT && e2.f112459b != null) {
            R r = e2.f112459b;
            MethodCollector.o(1737);
            return r;
        } else if (e2.f112463f != d.EXCEPTION || e2.f112462e == null) {
            e2.f112459b = (R) this.f112447e.getInputStream();
            e<HttpURLConnection, InputStream> f2 = n.f112474e.f(e2);
            if (f2.f112463f != d.EXCEPTION || f2.f112462e == null) {
                R r2 = f2.f112459b;
                MethodCollector.o(1737);
                return r2;
            }
            RuntimeException runtimeException = f2.f112462e;
            MethodCollector.o(1737);
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = e2.f112462e;
            MethodCollector.o(1737);
            throw runtimeException2;
        }
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        int i2 = this.f112444b;
        if (i2 != -1) {
            return i2;
        }
        e<HttpURLConnection, Integer> i3 = n.f112474e.i(new e<>(this, null, null, d.CONTINUE));
        if (i3.f112463f == d.INTERCEPT && i3.f112459b != null) {
            return i3.f112459b.intValue();
        }
        if (i3.f112463f != d.EXCEPTION || i3.f112462e == null) {
            i3.f112459b = (R) Integer.valueOf(this.f112447e.getResponseCode());
            e<HttpURLConnection, Integer> j2 = n.f112474e.j(i3);
            if (j2.f112463f != d.EXCEPTION || j2.f112462e == null) {
                return j2.f112459b.intValue();
            }
            throw j2.f112462e;
        }
        throw i3.f112462e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i2) {
        return this.f112447e.getHeaderField(i2);
    }

    public final String getHeaderFieldKey(int i2) {
        return this.f112447e.getHeaderFieldKey(i2);
    }

    public final String getRequestProperty(String str) {
        return this.f112447e.getRequestProperty(str);
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f112447e.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i2) {
        this.f112447e.setChunkedStreamingMode(i2);
    }

    public final void setConnectTimeout(int i2) {
        this.f112447e.setConnectTimeout(i2);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f112447e.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f112447e.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f112447e.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i2) {
        this.f112447e.setFixedLengthStreamingMode(i2);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f112447e.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j2) {
        this.f112447e.setIfModifiedSince(j2);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f112447e.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i2) {
        this.f112447e.setReadTimeout(i2);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f112447e.setRequestMethod(str);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f112447e.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z) {
        this.f112447e.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (this.f112444b != -1) {
            return "";
        }
        return this.f112447e.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        int i2 = Build.VERSION.SDK_INT;
        this.f112447e.setFixedLengthStreamingMode(j2);
    }

    public b(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.f112443a = httpsURLConnection.getClass().getName().contains("Cronet");
        this.f112447e = httpsURLConnection;
    }

    public final int getHeaderFieldInt(String str, int i2) {
        if (this.f112444b != -1) {
            return i2;
        }
        return this.f112447e.getHeaderFieldInt(str, i2);
    }

    public final long getHeaderFieldLong(String str, long j2) {
        if (this.f112444b == -1 && Build.VERSION.SDK_INT >= 24) {
            return this.f112447e.getHeaderFieldLong(str, j2);
        }
        return j2;
    }

    public final void addRequestProperty(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            e<HttpURLConnection, InputStream> l2 = n.f112474e.l(new e<>(this, null, jSONObject, d.CONTINUE));
            if (l2.f112463f != d.DROP) {
                if (l2.f112463f != d.EXCEPTION || l2.f112462e == null) {
                    if (l2.f112461d != null) {
                        str = l2.f112461d.optString("key", str);
                        str2 = l2.f112461d.optString("value", str2);
                    }
                    this.f112447e.addRequestProperty(str, str2);
                    return;
                }
                throw l2.f112462e;
            }
        } catch (JSONException e2) {
            eo.a(e2, "HttpURLConnection.addRequestProperty");
        }
    }

    public final void setRequestProperty(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            e<HttpURLConnection, InputStream> k2 = n.f112474e.k(new e<>(this, null, jSONObject, d.CONTINUE));
            if (k2.f112463f != d.DROP) {
                if (k2.f112463f != d.EXCEPTION || k2.f112462e == null) {
                    if (k2.f112461d != null) {
                        str = k2.f112461d.optString("key", str);
                        str2 = k2.f112461d.optString("value", str2);
                    }
                    this.f112447e.setRequestProperty(str, str2);
                    return;
                }
                throw k2.f112462e;
            }
        } catch (JSONException e2) {
            eo.a(e2, "HttpURLConnection.setRequestProperty");
        }
    }
}
