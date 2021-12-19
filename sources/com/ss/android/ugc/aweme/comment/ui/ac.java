package com.ss.android.ugc.aweme.comment.ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.comment.f.k;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements f {

    /* renamed from: a  reason: collision with root package name */
    private final k f72499a;

    /* renamed from: b  reason: collision with root package name */
    private final k f72500b;

    /* renamed from: c  reason: collision with root package name */
    private final Comment f72501c;

    static {
        Covode.recordClassIndex(44682);
    }

    ac(k kVar, k kVar2, Comment comment) {
        this.f72499a = kVar;
        this.f72500b = kVar2;
        this.f72501c = comment;
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.component.f
    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new aw(this.f72499a, this.f72500b, this.f72501c), 500);
    }
}
