package com.ss.android.ugc.aweme.ftc.components.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends com.bytedance.ui_component.b<MultiEditViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f97548a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97549b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f97550c = i.a((h.f.a.a) C2350a.f97554a);

    /* renamed from: d  reason: collision with root package name */
    private final h f97551d = i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<MultiEditViewModel> f97552e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f97553f;

    static {
        Covode.recordClassIndex(62007);
    }

    private final b f() {
        return (b) this.f97551d.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f a() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f) this.f97550c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<MultiEditViewModel> b() {
        return this.f97552e;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97548a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97553f;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a.a$a  reason: collision with other inner class name */
    static final class C2350a extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2350a f97554a = new C2350a();

        static {
            Covode.recordClassIndex(62008);
        }

        C2350a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f();
        }
    }

    static final class c extends m implements h.f.a.a<MultiEditViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiEditViewModel invoke() {
            return new MultiEditViewModel(this.this$0.a());
        }
    }

    static final class b extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            b bVar = new b(this.this$0.getDiContainer(), this.this$0.a());
            this.this$0.f97548a.a(this.this$0.f97549b, bVar, "FTCMultiEditVideoScene");
            return bVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f97548a.e(f());
        b f2 = f();
        g value = f2.E().C().getValue();
        if (f2.f97579c == null) {
            f2.f97579c = value;
            f2.f97580d.a(f2.f97579c);
        }
        VideoPublishEditModel F = f2.F();
        if (!(F == null || F.getCurMultiEditVideoRecordData() == null || k.a(F.getCurMultiEditVideoRecordData().segmentDataList))) {
            F.copyMultiEditMusicInfo();
            f2.f97580d.a(F);
        }
        f2.f97580d.b();
    }

    public a(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97553f = fVar;
        this.f97548a = bVar;
    }
}
