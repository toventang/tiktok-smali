package com.ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReactionParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<ReactionParams> CREATOR = new Parcelable.Creator<ReactionParams>() {
        /* class com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(85298);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionParams[] newArray(int i2) {
            return new ReactionParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionParams createFromParcel(Parcel parcel) {
            return new ReactionParams(parcel);
        }
    };
    @c(a = "non_reacted_video")
    public boolean nonReacted;
    @c(a = "reaction_from_id")
    public String reactionFromId;
    @c(a = "reaction_origin_id")
    public String reactionOriginId;
    @c(a = "reaction_view_id")
    public String reactionViewId;
    @c(a = "video_height")
    public int videoHeight;
    @c(a = "video_path")
    public String videoPath;
    @c(a = "video_width")
    public int videoWidth;
    @c(a = "wav_path")
    public String wavPath;
    @c(a = "react_shape_list")
    public List<CopiedReactionWindowInfo> windowInfoList = new ArrayList();

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(85297);
    }

    public ReactionParams() {
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() <= 0) {
            return false;
        }
        List<CopiedReactionWindowInfo> list = this.windowInfoList;
        list.remove(list.size() - 1);
        return true;
    }

    public void addReactionWindowInfo(CopiedReactionWindowInfo copiedReactionWindowInfo) {
        this.windowInfoList.add(copiedReactionWindowInfo);
    }

    protected ReactionParams(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.windowInfoList = parcel.createTypedArrayList(CopiedReactionWindowInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeByte(this.nonReacted ? (byte) 1 : 0);
        parcel.writeTypedList(this.windowInfoList);
    }
}
