package com.ss.android.ugc.gamora.recorder.permission;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.als.j;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.property.af;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import h.z;

public final class a extends j<com.bytedance.als.b> implements com.bytedance.als.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148173a = {new y(a.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(a.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(a.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final d f148174b = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);

    /* renamed from: c  reason: collision with root package name */
    public boolean f148175c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f148176d = af.a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f148177e;

    /* renamed from: f  reason: collision with root package name */
    private final d f148178f = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    /* renamed from: g  reason: collision with root package name */
    private final d f148179g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: h  reason: collision with root package name */
    private final h f148180h = h.i.a((h.f.a.a) new c(this));

    /* renamed from: i  reason: collision with root package name */
    private final f f148181i;

    static {
        Covode.recordClassIndex(97663);
    }

    private final PermissionStateViewModel c() {
        return (PermissionStateViewModel) this.f148180h.getValue();
    }

    public final e a() {
        return (e) this.f148178f.a(this, f148173a[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f148179g.a(this, f148173a[1]);
    }

    @Override // com.bytedance.als.j
    public final com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148181i;
    }

    static final class c extends m implements h.f.a.a<PermissionStateViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PermissionStateViewModel invoke() {
            return t.a(this.this$0.a()).a(PermissionStateViewModel.class);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        f.a.b.b unused = c().a(a(), b.f148182a, new ah(), new C3995a(this));
        f.a.b.b unused2 = c().a(a(), c.f148183a, new ah(), new b(this));
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        if (!b().b()) {
            this.f148177e = false;
            if (!this.f148176d && this.f148175c) {
                b().a(true, (PrivacyCert) null);
                this.f148175c = false;
            }
        }
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f148181i = fVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.permission.a$a  reason: collision with other inner class name */
    static final class C3995a extends m implements h.f.a.b<p, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3995a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            if (!this.this$0.b().b()) {
                this.this$0.f148177e = true;
                a aVar = this.this$0;
                if (((com.ss.android.ugc.gamora.recorder.b.b) aVar.f148174b.a(aVar, a.f148173a[2])).isCurrentTabNeedCamera() && !this.this$0.f148176d) {
                    this.this$0.b().b(true, (PrivacyCert) null);
                    this.this$0.f148175c = true;
                }
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<p, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            if (!this.this$0.b().b()) {
                if (this.this$0.f148177e) {
                    this.this$0.b().a();
                    this.this$0.f148175c = true;
                } else {
                    androidx.lifecycle.i lifecycle = this.this$0.a().getLifecycle();
                    l.b(lifecycle, "");
                    if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                        this.this$0.b().a(false, (PrivacyCert) null);
                    }
                }
            }
            return z.f158842a;
        }
    }
}
