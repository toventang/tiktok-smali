package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.k;
import com.ss.android.ugc.aweme.comment.model.Comment;

final /* synthetic */ class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72541a;

    /* renamed from: b  reason: collision with root package name */
    private final k f72542b;

    /* renamed from: c  reason: collision with root package name */
    private final Comment f72543c;

    static {
        Covode.recordClassIndex(44702);
    }

    aw(k kVar, k kVar2, Comment comment) {
        this.f72541a = kVar;
        this.f72542b = kVar2;
        this.f72543c = comment;
    }

    public final void run() {
        this.f72541a.a(this.f72542b, this.f72543c);
    }
}
