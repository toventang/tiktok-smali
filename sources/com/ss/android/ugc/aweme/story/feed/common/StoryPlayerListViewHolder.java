package com.ss.android.ugc.aweme.story.feed.common;

import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.bi;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.detail.ui.am;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.g;
import com.ss.android.ugc.aweme.story.c.e;
import com.ss.android.ugc.aweme.story.feed.ui.player.DragScaleLayout;
import com.ss.android.ugc.aweme.story.g.d;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.j;

public final class StoryPlayerListViewHolder extends VideoViewCell implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137621a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Aweme f137622b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f137623c;

    /* renamed from: d  reason: collision with root package name */
    private int f137624d;

    static {
        Covode.recordClassIndex(90047);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void ag() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void aj() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void ak() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90048);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme b() {
        return this.f137622b;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void c() {
        super.c();
        this.r.a();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void V() {
        super.V();
        ((DragScaleLayout) this.p.f91766a.findViewById(R.id.apq)).a(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void aa() {
        ai v;
        super.aa();
        aj U = U();
        if (U != null && (v = U.v()) != null) {
            v.aa();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void ac() {
        ai v;
        super.ac();
        aj U = U();
        if (U != null && (v = U.v()) != null) {
            v.ac();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void af() {
        if (!com.ss.android.ugc.aweme.story.c.b.b() || !e.a()) {
            super.af();
        } else {
            this.aA.a("video_share_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void g() {
        super.g();
        this.r.e();
        DragScaleLayout dragScaleLayout = (DragScaleLayout) this.p.f91766a.findViewById(R.id.apq);
        if (dragScaleLayout != null) {
            dragScaleLayout.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void H() {
        super.H();
        if (com.ss.android.ugc.aweme.story.d.a.c(this.f91515j)) {
            com.ss.android.ugc.aweme.feed.adapter.a.a aVar = this.r;
            Aweme aweme = this.f91515j;
            if (aweme == null) {
                l.b();
            }
            aVar.a(aweme, this.f91516k);
            ((DragScaleLayout) this.p.f91766a.findViewById(R.id.apq)).setReleaseListener(new b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void n() {
        super.n();
        this.aA.a("on_story_guide_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("on_story_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("on_story_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("on_should_scroll_to_next_user", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("ON_STORY_DATA_CHANGED", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("on_start_play_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("prebind_story", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ StoryPlayerListViewHolder this$0;

        static {
            Covode.recordClassIndex(90049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryPlayerListViewHolder storyPlayerListViewHolder) {
            super(0);
            this.this$0 = storyPlayerListViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Fragment fragment = this.this$0.p.f91768c;
            if (!(fragment instanceof am)) {
                fragment = null;
            }
            am amVar = (am) fragment;
            if (amVar != null) {
                if (amVar.b(this.this$0.f91516k)) {
                    this.this$0.p.f91767b.a(new ag(60, new com.ss.android.ugc.aweme.story.b.e(g.ON_SHOULD_SCROLL_TO_NEXT_USER, null)));
                } else if (amVar.bi_()) {
                    ((DragScaleLayout) this.this$0.p.f91766a.findViewById(R.id.apq)).a(true);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Video video) {
        if (this.f137623c) {
            super.a(video);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryPlayerListViewHolder(cf cfVar) {
        super(cfVar);
        l.d(cfVar, "");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void d(String str) {
        l.d(str, "");
        this.r.b(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void e(String str) {
        l.d(str, "");
        if (this.f137623c) {
            super.e(str);
        }
    }

    static final class c extends m implements h.f.a.b<String, View> {
        final /* synthetic */ StoryPlayerListViewHolder this$0;

        static {
            Covode.recordClassIndex(90050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StoryPlayerListViewHolder storyPlayerListViewHolder) {
            super(1);
            this.this$0 = storyPlayerListViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            int hashCode = str2.hashCode();
            if (hashCode != -1154870718) {
                if (hashCode == -926734197 && str2.equals("place_holder_caption")) {
                    return this.this$0.aj;
                }
                return null;
            } else if (str2.equals("story_bubble_list_layout")) {
                return this.this$0.L;
            } else {
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final com.ss.android.ugc.aweme.feed.adapter.a.a a(cf cfVar) {
        l.d(cfVar, "");
        FrameLayout frameLayout = this.N;
        l.b(frameLayout, "");
        FrameLayout frameLayout2 = this.J;
        l.b(frameLayout2, "");
        FrameLayout frameLayout3 = this.K;
        l.b(frameLayout3, "");
        FrameLayout frameLayout4 = this.L;
        l.b(frameLayout4, "");
        c cVar = new c(this);
        l.d(frameLayout, "");
        l.d(this, "");
        l.d(cfVar, "");
        l.d(frameLayout2, "");
        l.d(frameLayout3, "");
        l.d(frameLayout4, "");
        bi a2 = com.ss.android.ugc.aweme.story.g.f137757a.a(frameLayout, this, cfVar, frameLayout2, frameLayout3, frameLayout4, cVar);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView");
        return (com.ss.android.ugc.aweme.feed.adapter.a.a) a2;
    }

    private final boolean j(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        UserStory userStory2;
        List<Aweme> stories2;
        if (!(!l.a((Object) this.p.f91770e.eventType, (Object) "westwindow") || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.size() <= 0)) {
            if (aweme == null || (userStory2 = aweme.getUserStory()) == null || (stories2 = userStory2.getStories()) == null) {
                aweme2 = null;
            } else {
                aweme2 = stories2.get(0);
            }
            if (com.ss.android.ugc.aweme.story.d.a.e(aweme2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(int i2) {
        Aweme aweme;
        Aweme aweme2;
        super.a(i2);
        if (this.f137624d == 0 && this.f137623c) {
            this.f137623c = false;
            D();
        }
        String ao = ao();
        l.b(ao, "");
        boolean a2 = l.a((Object) "homepage_follow", (Object) ao);
        boolean a3 = com.ss.android.ugc.aweme.feed.x.m.a(this.f91515j);
        if ((com.ss.android.ugc.aweme.story.d.a.g(this.f91515j) || ((aweme2 = this.f91515j) != null && aweme2.isStoryFakeAweme())) && a3 && com.ss.android.ugc.aweme.story.c.b.l() && (!a2 || !com.ss.android.ugc.aweme.story.c.b.f())) {
            ViewGroup viewGroup = this.G;
            l.b(viewGroup, "");
            viewGroup.setVisibility(4);
        } else {
            ViewGroup viewGroup2 = this.G;
            l.b(viewGroup2, "");
            viewGroup2.setVisibility(0);
        }
        this.r.a(i2);
        if (com.ss.android.ugc.aweme.story.c.b.b() && !a3 && (aweme = this.f91515j) != null && !aweme.isStoryFakeAweme() && !com.ss.android.ugc.aweme.story.d.a.f(this.f91515j) && !j(this.f137622b) && !com.ss.android.ugc.aweme.story.d.a.e(this.f137622b)) {
            User c2 = in.c();
            l.b(c2, "");
            String uid = c2.getUid();
            User c3 = in.c();
            l.b(c3, "");
            String uid2 = c3.getUid();
            l.b(uid2, "");
            l.d(uid2, "");
            if (d.f137774a.getBoolean(uid2 + "_STORY_SHOW_VIEWER_LIST_TIPS", true)) {
                au();
                Message obtainMessage = this.aD.obtainMessage(31);
                l.b(obtainMessage, "");
                obtainMessage.what = 31;
                this.aD.sendMessage(obtainMessage);
                l.b(uid, "");
                l.d(uid, "");
                d.f137774a.storeBoolean(uid + "_STORY_SHOW_VIEWER_LIST_TIPS", false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f67014a) != null) {
            switch (str.hashCode()) {
                case -1206738399:
                    if (str.equals("on_story_page_selected")) {
                        this.f137623c = false;
                        D();
                        com.ss.android.ugc.aweme.story.b.j jVar = (com.ss.android.ugc.aweme.story.b.j) bVar.a();
                        if (!com.ss.android.ugc.aweme.story.c.b.b()) {
                            if (com.ss.android.ugc.aweme.story.d.a.e(jVar.f136853a)) {
                                RelativeLayout relativeLayout = this.O;
                                l.b(relativeLayout, "");
                                relativeLayout.setVisibility(4);
                            } else {
                                RelativeLayout relativeLayout2 = this.O;
                                l.b(relativeLayout2, "");
                                relativeLayout2.setVisibility(0);
                            }
                        }
                        if (jVar.f136854b == this.f91516k) {
                            if (!com.ss.android.ugc.aweme.story.d.a.e(jVar.f136853a)) {
                                a(jVar.f136853a);
                            }
                            aa();
                        }
                        if (com.ss.android.ugc.aweme.story.d.a.h(jVar.f136853a)) {
                            RelativeLayout relativeLayout3 = this.O;
                            l.b(relativeLayout3, "");
                            relativeLayout3.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    return;
                case -835739306:
                    if (str.equals("prebind_story")) {
                        com.ss.android.ugc.aweme.story.b.c cVar = (com.ss.android.ugc.aweme.story.b.c) bVar.a();
                        Aweme aweme = cVar.f136844a;
                        if ((!l.a(this.f91515j, aweme)) && !aweme.isStoryFakeAweme()) {
                            a(cVar.f136844a);
                            this.f137623c = true;
                            a(cVar.f136844a.getVideo());
                            return;
                        }
                        return;
                    }
                    return;
                case -781426983:
                    if (str.equals("on_should_scroll_to_next_user")) {
                        ((DragScaleLayout) this.p.f91766a.findViewById(R.id.apq)).a(true);
                        return;
                    }
                    return;
                case -219301751:
                    if (str.equals("ON_STORY_DATA_CHANGED")) {
                        com.ss.android.ugc.aweme.story.b.c cVar2 = (com.ss.android.ugc.aweme.story.b.c) bVar.a();
                        Aweme aweme2 = this.f91515j;
                        if (aweme2 != null && aweme2.isStoryFakeAweme()) {
                            a(cVar2.f136844a);
                            return;
                        }
                        return;
                    }
                    return;
                case 43859514:
                    if (str.equals("on_story_page_unselected")) {
                        View view = this.U;
                        l.b(view, "");
                        view.setVisibility(8);
                        return;
                    }
                    return;
                case 2125858838:
                    if (str.equals("on_start_play_animation")) {
                        am();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Aweme aweme) {
        if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
            this.f137622b = aweme;
            DragScaleLayout dragScaleLayout = (DragScaleLayout) this.p.f91766a.findViewById(R.id.apq);
            l.b(dragScaleLayout, "");
            dragScaleLayout.setEnabled(false);
        } else if (com.ss.android.ugc.aweme.story.d.a.f(aweme)) {
            RelativeLayout relativeLayout = this.O;
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(4);
        }
        super.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void b_(int i2, int i3) {
        super.b_(i2, i3);
        this.f137624d = i3;
        if (i3 == 0 && this.f137623c) {
            this.f137623c = false;
            D();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(View view, boolean z) {
        if (!MainPageFragmentImpl.i().h() || (!l.a((Object) this.p.f91775j, (Object) "homepage_hot") && !l.a((Object) this.p.f91775j, (Object) "homepage_follow"))) {
            super.a(view, z);
        } else {
            super.a(view, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void a(Aweme aweme, int i2) {
        Aweme aweme2;
        UserStory userStory;
        List<Aweme> stories;
        super.a(aweme, i2);
        if (com.ss.android.ugc.aweme.story.c.b.b()) {
            RelativeLayout relativeLayout = this.O;
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(4);
        } else if (j(aweme)) {
            RelativeLayout relativeLayout2 = this.O;
            l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(4);
        } else {
            if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                if (aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null) {
                    aweme2 = null;
                } else {
                    aweme2 = (Aweme) n.h((List) stories);
                }
                if (com.ss.android.ugc.aweme.story.d.a.f(aweme2)) {
                    RelativeLayout relativeLayout3 = this.O;
                    l.b(relativeLayout3, "");
                    relativeLayout3.setVisibility(4);
                }
            }
            RelativeLayout relativeLayout4 = this.O;
            l.b(relativeLayout4, "");
            relativeLayout4.setVisibility(0);
        }
        View view = this.x;
        l.b(view, "");
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final bd a(View view, s<ag> sVar, Fragment fragment) {
        l.d(fragment, "");
        if (e.a()) {
            return new com.ss.android.ugc.aweme.story.feed.a();
        }
        bd a2 = super.a(view, sVar, fragment);
        l.b(a2, "");
        return a2;
    }
}
