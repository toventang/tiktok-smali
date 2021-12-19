package com.ss.android.ugc.aweme.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class OpenMusicPanelPerformanceMonitor implements PerformanceMonitor {
    public static final Parcelable.Creator<OpenMusicPanelPerformanceMonitor> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final OpenMusicPanelPerformanceMonitor f114756a = new OpenMusicPanelPerformanceMonitor();

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final String a() {
        return "tool_performance_open_choose_music_panel";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(1);
    }

    private OpenMusicPanelPerformanceMonitor() {
    }

    public static class a implements Parcelable.Creator<OpenMusicPanelPerformanceMonitor> {
        static {
            Covode.recordClassIndex(73837);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenMusicPanelPerformanceMonitor[] newArray(int i2) {
            return new OpenMusicPanelPerformanceMonitor[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenMusicPanelPerformanceMonitor createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            if (parcel.readInt() != 0) {
                return OpenMusicPanelPerformanceMonitor.f114756a;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.PerformanceMonitor
    public final List<String> b() {
        return n.d("animation_finished", "set_music_data");
    }

    static {
        Covode.recordClassIndex(73836);
    }
}
