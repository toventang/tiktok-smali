package com.ss.android.ugc.aweme.legoImp.task;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.arch.widgets.base.e;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import java.lang.reflect.Field;
import java.util.List;

public class PreloadInstanceTask implements a, w {
    static {
        Covode.recordClassIndex(69095);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 2;
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
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
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
        Double.valueOf(com.ss.android.ugc.aweme.m.a.a(2));
        a(context, DataType.AUDIO);
        a(context, "activity");
        o.a();
        com.ss.android.newmedia.a.a.a(context);
        Boolean.valueOf(UgCommonServiceImpl.j().g());
        Boolean.valueOf(DetailActivity.f79882c);
        Boolean.valueOf(CrossPlatformActivity.f78495b);
        try {
            if (!com.ss.android.ugc.aweme.s.a.q()) {
                new ScrollableViewPager(context);
                new SwipeRefreshLayout(context);
                new TuxTextView(context);
                new com.ss.android.ugc.aweme.main.ae();
                new af();
            }
        } catch (Throwable unused) {
        }
        g.h();
        if (!com.ss.android.ugc.aweme.s.a.q()) {
            UserService.d();
        }
        ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);
        StickerServiceImpl.c().a();
        new e();
        Boolean.valueOf(true);
        com.ss.android.ugc.aweme.commerce.a.a.d();
        if (((Boolean) com.ss.android.ugc.aweme.lego.e.q.getValue()).booleanValue()) {
            SpecActServiceImpl.i();
            AVExternalServiceImpl.a().publishService();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3633);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3633);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
