package com.ss.android.ugc.aweme.kids.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import h.f.b.l;

public abstract class e {
    static {
        Covode.recordClassIndex(68263);
    }

    private e() {
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final c f106781a;

        static {
            Covode.recordClassIndex(68264);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f106781a, ((a) obj).f106781a);
            }
            return true;
        }

        public final int hashCode() {
            c cVar = this.f106781a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "DraftVideo(data=" + this.f106781a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super((byte) 0);
            l.d(cVar, "");
            this.f106781a = cVar;
        }
    }

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final a f106782a;

        static {
            Covode.recordClassIndex(68265);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f106782a, ((b) obj).f106782a);
            }
            return true;
        }

        public final int hashCode() {
            a aVar = this.f106782a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "KidsProfileHeader(userData=" + this.f106782a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super((byte) 0);
            l.d(aVar, "");
            this.f106782a = aVar;
        }
    }
}
