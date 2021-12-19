package com.bytedance.creativex.recorder.gesture;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.filter.a.g;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.gesture.api.e;
import com.bytedance.creativex.recorder.gesture.api.h;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import h.f.b.m;
import h.i;
import h.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c extends j<com.bytedance.creativex.recorder.gesture.api.b> implements com.bytedance.creativex.recorder.gesture.api.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.gesture.api.b f28365a = this;

    /* renamed from: b  reason: collision with root package name */
    public final d f28366b = ((d) getDiContainer().a(d.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    public final g f28367c = ((g) getDiContainer().c(g.class));

    /* renamed from: d  reason: collision with root package name */
    public final Activity f28368d = ((Activity) getDiContainer().a(Activity.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.b<? super ScaleGestureDetector, p<Boolean, Boolean>> f28369e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList<h> f28370f = new CopyOnWriteArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public CopyOnWriteArraySet<com.bytedance.creativex.recorder.gesture.api.a> f28371g = new CopyOnWriteArraySet<>();

    /* renamed from: h  reason: collision with root package name */
    public PrivacyCert f28372h = com.ss.android.ugc.asve.c.b.f61946i;

    /* renamed from: i  reason: collision with root package name */
    final h.h f28373i = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    public final l<VideoRecordGestureLayout.a> f28374j = new l<>(null);

    /* renamed from: k  reason: collision with root package name */
    public final l<ScaleGestureDetector> f28375k = new l<>(null);

    /* renamed from: l  reason: collision with root package name */
    public final k<e> f28376l = new k<>();

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.scene.group.b f28377m;
    private final h.h n = i.a((h.f.a.a) new a(this));
    private final f o;
    private final int p;

    static {
        Covode.recordClassIndex(16663);
    }

    public final DefaultGesturePresenter b() {
        return (DefaultGesturePresenter) this.n.getValue();
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final /* bridge */ /* synthetic */ com.bytedance.als.h c() {
        return this.f28374j;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final /* bridge */ /* synthetic */ com.bytedance.als.h d() {
        return this.f28375k;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.creativex.recorder.gesture.api.b getApiComponent() {
        return this.f28365a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.o;
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b(this) {
                /* class com.bytedance.creativex.recorder.gesture.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f28378a;

                static {
                    Covode.recordClassIndex(16666);
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean b() {
                    return false;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean c() {
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final void d() {
                    this.f28378a.this$0.f28366b.ab();
                    this.f28378a.this$0.f28376l.a(new com.bytedance.creativex.recorder.gesture.api.g(com.bytedance.creativex.recorder.gesture.api.f.SCALE_END));
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean a() {
                    if (h.f.b.l.a((Object) this.f28378a.this$0.f28366b.n().a(), (Object) false)) {
                        return false;
                    }
                    this.f28378a.this$0.f28366b.a(false);
                    this.f28378a.this$0.f28366b.a(true, com.ss.android.ugc.asve.c.b.f61946i, "double_click");
                    return true;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f28378a = r1;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean b(float f2) {
                    this.f28378a.this$0.f28366b.a(f2);
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean a(float f2) {
                    CopyOnWriteArrayList<h> copyOnWriteArrayList = this.f28378a.this$0.f28370f;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<T> it = copyOnWriteArrayList.iterator();
                        if (it.hasNext()) {
                            it.next();
                            return true;
                        }
                    }
                    if (this.f28378a.this$0.f28367c == null) {
                        return false;
                    }
                    this.f28378a.this$0.f28367c.a(f2);
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean a(MotionEvent motionEvent) {
                    h.f.b.l.d(motionEvent, "");
                    if (!this.f28378a.this$0.a().f()) {
                        return false;
                    }
                    CopyOnWriteArraySet<com.bytedance.creativex.recorder.gesture.api.a> copyOnWriteArraySet = this.f28378a.this$0.f28371g;
                    if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
                        Iterator<T> it = copyOnWriteArraySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!(!it.next().a())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return true;
                    }
                    this.f28378a.this$0.f28366b.a(motionEvent.getX(), motionEvent.getY());
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean a(ScaleGestureDetector scaleGestureDetector) {
                    h.f.b.l.d(scaleGestureDetector, "");
                    if (!this.f28378a.this$0.a().f()) {
                        return false;
                    }
                    h.f.a.b<? super ScaleGestureDetector, p<Boolean, Boolean>> bVar = this.f28378a.this$0.f28369e;
                    if (bVar != null) {
                        p<Boolean, Boolean> invoke = bVar.invoke(scaleGestureDetector);
                        if (invoke.getFirst().booleanValue()) {
                            return invoke.getSecond().booleanValue();
                        }
                    }
                    return this.f28378a.this$0.f28366b.a(scaleGestureDetector);
                }

                @Override // com.bytedance.creativex.recorder.gesture.b
                public final boolean a(float f2, float f3) {
                    CopyOnWriteArrayList<h> copyOnWriteArrayList = this.f28378a.this$0.f28370f;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<T> it = copyOnWriteArrayList.iterator();
                        if (it.hasNext()) {
                            it.next();
                            return true;
                        }
                    }
                    if (this.f28378a.this$0.f28367c == null) {
                        return false;
                    }
                    g gVar = this.f28378a.this$0.f28367c;
                    if (gVar != null) {
                        gVar.a(f2, f3);
                    }
                    return true;
                }
            };
        }
    }

    public final ASCameraView a() {
        return this.f28366b.D();
    }

    static final class a extends m implements h.f.a.a<DefaultGesturePresenter> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(16664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DefaultGesturePresenter invoke() {
            Context applicationContext = this.this$0.f28368d.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return new DefaultGesturePresenter(applicationContext, this.this$0.f28377m, (b) this.this$0.f28373i.getValue(), null);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        View c2 = this.f28377m.c(this.p);
        h.f.b.l.b(c2, "");
        VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) c2;
        b().a(videoRecordGestureLayout);
        this.f28374j.b(videoRecordGestureLayout.getOnGestureListener());
        this.f28375k.b(videoRecordGestureLayout.getScaleGestureDetector());
        this.f28366b.A().a(this, new C0606c(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.gesture.c$c  reason: collision with other inner class name */
    static final class C0606c<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.gesture.api.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f28379a;

        static {
            Covode.recordClassIndex(16667);
        }

        C0606c(c cVar) {
            this.f28379a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.gesture.api.d dVar) {
            com.bytedance.creativex.recorder.gesture.api.d dVar2 = dVar;
            if (dVar2 != null) {
                this.f28379a.b().a(dVar2);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final com.bytedance.creativex.recorder.gesture.api.d a(int i2) {
        return b().a(i2);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final void a(com.bytedance.creativex.recorder.gesture.api.d dVar) {
        h.f.b.l.d(dVar, "");
        b().a(dVar);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final void b(h hVar) {
        h.f.b.l.d(hVar, "");
        this.f28370f.remove(hVar);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final void a(h hVar) {
        h.f.b.l.d(hVar, "");
        if (!this.f28370f.contains(hVar)) {
            this.f28370f.add(hVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final void a(boolean z) {
        b().f28338a = z;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.b
    public final void a(com.bytedance.creativex.recorder.gesture.api.d dVar, int i2) {
        h.f.b.l.d(dVar, "");
        b().a(i2, dVar);
    }

    public c(com.bytedance.scene.group.b bVar, f fVar, int i2) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f28377m = bVar;
        this.o = fVar;
        this.p = i2;
    }
}
