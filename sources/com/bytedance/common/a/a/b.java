package com.bytedance.common.a.a;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.common.a.d.d;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static File f26693a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f26694b;

    /* renamed from: c  reason: collision with root package name */
    File f26695c;

    static {
        Covode.recordClassIndex(15748);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        List<String> f26696a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        File f26697b;

        static {
            Covode.recordClassIndex(15749);
        }

        public final b a() {
            b bVar = new b();
            bVar.f26694b = this.f26696a;
            bVar.f26695c = this.f26697b;
            return bVar;
        }

        public final a a(String str) {
            this.f26696a.add(str);
            return this;
        }
    }

    public final int a() {
        File file;
        if (f26693a == null) {
            if (d.a() || d.b() || d.c()) {
                file = com.bytedance.common.a.d.b.b("cvt");
            } else {
                file = null;
            }
            f26693a = file;
        }
        File file2 = f26693a;
        int i2 = -1;
        if (file2 != null && file2.exists()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(f26693a.getAbsolutePath());
            arrayList.addAll(this.f26694b);
            try {
                SystemClock.uptimeMillis();
                ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
                if (d.b()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.runtime/lib");
                }
                if (d.c()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.art/lib");
                }
                if (this.f26695c != null && Build.VERSION.SDK_INT >= 26) {
                    processBuilder.redirectOutput(this.f26695c);
                }
                i2 = processBuilder.start().waitFor();
                SystemClock.uptimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Exception unused) {
            }
        }
        return i2;
    }
}
