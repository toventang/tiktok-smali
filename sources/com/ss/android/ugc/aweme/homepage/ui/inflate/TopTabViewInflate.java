package com.ss.android.ugc.aweme.homepage.ui.inflate;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import java.util.List;

public final class TopTabViewInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    public e f99514a;

    static {
        Covode.recordClassIndex(63470);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
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
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return HomePageUIFrameServiceImpl.e().a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        e eVar;
        l.d(context, "");
        try {
            dj a2 = FeedModuleServiceImpl.a().a(context);
            l.b(a2, "");
            eVar = new e(a2);
        } catch (Exception unused) {
            eVar = null;
        }
        this.f99514a = eVar;
    }
}
