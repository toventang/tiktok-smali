package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
public final class t implements u {
    static {
        Covode.recordClassIndex(32859);
    }

    t() {
    }

    @Override // com.google.android.play.core.b.u
    public final boolean a(Object obj, File file, File file2) {
        return new File((String) an.a(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
    }
}
