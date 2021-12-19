package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.statistic.b;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.List;

public final class AppLogInitTask implements w {
    static {
        Covode.recordClassIndex(68923);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements AppLog.j {
        static {
            Covode.recordClassIndex(68924);
        }

        @Override // com.ss.android.common.applog.AppLog.j
        public final void a(List<Long> list) {
            l.d(list, "");
        }

        @Override // com.ss.android.common.applog.AppLog.j
        public final void onEventExpired(List<Long> list) {
            l.d(list, "");
        }

        a() {
        }

        @Override // com.ss.android.common.applog.AppLog.j
        public final void a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            if (l.a((Object) "terminate", (Object) str)) {
                n.a("type_app_log_state_change", new c().a("data_source", str).a("session_id", str2).a("is_success", (Integer) 1).a("eventIndex", (String) null).a("error_message", str3).a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        boolean d2;
        List<String> list;
        l.d(context, "");
        if (d.g()) {
            AppLog.registerLogRequestCallback(new a());
            if (com.ss.android.ugc.aweme.compliance.api.a.q().d()) {
                d2 = com.ss.android.ugc.aweme.compliance.api.d.a.c();
            } else {
                d2 = in.d();
            }
            AppLog.setChildModeBeforeInit(d2);
            if (d2) {
                list = com.ss.android.ugc.aweme.compliance.api.a.q().c();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            Application a2 = g.a();
            l.b(a2, "");
            b.a(a2);
        }
    }
}
