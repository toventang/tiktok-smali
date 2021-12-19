package com.ss.android.ugc.aweme.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import java.util.List;

public final class ColdLoggerAttachBaseTask implements w {
    static {
        Covode.recordClassIndex(90635);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
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
        long currentTimeMillis = System.currentTimeMillis();
        a.b.f109011a.b("app_start_v2_to_v1", true);
        a.b.f109011a.a("feed_boot_to_feed_request", true);
        a.b.f109011a.a("cold_boot_application_attach_duration", true);
        a.b.f109011a.a("feed_cover_total", false);
        a.b.f109011a.a("feed_total", true);
        a.b.f109011a.a("app_start_to_main_focus", true);
        a.b.f109011a.a("cold_boot_start_to_feed_ui", false);
        a.b.f109011a.a("feed_boot_to_network", false);
        a.b.f109011a.a("feed_boot_to_init_ttnet", false);
        a.b.f109011a.a("feed_boot_to_init_ttnet_end", false);
        a.b.f109011a.a("app_start_to_preload_first_request", false);
        a.b.f109011a.a("app_start_to_get_did", false);
        a.b.f109011a.a("cold_boot_start_to_feed_player", false);
        a.b.f109011a.a("cold_boot_start_to_precreate", false);
        a.b.f109011a.f109007h = currentTimeMillis;
        a.b.f109011a.a("cold_boot_begin_time", currentTimeMillis);
    }
}
