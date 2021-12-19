package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public interface bk {
    static {
        Covode.recordClassIndex(42311);
    }

    void clearSharedAccount(b<? super Boolean, z> bVar);

    void onDeviceRegistrationInfoChanged();

    void saveSharedAccount(a aVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f68721a;

        /* renamed from: b  reason: collision with root package name */
        public final f f68722b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Boolean, z> f68723c;

        static {
            Covode.recordClassIndex(42312);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f68721a, aVar.f68721a) && l.a(this.f68722b, aVar.f68722b) && l.a(this.f68723c, aVar.f68723c);
        }

        public final int hashCode() {
            String str = this.f68721a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            f fVar = this.f68722b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            b<Boolean, z> bVar = this.f68723c;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "AccountShareConfig(uri=" + this.f68721a + ", dataModel=" + this.f68722b + ", listener=" + this.f68723c + ")";
        }

        private /* synthetic */ a() {
            this(null);
        }

        public a(f fVar) {
            this.f68721a = null;
            this.f68722b = fVar;
            this.f68723c = null;
        }
    }
}
