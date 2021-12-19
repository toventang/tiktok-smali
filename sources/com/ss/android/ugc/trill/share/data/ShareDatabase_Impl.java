package com.ss.android.ugc.trill.share.data;

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

public final class ShareDatabase_Impl extends ShareDatabase {

    /* renamed from: k  reason: collision with root package name */
    private volatile b f150664k;

    static {
        Covode.recordClassIndex(99074);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "Record");
    }

    @Override // com.ss.android.ugc.trill.share.data.ShareDatabase
    public final b i() {
        b bVar;
        MethodCollector.i(3014);
        if (this.f150664k != null) {
            b bVar2 = this.f150664k;
            MethodCollector.o(3014);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f150664k == null) {
                    this.f150664k = new c(this);
                }
                bVar = this.f150664k;
            } finally {
                MethodCollector.o(3014);
            }
        }
        return bVar;
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.ss.android.ugc.trill.share.data.ShareDatabase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99075);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (ShareDatabase_Impl.this.f4326g != null) {
                    int size = ShareDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ShareDatabase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `Record`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `Record` (`rid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER, `channel` TEXT, `share_type` INTEGER)");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e670bbb58b1cec9bfaaeb409ecedc0d')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                ShareDatabase_Impl.this.f4320a = bVar;
                ShareDatabase_Impl.this.a(bVar);
                if (ShareDatabase_Impl.this.f4326g != null) {
                    int size = ShareDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) ShareDatabase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("rid", new d.a("rid", "INTEGER", true, 1));
                hashMap.put("time", new d.a("time", "INTEGER", false, 0));
                hashMap.put("channel", new d.a("channel", "TEXT", false, 0));
                hashMap.put("share_type", new d.a("share_type", "INTEGER", false, 0));
                d dVar = new d("Record", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "Record");
                if (!dVar.equals(a2)) {
                    throw new IllegalStateException("Migration didn't properly handle Record(com.ss.android.ugc.trill.share.data.Record).\n Expected:\n" + dVar + "\n Found:\n" + a2);
                }
            }
        }, "4e670bbb58b1cec9bfaaeb409ecedc0d", "c53d71306862fad59b3a3fe103512963");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
