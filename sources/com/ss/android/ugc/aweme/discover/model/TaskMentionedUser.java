package com.ss.android.ugc.aweme.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class TaskMentionedUser implements Parcelable, Serializable {
    public static final Parcelable.Creator<TaskMentionedUser> CREATOR = new Parcelable.Creator<TaskMentionedUser>() {
        /* class com.ss.android.ugc.aweme.discover.model.TaskMentionedUser.AnonymousClass1 */

        static {
            Covode.recordClassIndex(50977);
        }

        @Override // android.os.Parcelable.Creator
        public final TaskMentionedUser[] newArray(int i2) {
            return new TaskMentionedUser[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final TaskMentionedUser createFromParcel(Parcel parcel) {
            return new TaskMentionedUser(parcel);
        }
    };
    @c(a = "nickname")
    private String nickname;
    @c(a = "sec_uid")
    private String secUid = "";
    @c(a = "uid")
    private String userId = "";

    public int describeContents() {
        return 0;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUserId() {
        return this.userId;
    }

    static {
        Covode.recordClassIndex(50976);
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    protected TaskMentionedUser(Parcel parcel) {
        this.userId = parcel.readString();
        this.secUid = parcel.readString();
        this.nickname = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.nickname);
    }
}
