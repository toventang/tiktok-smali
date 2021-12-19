package com.bytedance.creativex.recorder.sticker.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public abstract class b {
    static {
        Covode.recordClassIndex(16669);
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Effect f28380a;

        static {
            Covode.recordClassIndex(16670);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f28380a, ((a) obj).f28380a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f28380a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Show(effect=" + this.f28380a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Effect effect) {
            super((byte) 0);
            l.d(effect, "");
            this.f28380a = effect;
        }
    }
}
