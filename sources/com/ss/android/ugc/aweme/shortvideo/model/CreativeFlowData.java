package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class CreativeFlowData implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeFlowData> CREATOR = new Creator();
    @c(a = "open_extra_share_options")
    private HashMap<String, Integer> extraShareOptions;
    @c(a = "music_info")
    private FlowDataMusicInfo flowDataMusicInfo;
    @c(a = "shoot_extra_data")
    private ShootExtraData shootExtraData;
    @c(a = "tag")
    private String tag;

    public static class Creator implements Parcelable.Creator<CreativeFlowData> {
        static {
            Covode.recordClassIndex(84434);
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData createFromParcel(Parcel parcel) {
            HashMap hashMap;
            l.d(parcel, "");
            String readString = parcel.readString();
            FlowDataMusicInfo flowDataMusicInfo = null;
            ShootExtraData createFromParcel = parcel.readInt() != 0 ? ShootExtraData.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                while (readInt != 0) {
                    hashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    readInt--;
                }
            } else {
                hashMap = null;
            }
            if (parcel.readInt() != 0) {
                flowDataMusicInfo = FlowDataMusicInfo.CREATOR.createFromParcel(parcel);
            }
            return new CreativeFlowData(readString, createFromParcel, hashMap, flowDataMusicInfo);
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData[] newArray(int i2) {
            return new CreativeFlowData[i2];
        }
    }

    static {
        Covode.recordClassIndex(84433);
    }

    public CreativeFlowData() {
        this(null, null, null, null, 15, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.tag);
        ShootExtraData shootExtraData2 = this.shootExtraData;
        if (shootExtraData2 != null) {
            parcel.writeInt(1);
            shootExtraData2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        HashMap<String, Integer> hashMap = this.extraShareOptions;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeInt(entry.getValue().intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        FlowDataMusicInfo flowDataMusicInfo2 = this.flowDataMusicInfo;
        if (flowDataMusicInfo2 != null) {
            parcel.writeInt(1);
            flowDataMusicInfo2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final HashMap<String, Integer> getExtraShareOptions() {
        return this.extraShareOptions;
    }

    public final FlowDataMusicInfo getFlowDataMusicInfo() {
        return this.flowDataMusicInfo;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setExtraShareOptions(HashMap<String, Integer> hashMap) {
        this.extraShareOptions = hashMap;
    }

    public final void setFlowDataMusicInfo(FlowDataMusicInfo flowDataMusicInfo2) {
        this.flowDataMusicInfo = flowDataMusicInfo2;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData2) {
        this.shootExtraData = shootExtraData2;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public CreativeFlowData(String str, ShootExtraData shootExtraData2, HashMap<String, Integer> hashMap, FlowDataMusicInfo flowDataMusicInfo2) {
        this.tag = str;
        this.shootExtraData = shootExtraData2;
        this.extraShareOptions = hashMap;
        this.flowDataMusicInfo = flowDataMusicInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreativeFlowData(String str, ShootExtraData shootExtraData2, HashMap hashMap, FlowDataMusicInfo flowDataMusicInfo2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : shootExtraData2, (i2 & 4) != 0 ? null : hashMap, (i2 & 8) != 0 ? null : flowDataMusicInfo2);
    }
}
