package com.bytedance.falconx.b;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final File f28776a;

    /* renamed from: b  reason: collision with root package name */
    private AssetManager f28777b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f28778c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(16920);
    }

    @Override // com.bytedance.falconx.b.c
    public final Map<String, Long> b() {
        return Collections.emptyMap();
    }

    @Override // com.bytedance.falconx.b.c
    public final String a() {
        return "asset:///" + this.f28776a;
    }

    @Override // com.bytedance.falconx.b.c
    public final InputStream a(String str) {
        MethodCollector.i(4488);
        if (!this.f28778c.get()) {
            com.bytedance.geckox.i.a.a("AssetResLoader ready to load, file:", str);
            InputStream open = this.f28777b.open(new File(this.f28776a, str).getPath());
            MethodCollector.o(4488);
            return open;
        }
        RuntimeException runtimeException = new RuntimeException("released!");
        MethodCollector.o(4488);
        throw runtimeException;
    }

    public a(Context context, File file) {
        this.f28776a = file;
        this.f28777b = context.getAssets();
    }
}
