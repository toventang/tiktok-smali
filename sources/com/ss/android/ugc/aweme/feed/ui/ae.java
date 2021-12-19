package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.service.a;

final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ab f94220a;

    /* renamed from: b  reason: collision with root package name */
    private final UrlModel f94221b;

    static {
        Covode.recordClassIndex(59862);
    }

    ae(ab abVar, UrlModel urlModel) {
        this.f94220a = abVar;
        this.f94221b = urlModel;
    }

    public final void run() {
        ab abVar = this.f94220a;
        UrlModel urlModel = this.f94221b;
        if (abVar.f94216l.getWidth() != 0) {
            e.a(abVar.f94216l, urlModel, abVar.f94216l.getWidth(), abVar.f94216l.getHeight(), a.a((((float) abVar.f94216l.getWidth()) * 1.0f) / ((float) abVar.f94216l.getWidth())));
        }
    }
}
