package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository f17624a;

    static {
        Covode.recordClassIndex(9765);
    }

    a(FeedRepository feedRepository) {
        this.f17624a = feedRepository;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f17624a.t = (String) obj;
    }
}
