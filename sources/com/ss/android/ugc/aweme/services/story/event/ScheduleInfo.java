package com.ss.android.ugc.aweme.services.story.event;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ScheduleInfo implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Creator();
    private final String scheduleId;
    private final Bundle scheduleParam;

    public static class Creator implements Parcelable.Creator<ScheduleInfo> {
        static {
            Covode.recordClassIndex(79829);
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ScheduleInfo(parcel.readString(), parcel.readBundle());
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo[] newArray(int i2) {
            return new ScheduleInfo[i2];
        }
    }

    static {
        Covode.recordClassIndex(79828);
    }

    public static /* synthetic */ ScheduleInfo copy$default(ScheduleInfo scheduleInfo, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scheduleInfo.scheduleId;
        }
        if ((i2 & 2) != 0) {
            bundle = scheduleInfo.scheduleParam;
        }
        return scheduleInfo.copy(str, bundle);
    }

    public final String component1() {
        return this.scheduleId;
    }

    public final Bundle component2() {
        return this.scheduleParam;
    }

    public final ScheduleInfo copy(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        return new ScheduleInfo(str, bundle);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleInfo)) {
            return false;
        }
        ScheduleInfo scheduleInfo = (ScheduleInfo) obj;
        return l.a(this.scheduleId, scheduleInfo.scheduleId) && l.a(this.scheduleParam, scheduleInfo.scheduleParam);
    }

    public final int hashCode() {
        String str = this.scheduleId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bundle bundle = this.scheduleParam;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ScheduleInfo(scheduleId=" + this.scheduleId + ", scheduleParam=" + this.scheduleParam + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.scheduleId);
        parcel.writeBundle(this.scheduleParam);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final Bundle getScheduleParam() {
        return this.scheduleParam;
    }

    public ScheduleInfo(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        this.scheduleId = str;
        this.scheduleParam = bundle;
    }
}
