package com.ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class TextStruct implements Parcelable {
    public static final Parcelable.Creator<TextStruct> CREATOR = new a();
    @c(a = "anchors")
    private final List<CreateAnchorInfo> anchors;

    static {
        Covode.recordClassIndex(88107);
    }

    public TextStruct() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.TextStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStruct copy$default(TextStruct textStruct, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = textStruct.anchors;
        }
        return textStruct.copy(list);
    }

    public final List<CreateAnchorInfo> component1() {
        return this.anchors;
    }

    public final TextStruct copy(List<CreateAnchorInfo> list) {
        l.d(list, "");
        return new TextStruct(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStruct) && l.a(this.anchors, ((TextStruct) obj).anchors);
        }
        return true;
    }

    public final int hashCode() {
        List<CreateAnchorInfo> list = this.anchors;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextStruct(anchors=" + this.anchors + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<CreateAnchorInfo> list = this.anchors;
        parcel.writeInt(list.size());
        for (CreateAnchorInfo createAnchorInfo : list) {
            createAnchorInfo.writeToParcel(parcel, 0);
        }
    }

    public final List<CreateAnchorInfo> getAnchors() {
        return this.anchors;
    }

    public static class a implements Parcelable.Creator<TextStruct> {
        static {
            Covode.recordClassIndex(88108);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStruct[] newArray(int i2) {
            return new TextStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStruct createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(CreateAnchorInfo.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new TextStruct(arrayList);
        }
    }

    public TextStruct(List<CreateAnchorInfo> list) {
        l.d(list, "");
        this.anchors = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStruct(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list);
    }
}
