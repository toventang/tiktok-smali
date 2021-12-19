package leakcanary.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.ic;
import h.a.n;
import h.f.b.l;
import h.w;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.InternalLeakCanary;
import leakcanary.internal.k;
import m.a;

public final class AndroidHeapDumper implements h {
    public static final a Companion = new a((byte) 0);
    private final Context context;
    private final k leakDirectoryProvider;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public Activity resumedActivity;

    static {
        Covode.recordClassIndex(105823);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidHeapDumper f159392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f159393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Toast f159394c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ NotificationManager f159395d;

        static {
            Covode.recordClassIndex(105827);
        }

        @Override // leakcanary.internal.i
        public final File a() {
            return this.f159393b;
        }

        @Override // leakcanary.internal.i
        public final void b() {
            this.f159392a.cancelToast(this.f159394c);
            this.f159395d.cancel(-1000000);
        }

        c(AndroidHeapDumper androidHeapDumper, File file, Toast toast, NotificationManager notificationManager) {
            this.f159392a = androidHeapDumper;
            this.f159393b = file;
            this.f159394c = toast;
            this.f159395d = notificationManager;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Toast f159391a;

        static {
            Covode.recordClassIndex(105826);
        }

        b(Toast toast) {
            this.f159391a = toast;
        }

        public final void run() {
            this.f159391a.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidHeapDumper f159396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f159397b;

        static {
            Covode.recordClassIndex(105828);
        }

        d(AndroidHeapDumper androidHeapDumper, e eVar) {
            this.f159396a = androidHeapDumper;
            this.f159397b = eVar;
        }

        public final void run() {
            View view;
            MethodCollector.i(12677);
            Activity activity = this.f159396a.resumedActivity;
            if (activity == null) {
                this.f159397b.a((Object) null);
                MethodCollector.o(12677);
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            final Toast makeText = Toast.makeText(applicationContext, "LeakDetector is dumping the heap", 1);
            makeText.setGravity(16, 0, -128);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
            l.a((Object) makeText, "");
            if (Build.VERSION.SDK_INT >= 30) {
                view = new View(com.bytedance.ies.ugc.appcontext.d.a());
            } else {
                view = makeText.getView();
            }
            l.a((Object) view, "");
            view.setTranslationY(-128.0f);
            view.animate().translationY(0.0f).setListener(new AnimatorListenerAdapter(this) {
                /* class leakcanary.internal.AndroidHeapDumper.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f159398a;

                static {
                    Covode.recordClassIndex(105829);
                }

                public final void onAnimationEnd(Animator animator) {
                    l.c(animator, "");
                    this.f159398a.f159397b.a(makeText);
                }

                {
                    this.f159398a = r1;
                }
            });
            MethodCollector.o(12677);
        }
    }

    @Override // leakcanary.internal.h
    public final i dumpHeap() {
        k kVar = this.leakDirectoryProvider;
        k.c cVar = k.c.f159478a;
        l.c(cVar, "");
        if (!kVar.a()) {
            kVar.f159474b.invoke().booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = kVar.b().listFiles(cVar);
        if (listFiles != null) {
            n.a((Collection) arrayList, (Object[]) listFiles);
        }
        File[] listFiles2 = kVar.c().listFiles(cVar);
        if (listFiles2 != null) {
            n.a((Collection) arrayList, (Object[]) listFiles2);
        }
        int intValue = kVar.f159473a.invoke().intValue();
        if (intValue > 0) {
            int size = arrayList.size() - intValue;
            if (size <= 0) {
                File b2 = kVar.b();
            } else {
                a.AbstractC4200a aVar = m.a.f159491a;
                if (aVar != null) {
                    aVar.a("Removing " + size + " heap dumps");
                }
                n.a((List) arrayList, (Comparator) k.b.f159477a);
                int i2 = 0;
                do {
                    String absolutePath = ((File) arrayList.get(i2)).getAbsolutePath();
                    if (k.a((File) arrayList.get(i2))) {
                        k.f159469c.add(absolutePath);
                    } else {
                        a.AbstractC4200a aVar2 = m.a.f159491a;
                        if (aVar2 != null) {
                            aVar2.a("Could not delete old hprof file " + ((File) arrayList.get(i2)).getPath());
                        }
                    }
                    i2++;
                } while (i2 < size);
            }
            File b22 = kVar.b();
            if (!k.b(b22)) {
                if (kVar.a()) {
                    String externalStorageState = Environment.getExternalStorageState();
                    if (!l.a((Object) "mounted", (Object) externalStorageState)) {
                        a.AbstractC4200a aVar3 = m.a.f159491a;
                        if (aVar3 != null) {
                            aVar3.a("External storage not mounted, state: ".concat(String.valueOf(externalStorageState)));
                        }
                    } else {
                        a.AbstractC4200a aVar4 = m.a.f159491a;
                        if (aVar4 != null) {
                            aVar4.a("Could not create heap dump directory in external storage: [" + b22.getAbsolutePath() + ']');
                        }
                    }
                } else if (kVar.f159474b.invoke().booleanValue()) {
                    a.AbstractC4200a aVar5 = m.a.f159491a;
                    if (aVar5 != null) {
                        aVar5.a("WRITE_EXTERNAL_STORAGE permission not granted, requesting");
                    }
                } else {
                    a.AbstractC4200a aVar6 = m.a.f159491a;
                    if (aVar6 != null) {
                        aVar6.a("WRITE_EXTERNAL_STORAGE permission not granted, ignoring");
                    }
                }
                b22 = kVar.c();
                if (!k.b(b22)) {
                    a.AbstractC4200a aVar7 = m.a.f159491a;
                    if (aVar7 != null) {
                        aVar7.a("Could not create heap dump directory in app storage: [" + b22.getAbsolutePath() + ']');
                    }
                    return null;
                }
            }
            File file = new File(b22, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
            e<Toast> eVar = new e<>();
            showToast(eVar);
            if (!eVar.a(TimeUnit.SECONDS)) {
                a.AbstractC4200a aVar8 = m.a.f159491a;
                if (aVar8 != null) {
                    aVar8.a("Did not dump heap, too much time waiting for Toast.");
                }
                return null;
            }
            Object leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService = leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.context, "notification");
            if (leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService != null) {
                NotificationManager notificationManager = (NotificationManager) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService;
                if (eVar.f159423b.getCount() <= 0) {
                    return new c(this, file, eVar.f159422a.get(), notificationManager);
                }
                throw new IllegalStateException("Call wait() and check its result");
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new IllegalArgumentException("maxStoredHeapDumps must be at least 1");
    }

    public static Context leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context2) {
        Context applicationContext = context2.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private final void showToast(e<Toast> eVar) {
        this.mainHandler.post(new d(this, eVar));
    }

    public final void cancelToast(Toast toast) {
        if (toast != null) {
            this.mainHandler.post(new b(toast));
        }
    }

    public AndroidHeapDumper(Context context2, k kVar) {
        l.c(context2, "");
        l.c(kVar, "");
        this.leakDirectoryProvider = kVar;
        Context leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context2);
        l.a((Object) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, "");
        this.context = leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        Context leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 = leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context2);
        if (leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2 != null) {
            ((Application) leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext2).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) {
                /* class leakcanary.internal.AndroidHeapDumper.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ AndroidHeapDumper f159389a;

                /* renamed from: b  reason: collision with root package name */
                private final /* synthetic */ Application.ActivityLifecycleCallbacks f159390b;

                static {
                    Covode.recordClassIndex(105824);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    this.f159390b.onActivityCreated(activity, bundle);
                }

                public final void onActivityDestroyed(Activity activity) {
                    this.f159390b.onActivityDestroyed(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    this.f159390b.onActivitySaveInstanceState(activity, bundle);
                }

                public final void onActivityStarted(Activity activity) {
                    this.f159390b.onActivityStarted(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    this.f159390b.onActivityStopped(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    l.c(activity, "");
                    this.f159389a.resumedActivity = activity;
                }

                public final void onActivityPaused(Activity activity) {
                    l.c(activity, "");
                    if (this.f159389a.resumedActivity == activity) {
                        this.f159389a.resumedActivity = null;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f159389a = r6;
                    InternalLeakCanary.e eVar = InternalLeakCanary.e.f159406a;
                    Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, eVar);
                    if (newProxyInstance != null) {
                        this.f159390b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            });
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public static Object leakcanary_internal_AndroidHeapDumper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context2, String str) {
        Object obj;
        MethodCollector.i(13117);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13117);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }
}
