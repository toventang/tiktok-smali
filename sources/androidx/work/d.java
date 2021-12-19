package androidx.work;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f4496a = new HashSet();

    static {
        Covode.recordClassIndex(1748);
    }

    public final int a() {
        return this.f4496a.size();
    }

    public final int hashCode() {
        return this.f4496a.hashCode();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4497a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4498b;

        static {
            Covode.recordClassIndex(1749);
        }

        public final int hashCode() {
            return (this.f4497a.hashCode() * 31) + (this.f4498b ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4498b != aVar.f4498b || !this.f4497a.equals(aVar.f4497a)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public a(Uri uri, boolean z) {
            this.f4497a = uri;
            this.f4498b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4496a.equals(((d) obj).f4496a);
    }
}
