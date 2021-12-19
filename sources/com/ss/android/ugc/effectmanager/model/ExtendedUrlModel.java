package com.ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ExtendedUrlModel extends ExtendedUrlModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel;

    static {
        Covode.recordClassIndex(95593);
    }

    public ExtendedUrlModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final List<String> getZipUrlList() {
        return super.getZipUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (uri = kUrlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final List<String> getZip_url_list() {
        List<String> zip_url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setUri(String str) {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final void setUrlList(List<String> list) {
        l.c(list, "");
        super.setUrlList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final void setZipUrlList(List<String> list) {
        l.c(list, "");
        super.setZipUrlList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setUrl_list(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setZip_url_list(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    public ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        super(extendedUrlModel);
        this.kUrlModel = extendedUrlModel;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            String uri = kUrlModel2.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = kUrlModel2.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
            List<String> zip_url_list = kUrlModel2.getZip_url_list();
            if (zip_url_list != null) {
                super.setZip_url_list(zip_url_list);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : extendedUrlModel);
    }
}
