package com.ss.android.ugc.aweme.commercialize.track;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class RawURLGetter$updateUa$1$1 implements w {
    static {
        Covode.recordClassIndex(46502);
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

    RawURLGetter$updateUa$1$1() {
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.IDLE;
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
        l.d(context, "");
        a.a(3, null, "AD_USER_AGENT_KEY");
        RawURLGetter.b().edit().putString("ad_user_agent_sp", RawURLGetter.a()).apply();
    }
}
