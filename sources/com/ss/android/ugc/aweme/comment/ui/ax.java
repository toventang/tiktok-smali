package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;

final /* synthetic */ class ax implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72544a;

    /* renamed from: b  reason: collision with root package name */
    private final Comment f72545b;

    static {
        Covode.recordClassIndex(44703);
    }

    ax(k kVar, Comment comment) {
        this.f72544a = kVar;
        this.f72545b = comment;
    }

    public final void run() {
        this.f72544a.b(this.f72545b);
    }
}
