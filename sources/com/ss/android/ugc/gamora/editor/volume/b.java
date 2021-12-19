package com.ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditVolumeViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f147314a;

    /* renamed from: b  reason: collision with root package name */
    public final int f147315b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f147316c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditVolumeViewModel> f147317d = C3950b.f147319a;

    /* renamed from: e  reason: collision with root package name */
    private final f f147318e;

    static {
        Covode.recordClassIndex(97080);
    }

    private final c a() {
        return (c) this.f147316c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditVolumeViewModel> b() {
        return this.f147317d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f147314a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f147318e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.b$b  reason: collision with other inner class name */
    static final class C3950b extends m implements h.f.a.a<EditVolumeViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3950b f147319a = new C3950b();

        static {
            Covode.recordClassIndex(97082);
        }

        C3950b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditVolumeViewModel invoke() {
            return new EditVolumeViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer());
            this.this$0.f147314a.a(this.this$0.f147315b, cVar, "EditVolumeScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f147314a.e(a());
        a().a(true);
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f147318e = fVar;
        this.f147314a = bVar;
    }
}
