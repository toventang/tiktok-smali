package com.ss.android.ugc.trill.share.data;

import android.content.Context;
import androidx.i.a.b;
import androidx.room.a.a;
import androidx.room.i;
import androidx.room.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.permission.e;

public abstract class ShareDatabase extends j {

    /* renamed from: k  reason: collision with root package name */
    private static volatile ShareDatabase f150661k;

    /* renamed from: l  reason: collision with root package name */
    private static final a f150662l = new a() {
        /* class com.ss.android.ugc.trill.share.data.ShareDatabase.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99072);
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            bVar.c("CREATE TABLE IF NOT EXISTS `quick_share_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mutual_follow_status` INTEGER NOT NULL, `friends_list` TEXT, `timestamp` INTEGER NOT NULL)");
            bVar.c("CREATE TABLE IF NOT EXISTS `quick_share_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hashed_phone_number` TEXT NOT NULL, `created_time` INTEGER)");
            bVar.c("CREATE UNIQUE INDEX `index_quick_share_history_hashed_phone_number` ON `quick_share_history` (`hashed_phone_number`)");
            bVar.c("CREATE TRIGGER delete_oldest_record AFTER INSERT ON quick_share_history BEGIN DELETE FROM quick_share_history WHERE id NOT IN (SELECT id FROM quick_share_history ORDER BY created_time DESC LIMIT 10); END");
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static final a f150663m = new a() {
        /* class com.ss.android.ugc.trill.share.data.ShareDatabase.AnonymousClass2 */

        static {
            Covode.recordClassIndex(99073);
        }

        @Override // androidx.room.a.a
        public final void a(b bVar) {
            bVar.c("DROP TABLE IF EXISTS `quick_share_data`");
            bVar.c("DROP TABLE IF EXISTS `quick_share_history`");
        }
    };

    public abstract b i();

    static {
        Covode.recordClassIndex(99071);
    }

    public static ShareDatabase a(Context context) {
        boolean z;
        if (f150661k == null) {
            synchronized (ShareDatabase.class) {
                StringBuilder sb = new StringBuilder("Creating ShareDatabase instance, WRITE_EXTERNAL_STORAGE: ");
                if (e.c(context) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                com.ss.android.ugc.aweme.framework.a.a.a(sb.append(z).toString());
                try {
                    if (f150661k == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                            if (applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                        }
                        j.a a2 = i.a(applicationContext, ShareDatabase.class, "share.db").a(f150662l, f150663m);
                        a2.f4332b = true;
                        f150661k = (ShareDatabase) a2.a();
                    }
                } catch (Throwable th) {
                    com.ss.android.ugc.aweme.framework.a.a.a("Error creating ShareDatabase: " + th.toString());
                }
            }
        }
        return f150661k;
    }
}
