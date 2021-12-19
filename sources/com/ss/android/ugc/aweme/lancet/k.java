package com.ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f107234a;

    static {
        Covode.recordClassIndex(68585);
    }

    private static Handler a() {
        MethodCollector.i(1371);
        if (f107234a == null) {
            synchronized (k.class) {
                try {
                    if (f107234a == null) {
                        f107234a = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1371);
                    throw th;
                }
            }
        }
        Handler handler = f107234a;
        MethodCollector.o(1371);
        return handler;
    }

    private static Activity a(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static void a(Object obj) {
        Activity a2;
        ImageView imageView = (ImageView) obj;
        try {
            if (imageView.getDrawable() != null && (a2 = a(imageView.getContext())) != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (a2.isDestroyed()) {
                    a().postDelayed(new l(new WeakReference(imageView), a2, imageView), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
            }
        } catch (Exception unused) {
        }
    }
}
