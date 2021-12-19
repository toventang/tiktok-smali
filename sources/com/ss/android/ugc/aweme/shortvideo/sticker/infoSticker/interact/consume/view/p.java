package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class p extends a {

    /* renamed from: a  reason: collision with root package name */
    public l f130622a;

    /* renamed from: l  reason: collision with root package name */
    public final f f130623l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f f130624m;
    private o n;

    static {
        Covode.recordClassIndex(85647);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    public static final class b implements o.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f130626a;

        static {
            Covode.recordClassIndex(85649);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.o.b
        public final void a() {
            com.ss.android.ugc.aweme.sticker.k.c cVar;
            j jVar = this.f130626a.f130438k;
            if (jVar != null && (cVar = jVar.p) != null) {
                cVar.b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(p pVar) {
            this.f130626a = pVar;
        }
    }

    public static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f130629a = new d();

        static {
            Covode.recordClassIndex(85652);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.d.a.c.a(new i());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f130625a;

        static {
            Covode.recordClassIndex(85648);
        }

        a(p pVar) {
            this.f130625a = pVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            f fVar = this.f130625a.f130623l;
            l lVar = this.f130625a.f130622a;
            if (lVar == null) {
                l.b();
            }
            FrameLayout pollView = lVar.getPollView();
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130625a.f130433f);
            if (!(a2 == null || (normalTrackTimeStamp = a2.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            fVar.a(pollView);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f130630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f130631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f130632c;

        static {
            Covode.recordClassIndex(85653);
        }

        e(p pVar, l lVar, j jVar) {
            this.f130630a = pVar;
            this.f130631b = lVar;
            this.f130632c = jVar;
        }

        public final void run() {
            PollStruct pollStruct;
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            l lVar = this.f130631b;
            InteractStickerStruct interactStickerStruct = this.f130630a.f130433f;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            } else {
                pollStruct = null;
            }
            boolean g2 = in.g(this.f130632c.f134922c);
            String str = this.f130632c.f134923d;
            if (str == null) {
                str = "";
            }
            lVar.a(pollStruct, g2, str, this.f130632c.p, this.f130630a.f130433f);
            f fVar = this.f130630a.f130623l;
            FrameLayout pollView = this.f130631b.getPollView();
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130630a.f130433f);
            if (!(a2 == null || (normalTrackTimeStamp = a2.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            fVar.a(pollView);
            this.f130631b.postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        com.ss.android.ugc.aweme.sticker.i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.f130438k;
        if (!(jVar4 == null || (iVar = jVar4.r) == null)) {
            str5 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str5);
        StickerAttrStruct b2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(this.f130433f);
        if (b2 == null || (str4 = b2.getPollStickerId()) == null) {
            str4 = "";
        }
        r.a("poll_prop_click", a5.a("prop_id", str4).f66730a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(2917);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.a9));
        tuxTextView.setTuxFont(61);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) n.b(this.f130436i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f130436i.getString(R.string.fk0));
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(2917);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
        String str;
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        com.ss.android.ugc.aweme.sticker.i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.f130438k;
        if (!(jVar4 == null || (iVar = jVar4.r) == null)) {
            str5 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str5);
        StickerAttrStruct b2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(this.f130433f);
        if (b2 == null || (str4 = b2.getPollStickerId()) == null) {
            str4 = "";
        }
        r.a("poll_prop_label_click", a5.a("prop_id", str4).f66730a);
        c();
    }

    private final void c() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        com.ss.android.ugc.aweme.sticker.k.c cVar;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        com.ss.android.ugc.aweme.sticker.i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        PollStruct pollStruct = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.f130438k;
        if (jVar4 == null || (iVar = jVar4.r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str4);
        StickerAttrStruct b2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(this.f130433f);
        if (b2 == null || (str5 = b2.getPollStickerId()) == null) {
            str5 = "";
        }
        r.a("enter_poll_detail", a5.a("prop_id", str5).f66730a);
        if (this.n == null) {
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            }
            this.n = o.a.a(pollStruct);
        }
        Context context = this.f130436i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((androidx.fragment.app.e) context).getSupportFragmentManager().b();
        o oVar = this.n;
        if (oVar == null || !oVar.isAdded()) {
            o oVar2 = this.n;
            if (oVar2 == null || !oVar2.isVisible()) {
                o oVar3 = this.n;
                if (oVar3 == null || !oVar3.isRemoving()) {
                    o oVar4 = this.n;
                    if (oVar4 != null) {
                        oVar4.f130613e = this.f130624m;
                    }
                    o oVar5 = this.n;
                    if (oVar5 != null) {
                        Context context2 = this.f130436i;
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) context2).getSupportFragmentManager();
                        l.b(supportFragmentManager, "");
                        oVar5.show(supportFragmentManager, "VoteBottomSheetDialogFragment");
                    }
                    o oVar6 = this.n;
                    if (oVar6 != null) {
                        oVar6.f130612d = new b(this);
                    }
                    j jVar5 = this.f130438k;
                    if (jVar5 != null && (cVar = jVar5.p) != null) {
                        cVar.a();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public l a() {
        PollStruct pollStruct;
        User user;
        String str;
        FrameLayout pollView;
        if (this.f130622a == null) {
            l lVar = new l(this.f130436i);
            this.f130622a = lVar;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedPollStickerView");
            lVar.setInteractStickerParams(this.f130438k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            l lVar2 = this.f130622a;
            if (lVar2 != null) {
                lVar2.setLayoutParams(layoutParams);
            }
            l lVar3 = this.f130622a;
            if (!(lVar3 == null || (pollView = lVar3.getPollView()) == null)) {
                pollView.setVisibility(4);
            }
            l lVar4 = this.f130622a;
            if (lVar4 != null) {
                lVar4.setPoints(this.f130623l.a());
            }
            l lVar5 = this.f130622a;
            if (lVar5 != null) {
                lVar5.post(new a(this));
            }
        }
        l lVar6 = this.f130622a;
        if (lVar6 != null) {
            InteractStickerStruct interactStickerStruct = this.f130433f;
            com.ss.android.ugc.aweme.sticker.k.c cVar = null;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            } else {
                pollStruct = null;
            }
            j jVar = this.f130438k;
            if (jVar != null) {
                user = jVar.f134922c;
            } else {
                user = null;
            }
            boolean g2 = in.g(user);
            j jVar2 = this.f130438k;
            if (jVar2 == null || (str = jVar2.f134923d) == null) {
                str = "";
            }
            j jVar3 = this.f130438k;
            if (jVar3 != null) {
                cVar = jVar3.p;
            }
            lVar6.a(pollStruct, g2, str, cVar, this.f130433f);
        }
        l lVar7 = this.f130622a;
        if (lVar7 != null) {
            lVar7.postInvalidate();
        }
        return this.f130622a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(InteractStickerStruct interactStickerStruct) {
        super.a(interactStickerStruct);
        a();
    }

    public static final class c extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(85650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f130627a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.tux.tooltip.a.a.d f130628b;

            static {
                Covode.recordClassIndex(85651);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f130627a.this$0.n();
                this.f130627a.this$0.f();
            }

            a(c cVar, com.bytedance.tux.tooltip.a.a.d dVar) {
                this.f130627a = cVar;
                this.f130628b = dVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            l.d(dVar2, "");
            d.a aVar = new d.a();
            String string = dVar2.f45488b.getString(R.string.fk0);
            l.b(string, "");
            aVar.a(string);
            aVar.f45494f = new a(this, dVar2);
            dVar2.a(aVar);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130623l.a(jVar);
        l g2 = a();
        if (g2 != null) {
            g2.post(new e(this, g2, jVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130623l.a(j2, i2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130623l.a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f fVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        l.d(fVar, "");
        this.f130624m = fVar;
        this.f130623l = new f(context, this, interactStickerStruct, jVar);
        if (jVar != null && jVar.f134924e) {
            c();
        }
        AVExternalServiceImpl.a().typeFaceService().prefetch(context);
    }
}
