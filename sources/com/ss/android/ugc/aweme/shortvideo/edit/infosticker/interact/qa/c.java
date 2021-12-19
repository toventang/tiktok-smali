package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.a.b;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends g {
    public EditTextStickerViewModel q;
    public EditPageQaStickerViewModel r;
    private QaStickerView s;

    static {
        Covode.recordClassIndex(83625);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    public final QaStickerView getQaStickerView() {
        return this.s;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final b a() {
        return new d(this, new a(this));
    }

    public static final class a extends g.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f127556b;

        static {
            Covode.recordClassIndex(83626);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.a.k, com.ss.android.ugc.aweme.editSticker.interact.view.g.a
        public final void f() {
            String str;
            QaStruct qaStruct;
            QaStickerView qaStickerView = this.f127556b.getQaStickerView();
            if (qaStickerView == null || (qaStruct = qaStickerView.getQaStruct()) == null || (str = qaStruct.getQuestionContent()) == null) {
                str = "";
            }
            EditTextStickerViewModel editTextStickerViewModel = this.f127556b.q;
            if (editTextStickerViewModel == null) {
                l.a("editTextStickerViewModel");
            }
            l.d(str, "");
            editTextStickerViewModel.c(new EditTextStickerViewModel.d(str));
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.f127556b.r;
            if (editPageQaStickerViewModel == null) {
                l.a("editQaStickerViewModel");
            }
            editPageQaStickerViewModel.k().d().d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super();
            this.f127556b = cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void j() {
        QaStruct qaStruct;
        QaStruct qaStruct2;
        QaStickerView qaStickerView = this.s;
        long j2 = 0;
        if (qaStickerView == null || (qaStruct2 = qaStickerView.getQaStruct()) == null || qaStruct2.getQuestionId() == 0) {
            super.j();
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.r;
            if (editPageQaStickerViewModel == null) {
                l.a("editQaStickerViewModel");
            }
            QaStickerView qaStickerView2 = this.s;
            if (!(qaStickerView2 == null || (qaStruct = qaStickerView2.getQaStruct()) == null)) {
                j2 = qaStruct.getQuestionId();
            }
            String valueOf = String.valueOf(j2);
            l.d(valueOf, "");
            com.ss.android.ugc.aweme.qasticker.a aVar = editPageQaStickerViewModel.f146782b;
            l.d(valueOf, "");
            r.a("prop_more_click", aVar.a().a("user_id", com.ss.android.ugc.aweme.port.in.g.a().A().c()).a("question_id", valueOf).f149193a);
        }
    }

    public final void setQaStickerView(QaStickerView qaStickerView) {
        this.s = qaStickerView;
    }

    public final void a(QaStickerView qaStickerView) {
        MethodCollector.i(5703);
        if (qaStickerView == null) {
            MethodCollector.o(5703);
            return;
        }
        this.s = qaStickerView;
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(qaStickerView);
                MethodCollector.o(5703);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(5703);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(5703);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5722);
        LayoutInflater.from(getContext()).inflate(R.layout.aic, this);
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        Context context2 = getContext();
        if (context2 != null) {
            JediViewModel a2 = t.a((e) context2).a(EditTextStickerViewModel.class);
            l.b(a2, "");
            this.q = (EditTextStickerViewModel) a2;
            Context context3 = getContext();
            if (context3 != null) {
                JediViewModel a3 = t.a((e) context3).a(EditPageQaStickerViewModel.class);
                l.b(a3, "");
                this.r = (EditPageQaStickerViewModel) a3;
                MethodCollector.o(5722);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(5722);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(5722);
        throw nullPointerException2;
    }

    public final void a(QaStruct qaStruct) {
        MethodCollector.i(5706);
        if (this.s == null) {
            Context context = getContext();
            l.b(context, "");
            QaStickerView qaStickerView = new QaStickerView(context, (AttributeSet) null, 6);
            this.s = qaStickerView;
            if (qaStruct != null) {
                qaStickerView.a(qaStruct);
            }
        }
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.s);
                MethodCollector.o(5706);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(5706);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(5706);
        throw nullPointerException2;
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
