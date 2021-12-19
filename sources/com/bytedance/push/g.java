package com.bytedance.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.i;
import com.bytedance.push.i.f;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.h;
import com.bytedance.push.third.PushManager;
import com.ss.android.message.NotifyService;
import com.ss.android.pushmanager.a.b;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public f f42164a = new f(this);

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, Boolean> f42165b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25765);
    }

    g() {
    }

    @Override // com.bytedance.push.c.i
    public final void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(new Runnable(false) {
                /* class com.bytedance.push.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f42166a = false;

                static {
                    Covode.recordClassIndex(25766);
                }

                public final void run() {
                    g.this.f42164a.a(this.f42166a);
                }
            });
        } else {
            this.f42164a.a(false);
        }
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private void d(Context context) {
        for (Integer num : com.bytedance.push.third.f.a(context).b()) {
            int intValue = num.intValue();
            if (context != null) {
                PushManager.inst().unregisterPush(c(context), intValue);
            }
        }
        this.f42165b.clear();
    }

    @Override // com.bytedance.push.c.i
    public final boolean b(Context context) {
        if (!TextUtils.equals(com.bytedance.push.third.f.a(context).c().toString(), ((LocalFrequencySettings) h.a(context, LocalFrequencySettings.class)).f())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.push.c.i
    public final boolean a(Context context) {
        b.b();
        boolean z = false;
        if (b.c()) {
            for (Integer num : com.bytedance.push.third.f.a(context).b()) {
                z |= a(context, num.intValue());
            }
            final Context c2 = c(context);
            Intent intent = new Intent(c2, NotifyService.class);
            try {
                b.AbstractC1307b bVar = (b.AbstractC1307b) com.ss.android.ug.bus.b.a(b.AbstractC1307b.class);
                if (bVar == null || bVar.g()) {
                    a(c2, intent);
                }
                AnonymousClass2 r2 = new ServiceConnection() {
                    /* class com.bytedance.push.g.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(25767);
                    }

                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        try {
                            c2.unbindService(this);
                        } catch (Throwable unused) {
                        }
                    }
                };
                if (c2 == null || !(c2 instanceof Context)) {
                    c2.bindService(intent, r2, 1);
                } else if (!d.a(c2, intent)) {
                    c2.bindService(intent, r2, 1);
                }
            } catch (Throwable unused) {
            }
        } else {
            d(context);
        }
        return z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (com.bytedance.push.third.f.c(r9) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8857);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8857);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        com.bytedance.push.third.PushManager.inst().registerPush(r3, r9);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8857);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r8, int r9) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g.a(android.content.Context, int):boolean");
    }

    @Override // com.bytedance.push.c.i
    public final void a(Context context, String str, int i2) {
        PushManager.inst().setAlias(context, str, i2);
    }
}
