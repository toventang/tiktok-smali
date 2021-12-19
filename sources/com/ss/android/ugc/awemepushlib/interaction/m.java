package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.push.window.oppo.c;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.awemepushlib.manager.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145460a;

    static {
        Covode.recordClassIndex(95115);
    }

    m(Context context) {
        this.f145460a = context;
    }

    public final void run() {
        Context context = this.f145460a;
        c.a("method_push_start_load_config");
        a a2 = a.a();
        SharedPreferences a3 = d.a(context, "push_setting", 0);
        a2.b(context);
        if (!com.ss.android.ugc.awemepushlib.a.a.c()) {
            a2.b();
        }
        if (!com.ss.android.ugc.awemepushlib.a.a.b()) {
            c a4 = c.a(context);
            a4.f60073f = a3.getString("tt_push_pop_window_rule", "");
            a4.a();
        }
        c.b("method_push_start_load_config");
    }
}
