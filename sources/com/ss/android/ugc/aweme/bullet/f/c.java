package com.ss.android.ugc.aweme.bullet.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import h.e.q;
import h.f.b.l;
import h.m.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69297a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Collection<String> f69298b;

    static {
        Covode.recordClassIndex(42727);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42728);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.f.b
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f69298b.iterator();
        while (it.hasNext()) {
            long nanoTime = System.nanoTime();
            String a2 = a(it.next());
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public c(Collection<String> collection) {
        l.d(collection, "");
        this.f69298b = collection;
    }

    private static String a(String str) {
        boolean z;
        MethodCollector.i(4825);
        try {
            String b2 = dc.b(k.f145061a.c(), str);
            if (TextUtils.isEmpty(b2)) {
                MethodCollector.o(4825);
                return null;
            }
            File file = new File(b2);
            if (file.exists() && file.listFiles() != null) {
                File[] listFiles = file.listFiles();
                l.b(listFiles, "");
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    File file2 = new File(file, "prefetch.json");
                    if (!file2.exists()) {
                        MethodCollector.o(4825);
                        return null;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), d.f158808a), 8192);
                        try {
                            String a2 = q.a((Reader) bufferedReader);
                            h.e.c.a(bufferedReader, null);
                            MethodCollector.o(4825);
                            return a2;
                        } catch (Throwable th) {
                            h.e.c.a(bufferedReader, th);
                            MethodCollector.o(4825);
                            throw th;
                        }
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                        MethodCollector.o(4825);
                        return null;
                    }
                }
            }
            MethodCollector.o(4825);
            return null;
        } catch (Throwable unused) {
            MethodCollector.o(4825);
            return null;
        }
    }
}
