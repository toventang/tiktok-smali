package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class EffectListModel implements Parcelable {
    public static final Parcelable.Creator<EffectListModel> CREATOR = new Parcelable.Creator<EffectListModel>() {
        /* class com.ss.android.ugc.aweme.effect.EffectListModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(55831);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectListModel[] newArray(int i2) {
            return new EffectListModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectListModel createFromParcel(Parcel parcel) {
            return new EffectListModel(parcel);
        }
    };
    private ArrayList<EffectPointModel> mEffectPointModels;

    public int describeContents() {
        return 0;
    }

    public EffectListModel() {
    }

    static {
        Covode.recordClassIndex(55830);
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        ArrayList<EffectPointModel> arrayList = this.mEffectPointModels;
        if (arrayList == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.mEffectPointModels = arrayList;
    }

    protected EffectListModel(Parcel parcel) {
        ArrayList<EffectPointModel> arrayList = new ArrayList<>();
        this.mEffectPointModels = arrayList;
        parcel.readList(arrayList, EffectPointModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.mEffectPointModels);
    }
}
