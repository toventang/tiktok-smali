package com.ss.android.ugc.aweme.runtime.behavior;

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

public final class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {

    /* renamed from: k  reason: collision with root package name */
    private volatile a f120713k;

    static {
        Covode.recordClassIndex(78648);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "runtimeBehaviorEntity");
    }

    @Override // com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase
    public final a i() {
        a aVar;
        MethodCollector.i(302);
        if (this.f120713k != null) {
            a aVar2 = this.f120713k;
            MethodCollector.o(302);
            return aVar2;
        }
        synchronized (this) {
            try {
                if (this.f120713k == null) {
                    this.f120713k = new b(this);
                }
                aVar = this.f120713k;
            } finally {
                MethodCollector.o(302);
            }
        }
        return aVar;
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(78649);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (RuntimeBehaviorDataBase_Impl.this.f4326g != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RuntimeBehaviorDataBase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `runtimeBehaviorEntity`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `runtimeBehaviorEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '977ffca18b985d80d9f488e58c9d7da9')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                RuntimeBehaviorDataBase_Impl.this.f4320a = bVar;
                RuntimeBehaviorDataBase_Impl.this.a(bVar);
                if (RuntimeBehaviorDataBase_Impl.this.f4326g != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) RuntimeBehaviorDataBase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", new d.a("id", "INTEGER", true, 1));
                hashMap.put(StringSet.type, new d.a(StringSet.type, "TEXT", true, 0));
                hashMap.put("time", new d.a("time", "INTEGER", true, 0));
                hashMap.put("msg", new d.a("msg", "TEXT", true, 0));
                d dVar = new d("runtimeBehaviorEntity", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "runtimeBehaviorEntity");
                if (!dVar.equals(a2)) {
                    throw new IllegalStateException("Migration didn't properly handle runtimeBehaviorEntity(com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorEntity).\n Expected:\n" + dVar + "\n Found:\n" + a2);
                }
            }
        }, "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
