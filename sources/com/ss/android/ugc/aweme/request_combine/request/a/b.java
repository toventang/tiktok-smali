package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.i;
import com.ss.android.ugc.aweme.live.m;
import h.f.b.l;
import java.util.List;

public final class b implements r {
    static {
        Covode.recordClassIndex(78558);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        m b2;
        l.d(context, "");
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.e();
        ILiveOuterService s2 = LiveOuterService.s();
        l.b(s2, "");
        i k2 = s2.k();
        if (k2 != null && (b2 = k2.b()) != null) {
            b2.a(context);
        }
    }
}
