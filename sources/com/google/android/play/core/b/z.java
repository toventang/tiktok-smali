package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class z implements w {
    static {
        Covode.recordClassIndex(32865);
    }

    z() {
    }

    @Override // com.google.android.play.core.b.w
    public final Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        return (Object[]) an.a(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
    }
}
