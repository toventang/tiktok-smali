package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class ah extends Enum<ah> implements aa {

    /* renamed from: a  reason: collision with root package name */
    public static final ah f53232a = new ah();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<ab> f53233b = new AtomicReference<>(null);

    static {
        Covode.recordClassIndex(32902);
    }

    private ah() {
    }

    @Override // com.google.android.play.core.e.aa
    public final ab a() {
        return f53233b.get();
    }

    public final void b(ab abVar) {
        f53233b.set(abVar);
    }
}
