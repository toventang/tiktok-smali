package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class CategoryPageModel {
    private CategoryEffectModel category_effects;
    private Extra extra;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102443);
    }

    public CategoryPageModel() {
        this(null, null, null, 7, null);
    }

    public static final class Extra {
        private String rec_id = "";

        static {
            Covode.recordClassIndex(102444);
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            l.c(str, "");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setUrl_prefix(List<String> list) {
        l.c(list, "");
        this.url_prefix = list;
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> list, Extra extra2) {
        l.c(list, "");
        this.category_effects = categoryEffectModel;
        this.url_prefix = list;
        this.extra = extra2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(CategoryEffectModel categoryEffectModel, List list, Extra extra2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryEffectModel, (i2 & 2) != 0 ? new ArrayList() : list, (i2 & 4) != 0 ? null : extra2);
    }
}
