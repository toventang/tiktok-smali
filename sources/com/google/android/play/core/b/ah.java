package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Set;

public final class ah implements q {
    static {
        Covode.recordClassIndex(32789);
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        ac.a(classLoader, set, new af());
    }

    static boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return x.a(classLoader, file, file2, z, ac.a(), "path", new ag());
    }

    @Override // com.google.android.play.core.b.q
    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    @Override // com.google.android.play.core.b.q
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
