package com.ss.android.ugc.aweme.music.search.b;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.music.assem.list.s;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.ui.SearchView;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.viewModel.b f111682j;

    /* renamed from: k  reason: collision with root package name */
    private final long f111683k = 300;

    public static final class b extends m implements h.f.a.b<s, s> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71781);
        }

        public b() {
            super(1);
        }

        public final s invoke(s sVar) {
            l.c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71779);
    }

    public static final class f implements SearchView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f111688b;

        static {
            Covode.recordClassIndex(71785);
        }

        @Override // com.ss.android.ugc.aweme.music.search.ui.SearchView.a
        public final void a() {
            a.c(this.f111688b);
        }

        f(a aVar, View view) {
            this.f111687a = aVar;
            this.f111688b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.b.a$a  reason: collision with other inner class name */
    public static final class C2859a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2859a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class c extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        c cVar = new c(this);
        h.k.c a2 = ab.a(SearchMusicListViewModel.class);
        C2859a aVar = new C2859a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), cVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), cVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), cVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f111682j = bVar;
    }

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111689a;

        static {
            Covode.recordClassIndex(71786);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f111689a = aVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            String valueOf = String.valueOf(charSequence);
            SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) this.f111689a.f111682j.getValue();
            l.d(valueOf, "");
            searchMusicListViewModel.f111638l = valueOf;
            searchMusicListViewModel.l();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f111686b;

        static {
            Covode.recordClassIndex(71784);
        }

        e(a aVar, View view) {
            this.f111685a = aVar;
            this.f111686b = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.c(this.f111686b);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111684a;

        static {
            Covode.recordClassIndex(71783);
        }

        d(a aVar) {
            this.f111684a = aVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.e activity;
            ClickAgent.onClick(view);
            Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this.f111684a);
            if (a2 != null && (activity = a2.getActivity()) != null) {
                activity.finish();
            }
        }
    }

    static final class k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f111694a;

        static {
            Covode.recordClassIndex(71790);
        }

        k(View view) {
            this.f111694a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TuxTextView tuxTextView = (TuxTextView) this.f111694a.findViewById(R.id.f01);
            l.b(tuxTextView, "");
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxTextView.setTranslationX(((Float) animatedValue).floatValue());
        }
    }

    public static void c(View view) {
        DmtEditText dmtEditText = (DmtEditText) view.findViewById(R.id.ay6);
        l.b(dmtEditText, "");
        if (String.valueOf(dmtEditText.getText()).length() > 0) {
            KeyboardUtils.c(view.findViewById(R.id.ay6));
        }
    }

    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f111692a;

        static {
            Covode.recordClassIndex(71788);
        }

        i(View view) {
            this.f111692a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = (LinearLayout) this.f111692a.findViewById(R.id.cgi);
            l.b(linearLayout, "");
            linearLayout.setAlpha(floatValue);
            TuxIconView tuxIconView = (TuxIconView) this.f111692a.findViewById(R.id.bu7);
            l.b(tuxIconView, "");
            tuxIconView.setAlpha(floatValue);
            TuxTextView tuxTextView = (TuxTextView) this.f111692a.findViewById(R.id.f01);
            l.b(tuxTextView, "");
            tuxTextView.setAlpha(floatValue);
        }
    }

    static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f111693a;

        static {
            Covode.recordClassIndex(71789);
        }

        j(View view) {
            this.f111693a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            LinearLayout linearLayout = (LinearLayout) this.f111693a.findViewById(R.id.cgi);
            l.b(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.setMarginEnd(intValue);
            ConstraintLayout.a aVar2 = new ConstraintLayout.a(aVar);
            LinearLayout linearLayout2 = (LinearLayout) this.f111693a.findViewById(R.id.cgi);
            l.b(linearLayout2, "");
            linearLayout2.setLayoutParams(aVar2);
            ((LinearLayout) this.f111693a.findViewById(R.id.cgi)).requestLayout();
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        ((TuxIconView) view.findViewById(R.id.bu7)).setOnClickListener(new d(this));
        ((TuxTextView) view.findViewById(R.id.f01)).setOnClickListener(new e(this, view));
        ((SearchView) view.findViewById(R.id.eg8)).setDispatchTouchEventListener(new f(this, view));
        ((DmtEditText) view.findViewById(R.id.ay6)).addTextChangedListener(new g(this));
        ((DmtEditText) view.findViewById(R.id.ay6)).setOnEditorActionListener(new h(this, view));
        ((DmtEditText) view.findViewById(R.id.ay6)).requestFocus();
        KeyboardUtils.b(view.findViewById(R.id.ay6));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f01);
        l.b(tuxTextView, "");
        String obj = tuxTextView.getText().toString();
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.f01);
        l.b(tuxTextView2, "");
        int measureText = (int) tuxTextView2.getPaint().measureText(obj);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new i(view));
        l.b(ofFloat, "");
        ofFloat.setDuration(this.f111683k);
        ValueAnimator ofInt = ValueAnimator.ofInt((int) n.b(view.getContext(), 16.0f), ((int) n.b(view.getContext(), 32.0f)) + measureText);
        ofInt.addUpdateListener(new j(view));
        l.b(ofInt, "");
        ofInt.setDuration(this.f111683k);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((-n.b(view.getContext(), 16.0f)) + (((float) measureText) / 2.0f), 0.0f);
        ofFloat2.addUpdateListener(new k(view));
        l.b(ofFloat2, "");
        ofFloat2.setDuration(this.f111683k);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    static final class h implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f111691b;

        static {
            Covode.recordClassIndex(71787);
        }

        h(a aVar, View view) {
            this.f111690a = aVar;
            this.f111691b = view;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 3) {
                return true;
            }
            a.c(this.f111691b);
            return true;
        }
    }
}
