package com.ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public abstract class e {

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Effect f136526a;

        static {
            Covode.recordClassIndex(89176);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f136526a, ((b) obj).f136526a);
            }
            return true;
        }

        public final int hashCode() {
            Effect effect = this.f136526a;
            if (effect != null) {
                return effect.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "HideWithEffectChosen(effect=" + this.f136526a + ")";
        }
    }

    static {
        Covode.recordClassIndex(89174);
    }

    private e() {
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136525a = new a();

        private a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89175);
        }
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final c f136527a = new c();

        private c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(89177);
        }
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
