package com.bytedance.disk.parcel;

import android.database.Cursor;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.h.c;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicInteger;

public class MigrationItem implements Parcelable, Comparable {
    public static final Parcelable.Creator<MigrationItem> CREATOR = new Parcelable.Creator<MigrationItem>() {
        /* class com.bytedance.disk.parcel.MigrationItem.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16827);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MigrationItem[] newArray(int i2) {
            return new MigrationItem[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrationItem createFromParcel(Parcel parcel) {
            return new MigrationItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public AtomicInteger f28628a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public long f28629b = -1;

    /* renamed from: c  reason: collision with root package name */
    public MigrationOpt f28630c;

    /* renamed from: d  reason: collision with root package name */
    public long f28631d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f28632e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f28633f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f28634g = false;

    /* renamed from: h  reason: collision with root package name */
    public ConditionVariable f28635h = new ConditionVariable(true);

    public int describeContents() {
        return 0;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static f.a<MigrationItem> f28636a = new f.c(20);

        static {
            Covode.recordClassIndex(16828);
        }

        public static MigrationItem a() {
            MigrationItem acquire = f28636a.acquire();
            if (acquire == null) {
                return new MigrationItem();
            }
            return acquire;
        }

        public static void a(MigrationItem migrationItem) {
            if (migrationItem != null) {
                if (migrationItem.f28630c != null) {
                    MigrationOpt.a.a(migrationItem.f28630c);
                }
                migrationItem.b();
                f28636a.release(migrationItem);
            }
        }
    }

    static {
        Covode.recordClassIndex(16826);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f28635h.open();
        this.f28628a.set(1);
        this.f28629b = -1;
        this.f28630c = null;
        this.f28631d = 0;
        this.f28632e = 0;
        this.f28633f = -1;
        this.f28634g = false;
    }

    public final boolean c() {
        boolean z;
        MethodCollector.i(2032);
        synchronized (this.f28628a) {
            try {
                if ((this.f28628a.get() & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(2032);
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        MethodCollector.i(2033);
        synchronized (this.f28628a) {
            try {
                if ((this.f28628a.get() & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(2033);
            }
        }
        return z;
    }

    public MigrationItem() {
    }

    public final void a() {
        MigrationOpt migrationOpt = this.f28630c;
        if (migrationOpt != null && migrationOpt.f28642f == 0) {
            MigrationOpt migrationOpt2 = this.f28630c;
            migrationOpt2.f28642f = c.a(migrationOpt2.f28639c);
            if (this.f28630c.f28642f == 2 && TextUtils.isEmpty(this.f28630c.f28637a)) {
                MigrationOpt migrationOpt3 = this.f28630c;
                migrationOpt3.f28637a = migrationOpt3.f28639c;
            }
            MigrationOpt migrationOpt4 = this.f28630c;
            migrationOpt4.f28643g = c.b(migrationOpt4.f28639c);
        }
    }

    public final boolean e() {
        boolean z;
        MethodCollector.i(2034);
        synchronized (this.f28628a) {
            try {
                if ((this.f28628a.get() & 32768) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(2034);
            }
        }
        return z;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder append = new StringBuilder("MigrationItem{hash=").append(hashCode()).append(", _id=").append(this.f28629b).append(", ").append(this.f28630c).append(", stat=");
        int i2 = this.f28628a.get();
        if ((32768 & i2) != 0) {
            str = "<delayDel>";
        } else {
            str = "<quickDel>";
        }
        if ((i2 & 1) != 0) {
            str2 = "normal".concat(str);
        } else if ((i2 & 2) != 0) {
            str2 = "suspend".concat(str);
        } else if ((i2 & 4) != 0) {
            str2 = "canceled".concat(str);
        } else {
            str2 = "unknown";
        }
        return append.append(str2).append(", eventTime=").append(this.f28631d).append(", elapsedTime=").append(this.f28632e).append(", event=").append(com.bytedance.disk.e.a.a.a(this.f28633f)).append(", deleted=").append(this.f28634g).append('}').toString();
    }

    public final void a(long j2) {
        this.f28635h.block(j2);
    }

    public boolean equals(Object obj) {
        return this.f28630c.equals(((MigrationItem) obj).f28630c);
    }

    public final void b(boolean z) {
        int i2;
        MethodCollector.i(2036);
        synchronized (this.f28628a) {
            try {
                int i3 = this.f28628a.get() & 32768;
                if (z) {
                    i2 = i3 | 2;
                } else {
                    i2 = i3 | 1;
                }
                this.f28628a.set(i2);
            } finally {
                MethodCollector.o(2036);
            }
        }
    }

    public final void c(boolean z) {
        int i2;
        MethodCollector.i(2037);
        synchronized (this.f28628a) {
            try {
                int i3 = this.f28628a.get();
                if (z) {
                    i2 = 32768 | i3;
                } else {
                    i2 = -32769 & i3;
                }
                this.f28628a.set(i2);
            } finally {
                MethodCollector.o(2037);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        MigrationItem migrationItem = (MigrationItem) obj;
        MigrationOpt migrationOpt = this.f28630c;
        if (migrationOpt == null || migrationItem.f28630c == null) {
            return Long.valueOf(this.f28631d).compareTo(Long.valueOf(this.f28631d));
        }
        return Long.valueOf(migrationOpt.f28643g).compareTo(Long.valueOf(migrationItem.f28630c.f28643g));
    }

    protected MigrationItem(Parcel parcel) {
        boolean z = true;
        this.f28629b = parcel.readLong();
        this.f28630c = (MigrationOpt) parcel.readParcelable(MigrationOpt.class.getClassLoader());
        this.f28631d = parcel.readLong();
        this.f28632e = parcel.readLong();
        this.f28633f = parcel.readInt();
        this.f28634g = parcel.readInt() != 1 ? false : z;
        this.f28628a.set(parcel.readInt());
    }

    public static MigrationItem a(Cursor cursor) {
        MigrationOpt a2 = MigrationOpt.a.a();
        MigrationItem a3 = a.a();
        a3.f28630c = a2;
        boolean z = false;
        a3.f28629b = cursor.getLong(0);
        a2.f28637a = cursor.getString(1);
        a2.f28638b = cursor.getString(2);
        a2.f28643g = cursor.getLong(3);
        a2.f28639c = cursor.getString(4);
        a2.f28640d = cursor.getString(5);
        try {
            if (!TextUtils.isEmpty(a2.f28637a)) {
                a2.f28637a = c.a(a2.f28637a, 0);
            }
            a2.f28639c = c.a(a2.f28639c, 0);
            a2.f28640d = c.a(a2.f28640d, 0);
        } catch (Exception unused) {
        }
        a2.f28641e = cursor.getInt(6);
        a2.f28642f = cursor.getInt(7);
        a3.f28633f = cursor.getInt(8);
        a3.f28631d = cursor.getLong(9);
        a3.f28632e = cursor.getLong(10);
        if (cursor.getInt(11) == 1) {
            z = true;
        }
        a3.f28634g = z;
        return a3;
    }

    public final void a(boolean z) {
        int i2;
        MethodCollector.i(2035);
        synchronized (this.f28628a) {
            try {
                int i3 = this.f28628a.get() & 32768;
                if (z) {
                    i2 = i3 | 4;
                } else {
                    i2 = i3 | 1;
                }
                this.f28628a.set(i2);
            } finally {
                MethodCollector.o(2035);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f28629b);
        parcel.writeParcelable(this.f28630c, i2);
        parcel.writeLong(this.f28631d);
        parcel.writeLong(this.f28632e);
        parcel.writeInt(this.f28633f);
        parcel.writeInt(this.f28634g ? 1 : 0);
        parcel.writeInt(this.f28628a.get());
    }

    public static MigrationItem a(MigrationItem migrationItem, boolean z) {
        long j2;
        int i2;
        long j3;
        if (migrationItem == null) {
            return null;
        }
        MigrationItem a2 = a.a();
        a2.f28630c = MigrationOpt.a(migrationItem.f28630c);
        long j4 = -1;
        if (z) {
            j2 = -1;
        } else {
            j2 = migrationItem.f28629b;
        }
        a2.f28629b = j2;
        if (z) {
            i2 = -1;
        } else {
            i2 = migrationItem.f28633f;
        }
        a2.f28633f = i2;
        if (z) {
            j3 = System.currentTimeMillis();
        } else {
            j3 = migrationItem.f28631d;
        }
        a2.f28631d = j3;
        if (!z) {
            j4 = migrationItem.f28632e;
        }
        a2.f28632e = j4;
        a2.f28628a.set(migrationItem.f28628a.get());
        a2.f28634g = migrationItem.f28634g;
        return a2;
    }
}
