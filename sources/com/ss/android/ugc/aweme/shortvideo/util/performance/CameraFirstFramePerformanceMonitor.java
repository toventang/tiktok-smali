package com.ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class CameraFirstFramePerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<CameraFirstFramePerformanceMonitor> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final CameraFirstFramePerformanceMonitor f132343a = new CameraFirstFramePerformanceMonitor();

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String a() {
        return "av_video_record_init";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(1);
    }

    private CameraFirstFramePerformanceMonitor() {
    }

    public static class a implements Parcelable.Creator<CameraFirstFramePerformanceMonitor> {
        static {
            Covode.recordClassIndex(86663);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraFirstFramePerformanceMonitor[] newArray(int i2) {
            return new CameraFirstFramePerformanceMonitor[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraFirstFramePerformanceMonitor createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            if (parcel.readInt() != 0) {
                return CameraFirstFramePerformanceMonitor.f132343a;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> b() {
        return n.d("camera frame available", "PlanC onResume");
    }

    static {
        Covode.recordClassIndex(86662);
    }
}
