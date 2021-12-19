package com.ss.android.ugc.aweme.bullet.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<C1563a> f69283a = new ArrayList();

    static {
        Covode.recordClassIndex(42719);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e.a$a  reason: collision with other inner class name */
    public static final class C1563a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f69284a;

        /* renamed from: b  reason: collision with root package name */
        public final c f69285b;

        static {
            Covode.recordClassIndex(42720);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1563a)) {
                return false;
            }
            C1563a aVar = (C1563a) obj;
            return l.a(this.f69284a, aVar.f69284a) && l.a(this.f69285b, aVar.f69285b);
        }

        public final int hashCode() {
            Uri uri = this.f69284a;
            int i2 = 0;
            int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
            c cVar = this.f69285b;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ViewCacheItem(uri=" + this.f69284a + ", cache=" + this.f69285b + ")";
        }

        public C1563a(Uri uri, c cVar) {
            l.d(uri, "");
            l.d(cVar, "");
            this.f69284a = uri;
            this.f69285b = cVar;
        }
    }
}
