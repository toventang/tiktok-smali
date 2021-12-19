package com.ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.g;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a implements IUpvoteService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142308a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IUpvoteService f142309b;

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int a() {
        return this.f142309b.a();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<g> a(e eVar) {
        l.d(eVar, "");
        return this.f142309b.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final com.ss.android.ugc.aweme.upvote.a.a a(FrameLayout frameLayout, m mVar) {
        l.d(frameLayout, "");
        l.d(mVar, "");
        return this.f142309b.a(frameLayout, mVar);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final List<h> a(String str) {
        l.d(str, "");
        return this.f142309b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(com.bytedance.assem.arch.viewModel.h hVar, com.ss.android.ugc.aweme.upvote.publish.a aVar) {
        l.d(hVar, "");
        l.d(aVar, "");
        this.f142309b.a(hVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, int i2) {
        l.d(str, "");
        this.f142309b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        this.f142309b.a(str, upvotePublishMobParam);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(upvotePublishMobParam, "");
        this.f142309b.a(str, z, upvotePublishMobParam, aVar);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
        this.f142309b.a(list);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Integer b(String str) {
        l.d(str, "");
        return this.f142309b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void b() {
        this.f142309b.b();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final com.ss.android.ugc.aweme.upvote.event.a c(String str) {
        l.d(str, "");
        return this.f142309b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void c() {
        this.f142309b.c();
    }

    static {
        Covode.recordClassIndex(93085);
    }

    private a() {
        IUpvoteService d2 = UpvoteServiceImpl.d();
        l.b(d2, "");
        this.f142309b = d2;
    }
}
