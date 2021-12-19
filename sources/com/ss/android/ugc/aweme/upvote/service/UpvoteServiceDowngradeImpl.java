package com.ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.a;
import com.ss.android.ugc.aweme.upvote.publish.g;
import h.f.b.l;
import h.z;
import java.util.List;

public final class UpvoteServiceDowngradeImpl implements IUpvoteService {
    static {
        Covode.recordClassIndex(93080);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int a() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<g> a(e eVar) {
        l.d(eVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(h hVar, a aVar) {
        l.d(hVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, int i2) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Integer b(String str) {
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final com.ss.android.ugc.aweme.upvote.event.a c(String str) {
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final List<com.ss.android.ugc.aweme.upvote.c.h> a(String str) {
        l.d(str, "");
        return h.a.z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final /* synthetic */ com.ss.android.ugc.aweme.upvote.a.a a(FrameLayout frameLayout, m mVar) {
        l.d(frameLayout, "");
        l.d(mVar, "");
        return null;
    }
}
