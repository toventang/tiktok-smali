package com.bytedance.android.livesdk.i18n;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final I18nDbManager f18247a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18248b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18249c;

    static {
        Covode.recordClassIndex(10136);
    }

    f(I18nDbManager i18nDbManager, Map map, long j2) {
        this.f18247a = i18nDbManager;
        this.f18248b = map;
        this.f18249c = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f18247a.lambda$updateTranslations$3$I18nDbManager(this.f18248b, this.f18249c);
    }
}
