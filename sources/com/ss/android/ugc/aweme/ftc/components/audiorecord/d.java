package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends com.bytedance.ui_component.b<FTCEditAudioRecordViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f97711a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97712b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f97713c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<FTCEditAudioRecordViewModel> f97714d = b.f97716a;

    /* renamed from: e  reason: collision with root package name */
    private final f f97715e;

    static {
        Covode.recordClassIndex(62076);
    }

    private final e a() {
        return (e) this.f97713c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditAudioRecordViewModel> b() {
        return this.f97714d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97711a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97715e;
    }

    static final class b extends m implements h.f.a.a<FTCEditAudioRecordViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97716a = new b();

        static {
            Covode.recordClassIndex(62078);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditAudioRecordViewModel invoke() {
            return new FTCEditAudioRecordViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        a().a(true);
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        a().a(false);
    }

    static final class a extends m implements h.f.a.a<e> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            e eVar = new e(this.this$0.getDiContainer());
            this.this$0.f97711a.a(this.this$0.f97712b, eVar, "FTCEditAudioRecordScene");
            return eVar;
        }
    }

    public d(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97715e = fVar;
        this.f97711a = bVar;
    }
}
