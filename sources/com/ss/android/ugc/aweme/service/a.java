package com.ss.android.ugc.aweme.service;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import h.f.b.l;
import java.util.List;

public final class a implements IFollowFeedService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121832a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IFollowFeedService f121833b;

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final by a(Context context) {
        l.d(context, "");
        return this.f121833b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final String a(e eVar) {
        l.d(eVar, "");
        return this.f121833b.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> a(List<? extends FollowFeed> list) {
        l.d(list, "");
        return this.f121833b.a(list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void a() {
        this.f121833b.a();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void a(e eVar, float f2) {
        l.d(eVar, "");
        this.f121833b.a(eVar, f2);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final float b(e eVar) {
        l.d(eVar, "");
        return this.f121833b.b(eVar);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment b() {
        return this.f121833b.b();
    }

    static {
        Covode.recordClassIndex(79369);
    }

    private a() {
        IFollowFeedService c2 = FollowFeedServiceImpl.c();
        l.b(c2, "");
        this.f121833b = c2;
    }
}
