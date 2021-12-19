package com.ss.android.ugc.aweme.main.replace;

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

    /* renamed from: c  reason: collision with root package name */
    public static final C2800a f109281c = new C2800a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    long f109282a;

    /* renamed from: b  reason: collision with root package name */
    public final String f109283b;

    static {
        Covode.recordClassIndex(69997);
    }

    public abstract String a();

    public void a(int i2, long j2, long j3) {
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.a$a  reason: collision with other inner class name */
    public static final class C2800a {
        static {
            Covode.recordClassIndex(69998);
        }

        private C2800a() {
        }

        public /* synthetic */ C2800a(byte b2) {
            this();
        }
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean c() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean b2 = b();
        j.f107229h = b2;
        return b2;
    }

    public a(String str) {
        this.f109283b = str;
    }

    public void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        d.a();
        if (c()) {
            b.a("aweme_download_error_rate", 0, new c().a("duration", Long.valueOf(System.currentTimeMillis() - this.f109282a)).a("tools_use_downloader", (Boolean) true).a("from", this.f109283b).a("url", a()).a("cur_url", str).a());
        }
    }

    public void a(Exception exc, String str, Integer num) {
        int i2;
        String c2;
        d.a();
        if (c()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", a());
                jSONObject.put("from", this.f109283b);
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
        com.ss.android.ugc.aweme.app.f.a.a("aweme_movie_download_log", "", str, i2, a(), this.f109283b);
    }
}
