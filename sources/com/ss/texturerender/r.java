package com.ss.texturerender;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public final class r implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public Handler f151868a;

    /* renamed from: b  reason: collision with root package name */
    public Choreographer f151869b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f151870c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<a> f151871d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager f151872e;

    static {
        Covode.recordClassIndex(101270);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Handler f151874a;

        static {
            Covode.recordClassIndex(101272);
        }

        public a(Handler handler) {
            this.f151874a = handler;
        }
    }

    public final void a(a aVar) {
        l.a("VsyncHelper", "addObserver");
        if (aVar != null) {
            Message obtainMessage = this.f151868a.obtainMessage(29);
            obtainMessage.obj = aVar;
            obtainMessage.sendToTarget();
        }
    }

    public final void doFrame(long j2) {
        Iterator<a> it = this.f151871d.iterator();
        while (it.hasNext()) {
            it.next().f151874a.sendEmptyMessage(28);
        }
        this.f151869b.postFrameCallback(this);
    }

    public r(Context context) {
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.f151868a = handler;
        handler.post(new Runnable() {
            /* class com.ss.texturerender.r.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101271);
            }

            public final void run() {
                r.this.f151869b = Choreographer.getInstance();
            }
        });
        Display display = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f151872e = (WindowManager) a(applicationContext, "window");
        } else {
            this.f151872e = null;
        }
        WindowManager windowManager = this.f151872e;
        if (windowManager == null || (display = windowManager.getDefaultDisplay()) == null) {
            this.f151870c = 16666666;
        } else {
            double refreshRate = (double) display.getRefreshRate();
            Double.isNaN(refreshRate);
            this.f151870c = (long) (1.0E9d / refreshRate);
        }
        l.a("VsyncHelper", "vsyncDurationNs:" + this.f151870c + "defaultDisplay:" + display);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.ArrayList<com.ss.texturerender.r$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean handleMessage(Message message) {
        Choreographer choreographer;
        Choreographer choreographer2;
        switch (message.what) {
            case 28:
                break;
            case 29:
                if (!this.f151871d.contains(message.obj)) {
                    this.f151871d.add(message.obj);
                }
                if (this.f151871d.size() == 1 && (choreographer = this.f151869b) != null) {
                    choreographer.postFrameCallback(this);
                    break;
                }
            case 30:
                this.f151871d.remove(message.obj);
                if (this.f151871d.size() == 0 && (choreographer2 = this.f151869b) != null) {
                    choreographer2.removeFrameCallback(this);
                }
                return true;
            default:
                return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10701);
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
                    MethodCollector.o(10701);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
