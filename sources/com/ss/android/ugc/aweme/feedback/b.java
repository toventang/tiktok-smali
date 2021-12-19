package com.ss.android.ugc.aweme.feedback;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f95380a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(60402);
    }

    public static boolean a(Activity activity, String str) {
        String str2 = "";
        l.d(activity, str2);
        l.d(str, str2);
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, str2);
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            l.b(feedbackConf, str2);
            String feRecord = feedbackConf.getFeRecord();
            l.b(feRecord, str2);
            str2 = feRecord;
        } catch (Exception unused) {
        }
        u a2 = u.a(str2);
        a2.a("enter_from", str);
        t.a(t.a(), a2.f71178a.a());
        return true;
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        if (!(str == null || str.length() == 0)) {
            for (String str2 : p.b(str, new String[]{"&"})) {
                List<String> b2 = p.b(str2, new String[]{"="});
                if (b2.size() == 2) {
                    hashMap.put(b2.get(0), b2.get(1));
                }
            }
        }
    }

    public static String b(String str, HashMap<String, String> hashMap) {
        int a2 = p.a((CharSequence) str, '?', 0, false, 6);
        if (a2 > 0) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str = str.substring(0, a2);
            l.b(str, "");
        }
        g gVar = new g(str);
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            gVar.a(entry.getKey(), entry.getValue());
        }
        String a3 = gVar.a();
        l.b(a3, "");
        return a3;
    }
}
