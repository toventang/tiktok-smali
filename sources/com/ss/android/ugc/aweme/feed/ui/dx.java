package com.ss.android.ugc.aweme.feed.ui;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dx implements a {

    /* renamed from: a  reason: collision with root package name */
    private final dw f94660a;

    static {
        Covode.recordClassIndex(60073);
    }

    dx(dw dwVar) {
        this.f94660a = dwVar;
    }

    @Override // com.ss.android.ugc.aweme.base.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.f94660a.a(i2, keyEvent);
    }
}
