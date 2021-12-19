package com.ss.android.ugc.aweme.t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.cb;
import com.ss.android.ugc.aweme.shortvideo.cq;
import com.ss.android.ugc.aweme.shortvideo.ui.ag;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.ez;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f138537a = "Daily Mix";

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f138538b;

    /* renamed from: com.ss.android.ugc.aweme.t.b$b  reason: collision with other inner class name */
    public interface AbstractC3651b {
        static {
            Covode.recordClassIndex(90632);
        }

        void a();

        void a(ArrayList<String> arrayList);

        void b(ArrayList<String> arrayList);
    }

    static {
        Covode.recordClassIndex(90627);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.t.b$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f138543a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 90630(0x16206, float:1.27E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.t.b$a[] r0 = com.ss.android.ugc.aweme.t.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.t.b.AnonymousClass3.f138543a = r2
                com.ss.android.ugc.aweme.t.b$a r0 = com.ss.android.ugc.aweme.t.b.a.PublishDialogFragmentType     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.t.b.AnonymousClass3.f138543a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.t.b$a r0 = com.ss.android.ugc.aweme.t.b.a.ParallelPublishDialogFragmentType     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.t.b.AnonymousClass3.<clinit>():void");
        }
    }

    public enum a {
        PublishDialogFragmentType,
        ParallelPublishDialogFragmentType;

        static {
            Covode.recordClassIndex(90631);
        }
    }

    public static boolean a() {
        if (!LiveOuterService.s().c().a() || !com.ss.android.ugc.aweme.account.b.g().isLogin() || ai.a().contains("x86")) {
            return false;
        }
        return true;
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(i iVar, a aVar) {
        Fragment a2 = iVar.a("publish");
        if (a2 != null) {
            int i2 = AnonymousClass3.f138543a[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && (a2 instanceof cb)) {
                    ((cb) a2).c();
                }
            } else if (a2 instanceof ag) {
                ((cq) a2).c();
            }
        }
    }

    public static void a(final String str, final String str2) {
        MethodCollector.i(3805);
        if (f138538b == null) {
            synchronized (b.class) {
                try {
                    if (f138538b == null) {
                        l.a a2 = l.a(o.SERIAL);
                        a2.f79173b = "AppsFlyer";
                        f138538b = g.a(a2.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3805);
                    throw th;
                }
            }
        }
        b.i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.t.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(90628);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                UgCommonServiceImpl.j().a().a(str, str2);
                return null;
            }
        }, f138538b);
        MethodCollector.o(3805);
    }

    public static void a(Activity activity, String str) {
        if (activity != null) {
            str.hashCode();
            switch (str.hashCode()) {
                case -1672998758:
                    if (!str.equals("UNLOGIN_PROFILE")) {
                        return;
                    }
                    break;
                case -1382453013:
                    if (!str.equals("NOTIFICATION")) {
                        return;
                    }
                    break;
                case -1116953497:
                    if (str.equals("MUSIC_DSP")) {
                        if (!TextUtils.equals(f138537a, "LIBRARY")) {
                            com.ss.android.ugc.aweme.base.utils.o.a(activity);
                            ez.a(activity);
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
                case 2223327:
                    if (str.equals("HOME")) {
                        com.ss.android.ugc.aweme.base.utils.o.a(activity);
                        ez.a(activity);
                        return;
                    }
                    return;
                case 2614219:
                    if (!str.equals("USER")) {
                        return;
                    }
                    break;
                case 53655674:
                    if (!str.equals("UNLOGIN_NOTIFICATION")) {
                        return;
                    }
                    break;
                case 1055811561:
                    if (!str.equals("DISCOVER")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            com.ss.android.ugc.aweme.base.utils.o.a(activity);
            com.ss.android.ugc.aweme.base.utils.o.b(activity);
        }
    }
}
