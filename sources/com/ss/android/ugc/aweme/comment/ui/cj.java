package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72687a;

    static {
        Covode.recordClassIndex(44781);
    }

    cj(bz bzVar) {
        this.f72687a = bzVar;
    }

    public final void run() {
        bz bzVar = this.f72687a;
        bzVar.f72659l.b();
        KeyboardUtils.c(bzVar.f72651d);
    }
}
