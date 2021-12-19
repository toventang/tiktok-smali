package com.ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.guide.h;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.q;
import h.f.b.l;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(88375);
    }

    public static final class c extends h.f.b.m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135198a = new c();

        static {
            Covode.recordClassIndex(88378);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return g.a().G();
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f135197a;

        static {
            Covode.recordClassIndex(88377);
        }

        public b(ShortVideoContext shortVideoContext) {
            this.f135197a = shortVideoContext;
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.guide.h
        public final void a(boolean z, Effect effect, h.a aVar) {
            String str;
            String str2 = "";
            l.d(effect, str2);
            l.d(aVar, str2);
            int i2 = n.f135199a[aVar.ordinal()];
            if (i2 == 1) {
                str2 = "gif";
            } else if (i2 == 2) {
                str2 = "lottie";
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", this.f135197a.r).a("prop_id", effect.getEffectId()).a("enter_from", "EffectStickerViewHolder").a("hint_type", str2);
            if (z) {
                str = "succeed";
            } else {
                str = "failed";
            }
            d.a("load_prop_hint_end", a2.a("load_status", str).f149193a);
        }
    }

    public static final class a extends h.f.b.m implements q<Effect, ExtraParams, f, f> {
        final /* synthetic */ ShortVideoContext $shortVideoContext$inlined;

        static {
            Covode.recordClassIndex(88376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ShortVideoContext shortVideoContext) {
            super(3);
            this.$shortVideoContext$inlined = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ f invoke(Effect effect, ExtraParams extraParams, f fVar) {
            Effect effect2 = effect;
            l.d(effect2, "");
            l.d(fVar, "");
            if (effect2.getTags() == null) {
                return null;
            }
            List<String> tags = effect2.getTags();
            if (tags == null) {
                l.b();
            }
            if (tags.contains("strong_beat")) {
                return new a(effect2, this.$shortVideoContext$inlined);
            }
            return null;
        }
    }
}
