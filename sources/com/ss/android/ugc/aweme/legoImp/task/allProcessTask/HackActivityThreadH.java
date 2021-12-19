package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.a.a;
import com.ss.android.ugc.aweme.utils.a.b;
import java.util.List;

public class HackActivityThreadH implements w {
    static {
        Covode.recordClassIndex(69191);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
        return ae.BOOT_FINISH;
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
        try {
            Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            if (call != null) {
                Handler handler = (Handler) call.field("mH", Class.forName("android.app.ActivityThread$H")).get();
                if (handler != null) {
                    Reflect on = Reflect.on(handler);
                    b.a aVar = new b.a(handler, (Handler.Callback) on.field("mCallback", Handler.Callback.class).get());
                    aVar.f142589c.add(new a());
                    on.set("mCallback", aVar);
                }
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
