package com.ss.android.ugc.gamora.recorder.sticker.a;

import android.util.Pair;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.g;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.sticker.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.ss.android.ugc.tools.utils.p;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public final class a extends j<e> implements com.bytedance.o.a, e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148289a = {new y(a.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final e f148290b = this;

    /* renamed from: c  reason: collision with root package name */
    public final k<com.ss.android.ugc.aweme.sticker.d> f148291c = new k<>();

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.e f148292d = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    public final ShortVideoContext f148293e = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f148294f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);

    /* renamed from: g  reason: collision with root package name */
    private m f148295g;

    /* renamed from: h  reason: collision with root package name */
    private m f148296h;

    /* renamed from: i  reason: collision with root package name */
    private final h f148297i = h.i.a((h.f.a.a) new C3999a(this));

    /* renamed from: j  reason: collision with root package name */
    private final f.a.b.a f148298j = new f.a.b.a();

    /* renamed from: k  reason: collision with root package name */
    private final f f148299k;

    static {
        Covode.recordClassIndex(97729);
    }

    private final com.ss.android.ugc.aweme.sticker.types.game.a.a d() {
        return (com.ss.android.ugc.aweme.sticker.types.game.a.a) this.f148297i.getValue();
    }

    public final com.bytedance.creativex.recorder.sticker.a.a c() {
        return (com.bytedance.creativex.recorder.sticker.a.a) this.f148294f.a(this, f148289a[0]);
    }

    @Override // com.ss.android.ugc.aweme.sticker.e
    public final /* bridge */ /* synthetic */ g a() {
        return this.f148291c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ e getApiComponent() {
        return this.f148290b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148299k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.e
    public final boolean b() {
        View findViewById = this.f148292d.findViewById(R.id.c5v);
        if (findViewById == null || findViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        this.f148298j.a();
        m mVar = this.f148295g;
        if (mVar != null) {
            c().b(mVar);
        }
        m mVar2 = this.f148296h;
        if (mVar2 != null) {
            c().b(mVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a$a  reason: collision with other inner class name */
    static final class C3999a extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(97730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3999a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c(this.this$0.f148292d, (com.bytedance.creativex.recorder.b.a.d) this.this$0.getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null), (com.bytedance.creativex.recorder.a.a.a) this.this$0.getDiContainer().a(com.bytedance.creativex.recorder.a.a.a.class, (String) null), (com.bytedance.creativex.recorder.filter.a.a) this.this$0.getDiContainer().b(com.bytedance.creativex.recorder.filter.a.a.class, null), this.this$0.c(), this.this$0.f148293e, this.this$0.f148291c);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        ac a2 = ae.a(this.f148292d, (ad.b) null).a(GameResultViewModel.class);
        l.b(a2, "");
        f.a.b.b a3 = c().g().a(new b((GameResultViewModel) a2), p.f150012a);
        l.b(a3, "");
        f.a.j.a.a(a3, this.f148298j);
        q.a a4 = c().t().c().g().a();
        a4.a(c.f148301a);
        ShortVideoContext shortVideoContext = this.f148293e;
        if (shortVideoContext.f124757b.c() || CommentUtils.isDataValid(shortVideoContext.f124767l) || shortVideoContext.c()) {
            a4.a(new com.ss.android.ugc.aweme.sticker.repository.d.a.f());
        }
        if (shortVideoContext.f124757b.c() || shortVideoContext.f124757b.b() || CommentUtils.isDataValid(shortVideoContext.f124767l) || shortVideoContext.f124757b.f124714i || shortVideoContext.c()) {
            a4.a(new com.ss.android.ugc.aweme.sticker.repository.d.a.e());
        }
        a4.a();
        com.ss.android.ugc.aweme.sticker.d.d u = c().u();
        u.a(new com.ss.android.ugc.aweme.sticker.d.a.c(this.f148292d, c().d(), this.f148293e, new d(u)));
        b bVar = (b) getDiContainer().b(b.class, null);
        if (bVar == null) {
            bVar = new com.ss.android.ugc.gamora.recorder.sticker.c.a.b(getDiContainer());
        }
        this.f148295g = bVar.a(c(), d());
        this.f148296h = bVar.b(c(), d());
        m mVar = this.f148295g;
        if (mVar != null) {
            c().a(mVar);
        }
        m mVar2 = this.f148296h;
        if (mVar2 != null) {
            c().a(mVar2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.d $stickerSelectedController;

        static {
            Covode.recordClassIndex(97733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.sticker.d.d dVar) {
            super(1);
            this.$stickerSelectedController = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar) {
            com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar2 = bVar;
            l.d(bVar2, "");
            this.$stickerSelectedController.a(bVar2);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.repository.d.a.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f148301a = new c();

        static {
            Covode.recordClassIndex(97732);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar) {
            boolean z;
            l.d(aVar, "");
            if ((aVar instanceof com.ss.android.ugc.aweme.sticker.repository.d.a.f) || (aVar instanceof com.ss.android.ugc.aweme.sticker.repository.d.a.e)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GameResultViewModel f148300a;

        static {
            Covode.recordClassIndex(97731);
        }

        b(GameResultViewModel gameResultViewModel) {
            this.f148300a = gameResultViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.creativex.recorder.sticker.b.a aVar = (com.bytedance.creativex.recorder.sticker.b.a) ((h.p) obj).component2();
            int i2 = aVar.f28381a;
            int i3 = aVar.f28382b;
            if (i2 == 4099 || i2 == 49) {
                this.f148300a.a().postValue(new Pair<>(true, Integer.valueOf(i3)));
            }
            if (i2 == 4104) {
                this.f148300a.b().postValue(Integer.valueOf(i2));
            }
        }
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f148299k = fVar;
    }
}
