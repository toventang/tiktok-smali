package com.ss.android.ugc.aweme.story;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ag;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.bi;
import com.ss.android.ugc.aweme.cd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.avatar.c;
import com.ss.android.ugc.aweme.story.f.a;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.ss.android.ugc.playerkit.videoview.k;
import f.a.t;
import h.f.a.b;
import h.f.b.l;

public final class g implements IStoryService {

    /* renamed from: a  reason: collision with root package name */
    public static final g f137757a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IStoryService f137758b;

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final bi a(ViewGroup viewGroup, k kVar, cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, b<? super String, ? extends View> bVar) {
        l.d(viewGroup, "");
        l.d(kVar, "");
        l.d(cdVar, "");
        l.d(viewGroup2, "");
        l.d(viewGroup3, "");
        l.d(viewGroup4, "");
        return this.f137758b.a(viewGroup, kVar, cdVar, viewGroup2, viewGroup3, viewGroup4, bVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryViewerListViewModel a(e eVar, ag agVar) {
        l.d(eVar, "");
        l.d(agVar, "");
        return this.f137758b.a(eVar, agVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final a a(String str, String str2) {
        l.d(str, "");
        return this.f137758b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final t<BaseResponse> a(String str, int i2) {
        l.d(str, "");
        return this.f137758b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object a(cd cdVar) {
        l.d(cdVar, "");
        return this.f137758b.a(cdVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int i2) {
        this.f137758b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar) {
        this.f137758b.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str) {
        l.d(str, "");
        this.f137758b.a(eVar, str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str, Aweme aweme) {
        l.d(str, "");
        this.f137758b.a(eVar, str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(String str, Aweme aweme) {
        l.d(str, "");
        l.d(aweme, "");
        this.f137758b.a(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int[] iArr) {
        l.d(iArr, "");
        this.f137758b.a(iArr);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a() {
        return this.f137758b.a();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        return this.f137758b.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(String str) {
        l.d(str, "");
        return this.f137758b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int b() {
        return this.f137758b.b();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final b b(String str) {
        l.d(str, "");
        return this.f137758b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final b b(String str, String str2) {
        l.d(str, "");
        return this.f137758b.b(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object b(cd cdVar) {
        l.d(cdVar, "");
        return this.f137758b.b(cdVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int c() {
        return this.f137758b.c();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object c(cd cdVar) {
        l.d(cdVar, "");
        return this.f137758b.c(cdVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void c(String str) {
        l.d(str, "");
        this.f137758b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final c d() {
        return this.f137758b.d();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.api.b e() {
        return this.f137758b.e();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.publish.a f() {
        return this.f137758b.f();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void g() {
        this.f137758b.g();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int[] h() {
        return this.f137758b.h();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean i() {
        return this.f137758b.i();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void j() {
        this.f137758b.j();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int k() {
        return this.f137758b.k();
    }

    static {
        Covode.recordClassIndex(90131);
    }

    private g() {
        IStoryService l2 = StoryServiceImpl.l();
        l.b(l2, "");
        this.f137758b = l2;
    }
}
