package com.ss.android.ugc.aweme.core;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.am;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.i;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.o;
import com.ss.android.ugc.aweme.utils.p;
import h.f.b.l;
import java.lang.reflect.Field;

public abstract class a extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private final String f78233a = "AppWidgetDebugInfo";

    static {
        Covode.recordClassIndex(48517);
    }

    public abstract int a();

    public abstract int b();

    public abstract int[] c();

    public abstract float d();

    public abstract String e();

    public abstract int[] f();

    public abstract int[] g();

    /* renamed from: com.ss.android.ugc.aweme.core.a$a  reason: collision with other inner class name */
    static final class RunnableC1817a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f78235b;

        static {
            Covode.recordClassIndex(48518);
        }

        RunnableC1817a(a aVar, Context context) {
            this.f78234a = aVar;
            this.f78235b = context;
        }

        public final void run() {
            a aVar = this.f78234a;
            Context context = this.f78235b;
            aVar.a(context, aVar.a(context));
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f78237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f78238c;

        static {
            Covode.recordClassIndex(48519);
        }

        b(a aVar, Context context, int[] iArr) {
            this.f78236a = aVar;
            this.f78237b = context;
            this.f78238c = iArr;
        }

        public final void run() {
            this.f78236a.a(this.f78237b, this.f78238c);
        }
    }

    private void a(String str) {
        l.d(str, "");
        e();
    }

    public void onDisabled(Context context) {
        l.d(context, "");
        super.onDisabled(context);
        p.a("disabled", e());
        a("onDisabled");
    }

    public void onEnabled(Context context) {
        l.d(context, "");
        super.onEnabled(context);
        p.a("enable", e());
        a("onEnabled");
    }

    public final int[] a(Context context) {
        String name;
        int a2 = a();
        if (a2 == am.f66368b) {
            name = SmallAppWidgetProvider.class.getName();
        } else if (a2 == am.f66369c) {
            name = MediumAppWidgetProvider.class.getName();
        } else {
            name = LargeAppWidgetProvider.class.getName();
        }
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), name));
    }

    public void onDeleted(Context context, int[] iArr) {
        l.d(context, "");
        l.d(iArr, "");
        super.onDeleted(context, iArr);
        p.a("delete", e());
        a("onDeleted -- " + iArr[0]);
    }

    public void onReceive(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        super.onReceive(context, intent);
        if (l.a((Object) intent.getAction(), (Object) am.f66367a)) {
            a("receieved check widgets state broadcast");
            if (i.c()) {
                a(context, a(context));
            } else {
                g.c().execute(new RunnableC1817a(this, context));
            }
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    public final void a(Context context, int[] iArr) {
        a("try update");
        o.a(context, Integer.valueOf(a()), Integer.valueOf(b()), c(), Float.valueOf(d()), a(context), e(), f(), g());
        if (!in.e() && Build.VERSION.SDK_INT >= 21) {
            try {
                JobInfo.Builder builder = new JobInfo.Builder(11, new ComponentName(context, AppWidgetSchedulerService.class));
                builder.setMinimumLatency(3000);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putInt("app_widget_action_type", 1);
                persistableBundle.putInt("app_widget_type", a());
                persistableBundle.putInt("app_widghet_layout_id", b());
                persistableBundle.putIntArray("app_widget_ids", iArr);
                persistableBundle.putIntArray("app_widget_video_cover_image_view_ids", c());
                persistableBundle.putIntArray("topic_cover_px_size", f());
                persistableBundle.putIntArray("video_cover_px_size", g());
                persistableBundle.putDouble("app_widget_video_cover_aspect_ratio", (double) d());
                persistableBundle.putString("app_log_desc", e());
                builder.setExtras(persistableBundle);
                JobInfo build = builder.build();
                Object a2 = a(context, "jobscheduler");
                if (a2 != null) {
                    ((JobScheduler) a2).schedule(build);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
            } catch (Throwable unused) {
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        l.d(context, "");
        l.d(appWidgetManager, "");
        l.d(iArr, "");
        a("onUpdate");
        p.a("update", e());
        if (com.ss.android.ugc.aweme.experiment.i.c()) {
            a(context, iArr);
        } else {
            g.c().execute(new b(this, context, iArr));
        }
    }
}
