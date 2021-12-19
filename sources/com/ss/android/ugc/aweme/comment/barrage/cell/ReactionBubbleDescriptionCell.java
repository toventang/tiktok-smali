package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.barrage.view.BubbleDescView;
import com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleMultiAnchorView;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleTaggedPeopleView;
import com.ss.android.ugc.aweme.comment.barrage.view.HollowTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.widget.i;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

public final class ReactionBubbleDescriptionCell extends PowerCell<com.ss.android.ugc.aweme.comment.barrage.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71598a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71599b;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f71600j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f71601k;

    /* renamed from: l  reason: collision with root package name */
    private BubbleDescView f71602l;

    /* renamed from: m  reason: collision with root package name */
    private HollowTextView f71603m;
    private CommentBubbleTaggedPeopleView n;
    private CommentBubbleMultiAnchorView o;
    private com.ss.android.ugc.aweme.comment.barrage.b.b p;

    static {
        Covode.recordClassIndex(44049);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44050);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        super.m();
    }

    static final class b extends m implements h.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71604a = new b();

        static {
            Covode.recordClassIndex(44051);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.b("bubble_desc_click_faker_cid", false));
            return null;
        }
    }

    private final String a() {
        com.ss.android.ugc.aweme.comment.barrage.b.b bVar = this.p;
        if (bVar != null) {
            return bVar.f71556e + '_' + bVar.f71548a.getUid();
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        com.ss.android.ugc.aweme.comment.barrage.a aVar;
        Set<String> set;
        String str;
        String authorUid;
        String str2;
        String str3;
        super.l();
        com.ss.android.ugc.aweme.comment.barrage.b.b bVar = this.p;
        if (bVar != null && (aVar = bVar.f71551d) != null && (set = aVar.f71538g) != null && !set.contains(a())) {
            set.add(a());
            com.ss.android.ugc.aweme.comment.barrage.b.b bVar2 = this.p;
            String str4 = null;
            if (bVar2 != null) {
                p[] pVarArr = new p[4];
                com.ss.android.ugc.aweme.comment.barrage.a aVar2 = bVar2.f71551d;
                if (aVar2 != null) {
                    str2 = aVar2.f71533b;
                } else {
                    str2 = null;
                }
                pVarArr[0] = v.a(str2, "enter_from");
                com.ss.android.ugc.aweme.comment.barrage.a aVar3 = bVar2.f71551d;
                if (aVar3 != null) {
                    str3 = aVar3.f71536e;
                } else {
                    str3 = null;
                }
                pVarArr[1] = v.a(str3, "story_type");
                pVarArr[2] = v.a("creator", "notice_type");
                pVarArr[3] = v.a(bVar2.f71548a.getUid(), "from_user_id");
                r.a("interaction_bullet_show", pVarArr);
            }
            CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView = this.n;
            if (commentBubbleTaggedPeopleView != null) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                com.ss.android.ugc.aweme.comment.barrage.a aVar4 = commentBubbleTaggedPeopleView.f71692c;
                if (aVar4 != null) {
                    str4 = aVar4.f71533b;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str4);
                Aweme aweme = commentBubbleTaggedPeopleView.f71691b;
                String str5 = "";
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = str5;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str);
                Aweme aweme2 = commentBubbleTaggedPeopleView.f71691b;
                if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
                    str5 = authorUid;
                }
                r.a("tag_anchor_show", a3.a("author_id", str5).a("anchor_type", "low_interest").f66730a);
            }
            CommentBubbleMultiAnchorView commentBubbleMultiAnchorView = this.o;
            if (commentBubbleMultiAnchorView != null) {
                BubbleMultiTagLayout bubbleMultiTagLayout = commentBubbleMultiAnchorView.f71687a;
                bubbleMultiTagLayout.f71680a.a(bubbleMultiTagLayout);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleDescriptionCell f71605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.b f71606b;

        static {
            Covode.recordClassIndex(44052);
        }

        c(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, com.ss.android.ugc.aweme.comment.barrage.b.b bVar) {
            this.f71605a = reactionBubbleDescriptionCell;
            this.f71606b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.b("bubble_desc_click_faker_cid", false));
            ReactionBubbleDescriptionCell.a(this.f71606b.f71548a, this.f71606b.f71551d);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleDescriptionCell f71607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.b f71608b;

        static {
            Covode.recordClassIndex(44053);
        }

        d(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, com.ss.android.ugc.aweme.comment.barrage.b.b bVar) {
            this.f71607a = reactionBubbleDescriptionCell;
            this.f71608b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71607a.b(this.f71608b.f71548a, this.f71608b.f71551d);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleDescriptionCell f71609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.b f71610b;

        static {
            Covode.recordClassIndex(44054);
        }

        e(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, com.ss.android.ugc.aweme.comment.barrage.b.b bVar) {
            this.f71609a = reactionBubbleDescriptionCell;
            this.f71610b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71609a.b(this.f71610b.f71548a, this.f71610b.f71551d);
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(44055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(1);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            View view = this.$view;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            eVar2.f44775a = Integer.valueOf(context.getResources().getColor(R.color.ap));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        MethodCollector.i(2121);
        l.d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.ji, null);
        l.b(inflate, "");
        com.bytedance.tux.c.e a2 = com.bytedance.tux.c.f.a(new f(inflate));
        Context context = viewGroup.getContext();
        l.b(context, "");
        inflate.setBackground(a2.a(context));
        this.f71599b = (SmartImageView) inflate.findViewById(R.id.ov);
        this.f71600j = (TuxTextView) inflate.findViewById(R.id.csa);
        this.f71601k = (TuxTextView) inflate.findViewById(R.id.ekz);
        this.f71602l = (BubbleDescView) inflate.findViewById(R.id.aka);
        this.f71603m = (HollowTextView) inflate.findViewById(R.id.dv);
        this.n = (CommentBubbleTaggedPeopleView) inflate.findViewById(R.id.a0c);
        this.o = (CommentBubbleMultiAnchorView) inflate.findViewById(R.id.cp5);
        MethodCollector.o(2121);
        return inflate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.comment.barrage.b.b bVar) {
        String d2;
        int i2;
        List<InteractionTagUserInfo> taggedUsers;
        List<InteractionTagUserInfo> taggedUsers2;
        String str;
        AwemeTextLabelModel label;
        boolean z;
        String a2;
        com.ss.android.ugc.aweme.comment.barrage.b.b bVar2 = bVar;
        l.d(bVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) bVar2);
        com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(bVar2.f71548a.getAvatarThumb())).a("ReactionBubblePublishCell");
        a3.E = this.f71599b;
        e.a aVar = new e.a();
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a4 = aVar.a();
        l.b(a4, "");
        a3.w = a4;
        a3.f39907c = true;
        a3.c();
        View view = this.itemView;
        l.b(view, "");
        i.a.a.a.a.b.c(view);
        TuxTextView tuxTextView = this.f71600j;
        if (tuxTextView != null) {
            View view2 = this.itemView;
            l.b(view2, "");
            tuxTextView.setTextColor(androidx.core.content.b.c(view2.getContext(), R.color.ac));
        }
        TuxTextView tuxTextView2 = this.f71600j;
        if (tuxTextView2 != null) {
            a.C0730a aVar2 = new a.C0730a();
            String uniqueId = bVar2.f71548a.getUniqueId();
            l.b(uniqueId, "");
            tuxTextView2.setText(aVar2.a(uniqueId).f33382a);
        }
        long j2 = bVar2.f71550c;
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        if (instance.getTimeInMillis() - j2 <= 0) {
            Calendar instance2 = Calendar.getInstance();
            l.b(instance2, "");
            j2 = instance2.getTimeInMillis() - 1;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
            aa.a aVar3 = aa.s;
            d2 = aa.a.a(j2);
        } else {
            View view3 = this.itemView;
            l.b(view3, "");
            d2 = ib.d(view3.getContext(), j2);
        }
        TuxTextView tuxTextView3 = this.f71601k;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(new a.C0730a().a(" · ".concat(String.valueOf(d2))).f33382a);
        }
        BubbleDescView bubbleDescView = this.f71602l;
        if (bubbleDescView != null) {
            View view4 = this.itemView;
            l.b(view4, "");
            bubbleDescView.setTextColor(Integer.valueOf(androidx.core.content.b.c(view4.getContext(), R.color.a9)));
        }
        BubbleDescView bubbleDescView2 = this.f71602l;
        if (bubbleDescView2 != null) {
            bubbleDescView2.setMMaxLinesWhenFold(2);
        }
        this.p = bVar2;
        BubbleDescView bubbleDescView3 = this.f71602l;
        if (bubbleDescView3 != null) {
            bubbleDescView3.setSpanClickInterceptor(b.f71604a);
        }
        BubbleDescView bubbleDescView4 = this.f71602l;
        if (bubbleDescView4 != null) {
            Aweme aweme = bVar2.f71549b;
            com.ss.android.ugc.aweme.comment.barrage.a aVar4 = bVar2.f71551d;
            View view5 = this.itemView;
            l.b(view5, "");
            String string = view5.getContext().getString(R.string.boe);
            l.b(string, "");
            l.d(aweme, "");
            l.d(string, "");
            bubbleDescView4.f71667a = aweme;
            bubbleDescView4.f71668b = aVar4;
            String desc = aweme.getDesc();
            if (desc == null || desc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a2 = h.m.p.a(string, " ", " ", false);
            } else {
                String desc2 = aweme.getDesc();
                l.b(desc2, "");
                a2 = h.m.p.a(desc2, " ", " ", false);
            }
            SpannableStringBuilder append = new SpannableStringBuilder(a2).append((CharSequence) bubbleDescView4.a(aweme));
            if (!TextUtils.isEmpty(append)) {
                bubbleDescView4.setText(append);
                bubbleDescView4.setVisibility(0);
                com.ss.android.ugc.aweme.emoji.i.b.b.a(bubbleDescView4);
            } else {
                bubbleDescView4.setVisibility(8);
            }
            Integer num = bubbleDescView4.f71669c;
            if (num != null) {
                bubbleDescView4.setTextColor(num.intValue());
            }
            bubbleDescView4.setSpanColor(bubbleDescView4.getCurrentTextColor());
            bubbleDescView4.setOnSpanClickListener(new BubbleDescView.c(bubbleDescView4));
            bubbleDescView4.setSpanColor(bubbleDescView4.getCurrentTextColor());
            if (!(bubbleDescView4.getContext() == null || bubbleDescView4.f71667a == null)) {
                bubbleDescView4.setTextExtraList(bubbleDescView4.f71667a);
                try {
                    if (gb.a(bubbleDescView4.getContext())) {
                        bubbleDescView4.setMovementMethod(i.a());
                    } else {
                        bubbleDescView4.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
                    }
                } catch (IndexOutOfBoundsException e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                }
                Aweme aweme2 = bubbleDescView4.f71667a;
                if (aweme2 == null) {
                    l.b();
                }
                bubbleDescView4.getViewTreeObserver().addOnGlobalLayoutListener(new BubbleDescView.b(bubbleDescView4, bubbleDescView4, aweme2));
            }
        }
        this.itemView.setOnClickListener(new c(this, bVar2));
        SmartImageView smartImageView = this.f71599b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new d(this, bVar2));
        }
        TuxTextView tuxTextView4 = this.f71600j;
        if (tuxTextView4 != null) {
            tuxTextView4.setOnClickListener(new e(this, bVar2));
        }
        View view6 = this.itemView;
        l.b(view6, "");
        view6.setTag(2);
        Aweme aweme3 = bVar2.f71549b;
        HollowTextView hollowTextView = this.f71603m;
        l.d(aweme3, "");
        InteractionTagUserInfo interactionTagUserInfo = null;
        if (hollowTextView != null) {
            if (com.ss.android.ugc.aweme.comment.barrage.a.c.a(aweme3)) {
                AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                if (awemeRawAd == null || (label = awemeRawAd.getLabel()) == null || (str = label.getLabelName()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    i.a.a.a.a.b.c(hollowTextView);
                    hollowTextView.setText(str);
                } else {
                    i.a.a.a.a.b.a(hollowTextView);
                }
            } else {
                i.a.a.a.a.b.a(hollowTextView);
            }
        }
        CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView = this.n;
        if (commentBubbleTaggedPeopleView != null) {
            Aweme aweme4 = bVar2.f71549b;
            com.ss.android.ugc.aweme.comment.barrage.a aVar5 = bVar2.f71551d;
            commentBubbleTaggedPeopleView.f71691b = aweme4;
            commentBubbleTaggedPeopleView.f71692c = aVar5;
            if (aweme4 != null) {
                InteractionTagInfo interactionTagInfo = aweme4.getInteractionTagInfo();
                if (!(interactionTagInfo == null || (taggedUsers2 = interactionTagInfo.getTaggedUsers()) == null)) {
                    interactionTagUserInfo = (InteractionTagUserInfo) n.h((List) taggedUsers2);
                }
                InteractionTagInfo interactionTagInfo2 = aweme4.getInteractionTagInfo();
                if (interactionTagInfo2 == null || (taggedUsers = interactionTagInfo2.getTaggedUsers()) == null) {
                    i2 = 0;
                } else {
                    i2 = taggedUsers.size();
                }
                if (interactionTagUserInfo != null) {
                    i.a.a.a.a.b.c(commentBubbleTaggedPeopleView);
                    if (i2 > 1) {
                        TuxTextView tuxTextView5 = commentBubbleTaggedPeopleView.f71690a;
                        Context context = commentBubbleTaggedPeopleView.getContext();
                        l.b(context, "");
                        String string2 = context.getResources().getString(R.string.gc1);
                        l.b(string2, "");
                        String a5 = com.a.a(string2, Arrays.copyOf(new Object[]{"", Integer.valueOf(i2)}, 2));
                        l.b(a5, "");
                        tuxTextView5.setText(a5);
                    } else {
                        commentBubbleTaggedPeopleView.f71690a.setText(interactionTagUserInfo.getUniqueId());
                    }
                    commentBubbleTaggedPeopleView.setOnClickListener(new CommentBubbleTaggedPeopleView.a(commentBubbleTaggedPeopleView, aVar5, aweme4));
                }
            }
            i.a.a.a.a.b.a(commentBubbleTaggedPeopleView);
        }
        CommentBubbleMultiAnchorView commentBubbleMultiAnchorView = this.o;
        if (commentBubbleMultiAnchorView != null) {
            commentBubbleMultiAnchorView.a(bVar2.f71549b);
        }
    }

    public static void a(User user, com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        String str;
        String str2;
        p[] pVarArr = new p[4];
        Aweme aweme = null;
        if (aVar != null) {
            str = aVar.f71533b;
        } else {
            str = null;
        }
        pVarArr[0] = v.a(str, "enter_from");
        if (aVar != null) {
            aweme = aVar.f71532a;
        }
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            str2 = "story";
        } else {
            str2 = UGCMonitor.TYPE_POST;
        }
        pVarArr[1] = v.a(str2, "story_type");
        pVarArr[2] = v.a("creator", "notice_type");
        pVarArr[3] = v.a(user.getUid(), "from_user_id");
        r.a("interaction_bullet_click", pVarArr);
    }

    public final void b(User user, com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        if (aVar != null) {
            q f2 = new q().g(aVar.f71532a);
            String str = aVar.f71533b;
            if (str == null) {
                str = "";
            }
            q qVar = (q) f2.o(str).a("click_head");
            qVar.W = aVar.f71536e;
            qVar.Y = "bullet";
            qVar.Z = "bullet";
            qVar.V = aVar.f71535d;
            qVar.f();
        }
        a(user, aVar);
        View view = this.itemView;
        l.b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }
}
