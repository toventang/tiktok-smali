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
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.publish.d;
import com.ss.android.ugc.aweme.story.publish.g;
import com.ss.android.ugc.playerkit.videoview.k;
import f.a.t;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class StoryServiceDowngradeImpl implements IStoryService {

    /* renamed from: a  reason: collision with root package name */
    private int f136695a;

    static {
        Covode.recordClassIndex(89282);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryViewerListViewModel a(e eVar, ag agVar) {
        l.d(eVar, "");
        l.d(agVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object a(cd cdVar) {
        l.d(cdVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar) {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str, Aweme aweme) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(String str, Aweme aweme) {
        l.d(str, "");
        l.d(aweme, "");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int[] iArr) {
        l.d(iArr, "");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(String str) {
        l.d(str, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int b() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final b b(String str) {
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final b b(String str, String str2) {
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object b(cd cdVar) {
        l.d(cdVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int c() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object c(cd cdVar) {
        l.d(cdVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void c(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.avatar.c d() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int[] h() {
        return new int[2];
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean i() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void j() {
    }

    public static final class a implements bi {
        static {
            Covode.recordClassIndex(89283);
        }

        a() {
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.story.publish.a {
        static {
            Covode.recordClassIndex(89284);
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final int a(UserStory userStory, boolean z) {
            l.d(userStory, "");
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final void a(Aweme aweme) {
            l.d(aweme, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final void a(Object obj, d dVar) {
            l.d(obj, "");
            l.d(dVar, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final void a(List<g> list) {
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.a
        public final List<Aweme> a() {
            return new ArrayList();
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.story.api.b {
        static {
            Covode.recordClassIndex(89285);
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final Aweme a(String str) {
            l.d(str, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final void a(Aweme aweme, boolean z, String str) {
            l.d(aweme, "");
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final void a(FollowStatus followStatus) {
            l.d(followStatus, "");
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final Aweme a() {
            Aweme aweme = new Aweme();
            aweme.setAid("");
            return aweme;
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final t<List<Aweme>> a(List<String> list) {
            l.d(list, "");
            t<List<Aweme>> b2 = t.b((Object) z.INSTANCE);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.story.api.b
        public final t<Aweme> a(String str, boolean z) {
            l.d(str, "");
            t<Aweme> b2 = t.b(new Aweme());
            l.b(b2, "");
            return b2;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int k() {
        return this.f136695a;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.api.b e() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.publish.a f() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int i2) {
        this.f136695a = i2;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.f.a a(String str, String str2) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_USER;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final t<BaseResponse> a(String str, int i2) {
        l.d(str, "");
        t<BaseResponse> a2 = t.a(new RuntimeException("StoryServiceDowngradeImpl"));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final bi a(ViewGroup viewGroup, k kVar, cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, h.f.a.b<? super String, ? extends View> bVar) {
        l.d(viewGroup, "");
        l.d(kVar, "");
        l.d(cdVar, "");
        l.d(viewGroup2, "");
        l.d(viewGroup3, "");
        l.d(viewGroup4, "");
        return new a();
    }
}
