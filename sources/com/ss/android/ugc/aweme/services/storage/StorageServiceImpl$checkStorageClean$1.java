package com.ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.g;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import h.f.b.l;
import java.util.concurrent.Callable;

final class StorageServiceImpl$checkStorageClean$1<V> implements Callable {
    public static final StorageServiceImpl$checkStorageClean$1 INSTANCE = new StorageServiceImpl$checkStorageClean$1();

    static {
        Covode.recordClassIndex(79817);
    }

    StorageServiceImpl$checkStorageClean$1() {
    }

    @Override // java.util.concurrent.Callable
    public final void call() {
        EffectService instance = EffectService.getInstance();
        l.b(instance, "");
        g.a(instance.getCacheDir());
    }
}
