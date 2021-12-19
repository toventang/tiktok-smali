package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.at;
import com.ss.android.ugc.aweme.common.net.NetworkReceiver;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.task.q;
import java.util.List;

class BaseInitAllService$2 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f66482a;

    static {
        Covode.recordClassIndex(40861);
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
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    BaseInitAllService$2(p pVar) {
        this.f66482a = pVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        at atVar = new at();
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            atVar.a(context, new NetworkReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        }
    }
}
