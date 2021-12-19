package com.ss.android.ugc.aweme.story.record.e;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.als.dsl.g;
import com.bytedance.als.j;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.lang.reflect.Type;
import java.util.Objects;

public final class a extends j<com.bytedance.als.b> implements com.bytedance.als.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138233a = {new y(a.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(a.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(a.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(a.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f138234b;

    /* renamed from: c  reason: collision with root package name */
    n f138235c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f138236d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f138237e;

    /* renamed from: f  reason: collision with root package name */
    public final int f138238f = R.id.ec5;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f138239g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f138240h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f138241i;

    /* renamed from: j  reason: collision with root package name */
    private final h f138242j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f138243k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f138244l;

    static {
        Covode.recordClassIndex(90448);
    }

    public final com.bytedance.creativex.recorder.gesture.api.b a() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.f138239g.a(this, f138233a[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f138240h.a(this, f138233a[2]);
    }

    public final com.ss.android.ugc.aweme.story.record.f.a c() {
        return (com.ss.android.ugc.aweme.story.record.f.a) this.f138241i.a(this, f138233a[3]);
    }

    public final StoryRecordBaseViewModel d() {
        return (StoryRecordBaseViewModel) this.f138242j.getValue();
    }

    @Override // com.bytedance.als.j
    public final com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f138244l;
    }

    public final void e() {
        n nVar = this.f138235c;
        if (nVar != null) {
            nVar.b();
        }
        this.f138236d = false;
    }

    static final class f extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            Activity b2 = g.b(this.this$0);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = t.a((androidx.fragment.app.e) b2).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a aVar = this.this$0;
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-301").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            com.bytedance.creativex.recorder.b.a.d b2 = aVar.b();
            if (b2.b()) {
                b2.d().a("Story_MvChoosePhotoScene", build);
            } else {
                b2.b(false, build);
            }
            aVar.b().G().setVisibility(8);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a aVar = this.this$0;
            n nVar = aVar.f138235c;
            if (nVar != null) {
                nVar.b();
            }
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-302").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            com.bytedance.creativex.recorder.b.a.d b2 = aVar.b();
            if (b2.b()) {
                b2.d().b("Story_MvChoosePhotoScene", build);
            } else {
                b2.a(false, build);
            }
            Object a2 = aVar.getDiContainer().a((Type) com.bytedance.creativex.recorder.sticker.a.a.class, (String) null);
            l.b(a2, "");
            if (!com.ss.android.ugc.aweme.sticker.p.g.u(com.ss.android.ugc.aweme.sticker.f.e.a((com.ss.android.ugc.aweme.sticker.presenter.i) a2))) {
                aVar.d().a(false);
            }
            aVar.f138236d = false;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        f.a.b.b unused = d().a(this, b.f138247a, new ah(), new C3641a(this));
        com.bytedance.creativex.recorder.gesture.api.b a2 = a();
        if (a2 != null) {
            a2.a(new b(this), 0);
        }
        com.ss.android.ugc.aweme.record.b albumService = com.ss.android.ugc.aweme.port.in.g.a().l().getAlbumService();
        Activity b2 = g.b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        albumService.subscribeAlbumOpen((androidx.fragment.app.e) b2, new c(this));
        com.ss.android.ugc.aweme.record.b albumService2 = com.ss.android.ugc.aweme.port.in.g.a().l().getAlbumService();
        Activity b3 = g.b(this);
        Objects.requireNonNull(b3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        albumService2.subscribeAlbumClose((androidx.fragment.app.e) b3, new d(this));
        f.a.b.b unused2 = d().a(this, c.f138248a, new ah(), new e(this));
    }

    public static final class b extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138245a;

        static {
            Covode.recordClassIndex(90450);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f138245a = aVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            com.bytedance.creativex.recorder.gesture.api.d dVar;
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.b a2 = this.f138245a.a();
            if (a2 != null) {
                dVar = a2.a(6);
            } else {
                dVar = null;
            }
            if (dVar != null && dVar.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            if (motionEvent2.getY() < motionEvent.getY() && Math.abs(motionEvent.getY() - motionEvent2.getY()) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
                a aVar = this.f138245a;
                if (((com.bytedance.creativex.recorder.b.a.m) aVar.f138234b.a(aVar, a.f138233a[1])).d().f6468a.getValue().booleanValue() || !this.f138245a.f138237e || !com.ss.android.ugc.aweme.story.record.c.a.f138189a) {
                    return false;
                }
                this.f138245a.d().b(true);
                com.ss.android.ugc.aweme.story.record.j.c.a(this.f138245a.c(), "slide_up");
                return false;
            } else if (motionEvent2.getX() >= motionEvent.getX() || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY()) || !this.f138245a.f138237e) {
                return false;
            } else {
                this.f138245a.d().c(StoryRecordBaseViewModel.e.f138153a);
                return false;
            }
        }
    }

    static final class e extends m implements h.f.a.b<k, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            this.this$0.f138237e = !kVar2.f39404b.booleanValue();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e.a$a  reason: collision with other inner class name */
    static final class C3641a extends m implements h.f.a.b<k, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3641a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            if (!kVar2.f39404b.booleanValue()) {
                this.this$0.e();
            } else if (!this.this$0.f138236d) {
                a aVar = this.this$0;
                aVar.d().a(true);
                com.ss.android.ugc.aweme.record.b albumService = com.ss.android.ugc.aweme.port.in.g.a().l().getAlbumService();
                ShortVideoContext e2 = aVar.c().e();
                Activity b2 = g.b(aVar);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                int i2 = aVar.f138238f;
                Object a2 = aVar.getDiContainer().a(com.ss.android.ugc.tools.view.a.c.class);
                l.b(a2, "");
                Bundle bundle = new Bundle();
                bundle.putParcelable("key_story_edit_context", aVar.c().f());
                aVar.f138235c = albumService.openAlbum(e2, (androidx.fragment.app.e) b2, i2, (com.ss.android.ugc.tools.view.a.c) a2, bundle);
                aVar.f138236d = true;
            }
            return z.f158842a;
        }
    }

    public a(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f138243k = bVar;
        this.f138244l = fVar;
        this.f138239g = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
        this.f138234b = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.f138240h = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f138241i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.f.a.class);
        this.f138242j = h.i.a((h.f.a.a) new f(this));
        this.f138237e = true;
    }
}
