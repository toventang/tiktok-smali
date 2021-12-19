package com.ss.android.common.applog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static String f59264a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f59265d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59266b;

    /* renamed from: c  reason: collision with root package name */
    BlockingQueue<a> f59267c = new LinkedBlockingQueue();

    static {
        Covode.recordClassIndex(36621);
    }

    private f() {
    }

    public static f a() {
        MethodCollector.i(6957);
        if (f59265d == null) {
            synchronized (f.class) {
                try {
                    if (f59265d == null) {
                        f59265d = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6957);
                    throw th;
                }
            }
        }
        f fVar = f59265d;
        MethodCollector.o(6957);
        return fVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017 A[Catch:{ all -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.f.run():void");
    }

    public final void a(String str, JSONArray jSONArray) {
        if (this.f59266b && !TextUtils.isEmpty(str) && jSONArray != null && jSONArray.length() > 0) {
            this.f59267c.add(new a(str, jSONArray));
        }
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f59268a;

        /* renamed from: b  reason: collision with root package name */
        JSONArray f59269b;

        static {
            Covode.recordClassIndex(36622);
        }

        public a(String str, JSONArray jSONArray) {
            this.f59268a = str;
            this.f59269b = jSONArray;
        }
    }
}
