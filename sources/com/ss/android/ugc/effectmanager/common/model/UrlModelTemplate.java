package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UrlModelTemplate extends UrlModel implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private List<String> urlList;
    private final transient UrlModel urlModel;

    public static class Creator implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(95308);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            return new UrlModelTemplate((UrlModel) parcel.readParcelable(UrlModelTemplate.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new UrlModelTemplate[i2];
        }
    }

    static {
        Covode.recordClassIndex(95307);
    }

    public UrlModelTemplate() {
        this(null, 1, null);
    }

    public static /* synthetic */ void urlList$annotations() {
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeParcelable(this.urlModel, i2);
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final boolean isValid() {
        List<String> urlList2 = getUrlList();
        if (urlList2 == null || urlList2.isEmpty()) {
            return false;
        }
        return true;
    }

    public List<String> getUrlList() {
        List<String> url_list;
        UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (url_list = urlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String toString() {
        String urlModel2;
        UrlModel urlModel3 = getUrlModel();
        if (urlModel3 == null || (urlModel2 = urlModel3.toString()) == null) {
            return super.toString();
        }
        return urlModel2;
    }

    public UrlModelTemplate(UrlModel urlModel2) {
        super(null, null, 3, null);
        this.urlModel = urlModel2;
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> list) {
        l.c(list, "");
        this.urlList = list;
        UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModelTemplate(UrlModel urlModel2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : urlModel2);
    }
}
