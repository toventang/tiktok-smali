package com.ss.android.ugc.gamora.recorder.d;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import com.bytedance.als.h;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.aweme.tools.e;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public final class d extends j implements com.bytedance.jedi.arch.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147685c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    long f147686a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f147687b;

    /* renamed from: d  reason: collision with root package name */
    private TuxTextView f147688d;

    /* renamed from: e  reason: collision with root package name */
    private final h<Boolean> f147689e;

    static {
        Covode.recordClassIndex(97344);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97345);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final /* synthetic */ LinearLayout a(d dVar) {
        LinearLayout linearLayout = dVar.f147687b;
        if (linearLayout == null) {
            l.a("commerceStickerGoods");
        }
        return linearLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public d(h<Boolean> hVar) {
        l.d(hVar, "");
        this.f147689e = hVar;
        FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
        l.b(faceStickerBean, "");
        this.f147686a = faceStickerBean.getStickerId();
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.abr);
        l.b(c2, "");
        this.f147687b = (LinearLayout) c2;
        View c3 = c(R.id.abs);
        l.b(c3, "");
        TuxTextView tuxTextView = (TuxTextView) c3;
        this.f147688d = tuxTextView;
        if (tuxTextView == null) {
            l.a("commerceStickerText");
        }
        tuxTextView.setTuxFont(52);
        this.f147689e.a(this, new b(this));
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147690a;

        static {
            Covode.recordClassIndex(97346);
        }

        b(d dVar) {
            this.f147690a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int b2;
            Boolean bool = (Boolean) obj;
            int b3 = (int) n.b(this.f147690a.f42913m, 33.0f);
            ViewGroup.LayoutParams layoutParams = d.a(this.f147690a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            l.b(bool, "");
            if (bool.booleanValue()) {
                b2 = b3 + ((int) n.b(this.f147690a.f42913m, 186.0f));
            } else {
                b2 = (int) n.b(this.f147690a.f42913m, 186.0f);
            }
            layoutParams2.bottomMargin = b2;
            d.a(this.f147690a).setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FaceStickerBean f147692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f147693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FaceStickerCommerceBean f147694d;

        static {
            Covode.recordClassIndex(97347);
        }

        c(d dVar, FaceStickerBean faceStickerBean, e eVar, FaceStickerCommerceBean faceStickerCommerceBean) {
            this.f147691a = dVar;
            this.f147692b = faceStickerBean;
            this.f147693c = eVar;
            this.f147694d = faceStickerCommerceBean;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            cr a2 = cr.a();
            l.b(a2, "");
            a2.f125303i = true;
            cr a3 = cr.a();
            l.b(a3, "");
            a3.f125304j = false;
            com.ss.android.ugc.aweme.utils.d.a("click_transform_link", new com.ss.android.ugc.tools.f.b().a("prop_id", this.f147692b.getStickerId()).a("shoot_way", this.f147693c.f139981b).a("carrier_type", "video_shoot_page").f149193a);
            if (!com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.f147691a.t(), this.f147694d.f134971b)) {
                ai aiVar = com.ss.android.ugc.aweme.port.in.c.f115633l;
                Activity t = this.f147691a.t();
                String str = this.f147694d.f134970a;
                l.b(str, "");
                String valueOf = String.valueOf(this.f147692b.getStickerId());
                if (!TextUtils.isEmpty(str)) {
                    Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                    if (TextUtils.isEmpty(valueOf)) {
                        valueOf = "";
                    }
                    str = appendQueryParameter.appendQueryParameter("sticker_id", valueOf).build().toString();
                }
                l.b(str, "");
                aiVar.a(t, str, null);
            }
        }
    }

    public final boolean a(e eVar) {
        l.d(eVar, "");
        FaceStickerBean faceStickerBean = eVar.f139982c;
        boolean z = false;
        if (faceStickerBean == null || !b.a(faceStickerBean)) {
            j jVar = this.o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            ((com.bytedance.scene.group.b) jVar).d(this);
            return false;
        }
        j jVar2 = this.o;
        Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        ((com.bytedance.scene.group.b) jVar2).e(this);
        FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean == null) {
            l.b();
        }
        l.b(faceStickerCommerceBean, "");
        cr a2 = cr.a();
        l.b(a2, "");
        if (!a2.f125304j.booleanValue()) {
            com.ss.android.ugc.aweme.utils.d.a("show_transform_link", new com.ss.android.ugc.tools.f.b().a("prop_id", faceStickerBean.getStickerId()).a("shoot_way", eVar.f139981b).a("carrier_type", "video_shoot_page").f149193a);
            z = true;
        }
        this.f147686a = faceStickerBean.getStickerId();
        TuxTextView tuxTextView = this.f147688d;
        if (tuxTextView == null) {
            l.a("commerceStickerText");
        }
        tuxTextView.setText(faceStickerCommerceBean.f134972c);
        LinearLayout linearLayout = this.f147687b;
        if (linearLayout == null) {
            l.a("commerceStickerGoods");
        }
        linearLayout.setOnClickListener(new c(this, faceStickerBean, eVar, faceStickerCommerceBean));
        return z;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.biq, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
