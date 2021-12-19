package com.ss.android.ugc.aweme.tools;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class ToolsUrlModel implements Parcelable {
    public static final Parcelable.Creator<ToolsUrlModel> CREATOR = new Parcelable.Creator<ToolsUrlModel>() {
        /* class com.ss.android.ugc.aweme.tools.ToolsUrlModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(90749);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ToolsUrlModel[] newArray(int i2) {
            return new ToolsUrlModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ToolsUrlModel createFromParcel(Parcel parcel) {
            return new ToolsUrlModel(parcel);
        }
    };
    @c(a = "uri")

    /* renamed from: a  reason: collision with root package name */
    public String f138732a;
    @c(a = "url_list")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f138733b;

    public int describeContents() {
        return 0;
    }

    public ToolsUrlModel() {
    }

    static {
        Covode.recordClassIndex(90748);
    }

    public int hashCode() {
        return (this.f138732a.hashCode() * 31) + this.f138733b.hashCode();
    }

    public String toString() {
        return "ToolsUrlModel{uri='" + this.f138732a + '\'' + ", urlList=" + this.f138733b + '}';
    }

    protected ToolsUrlModel(Parcel parcel) {
        this.f138732a = parcel.readString();
        this.f138733b = parcel.createStringArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.f138732a.equals(toolsUrlModel.f138732a)) {
            return false;
        }
        return this.f138733b.equals(toolsUrlModel.f138733b);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f138732a);
        parcel.writeStringList(this.f138733b);
    }
}
