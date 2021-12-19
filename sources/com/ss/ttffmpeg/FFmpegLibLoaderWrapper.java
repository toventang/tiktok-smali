package com.ss.ttffmpeg;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;
import java.util.List;

public final class FFmpegLibLoaderWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f151880a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f151881b;

    static {
        Covode.recordClassIndex(101274);
    }

    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ttcrypto");
        arrayList.add("ttboringssl");
        arrayList.add("ttffmpeg");
        return arrayList;
    }

    public static synchronized String getFFmpegVersion() {
        synchronized (FFmpegLibLoaderWrapper.class) {
            MethodCollector.i(11132);
            MethodCollector.o(11132);
        }
        return "1.1.62.10-mt";
    }

    public static synchronized boolean b() {
        synchronized (FFmpegLibLoaderWrapper.class) {
            MethodCollector.i(11282);
            boolean z = true;
            if (f151881b) {
                MethodCollector.o(11282);
                return true;
            } else if (f151880a != null) {
                boolean a2 = f151880a.a();
                f151881b = a2;
                MethodCollector.o(11282);
                return a2;
            } else {
                try {
                    a("ttmverify");
                } catch (UnsatisfiedLinkError unused) {
                    try {
                        a("ttmverifylite");
                        CustomVerify._init();
                    } catch (UnsatisfiedLinkError unused2) {
                        z = false;
                    }
                }
                f151881b = z;
                MethodCollector.o(11282);
                return z;
            }
        }
    }

    private static void a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
