package com.ss.android.ugc.asve.editor;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.bj;
import h.f.b.l;

public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62011a = a.f62012a;

    static {
        Covode.recordClassIndex(38129);
    }

    g a(SurfaceView surfaceView, b bVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f62012a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(38130);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f62013a;

        /* renamed from: b  reason: collision with root package name */
        public final String f62014b;

        /* renamed from: c  reason: collision with root package name */
        public final long f62015c;

        /* renamed from: d  reason: collision with root package name */
        public final bj f62016d;

        static {
            Covode.recordClassIndex(38131);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f62013a, bVar.f62013a) && l.a(this.f62014b, bVar.f62014b) && this.f62015c == bVar.f62015c && l.a(this.f62016d, bVar.f62016d);
        }

        public final int hashCode() {
            f fVar = this.f62013a;
            int i2 = 0;
            int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
            String str = this.f62014b;
            int hashCode2 = str != null ? str.hashCode() : 0;
            long j2 = this.f62015c;
            int i3 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            bj bjVar = this.f62016d;
            if (bjVar != null) {
                i2 = bjVar.hashCode();
            }
            return i3 + i2;
        }

        public final String toString() {
            return "Params(type=" + this.f62013a + ", workSpace=" + this.f62014b + ", handler=" + this.f62015c + ", veUserConfig=" + this.f62016d + ")";
        }

        public b(f fVar, String str, long j2, bj bjVar) {
            l.d(fVar, "");
            l.d(str, "");
            this.f62013a = fVar;
            this.f62014b = str;
            this.f62015c = j2;
            this.f62016d = bjVar;
        }
    }
}
