package com.ss.android.ugc.tools.g;

import com.bytedance.covode.number.Covode;

public enum c {
    SEARCH_PROP_RECOMMEND_LIST("search_prop_recommendation_list_shown_success_rate"),
    SEARCH_PROP("search_prop_success_rate"),
    SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL("service_creative_record_segments_delete_illegal");
    
    private final String serviceName;

    public final String getServiceName() {
        return this.serviceName;
    }

    static {
        Covode.recordClassIndex(98254);
    }

    private c(String str) {
        this.serviceName = str;
    }
}
