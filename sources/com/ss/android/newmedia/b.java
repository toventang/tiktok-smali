package com.ss.android.newmedia;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import java.io.File;

public final class b extends ContextWrapper {
    static {
        Covode.recordClassIndex(37040);
    }

    public final File getCacheDir() {
        return super.getCacheDir();
    }

    public b(Context context) {
        super(context);
    }

    public final File getDir(String str, int i2) {
        Logger.debug();
        String b2 = f.b(this);
        if (!m.a(b2) && !m.a(str) && b2.endsWith(":ad")) {
            str = "ad_".concat(String.valueOf(str));
            Logger.debug();
        }
        return super.getDir(str, i2);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
        Logger.debug();
        String b2 = f.b(this);
        if (!m.a(b2) && !m.a(str) && b2.endsWith(":ad")) {
            str = "ad_".concat(String.valueOf(str));
            Logger.debug();
        }
        return super.openOrCreateDatabase(str, i2, cursorFactory);
    }
}
