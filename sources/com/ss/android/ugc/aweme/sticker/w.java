package com.ss.android.ugc.aweme.sticker;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.c;
import com.ss.android.ugc.aweme.sticker.presenter.q;
import com.ss.android.ugc.aweme.sticker.repository.a.j;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.aweme.sticker.repository.a.x;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import java.util.Objects;

public final class w extends c {

    /* renamed from: a  reason: collision with root package name */
    private final d f136659a;

    static {
        Covode.recordClassIndex(89248);
    }

    static final class a extends m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136660a = new a();

        static {
            Covode.recordClassIndex(89249);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new v();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.c
    public final x a(String str, com.ss.android.ugc.tools.b.a.d dVar, t tVar, List<EffectCategoryModel> list) {
        l.d(str, "");
        l.d(dVar, "");
        l.d(tVar, "");
        l.d(list, "");
        x a2 = super.a(str, dVar, tVar, list);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.repository.DefaultStickerRepositoryFactory");
        com.ss.android.ugc.aweme.sticker.repository.a aVar = (com.ss.android.ugc.aweme.sticker.repository.a) a2;
        a aVar2 = a.f136660a;
        l.d(aVar2, "");
        aVar.f135453d = aVar2;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(d dVar, q qVar, t tVar, com.ss.android.ugc.tools.b.a.d dVar2, List<EffectCategoryModel> list) {
        super(dVar, qVar, tVar, dVar2, list);
        l.d(dVar, "");
        l.d(qVar, "");
        l.d(tVar, "");
        l.d(dVar2, "");
        l.d(list, "");
        this.f136659a = dVar;
    }
}
