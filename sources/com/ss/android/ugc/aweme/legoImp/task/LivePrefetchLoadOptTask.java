package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.lego.z;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

public class LivePrefetchLoadOptTask implements a, w {
    static {
        Covode.recordClassIndex(69055);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        if (z.c()) {
            return ac.IO;
        }
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (((Boolean) m.f107601i.getValue()).booleanValue()) {
            return ae.APP_BACKGROUND;
        }
        if (((Boolean) b.f107389f.getValue()).booleanValue()) {
            return ae.BOOT_FINISH;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        LiveOuterService.s().b();
        com.bytedance.android.livesdkapi.i.a.f23248a = Boolean.valueOf(((Boolean) b.f107388e.getValue()).booleanValue()).booleanValue();
        GlobalContext.setApplicationContext(context);
        com.bytedance.android.livesdkapi.i.a.a("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
        if (!b.d()) {
            com.bytedance.android.livesdkapi.i.a.a(context);
        }
    }
}
