package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;

final /* synthetic */ class ar implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72534a;

    /* renamed from: b  reason: collision with root package name */
    private final Comment f72535b;

    static {
        Covode.recordClassIndex(44697);
    }

    ar(k kVar, Comment comment) {
        this.f72534a = kVar;
        this.f72535b = comment;
    }

    public final void run() {
        this.f72534a.b(this.f72535b);
    }
}
