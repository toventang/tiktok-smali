package com.ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ListReviewData implements Parcelable {
    public static final Parcelable.Creator<ListReviewData> CREATOR = new a();
    @c(a = "review_items")

    /* renamed from: a  reason: collision with root package name */
    public final List<ReviewItemStruct> f87045a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f87046b;
    @c(a = "next_cursor")

    /* renamed from: c  reason: collision with root package name */
    public final int f87047c;
    @c(a = "review_filters")

    /* renamed from: d  reason: collision with root package name */
    public final List<ReviewFilterStruct> f87048d;
    @c(a = "no_allow_feedback")

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f87049e;

    static {
        Covode.recordClassIndex(54613);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListReviewData)) {
            return false;
        }
        ListReviewData listReviewData = (ListReviewData) obj;
        return l.a(this.f87045a, listReviewData.f87045a) && this.f87046b == listReviewData.f87046b && this.f87047c == listReviewData.f87047c && l.a(this.f87048d, listReviewData.f87048d) && l.a(this.f87049e, listReviewData.f87049e);
    }

    public final int hashCode() {
        List<ReviewItemStruct> list = this.f87045a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f87046b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((hashCode + i3) * 31) + this.f87047c) * 31;
        List<ReviewFilterStruct> list2 = this.f87048d;
        int hashCode2 = (i6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.f87049e;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ListReviewData(reviewItems=" + this.f87045a + ", hasMore=" + this.f87046b + ", nextCursor=" + this.f87047c + ", reviewFilter=" + this.f87048d + ", noAllowFeedback=" + this.f87049e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<ReviewItemStruct> list = this.f87045a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewItemStruct reviewItemStruct : list) {
                reviewItemStruct.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f87046b ? 1 : 0);
        parcel.writeInt(this.f87047c);
        List<ReviewFilterStruct> list2 = this.f87048d;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ReviewFilterStruct reviewFilterStruct : list2) {
                reviewFilterStruct.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f87049e;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ListReviewData> {
        static {
            Covode.recordClassIndex(54614);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ListReviewData[] newArray(int i2) {
            return new ListReviewData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ListReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            l.d(parcel, "");
            Boolean bool = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList2.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            return new ListReviewData(arrayList, z2, readInt2, arrayList2, bool);
        }
    }

    private /* synthetic */ ListReviewData() {
        this(null, false, 0, null, false);
    }

    public ListReviewData(List<ReviewItemStruct> list, boolean z, int i2, List<ReviewFilterStruct> list2, Boolean bool) {
        this.f87045a = list;
        this.f87046b = z;
        this.f87047c = i2;
        this.f87048d = list2;
        this.f87049e = bool;
    }
}
