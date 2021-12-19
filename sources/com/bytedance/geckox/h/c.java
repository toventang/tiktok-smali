package com.bytedance.geckox.h;

import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.utils.FileLock;
import com.bytedance.geckox.utils.e;
import com.bytedance.geckox.utils.g;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Pair<FileLock, AtomicLong>> f29905a = new HashMap();

    static {
        Covode.recordClassIndex(17339);
    }

    public static boolean a(String str) {
        MethodCollector.i(10861);
        Map<String, Pair<FileLock, AtomicLong>> map = f29905a;
        synchronized (map) {
            try {
                FileLock b2 = FileLock.b(str);
                if (b2 == null) {
                    return false;
                }
                Pair<FileLock, AtomicLong> pair = map.get(str);
                if (pair == null || ((AtomicLong) pair.second).get() == 0) {
                    File parentFile = new File(str).getParentFile();
                    final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
                    boolean renameTo = parentFile.renameTo(file);
                    b2.a();
                    b2.b();
                    if (renameTo) {
                        g.a().execute(new Runnable() {
                            /* class com.bytedance.geckox.h.c.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(17340);
                            }

                            public final void run() {
                                e.a(file);
                            }
                        });
                    }
                    MethodCollector.o(10861);
                    return renameTo;
                }
                b2.a();
                FileLock.a(str, Process.myPid());
                MethodCollector.o(10861);
                return false;
            } finally {
                MethodCollector.o(10861);
            }
        }
    }
}
