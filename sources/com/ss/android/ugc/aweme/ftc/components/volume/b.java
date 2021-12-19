package com.ss.android.ugc.aweme.ftc.components.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<FTCEditVolumeViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f98298a;

    /* renamed from: b  reason: collision with root package name */
    public final int f98299b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f98300c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<FTCEditVolumeViewModel> f98301d = C2376b.f98303a;

    /* renamed from: e  reason: collision with root package name */
    private final f f98302e;

    static {
        Covode.recordClassIndex(62518);
    }

    private final c a() {
        return (c) this.f98300c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditVolumeViewModel> b() {
        return this.f98301d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f98298a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f98302e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.b$b  reason: collision with other inner class name */
    static final class C2376b extends m implements h.f.a.a<FTCEditVolumeViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2376b f98303a = new C2376b();

        static {
            Covode.recordClassIndex(62520);
        }

        C2376b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditVolumeViewModel invoke() {
            return new FTCEditVolumeViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62519);
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
            this.this$0.f98298a.a(this.this$0.f98299b, cVar, "FTCEditVolumeScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f98298a.e(a());
        a().a(true);
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f98302e = fVar;
        this.f98298a = bVar;
    }
}
