package com.facebook;

import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class r {

    /* renamed from: g  reason: collision with root package name */
    private static final String f49015g = r.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f49016a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f49017b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f49018c;

    /* renamed from: d  reason: collision with root package name */
    public final FacebookRequestError f49019d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49020e;

    /* renamed from: f  reason: collision with root package name */
    public final GraphRequest f49021f;

    static {
        Covode.recordClassIndex(29528);
    }

    public String toString() {
        String str;
        int i2;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f49016a;
            if (httpURLConnection != null) {
                i2 = httpURLConnection.getResponseCode();
            } else {
                i2 = 200;
            }
            objArr[0] = Integer.valueOf(i2);
            str = a.a(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.f49017b + ", error: " + this.f49019d + "}";
    }

    static List<r> a(HttpURLConnection httpURLConnection, q qVar) {
        InputStream inputStream;
        Closeable closeable = null;
        try {
            if (m.b()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                String a2 = ad.a(closeable);
                w.a(u.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a2.length()), a2);
                List<r> a3 = a(httpURLConnection, qVar, new JSONTokener(a2).nextValue());
                w.a(u.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", qVar.f49012d, Integer.valueOf(a2.length()), a3);
                return a3;
            }
            throw new j("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (j e2) {
            w.a(u.REQUESTS, "Response", "Response <Error>: %s", e2);
            return a(qVar, httpURLConnection, e2);
        } catch (Exception e3) {
            w.a(u.REQUESTS, "Response", "Response <Error>: %s", e3);
            return a(qVar, httpURLConnection, new j(e3));
        } finally {
            ad.a(closeable);
        }
    }

    private r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    static List<r> a(List<GraphRequest> list, HttpURLConnection httpURLConnection, j jVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new r(list.get(i2), httpURLConnection, new FacebookRequestError(httpURLConnection, jVar)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.r> a(java.net.HttpURLConnection r24, java.util.List<com.facebook.GraphRequest> r25, java.lang.Object r26) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.r.a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    private r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    private r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    private r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f49021f = graphRequest;
        this.f49016a = httpURLConnection;
        this.f49020e = str;
        this.f49017b = jSONObject;
        this.f49018c = jSONArray;
        this.f49019d = facebookRequestError;
    }
}
