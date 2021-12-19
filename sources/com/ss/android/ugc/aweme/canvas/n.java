package com.ss.android.ugc.aweme.canvas;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.ss.android.ugc.aweme.canvas.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.k.k;
import h.z;
import java.util.List;

public final class n extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f69724a = {new y(n.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(n.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f69725j = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public PhotoCanvasTransformFilterParam f69726b;

    /* renamed from: c  reason: collision with root package name */
    int f69727c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    CanvasVideoData f69728d;

    /* renamed from: e  reason: collision with root package name */
    public final m f69729e = new m();

    /* renamed from: f  reason: collision with root package name */
    public x f69730f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.f.a.a.f f69731g;

    /* renamed from: h  reason: collision with root package name */
    boolean f69732h;

    /* renamed from: i  reason: collision with root package name */
    public final h.f.a.a<com.bytedance.f.a.a.j> f69733i;

    /* renamed from: k  reason: collision with root package name */
    private final h f69734k = h.i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f69735l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);
    private final h.h.d t = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final com.bytedance.o.f u;

    static {
        Covode.recordClassIndex(42991);
    }

    public final com.bytedance.f.a.a.j a() {
        return (com.bytedance.f.a.a.j) this.f69734k.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a b() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f69735l.a(this, f69724a[0]);
    }

    /* access modifiers changed from: package-private */
    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.t.a(this, f69724a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42992);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
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
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.f.a.a.j> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(42993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.bytedance.f.a.a.j invoke() {
            return this.this$0.f69733i.invoke();
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f69738a;

        static {
            Covode.recordClassIndex(42998);
        }

        f(n nVar) {
            this.f69738a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final SurfaceView surfaceView = (SurfaceView) obj;
            surfaceView.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.canvas.n.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f69739a;

                static {
                    Covode.recordClassIndex(42999);
                }

                {
                    this.f69739a = r1;
                }

                public final void run() {
                    g b2 = this.f69739a.f69738a.b().d().b();
                    SurfaceView surfaceView = surfaceView;
                    l.b(surfaceView, "");
                    int width = surfaceView.getWidth();
                    SurfaceView surfaceView2 = surfaceView;
                    l.b(surfaceView2, "");
                    VESize a2 = b2.a(width, surfaceView2.getHeight());
                    m mVar = this.f69739a.f69738a.f69729e;
                    l.d(a2, "");
                    l lVar = mVar.f69711b;
                    l.d(a2, "");
                    lVar.f69706b = a2;
                    lVar.f69707c = null;
                    x xVar = this.f69739a.f69738a.f69730f;
                    if (xVar != null) {
                        l.d(a2, "");
                        xVar.f69759b = a2;
                    }
                    StringBuilder sb = new StringBuilder("surface layout size ");
                    SurfaceView surfaceView3 = surfaceView;
                    l.b(surfaceView3, "");
                    StringBuilder append = sb.append(surfaceView3.getWidth()).append(',');
                    SurfaceView surfaceView4 = surfaceView;
                    l.b(surfaceView4, "");
                    l.d(append.append(surfaceView4.getHeight()).append(", veSize:").append(a2).toString(), "");
                }
            });
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class d extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(42996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.u<Boolean, Boolean, Boolean> value = this.this$0.b().F().getValue();
            if (value == null || value.getFirst().booleanValue() != booleanValue) {
                this.this$0.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) booleanValue, false, booleanValue);
            }
            return z.f158842a;
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f69737a;

        static {
            Covode.recordClassIndex(42997);
        }

        e(n nVar) {
            this.f69737a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) ((h.u) obj).getFirst()).booleanValue()) {
                x xVar = this.f69737a.f69730f;
                if (xVar != null) {
                    xVar.f69758a = true;
                    l.d("enableGesture", "");
                    return;
                }
                return;
            }
            x xVar2 = this.f69737a.f69730f;
            if (xVar2 != null) {
                l.d("disableGesture", "");
                if (!xVar2.f69760c) {
                    xVar2.f69758a = false;
                    xVar2.c();
                }
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f69736a;

        static {
            Covode.recordClassIndex(42994);
        }

        c(n nVar) {
            this.f69736a = nVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam;
            List<PhotoCanvasTransformFilterParam> transformInfo;
            String str;
            final VEVideoTransformFilterParam vEVideoTransformFilterParam = (VEVideoTransformFilterParam) obj;
            n nVar = this.f69736a;
            int i2 = 1;
            if (!nVar.f69732h) {
                nVar.f69732h = true;
                l.d("mob zoom", "");
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", nVar.d().mShootWay).a("enter_from", "video_edit_page").a("creation_id", nVar.d().creationId);
                if (nVar.d().isUploadVideo()) {
                    str = "upload";
                } else {
                    str = "shoot";
                }
                r.a("zoom_photo", a2.a("content_source", str).a("content_type", "photo_canvas").f149193a);
            }
            n nVar2 = this.f69736a;
            AnonymousClass1 r3 = new h.f.a.b<Integer, z>(this) {
                /* class com.ss.android.ugc.aweme.canvas.n.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(42995);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Integer num) {
                    int i2;
                    int intValue = num.intValue();
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = this.this$0.f69736a.f69726b;
                    if (photoCanvasTransformFilterParam != null) {
                        VEVideoTransformFilterParam vEVideoTransformFilterParam = vEVideoTransformFilterParam;
                        l.d(photoCanvasTransformFilterParam, "");
                        if (vEVideoTransformFilterParam != null) {
                            photoCanvasTransformFilterParam.setDegree(vEVideoTransformFilterParam.degree);
                            photoCanvasTransformFilterParam.setTransX(vEVideoTransformFilterParam.transX);
                            photoCanvasTransformFilterParam.setTransY(vEVideoTransformFilterParam.transY);
                            photoCanvasTransformFilterParam.setScaleFactor(vEVideoTransformFilterParam.scaleFactor);
                        }
                    }
                    com.ss.android.ugc.aweme.shortvideo.preview.a b2 = this.this$0.f69736a.b();
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam2 = this.this$0.f69736a.f69726b;
                    if (photoCanvasTransformFilterParam2 != null) {
                        i2 = photoCanvasTransformFilterParam2.getClipIndex();
                    } else {
                        i2 = 0;
                    }
                    VEVideoTransformFilterParam vEVideoTransformFilterParam2 = vEVideoTransformFilterParam;
                    l.b(vEVideoTransformFilterParam2, "");
                    b2.a(i2, intValue, vEVideoTransformFilterParam2);
                    return z.f158842a;
                }
            };
            if (nVar2.f69726b != null) {
                if (nVar2.f69727c < 0) {
                    CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(nVar2.f42913m);
                    if (canvasVideoEditorTrackViewModel != null) {
                        i2 = canvasVideoEditorTrackViewModel.filterIndex;
                    }
                    nVar2.f69727c = i2;
                }
                r3.invoke(Integer.valueOf(nVar2.f69727c));
                return;
            }
            CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel2 = CanvasVideoEditorTrackViewModel.Companion.get(nVar2.f42913m);
            if (canvasVideoEditorTrackViewModel2 != null && canvasVideoEditorTrackViewModel2.isFilterIndexValid()) {
                nVar2.f69727c = canvasVideoEditorTrackViewModel2.filterIndex;
                CanvasVideoData canvasVideoData = nVar2.f69728d;
                if (canvasVideoData == null || (transformInfo = canvasVideoData.getTransformInfo()) == null) {
                    photoCanvasTransformFilterParam = null;
                } else {
                    photoCanvasTransformFilterParam = (PhotoCanvasTransformFilterParam) h.a.n.h((List) transformInfo);
                }
                nVar2.f69726b = photoCanvasTransformFilterParam;
                if (nVar2.f69726b == null) {
                    PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam2 = new PhotoCanvasTransformFilterParam();
                    photoCanvasTransformFilterParam2.setClipIndex(0);
                    nVar2.f69726b = photoCanvasTransformFilterParam2;
                    CanvasVideoData canvasVideoData2 = nVar2.f69728d;
                    if (canvasVideoData2 != null) {
                        PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam3 = nVar2.f69726b;
                        if (photoCanvasTransformFilterParam3 == null) {
                            l.b();
                        }
                        canvasVideoData2.putTransform(photoCanvasTransformFilterParam3);
                    }
                }
                r3.invoke(Integer.valueOf(canvasVideoEditorTrackViewModel2.filterIndex));
            }
        }
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
        View a2 = com.a.a(layoutInflater, R.layout.b2o, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(com.bytedance.o.f fVar, h.f.a.a<? extends com.bytedance.f.a.a.j> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        this.u = fVar;
        this.f69733i = aVar;
    }

    public final void a(String str, CanvasVideoData canvasVideoData) {
        PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam;
        List<PhotoCanvasTransformFilterParam> transformInfo;
        l.d(str, "");
        com.bytedance.f.a.a.j a2 = a();
        if (a2 != null) {
            com.bytedance.f.a.a.f fVar = this.f69731g;
            if (fVar == null) {
                l.a("gestureInteractItem");
            }
            a2.a(fVar);
        }
        m mVar = this.f69729e;
        l.d(str, "");
        l lVar = mVar.f69711b;
        l.d(str, "");
        lVar.f69705a = str;
        mVar.f69712c = str;
        this.f69728d = canvasVideoData;
        if (canvasVideoData == null || (transformInfo = canvasVideoData.getTransformInfo()) == null) {
            photoCanvasTransformFilterParam = null;
        } else {
            photoCanvasTransformFilterParam = (PhotoCanvasTransformFilterParam) h.a.n.h((List) transformInfo);
        }
        this.f69726b = photoCanvasTransformFilterParam;
        x xVar = this.f69730f;
        if (xVar != null) {
            xVar.f69766i = this.f69728d;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        MethodCollector.i(1843);
        l.d(view, "");
        super.a(view, bundle);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) b(R.id.buu);
        View b2 = b(R.id.d4j);
        androidx.fragment.app.e a2 = com.bytedance.scene.ktx.c.a(this);
        if (a2 == null) {
            l.b();
        }
        CanvasGestureGuideWidget canvasGestureGuideWidget = new CanvasGestureGuideWidget(a2, simpleDraweeView, b2);
        canvasGestureGuideWidget.a().observe(canvasGestureGuideWidget.f69687b, new CanvasGestureGuideWidget.a(canvasGestureGuideWidget));
        View view2 = canvasGestureGuideWidget.f69689d;
        if (view2 != null) {
            view2.setOnTouchListener(new CanvasGestureGuideWidget.b(canvasGestureGuideWidget));
        }
        canvasGestureGuideWidget.f69687b.getLifecycle().a(new CanvasGestureGuideWidget.CanvasGestureGuideObserver());
        m mVar = this.f69729e;
        m lifecycleOwner = getLifecycleOwner();
        c cVar = new c(this);
        l.d(lifecycleOwner, "");
        l.d(cVar, "");
        mVar.f69711b.f69708d.observe(lifecycleOwner, cVar);
        x xVar = new x(this.f69729e, new d(this));
        xVar.f69763f = true;
        this.f69730f = xVar;
        x xVar2 = this.f69730f;
        if (xVar2 == null) {
            l.b();
        }
        this.f69731g = new com.bytedance.f.a.a.f(0, xVar2);
        b().F().observe(getLifecycleOwner(), new e(this));
        FrameLayout frameLayout = (FrameLayout) b(R.id.b58);
        if (frameLayout != null) {
            com.ss.android.ugc.aweme.editSticker.interact.view.a aVar = com.ss.android.ugc.aweme.editSticker.d.c().f88097d;
            if (aVar == null) {
                l.b();
            }
            Activity t2 = t();
            l.b(t2, "");
            com.ss.android.ugc.aweme.editSticker.interact.view.e a3 = aVar.a(t2, 0);
            frameLayout.addView(a3.getContentView());
            m mVar2 = this.f69729e;
            l.d(a3, "");
            View contentView = a3.getContentView();
            contentView.post(new m.b(mVar2, contentView, a3));
            b().g().observe(this, new f(this));
            MethodCollector.o(1843);
            return;
        }
        MethodCollector.o(1843);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
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
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
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
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
