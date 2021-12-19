package com.bytedance.ies.powerpreload.task;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TaskTraceMetric implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f34535a;

    /* renamed from: b  reason: collision with root package name */
    public long f34536b;

    /* renamed from: c  reason: collision with root package name */
    public long f34537c;

    /* renamed from: d  reason: collision with root package name */
    public long f34538d;

    /* renamed from: e  reason: collision with root package name */
    public long f34539e;

    static {
        Covode.recordClassIndex(20658);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<TaskTraceMetric> {
        static {
            Covode.recordClassIndex(20659);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TaskTraceMetric[] newArray(int i2) {
            return new TaskTraceMetric[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaskTraceMetric createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            return new TaskTraceMetric(parcel);
        }
    }

    public TaskTraceMetric() {
        this.f34535a = SystemClock.elapsedRealtime();
    }

    public final void a() {
        this.f34536b = 0;
        this.f34537c = 0;
        this.f34538d = 0;
        this.f34539e = 0;
    }

    public final String toString() {
        return "initTime=" + this.f34535a + "&taskExecuteStartTime=" + this.f34536b + '&' + "taskExecuteEndTime=" + this.f34537c + "&shootStartTime=" + this.f34538d + "&shootEndTime=" + this.f34539e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TaskTraceMetric(Parcel parcel) {
        this();
        l.c(parcel, "");
        this.f34535a = parcel.readLong();
        this.f34536b = parcel.readLong();
        this.f34537c = parcel.readLong();
        this.f34538d = parcel.readLong();
        this.f34539e = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeLong(this.f34535a);
        parcel.writeLong(this.f34536b);
        parcel.writeLong(this.f34537c);
        parcel.writeLong(this.f34538d);
        parcel.writeLong(this.f34539e);
    }
}
