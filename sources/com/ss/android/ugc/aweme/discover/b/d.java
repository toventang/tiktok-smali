package com.ss.android.ugc.aweme.discover.b;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.fresco.animation.c.a;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;

public final class d {
    static {
        Covode.recordClassIndex(50260);
    }

    public static final int b(b bVar) {
        if (bVar != null) {
            return bVar.d().k();
        }
        return -1;
    }

    public static final int c(b bVar) {
        if (bVar != null) {
            return bVar.d().l();
        }
        return -1;
    }

    public static final boolean e(b bVar) {
        SearchPlayerCore a2 = a(bVar);
        if (a2 == null || !a2.m()) {
            return false;
        }
        return true;
    }

    public static final a a(SmartImageView smartImageView) {
        Animatable animatable;
        com.facebook.drawee.h.a controller;
        a aVar = null;
        if (smartImageView == null || (controller = smartImageView.getController()) == null) {
            animatable = null;
        } else {
            animatable = controller.i();
        }
        if (animatable instanceof a) {
            aVar = animatable;
        }
        return aVar;
    }

    public static final void b(SmartImageView smartImageView) {
        if (smartImageView != null) {
            smartImageView.c();
            smartImageView.setVisibility(4);
            smartImageView.setUserVisibleHint(false);
        }
    }

    public static final boolean d(b bVar) {
        SmartImageView p;
        a a2;
        if (bVar == null || (p = bVar.p()) == null || (a2 = a(p)) == null || !a2.isRunning()) {
            return false;
        }
        return true;
    }

    public static final SearchPlayerCore a(b bVar) {
        b.d dVar;
        if (bVar != null) {
            dVar = bVar.q();
        } else {
            dVar = null;
        }
        if (dVar instanceof SearchVideoView) {
            return ((SearchVideoView) dVar).getCore();
        }
        return null;
    }

    public static final void a(SmartImageView smartImageView, com.facebook.fresco.animation.c.b bVar) {
        a a2;
        if (bVar != null && (a2 = a(smartImageView)) != null) {
            a2.a(bVar);
        }
    }
}
