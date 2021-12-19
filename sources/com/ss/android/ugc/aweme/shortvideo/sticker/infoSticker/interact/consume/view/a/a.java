package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.u;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a {
    public static final C3403a n = new C3403a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f130442a;

    /* renamed from: l  reason: collision with root package name */
    public final b f130443l;

    /* renamed from: m  reason: collision with root package name */
    public final Aweme f130444m;

    static {
        Covode.recordClassIndex(85546);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$a  reason: collision with other inner class name */
    public static final class C3403a {
        static {
            Covode.recordClassIndex(85547);
        }

        private C3403a() {
        }

        public /* synthetic */ C3403a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f130452a = new d();

        static {
            Covode.recordClassIndex(85551);
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
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130449a;

        static {
            Covode.recordClassIndex(85548);
        }

        b(a aVar) {
            this.f130449a = aVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            b bVar = this.f130449a.f130443l;
            c cVar = this.f130449a.f130442a;
            if (cVar == null) {
                l.b();
            }
            ConstraintLayout realDuetStickerView = cVar.getRealDuetStickerView();
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130449a.f130433f);
            if (!(a2 == null || (normalTrackTimeStamp = a2.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            bVar.a(realDuetStickerView);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f130454b;

        static {
            Covode.recordClassIndex(85552);
        }

        e(a aVar, c cVar) {
            this.f130453a = aVar;
            this.f130454b = cVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            b bVar = this.f130453a.f130443l;
            ConstraintLayout realDuetStickerView = this.f130454b.getRealDuetStickerView();
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130453a.f130433f);
            if (!(a2 == null || (normalTrackTimeStamp = a2.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            bVar.a(realDuetStickerView);
            this.f130454b.postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public c a() {
        String str;
        DuetStickerStruct duetStickerStruct;
        if (this.f130442a == null) {
            c cVar = new c(this.f130436i);
            this.f130442a = cVar;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            cVar.setInteractStickerParams(this.f130438k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            c cVar2 = this.f130442a;
            if (cVar2 != null) {
                cVar2.setLayoutParams(layoutParams);
            }
            c cVar3 = this.f130442a;
            Objects.requireNonNull(cVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            cVar3.getRealDuetStickerView().setVisibility(4);
            c cVar4 = this.f130442a;
            Objects.requireNonNull(cVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (interactStickerStruct == null || (duetStickerStruct = interactStickerStruct.getDuetStickerStruct()) == null || (str = duetStickerStruct.getDuetString()) == null) {
                str = "DUET WITH ME";
            }
            cVar4.a(str);
            c cVar5 = this.f130442a;
            if (cVar5 != null) {
                cVar5.post(new b(this));
            }
        }
        c cVar6 = this.f130442a;
        if (cVar6 != null) {
            cVar6.postInvalidate();
        }
        return this.f130442a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(3601);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.a9));
        tuxTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) n.b(this.f130436i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f130436i.getResources().getString(R.string.ben));
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(3601);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
        String str;
        com.ss.android.ugc.aweme.sticker.i iVar;
        String str2;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        String str3;
        Aweme aweme = this.f130444m;
        if (aweme != null) {
            String str4 = "";
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(aweme)) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                j jVar = this.f130438k;
                if (!(jVar == null || (iVar2 = jVar.r) == null || (str3 = iVar2.f134901a) == null)) {
                    str4 = str3;
                }
                r.a("dou_promote_layer_show", dVar.a("enter_from", str4).a("group_id", this.f130444m.getAid()).a("author_id", this.f130444m.getAuthorUid()).f66730a);
                new com.bytedance.tux.g.b(this.f130437j).e(R.string.og).b();
                return;
            }
            if (k.c()) {
                str = "click_more_duet";
            } else {
                str = str4;
            }
            Aweme aweme2 = this.f130444m;
            Context context = this.f130436i;
            j jVar2 = this.f130438k;
            if (!(jVar2 == null || (iVar = jVar2.r) == null || (str2 = iVar.f134901a) == null)) {
                str4 = str2;
            }
            u.a(aweme2, context, str, str4, true, 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(InteractStickerStruct interactStickerStruct) {
        super.a(interactStickerStruct);
        a();
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$c$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3404a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f130450a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.tux.tooltip.a.a.d f130451b;

            static {
                Covode.recordClassIndex(85550);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f130450a.this$0.n();
                this.f130450a.this$0.f();
            }

            View$OnClickListenerC3404a(c cVar, com.bytedance.tux.tooltip.a.a.d dVar) {
                this.f130450a = cVar;
                this.f130451b = dVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            l.d(dVar2, "");
            d.a aVar = new d.a();
            String string = dVar2.f45488b.getString(R.string.ben);
            l.b(string, "");
            aVar.a(string);
            aVar.f45494f = new View$OnClickListenerC3404a(this, dVar2);
            dVar2.a(aVar);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130443l.a(jVar);
        c c2 = a();
        if (c2 != null) {
            c2.post(new e(this, c2));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130443l.a(j2, i2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        String str;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        l.d(bVar, "");
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.f130438k;
        String str2 = null;
        if (jVar == null || (iVar2 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar2.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("user_id", g2.getCurUserId()).a("creation_id", "");
        j jVar2 = this.f130438k;
        if (!(jVar2 == null || (iVar = jVar2.r) == null)) {
            str2 = iVar.f134901a;
        }
        r.a("click_duet_sticker_popup", a3.a("enter_from", str2).a("content", "start_duet").f66730a);
        return this.f130443l.a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, Aweme aweme) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130444m = aweme;
        this.f130443l = new b(context, this, interactStickerStruct, jVar);
        AVExternalServiceImpl.a().typeFaceService().prefetch(context);
    }
}
