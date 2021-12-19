package com.ss.android.ugc.aweme.qrcode.e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.q;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import javax.net.ssl.HttpsURLConnection;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f119739a;

    static {
        Covode.recordClassIndex(77794);
    }

    public static String a(String str) {
        R r;
        URLConnection uRLConnection;
        g gVar = new g(str);
        String curSecUserId = com.ss.android.ugc.aweme.account.b.g().getCurSecUserId();
        if (!TextUtils.isEmpty(curSecUserId)) {
            gVar.a("sec_uid", curSecUserId);
        }
        try {
            URL url = new URL(gVar.a());
            e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
            if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new com.ss.android.ugc.aweme.net.l.b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new a(r);
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) r;
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setRequestProperty("accept", "*/*");
                    httpURLConnection.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    return httpURLConnection.getHeaderField(q.f30918b);
                }
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new com.ss.android.ugc.aweme.net.l.b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new a((HttpURLConnection) r);
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) r;
                    httpURLConnection2.setRequestMethod("HEAD");
                    httpURLConnection2.setRequestProperty("accept", "*/*");
                    httpURLConnection2.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    return httpURLConnection2.getHeaderField(q.f30918b);
                }
            } else {
                throw m2.f112462e;
            }
            r = uRLConnection;
            HttpURLConnection httpURLConnection22 = (HttpURLConnection) r;
            httpURLConnection22.setRequestMethod("HEAD");
            httpURLConnection22.setRequestProperty("accept", "*/*");
            httpURLConnection22.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection22.setInstanceFollowRedirects(false);
            return httpURLConnection22.getHeaderField(q.f30918b);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("microapp") || str.contains("microgame")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("android_scheme");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = parse.getQueryParameter("ios_scheme");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        try {
            parse = Uri.parse(URLDecoder.decode(str, "UTF8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return queryParameter + "&app_id=" + parse.getQueryParameter("app_id") + "&token=" + parse.getQueryParameter("token") + "&channel=" + parse.getQueryParameter("channel") + "&iid=" + parse.getQueryParameter("iid");
    }
}
