package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class v extends com.ss.android.ugc.aweme.sticker.repository.internals.f.a {
    static {
        Covode.recordClassIndex(88945);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.j, com.ss.android.ugc.aweme.sticker.repository.internals.f.a
    public final void a(List<EffectCategoryModel> list) {
        l.d(list, "");
        n.a((List) list, (b) a.f136184a);
        super.a(list);
    }

    static final class a extends m implements b<EffectCategoryModel, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136184a = new a();

        static {
            Covode.recordClassIndex(88946);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            l.d(effectCategoryModel2, "");
            return Boolean.valueOf(c.a(effectCategoryModel2.getExtra(), "prop_tab_block_story"));
        }
    }
}
