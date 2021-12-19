package com.bytedance.disk.parcel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.h.c;

public class MigrationOpt implements Parcelable {
    public static final Parcelable.Creator<MigrationOpt> CREATOR = new Parcelable.Creator<MigrationOpt>() {
        /* class com.bytedance.disk.parcel.MigrationOpt.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16830);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MigrationOpt[] newArray(int i2) {
            return new MigrationOpt[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrationOpt createFromParcel(Parcel parcel) {
            return new MigrationOpt(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f28637a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f28638b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f28639c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f28640d = "";

    /* renamed from: e  reason: collision with root package name */
    public int f28641e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f28642f;

    /* renamed from: g  reason: collision with root package name */
    public long f28643g;

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? "unknown" : "dir" : "normal";
    }

    public int describeContents() {
        return 0;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static f.a<MigrationOpt> f28644a = new f.c(20);

        static {
            Covode.recordClassIndex(16831);
        }

        public static MigrationOpt a() {
            MigrationOpt acquire = f28644a.acquire();
            if (acquire == null) {
                return new MigrationOpt();
            }
            return acquire;
        }

        public static void a(MigrationOpt migrationOpt) {
            if (migrationOpt != null) {
                migrationOpt.a();
                f28644a.release(migrationOpt);
            }
        }
    }

    static {
        Covode.recordClassIndex(16829);
    }

    public MigrationOpt() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f28637a = "";
        this.f28638b = "";
        this.f28639c = "";
        this.f28640d = "";
        this.f28641e = -1;
        this.f28643g = -1;
        this.f28642f = 0;
    }

    public String toString() {
        return "MigrationOpt={dir->" + this.f28637a + " reason->" + this.f28638b + " from->" + this.f28639c + " to->" + this.f28640d + " option->" + this.f28641e + " fileLen->" + this.f28643g + " type->" + a(this.f28642f) + "}";
    }

    public boolean equals(Object obj) {
        MigrationOpt migrationOpt = (MigrationOpt) obj;
        if (!TextUtils.equals(this.f28639c, migrationOpt.f28639c) || !TextUtils.equals(this.f28640d, migrationOpt.f28640d)) {
            return false;
        }
        return true;
    }

    protected MigrationOpt(Parcel parcel) {
        this.f28637a = parcel.readString();
        this.f28638b = parcel.readString();
        this.f28639c = parcel.readString();
        this.f28640d = parcel.readString();
        this.f28641e = parcel.readInt();
        this.f28643g = parcel.readLong();
        this.f28642f = parcel.readInt();
    }

    public static MigrationOpt a(MigrationOpt migrationOpt) {
        if (migrationOpt == null) {
            return null;
        }
        MigrationOpt a2 = a.a();
        a2.f28638b = migrationOpt.f28638b;
        a2.f28637a = c.c(migrationOpt.f28637a);
        a2.f28639c = c.c(migrationOpt.f28639c);
        a2.f28640d = c.c(migrationOpt.f28640d);
        a2.f28641e = migrationOpt.f28641e;
        a2.f28643g = migrationOpt.f28643g;
        a2.f28642f = migrationOpt.f28642f;
        return a2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28637a);
        parcel.writeString(this.f28638b);
        parcel.writeString(this.f28639c);
        parcel.writeString(this.f28640d);
        parcel.writeInt(this.f28641e);
        parcel.writeLong(this.f28643g);
        parcel.writeInt(this.f28642f);
    }

    public static boolean a(MigrationOpt migrationOpt, boolean z) {
        int i2;
        if (migrationOpt != null && (i2 = migrationOpt.f28641e) >= 0 && i2 <= 4 && !TextUtils.isEmpty(migrationOpt.f28638b) && !TextUtils.isEmpty(migrationOpt.f28639c) && !TextUtils.isEmpty(migrationOpt.f28640d) && !TextUtils.equals(migrationOpt.f28639c, migrationOpt.f28640d) && c.a(migrationOpt.f28639c, z) && (TextUtils.equals("valid_path", migrationOpt.f28640d) || c.a(migrationOpt.f28640d, false))) {
            return true;
        }
        return false;
    }
}
