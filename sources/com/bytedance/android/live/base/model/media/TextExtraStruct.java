package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class TextExtraStruct implements Parcelable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() {
        /* class com.bytedance.android.live.base.model.media.TextExtraStruct.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3613);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextExtraStruct[] newArray(int i2) {
            return new TextExtraStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextExtraStruct createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }
    };
    @c(a = "end")
    private int end;
    private transient boolean isAddPosition;
    @c(a = "start")
    private int start;
    @c(a = "user_id")
    private long userId;

    public int describeContents() {
        return 0;
    }

    public TextExtraStruct() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    static {
        Covode.recordClassIndex(3612);
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i2) {
        this.end = i2;
    }

    public void setStart(int i2) {
        this.start = i2;
    }

    public void setUserId(long j2) {
        this.userId = j2;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}
