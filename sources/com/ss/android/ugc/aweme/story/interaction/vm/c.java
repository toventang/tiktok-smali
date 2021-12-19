package com.ss.android.ugc.aweme.story.interaction.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final m f137973a;

    static {
        Covode.recordClassIndex(90236);
    }

    public c(m mVar) {
        l.d(mVar, "");
        this.f137973a = mVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new StoryViewerListViewModel(this.f137973a);
    }
}
