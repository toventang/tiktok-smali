package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f126563a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(83012);
    }

    public static String b(Effect effect) {
        String str;
        h.f.b.l.d(effect, "");
        e a2 = a(effect);
        if (a2 == null || (str = a2.f126514a) == null) {
            return "";
        }
        return str;
    }

    public static String c(Effect effect) {
        String str;
        h.f.b.l.d(effect, "");
        e a2 = a(effect);
        if (a2 == null || (str = a2.f126514a) == null) {
            return "";
        }
        return str;
    }

    public static e a(Effect effect) {
        h.f.b.l.d(effect, "");
        try {
            return (e) new f().a(new JSONObject(effect.getExtra()).getString("duet_layout_mode"), e.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
