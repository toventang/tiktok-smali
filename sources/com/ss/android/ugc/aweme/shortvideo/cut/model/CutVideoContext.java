package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.utils.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CutVideoContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<CutVideoContext> CREATOR = new Parcelable.Creator<CutVideoContext>() {
        /* class com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext.AnonymousClass1 */

        static {
            Covode.recordClassIndex(82356);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutVideoContext[] newArray(int i2) {
            return new CutVideoContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutVideoContext createFromParcel(Parcel parcel) {
            return new CutVideoContext(parcel);
        }
    };
    public float totalSpeed;
    private List<VideoSegment> videoSegmentList;

    public int describeContents() {
        return 0;
    }

    public CutVideoContext() {
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.videoSegmentList;
    }

    static {
        Covode.recordClassIndex(82355);
    }

    public void resetVideoSegmentList() {
        if (!d.a(this.videoSegmentList)) {
            for (int i2 = 0; i2 < this.videoSegmentList.size(); i2++) {
                VideoSegment videoSegment = this.videoSegmentList.get(i2);
                videoSegment.f125479c = 0;
                videoSegment.f125480d = videoSegment.f125478b;
                videoSegment.f125481e = i.NORMAL.value();
                videoSegment.f125486j = 0;
                videoSegment.f125485i = false;
            }
        }
    }

    public void setSpeed(float f2) {
        this.totalSpeed = f2;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.videoSegmentList = list;
    }

    protected CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.videoSegmentList = arrayList;
        parcel.readList(arrayList, VideoSegment.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble((double) this.totalSpeed);
        parcel.writeList(this.videoSegmentList);
    }
}
