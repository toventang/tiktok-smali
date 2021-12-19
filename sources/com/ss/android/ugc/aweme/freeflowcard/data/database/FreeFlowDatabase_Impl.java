package com.ss.android.ugc.aweme.freeflowcard.data.database;

import androidx.i.a.b;
import androidx.i.a.c;
import androidx.room.a;
import androidx.room.b.d;
import androidx.room.g;
import androidx.room.j;
import androidx.room.l;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

public final class FreeFlowDatabase_Impl extends FreeFlowDatabase {
    static {
        Covode.recordClassIndex(61381);
    }

    @Override // androidx.room.j
    public final g a() {
        return new g(this, new HashMap(0), new HashMap(0), "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    @Override // androidx.room.j
    public final c b(a aVar) {
        l lVar = new l(aVar, new l.a() {
            /* class com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61382);
            }

            @Override // androidx.room.l.a
            public final void a() {
                if (FreeFlowDatabase_Impl.this.f4326g != null) {
                    int size = FreeFlowDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        FreeFlowDatabase_Impl.this.f4326g.get(i2);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void e(b bVar) {
                androidx.room.b.b.a(bVar);
            }

            @Override // androidx.room.l.a
            public final void a(b bVar) {
                bVar.c("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                bVar.c("DROP TABLE IF EXISTS `tb_user_click_event`");
                bVar.c("DROP TABLE IF EXISTS `tb_app_start_mode`");
            }

            @Override // androidx.room.l.a
            public final void b(b bVar) {
                bVar.c("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                bVar.c("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                bVar.c("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                bVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1967f4d2e5a4f7e5e76e753b06cafe2b')");
            }

            @Override // androidx.room.l.a
            public final void c(b bVar) {
                FreeFlowDatabase_Impl.this.f4320a = bVar;
                FreeFlowDatabase_Impl.this.a(bVar);
                if (FreeFlowDatabase_Impl.this.f4326g != null) {
                    int size = FreeFlowDatabase_Impl.this.f4326g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((j.b) FreeFlowDatabase_Impl.this.f4326g.get(i2)).a(bVar);
                    }
                }
            }

            @Override // androidx.room.l.a
            public final void d(b bVar) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new d.a("id", "INTEGER", true, 1));
                hashMap.put("is_open", new d.a("is_open", "INTEGER", true, 0));
                hashMap.put("change_type", new d.a("change_type", "INTEGER", true, 0));
                hashMap.put("reset_time", new d.a("reset_time", "INTEGER", true, 0));
                hashMap.put("monthly_state", new d.a("monthly_state", "INTEGER", true, 0));
                hashMap.put("day_open", new d.a("day_open", "INTEGER", true, 0));
                hashMap.put("day_open_reset_time", new d.a("day_open_reset_time", "INTEGER", true, 0));
                d dVar = new d("tb_auto_play_setting", hashMap, new HashSet(0), new HashSet(0));
                d a2 = d.a(bVar, "tb_auto_play_setting");
                if (dVar.equals(a2)) {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("id", new d.a("id", "INTEGER", true, 1));
                    hashMap2.put("time", new d.a("time", "INTEGER", true, 0));
                    hashMap2.put("click_type", new d.a("click_type", "INTEGER", true, 0));
                    hashMap2.put("is_auto_play", new d.a("is_auto_play", "INTEGER", true, 0));
                    d dVar2 = new d("tb_user_click_event", hashMap2, new HashSet(0), new HashSet(0));
                    d a3 = d.a(bVar, "tb_user_click_event");
                    if (dVar2.equals(a3)) {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new d.a("id", "INTEGER", true, 1));
                        hashMap3.put("time", new d.a("time", "INTEGER", true, 0));
                        hashMap3.put("start_mode", new d.a("start_mode", "INTEGER", true, 0));
                        d dVar3 = new d("tb_app_start_mode", hashMap3, new HashSet(0), new HashSet(0));
                        d a4 = d.a(bVar, "tb_app_start_mode");
                        if (!dVar3.equals(a4)) {
                            throw new IllegalStateException("Migration didn't properly handle tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n" + dVar3 + "\n Found:\n" + a4);
                        }
                        return;
                    }
                    throw new IllegalStateException("Migration didn't properly handle tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n" + dVar2 + "\n Found:\n" + a3);
                }
                throw new IllegalStateException("Migration didn't properly handle tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n" + dVar + "\n Found:\n" + a2);
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689");
        c.b.a a2 = c.b.a(aVar.f4235b);
        a2.f3213b = aVar.f4236c;
        a2.f3214c = lVar;
        return aVar.f4234a.a(a2.a());
    }
}
