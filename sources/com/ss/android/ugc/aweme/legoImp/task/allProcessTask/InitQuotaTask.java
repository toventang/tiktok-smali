package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.a;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.c;
import java.util.List;

public final class InitQuotaTask implements w {
    static {
        Covode.recordClassIndex(69197);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        c.f109015c = 0;
        com.ss.android.ugc.i.a a2 = com.ss.android.ugc.i.a.a();
        a aVar = new a();
        if (a2.f148525b.get()) {
            a2.f148524a = aVar;
            a2.f148525b.compareAndSet(true, false);
        }
        com.ss.android.ugc.i.a.a().a(c.f109015c);
    }

    public static final class a implements com.ss.android.ugc.i.a.a {
        static {
            Covode.recordClassIndex(69198);
        }

        @Override // com.ss.android.ugc.i.a.a
        public final void a(int i2) {
            a.EnumC0621a aVar;
            int i3;
            if (i2 == 0) {
                aVar = a.EnumC0621a.ColdStart;
            } else if (i2 == 1) {
                aVar = a.EnumC0621a.WarmStart;
            } else if (i2 != 2) {
                aVar = a.EnumC0621a.NormalStart;
            } else {
                aVar = a.EnumC0621a.HotStart;
            }
            try {
                com.bytedance.frameworks.baselib.network.http.cronet.a.f28995a = aVar;
                int value = aVar.getValue();
                com.bytedance.frameworks.baselib.network.a.f28820c.set(System.currentTimeMillis() / 1000);
                if (value == 0) {
                    com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.ColdStart;
                } else if (value == 1) {
                    com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.HotStart;
                } else if (value != 2) {
                    com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.NormalStart;
                } else {
                    com.bytedance.frameworks.baselib.network.a.f28818a = a.EnumC0618a.WarmStart;
                }
                ICronetClient iCronetClient = h.f29075c;
                if (iCronetClient != null && (i3 = aVar.state) >= 0 && i3 <= 2) {
                    Reflect.on(iCronetClient).call("setAppStartUpState", new Class[]{Integer.TYPE}, Integer.valueOf(i3)).get();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
