package com.bytedance.creativex.recorder.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public class e extends com.bytedance.ui_component.b<RecordStickerPanelViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.sticker.a.a f28462a = ((com.bytedance.creativex.recorder.sticker.a.a) getDiContainer().a(com.bytedance.creativex.recorder.sticker.a.a.class, (String) null));

    /* renamed from: b  reason: collision with root package name */
    public final a f28463b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f28464c = ((com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    private final h f28465d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<RecordStickerPanelViewModel> f28466e;

    /* renamed from: f  reason: collision with root package name */
    private final f f28467f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f28468k;

    /* renamed from: l  reason: collision with root package name */
    private final int f28469l;

    static {
        Covode.recordClassIndex(16729);
    }

    public final b a() {
        return (b) this.f28465d.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<RecordStickerPanelViewModel> b() {
        return this.f28466e;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f28468k;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f28467f;
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        a().c();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.b<? super Boolean, Boolean> f28470a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.a<Boolean> f28471b;

        /* renamed from: c  reason: collision with root package name */
        public c f28472c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28473d;

        static {
            Covode.recordClassIndex(16730);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f28470a, aVar.f28470a) && l.a(this.f28471b, aVar.f28471b) && l.a(this.f28472c, aVar.f28472c) && this.f28473d == aVar.f28473d;
        }

        public final int hashCode() {
            h.f.a.b<? super Boolean, Boolean> bVar = this.f28470a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            h.f.a.a<Boolean> aVar = this.f28471b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            c cVar = this.f28472c;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.f28473d;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "Config(onShowHideInterceptor=" + this.f28470a + ", onBackKeyInterceptor=" + this.f28471b + ", stickerPanelSceneFactory=" + this.f28472c + ", ensureSetupOnRecordFirstFrameDone=" + this.f28473d + ")";
        }

        private a() {
            this.f28470a = null;
            this.f28471b = null;
            this.f28472c = null;
            this.f28473d = false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<RecordStickerPanelViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(16733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecordStickerPanelViewModel invoke() {
            return new RecordStickerPanelViewModel(this.this$0.f28462a, this.this$0.f28463b);
        }
    }

    static final class c extends m implements h.f.a.a<b> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(16732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            c cVar = this.this$0.f28463b.f28472c;
            if (cVar == null) {
                cVar = new a(this.this$0.getDiContainer(), (byte) 0);
            }
            return cVar.a();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        a().a(this.f28462a);
        a().b();
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.f28468k.a(this.f28469l, a().a(), "RecordStickerPanelScene");
        if (this.f28463b.f28473d) {
            this.f28464c.h().a(this, new b(this));
        } else {
            a().a(this.f28462a);
        }
    }

    static final class b<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f28474a;

        static {
            Covode.recordClassIndex(16731);
        }

        b(e eVar) {
            this.f28474a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            l.b(bool2, "");
            if (bool2.booleanValue()) {
                this.f28474a.a().a(this.f28474a.f28462a);
            }
        }
    }

    public e(f fVar, com.bytedance.scene.group.b bVar, int i2, h.f.a.b<? super a, z> bVar2) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f28467f = fVar;
        this.f28468k = bVar;
        this.f28469l = i2;
        a aVar = new a((byte) 0);
        this.f28463b = aVar;
        if (bVar2 != null) {
            bVar2.invoke(aVar);
        }
        this.f28465d = i.a((h.f.a.a) new c(this));
        this.f28466e = new d(this);
    }
}
