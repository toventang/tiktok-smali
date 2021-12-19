package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.r;
import h.z;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import org.json.JSONObject;

public final class e extends com.bytedance.scene.group.f implements c {

    /* renamed from: f  reason: collision with root package name */
    public b f129372f;

    /* renamed from: g  reason: collision with root package name */
    public MvImageChooseAdapter.MyMediaModel f129373g;

    /* renamed from: h  reason: collision with root package name */
    public View f129374h;

    /* renamed from: i  reason: collision with root package name */
    private int f129375i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f129376j = i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f129377k = i.a((h.f.a.a) new a(this));

    /* renamed from: l  reason: collision with root package name */
    private bz f129378l;

    static {
        Covode.recordClassIndex(84920);
    }

    /* access modifiers changed from: package-private */
    public final SimpleDraweeView E() {
        return (SimpleDraweeView) this.f129376j.getValue();
    }

    public final ImageView F() {
        return (ImageView) this.f129377k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void b() {
    }

    public static final class d extends j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f129379b;

        static {
            Covode.recordClassIndex(84924);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j
        public final View c() {
            return this.f129379b;
        }

        d(View view) {
            this.f129379b = view;
        }
    }

    public static final class f extends j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f129381b;

        static {
            Covode.recordClassIndex(84926);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j
        public final View c() {
            return this.f129381b;
        }

        f(View view) {
            this.f129381b = view;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void d() {
        G();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$e  reason: collision with other inner class name */
    public static final class C3369e implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129380a;

        static {
            Covode.recordClassIndex(84925);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void b() {
            this.f129380a.G();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f
        public final void c() {
            b bVar = this.f129380a.f129372f;
            if (bVar != null) {
                bVar.f();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f
        public final void d() {
            b bVar = this.f129380a.f129372f;
            if (bVar != null) {
                bVar.g();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void a() {
            if (fb.b()) {
                b bVar = this.f129380a.f129372f;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            this.f129380a.G();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3369e(e eVar) {
            this.f129380a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void a(float f2) {
            b bVar = this.f129380a.f129372f;
            if (bVar != null) {
                bVar.a(f2);
            }
        }
    }

    static final class a extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View c2 = this.this$0.c(R.id.bmz);
            l.b(c2, "");
            return c2;
        }
    }

    static final class b extends m implements h.f.a.a<SimpleDraweeView> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimpleDraweeView invoke() {
            View c2 = this.this$0.c(R.id.apr);
            l.b(c2, "");
            return c2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0.f129372f;
            if (bVar != null) {
                bVar.d();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void n_() {
        super.n_();
        bz bzVar = this.f129378l;
        if (bzVar != null && (!bzVar.k())) {
            bzVar.a((CancellationException) null);
        }
    }

    public final void G() {
        View c2;
        b bVar = this.f129372f;
        if (!(bVar == null || (c2 = bVar.c()) == null)) {
            d dVar = new d(c2);
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2 = m.a(this.f129374h);
            if (a2 != null) {
                a2.a(dVar.a(), dVar.b(), new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c(), H(), new c(this));
                if (z.f158842a != null) {
                    return;
                }
            }
        }
        b bVar2 = this.f129372f;
        if (bVar2 != null) {
            bVar2.d();
        }
    }

    private static com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a H() {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a();
        aVar.f129251f = 220;
        aVar.f129252g = 220;
        aVar.f129253h = 220;
        aVar.f129254i = 220;
        aVar.a(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.b(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.c(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.d(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class g extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.this$0.f129373g;
                if (myMediaModel != null) {
                    str = myMediaModel.f109390b;
                } else {
                    str = null;
                }
                final int b2 = com.ss.android.ugc.aweme.ci.a.b(str);
                kotlinx.coroutines.android.b bVar = com.ss.android.ugc.asve.editor.d.f62009a;
                AnonymousClass1 r0 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e.g.AnonymousClass1 */
                    int label;
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(84928);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
                        public final void a(Bundle bundle) {
                            super.a(bundle);
                            this.f129374h = c(R.id.baf);
                            C3369e eVar = new C3369e(this);
                            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2 = m.a(this.f129374h);
                            if (a2 != null) {
                                a2.setGestureListener(eVar);
                            }
                            ((com.bytedance.scene.group.f) this).f42882b.getLifecycle().a(new PreviewImageScene$onActivityCreated$1(this));
                            this.f129378l = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new g(this, null), 3);
                        }

                        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
                        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                            this.f129373g = myMediaModel;
                        }

                        public final void b(boolean z) {
                            b bVar;
                            View c2;
                            if (z && (bVar = this.f129372f) != null && (c2 = bVar.c()) != null) {
                                f fVar = new f(c2);
                                com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2 = m.a(this.f129374h);
                                if (a2 != null) {
                                    a2.a(fVar.a(), fVar.b(), new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c(), H());
                                }
                            }
                        }

                        @Override // com.bytedance.scene.group.f
                        public final void a(boolean z) {
                            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2;
                            super.a(z);
                            if (!z && (a2 = m.a(this.f129374h)) != null) {
                                a2.a();
                            }
                        }

                        public static final class h extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ e f129382a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ long f129383b;

                            static {
                                Covode.recordClassIndex(84929);
                            }

                            h(e eVar, long j2) {
                                this.f129382a = eVar;
                                this.f129383b = j2;
                            }

                            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                            public final void onFailure(String str, Throwable th) {
                                super.onFailure(str, th);
                                e.a(false, 0L);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                            public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                                super.onFinalImageSet(str, fVar, animatable);
                                e.a(true, SystemClock.elapsedRealtime() - this.f129383b);
                            }
                        }

                        @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
                        public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            return a(layoutInflater, viewGroup);
                        }

                        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
                        public final void a(int i2, b bVar) {
                            l.d(bVar, "");
                            this.f129375i = i2;
                            this.f129372f = bVar;
                        }

                        public static void a(boolean z, long j2) {
                            JSONObject jSONObject = new JSONObject();
                            if (z) {
                                jSONObject.put("time_elapse", j2);
                            }
                            q.a("tool_performance_preview_image_render_time", z ? 1 : 0, jSONObject);
                        }

                        @Override // com.bytedance.scene.group.b
                        public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            int i2;
                            l.d(layoutInflater, "");
                            l.d(viewGroup, "");
                            if (fb.b()) {
                                i2 = R.layout.au3;
                            } else {
                                i2 = R.layout.au2;
                            }
                            View a2 = com.a.a(layoutInflater, i2, viewGroup, false);
                            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
                            return (ViewGroup) a2;
                        }
                    }
