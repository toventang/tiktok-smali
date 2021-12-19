package com.ss.ttvideoengine.h;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.ttvideoengine.s.j;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final Context f152614a;

    /* renamed from: b  reason: collision with root package name */
    public b f152615b;

    /* renamed from: c  reason: collision with root package name */
    volatile int f152616c = 65280;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f152617d;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<String> f152618e;

    /* renamed from: f  reason: collision with root package name */
    private a f152619f;

    public interface b {
        static {
            Covode.recordClassIndex(101609);
        }

        void a(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(101607);
    }

    public final void a() {
        b(this.f152614a);
    }

    public final ArrayList<String> d() {
        return new ArrayList<>(this.f152618e);
    }

    public final boolean c() {
        if (this.f152616c == 65280) {
            this.f152616c = a(this.f152614a);
        }
        if ((this.f152616c & 2) != 0) {
            return true;
        }
        return false;
    }

    private void e() {
        if (b()) {
            a(true, false);
        }
        if (c()) {
            a(true, true);
        }
        if (!c() && !b()) {
            a(false, false);
        }
    }

    public final boolean b() {
        if (this.f152616c == 65280) {
            this.f152616c = a(this.f152614a);
        }
        if ((this.f152616c & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(101608);
        }

        private a() {
        }

        /* synthetic */ a(h hVar, byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                j.b("HeadsetStateMonitor", "onReceiver: ".concat(String.valueOf(intent.getAction())));
                String action = intent.getAction();
                action.hashCode();
                if (action.equals("android.intent.action.HEADSET_PLUG")) {
                    int intExtra = intent.getIntExtra("state", -1);
                    if (intExtra == 1) {
                        h.this.a(1);
                    } else if (intExtra == 0) {
                        h.this.b(1);
                    }
                } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra2 == 2) {
                        h.this.a(2);
                    } else if (intExtra2 == 0) {
                        h.this.b(2);
                    }
                }
            }
        }
    }

    private void b(Context context) {
        a aVar = this.f152619f;
        if (aVar != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception e2) {
                j.c("HeadsetStateMonitor", e2.getMessage());
            }
            this.f152619f = null;
        }
    }

    public h(Context context) {
        this.f152614a = context;
        this.f152618e = new ArrayList<>();
        com.ss.ttvideoengine.s.b.a(new i(this));
        if (this.f152619f == null) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            a aVar = new a(this, (byte) 0);
            this.f152619f = aVar;
            b(context, aVar, intentFilter);
        }
    }

    public final void b(int i2) {
        boolean z;
        j.b("HeadsetStateMonitor", "onDisconnected");
        if (this.f152616c == 65280) {
            this.f152616c = a(this.f152614a);
        }
        int i3 = (i2 ^ -1) & this.f152616c;
        if (i3 != this.f152616c) {
            this.f152616c = i3;
            e();
            this.f152617d = System.currentTimeMillis();
            b bVar = this.f152615b;
            if (bVar != null) {
                if (b() || c()) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.a(z, c());
            }
        }
    }

    static int a(Context context) {
        try {
            AudioManager audioManager = (AudioManager) a(context, DataType.AUDIO);
            if (audioManager == null) {
                j.e("HeadsetStateMonitor", "AudioManager is null");
                return 65280;
            } else if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT == 25) {
                boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
                if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
                    return (isWiredHeadsetOn ? 1 : 0) | 2;
                }
                return isWiredHeadsetOn ? 1 : 0;
            } else {
                AudioDeviceInfo[] devices = audioManager.getDevices(2);
                int i2 = 0;
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        i2 |= 1;
                        j.b("HeadsetStateMonitor", "wired device: " + ((Object) audioDeviceInfo.getProductName()));
                    }
                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                        i2 |= 2;
                        j.b("HeadsetStateMonitor", "bluetooth device: " + ((Object) audioDeviceInfo.getProductName()));
                    }
                }
                return i2;
            }
        } catch (Throwable unused) {
            return 65280;
        }
    }

    public final void a(int i2) {
        boolean z;
        j.b("HeadsetStateMonitor", "onConnected, ".concat(String.valueOf(i2)));
        if (this.f152616c == 65280) {
            this.f152616c = a(this.f152614a);
        }
        int i3 = this.f152616c | i2;
        if (i3 != this.f152616c) {
            this.f152616c = i3;
            e();
            this.f152617d = System.currentTimeMillis();
            b bVar = this.f152615b;
            if (bVar != null) {
                boolean z2 = false;
                if (b() || c()) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == 2) {
                    z2 = true;
                }
                bVar.a(z, z2);
            }
        }
    }

    private void a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("bt", Integer.valueOf(z2 ? 1 : 0));
        hashMap.put("con", Integer.valueOf(z ? 1 : 0));
        this.f152618e.add(new JSONObject(hashMap).toString());
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13838);
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
                    MethodCollector.o(13838);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.h.h.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
