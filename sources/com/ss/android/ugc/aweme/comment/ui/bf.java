package com.ss.android.ugc.aweme.comment.ui;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bf implements g {

    /* renamed from: a  reason: collision with root package name */
    private final k.AnonymousClass11 f72568a;

    /* renamed from: b  reason: collision with root package name */
    private final Comment f72569b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72570c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72571d;

    /* renamed from: e  reason: collision with root package name */
    private final int f72572e;

    static {
        Covode.recordClassIndex(44715);
    }

    bf(k.AnonymousClass11 r1, Comment comment, int i2, int i3, int i4) {
        this.f72568a = r1;
        this.f72569b = comment;
        this.f72570c = i2;
        this.f72571d = i3;
        this.f72572e = i4;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f72568a.a(this.f72569b, this.f72570c, this.f72571d, this.f72572e, iVar);
    }
}
