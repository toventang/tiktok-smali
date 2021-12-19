package com.ss.android.ugc.gamora.editor.subtitle;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.property.ag;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.subtitle.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    d.b A;
    public boolean B;
    public final com.ss.android.ugc.aweme.shortvideo.preview.a C;
    private com.ss.android.ugc.aweme.sticker.data.d D;
    private final h E = i.a((h.f.a.a) new c(this));

    /* renamed from: a  reason: collision with root package name */
    public d f146937a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.data.c f146938b;

    /* renamed from: c  reason: collision with root package name */
    public VideoPublishEditModel f146939c;

    static {
        Covode.recordClassIndex(96769);
    }

    private final c.AnonymousClass1 r() {
        return (c.AnonymousClass1) this.E.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$a  reason: collision with other inner class name */
    public final class C3941a extends c.a {
        static {
            Covode.recordClassIndex(96770);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$a$a  reason: collision with other inner class name */
        static final class RunnableC3942a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3941a f146941a;

            static {
                Covode.recordClassIndex(96771);
            }

            RunnableC3942a(C3941a aVar) {
                this.f146941a = aVar;
            }

            public final void run() {
                a.this.j();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C3941a() {
            super();
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.a
        public final boolean b(MotionEvent motionEvent) {
            a.this.v = false;
            if (!a.this.f127186e) {
                return false;
            }
            for (g gVar : a.this.f127194m) {
                if (gVar != null && gVar.a(motionEvent)) {
                    a.this.B = true;
                    if (a.this.g()) {
                        a.this.f127193l.post(new RunnableC3942a(this));
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.a
        public final boolean f(MotionEvent motionEvent) {
            if (!a.this.f127186e) {
                return false;
            }
            for (g gVar : a.this.f127194m) {
                if (gVar != null && gVar.b(motionEvent)) {
                    a.this.B = false;
                    a.this.q();
                    a.this.m();
                    return true;
                }
            }
            if (a.this.f127187f != null) {
                a.this.f127187f.b();
            }
            if (a.this.t != null && (a.this.t instanceof e) && !a.this.g()) {
                a.this.C.a(true, true, true);
            }
            return false;
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new g.b(this) {
                /* class com.ss.android.ugc.gamora.editor.subtitle.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f146943a;

                static {
                    Covode.recordClassIndex(96774);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f146943a = r1;
                }

                @Override // com.ss.android.ugc.asve.editor.g.b
                public final void a(int i2) {
                    d dVar;
                    String str;
                    if ((!ag.a() || !this.f146943a.this$0.B) && (dVar = this.f146943a.this$0.f146937a) != null) {
                        com.ss.android.ugc.aweme.sticker.data.c cVar = this.f146943a.this$0.f146938b;
                        if (cVar != null) {
                            str = cVar.a(this.f146943a.this$0.f127191j.k());
                        } else {
                            str = null;
                        }
                        dVar.setCaption(str);
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final c.a h() {
        return new C3941a();
    }

    public final void q() {
        String str;
        d dVar = this.f146937a;
        if (dVar != null) {
            com.ss.android.ugc.aweme.sticker.data.c cVar = this.f146938b;
            if (cVar != null) {
                str = cVar.a(this.f127191j.k());
            } else {
                str = null;
            }
            dVar.setCaption(str);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.interact.view.e f146942a;

        static {
            Covode.recordClassIndex(96772);
        }

        b(com.ss.android.ugc.aweme.editSticker.interact.view.e eVar) {
            this.f146942a = eVar;
        }

        public final void run() {
            this.f146942a.a((float) d.s, (float) dh.b(this.f146942a.getContentView().getContext()), (float) (com.ss.android.ugc.aweme.sticker.view.a.a(this.f146942a.getContentView().getContext()) - com.ss.android.ugc.aweme.sticker.view.a.getTbMargin()));
        }
    }

    public final void a(int i2) {
        d dVar = this.f146937a;
        if (dVar != null) {
            dVar.setCaptionLocation(i2);
        }
    }

    public a(com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(aVar, "");
        this.C = aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.view.e eVar) {
        if (eVar != null) {
            eVar.getContentView().post(new b(eVar));
            eVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final com.ss.android.ugc.aweme.editSticker.interact.view.g a(Context context) {
        if (context == null) {
            l.b();
        }
        d dVar = new d(context, (byte) 0);
        dVar.setLockMode(true);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dVar.setOnCaptionStickerListener(this.A);
        dVar.setPublishEditModel(this.f146939c);
        this.f146937a = dVar;
        return dVar;
    }

    public final void a(List<com.ss.android.ugc.aweme.sticker.data.h> list) {
        if (com.ss.android.ugc.tools.utils.d.a(list)) {
            this.D = null;
            this.f127191j.b(r());
            this.f146938b = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            l.b();
        }
        arrayList.addAll(list);
        com.ss.android.ugc.aweme.sticker.data.d dVar = this.D;
        if (dVar == null) {
            this.D = new com.ss.android.ugc.aweme.sticker.data.d(null, arrayList, 0, null, null, 0, 61, null);
        } else {
            dVar.setUtterances(arrayList);
        }
        a(false);
        this.f146938b = new com.ss.android.ugc.aweme.sticker.data.c(arrayList);
        this.f127191j.a(r());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c, com.ss.android.ugc.aweme.editSticker.interact.d
    public final boolean a(RectF rectF) {
        List<com.ss.android.ugc.aweme.sticker.data.h> list;
        l.d(rectF, "");
        com.ss.android.ugc.aweme.sticker.data.d dVar = this.D;
        if (dVar != null) {
            list = dVar.getUtterances();
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        super.a(gVar, aVar);
    }
}
