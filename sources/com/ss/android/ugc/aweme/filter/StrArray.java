package com.ss.android.ugc.aweme.filter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StrArray implements Parcelable, Serializable {
    public static final Parcelable.Creator<StrArray> CREATOR = new Parcelable.Creator<StrArray>() {
        /* class com.ss.android.ugc.aweme.filter.StrArray.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60485);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrArray[] newArray(int i2) {
            return new StrArray[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrArray createFromParcel(Parcel parcel) {
            return new StrArray(parcel, (byte) 0);
        }
    };
    private List<String> mItems;
    private List<Integer> numbers;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(60484);
    }

    public void reset() {
        this.mItems.clear();
        this.numbers.clear();
    }

    public StrArray() {
        this.mItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.numbers = arrayList;
        arrayList.add(-1);
    }

    public void addIndex() {
        int size = this.mItems.size();
        if (size > 0) {
            this.numbers.add(Integer.valueOf(size - 1));
        }
    }

    public void removeLast() {
        if (!this.mItems.isEmpty()) {
            List<String> list = this.mItems;
            list.remove(list.size() - 1);
        }
    }

    public void removeLastArray() {
        int size = this.mItems.size();
        int size2 = this.numbers.size();
        if (size > 0 && size2 > 1) {
            int intValue = this.numbers.get(size2 - 2).intValue();
            for (int i2 = size - 1; i2 > intValue; i2--) {
                this.mItems.remove(i2);
            }
            this.numbers.remove(size2 - 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(this.mItems.get(i2));
            if (i2 != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void add(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mItems.add(str);
        }
    }

    public static StrArray from(String str) {
        StrArray strArray = new StrArray();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                strArray.add(str2);
            }
        }
        return strArray;
    }

    private StrArray(Parcel parcel) {
        this.numbers = new ArrayList();
        this.mItems = parcel.createStringArrayList();
        parcel.readList(this.numbers, Integer.class.getClassLoader());
    }

    /* synthetic */ StrArray(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.mItems);
        parcel.writeList(this.numbers);
    }
}
