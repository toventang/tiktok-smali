package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import h.f.b.l;

public final class EffectCategoryResponse$Companion$CREATOR$1 implements Parcelable.Creator<EffectCategoryResponse> {
    static {
        Covode.recordClassIndex(95405);
    }

    EffectCategoryResponse$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final EffectCategoryResponse[] newArray(int i2) {
        return new EffectCategoryResponse[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final EffectCategoryResponse createFromParcel(Parcel parcel) {
        Object obj;
        l.c(parcel, "");
        EffectCategoryResponse effectCategoryResponse = null;
        try {
            Object obj2 = EffectCategoryResponse.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof EffectCategoryResponse)) {
                obj = null;
            }
            effectCategoryResponse = (EffectCategoryResponse) obj;
        } catch (Exception e2) {
            EPLog.e("createFromParcel", "get creator failed!", e2);
        }
        return new EffectCategoryResponse(effectCategoryResponse);
    }
}
