package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import h.f.b.l;

public final class ed {

    /* renamed from: a  reason: collision with root package name */
    public static final ed f118484a = new ed();

    private ed() {
    }

    static {
        Covode.recordClassIndex(76958);
    }

    public static final boolean a() {
        if (b.a().a(true, "story_lightning_slidebar_swipeclose", false)) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (!createIAVServiceProxybyMonsterPlugin.getStoryService().d() || g.a().A().a()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
