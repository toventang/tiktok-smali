package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
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
import java.util.List;
import java.util.Set;

public final class ReactionBubbleEmojiCell extends PowerCell<com.ss.android.ugc.aweme.comment.barrage.b.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71611a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71612b;

    /* renamed from: j  reason: collision with root package name */
    private TuxIconView f71613j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f71614k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.comment.barrage.b.c f71615l;

    static {
        Covode.recordClassIndex(44056);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44057);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String a() {
        com.ss.android.ugc.aweme.comment.barrage.b.c cVar = this.f71615l;
        if (cVar != null) {
            return cVar.f71556e + '_' + cVar.f71552a.getUid();
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        com.ss.android.ugc.aweme.comment.barrage.a aVar;
        Set<String> set;
        String str;
        super.l();
        com.ss.android.ugc.aweme.comment.barrage.b.c cVar = this.f71615l;
        if (cVar != null && (aVar = cVar.f71554c) != null && (set = aVar.f71538g) != null && !set.contains(a())) {
            set.add(a());
            com.ss.android.ugc.aweme.comment.barrage.b.c cVar2 = this.f71615l;
            if (cVar2 != null) {
                p[] pVarArr = new p[4];
                com.ss.android.ugc.aweme.comment.barrage.a aVar2 = cVar2.f71554c;
                String str2 = null;
                if (aVar2 != null) {
                    str = aVar2.f71533b;
                } else {
                    str = null;
                }
                pVarArr[0] = v.a(str, "enter_from");
                com.ss.android.ugc.aweme.comment.barrage.a aVar3 = cVar2.f71554c;
                if (aVar3 != null) {
                    str2 = aVar3.f71536e;
                }
                pVarArr[1] = v.a(str2, "story_type");
                pVarArr[2] = v.a("like", "notice_type");
                pVarArr[3] = v.a(cVar2.f71552a.getUid(), "from_user_id");
                r.a("interaction_bullet_show", pVarArr);
            }
        }
    }

    static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71616a = new b();

        static {
            Covode.recordClassIndex(44058);
        }

        b() {
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        MethodCollector.i(741);
        l.d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.i0, null);
        View findViewById = inflate.findViewById(R.id.ov);
        l.b(findViewById, "");
        this.f71612b = (SmartImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bic);
        l.b(findViewById2, "");
        this.f71613j = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.av4);
        l.b(findViewById3, "");
        this.f71614k = (TuxTextView) findViewById3;
        l.b(inflate, "");
        inflate.setVisibility(4);
        MethodCollector.o(741);
        return inflate;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleEmojiCell f71617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.c f71618b;

        static {
            Covode.recordClassIndex(44059);
        }

        c(ReactionBubbleEmojiCell reactionBubbleEmojiCell, com.ss.android.ugc.aweme.comment.barrage.b.c cVar) {
            this.f71617a = reactionBubbleEmojiCell;
            this.f71618b = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            ReactionBubbleEmojiCell reactionBubbleEmojiCell = this.f71617a;
            User user = this.f71618b.f71552a;
            com.ss.android.ugc.aweme.comment.barrage.a aVar = this.f71618b.f71554c;
            if (aVar != null) {
                q f2 = new q().g(aVar.f71532a);
                String str3 = aVar.f71533b;
                if (str3 == null) {
                    str3 = "";
                }
                q qVar = (q) f2.o(str3).a("click_head");
                qVar.W = aVar.f71536e;
                qVar.Y = "bullet";
                qVar.Z = "bullet";
                qVar.V = aVar.f71535d;
                qVar.f();
            }
            p[] pVarArr = new p[4];
            Aweme aweme = null;
            if (aVar != null) {
                str = aVar.f71533b;
            } else {
                str = null;
            }
            pVarArr[0] = v.a(str, "enter_from");
            pVarArr[1] = v.a("like", "notice_type");
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
            View view2 = reactionBubbleEmojiCell.itemView;
            l.b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.comment.barrage.b.c cVar) {
        int intValue;
        com.ss.android.ugc.aweme.comment.barrage.b.c cVar2 = cVar;
        l.d(cVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) cVar2);
        SmartImageView smartImageView = this.f71612b;
        if (smartImageView == null) {
            l.a("avatarIv");
        }
        e a2 = f.a(b.f71616a);
        Context context = smartImageView.getContext();
        l.b(context, "");
        smartImageView.setBackground(a2.a(context));
        com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(cVar2.f71552a.getAvatarThumb())).a("ReactionBubbleCommentCell");
        SmartImageView smartImageView2 = this.f71612b;
        if (smartImageView2 == null) {
            l.a("avatarIv");
        }
        a3.E = smartImageView2;
        e.a aVar = new e.a();
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a4 = aVar.a();
        l.b(a4, "");
        a3.w = a4;
        a3.f39907c = true;
        a3.c();
        SmartImageView smartImageView3 = this.f71612b;
        if (smartImageView3 == null) {
            l.a("avatarIv");
        }
        smartImageView3.setOnClickListener(new c(this, cVar2));
        this.f71615l = cVar2;
        TuxIconView tuxIconView = this.f71613j;
        if (tuxIconView == null) {
            l.a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f71614k;
        if (tuxTextView == null) {
            l.a("emojiTv");
        }
        tuxTextView.setVisibility(8);
        List<Integer> list = cVar2.f71553b;
        if (list.size() == 1 && ((intValue = list.get(0).intValue()) == 1001 || intValue == 1002)) {
            TuxIconView tuxIconView2 = this.f71613j;
            if (tuxIconView2 == null) {
                l.a("iconIv");
            }
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView2 = this.f71614k;
            if (tuxTextView2 == null) {
                l.a("emojiTv");
            }
            tuxTextView2.setVisibility(8);
            TuxIconView tuxIconView3 = this.f71613j;
            if (tuxIconView3 == null) {
                l.a("iconIv");
            } else if (intValue == 1001) {
                tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
            } else if (intValue == 1002) {
                tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
            }
        }
        View view = this.itemView;
        l.b(view, "");
        view.setVisibility(4);
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setTag(0);
    }
}
