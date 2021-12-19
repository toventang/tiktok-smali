package com.ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExtendedUrlModelTemplate extends ExtendedUrlModel implements Serializable {
    private final transient ExtendedUrlModel kUrlModel;
    private List<String> urlList;
    private List<String> zipUrlList;

    static {
        Covode.recordClassIndex(95594);
    }

    public ExtendedUrlModelTemplate() {
        this(null, 1, null);
    }

    public ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    public List<String> getUrlList() {
        List<String> url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    public List<String> getZipUrlList() {
        List<String> zip_url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    public ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel) {
        super(null, null, null, 7, null);
        this.kUrlModel = extendedUrlModel;
        this.zipUrlList = new ArrayList();
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> list) {
        l.c(list, "");
        this.urlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    public void setZipUrlList(List<String> list) {
        l.c(list, "");
        this.zipUrlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : extendedUrlModel);
    }
}
