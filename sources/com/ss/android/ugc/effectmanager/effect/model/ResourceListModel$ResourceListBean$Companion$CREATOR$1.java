package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import h.f.b.l;

public final class ResourceListModel$ResourceListBean$Companion$CREATOR$1 implements Parcelable.Creator<ResourceListModel.ResourceListBean> {
    static {
        Covode.recordClassIndex(95423);
    }

    ResourceListModel$ResourceListBean$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel.ResourceListBean[] newArray(int i2) {
        return new ResourceListModel.ResourceListBean[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel.ResourceListBean createFromParcel(Parcel parcel) {
        Object obj;
        l.c(parcel, "");
        ResourceListModel.ResourceListBean resourceListBean = null;
        try {
            Object obj2 = ResourceListModel.ResourceListBean.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof ResourceListModel.ResourceListBean)) {
                obj = null;
            }
            resourceListBean = (ResourceListModel.ResourceListBean) obj;
        } catch (Exception e2) {
            EPLog.e("createFromParcel", "get creator failed!", e2);
        }
        return new ResourceListModel.ResourceListBean(resourceListBean);
    }
}
