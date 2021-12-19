package com.ss.android.ugc.gamora.recorder.d;

import com.bytedance.als.j;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.e;
import com.ss.android.ugc.gamora.recorder.l.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;

public final class c extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f147671a = {new y(c.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f147672b = this;

    /* renamed from: c  reason: collision with root package name */
    public boolean f147673c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.group.b f147674d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.h.a f147675e = ((com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null));

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f147676f = com.bytedance.o.b.a.a(getDiContainer(), f.class);

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.sticker.c.j f147677g = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) getDiContainer().a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null));

    /* renamed from: h  reason: collision with root package name */
    private final ShortVideoContext f147678h = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.als.d<Boolean> f147679i = new com.bytedance.als.d<>(true);

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f147680j;

    static {
        Covode.recordClassIndex(97339);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147672b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f147680j;
    }

    @Override // com.bytedance.als.j
    public final void onPause() {
        super.onPause();
        d dVar = (d) this.f147674d.a("RecordCommerceTagScene");
        if (dVar != null) {
            FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
            l.b(faceStickerBean, "");
            dVar.f147686a = faceStickerBean.getStickerId();
        }
    }

    public final void a() {
        FaceStickerBean i2 = this.f147677g.i();
        if (i2 != null && b.a(i2)) {
            ((f) this.f147676f.a(this, f147671a[0])).b(false);
        }
        b();
    }

    public final void b() {
        boolean z;
        FaceStickerBean i2 = this.f147677g.i();
        if (i2 != null) {
            z = b.a(i2);
        } else {
            z = false;
        }
        if (this.f147673c && z) {
            T value = this.f147679i.f6468a.getValue();
            l.b(value, "");
            if (value.booleanValue()) {
                d dVar = (d) this.f147674d.a("RecordCommerceTagScene");
                if (dVar != null && dVar.a(new e(this.f147677g.i(), this.f147678h.r))) {
                    cr a2 = cr.a();
                    l.b(a2, "");
                    a2.f125303i = true;
                    cr a3 = cr.a();
                    l.b(a3, "");
                    a3.f125304j = true;
                    return;
                }
                return;
            }
        }
        com.bytedance.scene.ktx.a.b(this.f147674d, "RecordCommerceTagScene");
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        com.bytedance.scene.ktx.a.a(this.f147674d, R.id.dj5, new d(this.f147675e.c()), "RecordCommerceTagScene");
        this.f147679i.a(this, new a(this));
        this.f147675e.a().a(this, new b(this));
        this.f147677g.f().a(this, new C3971c(this));
        this.f147677g.d().a(this, new d(this));
    }

    static final class a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147681a;

        static {
            Covode.recordClassIndex(97340);
        }

        a(c cVar) {
            this.f147681a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147681a.b();
        }
    }

    static final class d<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147684a;

        static {
            Covode.recordClassIndex(97343);
        }

        d(c cVar) {
            this.f147684a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147684a.a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$c  reason: collision with other inner class name */
    static final class C3971c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147683a;

        static {
            Covode.recordClassIndex(97342);
        }

        C3971c(c cVar) {
            this.f147683a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.c) obj;
            c cVar2 = this.f147683a;
            if (cVar != null) {
                cVar.a();
            }
            cVar2.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.d.a
    public final void a(boolean z) {
        this.f147679i.b(Boolean.valueOf(z));
    }

    static final class b<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147682a;

        static {
            Covode.recordClassIndex(97341);
        }

        b(c cVar) {
            this.f147682a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            c cVar = this.f147682a;
            l.b(bool, "");
            cVar.f147673c = bool.booleanValue();
            this.f147682a.b();
        }
    }

    public c(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f147674d = bVar;
        this.f147680j = fVar;
    }
}
