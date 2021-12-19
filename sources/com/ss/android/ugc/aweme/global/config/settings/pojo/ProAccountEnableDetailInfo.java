package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class ProAccountEnableDetailInfo {
    @c(a = "can_set_pro_g")
    private Boolean canSetProaccountGender;
    @c(a = "category_list")
    private List<CategoryStruct> categoryList = new ArrayList();
    @c(a = "category_page_text")
    private CategoryPageTextStruct categoryPageText;
    @c(a = "is_proaccount_display")
    private Integer isProaccountDisplay;
    @c(a = "siwa_skip_bind")
    private Boolean siwaSkipBind;
    @c(a = "welcome_page_list")
    private List<WelcomePageTextStruct> welcomePageList = new ArrayList();

    static {
        Covode.recordClassIndex(63065);
    }

    public List<CategoryStruct> getCategoryList() {
        return this.categoryList;
    }

    public List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcomePageList;
    }

    public Boolean getCanSetProaccountGender() {
        Boolean bool = this.canSetProaccountGender;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public CategoryPageTextStruct getCategoryPageText() {
        CategoryPageTextStruct categoryPageTextStruct = this.categoryPageText;
        if (categoryPageTextStruct != null) {
            return categoryPageTextStruct;
        }
        throw new a();
    }

    public Integer getIsProaccountDisplay() {
        Integer num = this.isProaccountDisplay;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getSiwaSkipBind() {
        Boolean bool = this.siwaSkipBind;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
