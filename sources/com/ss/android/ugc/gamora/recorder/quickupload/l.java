package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.als.g;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.h.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.gamora.recorder.b.b;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;

public final class l {
    static {
        Covode.recordClassIndex(97691);
    }

    private static boolean a(ShortVideoContext shortVideoContext) {
        h.f.b.l.d(shortVideoContext, "");
        dt<TimeSpeedModelExtension> j2 = shortVideoContext.f124757b.j();
        h.f.b.l.b(j2, "");
        boolean z = false;
        for (TimeSpeedModelExtension timeSpeedModelExtension : j2) {
            h.f.b.l.b(timeSpeedModelExtension, "");
            z = !TextUtils.isEmpty(timeSpeedModelExtension.getStickerId());
        }
        return z;
    }

    private static boolean a(b bVar) {
        h.f.b.l.d(bVar, "");
        String currentBottomTag = bVar.getCurrentBottomTag();
        if (!h.f.b.l.a((Object) currentBottomTag, (Object) ig.a(R.string.f_2)) && !h.f.b.l.a((Object) currentBottomTag, (Object) ig.a(R.string.f_4)) && !h.f.b.l.a((Object) currentBottomTag, (Object) ig.a(R.string.f_3))) {
            return false;
        }
        return true;
    }

    public static final boolean a(ShortVideoContext shortVideoContext, f fVar, Context context) {
        h<Boolean> a2;
        g<c> f2;
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(context, "");
        T t = null;
        Object a3 = fVar.a(b.class, (String) null);
        h.f.b.l.b(a3, "");
        b bVar = (b) a3;
        Object a4 = fVar.a(m.class, (String) null);
        h.f.b.l.b(a4, "");
        m mVar = (m) a4;
        j jVar = (j) fVar.b(j.class, null);
        a aVar = (a) fVar.b(a.class, null);
        if (!shortVideoContext.O && !h.f.b.l.a((Object) shortVideoContext.r, (Object) d.shootWay) && !shortVideoContext.c() && !h.f.b.l.a((Object) shortVideoContext.r, (Object) "duet") && !shortVideoContext.f124757b.f124714i && a(bVar)) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e() && shortVideoContext.f124757b.h() <= 0) {
                T value = mVar.d().f6468a.getValue();
                h.f.b.l.b(value, "");
                if (!value.booleanValue() && !a(shortVideoContext) && (jVar == null || (f2 = jVar.f()) == null || f2.a() == null || !(jVar.f().a() instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a))) {
                    if (!(aVar == null || (a2 = aVar.a()) == null)) {
                        t = a2.f6468a.getValue();
                    }
                    if (!(!h.f.b.l.a((Object) t, (Object) true)) && com.ss.android.ugc.aweme.port.in.c.D.c().c(context) == 0 && com.ss.android.ugc.aweme.port.in.c.D.c().a(context) == 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return true;
    }
}
