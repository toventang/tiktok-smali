package com.ss.android.ugc.aweme.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public AudioManager f143187a;

    /* renamed from: b  reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f143188b = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.ss.android.ugc.aweme.utils.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93725);
        }

        public final void onAudioFocusChange(int i2) {
        }
    };

    static {
        Covode.recordClassIndex(93724);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public t(Context context) {
        this.f143187a = (AudioManager) a(a(context), DataType.AUDIO);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1020);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1020);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
