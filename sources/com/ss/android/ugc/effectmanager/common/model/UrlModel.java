package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public class UrlModel extends UrlModelTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<UrlModel> CREATOR = new UrlModel$Companion$CREATOR$1();
    public static final Companion Companion = new Companion(null);
    private final transient com.ss.ugc.effectplatform.model.UrlModel urlModel;

    public UrlModel() {
        this(null, 1, null);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95305);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public com.ss.ugc.effectplatform.model.UrlModel getUrlModel() {
        return this.urlModel;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    static {
        Covode.recordClassIndex(95304);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (uri = urlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (url_list = urlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUri(String str) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void setUrlList(List<String> list) {
        l.c(list, "");
        super.setUrlList(list);
    }

    public UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel2) {
        super(urlModel2);
        this.urlModel = urlModel2;
        com.ss.ugc.effectplatform.model.UrlModel urlModel3 = getUrlModel();
        if (urlModel3 != null) {
            String uri = urlModel3.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = urlModel3.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUrl_list(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel, com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        if (getUrlModel() != null) {
            com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
            if (urlModel2 != null) {
                urlModel2.writeToParcel(parcel, i2);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : urlModel2);
    }
}
