package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

public class p extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final String f156173a;

    /* renamed from: b  reason: collision with root package name */
    private final String f156174b;

    static {
        Covode.recordClassIndex(103724);
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f156173a);
    }

    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f156173a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f156173a);
    }

    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f156173a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f156173a);
        file.mkdirs();
        return new File(file, str);
    }

    public SharedPreferences getSharedPreferences(String str, int i2) {
        MethodCollector.i(13912);
        SharedPreferences sharedPreferences = super.getSharedPreferences(this.f156174b + ":" + str, i2);
        MethodCollector.o(13912);
        return sharedPreferences;
    }

    p(Context context, String str, String str2) {
        super(context);
        this.f156174b = str;
        this.f156173a = str2;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
        MethodCollector.i(13862);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
        MethodCollector.o(13862);
        return openOrCreateDatabase;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        MethodCollector.i(13910);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
        MethodCollector.o(13910);
        return openOrCreateDatabase;
    }
}
