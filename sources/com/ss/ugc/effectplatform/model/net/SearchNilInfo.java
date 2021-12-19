package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class SearchNilInfo {
    private String is_load_more;
    private String search_nil_item;
    private String search_nil_type;
    private Integer text_type;

    static {
        Covode.recordClassIndex(102522);
    }

    public SearchNilInfo() {
        this(null, null, null, null, 15, null);
    }

    public final String getSearch_nil_item() {
        return this.search_nil_item;
    }

    public final String getSearch_nil_type() {
        return this.search_nil_type;
    }

    public final Integer getText_type() {
        return this.text_type;
    }

    public final String is_load_more() {
        return this.is_load_more;
    }

    public final void setSearch_nil_item(String str) {
        this.search_nil_item = str;
    }

    public final void setSearch_nil_type(String str) {
        this.search_nil_type = str;
    }

    public final void setText_type(Integer num) {
        this.text_type = num;
    }

    public final void set_load_more(String str) {
        this.is_load_more = str;
    }

    public SearchNilInfo(String str, String str2, String str3, Integer num) {
        this.search_nil_type = str;
        this.is_load_more = str2;
        this.search_nil_item = str3;
        this.text_type = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchNilInfo(String str, String str2, String str3, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : num);
    }
}
