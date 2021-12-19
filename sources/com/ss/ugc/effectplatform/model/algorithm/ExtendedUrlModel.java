package com.ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.n;
import java.util.ArrayList;
import java.util.List;

public class ExtendedUrlModel {
    private String uri;
    private List<String> url_list;
    private List<String> zip_url_list;

    static {
        Covode.recordClassIndex(102473);
    }

    public ExtendedUrlModel() {
        this(null, null, null, 7, null);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        l.c(list, "");
        this.url_list = list;
    }

    public void setZip_url_list(List<String> list) {
        l.c(list, "");
        this.zip_url_list = list;
    }

    public final List<String> getUrl(b bVar) {
        l.c(bVar, "");
        int i2 = a.f153649a[bVar.ordinal()];
        if (i2 == 1) {
            return getZip_url_list();
        }
        if (i2 == 2) {
            return getUrl_list();
        }
        throw new n();
    }

    public ExtendedUrlModel(List<String> list, String str, List<String> list2) {
        l.c(list, "");
        l.c(list2, "");
        this.url_list = list;
        this.uri = str;
        this.zip_url_list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(List list, String str, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? new ArrayList() : list2);
    }
}
