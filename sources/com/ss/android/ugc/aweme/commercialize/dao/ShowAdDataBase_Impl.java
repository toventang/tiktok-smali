package com.ss.android.ugc.aweme.commercialize.dao;

import androidx.i.a.b;
import androidx.i.a.c;
import androidx.room.a;
import androidx.room.b.d;
import androidx.room.g;
import androidx.room.j;
import androidx.room.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.HashSet;

public final class ShowAdDataBase_Impl extends ShowAdDataBase {

    /* renamed from: k  reason: collision with root package name */
    private volatile b f73760k;

    static {
        Covode.recordClassIndex(45384);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "showAd");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase
    public final b i() {
        b bVar;
        MethodCollector.i(350);
        if (this.f73760k != null) {
            b bVar2 = this.f73760k;
            MethodCollector.o(350);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f73760k == null) {
                    this.f73760k = new c(this);
                }
                bVar = this.f73760k;
            } finally {
                MethodCollector.o(350);
            }
        }
        return bVar;
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(45385);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (ShowAdDataBase_Impl.this.f4326g != null) {
                    int size = ShowAdDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ShowAdDataBase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `showAd`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b390b3c8ccd346d851c56d8fb78f29df')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                ShowAdDataBase_Impl.this.f4320a = bVar;
                ShowAdDataBase_Impl.this.a(bVar);
                if (ShowAdDataBase_Impl.this.f4326g != null) {
                    int size = ShowAdDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) ShowAdDataBase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("awemeId", new d.a("awemeId", "TEXT", true, 1));
                d dVar = new d("showAd", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "showAd");
                if (!dVar.equals(a2)) {
                    throw new IllegalStateException("Migration didn't properly handle showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n" + dVar + "\n Found:\n" + a2);
                }
            }
        }, "b390b3c8ccd346d851c56d8fb78f29df", "ad22cd0c0878f7d44a84485b85a127f7");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
