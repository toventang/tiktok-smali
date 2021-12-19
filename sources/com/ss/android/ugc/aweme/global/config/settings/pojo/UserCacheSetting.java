package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UserCacheSetting {
    @c(a = "enable_ru_cache")
    private Integer enableRuCache;
    @c(a = "enable_ru_insert")
    private Integer enableRuInsert;
    @c(a = "ru_cache_intervals")
    private Long ruCacheIntervals;

    static {
        Covode.recordClassIndex(63105);
    }

    public Integer getEnableRuCache() {
        Integer num = this.enableRuCache;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getEnableRuInsert() {
        Integer num = this.enableRuInsert;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Long getRuCacheIntervals() {
        Long l2 = this.ruCacheIntervals;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }
}
