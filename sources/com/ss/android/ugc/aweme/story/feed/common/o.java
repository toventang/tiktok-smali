package com.ss.android.ugc.aweme.story.feed.common;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.b;
import h.f.b.l;

public final class o implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final m f137678a;

    /* renamed from: b  reason: collision with root package name */
    private final b f137679b;

    static {
        Covode.recordClassIndex(90094);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new StoryFeedViewModel(this.f137678a, this.f137679b);
    }

    public o(m mVar, b bVar) {
        l.d(mVar, "");
        l.d(bVar, "");
        this.f137678a = mVar;
        this.f137679b = bVar;
    }
}
