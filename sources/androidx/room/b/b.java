package androidx.room.b;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b {
    static {
        Covode.recordClassIndex(1643);
    }

    /* JADX INFO: finally extract failed */
    public static void a(androidx.i.a.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor b2 = bVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b2.moveToNext()) {
            try {
                arrayList.add(b2.getString(0));
            } catch (Throwable th) {
                b2.close();
                throw th;
            }
        }
        b2.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.c("DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
