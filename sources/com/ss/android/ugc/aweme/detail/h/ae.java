package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;

public final class ae extends af {
    public static final a H = new a((byte) 0);
    public final f.a.b.a F = new f.a.b.a();
    public Map<String, Boolean> G = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public MentionEditText f79669a;
    private View bA;
    private View bB;
    private View bC;
    private StoryEmojiReactionView bD;
    private View bx;
    private View by;
    private TuxTextView bz;

    static {
        Covode.recordClassIndex(49504);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void b(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(222, new g(ae.class, "onCancelVideoCoverMaskEvent", com.ss.android.ugc.aweme.feed.i.b.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void m() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49505);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final boolean ac() {
        View view = this.bC;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.detail.h.b
    public final void r() {
        super.r();
        this.F.dispose();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f79670a;

        static {
            Covode.recordClassIndex(49506);
        }

        b(ae aeVar) {
            this.f79670a = aeVar;
        }

        public static final class a implements com.ss.android.ugc.aweme.im.service.l.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f79671a;

            static {
                Covode.recordClassIndex(49507);
            }

            @Override // com.ss.android.ugc.aweme.im.service.l.a
            public final void a() {
                com.ss.android.ugc.aweme.feed.adapter.a.a Q;
                aj bf = this.f79671a.f79670a.bf();
                if (bf != null && (Q = bf.Q()) != null) {
                    Q.a(com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_VIDEO);
                }
            }

            a(b bVar) {
                this.f79671a = bVar;
            }

            @Override // com.ss.android.ugc.aweme.im.service.l.a
            public final void a(String str) {
                com.ss.android.ugc.aweme.feed.adapter.a.a Q;
                l.d(str, "");
                MentionEditText mentionEditText = this.f79671a.f79670a.f79669a;
                if (mentionEditText != null) {
                    mentionEditText.setText(str);
                }
                aj bf = this.f79671a.f79670a.bf();
                if (bf != null && (Q = bf.Q()) != null) {
                    com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
                    com.ss.android.ugc.aweme.feed.param.b bVar = this.f79671a.f79670a.aJ;
                    l.b(bVar, "");
                    String eventType = bVar.getEventType();
                    l.b(eventType, "");
                    com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f79671a.f79670a.aJ;
                    l.b(bVar2, "");
                    Q.a(gVar.a(eventType, bVar2.getFrom()));
                }
            }
        }

        public final void onClick(View view) {
            Aweme bL;
            String str;
            Editable text;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f79670a.bL()) && (bL = this.f79670a.bL()) != null) {
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Fragment fragment = this.f79670a.bw;
                l.b(fragment, "");
                i childFragmentManager = fragment.getChildFragmentManager();
                l.b(childFragmentManager, "");
                String eventType = this.f79670a.aJ.getEventType();
                l.b(eventType, "");
                MentionEditText mentionEditText = this.f79670a.f79669a;
                if (mentionEditText == null || (text = mentionEditText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                createIIMServicebyMonsterPlugin.showDmInputViewDialogFragment(childFragmentManager, eventType, bL, str, new a(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void H() {
        super.H();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        ab();
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void ab() {
        if (ac.h(bL()) || com.ss.android.ugc.aweme.story.d.a.h(bL())) {
            bY();
        } else {
            bZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void ax_() {
        super.ax_();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        ab();
    }

    private final void bX() {
        long j2;
        androidx.fragment.app.e activity;
        Map<String, com.ss.android.ugc.aweme.story.model.i> map;
        com.ss.android.ugc.aweme.story.model.i iVar;
        String aid;
        Story story;
        Aweme bL = bL();
        long j3 = 0;
        if (bL == null || (story = bL.getStory()) == null) {
            j2 = 0;
        } else {
            j2 = story.getViewerCount();
        }
        Fragment az_ = az_();
        if (!(az_ == null || (activity = az_.getActivity()) == null)) {
            com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
            String str = "";
            l.b(activity, str);
            IStoryViewerListViewModel a2 = gVar.a(activity, activity);
            Aweme bL2 = bL();
            if (!(bL2 == null || (aid = bL2.getAid()) == null)) {
                str = aid;
            }
            if (!(a2 == null || (map = a2.f136725c) == null || (iVar = map.get(str)) == null)) {
                j2 = (long) iVar.getTotal();
            }
        }
        if (j2 >= 0) {
            j3 = j2;
        }
        String a3 = a(j3);
        TuxTextView tuxTextView = this.bz;
        if (tuxTextView != null) {
            tuxTextView.setText(a3);
        }
    }

    private final void bY() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (y.f(bL())) {
            View view = this.bx;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            View view2 = this.bB;
            if (view2 != null && view2.getVisibility() != 8) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = this.bx;
        if (!(view3 == null || view3.getVisibility() == 0)) {
            view3.setVisibility(0);
        }
        if (com.ss.android.ugc.aweme.story.d.a.h(bL()) || ad() || (com.ss.android.ugc.aweme.story.d.a.j(bL()) && !com.ss.android.ugc.aweme.story.d.a.k(bL()))) {
            View view4 = this.by;
            if (!(view4 == null || view4.getVisibility() == 4)) {
                view4.setVisibility(4);
            }
        } else {
            View view5 = this.by;
            if (!(view5 == null || view5.getVisibility() == 0)) {
                view5.setVisibility(0);
            }
        }
        View view6 = this.bB;
        if (!(view6 == null || view6.getVisibility() == 8)) {
            view6.setVisibility(8);
        }
        bX();
    }

    private final void bZ() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (y.f(bL())) {
            View view = this.bx;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            View view2 = this.bB;
            if (view2 != null && view2.getVisibility() != 8) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = this.bx;
        if (!(view3 == null || view3.getVisibility() == 8)) {
            view3.setVisibility(8);
        }
        View view4 = this.bB;
        if (!(view4 == null || view4.getVisibility() == 0)) {
            view4.setVisibility(0);
        }
        if (com.ss.android.ugc.aweme.story.d.a.f(bL())) {
            View view5 = this.bC;
            if (!(view5 == null || view5.getVisibility() == 4)) {
                view5.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView = this.bD;
            if (!(storyEmojiReactionView == null || storyEmojiReactionView.getVisibility() == 0)) {
                storyEmojiReactionView.setVisibility(0);
            }
        } else if (com.ss.android.ugc.aweme.story.d.a.e(bL())) {
            View view6 = this.bC;
            if (!(view6 == null || view6.getVisibility() == 4)) {
                view6.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView2 = this.bD;
            if (!(storyEmojiReactionView2 == null || storyEmojiReactionView2.getVisibility() == 4)) {
                storyEmojiReactionView2.setVisibility(4);
            }
        } else if (t(bL())) {
            View view7 = this.bC;
            if (!(view7 == null || view7.getVisibility() == 4)) {
                view7.setVisibility(4);
            }
            StoryEmojiReactionView storyEmojiReactionView3 = this.bD;
            if (!(storyEmojiReactionView3 == null || storyEmojiReactionView3.getVisibility() == 0)) {
                storyEmojiReactionView3.setVisibility(0);
            }
        } else {
            View view8 = this.bC;
            if (!(view8 == null || view8.getVisibility() == 0)) {
                view8.setVisibility(0);
            }
            StoryEmojiReactionView storyEmojiReactionView4 = this.bD;
            if (!(storyEmojiReactionView4 == null || storyEmojiReactionView4.getVisibility() == 0)) {
                storyEmojiReactionView4.setVisibility(0);
            }
        }
        MentionEditText mentionEditText = this.f79669a;
        if (mentionEditText != null) {
            mentionEditText.setText("");
        }
        StoryEmojiReactionView storyEmojiReactionView5 = this.bD;
        if (storyEmojiReactionView5 != null) {
            storyEmojiReactionView5.a(bL());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void p() {
        Story story;
        View view;
        StoryEmojiReactionView storyEmojiReactionView;
        View view2;
        View view3;
        MethodCollector.i(4572);
        super.p();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        Aweme bL3 = bL();
        if (bL3 != null) {
            bL3.getAid();
        }
        Aweme bL4 = bL();
        if (bL4 != null) {
            Integer.valueOf(bL4.getAwemeType());
        }
        if (this.bv == null) {
            MethodCollector.o(4572);
            return;
        }
        Activity activity = this.bv;
        l.b(activity, "");
        if (!activity.isFinishing()) {
            if (az_() == null) {
                MethodCollector.o(4572);
                return;
            }
            View view4 = null;
            if (this.bx == null) {
                Aweme bL5 = bL();
                if (bL5 != null) {
                    bL5.getAid();
                }
                Aweme bL6 = bL();
                if (bL6 != null) {
                    Integer.valueOf(bL6.getAwemeType());
                }
                Fragment az_ = az_();
                l.b(az_, "");
                ViewGroup viewGroup = (ViewGroup) az_.getView();
                if (viewGroup instanceof FrameLayout) {
                    view3 = com.a.a(LayoutInflater.from(this.bv), R.layout.wx, viewGroup, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    View findViewById = view3.findViewById(R.id.ch3);
                    this.by = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new d(this));
                    }
                    this.bz = (TuxTextView) view3.findViewById(R.id.etw);
                    bX();
                    if (ad() || (com.ss.android.ugc.aweme.story.d.a.j(bL()) && !com.ss.android.ugc.aweme.story.d.a.k(bL()))) {
                        View view5 = this.by;
                        if (!(view5 == null || view5.getVisibility() == 4)) {
                            view5.setVisibility(4);
                        }
                    } else {
                        View view6 = this.by;
                        if (!(view6 == null || view6.getVisibility() == 0)) {
                            view6.setVisibility(0);
                        }
                    }
                    if (com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                        View view7 = this.by;
                        if (!(view7 == null || view7.getVisibility() == 4)) {
                            view7.setVisibility(4);
                        }
                    } else {
                        View view8 = this.by;
                        if (!(view8 == null || view8.getVisibility() == 0)) {
                            view8.setVisibility(0);
                        }
                    }
                    View findViewById2 = view3.findViewById(R.id.en3);
                    this.bA = findViewById2;
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new e(this));
                    }
                    view3.setVisibility(8);
                    viewGroup.addView(view3, layoutParams);
                } else {
                    view3 = null;
                }
                this.bx = view3;
            }
            if (ad()) {
                Aweme bL7 = bL();
                if (bL7 != null) {
                    bL7.getAid();
                }
                Aweme bL8 = bL();
                if (bL8 != null) {
                    Integer.valueOf(bL8.getAwemeType());
                    MethodCollector.o(4572);
                    return;
                }
                MethodCollector.o(4572);
                return;
            }
            if (this.bB == null) {
                Aweme bL9 = bL();
                if (bL9 != null) {
                    bL9.getAid();
                }
                Aweme bL10 = bL();
                if (bL10 != null) {
                    Integer.valueOf(bL10.getAwemeType());
                }
                Fragment az_2 = az_();
                l.b(az_2, "");
                ViewGroup viewGroup2 = (ViewGroup) az_2.getView();
                if (viewGroup2 instanceof FrameLayout) {
                    view4 = com.a.a(LayoutInflater.from(this.bv), R.layout.ww, viewGroup2, false);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 80;
                    this.bC = view4.findViewById(R.id.cf4);
                    if (!(!com.ss.android.ugc.aweme.story.d.a.f(bL()) || (view2 = this.bC) == null || view2.getVisibility() == 4)) {
                        view2.setVisibility(4);
                    }
                    if (!(!com.ss.android.ugc.aweme.story.d.a.e(bL()) || (storyEmojiReactionView = this.bD) == null || storyEmojiReactionView.getVisibility() == 8)) {
                        storyEmojiReactionView.setVisibility(8);
                    }
                    Aweme bL11 = bL();
                    if (!(bL11 == null || (story = bL11.getStory()) == null || !story.getChatDisable() || (view = this.bC) == null || view.getVisibility() == 4)) {
                        view.setVisibility(4);
                    }
                    MentionEditText mentionEditText = (MentionEditText) view4.findViewById(R.id.cly);
                    this.f79669a = mentionEditText;
                    if (mentionEditText != null) {
                        mentionEditText.setCursorVisible(false);
                        mentionEditText.setTextAlignment(5);
                    }
                    MentionEditText mentionEditText2 = this.f79669a;
                    if (mentionEditText2 != null) {
                        mentionEditText2.setOnClickListener(new b(this));
                    }
                    StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) view4.findViewById(R.id.ave);
                    this.bD = storyEmojiReactionView2;
                    if (storyEmojiReactionView2 != null) {
                        storyEmojiReactionView2.f89473b = bL();
                    }
                    StoryEmojiReactionView storyEmojiReactionView3 = this.bD;
                    if (storyEmojiReactionView3 != null) {
                        storyEmojiReactionView3.setStoryEmojiReactionListener(new c(this));
                    }
                    l.b(view4, "");
                    view4.setVisibility(8);
                    viewGroup2.addView(view4, layoutParams2);
                }
                this.bB = view4;
            }
            if (bL() == null || y.f(bL())) {
                View view9 = this.bx;
                if (view9 != null) {
                    view9.setVisibility(8);
                }
                View view10 = this.bB;
                if (view10 != null) {
                    view10.setVisibility(8);
                    MethodCollector.o(4572);
                    return;
                }
                MethodCollector.o(4572);
                return;
            } else if (ac.h(bL()) || com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                View view11 = this.bx;
                if (view11 != null) {
                    view11.setVisibility(0);
                }
                View view12 = this.bB;
                if (view12 != null) {
                    view12.setVisibility(8);
                    MethodCollector.o(4572);
                    return;
                }
                MethodCollector.o(4572);
                return;
            } else {
                View view13 = this.bx;
                if (view13 != null) {
                    view13.setVisibility(8);
                }
                View view14 = this.bB;
                if (view14 != null) {
                    view14.setVisibility(0);
                    MethodCollector.o(4572);
                    return;
                }
            }
        }
        MethodCollector.o(4572);
    }

    public static final class c implements StoryEmojiReactionView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f79672a;

        static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final a f79673a = new a();

            static {
                Covode.recordClassIndex(49509);
            }

            a() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(49508);
        }

        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f79674a = new b();

            static {
                Covode.recordClassIndex(49510);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ae aeVar) {
            this.f79672a = aeVar;
        }

        @Override // com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.d
        public final void a(StoryEmojiReactionView.c cVar, Aweme aweme) {
            l.d(cVar, "");
            if (aweme != null) {
                aweme.getAid();
            }
            ae aeVar = this.f79672a;
            String str = cVar.f89487b;
            l.d(str, "");
            if (!(aweme == null || aweme.getAid() == null || aweme.getAuthor() == null)) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                com.ss.android.ugc.aweme.feed.param.b bVar = aeVar.aJ;
                l.b(bVar, "");
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", bVar.getEventType());
                User author = aweme.getAuthor();
                if (author == null) {
                    l.b();
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("follow_status", h.a(author)).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("prompt", str);
                l.b(a3, "");
                h.a(a3, aweme);
                r.a("emoji_react", a3.f66730a);
            }
            if (!com.ss.android.ugc.aweme.story.d.a.f(aweme) && !com.ss.android.ugc.aweme.story.d.a.k(aweme) && aweme != null && aweme.getAid() != null) {
                String str2 = "aweme.aid" + cVar.f89486a;
                Boolean bool = this.f79672a.G.get(str2);
                if (bool == null || !bool.booleanValue()) {
                    this.f79672a.G.put(str2, true);
                    com.ss.android.ugc.aweme.story.g gVar = com.ss.android.ugc.aweme.story.g.f137757a;
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    f.a.b.b a4 = gVar.a(aid, cVar.f89486a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(a.f79673a, b.f79674a);
                    l.b(a4, "");
                    f.a.j.a.a(a4, this.f79672a.F);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.i.m
    public final void a(Aweme aweme) {
        super.a(aweme);
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCancelVideoCoverMaskEvent(com.ss.android.ugc.aweme.feed.i.b bVar) {
        l.d(bVar, "");
        ab();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f79676a;

        static {
            Covode.recordClassIndex(49512);
        }

        e(ae aeVar) {
            this.f79676a = aeVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f79676a.ae();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae(com.ss.android.ugc.aweme.feed.param.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    private static boolean t(Aweme aweme) {
        boolean z;
        Story story;
        if (aweme == null || (story = aweme.getStory()) == null) {
            z = false;
        } else {
            z = story.getChatDisable();
        }
        boolean d2 = IMUnder16ProxyImpl.n().d();
        if (z || d2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.i.m
    public final void b_(Exception exc) {
        super.b_(exc);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f79675a;

        static {
            Covode.recordClassIndex(49511);
        }

        d(ae aeVar) {
            this.f79675a = aeVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f79675a.bL())) {
                this.f79675a.j("click_icon");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        p pVar;
        String str;
        if (bD() && bVar != null && (pVar = (p) bVar.a()) != null) {
            Aweme bL = bL();
            if (bL != null) {
                str = bL.getAid();
            } else {
                str = null;
            }
            if (l.a((Object) str, pVar.getFirst())) {
                long total = (long) ((com.ss.android.ugc.aweme.story.model.i) pVar.getSecond()).getTotal();
                if (total < 0) {
                    total = 0;
                }
                String a2 = a(total);
                TuxTextView tuxTextView = this.bz;
                if (tuxTextView != null) {
                    tuxTextView.setText(a2);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void a(List<Aweme> list, boolean z) {
        super.a(list, z);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        ab();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void b(List<Aweme> list, boolean z) {
        super.b(list, z);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        ab();
    }
}
