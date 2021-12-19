package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.f;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import h.f.b.l;
import h.i;

public final class ARStickerHandler extends b implements au {

    /* renamed from: a  reason: collision with root package name */
    public final Context f135299a;

    /* renamed from: b  reason: collision with root package name */
    public final m f135300b;

    /* renamed from: c  reason: collision with root package name */
    public final h<Boolean> f135301c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.types.ar.a f135302d;

    /* renamed from: e  reason: collision with root package name */
    public final f f135303e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f135304f = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(88406);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135302d.a(false);
    }

    static final class a extends h.f.b.m implements h.f.a.a<ARSenorPresenter> {
        final /* synthetic */ ARStickerHandler this$0;

        static {
            Covode.recordClassIndex(88407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ARStickerHandler aRStickerHandler) {
            super(0);
            this.this$0 = aRStickerHandler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ARSenorPresenter invoke() {
            boolean z;
            Boolean a2 = this.this$0.f135301c.a();
            if (a2 != null) {
                z = a2.booleanValue();
            } else {
                z = false;
            }
            return new ARSenorPresenter(this.this$0.f135299a, this.this$0.f135300b, z, this.this$0.f135302d.a(), this.this$0.f135303e.c());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return g.k(aVar.f135378a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void b(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        this.f135302d.a(true);
        this.f135302d.b();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f135303e.a((ARSenorPresenter) this.f135304f.getValue(), false);
    }

    public ARStickerHandler(Context context, m mVar, h<Boolean> hVar, com.ss.android.ugc.aweme.sticker.types.ar.a aVar, f fVar) {
        l.d(context, "");
        l.d(mVar, "");
        l.d(hVar, "");
        l.d(aVar, "");
        l.d(fVar, "");
        this.f135299a = context;
        this.f135300b = mVar;
        this.f135301c = hVar;
        this.f135302d = aVar;
        this.f135303e = fVar;
    }
}
