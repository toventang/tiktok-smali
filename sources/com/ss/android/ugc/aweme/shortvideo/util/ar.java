package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class ar implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ar f132216a = new ar();

    /* renamed from: b  reason: collision with root package name */
    public TextView f132217b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f132218c;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f132219d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f132220e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f132221f;

    /* renamed from: g  reason: collision with root package name */
    private Context f132222g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f132223h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    private Handler f132224i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f132225j;

    /* renamed from: k  reason: collision with root package name */
    private volatile long f132226k = 2500;

    /* renamed from: l  reason: collision with root package name */
    private int f132227l = 0;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f132228m = false;

    static {
        Covode.recordClassIndex(86596);
    }

    private static long d() {
        try {
            return Runtime.getRuntime().maxMemory();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void a() {
        this.f132222g = null;
        this.f132217b = null;
        this.f132224i.sendEmptyMessage(1);
    }

    private ar() {
        g.a();
        this.f132226k = 2500;
        this.f132228m = false;
        this.f132224i = new Handler(v.a(), this);
    }

    private void c() {
        com.ss.android.ugc.aweme.shortvideo.ar arVar = new com.ss.android.ugc.aweme.shortvideo.ar();
        arVar.a("dalvikPss", Long.valueOf(this.f132218c));
        arVar.a("nativePss", Long.valueOf(this.f132219d));
        arVar.a("otherPss", Long.valueOf(this.f132221f));
        arVar.a("totalPss", Long.valueOf(this.f132220e));
        q.a("av_video_memory", arVar.a());
    }

    public final void b() {
        MethodCollector.i(2610);
        if (!(this.f132217b == null || this.f132225j == null || !this.f132228m)) {
            this.f132225j.removeView(this.f132217b);
            this.f132217b = null;
            this.f132225j = null;
        }
        MethodCollector.o(2610);
    }

    private static Context a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                if (Thread.currentThread().isInterrupted()) {
                    if (this.f132227l > 3) {
                        c();
                    }
                    this.f132227l = 0;
                    return false;
                }
                Context context = this.f132222g;
                if (context != null) {
                    try {
                        ActivityManager activityManager = (ActivityManager) a(context, "activity");
                        if (activityManager != null) {
                            final Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                            this.f132218c = (long) processMemoryInfo[0].dalvikPss;
                            this.f132219d = (long) processMemoryInfo[0].nativePss;
                            this.f132221f = (long) processMemoryInfo[0].otherPss;
                            this.f132220e = (long) processMemoryInfo[0].getTotalPss();
                            bj.d("dalvikPss=" + (processMemoryInfo[0].dalvikPss / 1000) + " nativePss=" + (processMemoryInfo[0].nativePss / 1000) + " otherPss=" + (processMemoryInfo[0].otherPss / 1000) + " totalPss=" + (processMemoryInfo[0].getTotalPss() / 1000) + " MaxMemory=" + (d() / 1000000));
                            if (this.f132228m) {
                                this.f132223h.post(new Runnable() {
                                    /* class com.ss.android.ugc.aweme.shortvideo.util.ar.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(86597);
                                    }

                                    public final void run() {
                                        if (ar.this.f132217b != null) {
                                            ar.this.f132217b.setText("dalvikPss:" + (processMemoryInfo[0].dalvikPss / 1000) + "\nnativePss:" + (processMemoryInfo[0].nativePss / 1000) + "\notherPss:" + (processMemoryInfo[0].otherPss / 1000) + "\ntotalPss:" + (processMemoryInfo[0].getTotalPss() / 1000));
                                        }
                                    }
                                });
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f132227l++;
                this.f132224i.sendEmptyMessageDelayed(0, this.f132226k);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (this.f132227l > 3) {
                    c();
                }
                this.f132227l = 0;
            }
        }
        return false;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2606);
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
                    MethodCollector.o(2606);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(Activity activity, ViewGroup viewGroup) {
        MethodCollector.i(2608);
        if (activity == null || activity.isFinishing() || viewGroup == null || !this.f132228m) {
            MethodCollector.o(2608);
            return;
        }
        this.f132225j = viewGroup;
        this.f132217b = new TextView(a(activity));
        this.f132217b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f132217b.setTextSize(15.0f);
        TextView textView = this.f132217b;
        textView.setTextColor(textView.getResources().getColor(R.color.a2));
        viewGroup.addView(this.f132217b);
        MethodCollector.o(2608);
    }
}
