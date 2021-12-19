package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import h.f.b.l;

public final class ResourceListModel$Companion$CREATOR$1 implements Parcelable.Creator<ResourceListModel> {
    static {
        Covode.recordClassIndex(95420);
    }

    ResourceListModel$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel[] newArray(int i2) {
        return new ResourceListModel[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel createFromParcel(Parcel parcel) {
        Object obj;
        l.c(parcel, "");
        ResourceListModel resourceListModel = null;
        try {
            Object obj2 = ResourceListModel.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof ResourceListModel)) {
                obj = null;
            }
            resourceListModel = (ResourceListModel) obj;
        } catch (Exception e2) {
            EPLog.e("createFromParcel", "get creator failed!", e2);
        }
        return new ResourceListModel(resourceListModel);
    }
}
