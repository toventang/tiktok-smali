package com.ss.android.ugc.aweme.sticker.types.game;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f136098a;

    static {
        Covode.recordClassIndex(88900);
    }

    c(b bVar) {
        this.f136098a = bVar;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.f136098a.a(i2);
    }
}
