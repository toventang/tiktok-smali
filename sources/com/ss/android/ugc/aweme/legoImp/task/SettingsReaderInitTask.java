package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.bf.e;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.settingsrequest.f;
import com.ss.android.ugc.aweme.settingsrequest.k;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import f.a.t;
import f.a.z;
import java.util.List;

public class SettingsReaderInitTask implements w {
    static {
        Covode.recordClassIndex(69120);
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
    public final int bK_() {
        return q.f107989a;
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
        SettingsManager.a().a(new i() {
            /* class com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69121);
            }

            @Override // com.bytedance.ies.abmock.i
            public final void a() {
                SettingsManagerProxy.inst().notifySettingsChange();
                SpecActServiceImpl.i().b();
            }
        });
        a.a("SettingsReaderInitTask");
        SettingsManagerProxy.inst().registerSettingsWatcher(f.a(), false);
        SettingsManagerProxy.inst().registerSettingsWatcher(e.f68656a, false);
        if (com.ss.android.common.util.f.a(d.a())) {
            try {
                t.a(g.a.f66742a).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.h.a.b(f.a.k.a.f158006c)).b((z) new g.b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        by.f122128a.a((by.a) new k());
    }
}
