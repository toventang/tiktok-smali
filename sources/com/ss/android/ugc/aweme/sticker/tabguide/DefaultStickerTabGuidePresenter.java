package com.ss.android.ugc.aweme.sticker.tabguide;

import androidx.core.g.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;

public final class DefaultStickerTabGuidePresenter implements a<e<EffectCategoryModel, Object>>, a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135721a = new a((byte) 0);

    static {
        Covode.recordClassIndex(88710);
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.e
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.e
    public final void a(d dVar) {
        l.d(dVar, "");
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88711);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
