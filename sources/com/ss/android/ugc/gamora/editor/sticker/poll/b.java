package com.ss.android.ugc.gamora.editor.sticker.poll;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditPollStickerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f146756a = R.id.ek5;

    /* renamed from: b  reason: collision with root package name */
    public final PollingStickerLayout f146757b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146758c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditPollStickerViewModel> f146759d;

    /* renamed from: e  reason: collision with root package name */
    private final f f146760e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146761f;

    static {
        Covode.recordClassIndex(96645);
    }

    public final c a() {
        return (c) this.f146758c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditPollStickerViewModel> b() {
        return this.f146759d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146761f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146760e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.b$b  reason: collision with other inner class name */
    static final class C3934b extends m implements h.f.a.a<EditPollStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3934b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditPollStickerViewModel invoke() {
            return new EditPollStickerViewModel(this.this$0);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f146761f.f(a())) {
            this.f146761f.a(this.f146756a, a(), "EditPollStickerScene");
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.f146757b, this.this$0.getDiContainer());
            Object a2 = cVar.getDiContainer().a((Type) e.class, (String) null);
            l.b(a2, "");
            e eVar = (e) a2;
            l.d(eVar, "");
            cVar.d().f127187f = eVar;
            return cVar;
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar, PollingStickerLayout pollingStickerLayout) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(pollingStickerLayout, "");
        this.f146760e = fVar;
        this.f146761f = bVar;
        this.f146757b = pollingStickerLayout;
        this.f146758c = i.a((h.f.a.a) new a(this));
        this.f146759d = new C3934b(this);
    }
}
