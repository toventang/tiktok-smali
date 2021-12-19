package com.ss.android.ugc.aweme.application;

import android.app.Instrumentation;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.legoapi.abtest.a;
import com.ss.android.ugc.aweme.childhook.ChildActivityInstrumentation;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;
import com.ss.android.ugc.aweme.push.downgrade.d;
import com.ss.android.ugc.aweme.video.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class l {
    static {
        Covode.recordClassIndex(41260);
    }

    public static void attachBaseContextAfterMultiDex(j jVar) {
        d.f118880a = new OptimizePushProcessImpl();
        f.e().a(new FrescoSoLoadSetter()).a();
        e.a(jVar.f66937a);
        f.e().a(a.f59609a.d()).a();
        f.e().a(new SharePreferencePreloadForAllProcessTask()).a(ae.n()).a();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            h.f.b.l.b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
            h.f.b.l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            if (obj != null) {
                declaredField.set(invoke, new ChildActivityInstrumentation((Instrumentation) obj));
                if (com.ss.android.ugc.aweme.s.a.i()) {
                    f.a(ae.n());
                }
                if (jVar.f66938b) {
                    a.b.f109011a.b("cold_boot_application_attach_duration", true);
                    a.b.f109011a.a("cold_boot_application_attach_to_create", true);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Instrumentation");
        } catch (Exception e2) {
            e2.printStackTrace();
            b.a(e2, "ChildActivityHook.startHook");
        }
    }
}
