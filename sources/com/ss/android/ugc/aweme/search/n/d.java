package com.ss.android.ugc.aweme.search.n;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.h;
import com.bytedance.track.b;
import com.bytedance.track.c;
import h.f.b.g;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.UUID;

public final class d implements b<d>, Serializable {
    public static final a Companion = new a((byte) 0);
    private final f immutableData;
    private final h mutableData;
    private final String sourceId;

    static {
        Covode.recordClassIndex(79168);
    }

    public d() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ d copy$default(d dVar, f fVar, h hVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = dVar.immutableData;
        }
        if ((i2 & 2) != 0) {
            hVar = dVar.mutableData;
        }
        return dVar.copy(fVar, hVar);
    }

    public static final f fetchImmutableData() {
        return a.c();
    }

    public static final f fetchImmutableData(e eVar) {
        return a.b(eVar);
    }

    public static final h fetchMutableData() {
        return a.b();
    }

    public static final d fetchOwnSource() {
        return a.a();
    }

    public static final d fetchOwnSource(e eVar) {
        return a.a(eVar);
    }

    public final f component1() {
        return this.immutableData;
    }

    public final h component2() {
        return this.mutableData;
    }

    public final d copy(f fVar, h hVar) {
        l.d(fVar, "");
        l.d(hVar, "");
        return new d(fVar, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.immutableData, dVar.immutableData) && l.a(this.mutableData, dVar.mutableData);
    }

    public final int hashCode() {
        f fVar = this.immutableData;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        h hVar = this.mutableData;
        if (hVar != null) {
            i2 = hVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchContextSource(immutableData=" + this.immutableData + ", mutableData=" + this.mutableData + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79169);
        }

        private a() {
        }

        public static d a() {
            return (d) c.a(null, "tracker_key", d.class);
        }

        public static h b() {
            d a2 = a();
            if (a2 != null) {
                return a2.getMutableData();
            }
            return null;
        }

        public static f c() {
            d a2 = a();
            if (a2 != null) {
                return a2.getImmutableData();
            }
            return null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(e eVar) {
            if (eVar == null) {
                return null;
            }
            return (d) c.a(eVar, "tracker_key", d.class);
        }

        public static f b(e eVar) {
            d dVar;
            if (eVar == null || (dVar = (d) c.a(eVar, "tracker_key", d.class)) == null) {
                return null;
            }
            return dVar.getImmutableData();
        }
    }

    public final f getImmutableData() {
        return this.immutableData;
    }

    public final h getMutableData() {
        return this.mutableData;
    }

    @Override // com.bytedance.provider.h
    public final String getSourceId() {
        return this.sourceId;
    }

    @Override // com.bytedance.track.b
    public final d makeCopy() {
        return copy$default(this, null, null, 3, null);
    }

    public final void fire(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        l.c(aVar, "");
        h.a.a(this, aVar);
    }

    public final void update(h.f.a.a<d> aVar) {
        l.d(aVar, "");
        b.a.a(this, aVar);
    }

    public static final h fetchMutableData(e eVar) {
        d dVar;
        if (eVar == null || (dVar = (d) c.a(eVar, "tracker_key", d.class)) == null) {
            return null;
        }
        return dVar.getMutableData();
    }

    public d(f fVar, h hVar) {
        l.d(fVar, "");
        l.d(hVar, "");
        this.immutableData = fVar;
        this.mutableData = hVar;
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        this.sourceId = uuid;
    }

    public static final void attachSource(e eVar, d dVar) {
        l.d(eVar, "");
        l.d(dVar, "");
        c.a(eVar).f44410c.a().a("tracker_key", dVar, d.class);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, h hVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new f(null, null, null, 7, null) : fVar, (i2 & 2) != 0 ? new h(0, null, null, null, null, 31, null) : hVar);
    }
}
