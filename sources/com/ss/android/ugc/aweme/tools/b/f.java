package com.ss.android.ugc.aweme.tools.b;

import com.bytedance.covode.number.Covode;

public enum f {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");
    
    public final String intentKey;

    static {
        Covode.recordClassIndex(90762);
    }

    private f(String str) {
        this.intentKey = str;
    }
}
