package com.ss.android.ugc.aweme.badge;

import android.app.Dialog;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
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
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.bo;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.u;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.l;
import h.f.b.z;
import h.k.k;

public final class f extends androidx.fragment.app.d implements q, j {

    /* renamed from: i  reason: collision with root package name */
    public static final int f67905i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final a f67906j = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final String f67907m = "EditProfileBadgeDialog";
    private static final long n = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: a  reason: collision with root package name */
    public h f67908a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67909b;

    /* renamed from: c  reason: collision with root package name */
    public ProfileBadgeStruct f67910c;

    /* renamed from: d  reason: collision with root package name */
    public ProfileBadgeStruct f67911d;

    /* renamed from: e  reason: collision with root package name */
    public c f67912e;

    /* renamed from: f  reason: collision with root package name */
    public GridLayoutManager f67913f;

    /* renamed from: g  reason: collision with root package name */
    final IProfileBadgeService f67914g;

    /* renamed from: h  reason: collision with root package name */
    public final User f67915h;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f67916k = h.i.a((h.f.a.a) new g(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f67917l;
    private SparseArray o;

    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    public final DmtStatusView a() {
        return (DmtStatusView) this.f67916k.getValue();
    }

    public final EditProfileBadgeViewModel b() {
        return (EditProfileBadgeViewModel) this.f67917l.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41806);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
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

    static final class g extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(41812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.a(R.id.e_o);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<EditProfileBadgeViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(41809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditProfileBadgeViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(EditProfileBadgeViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(41805);
    }

    public static final class h implements IProfileBadgeService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f67922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f67923c;

        static {
            Covode.recordClassIndex(41813);
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.a
        public final void a() {
            String str;
            AccountService.a().e().updateCurProfileBadge(this.f67921a.f67911d);
            f fVar = this.f67921a;
            ProfileBadgeStruct profileBadgeStruct = fVar.f67911d;
            Boolean bool = null;
            if (profileBadgeStruct != null) {
                str = profileBadgeStruct.getUrl();
            } else {
                str = null;
            }
            ProfileBadgeStruct profileBadgeStruct2 = this.f67921a.f67911d;
            if (profileBadgeStruct2 != null) {
                bool = Boolean.valueOf(profileBadgeStruct2.getShouldShow());
            }
            fVar.a(str, bool);
            if (!this.f67922b.element) {
                this.f67922b.element = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.a
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            if (profileBadgeStruct != null && Long.valueOf(profileBadgeStruct.getId()) != null) {
                f fVar = this.f67921a;
                fVar.f67911d = fVar.f67910c;
                if (!this.f67923c.element) {
                    this.f67921a.c();
                    this.f67923c.element = true;
                }
            }
        }

        h(f fVar, z.a aVar, z.a aVar2) {
            this.f67921a = fVar;
            this.f67922b = aVar;
            this.f67923c = aVar2;
        }
    }

    public static final class i implements IProfileBadgeService.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67924a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f67925b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f67926c;

        static {
            Covode.recordClassIndex(41814);
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.b
        public final void a() {
            String str;
            AccountService.a().e().updateCurProfileBadge(this.f67924a.f67911d);
            f fVar = this.f67924a;
            ProfileBadgeStruct profileBadgeStruct = fVar.f67911d;
            Boolean bool = null;
            if (profileBadgeStruct != null) {
                str = profileBadgeStruct.getUrl();
            } else {
                str = null;
            }
            ProfileBadgeStruct profileBadgeStruct2 = this.f67924a.f67911d;
            if (profileBadgeStruct2 != null) {
                bool = Boolean.valueOf(profileBadgeStruct2.getShouldShow());
            }
            fVar.a(str, bool);
            if (!this.f67925b.element) {
                this.f67925b.element = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.b
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            if (profileBadgeStruct != null && Long.valueOf(profileBadgeStruct.getId()) != null) {
                f fVar = this.f67924a;
                fVar.f67911d = fVar.f67910c;
                if (!this.f67926c.element) {
                    this.f67924a.c();
                    this.f67926c.element = true;
                }
            }
        }

        i(f fVar, z.a aVar, z.a aVar2) {
            this.f67924a = fVar;
            this.f67925b = aVar;
            this.f67926c = aVar2;
        }
    }

    public final void c() {
        new com.bytedance.tux.g.b(this).e(R.string.exc).b(R.raw.icon_tick_fill_small).d(R.attr.aw).a(n).b();
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$f  reason: collision with other inner class name */
    public static final class C1536f extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67920a;

        static {
            Covode.recordClassIndex(41811);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1536f(f fVar) {
            super(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            this.f67920a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ce, code lost:
            if (r0 == null) goto L_0x01d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
            if (r0 == null) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
            if (r0 == null) goto L_0x0144;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
            if (r0 == null) goto L_0x016c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0182, code lost:
            if (r0 == null) goto L_0x0184;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x019e, code lost:
            if (r0 == null) goto L_0x01a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b6, code lost:
            if (r0 == null) goto L_0x01b8;
         */
        @Override // com.ss.android.ugc.aweme.utils.bp
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 486
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.badge.f.C1536f.a(android.view.View):void");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67918a;

        static {
            Covode.recordClassIndex(41808);
        }

        c(f fVar) {
            this.f67918a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f67918a.b().a();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67919a;

        static {
            Covode.recordClassIndex(41810);
        }

        e(f fVar) {
            this.f67919a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f67919a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.badge.j
    public final void a(h hVar) {
        String str;
        this.f67908a = hVar;
        this.f67909b = true;
        Boolean bool = null;
        if (hVar != null) {
            str = hVar.getUrl();
            bool = hVar.getShouldShow();
        } else {
            str = null;
        }
        a(str, bool);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67910c = this.f67915h.getProfileBadge();
        this.f67911d = this.f67915h.getProfileBadge();
        setStyle(0, R.style.a1a);
    }

    public f(User user) {
        l.d(user, "");
        this.f67915h = user;
        IProfileBadgeService b2 = ProfileBadgeServiceImpl.b();
        l.b(b2, "");
        this.f67914g = b2;
        this.f67917l = h.i.a((h.f.a.a) new d(this));
    }

    public final void a(boolean z) {
        int i2;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (a(R.id.arz) != null && a(R.id.as2) != null && a(R.id.as2) != null && a(R.id.as_) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.arz);
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(i2);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.as2);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(i2);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.as1);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(i2);
            TuxButton tuxButton = (TuxButton) a(R.id.as_);
            l.b(tuxButton, "");
            tuxButton.setVisibility(i2);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    public final void a(String str, Boolean bool) {
        if (str != null && l.a((Object) bool, (Object) true) && a(R.id.ary) != null) {
            SmartImageView smartImageView = (SmartImageView) a(R.id.ary);
            l.b(smartImageView, "");
            smartImageView.setVisibility(0);
            com.bytedance.lighten.a.v a2 = r.a(str);
            a2.E = (SmartImageView) a(R.id.ary);
            a2.a(f67907m).c();
        } else if (a(R.id.ary) != null) {
            SmartImageView smartImageView2 = (SmartImageView) a(R.id.ary);
            l.b(smartImageView2, "");
            smartImageView2.setVisibility(8);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, k, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(41807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, k kVar) {
            String str;
            k kVar2 = kVar;
            l.d(iVar, "");
            if (kVar2 != null) {
                if (kVar2.f67934e) {
                    this.this$0.a().f();
                    this.this$0.a(true);
                } else if (!kVar2.f67935f) {
                    this.this$0.a().h();
                    this.this$0.a(true);
                } else if (kVar2.f67932c == null || !(!kVar2.f67932c.isEmpty())) {
                    this.this$0.a().h();
                    this.this$0.a(true);
                } else {
                    this.this$0.a().g();
                    this.this$0.a(false);
                    String str2 = bo.a().f122101b;
                    if (hl.a(str2)) {
                        TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.asa);
                        l.b(tuxTextView, "");
                        tuxTextView.setText(str2);
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.this$0.a(R.id.as2);
                    l.b(tuxTextView2, "");
                    d dVar = kVar2.f67933d;
                    String str3 = null;
                    if (dVar != null) {
                        str = dVar.getName();
                    } else {
                        str = null;
                    }
                    tuxTextView2.setText(str);
                    TuxTextView tuxTextView3 = (TuxTextView) this.this$0.a(R.id.as1);
                    l.b(tuxTextView3, "");
                    d dVar2 = kVar2.f67933d;
                    if (dVar2 != null) {
                        str3 = dVar2.getDescription();
                    }
                    tuxTextView3.setText(str3);
                    f fVar = this.this$0;
                    this.this$0.getContext();
                    fVar.f67913f = new GridLayoutManager(f.f67905i);
                    this.this$0.f67912e = new c(this.this$0, kVar2.f67932c, this.this$0.f67915h);
                    RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.as9);
                    l.b(recyclerView, "");
                    recyclerView.setLayoutManager(this.this$0.f67913f);
                    RecyclerView recyclerView2 = (RecyclerView) this.this$0.a(R.id.as9);
                    l.b(recyclerView2, "");
                    recyclerView2.setAdapter(this.this$0.f67912e);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Window window;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        a2.a().a(R.string.h2z, R.string.h2y, R.string.h35, new c(this));
        ((DmtStatusView) a(R.id.e_o)).d();
        ((DmtStatusView) a(R.id.e_o)).setBuilder(a2);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.f159928l);
        }
        if (a(R.id.arx) != null) {
            com.bytedance.lighten.a.v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(u.a(this.f67915h)));
            a3.E = (SmartImageView) a(R.id.arx);
            a3.a(f67907m).c();
        }
        ProfileBadgeStruct profileBadge = this.f67915h.getProfileBadge();
        Boolean bool = null;
        if (profileBadge != null) {
            str = profileBadge.getUrl();
        } else {
            str = null;
        }
        ProfileBadgeStruct profileBadge2 = this.f67915h.getProfileBadge();
        if (profileBadge2 != null) {
            bool = Boolean.valueOf(profileBadge2.getShouldShow());
        }
        a(str, bool);
        ((RelativeLayout) a(R.id.asb)).setOnClickListener(new e(this));
        ((TuxButton) a(R.id.as_)).setOnClickListener(new C1536f(this));
        b().a();
        f.a.b.b unused = selectSubscribe(b(), g.f67927a, new ah(), new b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.azg, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
