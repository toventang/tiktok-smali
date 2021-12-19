package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.i.a.b;
import androidx.work.impl.utils.c;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static androidx.room.a.a f4692a = new androidx.room.a.a() {
        /* class androidx.work.impl.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1848);
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            bVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.c("DROP TABLE IF EXISTS alarmInfo");
            bVar.c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static androidx.room.a.a f4693b = new androidx.room.a.a() {
        /* class androidx.work.impl.e.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1849);
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static androidx.room.a.a f4694c = new androidx.room.a.a() {
        /* class androidx.work.impl.e.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1850);
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            bVar.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };

    static {
        Covode.recordClassIndex(1847);
    }

    public static class a extends androidx.room.a.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f4695c;

        static {
            Covode.recordClassIndex(1851);
        }

        public a(Context context) {
            super(2, 3);
            this.f4695c = context;
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            new c(this.f4695c).a(true);
        }
    }
}
