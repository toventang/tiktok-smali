package com.ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.setting.cd;
import com.ss.android.ugc.aweme.setting.model.n;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class I18nLancet {

    /* renamed from: a  reason: collision with root package name */
    public static String f107161a;

    static {
        Covode.recordClassIndex(68554);
    }

    public static class AmeActivityResumeRun implements w {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f107162a;

        static {
            Covode.recordClassIndex(68555);
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

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            if (c.f29648d && b.a().a("fix_active_user_experiment", ClientExpManager.fix_active_user_experiment())) {
                return ae.MAIN;
            }
            return ae.BOOT_FINISH;
        }

        public AmeActivityResumeRun(Activity activity) {
            this.f107162a = new WeakReference<>(activity);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            Activity activity = this.f107162a.get();
            if (!(Build.VERSION.SDK_INT == 18 || activity == null)) {
                TTNetInit.onActivityResume(activity);
            }
            if (b.a().a(true, "use_new_app_alert", 0) == 0) {
                AppLog.activeUser(d.a());
            }
            cd cdVar = cd.f122158b;
            d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = cd.b();
            }
            if (j.f107229h) {
                for (int i2 = 0; i2 < cdVar.f122159c.size(); i2++) {
                    n valueAt = cdVar.f122159c.valueAt(i2);
                    int keyAt = cdVar.f122159c.keyAt(i2);
                    if (valueAt != null && !valueAt.f122339a) {
                        if (valueAt.f122341c == 3) {
                            valueAt.f122339a = true;
                            valueAt.f122341c = 0;
                        } else {
                            if (System.currentTimeMillis() - valueAt.f122340b > ((long) (30000 >> valueAt.f122341c))) {
                                valueAt.f122341c++;
                                com.ss.android.ugc.aweme.app.n.a("aweme_setting_retry_policy", new com.ss.android.ugc.aweme.app.f.c().a("group_id", String.valueOf(keyAt)).a("fetch_url_retry_count", Integer.valueOf(valueAt.f122341c)).a("time_interval", Long.valueOf(System.currentTimeMillis() - valueAt.f122340b)).a());
                                valueAt.f122342d.cz_();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
