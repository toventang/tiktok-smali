package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.s.a;
import com.ss.android.ugc.aweme.s.d;
import java.util.List;

public class ColdBootPreloadInstanceTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final ColdBootPreloadInstanceTask f107756a = new ColdBootPreloadInstanceTask();

    /* renamed from: b  reason: collision with root package name */
    public Fragment f107757b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f107758c;

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

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(68955);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        a.q();
        if (((Boolean) a.f120733g.getValue()).booleanValue() && c.f29648d) {
            try {
                p.a.a().h();
            } catch (Throwable unused) {
            }
        }
        if (d.e()) {
            AVExternalServiceImpl.a().specialPlusService();
        }
        if (d.d()) {
            MainPageFragmentImpl.i();
        }
        if (d.g()) {
            this.f107757b = new af();
        }
        if (d.h()) {
            this.f107758c = FollowFeedServiceImpl.c().b();
        }
    }
}
