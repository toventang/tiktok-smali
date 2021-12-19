package com.ss.android.ugc.aweme.story.interaction.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final m f137972a;

    static {
        Covode.recordClassIndex(90235);
    }

    public b(m mVar) {
        l.d(mVar, "");
        this.f137972a = mVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new StoryLikedListViewModel(this.f137972a);
    }
}
