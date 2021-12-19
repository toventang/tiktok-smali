package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.l;

public final class Effect$Companion$CREATOR$1 implements Parcelable.Creator<Effect> {
    static {
        Covode.recordClassIndex(95401);
    }

    Effect$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final Effect[] newArray(int i2) {
        return new Effect[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final Effect createFromParcel(Parcel parcel) {
        Object obj;
        l.c(parcel, "");
        Effect effect = null;
        try {
            Object obj2 = Effect.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof Effect)) {
                obj = null;
            }
            effect = (Effect) obj;
        } catch (Exception e2) {
            EPLog.e("createFromParcel", "get creator failed!", e2);
        }
        return new Effect(effect);
    }
}
