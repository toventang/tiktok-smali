package com.ss.android.ugc.aweme.shortvideo.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;

public final class EditPreviewTO implements Parcelable {
    public static final Parcelable.Creator<EditPreviewTO> CREATOR = new a();
    private final FilterBean filterBean;
    private final String filterIntensityStoreTag;

    static {
        Covode.recordClassIndex(85067);
    }

    public static /* synthetic */ EditPreviewTO copy$default(EditPreviewTO editPreviewTO, FilterBean filterBean2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            filterBean2 = editPreviewTO.filterBean;
        }
        if ((i2 & 2) != 0) {
            str = editPreviewTO.filterIntensityStoreTag;
        }
        return editPreviewTO.copy(filterBean2, str);
    }

    public final FilterBean component1() {
        return this.filterBean;
    }

    public final String component2() {
        return this.filterIntensityStoreTag;
    }

    public final EditPreviewTO copy(FilterBean filterBean2, String str) {
        l.d(str, "");
        return new EditPreviewTO(filterBean2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewTO)) {
            return false;
        }
        EditPreviewTO editPreviewTO = (EditPreviewTO) obj;
        return l.a(this.filterBean, editPreviewTO.filterBean) && l.a(this.filterIntensityStoreTag, editPreviewTO.filterIntensityStoreTag);
    }

    public final int hashCode() {
        FilterBean filterBean2 = this.filterBean;
        int i2 = 0;
        int hashCode = (filterBean2 != null ? filterBean2.hashCode() : 0) * 31;
        String str = this.filterIntensityStoreTag;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditPreviewTO(filterBean=" + this.filterBean + ", filterIntensityStoreTag=" + this.filterIntensityStoreTag + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.filterBean, i2);
        parcel.writeString(this.filterIntensityStoreTag);
    }

    public final FilterBean getFilterBean() {
        return this.filterBean;
    }

    public final String getFilterIntensityStoreTag() {
        return this.filterIntensityStoreTag;
    }

    public static class a implements Parcelable.Creator<EditPreviewTO> {
        static {
            Covode.recordClassIndex(85068);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditPreviewTO[] newArray(int i2) {
            return new EditPreviewTO[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditPreviewTO createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EditPreviewTO((FilterBean) parcel.readParcelable(EditPreviewTO.class.getClassLoader()), parcel.readString());
        }
    }

    public EditPreviewTO(FilterBean filterBean2, String str) {
        l.d(str, "");
        this.filterBean = filterBean2;
        this.filterIntensityStoreTag = str;
    }
}
