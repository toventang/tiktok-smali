package com.ss.android.ugc.aweme.shortvideo.reaction.a;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C3386a f129966e = new C3386a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    long f129967c;

    /* renamed from: d  reason: collision with root package name */
    public final String f129968d;

    static {
        Covode.recordClassIndex(85299);
    }

    public void a(int i2, long j2, long j3) {
    }

    public boolean a() {
        return false;
    }

    public abstract String b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a$a  reason: collision with other inner class name */
    public static final class C3386a {
        static {
            Covode.recordClassIndex(85300);
        }

        private C3386a() {
        }

        public /* synthetic */ C3386a(byte b2) {
            this();
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean c2 = c();
        j.f107229h = c2;
        return c2;
    }

    public a(String str) {
        this.f129968d = str;
    }

    public void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        d.a();
        if (d()) {
            b.a("aweme_download_error_rate", 0, new c().a("duration", Long.valueOf(System.currentTimeMillis() - this.f129967c)).a("tools_use_downloader", (Boolean) true).a("from", this.f129968d).a("url", b()).a("cur_url", str).a());
        }
    }

    public void a(Exception exc, String str, Integer num) {
        int i2;
        String c2;
        d.a();
        if (d()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", b());
                jSONObject.put("from", this.f129968d);
                jSONObject.put("tools_use_downloader", true);
                if (exc == null) {
                    c2 = "null exception";
                } else {
                    c2 = m.c(exc);
                }
                jSONObject.put("exception", c2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            b.a("aweme_download_error_rate", 1, jSONObject);
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        com.ss.android.ugc.aweme.app.f.a.a("aweme_movie_download_log", "", str, i2, b(), this.f129968d);
    }
}
