package androidx.work.impl;

import androidx.i.a.c;
import androidx.room.a;
import androidx.room.b.d;
import androidx.room.g;
import androidx.room.j;
import androidx.room.l;
import androidx.work.impl.b.b;
import androidx.work.impl.b.c;
import androidx.work.impl.b.e;
import androidx.work.impl.b.f;
import androidx.work.impl.b.h;
import androidx.work.impl.b.i;
import androidx.work.impl.b.k;
import androidx.work.impl.b.l;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l  reason: collision with root package name */
    private volatile h f4514l;

    /* renamed from: m  reason: collision with root package name */
    private volatile b f4515m;
    private volatile k n;
    private volatile e o;

    static {
        Covode.recordClassIndex(1760);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h i() {
        h hVar;
        if (this.f4514l != null) {
            return this.f4514l;
        }
        synchronized (this) {
            if (this.f4514l == null) {
                this.f4514l = new i(this);
            }
            hVar = this.f4514l;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b j() {
        b bVar;
        if (this.f4515m != null) {
            return this.f4515m;
        }
        synchronized (this) {
            if (this.f4515m == null) {
                this.f4515m = new c(this);
            }
            bVar = this.f4515m;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k k() {
        k kVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new l(this);
            }
            kVar = this.n;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new f(this);
            }
            eVar = this.o;
        }
        return eVar;
    }

    @Override // androidx.room.j
    public final androidx.i.a.c b(a aVar) {
        androidx.room.l lVar = new androidx.room.l(aVar, new l.a() {
            /* class androidx.work.impl.WorkDatabase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1761);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (WorkDatabase_Impl.this.f4326g != null) {
                    int size = WorkDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        WorkDatabase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void a(androidx.i.a.b bVar) {
                bVar.c("DROP TABLE IF EXISTS `Dependency`");
                bVar.c("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.c("DROP TABLE IF EXISTS `WorkTag`");
                bVar.c("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.c("DROP TABLE IF EXISTS `WorkName`");
            }

            @Override // androidx.room.l.a
            public final void b(androidx.i.a.b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.c("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                bVar.c("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                bVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                bVar.c("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                bVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.c("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                bVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.c("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
            }

            @Override // androidx.room.l.a
            public final void c(androidx.i.a.b bVar) {
                WorkDatabase_Impl.this.f4320a = bVar;
                bVar.c("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.a(bVar);
                if (WorkDatabase_Impl.this.f4326g != null) {
                    int size = WorkDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) WorkDatabase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(androidx.i.a.b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1));
                hashMap.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new d.C0061d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
                hashSet2.add(new d.C0061d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
                d dVar = new d("Dependency", hashMap, hashSet, hashSet2);
                d a2 = d.a(bVar, "Dependency");
                if (dVar.equals(a2)) {
                    HashMap hashMap2 = new HashMap(23);
                    hashMap2.put("id", new d.a("id", "TEXT", true, 1));
                    hashMap2.put("state", new d.a("state", "INTEGER", true, 0));
                    hashMap2.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0));
                    hashMap2.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0));
                    hashMap2.put("input", new d.a("input", "BLOB", true, 0));
                    hashMap2.put("output", new d.a("output", "BLOB", true, 0));
                    hashMap2.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0));
                    hashMap2.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0));
                    hashMap2.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0));
                    hashMap2.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0));
                    hashMap2.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0));
                    hashMap2.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0));
                    hashMap2.put("period_start_time", new d.a("period_start_time", "INTEGER", true, 0));
                    hashMap2.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0));
                    hashMap2.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0));
                    hashMap2.put("required_network_type", new d.a("required_network_type", "INTEGER", false, 0));
                    hashMap2.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0));
                    hashMap2.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0));
                    hashMap2.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0));
                    hashMap2.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0));
                    hashMap2.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0));
                    hashMap2.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0));
                    hashMap2.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new d.C0061d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
                    d dVar2 = new d("WorkSpec", hashMap2, hashSet3, hashSet4);
                    d a3 = d.a(bVar, "WorkSpec");
                    if (dVar2.equals(a3)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new d.a("tag", "TEXT", true, 1));
                        hashMap3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new d.C0061d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
                        d dVar3 = new d("WorkTag", hashMap3, hashSet5, hashSet6);
                        d a4 = d.a(bVar, "WorkTag");
                        if (dVar3.equals(a4)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1));
                            hashMap4.put("system_id", new d.a("system_id", "INTEGER", true, 0));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            d dVar4 = new d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            d a5 = d.a(bVar, "SystemIdInfo");
                            if (dVar4.equals(a5)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put(StringSet.name, new d.a(StringSet.name, "TEXT", true, 1));
                                hashMap5.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new d.C0061d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
                                d dVar5 = new d("WorkName", hashMap5, hashSet8, hashSet9);
                                d a6 = d.a(bVar, "WorkName");
                                if (!dVar5.equals(a6)) {
                                    throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a6);
                                }
                                return;
                            }
                            throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a5);
                        }
                        throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a4);
                    }
                    throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a3);
                }
                throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a2);
            }
        }, "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
