package com.bytedance.geckox.e.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.c;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Map;

public class b extends d<Pair<a, UpdatePackage>, Pair<a, UpdatePackage>> {
    static {
        Covode.recordClassIndex(17294);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
    }

    private static boolean a(File file) {
        MethodCollector.i(7792);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7792);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7792);
        return delete;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* bridge */ /* synthetic */ Object a(com.bytedance.q.b<Pair<a, UpdatePackage>> bVar, Pair<a, UpdatePackage> pair) {
        return a(bVar, pair);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.io.ObjectInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    private static Object a(com.bytedance.q.b<Pair<a, UpdatePackage>> bVar, Pair<a, UpdatePackage> pair) {
        Throwable th;
        Exception e2;
        Throwable th2;
        Exception e3;
        MethodCollector.i(7782);
        com.bytedance.geckox.i.a.a("start merge dir, channel:", ((UpdatePackage) pair.second).getChannel());
        a aVar = (a) pair.first;
        File f2 = aVar.f();
        aVar.a();
        aVar.e();
        File file = new File(f2.getParentFile().getParentFile(), ((UpdatePackage) pair.second).getLocalVersion() + File.separator + "res");
        File file2 = new File(f2.getParentFile(), "res");
        com.bytedance.geckox.utils.e.c(file2);
        try {
            com.bytedance.geckox.b bVar2 = new com.bytedance.geckox.b();
            if (!file.exists() || file.isFile()) {
                com.bytedance.geckox.c.b bVar3 = new com.bytedance.geckox.c.b(1000, "param src error: " + file.getPath());
                MethodCollector.o(7782);
                throw bVar3;
            } else if (!f2.exists() || f2.isDirectory()) {
                com.bytedance.geckox.c.b bVar4 = new com.bytedance.geckox.c.b(1000, "param patch error: " + f2.getPath());
                MethodCollector.o(7782);
                throw bVar4;
            } else if (file2.exists() && file2.isFile()) {
                com.bytedance.geckox.c.b bVar5 = new com.bytedance.geckox.c.b(1000, "param dest error,  is a file: " + file2.getPath());
                MethodCollector.o(7782);
                throw bVar5;
            } else if (!file2.exists() || !file2.isDirectory() || com.bytedance.geckox.utils.e.c(file2)) {
                bVar2.f29714d = file;
                bVar2.f29715e = file2;
                bVar2.f29716f = f2;
                try {
                    bVar2.f29713c = new RandomAccessFile(bVar2.f29716f, "rw");
                    byte[] bArr = new byte[8];
                    bVar2.f29713c.readFully(bArr);
                    if ("BYTEDIFF".equals(new String(bArr))) {
                        byte readByte = bVar2.f29713c.readByte();
                        if (readByte > 1 || readByte < 0) {
                            com.bytedance.geckox.c.b bVar6 = new com.bytedance.geckox.c.b(1005, "unsupported version: ".concat(String.valueOf((int) readByte)));
                            MethodCollector.o(7782);
                            throw bVar6;
                        }
                        bVar2.f29717g = readByte;
                        ObjectOutputStream objectOutputStream = null;
                        if (readByte > 0) {
                            File file3 = new File(bVar2.f29714d.getParentFile(), "modify_time");
                            if (file3.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file3);
                                try {
                                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                                    try {
                                        bVar2.f29712b = (Map) objectInputStream.readObject();
                                        c.a(fileInputStream);
                                        c.a(objectInputStream);
                                    } catch (Exception e4) {
                                        e3 = e4;
                                        objectOutputStream = objectInputStream;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        objectOutputStream = objectInputStream;
                                        c.a(fileInputStream);
                                        c.a(objectOutputStream);
                                        MethodCollector.o(7782);
                                        throw th2;
                                    }
                                } catch (Exception e5) {
                                    e3 = e5;
                                    try {
                                        com.bytedance.geckox.c.b bVar7 = new com.bytedance.geckox.c.b(1002, com.a.a("read modify_time file error: %s, path: %s", new Object[]{e3.getMessage(), file3.getPath()}));
                                        MethodCollector.o(7782);
                                        throw bVar7;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        c.a(fileInputStream);
                                        c.a(objectOutputStream);
                                        MethodCollector.o(7782);
                                        throw th2;
                                    }
                                }
                            } else {
                                com.bytedance.geckox.c.b bVar8 = new com.bytedance.geckox.c.b(1001, "modify_time file not exist: " + file3.getPath());
                                MethodCollector.o(7782);
                                throw bVar8;
                            }
                        }
                        bVar2.a();
                        bVar2.f29718h = "";
                        if (readByte == 0) {
                            bVar2.b(bVar2.f29714d);
                        } else {
                            bVar2.b();
                        }
                        File file4 = new File(bVar2.f29715e.getParentFile(), "modify_time");
                        if (!file4.exists() || com.bytedance.geckox.b.a(file4)) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file4);
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                                try {
                                    objectOutputStream2.writeObject(bVar2.f29711a);
                                    c.a(fileOutputStream);
                                    c.a(objectOutputStream2);
                                    c.a(bVar2.f29713c);
                                    a(f2);
                                    Object a2 = bVar.a(pair);
                                    MethodCollector.o(7782);
                                    return a2;
                                } catch (Exception e6) {
                                    e2 = e6;
                                    objectOutputStream = objectOutputStream2;
                                    try {
                                        com.bytedance.geckox.c.b bVar9 = new com.bytedance.geckox.c.b(1002, com.a.a("saveDirModifyTime failed, writeToFile error: %s, path: %s", new Object[]{e2.getMessage(), file4.getPath()}));
                                        MethodCollector.o(7782);
                                        throw bVar9;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c.a(fileOutputStream);
                                        c.a(objectOutputStream);
                                        MethodCollector.o(7782);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    objectOutputStream = objectOutputStream2;
                                    c.a(fileOutputStream);
                                    c.a(objectOutputStream);
                                    MethodCollector.o(7782);
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e2 = e7;
                                com.bytedance.geckox.c.b bVar92 = new com.bytedance.geckox.c.b(1002, com.a.a("saveDirModifyTime failed, writeToFile error: %s, path: %s", new Object[]{e2.getMessage(), file4.getPath()}));
                                MethodCollector.o(7782);
                                throw bVar92;
                            }
                        } else {
                            com.bytedance.geckox.c.b bVar10 = new com.bytedance.geckox.c.b(1004, "remove modifyTimePath error: " + file4.getPath());
                            MethodCollector.o(7782);
                            throw bVar10;
                        }
                    } else {
                        com.bytedance.geckox.c.b bVar11 = new com.bytedance.geckox.c.b(1005, "not bytediff file: " + new String(bArr));
                        MethodCollector.o(7782);
                        throw bVar11;
                    }
                } catch (com.bytedance.geckox.c.b e8) {
                    MethodCollector.o(7782);
                    throw e8;
                } catch (Exception e9) {
                    com.bytedance.geckox.c.b bVar12 = new com.bytedance.geckox.c.b(1099, bVar2.f29718h + e9.getMessage());
                    MethodCollector.o(7782);
                    throw bVar12;
                } catch (Throwable th7) {
                    c.a(bVar2.f29713c);
                    MethodCollector.o(7782);
                    throw th7;
                }
            } else {
                com.bytedance.geckox.c.b bVar13 = new com.bytedance.geckox.c.b(1000, "param dest error, remove failed: " + file2.getPath());
                MethodCollector.o(7782);
                throw bVar13;
            }
        } catch (Exception e10) {
            com.bytedance.geckox.i.a.b();
            MethodCollector.o(7782);
            throw e10;
        } catch (Throwable th8) {
            a(f2);
            MethodCollector.o(7782);
            throw th8;
        }
    }
}
