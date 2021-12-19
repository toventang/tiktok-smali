package com.bytedance.android.livesdk.i18n.db;

import androidx.room.j;
import com.bytedance.covode.number.Covode;

public abstract class I18nDatabase extends j {
    static {
        Covode.recordClassIndex(10123);
    }

    public abstract e i();

    public abstract b j();
}
