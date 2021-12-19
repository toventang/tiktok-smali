package com.bytedance.android.livesdk.i18n;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final I18nDbManager f18229a;

    static {
        Covode.recordClassIndex(10121);
    }

    c(I18nDbManager i18nDbManager) {
        this.f18229a = i18nDbManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f18229a.lambda$queryTranslations$0$I18nDbManager();
    }
}
