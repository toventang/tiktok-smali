package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ss.android.ugc.aweme.power.d;
import com.ss.b.c;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Context f142482a;

    /* renamed from: b  reason: collision with root package name */
    public int f142483b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f142484c;

    static {
        Covode.recordClassIndex(93188);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.b(new d(activity), r.a());
            this.f142484c = false;
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.b(new c(activity), r.a());
            this.f142484c = true;
            Context applicationContext = activity.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (this.f142482a == null && applicationContext != null) {
                this.f142482a = applicationContext;
                g.d().scheduleAtFixedRate(new Runnable() {
                    /* class com.ss.android.ugc.aweme.util.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(93189);
                    }

                    public final void run() {
                        boolean z;
                        String str;
                        int intExtra;
                        if (b.this.f142484c || Build.VERSION.SDK_INT >= 21) {
                            int d2 = (int) c.d(b.this.f142482a);
                            Intent a2 = b.a(b.this.f142482a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (a2 == null || (intExtra = a2.getIntExtra("status", -1)) == 2 || intExtra == 5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d2 >= 0 && d2 <= 100) {
                                s a3 = new s().a("capacity", String.valueOf(d2)).a("ischarging", String.valueOf(z));
                                b bVar = b.this;
                                int i2 = bVar.f142483b + 1;
                                bVar.f142483b = i2;
                                JSONObject a4 = a3.a("reportindex", String.valueOf(i2)).a();
                                try {
                                    if (d.a().f115709a) {
                                        str = "1";
                                    } else {
                                        str = "0";
                                    }
                                    a4.put("is_battery_saver", str);
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                                if (com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
                                    r.a("battery_capacity", a4);
                                }
                            }
                        }
                    }
                }, 300, 300, TimeUnit.SECONDS);
            }
        }
    }

    private static Intent b(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    public static Intent a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(com.bytedance.ies.ugc.appcontext.g.a());
        try {
            return b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
