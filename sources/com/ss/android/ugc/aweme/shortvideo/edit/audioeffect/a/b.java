package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.guide.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126759a = new a((byte) 0);

    static {
        Covode.recordClassIndex(83169);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83170);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.c
    public final f a(Effect effect) {
        if (effect == null) {
            return new f.a();
        }
        return new e(effect);
    }
}
