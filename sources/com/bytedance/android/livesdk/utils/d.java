package com.bytedance.android.livesdk.utils;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.f.y;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<AudioManager.OnAudioFocusChangeListener> f22319a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static ComponentName f22320b = new ComponentName(y.e().getPackageName(), a.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static AudioManager f22321c = ((AudioManager) a(y.e(), DataType.AUDIO));

    /* renamed from: d  reason: collision with root package name */
    private static AudioManager.OnAudioFocusChangeListener f22322d = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.bytedance.android.livesdk.utils.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13176);
        }

        public final void onAudioFocusChange(int i2) {
            for (AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener : new HashSet(d.f22319a)) {
                onAudioFocusChangeListener.onAudioFocusChange(i2);
            }
        }
    };

    static class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(13177);
        }

        public void onReceive(Context context, Intent intent) {
        }

        private a() {
        }
    }

    public static int a() {
        int i2;
        try {
            i2 = f22321c.requestAudioFocus(f22322d, 3, 2);
            if (i2 == 1) {
                try {
                    f22321c.registerMediaButtonEventReceiver(f22320b);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            i2 = 0;
            com.bytedance.android.live.core.c.a.a(5, "AudioFocusUtil", "gainFocus error");
            return i2;
        }
        return i2;
    }

    public static void b() {
        try {
            f22321c.unregisterMediaButtonEventReceiver(f22320b);
            f22321c.abandonAudioFocus(f22322d);
        } catch (Exception unused) {
            com.bytedance.android.live.core.c.a.a(5, "AudioFocusUtil", "returnFocus error");
        }
    }

    static {
        Covode.recordClassIndex(13175);
    }

    public static void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f22319a.add(onAudioFocusChangeListener);
    }

    public static void b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Set<AudioManager.OnAudioFocusChangeListener> set = f22319a;
        set.remove(onAudioFocusChangeListener);
        if (set.isEmpty()) {
            b();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13255);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13255);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
