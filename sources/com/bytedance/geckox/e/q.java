package com.bytedance.geckox.e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.q.b;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class q extends d<Pair<a, UpdatePackage>, Pair<a, UpdatePackage>> {
    static {
        Covode.recordClassIndex(17313);
    }

    private static boolean a(File file) {
        MethodCollector.i(7165);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7165);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7165);
        return delete;
    }

    /* access modifiers changed from: private */
    public Object a(b<Pair<a, UpdatePackage>> bVar, Pair<a, UpdatePackage> pair) {
        MethodCollector.i(7139);
        com.bytedance.geckox.i.a.a("start unzip, channel:", ((UpdatePackage) pair.second).getChannel());
        a aVar = (a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = aVar.f().getParentFile();
        com.bytedance.q.a.a e2 = null;
        int i2 = 0;
        while (true) {
            try {
                File file = new File(parentFile, updatePackage.getChannel());
                if (file.exists()) {
                    com.bytedance.geckox.utils.e.a(file);
                }
                if (i2 < 2) {
                    try {
                        aVar.b(0);
                        com.bytedance.geckox.utils.q.a(new com.bytedance.geckox.buffer.a.a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel(), i2);
                        aVar.a();
                        File file2 = new File(parentFile, "res");
                        com.bytedance.geckox.utils.e.a(file2);
                        if (new File(parentFile, updatePackage.getChannel()).renameTo(file2)) {
                            int i3 = com.bytedance.geckox.a.a().f29709g;
                            if (i3 >= 2 || (i3 == 1 && updatePackage.getIsZstd())) {
                                a(aVar.f());
                            }
                            if (updatePackage.getIsZstd()) {
                                HashMap hashMap = new HashMap();
                                com.bytedance.geckox.b.a(file2, file2, hashMap);
                                File file3 = new File(file2.getParentFile(), "modify_time");
                                if (file3.exists()) {
                                    com.bytedance.geckox.b.a(file3);
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                try {
                                    objectOutputStream.writeObject(hashMap);
                                    fileOutputStream.close();
                                    objectOutputStream.close();
                                } catch (Throwable th) {
                                    fileOutputStream.close();
                                    objectOutputStream.close();
                                    MethodCollector.o(7139);
                                    throw th;
                                }
                            }
                            Object a2 = bVar.a(pair);
                            MethodCollector.o(7139);
                            return a2;
                        }
                        RuntimeException runtimeException = new RuntimeException("rename file failed:" + parentFile.getAbsolutePath());
                        MethodCollector.o(7139);
                        throw runtimeException;
                    } catch (com.bytedance.q.a.a e3) {
                        e2 = e3;
                        i2++;
                    }
                } else {
                    com.bytedance.geckox.utils.e.a(parentFile);
                    MethodCollector.o(7139);
                    throw e2;
                }
            } catch (Exception e4) {
                RuntimeException runtimeException2 = new RuntimeException(com.a.a("unzip failed, channel:%s, pkg id:%d, msg:%s", new Object[]{updatePackage.getChannel(), Long.valueOf(updatePackage.getPackage().getId()), e4.getMessage()}), e4);
                MethodCollector.o(7139);
                throw runtimeException2;
            }
        }
    }
}
