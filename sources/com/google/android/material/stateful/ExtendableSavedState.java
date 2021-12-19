package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.c.g;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() {
        /* class com.google.android.material.stateful.ExtendableSavedState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32601);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, (byte) 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final g<String, Bundle> f52628a;

    static {
        Covode.recordClassIndex(32600);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f52628a + "}";
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f52628a = new g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f52628a = new g<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f52628a.put(strArr[i2], bundleArr[i2]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f52628a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f52628a.b(i3);
            bundleArr[i3] = this.f52628a.c(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, byte b2) {
        this(parcel, classLoader);
    }
}
