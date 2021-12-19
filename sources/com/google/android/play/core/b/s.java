package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class s implements w {
    static {
        Covode.recordClassIndex(32858);
    }

    s() {
    }

    @Override // com.google.android.play.core.b.w
    public final Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        return (Object[]) an.a(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
    }
}
