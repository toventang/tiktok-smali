package android.support.v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* class android.support.v4.media.RatingCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(115);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f658a;

    /* renamed from: b  reason: collision with root package name */
    private final float f659b;

    /* renamed from: c  reason: collision with root package name */
    private Object f660c;

    public final int describeContents() {
        return this.f658a;
    }

    static {
        Covode.recordClassIndex(114);
    }

    public final String toString() {
        String valueOf;
        StringBuilder append = new StringBuilder("Rating:style=").append(this.f658a).append(" rating=");
        float f2 = this.f659b;
        if (f2 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f2);
        }
        return append.append(valueOf).toString();
    }

    public static RatingCompat a(Object obj) {
        float f2;
        RatingCompat ratingCompat = null;
        if (obj != null) {
            int i2 = Build.VERSION.SDK_INT;
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ratingCompat = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f3 = 1.0f;
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f3 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f3);
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f3 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f3);
                        break;
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f2 = 3.0f;
                        } else if (ratingStyle == 4) {
                            f2 = 4.0f;
                        } else if (ratingStyle == 5) {
                            f2 = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f2) {
                            ratingCompat = new RatingCompat(ratingStyle, starRating);
                            break;
                        }
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            ratingCompat = new RatingCompat(6, percentRating);
                            break;
                        }
                    default:
                        return null;
                }
            }
            ratingCompat.f660c = obj;
        }
        return ratingCompat;
    }

    RatingCompat(int i2, float f2) {
        this.f658a = i2;
        this.f659b = f2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f658a);
        parcel.writeFloat(this.f659b);
    }
}
