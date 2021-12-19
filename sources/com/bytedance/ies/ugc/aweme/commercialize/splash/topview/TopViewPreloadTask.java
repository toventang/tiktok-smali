package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.content.Context;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.Collection;
import java.util.List;

public class TopViewPreloadTask implements a, w {

    /* renamed from: a  reason: collision with root package name */
    private final List<Aweme> f34873a;

    static {
        Covode.recordClassIndex(20919);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 2;
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
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public TopViewPreloadTask(List<Aweme> list) {
        this.f34873a = list;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AwesomeSplashPreloadTask");
        h a2 = h.a();
        List<Aweme> list = this.f34873a;
        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
        if (h.d()) {
            for (Aweme aweme : list) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_no_download", aweme != null ? aweme.getAwemeRawAd() : null).a("reason", "low_device").b();
            }
            return;
        }
        list.size();
        if (!b.a((Collection) list)) {
            i.b(new i(a2, list, context), i.f4824a);
        }
    }
}
