package com.ss.android.newmedia.d;

import android.app.IntentService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.message.d;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public abstract class a extends IntentService implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private WeakHandler f59938a;

    /* renamed from: b  reason: collision with root package name */
    private Messenger f59939b;

    static {
        Covode.recordClassIndex(37045);
    }

    public abstract void a(Context context, String str);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
    }

    public a() {
        super("MessageReceiverService");
    }

    private Handler a() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public IBinder onBind(final Intent intent) {
        if (intent != null) {
            d.a().a(new Runnable() {
                /* class com.ss.android.newmedia.d.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37047);
                }

                public final void run() {
                    a.this.onHandleIntent(intent);
                    a.this.stopSelf();
                }
            }, 0);
        }
        if (this.f59939b == null) {
            this.f59938a = new WeakHandler(this);
            this.f59939b = new Messenger(this.f59938a);
        }
        return this.f59939b.getBinder();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        boolean z;
        if (intent != null) {
            try {
                String action = intent.getAction();
                b.b();
                if (b.c()) {
                    try {
                        if ("com.ss.android.message".equals(action)) {
                            String str = null;
                            if ("com.ss.android.message".equals(intent.getAction())) {
                                str = a(intent, "message_data");
                            }
                            if (!m.a(str)) {
                                a((Context) this, str);
                                PowerManager powerManager = (PowerManager) a(this, "power");
                                b.b();
                                if (b.f().f()) {
                                    if (Build.VERSION.SDK_INT >= 20) {
                                        z = powerManager.isInteractive();
                                    } else {
                                        z = powerManager.isScreenOn();
                                    }
                                    if (!z) {
                                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435462, "MessageReceiverService");
                                        b.b();
                                        newWakeLock.acquire((long) b.f().g());
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(a aVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return aVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return aVar.getSystemService(str);
        } else if (!i.f107219a) {
            return aVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = aVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public int onStartCommand(final Intent intent, int i2, final int i3) {
        try {
            return super.onStartCommand(intent, i2, i3);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            if (a() != null) {
                return 2;
            }
            d.a().a(new Runnable() {
                /* class com.ss.android.newmedia.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37046);
                }

                public final void run() {
                    try {
                        a.this.onHandleIntent(intent);
                        a.this.stopSelf(i3);
                    } catch (Throwable unused) {
                    }
                }
            }, 0);
            return 2;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
