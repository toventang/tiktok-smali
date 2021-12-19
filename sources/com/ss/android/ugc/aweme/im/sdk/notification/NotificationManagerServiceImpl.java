package com.ss.android.ugc.aweme.im.sdk.notification;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.INotificationManagerService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.notification.a;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class NotificationManagerServiceImpl implements INotificationManagerService {
    static {
        Covode.recordClassIndex(65924);
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final boolean a() {
        return a.C2596a.a().f102831j;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final boolean b() {
        return a.C2596a.a().f102826e;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final Activity c() {
        WeakReference<Activity> weakReference = a.C2596a.a().f102822a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static INotificationManagerService d() {
        MethodCollector.i(6486);
        Object a2 = b.a(INotificationManagerService.class, false);
        if (a2 != null) {
            INotificationManagerService iNotificationManagerService = (INotificationManagerService) a2;
            MethodCollector.o(6486);
            return iNotificationManagerService;
        }
        if (b.bC == null) {
            synchronized (INotificationManagerService.class) {
                try {
                    if (b.bC == null) {
                        b.bC = new NotificationManagerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6486);
                    throw th;
                }
            }
        }
        NotificationManagerServiceImpl notificationManagerServiceImpl = (NotificationManagerServiceImpl) b.bC;
        MethodCollector.o(6486);
        return notificationManagerServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void a(Integer num) {
        a a2 = a.C2596a.a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a2.f102825d = z;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void b(Integer num) {
        a a2 = a.C2596a.a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a2.f102823b = z;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void d(Integer num) {
        a a2 = a.C2596a.a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a2.f102827f = z;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void e(Integer num) {
        a a2 = a.C2596a.a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a2.f102824c = z;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void a(f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        l.d(fVar, "");
        a a2 = a.C2596a.a();
        l.d(fVar, "");
        boolean z4 = false;
        if (fVar.n == 1) {
            z = true;
        } else {
            z = false;
        }
        a2.f102825d = z;
        if (fVar.q == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        a2.f102823b = z2;
        if (fVar.f122573l == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        a2.f102826e = z3;
        if (fVar.f122566e == 1) {
            z4 = true;
        }
        a2.f102827f = z4;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void c(Integer num) {
        a a2 = a.C2596a.a();
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        a2.f102826e = z;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final ViewGroup a(Activity activity) {
        T t;
        Window window;
        a.C2596a.a();
        View view = null;
        if (activity == null) {
            return null;
        }
        if (activity instanceof e) {
            e eVar = (e) activity;
            i supportFragmentManager = eVar.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            List<Fragment> f2 = supportFragmentManager.f();
            l.b(f2, "");
            Iterator<T> it = f2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                if ((t2 instanceof d) && t2.isVisible()) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                Objects.requireNonNull(t3, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
                Dialog dialog = t3.getDialog();
                if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                    view = window.getDecorView();
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    return viewGroup;
                }
            }
            Window window2 = eVar.getWindow();
            l.b(window2, "");
            View decorView = window2.getDecorView();
            Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) decorView;
        }
        Window window3 = activity.getWindow();
        l.b(window3, "");
        View decorView2 = window3.getDecorView();
        Objects.requireNonNull(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) decorView2;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void a(boolean z) {
        a a2 = a.C2596a.a();
        if (!z) {
            bz unused = kotlinx.coroutines.i.a(an.a(bf.f159040a), null, null, new a.c(a2, z, null), 3);
        } else {
            a2.f102829h = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void b(Activity activity) {
        String str;
        String str2;
        String str3;
        String str4;
        a a2 = a.C2596a.a();
        a2.f102822a = new WeakReference<>(activity);
        StringBuilder append = new StringBuilder(" mIsColdStart: ").append(a2.f102830i).append(" activity: ");
        String str5 = null;
        if (activity != null) {
            str = activity.getLocalClassName();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("NotificationManager", append.append(str).toString());
        boolean z = activity instanceof j;
        if (z && a2.f102830i) {
            a2.f102830i = false;
        } else if (IMService.createIIMServicebyMonsterPlugin(false).isNotificationMessageQueueEmpty()) {
            com.ss.android.ugc.aweme.im.service.m.a.b("NotificationManager", " MessageQueue is empty");
        } else {
            if (activity != null) {
                str2 = activity.getLocalClassName();
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, "miniapp.views.MiniAppListH5Activity")) {
                if (activity != null) {
                    str3 = activity.getLocalClassName();
                } else {
                    str3 = null;
                }
                if (!TextUtils.equals(str3, "miniapp.RecentlyUsedMicroAppActivity") && (!z || !((j) activity).isUnderThirdTab())) {
                    if (activity != null) {
                        str4 = activity.getLocalClassName();
                    } else {
                        str4 = null;
                    }
                    if (!TextUtils.equals(str4, "im.sdk.chat.ChatRoomActivity")) {
                        if (activity != null) {
                            str5 = activity.getLocalClassName();
                        }
                        if (!TextUtils.equals(str5, "shortvideo.ui.VideoRecordNewActivity")) {
                            IExternalService a3 = AVExternalServiceImpl.a();
                            if (a3.configService().shortVideoConfig().isRecording()) {
                                return;
                            }
                            if ((activity == null || !a3.publishService().inPublishPage(activity)) && !a2.f102829h) {
                                IMService.createIIMServicebyMonsterPlugin(false).showIMNotification(a2.f102828g);
                                a2.f102828g = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            IMService.createIIMServicebyMonsterPlugin(false).clearIMNotification();
            a2.f102828g = false;
        }
    }
}
