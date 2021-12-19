package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.cw;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.List;

public class FontTask implements a, w {
    static {
        Covode.recordClassIndex(68978);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        if (((Boolean) e.o.getValue()).booleanValue()) {
            return ac.IO;
        }
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        List<String> b2;
        if (!TextUtils.equals(SettingServiceImpl.v().a(d.a()).b(), "th")) {
            b.a().a(context, cw.f142790a);
            CrossPlatformServiceImpl.c().a(context, cw.f142790a);
        }
        l.d(context, "");
        if (com.ss.android.ugc.aweme.tux.a.c.a.a()) {
            b2 = z.INSTANCE;
        } else {
            b2 = n.b("font/ProximaNova-Bold.otf", "font/ProximaNova-Semibold.otf", "font/ProximaNova-Reg.otf");
        }
        com.bytedance.tux.d.b.f44791a.a(context, b2);
    }
}
