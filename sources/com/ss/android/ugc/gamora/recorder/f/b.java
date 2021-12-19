package com.ss.android.ugc.gamora.recorder.f;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.aweme.shortvideo.countdown.e;
import com.ss.android.ugc.aweme.shortvideo.countdown.f;
import com.ss.android.ugc.aweme.shortvideo.countdown.j;
import com.ss.android.ugc.aweme.shortvideo.countdown.k;
import com.ss.android.ugc.aweme.shortvideo.countdown.l;
import com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.Objects;

public final class b extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b {

    /* renamed from: b  reason: collision with root package name */
    public e f147738b;

    /* renamed from: c  reason: collision with root package name */
    public j f147739c;

    /* renamed from: d  reason: collision with root package name */
    public int f147740d;

    /* renamed from: e  reason: collision with root package name */
    public long f147741e = 15000;

    /* renamed from: f  reason: collision with root package name */
    public int f147742f;

    /* renamed from: g  reason: collision with root package name */
    public final a f147743g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.countdown.c f147744h;

    /* renamed from: i  reason: collision with root package name */
    private final f.b f147745i = new a(this);

    /* renamed from: j  reason: collision with root package name */
    private final k f147746j = new d(this);

    static {
        Covode.recordClassIndex(97387);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$b  reason: collision with other inner class name */
    public static final class C3975b implements j.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147748a;

        static {
            Covode.recordClassIndex(97389);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j.a
        public final void a() {
            this.f147748a.f147743g.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j.a
        public final void c() {
            this.f147748a.f147743g.c();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.j.a
        public final void b() {
            this.f147748a.f147743g.a();
            this.f147748a.f147743g.a(this.f147748a.f147742f);
            this.f147748a.f147743g.a((long) this.f147748a.f147740d);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3975b(b bVar) {
            this.f147748a = bVar;
        }
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

    public static final class c implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147749a;

        static {
            Covode.recordClassIndex(97390);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.l
        public final void b() {
            this.f147749a.f147743g.a();
            a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.l
        public final void a() {
            j jVar;
            if (this.f147749a.f42913m != null && (jVar = this.f147749a.f147739c) != null && !jVar.b()) {
                this.f147749a.f147743g.a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f147749a = bVar;
        }
    }

    public static final class d implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147750a;

        static {
            Covode.recordClassIndex(97391);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.k
        public final void a() {
            e eVar = this.f147750a.f147738b;
            if (eVar != null) {
                eVar.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f147750a = bVar;
        }

        static final class a implements e.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f147751a;

            static {
                Covode.recordClassIndex(97392);
            }

            a(d dVar) {
                this.f147751a = dVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.countdown.e.a
            public final void a(int i2) {
                f fVar = (f) this.f147751a.f147750a.a("count_down");
                if (fVar != null) {
                    VolumeTapsView volumeTapsView = fVar.f125186a;
                    if (volumeTapsView == null) {
                        h.f.b.l.a("volumeTapsView");
                    }
                    volumeTapsView.setProgress(i2);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.k
        public final void a(int i2, int i3) {
            this.f147750a.f147742f = i3;
            b bVar = this.f147750a;
            bVar.f147740d = (int) Math.min(bVar.f147741e, (long) i2);
            j jVar = this.f147750a.f147739c;
            if (jVar != null) {
                jVar.a(i3);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.countdown.k
        public final void a(String str, int i2, int i3) {
            if (str != null && this.f147750a.f42913m != null) {
                e eVar = this.f147750a.f147738b;
                if (eVar != null) {
                    eVar.a();
                }
                this.f147750a.f147738b = new e(this.f147750a.t(), Uri.parse(str));
                e eVar2 = this.f147750a.f147738b;
                if (eVar2 != null) {
                    eVar2.f125179c = new a(this);
                }
                e eVar3 = this.f147750a.f147738b;
                if (eVar3 != null && eVar3.f125177a != null) {
                    eVar3.f125177a.seekTo(i2);
                    eVar3.f125177a.start();
                    eVar3.f125180d = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: IPUT  
                          (wrap: com.ss.android.ugc.aweme.shortvideo.countdown.e$1 : 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.shortvideo.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e), (r7v0 'i3' int) call: com.ss.android.ugc.aweme.shortvideo.countdown.e.1.<init>(com.ss.android.ugc.aweme.shortvideo.countdown.e, int):void type: CONSTRUCTOR)
                          (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e)
                         com.ss.android.ugc.aweme.shortvideo.countdown.e.d java.lang.Runnable in method: com.ss.android.ugc.gamora.recorder.f.b.d.a(java.lang.String, int, int):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.shortvideo.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e), (r7v0 'i3' int) call: com.ss.android.ugc.aweme.shortvideo.countdown.e.1.<init>(com.ss.android.ugc.aweme.shortvideo.countdown.e, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.gamora.recorder.f.b.d.a(java.lang.String, int, int):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.countdown.e, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 32 more
                        */
                    /*
                        this = this;
                        if (r5 == 0) goto L_0x0008
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f147750a
                        android.app.Activity r0 = r0.f42913m
                        if (r0 != 0) goto L_0x0009
                    L_0x0008:
                        return
                    L_0x0009:
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f147750a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r0 = r0.f147738b
                        if (r0 == 0) goto L_0x0012
                        r0.a()
                    L_0x0012:
                        com.ss.android.ugc.gamora.recorder.f.b r3 = r4.f147750a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r2 = new com.ss.android.ugc.aweme.shortvideo.countdown.e
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f147750a
                        android.app.Activity r1 = r0.t()
                        android.net.Uri r0 = android.net.Uri.parse(r5)
                        r2.<init>(r1, r0)
                        r3.f147738b = r2
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f147750a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r1 = r0.f147738b
                        if (r1 == 0) goto L_0x0032
                        com.ss.android.ugc.gamora.recorder.f.b$d$a r0 = new com.ss.android.ugc.gamora.recorder.f.b$d$a
                        r0.<init>(r4)
                        r1.f125179c = r0
                    L_0x0032:
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f147750a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r2 = r0.f147738b
                        if (r2 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f125177a
                        if (r0 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f125177a
                        r0.seekTo(r6)
                        android.media.MediaPlayer r0 = r2.f125177a
                        r0.start()
                        com.ss.android.ugc.aweme.shortvideo.countdown.e$1 r0 = new com.ss.android.ugc.aweme.shortvideo.countdown.e$1
                        r0.<init>(r7)
                        r2.f125180d = r0
                        android.os.Handler r1 = r2.f125178b
                        java.lang.Runnable r0 = r2.f125180d
                        r1.post(r0)
                        goto L_0x0008
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.f.b.d.a(java.lang.String, int, int):void");
                }
            }

            @Override // com.bytedance.scene.j
            public final void w() {
                super.w();
                e eVar = this.f147738b;
                if (eVar != null && eVar.f125177a != null) {
                    try {
                        eVar.f125177a.start();
                        if (eVar.f125180d != null) {
                            eVar.f125178b.post(eVar.f125180d);
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            @Override // com.bytedance.scene.j
            public final void x() {
                super.x();
                e eVar = this.f147738b;
                if (!(eVar == null || eVar.f125177a == null)) {
                    try {
                        eVar.f125177a.pause();
                        if (eVar.f125180d != null) {
                            eVar.f125178b.removeCallbacks(eVar.f125180d);
                        }
                    } catch (Exception unused) {
                    }
                }
                j jVar = this.f147739c;
                if (jVar != null) {
                    jVar.a();
                }
                com.ss.android.ugc.aweme.shortvideo.countdown.c cVar = this.f147744h;
                if (cVar != null) {
                    cVar.b();
                }
            }

            public static final class a implements f.b {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f147747a;

                static {
                    Covode.recordClassIndex(97388);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                a(b bVar) {
                    this.f147747a = bVar;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.countdown.f.b
                public final void a(int i2) {
                    this.f147747a.f147743g.a(i2);
                }
            }

            @Override // com.bytedance.jedi.arch.b
            public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
                h.f.b.l.d(vm1, "");
                return (S1) b.a.a(this, vm1);
            }

            public b(a aVar) {
                h.f.b.l.d(aVar, "");
                this.f147743g = aVar;
            }

            @Override // com.bytedance.scene.j
            public final void a(Bundle bundle) {
                super.a(bundle);
                C3975b bVar = new C3975b(this);
                Activity t = t();
                h.f.b.l.b(t, "");
                this.f147744h = new com.ss.android.ugc.aweme.shortvideo.countdown.c(t);
                View view = this.n;
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view;
                com.ss.android.ugc.aweme.shortvideo.countdown.c cVar = this.f147744h;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                this.f147739c = new com.ss.android.ugc.aweme.shortvideo.countdown.d(frameLayout, bVar, cVar);
                ac a2 = androidx.lifecycle.ae.a(com.bytedance.scene.ktx.c.b(this), (ad.b) null).a(ShortVideoContextViewModel.class);
                h.f.b.l.b(a2, "");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
                h.f.b.l.b(shortVideoContext, "");
                this.f147741e = shortVideoContext.f124757b.k();
                com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
                Activity t2 = t();
                h.f.b.l.b(t2, "");
                ((IVideoRecordPreferences) aVar.a(t2, IVideoRecordPreferences.class)).setShouldShowCountDownNewTag(false);
                com.ss.android.ugc.aweme.shortvideo.d a3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(shortVideoContext.aw);
                c cVar2 = new c(this);
                f fVar = new f(new CountdownState(shortVideoContext.f124757b.y, shortVideoContext.f124761f, shortVideoContext.f124757b.h(), shortVideoContext.f124757b.g(), (long) shortVideoContext.f124764i, shortVideoContext.f124757b.k(), a3));
                fVar.f125187b = this.f147746j;
                fVar.f125188c = cVar2;
                fVar.x = this.f147745i;
                h.f.b.l.d(this, "");
                h.f.b.l.d("count_down", "");
                a(R.id.diw, fVar, "count_down");
                this.f147743g.a(true);
            }

            @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
            public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return a(layoutInflater, viewGroup);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
                h.f.b.l.d(vm1, "");
                h.f.b.l.d(bVar, "");
                return (R) b.a.a(this, vm1, bVar);
            }

            @Override // com.bytedance.scene.group.b
            public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                h.f.b.l.d(layoutInflater, "");
                h.f.b.l.d(viewGroup, "");
                View a2 = com.a.a(layoutInflater, R.layout.bis, viewGroup, false);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) a2;
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                return b.a.a(this, jediViewModel, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.b
            public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.a(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.b
            public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.b(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.b
            public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.c(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(qVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(kVar3, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(rVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(kVar3, "");
                h.f.b.l.d(kVar4, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(sVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            }
        }
