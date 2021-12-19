package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public abstract class d {
    static {
        Covode.recordClassIndex(88063);
    }

    private d() {
    }

    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134781a = new c();

        private c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88066);
        }
    }

    public static final class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final e f134783a = new e();

        private e() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88068);
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Effect f134732a;

        static {
            Covode.recordClassIndex(88064);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f134732a, ((a) obj).f134732a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f134732a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameEnd(gameSticker=" + this.f134732a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Effect effect) {
            super((byte) 0);
            l.d(effect, "");
            this.f134732a = effect;
        }
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Effect f134765a;

        static {
            Covode.recordClassIndex(88065);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f134765a, ((b) obj).f134765a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f134765a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameEnter(gameSticker=" + this.f134765a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Effect effect) {
            super((byte) 0);
            l.d(effect, "");
            this.f134765a = effect;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d$d  reason: collision with other inner class name */
    public static final class C3511d extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Effect f134782a;

        static {
            Covode.recordClassIndex(88067);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C3511d) && l.a(this.f134782a, ((C3511d) obj).f134782a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f134782a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "GameReset(gameSticker=" + this.f134782a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3511d(Effect effect) {
            super((byte) 0);
            l.d(effect, "");
            this.f134782a = effect;
        }
    }
}
