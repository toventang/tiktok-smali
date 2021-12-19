package com.bytedance.liko.leakdetector.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class d {
    static {
        Covode.recordClassIndex(24715);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7, java.lang.String r8, java.util.List<java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.a.d.a(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
        MethodCollector.i(4167);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        str = file.getName() + File.separator + file2.getName() + File.separator;
                    }
                    a(zipOutputStream, file2, str);
                }
            }
            MethodCollector.o(4167);
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                MethodCollector.o(4167);
                return;
            }
        }
    }
}
