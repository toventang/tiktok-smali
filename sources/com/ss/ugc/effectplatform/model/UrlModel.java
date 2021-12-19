package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class UrlModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String uri;
    private List<String> url_list;

    public static class a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102469);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            return new UrlModel(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new UrlModel[i2];
        }
    }

    static {
        Covode.recordClassIndex(102468);
    }

    public UrlModel() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public int hashCode() {
        Integer num;
        int i2;
        List<String> url_list2 = getUrl_list();
        if (url_list2 != null) {
            num = Integer.valueOf(url_list2.hashCode());
        } else {
            num = null;
        }
        int intValue = num.intValue() * 31;
        String uri2 = getUri();
        if (uri2 != null) {
            i2 = uri2.hashCode();
        } else {
            i2 = 0;
        }
        return intValue + i2;
    }

    public String toString() {
        return "UrlModel(url_list=" + getUrl_list() + ", uri=" + getUri() + ')';
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        l.c(list, "");
        this.url_list = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (!(!l.a(getUrl_list(), urlModel.getUrl_list())) && !(!l.a((Object) getUri(), (Object) urlModel.getUri()))) {
            return true;
        }
        return false;
    }

    public UrlModel(List<String> list, String str) {
        l.c(list, "");
        this.url_list = list;
        this.uri = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(List list, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str);
    }
}
