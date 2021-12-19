package com.ss.android.ugc.aweme.view.f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.common.u;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.z;
import java.io.File;
import java.util.UUID;

public final class f extends androidx.fragment.app.d implements q, com.ss.android.ugc.aweme.view.a.b {

    /* renamed from: a  reason: collision with root package name */
    public Runnable f144252a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f144253b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public final String f144254c;

    /* renamed from: d  reason: collision with root package name */
    public final a f144255d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f144256e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final h.h f144257f = h.i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f144258g = h.i.a((h.f.a.a) new i(this));

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f144259h;

    public interface a {
        static {
            Covode.recordClassIndex(94420);
        }

        void n();

        void o();

        void p();
    }

    static {
        Covode.recordClassIndex(94419);
    }

    private final com.ss.android.ugc.aweme.model.g c() {
        return (com.ss.android.ugc.aweme.model.g) this.f144258g.getValue();
    }

    public final ProfileNaviCreatorViewModel a() {
        return (ProfileNaviCreatorViewModel) this.f144257f.getValue();
    }

    public final View b(int i2) {
        if (this.f144259h == null) {
            this.f144259h = new SparseArray();
        }
        View view = (View) this.f144259h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144259h.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144260a;

        static {
            Covode.recordClassIndex(94422);
        }

        c(f fVar) {
            this.f144260a = fVar;
        }

        public final void run() {
            this.f144260a.a(0);
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144265a;

        static {
            Covode.recordClassIndex(94429);
        }

        j(f fVar) {
            this.f144265a = fVar;
        }

        public final void run() {
            this.f144265a.f144255d.p();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144262b;

        static {
            Covode.recordClassIndex(94423);
        }

        d(f fVar, int i2) {
            this.f144261a = fVar;
            this.f144262b = i2;
        }

        public final void run() {
            this.f144261a.a(this.f144262b + 1);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f144259h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f144256e.removeCallbacksAndMessages(null);
        this.f144255d.o();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f144255d.n();
    }

    static final class b extends h.f.b.m implements h.f.a.a<ProfileNaviCreatorViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviCreatorViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        this.f144253b.removeCallbacksAndMessages(null);
        a(false);
        ProfileNaviCreatorViewModel a2 = a();
        a2.d(ProfileNaviCreatorViewModel.f.f144312a);
        a2.d(ProfileNaviCreatorViewModel.g.f144313a);
        this.f144255d.o();
        super.dismiss();
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.model.g> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.model.g invoke() {
            String str;
            f fVar = this.this$0;
            String[] strArr = {"#FFB4FE", "#8A73FE", "#A5E6FF", "#8EFF8E", "#FFFD8E", "#FF9C68", "#FF858F", "#333333", "#B3B3B3", "#FFFFFF"};
            com.ss.android.ugc.aweme.model.g gVar = new com.ss.android.ugc.aweme.model.g();
            fVar.a();
            com.ss.android.ugc.aweme.model.q qVar = r.f110811a;
            if (qVar == null || (str = qVar.f110806b) == null) {
                return gVar;
            }
            int i2 = 0;
            do {
                String str2 = strArr[i2];
                com.ss.android.ugc.aweme.model.e eVar = new com.ss.android.ugc.aweme.model.e(UUID.randomUUID().toString());
                eVar.f110758a = str2;
                gVar.f110763a.add(eVar);
                if (h.f.b.l.a((Object) str, (Object) str2)) {
                    gVar.f110764b = eVar;
                }
                i2++;
            } while (i2 < 10);
            return gVar;
        }
    }

    public final void b() {
        a();
        com.ss.android.ugc.aweme.model.c cVar = r.f110814d;
        if (cVar == null || cVar.f110757b == null) {
            a(true);
            this.f144252a = new c(this);
            return;
        }
        a(0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16974122);
        setCancelable(false);
    }

    private final void b(com.ss.android.ugc.aweme.model.e eVar) {
        String str = eVar.f110758a;
        if (str != null && str.length() != 0) {
            ProfileNaviCreatorViewModel a2 = a();
            String str2 = eVar.f110758a;
            if (str2 == null) {
                h.f.b.l.b();
            }
            a2.a(str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$f  reason: collision with other inner class name */
    static final class View$OnClickListenerC3848f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144264a;

        static {
            Covode.recordClassIndex(94425);
        }

        View$OnClickListenerC3848f(f fVar) {
            this.f144264a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144264a.f144255d.o();
            com.ss.android.ugc.aweme.common.r.a("cancel_edit_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            this.f144264a.dismiss();
            ProfileNaviCreatorViewModel a2 = this.f144264a.a();
            a2.d(ProfileNaviCreatorViewModel.j.f144320a);
            a2.d(ProfileNaviCreatorViewModel.k.f144321a);
        }
    }

    private final void a(boolean z) {
        if (z) {
            CardView cardView = (CardView) b(R.id.dav);
            h.f.b.l.b(cardView, "");
            cardView.setVisibility(0);
            ((TuxDualBallView) b(R.id.dau)).b();
            return;
        }
        ((TuxDualBallView) b(R.id.dau)).c();
        CardView cardView2 = (CardView) b(R.id.dav);
        h.f.b.l.b(cardView2, "");
        cardView2.setVisibility(8);
    }

    public final void a(int i2) {
        this.f144256e.removeCallbacksAndMessages(null);
        if (i2 > 3) {
            dismiss();
            return;
        }
        a();
        if (com.ss.android.ugc.aweme.model.b.a()) {
            dismiss();
        } else {
            this.f144256e.postDelayed(new d(this, i2), 3000);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.a.b
    public final void a(com.ss.android.ugc.aweme.model.e eVar) {
        h.f.b.l.d(eVar, "");
        c().f110764b = eVar;
        RecyclerView recyclerView = (RecyclerView) b(R.id.dan);
        h.f.b.l.b(recyclerView, "");
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        b(eVar);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144263a;

        static {
            Covode.recordClassIndex(94424);
        }

        e(f fVar) {
            this.f144263a = fVar;
        }

        public final void onClick(View view) {
            File a2;
            int i2;
            com.ss.android.ugc.aweme.model.q qVar;
            MethodCollector.i(5581);
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("submit_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            ProfileNaviCreatorViewModel a3 = this.f144263a.a();
            String profileImageBackgroundColor = ((ProfileNaviCreatorState) a3.at_()).getProfileImageBackgroundColor();
            if (!(profileImageBackgroundColor == null || (qVar = r.f110811a) == null)) {
                qVar.a(profileImageBackgroundColor);
                a3.j();
            }
            f fVar = this.f144263a;
            ProfileNaviCreatorViewModel a4 = fVar.a();
            a4.d(ProfileNaviCreatorViewModel.l.f144322a);
            a4.d(ProfileNaviCreatorViewModel.m.f144323a);
            fVar.f144253b.postDelayed(new j(fVar), 6000);
            f fVar2 = this.f144263a;
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) fVar2.b(R.id.daq);
            h.f.b.l.b(roundedFrameLayout, "");
            int width = roundedFrameLayout.getWidth();
            RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) fVar2.b(R.id.daq);
            h.f.b.l.b(roundedFrameLayout2, "");
            Bitmap createBitmap = Bitmap.createBitmap(width, roundedFrameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
            h.f.b.l.b(createBitmap, "");
            Canvas canvas = new Canvas(createBitmap);
            RoundedFrameLayout roundedFrameLayout3 = (RoundedFrameLayout) fVar2.b(R.id.daq);
            if (roundedFrameLayout3 == null) {
                h.f.b.l.b();
            }
            roundedFrameLayout3.draw(canvas);
            if (!(createBitmap == null || (a2 = u.a(fVar2.getContext(), createBitmap)) == null)) {
                SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(fVar2.getContext());
                Context context = fVar2.getContext();
                if (context != null) {
                    h.f.b.l.b(context, "");
                    i2 = (int) ag.a.a(context, 52.0f);
                } else {
                    i2 = 0;
                }
                com.bytedance.lighten.a.v a5 = com.bytedance.lighten.a.r.a(a2);
                a5.E = smartAvatarImageView;
                a5.c();
                if (fVar2.getContext() != null) {
                    a.C0731a b2 = new a.C0731a(fVar2.getContext()).a(R.string.a1n).b(R.string.a1l);
                    b2.M = true;
                    com.bytedance.ies.dmt.ui.dialog.a a6 = b2.a(R.string.a1k, (DialogInterface.OnClickListener) new k(fVar2, a2, smartAvatarImageView, i2), false).b(R.string.a1m, (DialogInterface.OnClickListener) new l(fVar2, a2, smartAvatarImageView, i2), false).a(smartAvatarImageView, i2, i2).a();
                    com.ss.android.ugc.aweme.common.r.a("show_set_avatar_profile_confirmation_popup", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                    a6.c();
                }
            }
            MethodCollector.o(5581);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            h.f.b.l.d(iVar, "");
            if (str2 != null) {
                ((RoundedFrameLayout) this.this$0.b(R.id.daq)).setBackgroundColor(Color.parseColor(str2));
            }
            return z.f158842a;
        }
    }

    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f144271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SmartAvatarImageView f144272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f144273d;

        static {
            Covode.recordClassIndex(94431);
        }

        l(f fVar, File file, SmartAvatarImageView smartAvatarImageView, int i2) {
            this.f144270a = fVar;
            this.f144271b = file;
            this.f144272c = smartAvatarImageView;
            this.f144273d = i2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.common.r.a("deny_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            this.f144270a.b();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(94427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f144253b.removeCallbacksAndMessages(null);
                Runnable runnable = this.this$0.f144252a;
                if (runnable != null) {
                    runnable.run();
                }
                this.this$0.f144252a = null;
            }
            return z.f158842a;
        }
    }

    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f144266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f144267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SmartAvatarImageView f144268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f144269d;

        static {
            Covode.recordClassIndex(94430);
        }

        k(f fVar, File file, SmartAvatarImageView smartAvatarImageView, int i2) {
            this.f144266a = fVar;
            this.f144267b = file;
            this.f144268c = smartAvatarImageView;
            this.f144269d = i2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = this.f144266a.f144254c;
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.common.r.a("confirm_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
            ProfileNaviCreatorViewModel a2 = this.f144266a.a();
            File file = this.f144267b;
            h.f.b.l.d(file, "");
            a2.d(ProfileNaviCreatorViewModel.r.f144325a);
            r.f110813c = new com.ss.android.ugc.aweme.model.c(file);
            ProfileNaviCreatorViewModel.a.a(file, ProfileNaviCreatorViewModel.s.f144326a);
            ProfileNaviCreatorViewModel.i();
            this.f144266a.b();
        }
    }

    public f(String str, a aVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        this.f144254c = str;
        this.f144255d = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel urlModel;
        MethodCollector.i(2950);
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        f.a.b.b unused = selectSubscribe(a(), g.f144274a, new ah(), new g(this));
        f.a.b.b unused2 = selectSubscribe(a(), h.f144279a, new ah(), new h(this));
        if (!(getContext() == null || getFragmentManager() == null)) {
            RecyclerView recyclerView = (RecyclerView) b(R.id.dan);
            h.f.b.l.b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            RecyclerView recyclerView2 = (RecyclerView) b(R.id.dan);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setAdapter(new com.ss.android.ugc.aweme.view.a.a(c(), this));
            com.ss.android.ugc.aweme.model.e eVar = c().f110764b;
            if (eVar != null) {
                b(eVar);
            }
        }
        a();
        if (ProfileNaviCreatorViewModel.b() != null) {
            SmartImageView smartImageView = (SmartImageView) b(R.id.dat);
            a();
            File b2 = ProfileNaviCreatorViewModel.b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            smartImageView.setImageBitmap(BitmapFactory.decodeFile(b2.getAbsolutePath()));
        } else {
            a();
            com.ss.android.ugc.aweme.model.q qVar = r.f110811a;
            if (!(qVar == null || (urlModel = qVar.f110809e) == null)) {
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
                a2.E = (SmartImageView) b(R.id.dat);
                a2.v = w.CENTER_INSIDE;
                a2.c();
            }
        }
        ((TuxButton) b(R.id.dar)).setOnClickListener(new e(this));
        ((TuxIconView) b(R.id.dal)).setOnClickListener(new View$OnClickListenerC3848f(this));
        MethodCollector.o(2950);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.apw, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
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
