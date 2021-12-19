package com.ss.android.ugc.gamora.recorder.sticker.c;

import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a implements d {
    static {
        Covode.recordClassIndex(97747);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a$a  reason: collision with other inner class name */
    public static final class C4002a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final g<Effect> f148317a = new g<>();

        static {
            Covode.recordClassIndex(97748);
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final void a(String str) {
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final void a(String str, b<? super Effect, z> bVar) {
            l.d(bVar, "");
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final boolean a(Effect effect) {
            l.d(effect, "");
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final void b() {
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final boolean b(String str) {
            return true;
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final String c() {
            return "";
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.c
        public final g<Effect> a() {
            return this.f148317a;
        }

        C4002a() {
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.d
    public final c a(j jVar) {
        l.d(jVar, "");
        return new C4002a();
    }
}
