package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ApiConfig {
    @c(a = "api_info_list")
    private final List<ApiInfo> apiInfoList;
    @c(a = "default_api_info")
    private final ApiInfo defaultApiInfo;

    static {
        Covode.recordClassIndex(17831);
    }

    public ApiConfig() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ApiConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiConfig copy$default(ApiConfig apiConfig, ApiInfo apiInfo, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            apiInfo = apiConfig.defaultApiInfo;
        }
        if ((i2 & 2) != 0) {
            list = apiConfig.apiInfoList;
        }
        return apiConfig.copy(apiInfo, list);
    }

    public final ApiInfo component1() {
        return this.defaultApiInfo;
    }

    public final List<ApiInfo> component2() {
        return this.apiInfoList;
    }

    public final ApiConfig copy(ApiInfo apiInfo, List<ApiInfo> list) {
        l.c(apiInfo, "");
        l.c(list, "");
        return new ApiConfig(apiInfo, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiConfig)) {
            return false;
        }
        ApiConfig apiConfig = (ApiConfig) obj;
        return l.a(this.defaultApiInfo, apiConfig.defaultApiInfo) && l.a(this.apiInfoList, apiConfig.apiInfoList);
    }

    public final int hashCode() {
        ApiInfo apiInfo = this.defaultApiInfo;
        int i2 = 0;
        int hashCode = (apiInfo != null ? apiInfo.hashCode() : 0) * 31;
        List<ApiInfo> list = this.apiInfoList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ApiConfig(defaultApiInfo=" + this.defaultApiInfo + ", apiInfoList=" + this.apiInfoList + ")";
    }

    public final List<ApiInfo> getApiInfoList() {
        return this.apiInfoList;
    }

    public final ApiInfo getDefaultApiInfo() {
        return this.defaultApiInfo;
    }

    public ApiConfig(ApiInfo apiInfo, List<ApiInfo> list) {
        l.c(apiInfo, "");
        l.c(list, "");
        this.defaultApiInfo = apiInfo;
        this.apiInfoList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiConfig(ApiInfo apiInfo, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ApiInfo(null, null, null, null, null, null, 63, null) : apiInfo, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
