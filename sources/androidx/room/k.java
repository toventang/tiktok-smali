package androidx.room;

import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(1677);
    }

    public static String a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
