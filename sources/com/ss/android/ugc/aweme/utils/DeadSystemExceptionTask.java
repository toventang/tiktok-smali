package com.ss.android.ugc.aweme.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.b.b.c;
import com.bytedance.platform.godzilla.b.b.d;
import com.bytedance.platform.godzilla.d.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.s.a;
import java.lang.reflect.Field;
import java.util.List;

public class DeadSystemExceptionTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static w f142563a = new DeadSystemExceptionTask();

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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(93240);
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (a.j()) {
            return ae.BACKGROUND;
        }
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (context != null && (context instanceof Application)) {
            c cVar = new c();
            try {
                Class<?> cls = Class.forName("android.hardware.display.DisplayManagerGlobal");
                Object obj = com.bytedance.platform.godzilla.d.a.a(cls, "sInstance").get(null);
                Field a2 = com.bytedance.platform.godzilla.d.a.a(cls, "mDm");
                Object obj2 = a2.get(obj);
                cVar.a(obj2);
                a2.set(obj, g.a(obj2, cVar));
                a2.get(obj).getClass().getName();
                com.bytedance.platform.godzilla.a.g.a(g.a.ERROR);
            } catch (Exception unused) {
            }
            if (Build.VERSION.SDK_INT >= 29) {
                new d().a((Application) context);
                new com.bytedance.platform.godzilla.b.b.a().a();
            }
            Npth.setAttachUserData(new bl(), CrashType.ALL);
        }
    }
}
