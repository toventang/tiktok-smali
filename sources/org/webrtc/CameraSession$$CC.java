package org.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import org.webrtc.VideoFrame;

public abstract /* synthetic */ class CameraSession$$CC {
    static {
        Covode.recordClassIndex(106541);
    }

    public static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix$$STATIC$$(TextureBufferImpl textureBufferImpl, boolean z, int i2) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate((float) i2);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    public static int getDeviceOrientation$$STATIC$$(Context context) {
        int rotation = ((WindowManager) org_webrtc_CameraSession$$CC_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            return rotation != 2 ? rotation != 3 ? 0 : 270 : LiveFeedRefreshTimeSetting.DEFAULT;
        }
        return 90;
    }

    public static Object org_webrtc_CameraSession$$CC_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
