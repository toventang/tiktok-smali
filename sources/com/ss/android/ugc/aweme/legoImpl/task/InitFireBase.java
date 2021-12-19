package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class InitFireBase implements a, w {
    static {
        Covode.recordClassIndex(69257);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
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

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        try {
            b.a(context);
        } catch (Exception e2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e2.toString());
                com.bytedance.apm.b.a("firebase_initialize_error", jSONObject, (JSONObject) null, (JSONObject) null);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            e2.printStackTrace();
        }
        if (f.a(context)) {
            try {
                FirebaseMessaging.a();
                d.a(b.d().a(), "com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", true).apply();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            if (!TextUtils.isEmpty(serverDeviceId)) {
                instance.setUserId(serverDeviceId);
            }
            FirebaseAnalytics.getInstance(context).getAppInstanceId().a(c.f108028a);
            if (in.d()) {
                instance.setAnalyticsCollectionEnabled(false);
            } else {
                instance.setAnalyticsCollectionEnabled(true);
            }
        }
    }
}
