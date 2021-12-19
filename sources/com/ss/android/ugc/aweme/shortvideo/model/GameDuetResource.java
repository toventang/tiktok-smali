package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class GameDuetResource implements Parcelable {
    public static final Parcelable.Creator<GameDuetResource> CREATOR = new Parcelable.Creator<GameDuetResource>() {
        /* class com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource.AnonymousClass1 */

        static {
            Covode.recordClassIndex(84445);
        }

        @Override // android.os.Parcelable.Creator
        public final GameDuetResource[] newArray(int i2) {
            return new GameDuetResource[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final GameDuetResource createFromParcel(Parcel parcel) {
            return new GameDuetResource(parcel);
        }
    };
    public int gameScore;
    public Effect gameSticker;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(84444);
    }

    protected GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
    }

    public GameDuetResource(int i2, Effect effect) {
        this.gameScore = i2;
        this.gameSticker = effect;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i2);
    }
}
