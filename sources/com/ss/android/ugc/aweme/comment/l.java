package com.ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.ui.k;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f72079a;

    static {
        Covode.recordClassIndex(44275);
    }

    l(b bVar) {
        this.f72079a = bVar;
    }

    public final void run() {
        b bVar = this.f72079a;
        if (bVar.f71468b instanceof k) {
            ((k) bVar.f71468b).B();
        }
    }
}
