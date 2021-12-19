package com.bytedance.common.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.DexFile;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static Constructor<?> f26712a;

    static {
        Covode.recordClassIndex(15756);
    }

    public static DexFile a(byte[] bArr) {
        if (f26712a == null) {
            f26712a = a(DexFile.class, ByteBuffer.class);
        }
        return (DexFile) f26712a.newInstance(ByteBuffer.wrap(bArr));
    }

    public static List<DexFile> a(String str) {
        MethodCollector.i(4963);
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        try {
            byte[] bArr = new byte[1024];
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                if (!nextEntry.isDirectory() && nextEntry.getName().startsWith("classes") && nextEntry.getName().endsWith("dex")) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                    while (true) {
                        int read = zipInputStream.read(bArr, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    DexFile a2 = a(byteArrayOutputStream.toByteArray());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            zipInputStream.close();
            MethodCollector.o(4963);
            return arrayList;
        } catch (Throwable th) {
            try {
                zipInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            MethodCollector.o(4963);
            throw th;
        }
    }

    private static Constructor<?> a(Class<?> cls, Class<?> cls2) {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
        declaredMethod.setAccessible(true);
        Constructor<?> constructor = (Constructor) declaredMethod.invoke(cls, new Class[]{cls2});
        if (constructor != null && !constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor;
    }
}
