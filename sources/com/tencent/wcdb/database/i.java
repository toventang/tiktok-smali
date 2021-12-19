package com.tencent.wcdb.database;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.g;
import com.tencent.wcdb.support.Log;
import java.io.File;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f154651a;

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteDatabase.a f154652b;

    /* renamed from: c  reason: collision with root package name */
    public final String f154653c;

    /* renamed from: d  reason: collision with root package name */
    private final int f154654d;

    /* renamed from: e  reason: collision with root package name */
    private SQLiteDatabase f154655e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f154656f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f154657g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f154658h;

    /* renamed from: i  reason: collision with root package name */
    private final g f154659i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f154660j;

    /* renamed from: k  reason: collision with root package name */
    private SQLiteCipherSpec f154661k;

    /* renamed from: l  reason: collision with root package name */
    private int f154662l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f154663m;

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i2, int i3);

    public void b(SQLiteDatabase sQLiteDatabase) {
    }

    public void c(SQLiteDatabase sQLiteDatabase) {
    }

    static {
        Covode.recordClassIndex(103060);
        SQLiteGlobal.loadLib();
    }

    public final SQLiteDatabase b() {
        SQLiteDatabase a2;
        synchronized (this) {
            a2 = a();
        }
        return a2;
    }

    public synchronized void close() {
        if (!this.f154656f) {
            SQLiteDatabase sQLiteDatabase = this.f154655e;
            if (sQLiteDatabase != null && sQLiteDatabase.m()) {
                this.f154655e.close();
                this.f154655e = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    private SQLiteDatabase a() {
        int i2;
        File file;
        File file2;
        int i3;
        SQLiteDatabase sQLiteDatabase = this.f154655e;
        File file3 = null;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.m()) {
                this.f154655e = null;
            } else if (!this.f154655e.k()) {
                return this.f154655e;
            }
        }
        if (!this.f154656f) {
            SQLiteDatabase sQLiteDatabase2 = this.f154655e;
            try {
                this.f154656f = true;
                if (sQLiteDatabase2 == null) {
                    String str = this.f154653c;
                    if (str == null) {
                        sQLiteDatabase2 = SQLiteDatabase.a(":memory:", null, null, null, 268435456, null, 0);
                    } else {
                        boolean z = this.f154658h;
                        try {
                            this.f154663m = true;
                            if (this.f154657g) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            this.f154662l = i2;
                            Context context = this.f154651a;
                            byte[] bArr = this.f154660j;
                            SQLiteCipherSpec sQLiteCipherSpec = this.f154661k;
                            SQLiteDatabase.a aVar = this.f154652b;
                            g gVar = this.f154659i;
                            if (str.charAt(0) == File.separatorChar) {
                                file = new File(str.substring(0, str.lastIndexOf(File.separatorChar)));
                                file2 = new File(file, str.substring(str.lastIndexOf(File.separatorChar)));
                            } else if (context != null) {
                                String str2 = context.getApplicationInfo().dataDir;
                                if (str2 != null) {
                                    file3 = new File(str2);
                                }
                                file = new File(file3, "databases");
                                if (file.getPath().equals("databases")) {
                                    file = new File("/data/system");
                                }
                                if (str.indexOf(File.separatorChar) < 0) {
                                    file2 = new File(file, str);
                                } else {
                                    throw new IllegalArgumentException("File " + str + " contains a path separator");
                                }
                            } else {
                                throw new RuntimeException("Not supported in system context");
                            }
                            if (!file.isDirectory() && file.mkdir()) {
                                FileUtils.setPermissions(file.getPath(), 505, -1, -1);
                            }
                            if ((i2 & 8) != 0) {
                                i3 = 805306368;
                            } else {
                                i3 = 268435456;
                            }
                            SQLiteDatabase a2 = SQLiteDatabase.a(file2.getPath(), bArr, sQLiteCipherSpec, aVar, i3, gVar, z ? 1 : 0);
                            String path = file2.getPath();
                            int i4 = 432;
                            if ((i2 & 1) != 0) {
                                i4 = 436;
                            }
                            if ((i2 & 2) != 0) {
                                i4 |= 2;
                            }
                            FileUtils.setPermissions(path, i4, -1, -1);
                            sQLiteDatabase2 = a2;
                        } catch (SQLiteException e2) {
                            throw e2;
                        }
                    }
                } else if (sQLiteDatabase2.k()) {
                    synchronized (sQLiteDatabase2.f154585a) {
                        sQLiteDatabase2.s();
                        if (sQLiteDatabase2.l()) {
                            int i5 = sQLiteDatabase2.f154586b.f154636d;
                            sQLiteDatabase2.f154586b.f154636d = (sQLiteDatabase2.f154586b.f154636d & -2) | 0;
                            try {
                                sQLiteDatabase2.f154587c.a(sQLiteDatabase2.f154586b);
                            } catch (RuntimeException e3) {
                                sQLiteDatabase2.f154586b.f154636d = i5;
                                throw e3;
                            }
                        }
                    }
                }
                return d(sQLiteDatabase2);
            } finally {
                this.f154656f = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.f154655e)) {
                    sQLiteDatabase2.close();
                }
            }
        } else {
            throw new IllegalStateException("getDatabase called recursively");
        }
    }

    private SQLiteDatabase d(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        int j2 = sQLiteDatabase.j();
        if (j2 != this.f154654d) {
            if (!sQLiteDatabase.k()) {
                sQLiteDatabase.b(true);
                if (j2 == 0) {
                    try {
                        a(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.g();
                        throw th;
                    }
                } else {
                    int i2 = this.f154654d;
                    if (j2 > i2) {
                        b(sQLiteDatabase, j2, i2);
                    } else {
                        a(sQLiteDatabase, j2, i2);
                    }
                }
                sQLiteDatabase.a(this.f154654d);
                sQLiteDatabase.h();
                sQLiteDatabase.g();
            } else {
                throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.j() + " to " + this.f154654d + ": " + this.f154653c);
            }
        }
        c(sQLiteDatabase);
        if (sQLiteDatabase.k()) {
            Log.a(5, "WCDB.SQLiteOpenHelper", "Opened " + this.f154653c + " in read-only mode");
        }
        this.f154655e = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
    }

    public i(Context context, String str, byte[] bArr, g gVar) {
        this(context, str, bArr, null, 38, gVar);
    }

    private i(Context context, String str, byte[] bArr, SQLiteDatabase.a aVar, int i2, g gVar) {
        this.f154651a = context;
        this.f154653c = str;
        this.f154652b = null;
        this.f154654d = 38;
        this.f154659i = gVar;
        this.f154660j = bArr;
        this.f154661k = null;
        this.f154663m = false;
    }
}
