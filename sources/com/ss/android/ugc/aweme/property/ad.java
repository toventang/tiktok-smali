package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import h.f.b.l;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f118327a = new ad();

    private ad() {
    }

    static {
        Covode.recordClassIndex(76844);
    }

    public static final boolean a() {
        if (f() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (f() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (f() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        if (f() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean e() {
        if (f() == 3) {
            return true;
        }
        return false;
    }

    private static final int f() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        boolean e2 = createIAVServiceProxybyMonsterPlugin.getStoryService().e();
        if (g.a().A().a() || e2) {
            return 0;
        }
        return b.a().a(true, "edit_page_progress_optimization", 0);
    }
}
