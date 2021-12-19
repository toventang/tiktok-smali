package com.ss.android.ugc.aweme.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class NearbyCities implements Parcelable {
    public static final Parcelable.Creator<NearbyCities> CREATOR = new Parcelable.Creator<NearbyCities>() {
        /* class com.ss.android.ugc.aweme.feed.model.NearbyCities.AnonymousClass1 */

        static {
            Covode.recordClassIndex(59426);
        }

        @Override // android.os.Parcelable.Creator
        public final NearbyCities[] newArray(int i2) {
            return new NearbyCities[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final NearbyCities createFromParcel(Parcel parcel) {
            return new NearbyCities(parcel);
        }
    };
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    public int describeContents() {
        return 0;
    }

    public NearbyCities() {
    }

    public static class CityBean implements Parcelable, Comparable<CityBean> {
        public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() {
            /* class com.ss.android.ugc.aweme.feed.model.NearbyCities.CityBean.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59428);
            }

            @Override // android.os.Parcelable.Creator
            public final CityBean[] newArray(int i2) {
                return new CityBean[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final CityBean createFromParcel(Parcel parcel) {
                return new CityBean(parcel);
            }
        };
        @c(a = "ad_code")
        public String adCode;
        @c(a = "cn_pinyin")
        public String cnPinyin;
        public String code;
        @c(a = "code_local")
        public String codeLocal;
        @c(a = "country")
        public String country;
        @c(a = "country_code")
        public String countryCode;
        @c(a = "current_position_name")
        public String currentPositionName;
        @c(a = "districts")
        public List<CityBean> districts;
        public String en;
        public boolean isL3;
        public String l2Name = "";
        public String name;
        @c(a = "name_en")
        public String nameEn;
        @c(a = "nearby_label_name")
        public String nearbyLabelName;
        @c(a = "nearby_tab_name")
        public String nearbyTabName;
        @c(a = "show_name")
        public String showName;
        @c(a = "show_type")
        public int showType;

        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        static {
            Covode.recordClassIndex(59427);
        }

        protected CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.en = parcel.readString();
        }

        public int compareTo(CityBean cityBean) {
            boolean z = this.isL3;
            if (z && !cityBean.isL3) {
                return 1;
            }
            if ((!z && cityBean.isL3) || TextUtils.isEmpty(this.cnPinyin)) {
                return -1;
            }
            if (TextUtils.isEmpty(cityBean.cnPinyin)) {
                return 1;
            }
            return this.cnPinyin.compareTo(cityBean.cnPinyin);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.en);
        }
    }

    static {
        Covode.recordClassIndex(59425);
    }

    protected NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        this.all = parcel.createTypedArrayList(CityBean.CREATOR);
        this.hot = parcel.createTypedArrayList(CityBean.CREATOR);
        this.old = parcel.createTypedArrayList(CityBean.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.current, i2);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
