package com.bytedance.android.livesdk.i18n;

import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final I18nDbManager f18230a;

    static {
        Covode.recordClassIndex(10122);
    }

    d(I18nDbManager i18nDbManager) {
        this.f18230a = i18nDbManager;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18230a.lambda$queryTranslations$1$I18nDbManager((I18nDbManager.b) obj);
    }
}
