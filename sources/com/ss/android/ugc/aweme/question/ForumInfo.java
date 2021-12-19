package com.ss.android.ugc.aweme.question;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ForumInfo implements Parcelable {
    public static final Parcelable.Creator<ForumInfo> CREATOR = new a();
    @c(a = "forum_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f119877a;
    @c(a = "forum_status")

    /* renamed from: b  reason: collision with root package name */
    public final int f119878b;
    @c(a = "invited_users")

    /* renamed from: c  reason: collision with root package name */
    public final List<Long> f119879c;

    static {
        Covode.recordClassIndex(77885);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumInfo)) {
            return false;
        }
        ForumInfo forumInfo = (ForumInfo) obj;
        return this.f119877a == forumInfo.f119877a && this.f119878b == forumInfo.f119878b && l.a(this.f119879c, forumInfo.f119879c);
    }

    public final int hashCode() {
        int i2 = ((this.f119877a * 31) + this.f119878b) * 31;
        List<Long> list = this.f119879c;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ForumInfo(forumType=" + this.f119877a + ", forumStatus=" + this.f119878b + ", inviteUserList=" + this.f119879c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f119877a);
        parcel.writeInt(this.f119878b);
        List<Long> list = this.f119879c;
        parcel.writeInt(list.size());
        for (Long l2 : list) {
            parcel.writeLong(l2.longValue());
        }
    }

    public static class a implements Parcelable.Creator<ForumInfo> {
        static {
            Covode.recordClassIndex(77886);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ForumInfo[] newArray(int i2) {
            return new ForumInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ForumInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(Long.valueOf(parcel.readLong()));
                readInt3--;
            }
            return new ForumInfo(readInt, readInt2, arrayList);
        }
    }

    public ForumInfo(int i2, int i3, List<Long> list) {
        l.d(list, "");
        this.f119877a = i2;
        this.f119878b = i3;
        this.f119879c = list;
    }
}
