package com.ss.android.ugc.gamora.recorder.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.s;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(97609);
    }

    public static final boolean a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        if (s.f69749a) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().e() || shortVideoContext.f124757b.b() || shortVideoContext.f124757b.c() || shortVideoContext.c()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
