package com.tencent.wcdb.database;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class SQLiteDebug {

    /* renamed from: a  reason: collision with root package name */
    static volatile int f154593a;

    /* renamed from: b  reason: collision with root package name */
    static volatile ArrayList<IOTraceStats> f154594b;

    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;

        static {
            Covode.recordClassIndex(103036);
        }
    }

    public static final boolean a(long j2) {
        return j2 > 300;
    }

    static native void nativeGetIOTraceStats(long j2, ArrayList<IOTraceStats> arrayList);

    static native int nativeGetLastErrorLine();

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    private static native void nativeSetIOTraceFlags(int i2);

    private SQLiteDebug() {
    }

    static {
        Covode.recordClassIndex(103033);
        SQLiteGlobal.loadLib();
    }

    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        static {
            Covode.recordClassIndex(103035);
        }

        public String toString() {
            return a.a("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", new Object[]{this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset)});
        }
    }

    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        static {
            Covode.recordClassIndex(103034);
        }

        public DbStats(String str, long j2, long j3, int i2, int i3, int i4, int i5) {
            this.dbName = str;
            this.pageSize = j3 / 1024;
            this.dbSize = (j2 * j3) / 1024;
            this.lookaside = i2;
            this.cache = i3 + "/" + i4 + "/" + i5;
        }
    }
}
