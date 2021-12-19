package com.ss.android.ugc.aweme.comment.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final m f72968a;

    static {
        Covode.recordClassIndex(44947);
    }

    public a(m mVar) {
        l.d(mVar, "");
        this.f72968a = mVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new CommentListViewModel(this.f72968a);
    }
}
