package com.ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.ss.android.ugc.aweme.story.interaction.b.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.List;

public final class ReactionBubbleEmojiCell extends BaseReactionBubbleCell<com.ss.android.ugc.aweme.story.interaction.b.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137913a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f137914b;

    /* renamed from: j  reason: collision with root package name */
    private TuxIconView f137915j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f137916k;

    static {
        Covode.recordClassIndex(90206);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90207);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactionBubbleEmojiCell f137918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.interaction.b.c f137919b;

        static {
            Covode.recordClassIndex(90209);
        }

        c(ReactionBubbleEmojiCell reactionBubbleEmojiCell, com.ss.android.ugc.aweme.story.interaction.b.c cVar) {
            this.f137918a = reactionBubbleEmojiCell;
            this.f137919b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137918a.a(this.f137919b.f137845a, this.f137919b.f137847c);
        }
    }

    static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137917a = new b();

        static {
            Covode.recordClassIndex(90208);
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
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#80545454"));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf((float) h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    private final void a(List<Integer> list) {
        TuxIconView tuxIconView = this.f137915j;
        if (tuxIconView == null) {
            l.a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f137916k;
        if (tuxTextView == null) {
            l.a("emojiTv");
        }
        tuxTextView.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(StoryEmojiReactionView.a.a(num.intValue()));
        }
        TuxTextView tuxTextView2 = this.f137916k;
        if (tuxTextView2 == null) {
            l.a("emojiTv");
        }
        tuxTextView2.setText(sb.toString());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        MethodCollector.i(3480);
        l.d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.b2h, null);
        View findViewById = inflate.findViewById(R.id.ov);
        l.b(findViewById, "");
        this.f137914b = (SmartImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bic);
        l.b(findViewById2, "");
        this.f137915j = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.av4);
        l.b(findViewById3, "");
        this.f137916k = (TuxTextView) findViewById3;
        l.b(inflate, "");
        inflate.setVisibility(4);
        MethodCollector.o(3480);
        return inflate;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.bytedance.ies.powerlist.b.a aVar) {
        String str;
        com.ss.android.ugc.aweme.story.interaction.b.c cVar = (com.ss.android.ugc.aweme.story.interaction.b.c) aVar;
        l.d(cVar, "");
        super.a((com.bytedance.ies.powerlist.b.a) cVar);
        SmartImageView smartImageView = this.f137914b;
        if (smartImageView == null) {
            l.a("avatarIv");
        } else {
            e a2 = f.a(b.f137917a);
            Context context = smartImageView.getContext();
            l.b(context, "");
            smartImageView.setBackground(a2.a(context));
        }
        v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(cVar.f137845a.getAvatarThumb())).a("ReactionBubbleCommentCell");
        SmartImageView smartImageView2 = this.f137914b;
        if (smartImageView2 == null) {
            l.a("avatarIv");
        }
        a3.E = smartImageView2;
        a3.w = a();
        a3.f39907c = true;
        a3.c();
        SmartImageView smartImageView3 = this.f137914b;
        if (smartImageView3 == null) {
            l.a("avatarIv");
        }
        smartImageView3.setOnClickListener(new c(this, cVar));
        TuxIconView tuxIconView = this.f137915j;
        if (tuxIconView == null) {
            l.a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f137916k;
        if (tuxTextView == null) {
            l.a("emojiTv");
        }
        tuxTextView.setVisibility(8);
        List<Integer> list = cVar.f137846b;
        String str2 = "emoji_react";
        if (list.size() == 1) {
            int intValue = list.get(0).intValue();
            if (intValue == 1001 || intValue == 1002) {
                TuxIconView tuxIconView2 = this.f137915j;
                if (tuxIconView2 == null) {
                    l.a("iconIv");
                }
                tuxIconView2.setVisibility(0);
                TuxTextView tuxTextView2 = this.f137916k;
                if (tuxTextView2 == null) {
                    l.a("emojiTv");
                }
                tuxTextView2.setVisibility(8);
                if (intValue == 1001) {
                    str2 = "like";
                } else {
                    str2 = "";
                    if (intValue == 1002) {
                        str2 = "view";
                    }
                }
                TuxIconView tuxIconView3 = this.f137915j;
                if (tuxIconView3 == null) {
                    l.a("iconIv");
                } else if (intValue == 1001) {
                    tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
                } else if (intValue == 1002) {
                    tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
                }
            } else {
                a(list);
            }
        } else {
            a(list);
        }
        View view = this.itemView;
        l.b(view, "");
        view.setVisibility(4);
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setTag(0);
        p[] pVarArr = new p[3];
        g gVar = cVar.f137847c;
        if (gVar != null) {
            str = gVar.f137854b;
        } else {
            str = null;
        }
        pVarArr[0] = h.v.a(str, "enter_from");
        pVarArr[1] = h.v.a(str2, "notice_type");
        pVarArr[2] = h.v.a(cVar.f137845a.getUid(), "from_user_id");
        com.ss.android.ugc.aweme.common.r.a("interaction_bullet_show", pVarArr);
    }
}
