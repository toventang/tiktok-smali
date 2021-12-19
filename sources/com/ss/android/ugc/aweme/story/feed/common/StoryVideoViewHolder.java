package com.ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.story.b.e;
import com.ss.android.ugc.aweme.story.b.f;
import com.ss.android.ugc.aweme.story.b.g;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.story.b.k;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import org.greenrobot.eventbus.j;

public class StoryVideoViewHolder extends VideoViewCell implements j {
    static {
        Covode.recordClassIndex(90051);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void af() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void ag() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void ah() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void g(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void h(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void W() {
        super.W();
        this.p.f91767b.a(new ag(60, new e(g.PLAY_GUIDE, null)));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void am() {
        this.aq.a(new ag(60, new e(g.NOTIFY_OUTER_VIEW_HOLDER, new f("on_start_play_animation"))));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final float ax() {
        String str;
        View invoke;
        if ((com.ss.android.ugc.aweme.story.c.b.b() || m.a(this.f91515j)) && !TextUtils.equals("homepage_follow", this.p.f91775j) && !TextUtils.equals("homepage_hot", this.p.f91775j)) {
            str = "story_bubble_list_layout";
        } else {
            str = "place_holder_caption";
        }
        h.f.a.b<String, View> bVar = this.p.o;
        if (bVar == null || (invoke = bVar.invoke(str)) == null) {
            return 0.0f;
        }
        return invoke.getY();
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryVideoViewHolder f137626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f137627b;

        static {
            Covode.recordClassIndex(90053);
        }

        b(StoryVideoViewHolder storyVideoViewHolder, z.c cVar) {
            this.f137626a = storyVideoViewHolder;
            this.f137627b = cVar;
        }

        public final void run() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            float height = (float) ((this.f137626a.p.f91766a.getHeight() - this.f137627b.element) - h.g.a.a(TypedValue.applyDimension(1, 52.0f, system.getDisplayMetrics())));
            float f2 = 0.1f * height;
            float f3 = height * 0.7f;
            LinearLayout linearLayout = (LinearLayout) this.f137626a.p.f91766a.findViewById(R.id.bcq);
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                i.b(linearLayout, 0, Integer.valueOf(h.g.a.a(f2)), 0, 0, false, 16);
                linearLayout.setLayoutParams(layoutParams);
            }
            StoryBrandView storyBrandView = (StoryBrandView) this.f137626a.p.f91766a.findViewById(R.id.bcn);
            if (storyBrandView != null) {
                ViewGroup.LayoutParams layoutParams2 = storyBrandView.getLayoutParams();
                i.b(storyBrandView, 0, Integer.valueOf(h.g.a.a(f3)), 0, 0, false, 16);
                storyBrandView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoViewHolder(cf cfVar) {
        super(cfVar);
        l.d(cfVar, "");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public void onPlayCompleted(String str) {
        super.onPlayCompleted(str);
        this.aq.a(new ag(60, new e(g.ON_PLAY_COMPLETED, new k(str))));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public void onPlayCompletedFirstTime(String str) {
        super.onPlayCompletedFirstTime(str);
        this.p.f91767b.a(new ag(60, new e(g.ON_PLAY_COMPLETED_FIRST_TIME)));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryVideoViewHolder f137625a;

        static {
            Covode.recordClassIndex(90052);
        }

        a(StoryVideoViewHolder storyVideoViewHolder) {
            this.f137625a = storyVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.a(this.f137625a.p.f91775j, "page", "click", null, 56);
            IStoryService storyService = AVExternalServiceImpl.a().storyService();
            Context an = this.f137625a.an();
            l.b(an, "");
            storyService.startStoryActivity(an, new EnterStoryParam(null, "click_fullscreen_intro", "story", false, true, false, !com.ss.android.ugc.aweme.story.c.b.i(), 41, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(View view, boolean z) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void a(Aweme aweme, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (com.ss.android.ugc.aweme.story.d.a.e(aweme)) {
            this.f91515j = aweme;
            FrameLayout frameLayout = (FrameLayout) this.p.f91766a.findViewById(R.id.ec0);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.I;
            l.b(frameLayout2, "");
            frameLayout2.setVisibility(8);
            User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
            if (curUser != null) {
                com.ss.android.ugc.aweme.base.e.a((RemoteImageView) this.p.f91766a.findViewById(R.id.bcp), curUser.getAvatarThumb());
            }
            StoryBrandView storyBrandView = (StoryBrandView) this.p.f91766a.findViewById(R.id.bcn);
            if (storyBrandView != null) {
                storyBrandView.setOnClickListener(new a(this));
            }
            z.c cVar = new z.c();
            cVar.element = 0;
            if (c.f66197m == 0) {
                cVar.element = com.bytedance.ies.uikit.c.a.a(an());
                View findViewById = this.p.f91766a.findViewById(R.id.e_f);
                if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
                    layoutParams2.height = cVar.element;
                }
            } else {
                View findViewById2 = this.p.f91766a.findViewById(R.id.e_f);
                if (!(findViewById2 == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    layoutParams.height = 0;
                }
            }
            this.p.f91766a.post(new b(this, cVar));
        } else {
            FrameLayout frameLayout3 = (FrameLayout) this.p.f91766a.findViewById(R.id.ec0);
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            FrameLayout frameLayout4 = this.I;
            l.b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            super.a(aweme, i2);
        }
        View view = this.x;
        l.b(view, "");
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final bd a(View view, s<ag> sVar, Fragment fragment) {
        l.d(fragment, "");
        if (com.ss.android.ugc.aweme.story.c.e.a()) {
            return new com.ss.android.ugc.aweme.story.feed.a();
        }
        bd a2 = super.a(view, sVar, fragment);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onPlayProgressChange(String str, long j2, long j3) {
        SmartImageView smartImageView;
        super.onPlayProgressChange(str, j2, j3);
        SmartImageView smartImageView2 = this.s;
        if (!(smartImageView2 == null || smartImageView2.getVisibility() != 0 || (smartImageView = this.s) == null)) {
            smartImageView.setVisibility(8);
        }
        this.aq.a(new ag(60, new e(g.ON_PLAY_PROGRESS_CHANGED, new com.ss.android.ugc.aweme.story.b.l(str, j2, j3))));
    }
}
