package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.Set;

public final class ReactionBubbleCommentCell extends PowerCell<com.ss.android.ugc.aweme.comment.barrage.b.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71585a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71586b;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f71587j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f71588k;

    /* renamed from: l  reason: collision with root package name */
    private TuxIconView f71589l;

    /* renamed from: m  reason: collision with root package name */
    private TuxTextView f71590m;
    private com.ss.android.ugc.aweme.comment.barrage.b.a n;

    static {
        Covode.recordClassIndex(44044);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44045);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String a() {
        com.ss.android.ugc.aweme.comment.barrage.b.a aVar = this.n;
        if (aVar != null) {
            return aVar.f71556e + '_' + aVar.f71545a.getCid();
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        com.ss.android.ugc.aweme.comment.barrage.a aVar;
        Set<String> set;
        String str;
        super.l();
        com.ss.android.ugc.aweme.comment.barrage.b.a aVar2 = this.n;
        if (aVar2 != null && (aVar = aVar2.f71547c) != null && (set = aVar.f71538g) != null && !set.contains(a())) {
            set.add(a());
            com.ss.android.ugc.aweme.comment.barrage.b.a aVar3 = this.n;
            if (aVar3 != null) {
                p[] pVarArr = new p[4];
                com.ss.android.ugc.aweme.comment.barrage.a aVar4 = aVar3.f71547c;
                String str2 = null;
                if (aVar4 != null) {
                    str = aVar4.f71536e;
                } else {
                    str = null;
                }
                pVarArr[0] = v.a(str, "story_type");
                com.ss.android.ugc.aweme.comment.barrage.a aVar5 = aVar3.f71547c;
                if (aVar5 != null) {
                    str2 = aVar5.f71533b;
                }
                pVarArr[1] = v.a(str2, "enter_from");
                pVarArr[2] = v.a(UGCMonitor.EVENT_COMMENT, "notice_type");
                User user = aVar3.f71545a.getUser();
                l.b(user, "");
                pVarArr[3] = v.a(user.getUid(), "from_user_id");
                r.a("interaction_bullet_show", pVarArr);
            }
        }
    }

    static final class d extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f71597a = new d();

        static {
            Covode.recordClassIndex(44048);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.a5);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleCommentCell f71591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comment f71592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.a f71593c;

        static {
            Covode.recordClassIndex(44046);
        }

        b(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, com.ss.android.ugc.aweme.comment.barrage.b.a aVar) {
            this.f71591a = reactionBubbleCommentCell;
            this.f71592b = comment;
            this.f71593c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
            if (com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.b(r0)) == null) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r4)
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f71592b
                java.lang.String r0 = r0.getCid()
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x0021
                com.ss.android.ugc.aweme.comment.c.b r1 = new com.ss.android.ugc.aweme.comment.c.b
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f71592b
                java.lang.String r0 = r0.getCid()
                h.f.b.l.b(r0, r2)
                r1.<init>(r0)
                com.ss.android.ugc.d.a.b r0 = com.ss.android.ugc.d.a.c.a(r1)
                if (r0 != 0) goto L_0x0032
            L_0x0021:
                com.ss.android.ugc.aweme.comment.c.b r1 = new com.ss.android.ugc.aweme.comment.c.b
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f71592b
                java.lang.String r0 = r0.getFakeId()
                h.f.b.l.b(r0, r2)
                r1.<init>(r0)
                com.ss.android.ugc.d.a.c.a(r1)
            L_0x0032:
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f71592b
                com.ss.android.ugc.aweme.profile.model.User r1 = r0.getUser()
                h.f.b.l.b(r1, r2)
                com.ss.android.ugc.aweme.comment.barrage.b.a r0 = r3.f71593c
                com.ss.android.ugc.aweme.comment.barrage.a r0 = r0.f71547c
                com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell.a(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell.b.onClick(android.view.View):void");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleCommentCell f71594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comment f71595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.a f71596c;

        static {
            Covode.recordClassIndex(44047);
        }

        c(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, com.ss.android.ugc.aweme.comment.barrage.b.a aVar) {
            this.f71594a = reactionBubbleCommentCell;
            this.f71595b = comment;
            this.f71596c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ReactionBubbleCommentCell reactionBubbleCommentCell = this.f71594a;
            User user = this.f71595b.getUser();
            l.b(user, "");
            com.ss.android.ugc.aweme.comment.barrage.a aVar = this.f71596c.f71547c;
            if (aVar != null) {
                q f2 = new q().g(aVar.f71532a);
                String str = aVar.f71533b;
                if (str == null) {
                    str = "";
                }
                q qVar = (q) f2.o(str).a("click_head");
                qVar.Y = "bullet";
                qVar.W = aVar.f71536e;
                qVar.Z = "bullet";
                qVar.V = aVar.f71535d;
                qVar.f();
            }
            ReactionBubbleCommentCell.a(user, aVar);
            View view2 = reactionBubbleCommentCell.itemView;
            l.b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
        }
    }

    private final void a(boolean z) {
        TextPaint paint;
        float f2;
        TextPaint paint2;
        TextPaint paint3;
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (z) {
            TuxTextView tuxTextView = this.f71587j;
            float f3 = 0.0f;
            if (tuxTextView == null || (paint3 = tuxTextView.getPaint()) == null) {
                f2 = 0.0f;
            } else {
                TuxTextView tuxTextView2 = this.f71587j;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                f2 = paint3.measureText(String.valueOf(charSequence));
            }
            TuxTextView tuxTextView3 = this.f71590m;
            if (!(tuxTextView3 == null || (paint2 = tuxTextView3.getPaint()) == null)) {
                TuxTextView tuxTextView4 = this.f71590m;
                if (tuxTextView4 != null) {
                    charSequence2 = tuxTextView4.getText();
                }
                f3 = paint2.measureText(String.valueOf(charSequence2));
            }
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            if (f2 + f3 > ((float) h.g.a.a(TypedValue.applyDimension(1, 220.0f, system.getDisplayMetrics())))) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                if (f3 < ((float) h.g.a.a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics())))) {
                    TuxTextView tuxTextView5 = this.f71587j;
                    if (tuxTextView5 != null) {
                        Resources system3 = Resources.getSystem();
                        l.a((Object) system3, "");
                        tuxTextView5.setMaxWidth((int) (((float) h.g.a.a(TypedValue.applyDimension(1, 220.0f, system3.getDisplayMetrics()))) - f3));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView6 = this.f71587j;
                if (tuxTextView6 != null) {
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    tuxTextView6.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics())));
                }
                TuxTextView tuxTextView7 = this.f71590m;
                if (tuxTextView7 != null) {
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    tuxTextView7.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 60.0f, system5.getDisplayMetrics())));
                    return;
                }
                return;
            }
            return;
        }
        TuxTextView tuxTextView8 = this.f71587j;
        if (!(tuxTextView8 == null || (paint = tuxTextView8.getPaint()) == null)) {
            TuxTextView tuxTextView9 = this.f71587j;
            if (tuxTextView9 != null) {
                charSequence2 = tuxTextView9.getText();
            }
            paint.measureText(String.valueOf(charSequence2));
        }
        TuxTextView tuxTextView10 = this.f71587j;
        if (tuxTextView10 != null) {
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            tuxTextView10.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 236.0f, system6.getDisplayMetrics())));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jh, viewGroup, false);
        l.b(a2, "");
        e a3 = f.a(d.f71597a);
        Context context = viewGroup.getContext();
        l.b(context, "");
        a2.setBackground(a3.a(context));
        this.f71586b = (SmartImageView) a2.findViewById(R.id.ov);
        this.f71587j = (TuxTextView) a2.findViewById(R.id.csa);
        this.f71588k = (TuxTextView) a2.findViewById(R.id.ak_);
        this.f71589l = (TuxIconView) a2.findViewById(R.id.dkw);
        this.f71590m = (TuxTextView) a2.findViewById(R.id.dkx);
        a2.setVisibility(4);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.comment.barrage.b.a aVar) {
        String text;
        com.ss.android.ugc.aweme.comment.barrage.b.a aVar2 = aVar;
        l.d(aVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) aVar2);
        Comment comment = aVar2.f71545a;
        User user = comment.getUser();
        l.b(user, "");
        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb())).a("ReactionBubbleCommentCell");
        a2.E = this.f71586b;
        e.a aVar3 = new e.a();
        aVar3.f39827a = true;
        com.bytedance.lighten.a.e a3 = aVar3.a();
        l.b(a3, "");
        a2.w = a3;
        a2.f39907c = true;
        a2.c();
        this.n = aVar2;
        this.itemView.setOnClickListener(new b(this, comment, aVar2));
        SmartImageView smartImageView = this.f71586b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new c(this, comment, aVar2));
        }
        TuxTextView tuxTextView = this.f71587j;
        if (tuxTextView != null) {
            User user2 = comment.getUser();
            l.b(user2, "");
            tuxTextView.setText(user2.getUniqueId());
        }
        if (comment.getAliasAweme() != null) {
            StringBuilder sb = new StringBuilder("[");
            View view = this.itemView;
            l.b(view, "");
            text = sb.append(view.getContext().getString(R.string.bog)).append(']').toString();
        } else {
            text = comment.getText();
        }
        TuxTextView tuxTextView2 = this.f71588k;
        if (tuxTextView2 != null) {
            a.C0730a aVar4 = new a.C0730a();
            l.b(text, "");
            tuxTextView2.setText(aVar4.a(text).f33382a);
        }
        if (TextUtils.isEmpty(comment.getReplyToUserName())) {
            TuxIconView tuxIconView = this.f71589l;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxTextView tuxTextView3 = this.f71590m;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            }
            a(false);
        } else {
            TuxIconView tuxIconView2 = this.f71589l;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.f71590m;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            TuxTextView tuxTextView5 = this.f71590m;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(comment.getReplyToUserName());
            }
            a(true);
        }
        if (aVar2.f71546b) {
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setVisibility(0);
            View view3 = this.itemView;
            l.b(view3, "");
            view3.setTag(1);
            return;
        }
        View view4 = this.itemView;
        l.b(view4, "");
        view4.setVisibility(4);
        View view5 = this.itemView;
        l.b(view5, "");
        view5.setTag(0);
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
        pVarArr[1] = v.a(UGCMonitor.EVENT_COMMENT, "notice_type");
        if (aVar != null) {
            aweme = aVar.f71532a;
        }
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            str2 = "story";
        } else {
            str2 = UGCMonitor.TYPE_POST;
        }
        pVarArr[2] = v.a(str2, "story_type");
        pVarArr[3] = v.a(user.getUid(), "from_user_id");
        r.a("interaction_bullet_click", pVarArr);
    }
}
