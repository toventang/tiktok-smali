package com.bytedance.android.livesdk.i18n.db;

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

public final class I18nDatabase_Impl extends I18nDatabase {

    /* renamed from: k  reason: collision with root package name */
    private volatile e f18231k;

    /* renamed from: l  reason: collision with root package name */
    private volatile b f18232l;

    static {
        Covode.recordClassIndex(10124);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "translation", "information");
    }

    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final e i() {
        e eVar;
        MethodCollector.i(9159);
        if (this.f18231k != null) {
            e eVar2 = this.f18231k;
            MethodCollector.o(9159);
            return eVar2;
        }
        synchronized (this) {
            try {
                if (this.f18231k == null) {
                    this.f18231k = new f(this);
                }
                eVar = this.f18231k;
            } finally {
                MethodCollector.o(9159);
            }
        }
        return eVar;
    }

    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final b j() {
        b bVar;
        MethodCollector.i(9160);
        if (this.f18232l != null) {
            b bVar2 = this.f18232l;
            MethodCollector.o(9160);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f18232l == null) {
                    this.f18232l = new c(this);
                }
                bVar = this.f18232l;
            } finally {
                MethodCollector.o(9160);
            }
        }
        return bVar;
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.bytedance.android.livesdk.i18n.db.I18nDatabase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10125);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (I18nDatabase_Impl.this.f4326g != null) {
                    int size = I18nDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        I18nDatabase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `translation`");
                bVar.c("DROP TABLE IF EXISTS `information`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.c("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db08c04e8a10c6c1ddb9d9ab384c2f17')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                I18nDatabase_Impl.this.f4320a = bVar;
                I18nDatabase_Impl.this.a(bVar);
                if (I18nDatabase_Impl.this.f4326g != null) {
                    int size = I18nDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) I18nDatabase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new d.a("key", "TEXT", true, 1));
                hashMap.put("value", new d.a("value", "TEXT", false, 0));
                d dVar = new d("translation", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "translation");
                if (dVar.equals(a2)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("key", new d.a("key", "TEXT", true, 1));
                    hashMap2.put("value", new d.a("value", "TEXT", false, 0));
                    d dVar2 = new d("information", hashMap2, new HashSet(0), new HashSet(0));
                    d a3 = d.a(bVar, "information");
                    if (!dVar2.equals(a3)) {
                        throw new IllegalStateException("Migration didn't properly handle information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n" + dVar2 + "\n Found:\n" + a3);
                    }
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n" + dVar + "\n Found:\n" + a2);
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
