package com.google.android.datatransport.runtime.scheduling.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.List;

final class aa extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    static int f49483a = 3;

    /* renamed from: d  reason: collision with root package name */
    private static final a f49484d;

    /* renamed from: e  reason: collision with root package name */
    private static final a f49485e;

    /* renamed from: f  reason: collision with root package name */
    private static final a f49486f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<a> f49487g;

    /* renamed from: b  reason: collision with root package name */
    private final int f49488b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f49489c;

    public interface a {
        static {
            Covode.recordClassIndex(30962);
        }

        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        Covode.recordClassIndex(30961);
        ab abVar = ab.f49490a;
        f49484d = abVar;
        ac acVar = ac.f49491a;
        f49485e = acVar;
        ad adVar = ad.f49492a;
        f49486f = adVar;
        f49487g = Arrays.asList(abVar, acVar, adVar);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f49489c) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        a(sQLiteDatabase, 0, this.f49488b);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(3272);
        this.f49489c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        int i2 = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        MethodCollector.o(3272);
    }

    aa(Context context, int i2) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i2);
        this.f49488b = i2;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        a(sQLiteDatabase);
        a(sQLiteDatabase, i2, i3);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(3276);
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
        MethodCollector.o(3276);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = f49487g;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f49487g.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
