package com.ss.android.ugc.aweme.challenge.data;

import androidx.i.a.b;
import androidx.i.a.c;
import androidx.room.a;
import androidx.room.b.d;
import androidx.room.g;
import androidx.room.j;
import androidx.room.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.HashSet;

public final class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {

    /* renamed from: k  reason: collision with root package name */
    private volatile b f69922k;

    static {
        Covode.recordClassIndex(43119);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "localHashTag");
    }

    @Override // com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase
    public final b i() {
        b bVar;
        MethodCollector.i(3111);
        if (this.f69922k != null) {
            b bVar2 = this.f69922k;
            MethodCollector.o(3111);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f69922k == null) {
                    this.f69922k = new c(this);
                }
                bVar = this.f69922k;
            } finally {
                MethodCollector.o(3111);
            }
        }
        return bVar;
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43120);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (LocalHashTagDataBase_Impl.this.f4326g != null) {
                    int size = LocalHashTagDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        LocalHashTagDataBase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `localHashTag`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0fdb23fe113307f93af74ceea527f0a9')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                LocalHashTagDataBase_Impl.this.f4320a = bVar;
                LocalHashTagDataBase_Impl.this.a(bVar);
                if (LocalHashTagDataBase_Impl.this.f4326g != null) {
                    int size = LocalHashTagDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) LocalHashTagDataBase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put(StringSet.name, new d.a(StringSet.name, "TEXT", true, 1));
                hashMap.put("time", new d.a("time", "INTEGER", false, 0));
                d dVar = new d("localHashTag", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "localHashTag");
                if (!dVar.equals(a2)) {
                    throw new IllegalStateException("Migration didn't properly handle localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n" + dVar + "\n Found:\n" + a2);
                }
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
