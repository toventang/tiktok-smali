package com.ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class OpenAlbumPanelPerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final OpenAlbumPanelPerformanceMonitor f132344a = new OpenAlbumPanelPerformanceMonitor();

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String a() {
        return "tool_performance_open_album_panel";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(1);
    }

    private OpenAlbumPanelPerformanceMonitor() {
    }

    public static class a implements Parcelable.Creator<OpenAlbumPanelPerformanceMonitor> {
        static {
            Covode.recordClassIndex(86665);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenAlbumPanelPerformanceMonitor[] newArray(int i2) {
            return new OpenAlbumPanelPerformanceMonitor[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenAlbumPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            if (parcel.readInt() != 0) {
                return OpenAlbumPanelPerformanceMonitor.f132344a;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> b() {
        return n.d("imageLoaded", "animationEnded");
    }

    static {
        Covode.recordClassIndex(86664);
    }
}
