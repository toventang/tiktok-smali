package com.ss.android.ugc.aweme.comment.ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.comment.model.Comment;

final /* synthetic */ class am implements f {

    /* renamed from: a  reason: collision with root package name */
    private final k f72521a;

    /* renamed from: b  reason: collision with root package name */
    private final Comment f72522b;

    static {
        Covode.recordClassIndex(44692);
    }

    am(k kVar, Comment comment) {
        this.f72521a = kVar;
        this.f72522b = comment;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new ar(this.f72521a, this.f72522b), 500);
    }
}
