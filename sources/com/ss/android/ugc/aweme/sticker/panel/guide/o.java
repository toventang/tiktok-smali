package com.ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.guide.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135200a = new a((byte) 0);

    static {
        Covode.recordClassIndex(88380);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88381);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.g
    public final f a(Effect effect) {
        if (g.C(effect)) {
            return new l(effect);
        }
        return new f.a();
    }
}
