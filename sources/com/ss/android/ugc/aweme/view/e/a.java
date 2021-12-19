package com.ss.android.ugc.aweme.view.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.model.t;
import com.ss.android.ugc.aweme.view.a.g;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.z;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class a extends Fragment implements q, g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C3845a f144211b = new C3845a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f144212a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f144213c = h.i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f144214d = h.i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f144215e = h.i.a((h.f.a.a) new l(this));

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f144216f;

    static {
        Covode.recordClassIndex(94378);
    }

    private float c() {
        return ((Number) this.f144214d.getValue()).floatValue();
    }

    private final ProfileNaviOnboardingViewModel d() {
        return (ProfileNaviOnboardingViewModel) this.f144215e.getValue();
    }

    public final float a() {
        return ((Number) this.f144213c.getValue()).floatValue();
    }

    public final View a(int i2) {
        if (this.f144216f == null) {
            this.f144216f = new SparseArray();
        }
        View view = (View) this.f144216f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144216f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$a  reason: collision with other inner class name */
    public static final class C3845a {
        static {
            Covode.recordClassIndex(94379);
        }

        private C3845a() {
        }

        public /* synthetic */ C3845a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final List<t> b() {
        return ((ProfileNaviOnboardingState) d().a(this)).getStarterAvatarList();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f144216f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Resources resources;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                resources = activity.getResources();
            } else {
                resources = null;
            }
            return Float.valueOf(ag.a.a(100.0f, resources));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Resources resources;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                resources = activity.getResources();
            } else {
                resources = null;
            }
            return Float.valueOf(ag.a.a(44.0f, resources));
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<ProfileNaviOnboardingViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviOnboardingViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(this.this$0.requireActivity()).a(ProfileNaviOnboardingViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SharedPreferences preferences;
        super.onStart();
        TuxIconView tuxIconView = (TuxIconView) a(R.id.ctn);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new i(this));
        }
        com.bytedance.lighten.a.v a2 = r.a(Uri.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_starter_display_image.png"));
        SmartImageView smartImageView = (SmartImageView) a(R.id.cts);
        h.f.b.l.b(smartImageView, "");
        a2.f39906b = smartImageView.getContext();
        a2.E = (SmartImageView) a(R.id.cts);
        a2.c();
        f.a.b.b unused = selectSubscribe(d(), c.f144226a, new ah(), new g(this));
        f.a.b.b unused2 = selectSubscribe(d(), d.f144228a, new ah(), new h(this));
        if (b() == null) {
            ProfileNaviOnboardingViewModel d2 = d();
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && (preferences = activity.getPreferences(0)) != null) {
                h.f.b.l.d(preferences, "");
                d2.f144382c = preferences;
                if (!preferences.getBoolean(ProfileNaviOnboardingViewModel.f144378d, false)) {
                    d2.c(ProfileNaviOnboardingViewModel.g.f144394a);
                    d2.f144381b.removeCallbacksAndMessages(null);
                    d2.f144381b.postDelayed(new ProfileNaviOnboardingViewModel.h(d2), d2.f144380a);
                    return;
                }
                d2.b();
            }
        }
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144217a;

        static {
            Covode.recordClassIndex(94382);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f144217a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            RecyclerView recyclerView = (RecyclerView) this.f144217a.a(R.id.cto);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
        }
    }

    public static final class f extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144220a;

        static {
            Covode.recordClassIndex(94384);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f144220a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            float a2;
            TuxTextView tuxTextView;
            TuxTextView tuxTextView2;
            h.f.b.l.d(recyclerView, "");
            a aVar = this.f144220a;
            float computeVerticalScrollOffset = (float) recyclerView.computeVerticalScrollOffset();
            if (computeVerticalScrollOffset >= aVar.a()) {
                a2 = 0.0f;
            } else {
                a2 = (aVar.a() - computeVerticalScrollOffset) / aVar.a();
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) aVar.a(R.id.ctr);
            if (constraintLayout != null) {
                constraintLayout.setScaleX(a2);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) aVar.a(R.id.ctr);
            if (constraintLayout2 != null) {
                constraintLayout2.setScaleY(a2);
            }
            if (a2 == 0.0f && (tuxTextView2 = (TuxTextView) aVar.a(R.id.db7)) != null && tuxTextView2.getVisibility() == 8) {
                aVar.a(true);
            } else if (a2 > 0.0f && (tuxTextView = (TuxTextView) aVar.a(R.id.db7)) != null && tuxTextView.getVisibility() == 0) {
                aVar.a(false);
            }
        }
    }

    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144222a;

        static {
            Covode.recordClassIndex(94388);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(a aVar) {
            this.f144222a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f144222a.a(R.id.db7);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
        }
    }

    public static final class k implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144223a;

        static {
            Covode.recordClassIndex(94389);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(a aVar) {
            this.f144223a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f144223a.a(R.id.db7);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f144218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144219b;

        static {
            Covode.recordClassIndex(94383);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 50.0f, 0.0f);
            h.f.b.l.b(ofFloat, "");
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f);
            h.f.b.l.b(ofFloat2, "");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f144218a, ofFloat, ofFloat2);
            h.f.b.l.b(ofPropertyValuesHolder, "");
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(200L);
            TextView textView = this.f144218a;
            if (textView != null) {
                textView.setText(this.f144219b);
            }
            ofPropertyValuesHolder.start();
        }

        e(TextView textView, String str) {
            this.f144218a = textView;
            this.f144219b = str;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144221a;

        static {
            Covode.recordClassIndex(94387);
        }

        i(a aVar) {
            this.f144221a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f144221a.f144212a) {
                com.ss.android.ugc.aweme.common.r.a("exit_avatar_welcome_intro", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.bn.a.f68735a).a("enter_method", "click").f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("exit_avatar_edit_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.bn.a.f68735a).f66730a);
            }
            androidx.fragment.app.e activity = this.f144221a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.g.b
    public final void a(t tVar) {
        h.f.b.l.d(tVar, "");
        String valueOf = String.valueOf(tVar.a());
        com.ss.android.ugc.aweme.common.r.a("choose_starter_avatar", new com.ss.android.ugc.aweme.app.f.d().a("item_id", valueOf).a("start_time", String.valueOf(new Date().getTime())).a("enter_from", com.ss.android.ugc.aweme.bn.a.f68735a).f66730a);
        d().a(tVar, 0);
    }

    public final void a(List<t> list) {
        int i2;
        RecyclerView recyclerView = (RecyclerView) a(R.id.cto);
        h.f.b.l.b(recyclerView, "");
        if (recyclerView.getAdapter() == null) {
            com.ss.android.ugc.aweme.view.a.g gVar = new com.ss.android.ugc.aweme.view.a.g(list, this);
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.cto);
            if (recyclerView2 != null) {
                getActivity();
                recyclerView2.setLayoutManager(new GridLayoutManager(2));
            }
            RecyclerView recyclerView3 = (RecyclerView) a(R.id.cto);
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(gVar);
            }
            RecyclerView recyclerView4 = (RecyclerView) a(R.id.cto);
            if (recyclerView4 != null) {
                recyclerView4.a(new f(this));
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                Resources resources = activity.getResources();
                h.f.b.l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i2 = displayMetrics.heightPixels;
                } else {
                    i2 = 0;
                }
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, (float) i2, 0.0f);
                h.f.b.l.b(ofFloat, "");
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a(R.id.cto), ofFloat);
                h.f.b.l.b(ofPropertyValuesHolder, "");
                ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder.setDuration(1000L);
                ofPropertyValuesHolder.addListener(new d(this));
                ofPropertyValuesHolder.start();
                return;
            }
            return;
        }
        RecyclerView recyclerView5 = (RecyclerView) a(R.id.cto);
        h.f.b.l.b(recyclerView5, "");
        if (recyclerView5.getAdapter() instanceof com.ss.android.ugc.aweme.view.a.g) {
            RecyclerView recyclerView6 = (RecyclerView) a(R.id.cto);
            h.f.b.l.b(recyclerView6, "");
            RecyclerView.a adapter = recyclerView6.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter");
            ((com.ss.android.ugc.aweme.view.a.g) adapter).f144082a = list;
            RecyclerView recyclerView7 = (RecyclerView) a(R.id.cto);
            h.f.b.l.b(recyclerView7, "");
            RecyclerView.a adapter2 = recyclerView7.getAdapter();
            Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter");
            adapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f - c(), 0.0f);
            h.f.b.l.b(ofFloat, "");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a(R.id.db7), ofFloat);
            h.f.b.l.b(ofPropertyValuesHolder, "");
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.addListener(new j(this));
            ofPropertyValuesHolder.start();
            return;
        }
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f, 0.0f - c());
        h.f.b.l.b(ofFloat2, "");
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(a(R.id.db7), ofFloat2);
        h.f.b.l.b(ofPropertyValuesHolder2, "");
        ofPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder2.setDuration(200L);
        ofPropertyValuesHolder2.addListener(new k(this));
        ofPropertyValuesHolder2.start();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends t>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.view.e.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends t> list) {
            List<? extends t> list2 = list;
            h.f.b.l.d(iVar, "");
            if (list2 != null) {
                this.this$0.a((List<t>) list2);
            }
            return z.f158842a;
        }
    }

    public final void a(String str, String str2) {
        a((TextView) a(R.id.ctp), str);
        a((TextView) a(R.id.ctq), str2);
    }

    private static void a(TextView textView, String str) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -50.0f);
        h.f.b.l.b(ofFloat, "");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f);
        h.f.b.l.b(ofFloat2, "");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, ofFloat, ofFloat2);
        h.f.b.l.b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.addListener(new e(textView, str));
        ofPropertyValuesHolder.start();
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.viewModel.a, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.viewModel.a aVar) {
            String str;
            String str2;
            String str3;
            com.ss.android.ugc.aweme.viewModel.a aVar2 = aVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(aVar2, "");
            int i2 = b.f144224a[aVar2.f144416a.ordinal()];
            String str4 = null;
            if (i2 == 1) {
                com.ss.android.ugc.aweme.common.r.a("show_avatar_welcome_intro", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.bn.a.f68735a).a("enter_method", "click").f66730a);
                this.this$0.f144212a = true;
                a aVar3 = this.this$0;
                Context context = aVar3.getContext();
                if (context != null) {
                    str = context.getString(R.string.a0k);
                } else {
                    str = null;
                }
                Context context2 = this.this$0.getContext();
                if (context2 != null) {
                    str4 = context2.getString(R.string.a1d);
                }
                aVar3.a(str, str4);
            } else if (i2 == 2) {
                a aVar4 = this.this$0;
                Context context3 = aVar4.getContext();
                if (context3 != null) {
                    str2 = context3.getString(R.string.a0q);
                } else {
                    str2 = null;
                }
                Context context4 = this.this$0.getContext();
                if (context4 != null) {
                    str4 = context4.getString(R.string.a0b);
                }
                aVar4.a(str2, str4);
            } else if (i2 == 3) {
                a aVar5 = this.this$0;
                Context context5 = aVar5.getContext();
                if (context5 != null) {
                    str3 = context5.getString(R.string.a0k);
                } else {
                    str3 = null;
                }
                Context context6 = aVar5.getContext();
                if (context6 != null) {
                    str4 = context6.getString(R.string.a0e);
                }
                aVar5.a(str3, str4);
                aVar5.a(aVar5.b());
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        com.ss.android.ugc.aweme.common.r.a("show_avatar_edit_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.bn.a.f68735a).f66730a);
        return com.a.a(layoutInflater, R.layout.apt, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
