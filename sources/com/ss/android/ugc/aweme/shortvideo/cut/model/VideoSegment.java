package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.u;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;

public class VideoSegment implements Parcelable {
    public static final Parcelable.Creator<VideoSegment> CREATOR = new Parcelable.Creator<VideoSegment>() {
        /* class com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment.AnonymousClass1 */

        static {
            Covode.recordClassIndex(82359);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoSegment[] newArray(int i2) {
            return new VideoSegment[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoSegment createFromParcel(Parcel parcel) {
            return new VideoSegment(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f125477a;

    /* renamed from: b  reason: collision with root package name */
    public long f125478b;

    /* renamed from: c  reason: collision with root package name */
    public long f125479c;

    /* renamed from: d  reason: collision with root package name */
    public long f125480d;

    /* renamed from: e  reason: collision with root package name */
    public float f125481e;

    /* renamed from: f  reason: collision with root package name */
    public int f125482f;

    /* renamed from: g  reason: collision with root package name */
    public int f125483g;

    /* renamed from: h  reason: collision with root package name */
    public String f125484h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f125485i;

    /* renamed from: j  reason: collision with root package name */
    public int f125486j;

    /* renamed from: k  reason: collision with root package name */
    public float f125487k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f125488l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public String f125489m;
    public e n;
    public boolean o;
    public boolean p;
    public int q = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public String w;
    public boolean x;
    private String y;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(82358);
    }

    public final int a() {
        if (this.r == 0) {
            h();
        }
        return this.r;
    }

    public final int b() {
        if (this.u == 0) {
            h();
        }
        return this.u;
    }

    public final int c() {
        if (this.s == 0) {
            h();
        }
        return this.s;
    }

    public final long d() {
        if (g()) {
            return this.n.getVideoStart();
        }
        return this.f125479c;
    }

    public final long e() {
        if (g()) {
            return this.n.getVideoEnd();
        }
        return this.f125480d;
    }

    public final float f() {
        if (g()) {
            return this.n.getSpeed();
        }
        return this.f125481e;
    }

    public final boolean g() {
        if (!this.o || this.n == null) {
            return false;
        }
        return true;
    }

    private void h() {
        VEUtils.VEVideoFileInfo a2;
        if (!this.x && (a2 = u.a(this.y)) != null) {
            this.f125482f = a2.width;
            this.f125483g = a2.height;
            this.r = a2.fps;
            this.u = a2.codec;
            this.s = a2.bitrate;
            this.t = a2.keyFrameCount;
        }
    }

    public final String a(boolean z) {
        if (z) {
            return new StringBuilder().append(this.f125477a).toString();
        }
        return this.y;
    }

    public final void b(long j2) {
        if (g()) {
            this.n.setVideoEnd(j2);
        } else {
            this.f125480d = j2;
        }
    }

    public VideoSegment(MediaModel mediaModel) {
        this.y = mediaModel.f109390b;
        this.f125482f = mediaModel.f109400l;
        this.f125483g = mediaModel.f109401m;
        this.f125484h = mediaModel.f109399k;
        this.f125478b = mediaModel.f109396h;
        this.f125479c = (long) mediaModel.q;
        if (mediaModel.r > 0) {
            this.f125480d = (long) mediaModel.r;
        } else {
            this.f125480d = this.f125478b;
        }
        this.f125481e = mediaModel.s;
        this.x = h.a(mediaModel);
    }

    public final void a(float f2) {
        if (g()) {
            this.n.setSpeed(1.0f);
        } else {
            this.f125481e = f2;
        }
    }

    public final void a(long j2) {
        if (g()) {
            this.n.setVideoStart(j2);
        } else {
            this.f125479c = j2;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.f125477a == videoSegment.f125477a && this.f125478b == videoSegment.f125478b && this.f125479c == videoSegment.f125479c && this.f125480d == videoSegment.f125480d && Float.compare(videoSegment.f125481e, this.f125481e) == 0 && this.f125482f == videoSegment.f125482f && this.f125483g == videoSegment.f125483g && this.f125485i == videoSegment.f125485i && (((str = this.y) == (str2 = videoSegment.y) || (str != null && str.equals(str2))) && (((str3 = this.f125484h) == (str4 = videoSegment.f125484h) || (str3 != null && str3.equals(str4))) && ((str5 = this.f125489m) == (str6 = videoSegment.f125489m) || (str5 != null && str5.equals(str6)))))) {
            return true;
        }
        return false;
    }

    protected VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f125477a = parcel.readInt();
        this.y = parcel.readString();
        this.f125478b = parcel.readLong();
        this.f125479c = parcel.readLong();
        this.f125480d = parcel.readLong();
        this.f125481e = parcel.readFloat();
        this.f125482f = parcel.readInt();
        this.f125483g = parcel.readInt();
        this.f125484h = parcel.readString();
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f125485i = z;
        this.f125486j = parcel.readInt();
        this.f125489m = parcel.readString();
        this.f125487k = parcel.readFloat();
        this.f125488l = parcel.readFloat();
        this.n = (e) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.o = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.p = z3;
        this.q = parcel.readInt();
        this.x = parcel.readByte() == 0 ? false : z4;
    }

    public final void a(String str) {
        this.y = str;
        this.x = h.a(str, false);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f125477a);
        parcel.writeString(this.y);
        parcel.writeLong(this.f125478b);
        parcel.writeLong(this.f125479c);
        parcel.writeLong(this.f125480d);
        parcel.writeFloat(this.f125481e);
        parcel.writeInt(this.f125482f);
        parcel.writeInt(this.f125483g);
        parcel.writeString(this.f125484h);
        parcel.writeByte(this.f125485i ? (byte) 1 : 0);
        parcel.writeInt(this.f125486j);
        parcel.writeString(this.f125489m);
        parcel.writeFloat(this.f125487k);
        parcel.writeFloat(this.f125488l);
        parcel.writeSerializable(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeByte(this.x ? (byte) 1 : 0);
    }

    public VideoSegment(String str, int i2, int i3, int i4) {
        this.y = str;
        this.f125482f = i2;
        this.f125483g = i3;
        this.f125484h = "";
        long j2 = (long) i4;
        this.f125478b = j2;
        this.f125480d = j2;
        this.f125481e = i.NORMAL.value();
        this.x = h.a(str, false);
    }
}
