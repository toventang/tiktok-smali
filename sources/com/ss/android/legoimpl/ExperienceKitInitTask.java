package com.ss.android.legoimpl;

import android.content.Context;
import android.ss.com.vboost.VboostListener;
import android.ss.com.vboost.d.f;
import android.ss.com.vboost.e.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settings.q;
import com.ss.android.ugc.tools.f.b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

public class ExperienceKitInitTask implements w {
    static {
        Covode.recordClassIndex(36804);
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
    public final boolean i() {
        return q.a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        a.a(3, null, "ExperienceKitInitTask");
        r.a("vboost_task_launch", new b().f149193a);
        try {
            c.f572a = SettingsManager.a().a("vboost_log_level_settings_mt", 6);
            boolean a2 = q.a();
            a.a(4, "vboost", "enable:".concat(String.valueOf(a2)));
            if (a2) {
                AnonymousClass1 r2 = new VboostListener.a() {
                    /* class com.ss.android.legoimpl.ExperienceKitInitTask.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36805);
                    }

                    @Override // android.ss.com.vboost.VboostListener.a
                    public final void a(String str, JSONObject jSONObject) {
                        r.a(str, jSONObject);
                    }
                };
                f fVar = f.a.f556a;
                fVar.f550k = new WeakReference<>(r2);
                android.ss.com.vboost.e.a.f566a = fVar.f551l;
                a.b(4, "vboost", "registerApplication.");
                r.a("vboost_register_application", new b().f149193a);
                android.ss.com.vboost.a.a(context);
                HashSet hashSet = new HashSet();
                int[] iArr = (int[]) SettingsManager.a().a("allowed_vboost_scene_mt", int[].class, com.ss.android.ugc.aweme.settings.b.f123092a);
                if (iArr != null) {
                    for (int i2 : iArr) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                }
                android.ss.com.vboost.a.a(hashSet);
                AVExternalServiceImpl.a().publishService().setKitManageRegister(true);
            }
        } catch (Throwable th) {
            a.b(6, "vboost", "registerApplication exception.");
            com.bytedance.services.apm.api.a.a(th);
            f.f542j = false;
            AVExternalServiceImpl.a().publishService().setKitManageRegister(false);
        }
    }
}
