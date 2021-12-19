package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class SocialModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SocialModel> CREATOR = new Parcelable.Creator<SocialModel>() {
        /* class com.ss.android.ugc.aweme.shortvideo.model.SocialModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(84485);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialModel[] newArray(int i2) {
            return new SocialModel[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final SocialModel createFromParcel(Parcel parcel) {
            return new SocialModel(parcel);
        }
    };
    @c(a = "friends")
    public List<String> friends;
    @c(a = "rec_users")
    public List<String> recUsers;
    @c(a = "recommend")
    public int recommend;

    public int describeContents() {
        return 0;
    }

    public SocialModel() {
    }

    static {
        Covode.recordClassIndex(84484);
    }

    public String getFriends() {
        List<String> list = this.friends;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.friends);
    }

    public String getRecUsers() {
        List<String> list = this.recUsers;
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.recUsers);
    }

    protected SocialModel(Parcel parcel) {
        this.recommend = parcel.readInt();
        this.friends = parcel.createStringArrayList();
        this.recUsers = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.recommend);
        parcel.writeStringList(this.friends);
        parcel.writeStringList(this.recUsers);
    }
}
