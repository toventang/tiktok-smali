package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.bytedance.ies.powerpermissions.e;
import com.bytedance.ies.powerpermissions.g;
import com.bytedance.ies.powerpermissions.l;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.b;
import h.a.n;
import java.util.List;

public final class PowerPermissionsTask implements IGetInterceptor, w {
    static {
        Covode.recordClassIndex(69091);
    }

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
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    public final List<e> a() {
        return n.c(new g());
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static IGetInterceptor c() {
        MethodCollector.i(6335);
        Object a2 = b.a(IGetInterceptor.class, false);
        if (a2 != null) {
            IGetInterceptor iGetInterceptor = (IGetInterceptor) a2;
            MethodCollector.o(6335);
            return iGetInterceptor;
        }
        if (b.cp == null) {
            synchronized (IGetInterceptor.class) {
                try {
                    if (b.cp == null) {
                        b.cp = new PowerPermissionsTask();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6335);
                    throw th;
                }
            }
        }
        PowerPermissionsTask powerPermissionsTask = (PowerPermissionsTask) b.cp;
        MethodCollector.o(6335);
        return powerPermissionsTask;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.f34469d.a();
    }
}
