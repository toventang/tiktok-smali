package com.ss.android.ugc.aweme.homepage.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.lego.e.a;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.s.d;
import com.ss.android.ugc.aweme.story.g;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f99510a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(63467);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends android.app.Activity>, java.lang.ref.WeakReference<android.app.Activity>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(e eVar) {
        l.d(eVar, "");
        l.d(eVar, "");
        a aVar = f.f107540e;
        l.d(eVar, "");
        aVar.f107516c.put(eVar.getClass(), new WeakReference(eVar));
        f.d e2 = f.e();
        e2.a(new X2CFragmentMainPageIcon());
        if (!d.d()) {
            e2.a(new X2CIconStory());
        } else if (g.f137757a.i()) {
            e2.a(new X2CIconStory());
        }
        if (ax.b()) {
            e2.a(com.ss.android.ugc.aweme.main.experiment.d.f109248a.a());
            e2.a(com.ss.android.ugc.aweme.main.experiment.d.f109248a.b());
            e2.a(com.ss.android.ugc.aweme.main.experiment.d.f109248a.c());
        } else if (ax.a()) {
            e2.a(com.ss.android.ugc.aweme.main.experiment.d.f109248a.a());
            e2.a(com.ss.android.ugc.aweme.main.experiment.d.f109248a.b());
        }
        e2.a();
    }
}
