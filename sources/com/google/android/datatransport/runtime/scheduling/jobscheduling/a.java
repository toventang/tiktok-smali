package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.c;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49552a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49553b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f49554c;

    /* renamed from: d  reason: collision with root package name */
    private final g f49555d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.d.a f49556e;

    static {
        Covode.recordClassIndex(31004);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3999);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3999);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public final void a(k kVar, int i2) {
        boolean z;
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", kVar.a());
        builder.appendQueryParameter("priority", String.valueOf(com.google.android.datatransport.runtime.e.a.a(kVar.c())));
        if (kVar.b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(kVar.b(), 0));
        }
        Intent intent = new Intent(this.f49552a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (PendingIntent.getBroadcast(this.f49552a, 0, intent, 536870912) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.google.android.datatransport.runtime.a.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", kVar);
            return;
        }
        long a2 = this.f49553b.a(kVar);
        long a3 = this.f49555d.a(kVar.c(), a2, i2);
        com.google.android.datatransport.runtime.a.a.a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", kVar, Long.valueOf(a3), Long.valueOf(a2), Integer.valueOf(i2));
        this.f49554c.set(3, this.f49556e.a() + a3, PendingIntent.getBroadcast(this.f49552a, 0, intent, 0));
    }

    public a(Context context, c cVar, com.google.android.datatransport.runtime.d.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) a(context, "alarm"), aVar, gVar);
    }

    private a(Context context, c cVar, AlarmManager alarmManager, com.google.android.datatransport.runtime.d.a aVar, g gVar) {
        this.f49552a = context;
        this.f49553b = cVar;
        this.f49554c = alarmManager;
        this.f49556e = aVar;
        this.f49555d = gVar;
    }
}
