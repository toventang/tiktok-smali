package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.l;

public final class UrlModel$Companion$CREATOR$1 implements Parcelable.Creator<UrlModel> {
    static {
        Covode.recordClassIndex(95306);
    }

    UrlModel$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final UrlModel[] newArray(int i2) {
        return new UrlModel[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final UrlModel createFromParcel(Parcel parcel) {
        Object obj;
        l.c(parcel, "");
        UrlModel urlModel = null;
        try {
            Object obj2 = UrlModel.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof UrlModel)) {
                obj = null;
            }
            urlModel = (UrlModel) obj;
        } catch (Exception e2) {
            EPLog.e("createFromParcel", "get creator failed!", e2);
        }
        return new UrlModel(urlModel);
    }
}
