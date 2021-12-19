package com.ss.android.ugc.aweme.ftc.f;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.g;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public final class c extends j implements b, RepeatMusicPlayer.a, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f98470a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private ShortVideoContext f98471b;

    /* renamed from: c  reason: collision with root package name */
    private g f98472c;

    /* renamed from: d  reason: collision with root package name */
    private RepeatMusicPlayer f98473d;

    /* renamed from: e  reason: collision with root package name */
    private String f98474e;

    /* renamed from: f  reason: collision with root package name */
    private int f98475f;

    /* renamed from: g  reason: collision with root package name */
    private int f98476g;

    /* renamed from: h  reason: collision with root package name */
    private final h.f.a.b<Integer, z> f98477h;

    static {
        Covode.recordClassIndex(62624);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62625);
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

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        a();
    }

    private final void a() {
        RepeatMusicPlayer repeatMusicPlayer = this.f98473d;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.a();
        }
        this.f98473d = null;
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        g gVar = this.f98472c;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.a
    public final void f(int i2) {
        g gVar = this.f98472c;
        if (gVar != null) {
            gVar.a(i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(h.f.a.b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f98477h = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.g.a
    public final void e(int i2) {
        this.f98476g = i2;
        this.f98477h.invoke(Integer.valueOf(i2));
        a();
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.g.a
    public final void d(int i2) {
        String str = this.f98474e;
        if (str == null) {
            l.a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f98476g = i2;
            a(i2, this.f98475f);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        int i2;
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((e) activity, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        this.f98471b = shortVideoContext;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.f124757b.r != null) {
            i2 = (int) com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().getMaxShootingDuration();
            ShortVideoContext shortVideoContext2 = this.f98471b;
            if (shortVideoContext2 == null) {
                l.a("shortVideoContext");
            }
            if (!shortVideoContext2.f124757b.t) {
                i2 = 15000;
            }
        } else {
            ShortVideoContext shortVideoContext3 = this.f98471b;
            if (shortVideoContext3 == null) {
                l.a("shortVideoContext");
            }
            i2 = (int) shortVideoContext3.f124757b.f124707b;
        }
        if (cr.a().f125295a != null) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                l.b();
            }
            if (cVar.shootDuration > 0) {
                com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                if (cVar2 == null) {
                    l.b();
                }
                i2 = Math.min(i2, cVar2.shootDuration);
            }
        }
        this.f98475f = i2;
        ShortVideoContext shortVideoContext4 = this.f98471b;
        if (shortVideoContext4 == null) {
            l.a("shortVideoContext");
        }
        this.f98476g = shortVideoContext4.f124757b.q;
        ShortVideoContext shortVideoContext5 = this.f98471b;
        if (shortVideoContext5 == null) {
            l.a("shortVideoContext");
        }
        String str = shortVideoContext5.f124757b.y;
        l.b(str, "");
        this.f98474e = str;
        View view = this.n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.ss.android.ugc.aweme.shortvideo.cutmusic.c cVar3 = new com.ss.android.ugc.aweme.shortvideo.cutmusic.c((FrameLayout) view, this);
        ShortVideoContext shortVideoContext6 = this.f98471b;
        if (shortVideoContext6 == null) {
            l.a("shortVideoContext");
        }
        cVar3.f126340a = shortVideoContext6.aw;
        int i3 = this.f98475f;
        ShortVideoContext shortVideoContext7 = this.f98471b;
        if (shortVideoContext7 == null) {
            l.a("shortVideoContext");
        }
        cVar3.a(i3, shortVideoContext7.f124764i, this.f98476g);
        this.f98472c = cVar3;
        a(this.f98476g, this.f98475f);
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
        View a2 = com.a.a(layoutInflater, R.layout.a3a, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    private final void a(int i2, int i3) {
        String str = this.f98474e;
        if (str == null) {
            l.a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.f98473d == null) {
                Activity activity = this.f42913m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.AbsActivityAdaptationActivity");
                com.ss.android.ugc.aweme.adaptation.b bVar = (com.ss.android.ugc.aweme.adaptation.b) activity;
                String str2 = this.f98474e;
                if (str2 == null) {
                    l.a("mMusicPath");
                }
                this.f98473d = new RepeatMusicPlayer(bVar, str2, i3);
            }
            RepeatMusicPlayer repeatMusicPlayer = this.f98473d;
            if (repeatMusicPlayer == null) {
                l.b();
            }
            repeatMusicPlayer.a(i2);
            RepeatMusicPlayer repeatMusicPlayer2 = this.f98473d;
            if (repeatMusicPlayer2 == null) {
                l.b();
            }
            repeatMusicPlayer2.f126321e = this;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
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
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super b, ? super A, z> mVar) {
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
