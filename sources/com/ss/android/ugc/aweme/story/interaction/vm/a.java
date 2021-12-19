package com.ss.android.ugc.aweme.story.interaction.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final m f137971a;

    static {
        Covode.recordClassIndex(90234);
    }

    public a(m mVar) {
        l.d(mVar, "");
        this.f137971a = mVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new StoryCommentListViewModel(this.f137971a);
    }
}
