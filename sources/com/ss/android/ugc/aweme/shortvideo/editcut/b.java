package com.ss.android.ugc.aweme.shortvideo.editcut;

import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.j;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a;
import com.ss.android.ugc.aweme.shortvideo.cut.x;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public final class b implements m, com.bytedance.o.a, r {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f128090a = {new y(b.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(b.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public g f128091b;

    /* renamed from: c  reason: collision with root package name */
    public j f128092c;

    /* renamed from: d  reason: collision with root package name */
    private final d f128093d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);

    /* renamed from: e  reason: collision with root package name */
    private final d f128094e = com.bytedance.o.b.a.a(getDiContainer(), VEVideoCutterViewModel.class);

    /* renamed from: f  reason: collision with root package name */
    private final m f128095f;

    /* renamed from: g  reason: collision with root package name */
    private final f f128096g;

    static {
        Covode.recordClassIndex(83955);
    }

    private final com.ss.android.ugc.aweme.shortvideo.preview.a e() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f128093d.a(this, f128090a[0]);
    }

    public final VEVideoCutterViewModel b() {
        return (VEVideoCutterViewModel) this.f128094e.a(this, f128090a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b$b  reason: collision with other inner class name */
    public static final class C3343b extends h.f.b.m implements h.f.a.a<VEEditorAutoStartStopArbiter> {
        final /* synthetic */ VEEditorAutoStartStopArbiter $autoStopArbiter;

        static {
            Covode.recordClassIndex(83959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3343b(VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter) {
            super(0);
            this.$autoStopArbiter = vEEditorAutoStartStopArbiter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return this.$autoStopArbiter;
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f128096g;
    }

    static final class a implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f128099a;

        static {
            Covode.recordClassIndex(83958);
        }

        a(b bVar) {
            this.f128099a = bVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            this.f128099a.b().a(a.C3285a.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.r
    public final long a() {
        j c2 = c();
        if (c2 != null) {
            return c2.a();
        }
        return 0;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f128095f.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    public final j c() {
        if (this.f128092c == null) {
            g gVar = this.f128091b;
            VEEditorAutoStartStopArbiter value = e().D().getValue();
            if (!(gVar == null || value == null)) {
                this.f128092c = new x(gVar, new C3343b(value));
            }
        }
        return this.f128092c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.r
    public final boolean d() {
        j c2 = c();
        if (c2 == null || !c2.b()) {
            b().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, true));
            return true;
        }
        b().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, true));
        return false;
    }

    public b(m mVar, f fVar) {
        l.d(mVar, "");
        l.d(fVar, "");
        this.f128095f = mVar;
        this.f128096g = fVar;
        e().C().observe(this, new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.editcut.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f128097a;

            static {
                Covode.recordClassIndex(83956);
            }

            {
                this.f128097a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                this.f128097a.f128091b = (g) obj;
            }
        });
        b().a().observe(this, new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.editcut.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f128098a;

            static {
                Covode.recordClassIndex(83957);
            }

            {
                this.f128098a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Integer valueOf;
                j c2;
                com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
                if (aVar != null && (valueOf = Integer.valueOf(aVar.f126290d)) != null) {
                    if (valueOf.intValue() == 1) {
                        j c3 = this.f128098a.c();
                        if (c3 != null) {
                            c3.a(aVar.f126291e);
                        }
                    } else if (valueOf.intValue() == 2) {
                        j c4 = this.f128098a.c();
                        if (c4 != null) {
                            c4.b(aVar.f126291e);
                        }
                    } else if (valueOf.intValue() == 3 && (c2 = this.f128098a.c()) != null) {
                        c2.a(aVar.f126288b, aVar.f126287a, aVar.f126289c);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.r
    public final void a(long j2, x.f fVar, boolean z) {
        a aVar;
        l.d(fVar, "");
        if (j2 >= 0) {
            VEVideoCutterViewModel b2 = b();
            if (fVar == x.f.EDITOR_SEEK_FLAG_OnGoing || !z) {
                aVar = null;
            } else {
                aVar = new a(this);
            }
            l.d(fVar, "");
            b2.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(j2, fVar, aVar));
            return;
        }
        b().a(a.C3285a.a());
    }
}
