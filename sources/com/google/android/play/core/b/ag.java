package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;

final class ag implements u {
    static {
        Covode.recordClassIndex(32788);
    }

    ag() {
    }

    @Override // com.google.android.play.core.b.u
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) an.a(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
