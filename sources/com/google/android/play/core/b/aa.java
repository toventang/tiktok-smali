package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.List;

final class aa implements ab {
    static {
        Covode.recordClassIndex(32782);
    }

    aa() {
    }

    @Override // com.google.android.play.core.b.ab
    public final Object[] a(Object obj, List<File> list, List<IOException> list2) {
        return (Object[]) an.a(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
    }
}
