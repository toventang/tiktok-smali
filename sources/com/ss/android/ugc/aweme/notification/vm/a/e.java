package com.ss.android.ugc.aweme.notification.vm.a;

import com.bytedance.covode.number.Covode;
import f.a.t;
import h.f.b.l;

public interface e<REQUEST_PARAM, DATA> {
    static {
        Covode.recordClassIndex(73382);
    }

    b<DATA> a(DATA data, Throwable th);

    DATA a();

    t<b<DATA>> b();

    t<b<DATA>> c();

    boolean d();

    public static final class a {
        static {
            Covode.recordClassIndex(73383);
        }

        public static <REQUEST_PARAM, DATA> t<b<DATA>> a() {
            throw new IllegalAccessError("cannot call loadMore");
        }

        public static <REQUEST_PARAM, DATA> b<DATA> a(e<REQUEST_PARAM, DATA> eVar, DATA data) {
            return eVar.a(data, null);
        }

        public static <REQUEST_PARAM, DATA> b<DATA> a(e<REQUEST_PARAM, DATA> eVar, DATA data, Throwable th) {
            return new b<>(eVar, data, th);
        }
    }

    public static final class b<DATA> {

        /* renamed from: a  reason: collision with root package name */
        public final e<? extends Object, DATA> f114139a;

        /* renamed from: b  reason: collision with root package name */
        public final DATA f114140b;

        /* renamed from: c  reason: collision with root package name */
        public final Throwable f114141c;

        static {
            Covode.recordClassIndex(73384);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f114139a, bVar.f114139a) && l.a(this.f114140b, bVar.f114140b) && l.a(this.f114141c, bVar.f114141c);
        }

        public final int hashCode() {
            e<? extends Object, DATA> eVar = this.f114139a;
            int i2 = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            DATA data = this.f114140b;
            int hashCode2 = (hashCode + (data != null ? data.hashCode() : 0)) * 31;
            Throwable th = this.f114141c;
            if (th != null) {
                i2 = th.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Stream(source=" + this.f114139a + ", data=" + ((Object) this.f114140b) + ", error=" + this.f114141c + ")";
        }

        public /* synthetic */ b(e eVar, Object obj) {
            this(eVar, obj, null);
        }

        public b(e<? extends Object, DATA> eVar, DATA data, Throwable th) {
            l.d(eVar, "");
            this.f114139a = eVar;
            this.f114140b = data;
            this.f114141c = th;
        }
    }
}
