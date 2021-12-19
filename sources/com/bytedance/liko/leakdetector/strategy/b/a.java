package com.bytedance.liko.leakdetector.strategy.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.liko.leakdetector.a.c;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;
import java.io.File;
import java.io.FileWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f40139b;

    /* renamed from: a  reason: collision with root package name */
    private Context f40140a;

    static {
        Covode.recordClassIndex(24734);
    }

    private a(Context context) {
        this.f40140a = context;
    }

    public static void a(Context context) {
        f40139b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new a(context));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Long l2;
        boolean z;
        SharedPreferences a2;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        SharedPreferences a3;
        MethodCollector.i(4487);
        Context context = this.f40140a;
        if (context == null || (a3 = d.a(context, "LeakDetectorSp", 0)) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(a3.getLong("ld_oom_dump_time", -1));
        }
        if (System.currentTimeMillis() - l2.longValue() < 3600000) {
            z = true;
        } else {
            z = false;
        }
        if ((th instanceof OutOfMemoryError) && !z) {
            try {
                File a4 = com.bytedance.liko.leakdetector.a.a.a(MemoryConfig.getMemoryConfig().oversea, this.f40140a);
                if (a4 != null) {
                    a4.getAbsolutePath();
                    Debug.dumpHprofData(a4.getAbsolutePath());
                    File parentFile = a4.getParentFile();
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    l.c(".stacks", "");
                    l.c(stackTrace, "");
                    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
                    l.a((Object) format, "");
                    ArrayList arrayList = new ArrayList();
                    FileWriter fileWriter = new FileWriter(new File(parentFile, ".stacks"));
                    arrayList.add("OOM Time:".concat(String.valueOf(format)));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        arrayList.add(String.valueOf(stackTraceElement.getLineNumber()) + " className = " + stackTraceElement.getClassName() + ", methodName = " + stackTraceElement.getMethodName());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        fileWriter.write(((String) it.next()) + '\n');
                    }
                    fileWriter.close();
                    Context context2 = this.f40140a;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!(context2 == null || (a2 = d.a(context2, "LeakDetectorSp", 0)) == null || (edit = a2.edit()) == null || (putLong = edit.putLong("ld_oom_dump_time", currentTimeMillis)) == null)) {
                        putLong.commit();
                    }
                    c.b(this.f40140a, a4.getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f40139b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        MethodCollector.o(4487);
    }
}
