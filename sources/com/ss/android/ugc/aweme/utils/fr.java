package com.ss.android.ugc.aweme.utils;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.jato.c;
import com.bytedance.common.jato.gcblocker.GcBlocker;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.c.a;
import com.ss.android.common.c.b;
import com.ss.android.ugc.aweme.lego.p;

public final class fr {

    /* renamed from: a  reason: collision with root package name */
    static int f142947a;

    /* renamed from: b  reason: collision with root package name */
    static int f142948b;

    /* renamed from: c  reason: collision with root package name */
    static int f142949c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f142950d;

    static {
        Covode.recordClassIndex(93536);
    }

    public static boolean a() {
        if (m.a(d.s, "local_test") || m.a(d.s, "rhea")) {
            return true;
        }
        return false;
    }

    public static void a(Runnable runnable) {
        p.f107614a.postDelayed(runnable, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    public static void a(long j2) {
        p.f107614a.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93537);
            }

            public final void run() {
                c.a();
                GcBlocker.a();
                fr.f142947a++;
            }
        });
        p.f107614a.postDelayed(new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93538);
            }

            public final void run() {
                if (fr.f142947a < 2) {
                    GcBlocker.b();
                }
                fr.f142947a--;
            }
        }, j2);
    }

    public static void b(long j2) {
        p.f107614a.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass4 */

            static {
                Covode.recordClassIndex(93540);
            }

            public final void run() {
                b.f59365a = true;
                b.f59367c = 0;
                fr.f142948b++;
            }
        });
        p.f107614a.postDelayed(new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass5 */

            static {
                Covode.recordClassIndex(93541);
            }

            public final void run() {
                if (fr.f142948b < 2) {
                    a.a();
                }
                fr.f142948b--;
            }
        }, j2);
    }

    public static void c(long j2) {
        com.bytedance.monitor.collector.d.f41460d = true;
        com.bytedance.monitor.collector.d.f41462f = 1;
        f142949c++;
        p.f107614a.postDelayed(new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass7 */

            static {
                Covode.recordClassIndex(93543);
            }

            public final void run() {
                if (fr.f142949c < 2) {
                    com.bytedance.monitor.collector.d.f41460d = false;
                }
                fr.f142949c--;
            }
        }, j2);
    }
}
