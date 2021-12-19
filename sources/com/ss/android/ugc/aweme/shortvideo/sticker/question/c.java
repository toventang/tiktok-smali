package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a {

    /* renamed from: a  reason: collision with root package name */
    private View f130690a;

    /* renamed from: l  reason: collision with root package name */
    private final d f130691l;

    /* renamed from: m  reason: collision with root package name */
    private String f130692m;
    private String n;
    private String o;
    private User p;
    private final g q;

    static {
        Covode.recordClassIndex(85686);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 7;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        i iVar;
        i iVar2;
        i iVar3;
        d dVar = new d();
        j jVar = this.f130438k;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar3.f134903c;
        }
        d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar2 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f134902b;
        }
        d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (!(jVar3 == null || (iVar = jVar3.r) == null)) {
            str3 = iVar.f134901a;
        }
        d a4 = a3.a("enter_from", str3).a("question_id", this.f130692m).a("sticker_type", "question");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        r.a("sticker_click", a4.a("user_id", g2.getCurUserId()).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(2485);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.f159928l));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f130436i.getString(R.string.dm));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(2485);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
        String str;
        String str2;
        i iVar;
        i iVar2;
        i iVar3;
        d dVar = new d();
        j jVar = this.f130438k;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar3.f134903c;
        }
        d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar2 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f134902b;
        }
        d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (!(jVar3 == null || (iVar = jVar3.r) == null)) {
            str3 = iVar.f134901a;
        }
        d a4 = a3.a("enter_from", str3);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        r.a("click_question_bubble", a4.a("user_id", g2.getCurUserId()).a("question_id", this.f130692m).a("question_user_id", this.o).f66730a);
        j jVar4 = this.f130438k;
        if (jVar4 != null) {
            VideoReplyStruct videoReplyStruct = jVar4.s;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        MethodCollector.i(2472);
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130436i)) {
            if (this.f130690a == null) {
                this.f130690a = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d(this.f130436i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f130690a;
                if (view == null) {
                    l.b();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f130690a;
                if (view2 != null) {
                    ((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d) view2).setPoints(this.f130691l.f130694a);
                    View view3 = this.f130690a;
                    if (view3 == null) {
                        l.b();
                    }
                    view3.postInvalidate();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                    MethodCollector.o(2472);
                    throw nullPointerException;
                }
            }
            View view4 = this.f130690a;
            MethodCollector.o(2472);
            return view4;
        }
        if (this.f130690a == null) {
            this.f130690a = new FrameLayout(this.f130436i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view5 = this.f130690a;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        View view6 = this.f130690a;
        MethodCollector.o(2472);
        return view6;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130693a;

        static {
            Covode.recordClassIndex(85687);
        }

        a(c cVar) {
            this.f130693a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130693a.n();
            this.f130693a.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130691l.a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final int a(com.bytedance.tux.tooltip.a.a.d dVar) {
        int i2;
        l.d(dVar, "");
        j jVar = this.f130438k;
        if (jVar == null || jVar.s == null) {
            return 0;
        }
        d.b bVar = new d.b();
        if (TextUtils.equals(com.ss.android.ugc.aweme.i18n.language.a.b(), f.f30878a)) {
            i2 = 2131232512;
        } else {
            i2 = 2131232511;
        }
        bVar.f45495a = i2;
        String string = dVar.f45488b.getString(R.string.dm);
        l.b(string, "");
        bVar.a(string);
        bVar.f45500f = new a(this);
        dVar.a(bVar);
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130691l.a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, g gVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        VideoReplyStruct videoReplyStruct;
        User user;
        String str;
        String str2;
        long j2;
        Long l2;
        Long l3;
        String str3 = "";
        l.d(context, str3);
        l.d(view, str3);
        l.d(interactStickerStruct, str3);
        this.q = gVar;
        this.f130691l = new d(context, this, interactStickerStruct, jVar, gVar);
        String str4 = null;
        if (jVar != null) {
            videoReplyStruct = jVar.s;
            user = jVar.f134922c;
        } else {
            videoReplyStruct = null;
            user = null;
        }
        this.p = user;
        if (videoReplyStruct == null || videoReplyStruct.getAwemeId() == 0) {
            str = str3;
        } else {
            if (videoReplyStruct != null) {
                l3 = Long.valueOf(videoReplyStruct.getAwemeId());
            } else {
                l3 = null;
            }
            str = String.valueOf(l3);
        }
        this.n = str;
        if (videoReplyStruct == null || videoReplyStruct.getCommentId() == 0) {
            str2 = str3;
        } else {
            if (videoReplyStruct != null) {
                l2 = Long.valueOf(videoReplyStruct.getCommentId());
            } else {
                l2 = null;
            }
            str2 = String.valueOf(l2);
        }
        this.f130692m = str2;
        if (!l.a((jVar == null || (j2 = jVar.t) == null) ? 0L : j2, (Object) 0L)) {
            str3 = String.valueOf(jVar != null ? jVar.t : str4);
        }
        this.o = str3;
    }
}
