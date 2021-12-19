package com.ss.android.ugc.aweme.port.internal;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;

public interface e {
    static {
        Covode.recordClassIndex(74626);
    }

    void a(int i2, String str, c cVar);

    void a(SQLiteDatabase sQLiteDatabase);

    void a(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    void a(DraftLoadResult draftLoadResult);

    void a(DraftSaveResult draftSaveResult);

    void a(String str, int i2, c cVar);

    void a(boolean z, Exception exc);

    void b(SQLiteDatabase sQLiteDatabase);

    void b(SQLiteDatabase sQLiteDatabase, int i2, int i3);
}
