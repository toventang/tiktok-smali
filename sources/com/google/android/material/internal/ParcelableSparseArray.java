package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSparseArray>() {
        /* class com.google.android.material.internal.ParcelableSparseArray.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32538);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new ParcelableSparseArray[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }
    };

    public int describeContents() {
        return 0;
    }

    public ParcelableSparseArray() {
    }

    static {
        Covode.recordClassIndex(32537);
    }

    public ParcelableSparseArray(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < readInt; i2++) {
            put(iArr[i2], readParcelableArray[i2]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.os.Parcelable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public void writeToParcel(Parcel parcel, int i2) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = keyAt(i3);
            parcelableArr[i3] = valueAt(i3);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
