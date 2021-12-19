package com.google.android.play.core.d;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.an;
import java.io.File;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f53193a;

    static {
        Covode.recordClassIndex(32876);
    }

    b(d dVar) {
        this.f53193a = dVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Context context, Set<File> set) {
        MethodCollector.i(7914);
        AssetManager assets = context.getAssets();
        for (File file : set) {
            ((Integer) an.a(assets, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        }
        MethodCollector.o(7914);
    }
}
