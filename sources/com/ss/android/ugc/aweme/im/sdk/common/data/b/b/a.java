package com.ss.android.ugc.aweme.im.sdk.common.data.b.b;

import com.bytedance.covode.number.Covode;

public enum a {
    COLUMN_SEC_UID("SEC_UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_RELATION_TYPE("RELATION_TYPE", "INTEGER"),
    COLUMN_CREATED_TIME("CREATED_TIME", "BIGINT");
    
    public final String key;
    public final String type;

    static {
        Covode.recordClassIndex(65621);
    }

    private a(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
