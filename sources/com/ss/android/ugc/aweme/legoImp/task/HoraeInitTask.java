package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.a.a;
import com.bytedance.platform.a.b.a.a;
import com.bytedance.platform.a.b.c.a.d;
import com.bytedance.platform.a.b.c.a.e;
import com.bytedance.platform.a.b.c.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HoraeInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    static final List<String> f107772a = Arrays.asList("com.bytedance.android.livesdk", "com.ss.videoarch.strategy", "com.ss.optimizer.live.sdk", "com.ss.android.ugc.aweme.common.net");

    public static class a {
        @c(a = "ignore_list")

        /* renamed from: a  reason: collision with root package name */
        public List<String> f107775a;

        static {
            Covode.recordClassIndex(68984);
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f107776a = null;

        static {
            Covode.recordClassIndex(68985);
        }
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

    static {
        Covode.recordClassIndex(68981);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (SettingsManager.a().a("enable_horae_init", false)) {
            a.C1025a aVar = new a.C1025a();
            aVar.f41793a = false;
            aVar.f41795c = false;
            aVar.f41796d = "double_turbo_quicken_engine";
            aVar.f41794b = new com.bytedance.platform.a.b() {
                /* class com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(68982);
                }
            };
            aVar.f41797e = true;
            aVar.f41799g = com.bytedance.ies.abmock.b.a().a(true, "async_dispatch_broadcast_pkg_removed", false);
            a aVar2 = null;
            try {
                aVar2 = (a) SettingsManager.a().a("horae_ignore_config", a.class);
            } catch (Throwable unused) {
            }
            if (aVar2 != null && !com.bytedance.common.utility.collection.b.a((Collection) aVar2.f107775a)) {
                aVar.f41798f = new HashSet(aVar2.f107775a);
            }
            a.b bVar = e.f107966a;
            if (bVar != null) {
                com.bytedance.platform.a.b.a.a.f41830d = bVar;
            }
            com.bytedance.platform.a.a aVar3 = new com.bytedance.platform.a.a(aVar.f41793a, aVar.f41794b, aVar.f41796d, aVar.f41795c, aVar.f41798f, aVar.f41797e, aVar.f41799g, (byte) 0);
            com.bytedance.platform.a.b.b a2 = com.bytedance.platform.a.b.b.a((Application) context);
            if (aVar3.f41790e) {
                com.bytedance.platform.a.b.a.a.f41827a.add(133);
                com.bytedance.platform.a.b.a.a.f41828b.add(133);
            }
            boolean z = aVar3.f41786a;
            String str = aVar3.f41788c;
            com.bytedance.platform.a.b bVar2 = aVar3.f41787b;
            Set<String> set = aVar3.f41791f;
            boolean z2 = aVar3.f41789d;
            if (!a2.f41858b) {
                if (!TextUtils.isEmpty(str)) {
                    a2.f41859c = z;
                    a2.f41858b = true;
                    if (z) {
                        d b2 = d.b();
                        Application application = a2.f41857a;
                        if (!b2.f41889e) {
                            b2.f41890f = bVar2;
                            b2.f41889e = true;
                            b2.f41886a = application;
                            b2.f41891g = z2;
                            HandlerThread handlerThread = new HandlerThread(str);
                            handlerThread.start();
                            com.bytedance.platform.a.b.c.a aVar4 = new com.bytedance.platform.a.b.c.a();
                            Application application2 = b2.f41886a;
                            com.bytedance.platform.a.b.c.a.d dVar = new com.bytedance.platform.a.b.c.a.d(aVar4);
                            dVar.f41879c = new d.a(Looper.getMainLooper());
                            dVar.a();
                            e eVar = new e(aVar4);
                            try {
                                Field a3 = com.bytedance.platform.a.a.b.a(Looper.class, "mLogging");
                                eVar.f41882c = (Printer) a3.get(Looper.getMainLooper());
                                a3.set(Looper.getMainLooper(), eVar);
                            } catch (Throwable unused2) {
                            }
                            com.bytedance.platform.a.b.c.a.c cVar = new com.bytedance.platform.a.b.c.a.c(application2, aVar4);
                            try {
                                cVar.f41877d = com.bytedance.platform.a.a.b.a(View.class, "mAttachInfo");
                                if (cVar.f41877d != null) {
                                    cVar.f41877d.setAccessible(true);
                                    cVar.f41876c.registerActivityLifecycleCallbacks(cVar);
                                }
                            } catch (Throwable unused3) {
                            }
                            com.bytedance.platform.a.b.c.e eVar2 = com.bytedance.platform.a.b.c.e.f41896a;
                            try {
                                Handler handler = (Handler) com.bytedance.platform.a.a.a.b();
                                Field a4 = com.bytedance.platform.a.a.b.a(Handler.class, "mCallback");
                                eVar2.f41900d = (Handler.Callback) a4.get(handler);
                                a4.set(handler, eVar2);
                            } catch (Throwable unused4) {
                                if (com.bytedance.platform.a.b.c.d.b().f41890f != null) {
                                    com.bytedance.platform.a.b.c.d.b();
                                }
                            }
                            b2.f41887b = new com.bytedance.platform.a.b.c.c(handlerThread.getLooper());
                            b2.f41887b.postDelayed(b2, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    } else {
                        com.bytedance.platform.a.b.a.a.f41829c = set;
                        com.bytedance.platform.a.b.a.c.a().a(a2.f41857a, str, bVar2, z2);
                    }
                } else {
                    throw new IllegalArgumentException("Parameter threadName can not be null!");
                }
            }
            Npth.setAttachUserData(new ab(aVar3), CrashType.ALL);
            Context a5 = com.bytedance.ies.ugc.appcontext.d.a();
            if (a5 instanceof Application) {
                ((Application) a5).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(68983);
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityStopped(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                        String[] strArr = (String[]) SettingsManager.a().a("horae_pause_settings", String[].class, b.f107776a);
                        if (strArr != null) {
                            String name = activity.getClass().getName();
                            for (String str : strArr) {
                                if (TextUtils.equals(str, name)) {
                                    com.bytedance.platform.a.b.a.c a2 = com.bytedance.platform.a.b.a.c.a();
                                    if (a2.f41840c) {
                                        a2.f41840c = false;
                                        int i2 = Build.VERSION.SDK_INT;
                                        a2.f41839b.getLooper().quitSafely();
                                        com.bytedance.platform.a.b.a.d dVar = com.bytedance.platform.a.b.a.d.f41852a;
                                        if (dVar.f41855d) {
                                            dVar.f41855d = false;
                                            try {
                                                Handler handler = (Handler) com.bytedance.platform.a.a.a.b();
                                                Field a3 = com.bytedance.platform.a.a.b.a(Handler.class, "mCallback");
                                                if (a3 != null) {
                                                    a3.setAccessible(true);
                                                    a3.set(handler, dVar.f41854c);
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable unused) {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                            com.bytedance.platform.a.b.a.c a4 = com.bytedance.platform.a.b.a.c.a();
                            if (a4.f41838a != null) {
                                a4.a(a4.f41838a, a4.f41842e, a4.f41841d, a4.f41843f);
                            }
                        }
                    }
                });
            }
        }
    }
}
