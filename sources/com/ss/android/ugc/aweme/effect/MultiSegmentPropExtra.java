package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class MultiSegmentPropExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiSegmentPropExtra> CREATOR = new a();
    @c(a = "clips")
    private final List<ClipsModel> clips;

    static {
        Covode.recordClassIndex(55838);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSegmentPropExtra copy$default(MultiSegmentPropExtra multiSegmentPropExtra, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = multiSegmentPropExtra.clips;
        }
        return multiSegmentPropExtra.copy(list);
    }

    public final List<ClipsModel> component1() {
        return this.clips;
    }

    public final MultiSegmentPropExtra copy(List<ClipsModel> list) {
        l.d(list, "");
        return new MultiSegmentPropExtra(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MultiSegmentPropExtra) && l.a(this.clips, ((MultiSegmentPropExtra) obj).clips);
        }
        return true;
    }

    public final int hashCode() {
        List<ClipsModel> list = this.clips;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiSegmentPropExtra(clips=" + this.clips + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<ClipsModel> list = this.clips;
        parcel.writeInt(list.size());
        for (ClipsModel clipsModel : list) {
            clipsModel.writeToParcel(parcel, 0);
        }
    }

    public final List<ClipsModel> getClips() {
        return this.clips;
    }

    public static class a implements Parcelable.Creator<MultiSegmentPropExtra> {
        static {
            Covode.recordClassIndex(55839);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiSegmentPropExtra[] newArray(int i2) {
            return new MultiSegmentPropExtra[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiSegmentPropExtra createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(ClipsModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new MultiSegmentPropExtra(arrayList);
        }
    }

    public final boolean checkValid() {
        boolean z;
        if (this.clips.size() <= 6) {
            z = true;
        } else {
            z = false;
        }
        double d2 = 0.0d;
        for (T t : this.clips) {
            double duration = (double) t.getDuration();
            Double.isNaN(duration);
            d2 += duration;
            if (!z || ((double) t.getDuration()) <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || d2 > 60.0d) {
            return false;
        }
        return true;
    }

    public MultiSegmentPropExtra(List<ClipsModel> list) {
        l.d(list, "");
        this.clips = list;
    }
}
