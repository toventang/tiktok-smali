package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.b.l;

public final class StitchContext implements Parcelable {
    public static final Parcelable.Creator<StitchContext> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public StitchParams f124773a;

    /* renamed from: b  reason: collision with root package name */
    public TimeSpeedModelExtension f124774b;

    static {
        Covode.recordClassIndex(81985);
    }

    public StitchContext(byte b2) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchContext)) {
            return false;
        }
        StitchContext stitchContext = (StitchContext) obj;
        return l.a(this.f124773a, stitchContext.f124773a) && l.a(this.f124774b, stitchContext.f124774b);
    }

    public final int hashCode() {
        StitchParams stitchParams = this.f124773a;
        int i2 = 0;
        int hashCode = (stitchParams != null ? stitchParams.hashCode() : 0) * 31;
        TimeSpeedModelExtension timeSpeedModelExtension = this.f124774b;
        if (timeSpeedModelExtension != null) {
            i2 = timeSpeedModelExtension.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StitchContext(stitchParams=" + this.f124773a + ", stitchClip=" + this.f124774b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.f124773a, i2);
        parcel.writeParcelable(this.f124774b, i2);
    }

    public static class a implements Parcelable.Creator<StitchContext> {
        static {
            Covode.recordClassIndex(81986);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StitchContext[] newArray(int i2) {
            return new StitchContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StitchContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StitchContext((StitchParams) parcel.readParcelable(StitchContext.class.getClassLoader()), (TimeSpeedModelExtension) parcel.readParcelable(StitchContext.class.getClassLoader()));
        }
    }

    private /* synthetic */ StitchContext() {
        this(null, null);
    }

    public StitchContext(StitchParams stitchParams, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f124773a = stitchParams;
        this.f124774b = timeSpeedModelExtension;
    }
}
