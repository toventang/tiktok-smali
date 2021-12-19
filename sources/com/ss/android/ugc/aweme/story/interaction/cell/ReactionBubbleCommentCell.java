package com.ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.interaction.b.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;

public final class ReactionBubbleCommentCell extends BaseReactionBubbleCell<com.ss.android.ugc.aweme.story.interaction.b.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137901a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f137902b;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f137903j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f137904k;

    /* renamed from: l  reason: collision with root package name */
    private TuxIconView f137905l;

    /* renamed from: m  reason: collision with root package name */
    private TuxTextView f137906m;

    static {
        Covode.recordClassIndex(90201);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90202);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleCommentCell f137909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comment f137910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.interaction.b.a f137911c;

        static {
            Covode.recordClassIndex(90204);
        }

        c(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, com.ss.android.ugc.aweme.story.interaction.b.a aVar) {
            this.f137909a = reactionBubbleCommentCell;
            this.f137910b = comment;
            this.f137911c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ReactionBubbleCommentCell reactionBubbleCommentCell = this.f137909a;
            User user = this.f137910b.getUser();
            l.b(user, "");
            reactionBubbleCommentCell.a(user, this.f137911c.f137844c);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleCommentCell f137907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comment f137908b;

        static {
            Covode.recordClassIndex(90203);
        }

        b(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment) {
            this.f137907a = reactionBubbleCommentCell;
            this.f137908b = comment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f137908b.getCid() != null) {
                String cid = this.f137908b.getCid();
                l.b(cid, "");
                if (com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.story.b.d(cid)) != null) {
                    return;
                }
            }
            String fakeId = this.f137908b.getFakeId();
            l.b(fakeId, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.story.b.d(fakeId));
        }
    }

    static final class d extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137912a = new d();

        static {
            Covode.recordClassIndex(90205);
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
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#80545454"));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2g, viewGroup, false);
        l.b(a2, "");
        e a3 = f.a(d.f137912a);
        Context context = viewGroup.getContext();
        l.b(context, "");
        a2.setBackground(a3.a(context));
        this.f137902b = (SmartImageView) a2.findViewById(R.id.ov);
        this.f137903j = (TuxTextView) a2.findViewById(R.id.csa);
        this.f137904k = (TuxTextView) a2.findViewById(R.id.ak_);
        this.f137905l = (TuxIconView) a2.findViewById(R.id.dkw);
        this.f137906m = (TuxTextView) a2.findViewById(R.id.dkx);
        a2.setVisibility(4);
        return a2;
    }

    private final void a(boolean z) {
        float f2;
        TextPaint paint;
        TextPaint paint2;
        CharSequence charSequence;
        if (z) {
            TuxTextView tuxTextView = this.f137903j;
            CharSequence charSequence2 = null;
            float f3 = 0.0f;
            if (tuxTextView == null || (paint2 = tuxTextView.getPaint()) == null) {
                f2 = 0.0f;
            } else {
                TuxTextView tuxTextView2 = this.f137903j;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                f2 = paint2.measureText(String.valueOf(charSequence));
            }
            TuxTextView tuxTextView3 = this.f137906m;
            if (!(tuxTextView3 == null || (paint = tuxTextView3.getPaint()) == null)) {
                TuxTextView tuxTextView4 = this.f137906m;
                if (tuxTextView4 != null) {
                    charSequence2 = tuxTextView4.getText();
                }
                f3 = paint.measureText(String.valueOf(charSequence2));
            }
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            if (f2 + f3 > ((float) h.g.a.a(TypedValue.applyDimension(1, 220.0f, system.getDisplayMetrics())))) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                if (f3 < ((float) h.g.a.a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics())))) {
                    TuxTextView tuxTextView5 = this.f137903j;
                    if (tuxTextView5 != null) {
                        Resources system3 = Resources.getSystem();
                        l.a((Object) system3, "");
                        tuxTextView5.setMaxWidth((int) (((float) h.g.a.a(TypedValue.applyDimension(1, 220.0f, system3.getDisplayMetrics()))) - f3));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView6 = this.f137903j;
                if (tuxTextView6 != null) {
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    tuxTextView6.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics())));
                }
                TuxTextView tuxTextView7 = this.f137906m;
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
        TuxTextView tuxTextView8 = this.f137903j;
        if (tuxTextView8 != null) {
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            tuxTextView8.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 236.0f, system6.getDisplayMetrics())));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.bytedance.ies.powerlist.b.a aVar) {
        String str;
        com.ss.android.ugc.aweme.story.interaction.b.a aVar2 = (com.ss.android.ugc.aweme.story.interaction.b.a) aVar;
        l.d(aVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) aVar2);
        Comment comment = aVar2.f137842a;
        User user = comment.getUser();
        l.b(user, "");
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb())).a("ReactionBubbleCommentCell");
        a2.E = this.f137902b;
        a2.w = a();
        a2.f39907c = true;
        a2.c();
        this.itemView.setOnClickListener(new b(this, comment));
        SmartImageView smartImageView = this.f137902b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new c(this, comment, aVar2));
        }
        TuxTextView tuxTextView = this.f137903j;
        if (tuxTextView != null) {
            User user2 = comment.getUser();
            l.b(user2, "");
            tuxTextView.setText(user2.getUniqueId());
        }
        TuxTextView tuxTextView2 = this.f137904k;
        if (tuxTextView2 != null) {
            a.C0730a aVar3 = new a.C0730a();
            String text = comment.getText();
            l.b(text, "");
            tuxTextView2.setText(aVar3.a(text).f33382a);
        }
        if (TextUtils.isEmpty(comment.getReplyToUserName())) {
            TuxIconView tuxIconView = this.f137905l;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(4);
            }
            TuxTextView tuxTextView3 = this.f137906m;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(4);
            }
            a(false);
        } else {
            TuxIconView tuxIconView2 = this.f137905l;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.f137906m;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            TuxTextView tuxTextView5 = this.f137906m;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(comment.getReplyToUserName());
            }
            a(true);
        }
        if (aVar2.f137843b) {
            View view = this.itemView;
            l.b(view, "");
            view.setVisibility(0);
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setTag(1);
        } else {
            View view3 = this.itemView;
            l.b(view3, "");
            view3.setVisibility(4);
            View view4 = this.itemView;
            l.b(view4, "");
            view4.setTag(0);
        }
        p[] pVarArr = new p[3];
        g gVar = aVar2.f137844c;
        if (gVar != null) {
            str = gVar.f137854b;
        } else {
            str = null;
        }
        pVarArr[0] = h.v.a(str, "enter_from");
        pVarArr[1] = h.v.a(UGCMonitor.EVENT_COMMENT, "notice_type");
        User user3 = comment.getUser();
        l.b(user3, "");
        pVarArr[2] = h.v.a(user3.getUid(), "from_user_id");
        com.ss.android.ugc.aweme.common.r.a("interaction_bullet_show", pVarArr);
    }
}
