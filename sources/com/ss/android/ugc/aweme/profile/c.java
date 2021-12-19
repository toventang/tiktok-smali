package com.ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: k  reason: collision with root package name */
    private static c f116052k;

    /* renamed from: a  reason: collision with root package name */
    public int f116053a = 11;

    /* renamed from: b  reason: collision with root package name */
    public Keva f116054b = Keva.getRepo("ug_coupon_repo");

    /* renamed from: c  reason: collision with root package name */
    private final String f116055c = "ug_coupon_repo";

    /* renamed from: d  reason: collision with root package name */
    private final String f116056d = "show_bubble";

    /* renamed from: e  reason: collision with root package name */
    private final String f116057e = "show_bar";

    /* renamed from: f  reason: collision with root package name */
    private final String f116058f = "show_star";

    /* renamed from: g  reason: collision with root package name */
    private final String f116059g = "show_bar_time";

    /* renamed from: h  reason: collision with root package name */
    private DateFormat f116060h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: i  reason: collision with root package name */
    private String f116061i = c.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    private int f116062j = 24;

    static {
        Covode.recordClassIndex(74869);
    }

    public final boolean b() {
        if (!this.f116054b.getBoolean("show_bubble", true)) {
            return true;
        }
        return false;
    }

    public final int c() {
        return this.f116054b.getInt("show_bar_time", 0);
    }

    public final boolean e() {
        if (c() >= this.f116053a) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f116054b.storeInt("show_bar_time", this.f116054b.getInt("show_bar_time", 0) + 1);
    }

    public final void f() {
        if (!this.f116054b.getBoolean("show_star", false)) {
            this.f116054b.storeBoolean("show_star", false);
        }
    }

    public static c a() {
        MethodCollector.i(8880);
        if (f116052k == null) {
            synchronized (c.class) {
                try {
                    if (f116052k == null) {
                        f116052k = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8880);
                    throw th;
                }
            }
        }
        c cVar = f116052k;
        MethodCollector.o(8880);
        return cVar;
    }

    public final boolean g() {
        if (!this.f116054b.contains("show_bubble")) {
            return false;
        }
        if (!this.f116054b.contains("show_star") || !this.f116054b.getBoolean("show_star", false)) {
            return true;
        }
        return false;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f116054b.storeString(jSONObject.getString("activity_id"), this.f116060h.format(new Date()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void b(boolean z) {
        if (z || !this.f116054b.getBoolean("show_bar", false)) {
            this.f116054b.storeBoolean("show_bar", z);
        }
    }

    public final void a(boolean z) {
        if (z || !this.f116054b.getBoolean("show_bubble", false)) {
            this.f116054b.storeBoolean("show_bubble", z);
        }
    }

    public final boolean a(String str, int i2) {
        String string = this.f116054b.getString(str, "");
        if (!TextUtils.equals(string, "")) {
            try {
                if ((new Date().getTime() - this.f116060h.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i2)) {
                    return true;
                }
                return false;
            } catch (ParseException e2) {
                e2.printStackTrace();
                this.f116054b.storeString(str, "");
            }
        }
        return false;
    }
}
