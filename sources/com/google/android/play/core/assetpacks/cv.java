package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.a;

final /* synthetic */ class cv implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f53011a = new cv();

    static {
        Covode.recordClassIndex(32741);
    }

    private cv() {
    }

    @Override // com.google.android.play.core.tasks.a
    public final void a(Exception exc) {
        cw.f53012a.e(com.a.a("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
