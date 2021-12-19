package com.ss.videoarch.a.e;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.ttm.player.m;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f154291a;

    /* renamed from: b  reason: collision with root package name */
    public m f154292b = null;

    /* renamed from: c  reason: collision with root package name */
    public float f154293c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f154294d;

    static {
        Covode.recordClassIndex(102868);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float a() {
        /*
            r3 = this;
            android.content.Context r1 = r3.f154291a
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamMaxVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.e.b.a():float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float b() {
        /*
            r3 = this;
            android.content.Context r1 = r3.f154291a
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.a.e.b.b():float");
    }

    public b(Context context) {
        this.f154291a = context;
    }

    public final void a(boolean z) {
        m mVar = this.f154292b;
        if (mVar != null) {
            if (mVar.a()) {
                float a2 = a();
                if (a2 > 0.0f) {
                    this.f154294d = b() / a2;
                }
                if (z) {
                    this.f154292b.a(0.0f, 0.0f);
                    return;
                }
                m mVar2 = this.f154292b;
                float f2 = this.f154294d;
                mVar2.a(f2, f2);
                return;
            }
            this.f154292b.b(z);
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1912);
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
                    MethodCollector.o(1912);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
