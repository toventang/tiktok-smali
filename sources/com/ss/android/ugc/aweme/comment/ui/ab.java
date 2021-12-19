package com.ss.android.ugc.aweme.comment.ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements f {

    /* renamed from: a  reason: collision with root package name */
    private final k f72497a;

    /* renamed from: b  reason: collision with root package name */
    private final Comment f72498b;

    static {
        Covode.recordClassIndex(44681);
    }

    ab(k kVar, Comment comment) {
        this.f72497a = kVar;
        this.f72498b = comment;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new ax(this.f72497a, this.f72498b), 500);
    }
}
