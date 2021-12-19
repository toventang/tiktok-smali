package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Set;

public final class y implements q {
    static {
        Covode.recordClassIndex(32864);
    }

    @Override // com.google.android.play.core.b.q
    public final void a(ClassLoader classLoader, Set<File> set) {
        x.b(classLoader, set);
    }

    @Override // com.google.android.play.core.b.q
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return x.a(classLoader, file, file2, z, x.a(), "zip", x.b());
    }
}
