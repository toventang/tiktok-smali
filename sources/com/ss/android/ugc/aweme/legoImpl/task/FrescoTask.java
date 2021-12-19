package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.s;
import com.facebook.drawee.a.a.c;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.ay.m;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.video.e;
import java.util.List;

public class FrescoTask implements a, w {
    static {
        Covode.recordClassIndex(69247);
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

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (b.g()) {
            return ae.MAIN;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        e.a(context);
        if (d.d()) {
            com.facebook.imageutils.b.f48470a = a.f108021a;
        }
        try {
            com.ss.android.ugc.aweme.base.e.f68105a = true;
            com.ss.android.ugc.aweme.ay.d dVar = com.ss.android.ugc.aweme.ay.d.f67791a;
            if (dVar != null) {
                com.facebook.common.e.a.f47081a = dVar;
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                m mVar = new m();
                if (!r.f39863c) {
                    r.f39863c = true;
                    r.f39862b = mVar;
                    r.f39864d = a2.getPackageName();
                    r.f39861a.init(mVar);
                }
                c.f47262c = false;
                s.a.f40036a.a(new com.facebook.common.g.c() {
                    /* class com.ss.android.ugc.aweme.legoImpl.task.FrescoTask.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69248);
                    }

                    @Override // com.facebook.common.g.c
                    public final void a(com.facebook.common.g.b bVar) {
                        try {
                            double suggestedTrimRatio = bVar.getSuggestedTrimRatio();
                            if (com.facebook.common.g.b.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || com.facebook.common.g.b.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || com.facebook.common.g.b.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                                k.a().e().a();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
                System.currentTimeMillis();
                valueOf.longValue();
                return;
            }
            throw new IllegalArgumentException();
        } catch (Exception e2) {
            com.bytedance.c.a.a.a.b.a(e2, "[Lighten][Fresco][Initializer][Throwable]");
            throw e2;
        }
    }
}
