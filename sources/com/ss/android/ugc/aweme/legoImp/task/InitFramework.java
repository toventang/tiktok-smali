package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.f.a;
import com.ss.android.f.b;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.video.e;
import java.util.List;
import java.util.Map;

public class InitFramework implements w {
    static {
        Covode.recordClassIndex(68995);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 17;
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
        e.a(context);
        b.a(d.a());
        try {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(b.f59515a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b.a(d.a()).f59517b = new a() {
            /* class com.ss.android.ugc.aweme.legoImp.task.InitFramework.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68996);
            }

            @Override // com.ss.android.f.a
            public final void onEvent(Map<String, String> map) {
                q.a("launch_log", map);
            }
        };
    }
}
