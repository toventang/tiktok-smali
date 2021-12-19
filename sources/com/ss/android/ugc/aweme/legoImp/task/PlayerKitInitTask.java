package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.player.sdk.a;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.video.q;
import com.ss.android.ugc.aweme.video.r;
import com.ss.android.ugc.aweme.video.s;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.ss.android.ugc.aweme.video.t;
import com.ss.android.ugc.aweme.video.u;
import com.ss.android.ugc.playerkit.c.b;
import java.util.List;

public class PlayerKitInitTask implements w {
    static {
        Covode.recordClassIndex(69086);
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
        a.b.f109011a.a("method_init_player_kit_duration", false);
        boolean h2 = com.ss.android.ugc.aweme.s.a.h();
        w t = ae.t();
        a.b.f109011a.b("cold_boot_start_to_feed_player", false);
        a.b.f109011a.a("player_init_to_precreate", false);
        q.f143776b = h2;
        if (h2) {
            d.a().a();
        } else {
            q.f143775a = new SimKitConfigImpl();
            d.a().a(com.bytedance.ies.ugc.appcontext.d.a(), q.f143775a);
        }
        g.a().execute(new r(t));
        com.ss.android.ugc.playerkit.videoview.d.INSTANCE.setBitrateManager(d.a().c()).setHttpsHelper(s.f143778a).setPlayUrlBuilder(t.f143993a).setCacheChecker(u.f143994a).setPlayInfoCallback(ISimPlayerService$$CC.get$$STATIC$$().b());
        b.f148655a = false;
        b.f148658d = new com.ss.android.ugc.aweme.bm.a();
        com.ss.android.ugc.aweme.player.sdk.a.f115104b = new a.AbstractC2946a() {
            /* class com.ss.android.ugc.aweme.video.q.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94063);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.a.AbstractC2946a
            public final void a(Throwable th, String str) {
                com.bytedance.services.apm.api.a.a(th, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.a.AbstractC2946a
            public final void a(String str, String str2) {
                if (com.ss.android.ugc.aweme.video.b.q.a()) {
                    com.ss.android.ugc.aweme.framework.a.a.a(6, str, str2);
                }
            }
        };
        a.b.f109011a.b("method_init_player_kit_duration", false);
    }
}
