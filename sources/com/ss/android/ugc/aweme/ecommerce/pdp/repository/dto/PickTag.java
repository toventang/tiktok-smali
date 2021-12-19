package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class PickTag implements Parcelable {
    public static final Parcelable.Creator<PickTag> CREATOR = new a();
    @c(a = "activity_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f86619a;
    @c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public final String f86620b;
    @c(a = "icon")

    /* renamed from: c  reason: collision with root package name */
    public final Image f86621c;
    @c(a = "log_extra")

    /* renamed from: d  reason: collision with root package name */
    public final String f86622d;

    static {
        Covode.recordClassIndex(54259);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickTag)) {
            return false;
        }
        PickTag pickTag = (PickTag) obj;
        return l.a(this.f86619a, pickTag.f86619a) && l.a(this.f86620b, pickTag.f86620b) && l.a(this.f86621c, pickTag.f86621c) && l.a(this.f86622d, pickTag.f86622d);
    }

    public final int hashCode() {
        String str = this.f86619a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86620b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f86621c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f86622d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PickTag(activityId=" + this.f86619a + ", name=" + this.f86620b + ", icon=" + this.f86621c + ", logExtra=" + this.f86622d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86619a);
        parcel.writeString(this.f86620b);
        Image image = this.f86621c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86622d);
    }

    public static class a implements Parcelable.Creator<PickTag> {
        static {
            Covode.recordClassIndex(54260);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PickTag[] newArray(int i2) {
            return new PickTag[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PickTag createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PickTag(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    private /* synthetic */ PickTag() {
        this(null, null, null, null);
    }

    public PickTag(String str, String str2, Image image, String str3) {
        this.f86619a = str;
        this.f86620b = str2;
        this.f86621c = image;
        this.f86622d = str3;
    }
}
