package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.framework.c.a;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f122253a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(80155);
    }

    public static boolean c() {
        if (b.a().a(true, "data_saver_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    public static int d() {
        if (b() != 0) {
            return 1;
        }
        return 0;
    }

    public static int b() {
        if (!a() || a.a(d.a())) {
            return 0;
        }
        return b.a().a(true, "data_saver_mode", 0);
    }

    public static boolean a() {
        s sVar = s.a.f66880a;
        h.f.b.l.b(sVar, "");
        aj<Integer> y = sVar.y();
        h.f.b.l.b(y, "");
        Integer c2 = y.c();
        if (c2 == null) {
            return false;
        }
        if (c2.intValue() == 0) {
            try {
                IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                c2 = iESSettingsProxy.getDataSaverSetting();
                s sVar2 = s.a.f66880a;
                h.f.b.l.b(sVar2, "");
                aj<Integer> y2 = sVar2.y();
                h.f.b.l.b(y2, "");
                y2.b(c2);
            } catch (com.bytedance.ies.a unused) {
                c2 = 2;
            }
            if (c2 == null) {
                return false;
            }
        }
        if (c2.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(int i2) {
        try {
            s sVar = s.a.f66880a;
            h.f.b.l.b(sVar, "");
            aj<Integer> y = sVar.y();
            h.f.b.l.b(y, "");
            y.b(Integer.valueOf(i2));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
