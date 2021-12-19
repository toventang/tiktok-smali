package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.e.ag;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class x implements q {
    static {
        Covode.recordClassIndex(32863);
    }

    static w a() {
        return new s();
    }

    static Object a(ClassLoader classLoader) {
        return an.a(classLoader, "pathList", Object.class).a();
    }

    static boolean a(ClassLoader classLoader, File file, File file2, boolean z, w wVar, String str, u uVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object a2 = a(classLoader);
        am b2 = an.b(a2, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b2.a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add(an.a(obj, str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || uVar.a(a2, file2, file)) {
            b2.a((Collection) Arrays.asList(wVar.a(a2, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            al alVar = new al("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bf.a(alVar, arrayList.get(i2));
            }
            an.b(a2, "dexElementsSuppressedExceptions", IOException.class).a((Collection) arrayList);
            throw alVar;
        }
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            "Should be optimized ".concat(valueOf);
        } else {
            new String("Should be optimized ");
        }
        return false;
    }

    static u b() {
        return new t();
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        MethodCollector.i(9228);
        if (set.isEmpty()) {
            MethodCollector.o(9228);
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            if (valueOf.length() != 0) {
                "Adding native library parent directory: ".concat(valueOf);
            } else {
                new String("Adding native library parent directory: ");
            }
            hashSet.add(file.getParentFile());
        }
        am b2 = an.b(a(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((Object[]) b2.a()));
        synchronized (ag.class) {
            try {
                hashSet.size();
                b2.b(hashSet);
            } finally {
                MethodCollector.o(9228);
            }
        }
    }

    @Override // com.google.android.play.core.b.q
    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    @Override // com.google.android.play.core.b.q
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return a(classLoader, file, file2, z, a(), "zip", b());
    }
}
