package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class FetchInfo implements Parcelable {
    public static final Parcelable.Creator<FetchInfo> CREATOR = new a();
    @c(a = "fetch_api_type")
    private final Integer fetchAPI;
    @c(a = "server_issued_params")
    private final String serverIssuedParams;

    static {
        Covode.recordClassIndex(52838);
    }

    public static /* synthetic */ FetchInfo copy$default(FetchInfo fetchInfo, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = fetchInfo.fetchAPI;
        }
        if ((i2 & 2) != 0) {
            str = fetchInfo.serverIssuedParams;
        }
        return fetchInfo.copy(num, str);
    }

    public final Integer component1() {
        return this.fetchAPI;
    }

    public final String component2() {
        return this.serverIssuedParams;
    }

    public final FetchInfo copy(Integer num, String str) {
        return new FetchInfo(num, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchInfo)) {
            return false;
        }
        FetchInfo fetchInfo = (FetchInfo) obj;
        return l.a(this.fetchAPI, fetchInfo.fetchAPI) && l.a(this.serverIssuedParams, fetchInfo.serverIssuedParams);
    }

    public final int hashCode() {
        Integer num = this.fetchAPI;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.serverIssuedParams;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FetchInfo(fetchAPI=" + this.fetchAPI + ", serverIssuedParams=" + this.serverIssuedParams + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        l.d(parcel, "");
        Integer num = this.fetchAPI;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.serverIssuedParams);
    }

    public final Integer getFetchAPI() {
        return this.fetchAPI;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    public static class a implements Parcelable.Creator<FetchInfo> {
        static {
            Covode.recordClassIndex(52839);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FetchInfo[] newArray(int i2) {
            return new FetchInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FetchInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new FetchInfo(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }
    }

    public FetchInfo(Integer num, String str) {
        this.fetchAPI = num;
        this.serverIssuedParams = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchInfo(Integer num, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : num, str);
    }
}
