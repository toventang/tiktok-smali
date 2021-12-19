package androidx.room.b;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(1642);
    }

    public static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
