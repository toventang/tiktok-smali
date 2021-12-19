package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.push.window.oppo.c;
import com.ss.android.pushmanager.a.a;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.awemepushlib.interaction.f;
import com.ss.android.ugc.awemepushlib.interaction.i;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private static volatile a r;
    private static final SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    private static int u = 0;
    private static boolean v = false;

    /* renamed from: a  reason: collision with root package name */
    public String f145499a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f145500b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f145501c;

    /* renamed from: d  reason: collision with root package name */
    public String f145502d;

    /* renamed from: e  reason: collision with root package name */
    public long f145503e;

    /* renamed from: f  reason: collision with root package name */
    public int f145504f;

    /* renamed from: g  reason: collision with root package name */
    public int f145505g;

    /* renamed from: h  reason: collision with root package name */
    public int f145506h;

    /* renamed from: i  reason: collision with root package name */
    protected com.ss.android.pushmanager.a.a f145507i;

    /* renamed from: j  reason: collision with root package name */
    public int f145508j;

    /* renamed from: k  reason: collision with root package name */
    public int f145509k;

    /* renamed from: l  reason: collision with root package name */
    public int f145510l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f145511m;
    public int n;
    private int o = -1;
    private volatile boolean p;
    private volatile boolean q;
    private SharedPreferences t;

    private SharedPreferences g() {
        h();
        return this.t;
    }

    private int d() {
        if (this.f145500b) {
            return u;
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(95140);
    }

    private String e() {
        if (this.f145499a == null) {
            this.f145499a = f.a().getDefaultUninstallQuestionUrl();
        }
        return this.f145499a;
    }

    public a() {
        int i2 = 1;
        this.f145500b = true;
        this.f145501c = true;
        this.f145502d = "";
        this.f145503e = 6000;
        this.f145507i = new com.ss.android.pushmanager.a.a();
        this.f145508j = 1;
        this.f145509k = 1;
        this.f145510l = -1;
        this.f145511m = true;
        this.n = d() != 1 ? 0 : i2;
    }

    public static a a() {
        MethodCollector.i(8331);
        if (r == null) {
            synchronized (a.class) {
                try {
                    if (r == null) {
                        r = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8331);
                    throw th;
                }
            }
        }
        a aVar = r;
        MethodCollector.o(8331);
        return aVar;
    }

    private void f() {
        SharedPreferences.Editor edit = g().edit();
        edit.putInt("keep_notify_count", this.f145505g);
        edit.putInt("max_notify_count", this.f145504f);
        edit.putInt("notify_fresh_period", this.f145506h);
        edit.putString("notify_message_ids", this.f145507i.a());
        com.bytedance.common.utility.e.a.a(edit);
    }

    private void h() {
        MethodCollector.i(8433);
        if (!this.q) {
            synchronized (this) {
                try {
                    if (!this.q) {
                        this.t = d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "app_setting", 0);
                        this.q = true;
                    }
                } finally {
                    MethodCollector.o(8433);
                }
            }
            return;
        }
        MethodCollector.o(8433);
    }

    public final void b() {
        this.f145505g = g().getInt("keep_notify_count", 0);
        this.f145504f = g().getInt("max_notify_count", 0);
        this.f145506h = g().getInt("notify_fresh_period", 0);
        this.f145507i.a(g().getString("notify_message_ids", ""));
    }

    public final boolean c() {
        MethodCollector.i(8409);
        if (!this.p) {
            synchronized (this) {
                try {
                    if (!this.p) {
                        this.f145501c = b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "is_allow_oppo_push", true);
                        this.p = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8409);
                    throw th;
                }
            }
        }
        boolean z = this.f145501c;
        MethodCollector.o(8409);
        return z;
    }

    public final boolean a(Context context) {
        if (!h(context) || this.n > 0) {
            return true;
        }
        return false;
    }

    public final void a(long j2) {
        g().edit().putLong("last_notify_time", j2).apply();
    }

    public final boolean d(Context context) {
        if (h(context)) {
            return this.f145511m;
        }
        return false;
    }

    public final synchronized void e(Context context) {
        MethodCollector.i(8407);
        if (h(context)) {
            this.f145500b = true;
            MethodCollector.o(8407);
            return;
        }
        this.f145500b = false;
        MethodCollector.o(8407);
    }

    private synchronized boolean h(Context context) {
        boolean booleanValue;
        int i2;
        MethodCollector.i(8334);
        try {
            boolean z = true;
            if (this.f145510l == -1) {
                SharedPreferences a2 = d.a(context, "push_setting", 0);
                if (this.f145500b) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.f145510l = a2.getInt("allow_settings_notify_enable", i2);
            }
            if (this.f145510l <= 0) {
                z = false;
            }
            booleanValue = Boolean.valueOf(z).booleanValue();
            MethodCollector.o(8334);
        } catch (Exception unused) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            MethodCollector.o(8334);
            return booleanValue2;
        }
        return booleanValue;
    }

    public final void b(Context context) {
        if (context != null) {
            int i2 = 0;
            SharedPreferences a2 = d.a(context, "push_setting", 0);
            if (a2 != null) {
                if (d() == 1) {
                    i2 = 1;
                }
                this.n = a2.getInt("shut_push_on_stop_service", i2);
                this.f145510l = a2.getInt("allow_settings_notify_enable", this.f145500b ? 1 : 0);
                this.f145511m = a2.getBoolean("notify_enabled", true);
                this.f145499a = a2.getString("uninstall_question_url", f.a().getDefaultUninstallQuestionUrl());
                this.f145509k = a2.getInt("push_clear_switch", 1);
                this.f145502d = a2.getString("aweme_push_config", "");
                try {
                    JSONObject jSONObject = new JSONObject(this.f145502d);
                    this.f145503e = (long) jSONObject.optInt("float_window_show_time");
                    this.f145508j = jSONObject.optInt("oppo_unify_style");
                    this.f145509k = jSONObject.optInt("push_clear_switch", this.f145509k);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final synchronized boolean c(Context context) {
        boolean booleanValue;
        MethodCollector.i(8378);
        try {
            boolean z = true;
            if (this.o == -1) {
                if (v) {
                    this.o = d.a(context, "push_setting", 0).getInt("confirm_push", 0);
                } else {
                    this.o = 1;
                }
            }
            if (this.o <= 0) {
                z = false;
            }
            booleanValue = Boolean.valueOf(z).booleanValue();
            MethodCollector.o(8378);
        } catch (Exception unused) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            MethodCollector.o(8378);
            return booleanValue2;
        }
        return booleanValue;
    }

    public final void f(Context context) {
        if (i.a()) {
            com.bytedance.push.b.a(context).a(a(context));
            com.bytedance.push.b.a(context).a(e());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("port", AppLog.getHttpMonitorPort());
                com.ss.android.common.c.a.a("http_monitor_port_ug", jSONObject);
            } catch (Throwable unused) {
            }
            Map<String, String> b2 = com.bytedance.ies.ugc.statisticlogger.a.b();
            if (!com.ss.android.ugc.awemepushlib.f.a.a(b2)) {
                com.ss.android.ugc.awemepushlib.f.a.a(new c(b2));
            }
            com.ss.android.pushmanager.b.a.a(context);
            com.ss.android.newmedia.redbadge.b.a(context).b(com.ss.android.ugc.aweme.account.b.g().getSessionKey());
        }
    }

    public final void g(Context context) {
        SharedPreferences.Editor edit;
        if (!com.ss.android.ugc.awemepushlib.a.a.c()) {
            f();
        }
        if (context != null && (edit = d.a(context, "push_setting", 0).edit()) != null) {
            edit.putInt("shut_push_on_stop_service", this.n);
            edit.putInt("allow_settings_notify_enable", this.f145510l);
            edit.putBoolean("notify_enabled", this.f145511m);
            edit.putString("uninstall_question_url", this.f145499a);
            edit.putString("aweme_push_config", this.f145502d);
            if (!com.ss.android.ugc.awemepushlib.a.a.b()) {
                c a2 = c.a(context);
                edit.putString("tt_push_pop_window_rule", a2.f60073f);
                a2.a();
            }
            com.bytedance.common.utility.e.a.a(edit);
        }
    }

    public final void b(Context context, boolean z) {
        this.f145511m = z;
        SharedPreferences.Editor edit = d.a(context, "push_setting", 0).edit();
        edit.putBoolean("notify_enabled", this.f145511m);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public final synchronized void a(Context context, boolean z) {
        MethodCollector.i(8397);
        try {
            if (this.o != z) {
                this.o = z ? 1 : 0;
                boolean z2 = false;
                SharedPreferences.Editor edit = d.a(context, "push_setting", 0).edit();
                edit.putInt("confirm_push", this.o);
                com.bytedance.common.utility.e.a.a(edit);
                com.ss.android.pushmanager.b.b.a();
                if (this.o > 0) {
                    z2 = true;
                }
                com.ss.android.pushmanager.setting.b.b().b(z2);
            }
            MethodCollector.o(8397);
        } catch (Exception unused) {
            MethodCollector.o(8397);
        }
    }

    public final boolean a(long j2, long j3) {
        a.C1306a b2;
        com.ss.android.pushmanager.a.a aVar = this.f145507i;
        aVar.getClass();
        a.C1306a aVar2 = new a.C1306a();
        aVar2.f60096a = Long.valueOf(j2);
        aVar2.f60097b = j3;
        boolean a2 = this.f145507i.a(aVar2);
        if (a2 && (b2 = this.f145507i.b(aVar2)) != null) {
            Logger.debug();
            if (aVar2.f60097b - b2.f60097b > 43200000) {
                a2 = false;
            }
        }
        Logger.debug();
        this.f145507i.c(aVar2);
        f();
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r4 != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r8, org.json.JSONObject r9) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.a.a(android.content.Context, org.json.JSONObject):boolean");
    }
}
