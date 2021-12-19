package com.d.a.a.a.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f46318a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f46319b;

    /* renamed from: c  reason: collision with root package name */
    private final a f46320c;

    /* renamed from: d  reason: collision with root package name */
    private final c f46321d;

    /* renamed from: e  reason: collision with root package name */
    private float f46322e;

    static {
        Covode.recordClassIndex(28291);
    }

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f46318a = context;
        this.f46319b = (AudioManager) a(context, DataType.AUDIO);
        this.f46320c = aVar;
        this.f46321d = cVar;
    }

    private float b() {
        return a.a(this.f46319b.getStreamVolume(3), this.f46319b.getStreamMaxVolume(3));
    }

    private void c() {
        this.f46321d.a(this.f46322e);
    }

    public final void a() {
        this.f46322e = b();
        c();
        this.f46318a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6394);
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
                    MethodCollector.o(6394);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float b2 = b();
        if (b2 != this.f46322e) {
            this.f46322e = b2;
            c();
        }
    }
}
