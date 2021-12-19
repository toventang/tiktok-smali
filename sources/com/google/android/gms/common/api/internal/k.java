package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

public final class k<L> {

    /* renamed from: a  reason: collision with root package name */
    volatile L f50263a;

    static {
        Covode.recordClassIndex(31312);
    }

    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final L f50264a;

        /* renamed from: b  reason: collision with root package name */
        private final String f50265b;

        static {
            Covode.recordClassIndex(31313);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f50264a) * 31) + this.f50265b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f50264a != aVar.f50264a || !this.f50265b.equals(aVar.f50265b)) {
                return false;
            }
            return true;
        }
    }
}
