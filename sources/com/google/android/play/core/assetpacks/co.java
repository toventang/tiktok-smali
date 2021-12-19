package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.bf;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

final class co {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f52995a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static {
        Covode.recordClassIndex(32734);
    }

    static List<File> a(File file, File file2) {
        File[] fileArr;
        MethodCollector.i(7953);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(cn.f52994a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            int length = listFiles.length;
            fileArr = new File[length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr[parseInt] != null) {
                    au auVar = new au("Metadata folder ordering corrupt.");
                    MethodCollector.o(7953);
                    throw auVar;
                }
                fileArr[parseInt] = file3;
            }
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    cs a2 = new al(fileInputStream).a();
                    if (a2.f53003a != null) {
                        File file5 = new File(file, a2.f53003a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            au auVar2 = new au(a.a("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                            MethodCollector.o(7953);
                            throw auVar2;
                        }
                    } else {
                        au auVar3 = new au("Metadata files corrupt. Could not read local file header.");
                        MethodCollector.o(7953);
                        throw auVar3;
                    }
                } catch (Throwable th) {
                    bf.a(th, th);
                }
            }
        }
        MethodCollector.o(7953);
        return arrayList;
        MethodCollector.o(7953);
        throw th;
    }
}
