package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.property.ci;
import com.ss.android.ugc.aweme.property.p;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.dl;
import h.f.b.l;
import h.v;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f69676a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(42969);
    }

    public static p a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            return ci.a();
        }
        if (h.f69698a) {
            return t.f69752b;
        }
        return new p(10000, 10000);
    }

    public static h.p<Integer, Integer> b() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            if (aa.f69665a) {
                return v.a(Integer.valueOf(dl.f126472a), Integer.valueOf(dl.f126473b));
            }
            return v.a(Integer.valueOf(dl.f126474c), Integer.valueOf(dl.f126475d));
        } else if (u.f69754a) {
            return v.a(Integer.valueOf(dl.f126472a), Integer.valueOf(dl.f126473b));
        } else {
            return v.a(Integer.valueOf(dl.f126474c), Integer.valueOf(dl.f126475d));
        }
    }
}
