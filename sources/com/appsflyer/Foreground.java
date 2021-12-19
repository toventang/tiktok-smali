package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Foreground {
    public static long CHECK_DELAY = 500;
    public static Listener listener;

    public interface Listener {
        static {
            Covode.recordClassIndex(2692);
        }

        void onBecameBackground(Context context);

        void onBecameForeground(Activity activity);
    }

    static {
        Covode.recordClassIndex(2686);
    }

    public static Context com_appsflyer_Foreground_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m112(Context context, final Listener listener2) {
        listener = listener2;
        AnonymousClass4 r1 = new Application.ActivityLifecycleCallbacks() {
            /* class com.appsflyer.Foreground.AnonymousClass4 */

            /* renamed from: ǃ  reason: contains not printable characters */
            private Executor f135 = com_appsflyer_Foreground$4_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();

            /* renamed from: ɩ  reason: contains not printable characters */
            boolean f136 = true;

            /* renamed from: Ι  reason: contains not printable characters */
            boolean f137;

            static {
                Covode.recordClassIndex(2687);
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public static ExecutorService com_appsflyer_Foreground$4_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
                l.a a2 = l.a(o.FIXED);
                a2.f79174c = 1;
                return g.a(a2.a());
            }

            public final void onActivityPaused(final Activity activity) {
                this.f135.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.AnonymousClass4.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(2688);
                    }

                    public final void run() {
                        AnonymousClass4.this.f136 = true;
                        final Context com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(activity);
                        try {
                            new Timer().schedule(new TimerTask() {
                                /* class com.appsflyer.Foreground.AnonymousClass4.AnonymousClass3.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(2689);
                                }

                                public final void run() {
                                    if (AnonymousClass4.this.f137 && AnonymousClass4.this.f136) {
                                        AnonymousClass4.this.f137 = false;
                                        try {
                                            listener2.onBecameBackground(com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                                        } catch (Exception e2) {
                                            AFLogger.afErrorLog("Listener threw exception! ", e2);
                                        }
                                    }
                                }
                            }, Foreground.CHECK_DELAY);
                        } catch (Throwable th) {
                            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                        }
                    }

                    public static Context com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
                        Context applicationContext = context.getApplicationContext();
                        if (a.f107168c && applicationContext == null) {
                            return a.f107166a;
                        }
                        return applicationContext;
                    }
                });
            }

            public final void onActivityResumed(final Activity activity) {
                this.f135.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.AnonymousClass4.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(2691);
                    }

                    public final void run() {
                        if (!AnonymousClass4.this.f137) {
                            try {
                                listener2.onBecameForeground(activity);
                            } catch (Exception e2) {
                                AFLogger.afErrorLog("Listener thrown an exception: ", e2);
                            }
                        }
                        AnonymousClass4.this.f136 = false;
                        AnonymousClass4.this.f137 = true;
                    }
                });
            }

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                this.f135.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.AnonymousClass4.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(2690);
                    }

                    public final void run() {
                        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
                    }
                });
            }
        };
        if (context instanceof Activity) {
            r1.onActivityResumed((Activity) context);
        }
        ((Application) com_appsflyer_Foreground_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)).registerActivityLifecycleCallbacks(r1);
    }
}
