package com.ss.android.ugc.aweme.video;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public class InitPlayerProvider extends g {
    static {
        Covode.recordClassIndex(93743);
    }

    public boolean onCreate() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.g
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return super.getType(uri);
    }

    @Override // com.ss.android.ugc.aweme.video.g
    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return super.insert(uri, contentValues);
    }

    @Override // com.ss.android.ugc.aweme.video.g
    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return super.delete(uri, str, strArr);
    }

    @Override // com.ss.android.ugc.aweme.video.g
    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return super.update(uri, contentValues, str, strArr);
    }

    @Override // com.ss.android.ugc.aweme.video.g
    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }
}
