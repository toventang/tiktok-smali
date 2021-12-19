package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class e extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    public String A;
    public h.f.a.a<z> B;
    final com.ss.android.ugc.aweme.shortvideo.preview.a C;
    public final VideoPublishEditModel D;
    public final com.ss.android.ugc.aweme.qasticker.a E;

    /* renamed from: a  reason: collision with root package name */
    public QaStruct f127562a;

    /* renamed from: b  reason: collision with root package name */
    public QaStickerEditLayout f127563b;

    /* renamed from: c  reason: collision with root package name */
    public String f127564c;

    static {
        Covode.recordClassIndex(83632);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$e  reason: collision with other inner class name */
    public static final class C3317e extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83638);
        }

        C3317e() {
        }
    }

    private final void s() {
        this.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.f127562a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void d() {
        this.f127562a = null;
        super.d();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QaStickerView f127571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QaStickerEditLayout.a f127572c;

        static {
            Covode.recordClassIndex(83639);
        }

        f(e eVar, QaStickerView qaStickerView, QaStickerEditLayout.a aVar) {
            this.f127570a = eVar;
            this.f127571b = qaStickerView;
            this.f127572c = aVar;
        }

        public final void run() {
            QaStickerEditLayout qaStickerEditLayout = this.f127570a.f127563b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.a(this.f127571b, this.f127572c);
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127567a;

        static {
            Covode.recordClassIndex(83635);
        }

        b(e eVar) {
            this.f127567a = eVar;
        }

        public final void run() {
            QaStickerEditLayout qaStickerEditLayout = this.f127567a.f127563b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.a((QaStickerView) null, new QaStickerEditLayout.a(0.0f, 0.0f, 0.0f, 0.0f, 31));
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127569b;

        static {
            Covode.recordClassIndex(83637);
        }

        d(e eVar, InteractStickerStruct interactStickerStruct) {
            this.f127568a = eVar;
            this.f127569b = interactStickerStruct;
        }

        public final void run() {
            e.super.a((e) this.f127569b);
            g gVar = this.f127568a.f127193l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    public final void q() {
        if (this.f127562a != null) {
            r();
            return;
        }
        s();
        QaStickerEditLayout qaStickerEditLayout = this.f127563b;
        if (qaStickerEditLayout != null) {
            qaStickerEditLayout.post(new b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        InteractStickerStruct d2 = super.d(17);
        if (d2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qa_sticker_id", this.f127564c);
        hashMap.put("qa_sticker_tab_id", this.A);
        d2.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
        d2.setQaStruct(this.f127562a);
        d2.setIndex(12);
        return d2;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127565a;

        static {
            Covode.recordClassIndex(83633);
        }

        a(e eVar) {
            this.f127565a = eVar;
        }

        public final void run() {
            Context context;
            long j2;
            g gVar = this.f127565a.f127193l;
            if (gVar != null) {
                gVar.b();
            }
            h.f.a.a<z> aVar = this.f127565a.B;
            if (aVar == null) {
                l.a("disableQuickPublish");
            }
            aVar.invoke();
            if (!TextUtils.equals(this.f127565a.D.shootEnterMethod, "ask_textual_question")) {
                AnonymousClass1 r3 = AnonymousClass1.f127566a;
                g gVar2 = this.f127565a.f127193l;
                if (gVar2 != null) {
                    context = gVar2.getContext();
                } else {
                    context = null;
                }
                QaStruct qaStruct = this.f127565a.f127562a;
                if (qaStruct != null) {
                    j2 = qaStruct.getQuestionId();
                } else {
                    j2 = 0;
                }
                com.ss.android.ugc.aweme.qasticker.b.a(r3, context, Long.valueOf(j2));
            }
        }
    }

    public final void r() {
        s();
        n();
        if (this.f127193l instanceof c) {
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            QaStickerView qaStickerView = ((c) gVar).getQaStickerView();
            QaStickerEditLayout.a aVar = new QaStickerEditLayout.a(0.0f, 0.0f, 0.0f, 0.0f, 31);
            g gVar2 = this.f127193l;
            l.b(gVar2, "");
            aVar.f127543c = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar2.getRotateAngle());
            g gVar3 = this.f127193l;
            l.b(gVar3, "");
            View contentView = gVar3.getContentView();
            l.b(contentView, "");
            aVar.f127541a = contentView.getScaleX();
            g gVar4 = this.f127193l;
            l.b(gVar4, "");
            View contentView2 = gVar4.getContentView();
            l.b(contentView2, "");
            aVar.f127542b = contentView2.getScaleY();
            g gVar5 = this.f127193l;
            l.b(gVar5, "");
            View contentView3 = gVar5.getContentView();
            l.b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            aVar.f127544d = x + frameLayout.getX();
            g gVar6 = this.f127193l;
            l.b(gVar6, "");
            View contentView4 = gVar6.getContentView();
            l.b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            aVar.f127545e = y + frameLayout2.getY();
            QaStickerEditLayout qaStickerEditLayout = this.f127563b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.post(new f(this, qaStickerView, aVar));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(g gVar) {
        super.a(gVar);
        this.f127562a = null;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final g a(Context context) {
        l.d(context, "");
        c cVar = new c(context, (byte) 0);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cVar;
    }

    public final void a(QaStickerView qaStickerView) {
        QaStruct qaStruct;
        if (this.f127193l == null) {
            a(false);
        }
        if (this.f127193l instanceof c) {
            if (qaStickerView != null) {
                qaStruct = qaStickerView.getQaStruct();
            } else {
                qaStruct = null;
            }
            this.f127562a = qaStruct;
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            ((c) gVar).a(qaStickerView);
            g gVar2 = this.f127193l;
            if (gVar2 != null) {
                gVar2.post(new a(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f127562a = interactStickerStruct.getQaStruct();
            a(true);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            ((c) gVar).a(this.f127562a);
            if (this.n != null) {
                this.n.f();
            }
            g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new C3317e().type);
            this.f127564c = (String) hashMap.get("qa_sticker_id");
            if (hashMap.containsKey("qa_sticker_tab_id")) {
                this.A = (String) hashMap.get("qa_sticker_tab_id");
            }
        }
        if (this.f127193l != null) {
            this.f127193l.postDelayed(new d(this, interactStickerStruct), 300);
        }
    }

    public static final class c extends m implements h.f.a.b<QaStickerView, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(83636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(QaStickerView qaStickerView) {
            String str;
            String qaEditTextContent;
            QaStickerView qaStickerView2 = qaStickerView;
            this.this$0.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            if (qaStickerView2 == null || (qaEditTextContent = qaStickerView2.getQaEditTextContent()) == null) {
                str = null;
            } else {
                Objects.requireNonNull(qaEditTextContent, "null cannot be cast to non-null type kotlin.CharSequence");
                str = p.b((CharSequence) qaEditTextContent).toString();
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            r.a("question_complete", this.this$0.E.a().a("text_added", !isEmpty ? 1 : 0).a("enter_method", "click_main_panel").f149193a);
            if (!isEmpty) {
                if (qaStickerView2 != null) {
                    TuxEditText tuxEditText = qaStickerView2.f119167h;
                    if (tuxEditText == null) {
                        l.a("questionEditText");
                    }
                    tuxEditText.setVisibility(8);
                    TuxTextView tuxTextView = qaStickerView2.f119168i;
                    if (tuxTextView == null) {
                        l.a("questionText");
                    }
                    tuxTextView.setVisibility(0);
                    TuxEditText tuxEditText2 = qaStickerView2.f119167h;
                    if (tuxEditText2 == null) {
                        l.a("questionEditText");
                    }
                    SpannableString spannableString = new SpannableString(String.valueOf(tuxEditText2.getText()));
                    QaStickerView.a.a(spannableString);
                    TuxTextView tuxTextView2 = qaStickerView2.f119168i;
                    if (tuxTextView2 == null) {
                        l.a("questionText");
                    }
                    tuxTextView2.setText(spannableString);
                }
                this.this$0.a(qaStickerView2);
            } else {
                this.this$0.d();
            }
            return z.f158842a;
        }
    }

    public e(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.qasticker.a aVar2) {
        l.d(aVar, "");
        l.d(videoPublishEditModel, "");
        l.d(aVar2, "");
        this.C = aVar;
        this.D = videoPublishEditModel;
        this.E = aVar2;
    }
}
