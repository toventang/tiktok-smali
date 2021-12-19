package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.e.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ac implements q {
    static {
        Covode.recordClassIndex(32784);
    }

    static w a() {
        return new z();
    }

    public static void a(ClassLoader classLoader, Set<File> set, ab abVar) {
        MethodCollector.i(9038);
        if (set.isEmpty()) {
            MethodCollector.o(9038);
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            hashSet.add(file.getParentFile());
        }
        Object a2 = x.a(classLoader);
        am a3 = an.a(a2, "nativeLibraryDirectories", List.class);
        synchronized (ag.class) {
            try {
                ArrayList arrayList = new ArrayList((Collection) a3.a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                a3.a((Object) arrayList);
            } finally {
                MethodCollector.o(9038);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] a4 = abVar.a(a2, new ArrayList(hashSet), arrayList2);
        if (!arrayList2.isEmpty()) {
            al alVar = new al("Error in makePathElements");
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                bf.a(alVar, arrayList2.get(i2));
            }
            throw alVar;
        }
        synchronized (ag.class) {
            try {
                an.b(a2, "nativeLibraryPathElements", Object.class).b(Arrays.asList(a4));
            } finally {
                MethodCollector.o(9038);
            }
        }
    }

    static ab b() {
        return new aa();
    }

    public static boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return x.a(classLoader, file, file2, z, a(), "zip", x.b());
    }

    @Override // com.google.android.play.core.b.q
    public final void a(ClassLoader classLoader, Set<File> set) {
        a(classLoader, set, b());
    }

    @Override // com.google.android.play.core.b.q
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
