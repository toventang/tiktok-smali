package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.tencent.wcdb.support.Log;
import java.io.File;

public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f154690b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f154691a;

    public i() {
    }

    static {
        Covode.recordClassIndex(103072);
    }

    public i(byte b2) {
        this.f154691a = true;
    }

    private static boolean a(File file) {
        MethodCollector.i(1794);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1794);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1794);
        return delete;
    }

    private void a(String str) {
        MethodCollector.i(1781);
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            MethodCollector.o(1781);
            return;
        }
        Log.a(6, "WCDB.DefaultDatabaseErrorHandler", "Remove database file: ".concat(String.valueOf(str)));
        int i2 = 0;
        if (!this.f154691a) {
            File file = new File(str);
            File file2 = new File(file.getParentFile(), "corrupted");
            if (!file2.mkdirs()) {
                Log.a(6, "WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
            }
            String str2 = file2.getPath() + "/" + file.getName();
            String[] strArr = f154690b;
            int length = strArr.length;
            while (i2 < length) {
                String str3 = strArr[i2];
                String str4 = str2 + str3;
                File file3 = new File(str + str3);
                if (!file3.renameTo(new File(str4))) {
                    a(file3);
                }
                i2++;
            }
            MethodCollector.o(1781);
            return;
        }
        String[] strArr2 = f154690b;
        int length2 = strArr2.length;
        while (i2 < length2) {
            a(new File(str + strArr2[i2]));
            i2++;
        }
        MethodCollector.o(1781);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.tencent.wcdb.g
    public final void a(com.tencent.wcdb.database.SQLiteDatabase r4) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.i.a(com.tencent.wcdb.database.SQLiteDatabase):void");
    }
}
