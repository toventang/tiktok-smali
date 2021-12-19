package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.j;

/* access modifiers changed from: package-private */
public class GroupRecord implements Parcelable {
    public static final Parcelable.Creator<GroupRecord> CREATOR = new Parcelable.Creator<GroupRecord>() {
        /* class com.bytedance.scene.group.GroupRecord.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26283);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GroupRecord[] newArray(int i2) {
            return new GroupRecord[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GroupRecord createFromParcel(Parcel parcel) {
            return new GroupRecord(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    int f42806a = -1;

    /* renamed from: b  reason: collision with root package name */
    j f42807b;

    /* renamed from: c  reason: collision with root package name */
    String f42808c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42809d;

    /* renamed from: e  reason: collision with root package name */
    boolean f42810e;

    /* renamed from: f  reason: collision with root package name */
    String f42811f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f42812g;

    public int describeContents() {
        return 0;
    }

    public GroupRecord() {
    }

    static {
        Covode.recordClassIndex(26282);
    }

    protected GroupRecord(Parcel parcel) {
        boolean z;
        this.f42806a = parcel.readInt();
        this.f42808c = (String) k.a((Object) parcel.readString(), "tag not found in Parcel");
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f42809d = z;
        this.f42810e = parcel.readByte() == 0 ? false : z2;
        this.f42811f = (String) k.a((Object) parcel.readString(), "class name not found in Parcel");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f42806a);
        parcel.writeString(this.f42808c);
        parcel.writeByte(this.f42809d ? (byte) 1 : 0);
        parcel.writeByte(this.f42810e ? (byte) 1 : 0);
        parcel.writeString(this.f42811f);
    }
}
