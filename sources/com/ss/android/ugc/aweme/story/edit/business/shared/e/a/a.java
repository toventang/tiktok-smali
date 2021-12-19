package com.ss.android.ugc.aweme.story.edit.business.shared.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.infoSticker.g;
import com.ss.android.ugc.aweme.story.edit.b.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class a extends com.bytedance.ui_component.b<EditStickerPanelViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137342a = {new y(a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/story/edit/preview/StoryEditPreviewApi;", 0), new y(a.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private final h f137343b = h.i.a((h.f.a.a) new c(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<EditStickerPanelViewModel> f137344c = new d(this);

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f137345d = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f137346e = new C3603a(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f137347f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f137348k;

    /* renamed from: l  reason: collision with root package name */
    private final int f137349l = R.id.c9b;

    static {
        Covode.recordClassIndex(89824);
    }

    public final b a() {
        return (b) this.f137343b.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.core.a f() {
        return (com.ss.android.ugc.gamora.editor.sticker.core.a) this.f137346e.a(this, f137342a[1]);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditStickerPanelViewModel> b() {
        return this.f137344c;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137348k;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137347f;
    }

    static final class c extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(this.this$0.getDiContainer());
        }
    }

    static final class d extends m implements h.f.a.a<EditStickerPanelViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerPanelViewModel invoke() {
            return new EditStickerPanelViewModel(this.this$0.a());
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (!this.f137348k.f(a())) {
            this.f137348k.a(this.f137349l, a(), "EditStickerPanelScene");
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        ((e) this.f137345d.a(this, f137342a[0])).e().observe(this, new b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a$a  reason: collision with other inner class name */
    public static final class C3603a implements h.h.d<Object, com.ss.android.ugc.gamora.editor.sticker.core.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f137350a;

        static {
            Covode.recordClassIndex(89825);
        }

        public C3603a(com.bytedance.o.a aVar) {
            this.f137350a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a a(java.lang.Object r3, h.k.i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                h.f.b.l.d(r4, r0)
                com.bytedance.o.a r0 = r2.f137350a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.ss.android.ugc.aweme.story.edit.business.a.a.a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                java.lang.Object r0 = r1.a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a.C3603a.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137351a;

        static {
            Covode.recordClassIndex(89826);
        }

        b(a aVar) {
            this.f137351a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ((EditStickerPanelViewModel) this.f137351a.getApiComponent()).a();
            ((EditStickerPanelViewModel) this.f137351a.getApiComponent()).a(new g(this) {
                /* class com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f137352a;

                static {
                    Covode.recordClassIndex(89827);
                }

                @Override // com.ss.android.ugc.aweme.infoSticker.g
                public final void L() {
                    com.ss.android.ugc.gamora.editor.sticker.core.a f2 = this.f137352a.f137351a.f();
                    if (f2 != null) {
                        f2.c();
                    }
                }

                @Override // com.ss.android.ugc.aweme.infoSticker.g
                public final void M() {
                    com.ss.android.ugc.gamora.editor.sticker.core.a f2 = this.f137352a.f137351a.f();
                    if (f2 != null) {
                        f2.e();
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f137352a = r1;
                }

                @Override // com.ss.android.ugc.aweme.infoSticker.g
                public final void a(Effect effect, String str) {
                    l.d(effect, "");
                    com.ss.android.ugc.gamora.editor.sticker.core.a f2 = this.f137352a.f137351a.f();
                    if (f2 != null) {
                        f2.a(effect, str);
                    }
                }
            });
        }
    }

    public a(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137347f = fVar;
        this.f137348k = bVar;
    }
}
