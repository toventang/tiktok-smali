package com.ss.android.ugc.aweme.story.edit.business.shared.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.infoSticker.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.sticker.panel.c;
import h.f.b.l;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137353a = new a((byte) 0);

    static {
        Covode.recordClassIndex(89830);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89831);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.c
    public final boolean a(EffectCategoryResponse effectCategoryResponse) {
        l.d(effectCategoryResponse, "");
        return com.ss.android.ugc.aweme.shortvideo.sticker.c.a(effectCategoryResponse.getExtra(), "info_sticker_tab_block_story");
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.c
    public final boolean a(Effect effect) {
        l.d(effect, "");
        if (com.ss.android.ugc.gamora.editor.lightening.a.a()) {
            return com.ss.android.ugc.aweme.shortvideo.sticker.c.a(effect.getExtra(), "info_sticker_block_story");
        }
        if (com.ss.android.ugc.aweme.shortvideo.sticker.c.a(effect.getExtra(), "info_sticker_block_story") || h.c(effect) || h.b(effect)) {
            return true;
        }
        return false;
    }
}
