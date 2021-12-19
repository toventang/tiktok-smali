package com.ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class CutSameEditData implements Parcelable {
    public static final Parcelable.Creator<CutSameEditData> CREATOR = new a();
    @c(a = "conactFilePath")

    /* renamed from: a  reason: collision with root package name */
    public final String f83140a;
    @c(a = "conactWorksapceId")

    /* renamed from: b  reason: collision with root package name */
    public final String f83141b;
    @c(a = "originTextList")

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f83142c;
    @c(a = "lastTextList")

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f83143d;
    @c(a = "cutsame_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f83144e;
    @c(a = "music_id")

    /* renamed from: f  reason: collision with root package name */
    public final String f83145f;
    @c(a = "src_video_data_list")

    /* renamed from: g  reason: collision with root package name */
    public final List<EditVideoSegment> f83146g;
    @c(a = "is_h5")

    /* renamed from: h  reason: collision with root package name */
    public final boolean f83147h;
    @c(a = "open_sdk_share_id")

    /* renamed from: i  reason: collision with root package name */
    public final String f83148i;
    @c(a = "open_client_key")

    /* renamed from: j  reason: collision with root package name */
    public final String f83149j;

    static {
        Covode.recordClassIndex(51847);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameEditData)) {
            return false;
        }
        CutSameEditData cutSameEditData = (CutSameEditData) obj;
        return l.a(this.f83140a, cutSameEditData.f83140a) && l.a(this.f83141b, cutSameEditData.f83141b) && l.a(this.f83142c, cutSameEditData.f83142c) && l.a(this.f83143d, cutSameEditData.f83143d) && l.a(this.f83144e, cutSameEditData.f83144e) && l.a(this.f83145f, cutSameEditData.f83145f) && l.a(this.f83146g, cutSameEditData.f83146g) && this.f83147h == cutSameEditData.f83147h && l.a(this.f83148i, cutSameEditData.f83148i) && l.a(this.f83149j, cutSameEditData.f83149j);
    }

    public final int hashCode() {
        String str = this.f83140a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83141b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f83142c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f83143d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f83144e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83145f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<EditVideoSegment> list3 = this.f83146g;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z = this.f83147h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        String str5 = this.f83148i;
        int hashCode8 = (i6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f83149j;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "CutSameEditData(conactFilePath=" + this.f83140a + ", conactWorksapceId=" + this.f83141b + ", originTextList=" + this.f83142c + ", lastTextList=" + this.f83143d + ", cutSameMvId=" + this.f83144e + ", musicId=" + this.f83145f + ", videoSegmentDataList=" + this.f83146g + ", isH5From=" + this.f83147h + ", openSdkShareId=" + this.f83148i + ", openClientKey=" + this.f83149j + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f83140a);
        parcel.writeString(this.f83141b);
        parcel.writeStringList(this.f83142c);
        parcel.writeStringList(this.f83143d);
        parcel.writeString(this.f83144e);
        parcel.writeString(this.f83145f);
        List<EditVideoSegment> list = this.f83146g;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EditVideoSegment editVideoSegment : list) {
                parcel.writeParcelable(editVideoSegment, i2);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f83147h ? 1 : 0);
        parcel.writeString(this.f83148i);
        parcel.writeString(this.f83149j);
    }

    public static class a implements Parcelable.Creator<CutSameEditData> {
        static {
            Covode.recordClassIndex(51848);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutSameEditData[] newArray(int i2) {
            return new CutSameEditData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutSameEditData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readParcelable(CutSameEditData.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new CutSameEditData(readString, readString2, createStringArrayList, createStringArrayList2, readString3, readString4, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }
    }

    public final List<String> a() {
        List<String> list = this.f83143d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.f83142c;
        if (list2 == null || list2.isEmpty()) {
            return this.f83143d;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.f83143d) {
            if (!this.f83142c.contains(t) && !TextUtils.isEmpty(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public CutSameEditData(String str, String str2, List<String> list, List<String> list2, String str3, String str4, List<EditVideoSegment> list3, boolean z, String str5, String str6) {
        this.f83140a = str;
        this.f83141b = str2;
        this.f83142c = list;
        this.f83143d = list2;
        this.f83144e = str3;
        this.f83145f = str4;
        this.f83146g = list3;
        this.f83147h = z;
        this.f83148i = str5;
        this.f83149j = str6;
    }
}
