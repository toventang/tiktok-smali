package com.ss.android.ugc.aweme.commerce.a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class l {

    /* renamed from: e  reason: collision with root package name */
    private static final String f73384e = l.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    Context f73385a;

    /* renamed from: b  reason: collision with root package name */
    boolean f73386b;

    /* renamed from: c  reason: collision with root package name */
    a f73387c;

    /* renamed from: d  reason: collision with root package name */
    public b f73388d;

    /* renamed from: f  reason: collision with root package name */
    private AudioManager f73389f;

    /* renamed from: g  reason: collision with root package name */
    private int f73390g = -1;

    public interface b {
        static {
            Covode.recordClassIndex(45180);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(45178);
    }

    public final int a() {
        AudioManager audioManager = this.f73389f;
        if (audioManager == null) {
            return -1;
        }
        try {
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        AudioManager audioManager = this.f73389f;
        int i2 = -1;
        if (audioManager != null) {
            try {
                i2 = audioManager.getStreamMaxVolume(3);
            } catch (Exception unused) {
            }
        }
        this.f73390g = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private l f73391a;

        /* renamed from: b  reason: collision with root package name */
        private int f73392b;

        static {
            Covode.recordClassIndex(45179);
        }

        a(l lVar) {
            this.f73391a = lVar;
            this.f73392b = lVar.a();
        }

        public final void onReceive(Context context, Intent intent) {
            l lVar;
            if ((("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) && (lVar = this.f73391a) != null) {
                b bVar = lVar.f73388d;
                int i2 = this.f73392b;
                int a2 = lVar.a();
                this.f73392b = a2;
                if (bVar == null) {
                    return;
                }
                if (a2 == 0) {
                    if (i2 > 0) {
                        bVar.b();
                    }
                } else if (a2 > 0 && i2 == 0) {
                    bVar.a();
                }
            }
        }
    }

    public l(Context context) {
        this.f73385a = context;
        this.f73389f = (AudioManager) a(context, DataType.AUDIO);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11548);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11548);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.a.l.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
