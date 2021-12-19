package com.ss.android.ugc.aweme.shortvideo.edit.b;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.au;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126941a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(83280);
    }

    public static final boolean a() {
        if (f.a()) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().e() || g.a().A().a() || !g.a().A().b() || au.a() != 1 || Build.VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        }
        return false;
    }
}
