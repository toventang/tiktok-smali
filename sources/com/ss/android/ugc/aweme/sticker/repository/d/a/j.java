package com.ss.android.ugc.aweme.sticker.repository.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135499a = new a((byte) 0);

    static {
        Covode.recordClassIndex(88556);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88557);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
    public final boolean a(String str, Effect effect) {
        l.d(str, "");
        l.d(effect, "");
        return g.a("voice_recognization", effect);
    }
}
