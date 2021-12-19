package com.ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.types.game.m;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.z;

public final class LegacyGameStickerHandler extends b implements au, f {

    /* renamed from: a  reason: collision with root package name */
    private final h<m> f135316a;

    /* renamed from: b  reason: collision with root package name */
    private final a<z> f135317b;

    static {
        Covode.recordClassIndex(88412);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f135316a.isInitialized()) {
            this.f135316a.getValue().d();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.f
    public final boolean b() {
        if (!this.f135316a.isInitialized() || !this.f135316a.getValue().c()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return c.d(aVar.f135378a);
    }

    public /* synthetic */ LegacyGameStickerHandler(androidx.lifecycle.m mVar, h hVar) {
        this(mVar, hVar, AnonymousClass1.f135318a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f135317b.invoke();
        this.f135316a.getValue().a(aVar.f135378a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.types.game.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyGameStickerHandler(androidx.lifecycle.m mVar, h<? extends m> hVar, a<z> aVar) {
        l.d(mVar, "");
        l.d(hVar, "");
        l.d(aVar, "");
        this.f135316a = hVar;
        this.f135317b = aVar;
        mVar.getLifecycle().a(this);
    }
}
