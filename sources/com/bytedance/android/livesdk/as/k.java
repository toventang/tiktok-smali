package com.bytedance.android.livesdk.as;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.a;
import com.ss.ugc.live.sdk.msg.b.d;
import com.ss.ugc.live.sdk.msg.b.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public d f14117a;

    /* renamed from: b  reason: collision with root package name */
    public String f14118b;

    /* renamed from: c  reason: collision with root package name */
    LinkedHashMap<String, String> f14119c = new LinkedHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    LinkedHashMap<String, String> f14120d = new LinkedHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    LinkedHashMap<String, String> f14121e = new LinkedHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public a f14122f;

    /* renamed from: g  reason: collision with root package name */
    public h f14123g;

    /* renamed from: h  reason: collision with root package name */
    private String f14124h = "";

    static {
        Covode.recordClassIndex(7821);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        Objects.requireNonNull(obj, "@Url parameter is null.");
        this.f14124h = obj.toString();
    }

    public final String a(String str) {
        String str2 = this.f14124h;
        if (str2 == null || (!str2.startsWith("http://") && !this.f14124h.startsWith("https://"))) {
            return Uri.parse(str).buildUpon().encodedPath(this.f14124h).build().toString();
        }
        return this.f14124h;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        this.f14119c.put(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e2);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.f14120d.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e2);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.f14121e.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("field param name must not be null.");
    }
}
