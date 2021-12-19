package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.a.c;
import h.f.b.m;

public final class e {
    static {
        Covode.recordClassIndex(98380);
    }

    public static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ h.f.a.a $emojiNameSupplier;
        final /* synthetic */ h.f.a.a $emojiPanelSupplier;
        final /* synthetic */ h.f.a.a $stickerNameSupplier;
        final /* synthetic */ h.f.a.a $stickerPanelSupplier;

        static {
            Covode.recordClassIndex(98381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.f.a.a aVar, h.f.a.a aVar2, h.f.a.a aVar3, h.f.a.a aVar4) {
            super(0);
            this.$stickerPanelSupplier = aVar;
            this.$stickerNameSupplier = aVar2;
            this.$emojiPanelSupplier = aVar3;
            this.$emojiNameSupplier = aVar4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new h(this.$stickerPanelSupplier, this.$stickerNameSupplier, this.$emojiPanelSupplier, this.$emojiNameSupplier);
        }
    }
}
