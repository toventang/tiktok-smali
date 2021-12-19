package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class SearchNilInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String HIT_CORE_TABLE = "hit_core_table";
    public static final String HIT_HEAT_SPEECH = "hate_speech";
    public static final String HIT_LIMIT = "hit_limit";
    public static final int HIT_TYPE_SENSITIVE = 12;
    @c(a = "search_nil_item")
    private String nilItem;
    @c(a = "text_type")
    private Integer textType;

    public static final class Companion {
        static {
            Covode.recordClassIndex(50952);
        }

        private Companion() {
        }

        public final String getHIT_CORE_TABLE() {
            return SearchNilInfo.HIT_CORE_TABLE;
        }

        public final String getHIT_HEAT_SPEECH() {
            return SearchNilInfo.HIT_HEAT_SPEECH;
        }

        public final String getHIT_LIMIT() {
            return SearchNilInfo.HIT_LIMIT;
        }

        public final int getHIT_TYPE_SENSITIVE() {
            return SearchNilInfo.HIT_TYPE_SENSITIVE;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getNilItem() {
        return this.nilItem;
    }

    public final Integer getTextType() {
        return this.textType;
    }

    public final boolean isHate() {
        return HIT_HEAT_SPEECH.equals(this.nilItem);
    }

    public final boolean isHitCoreTable() {
        return HIT_CORE_TABLE.equals(this.nilItem);
    }

    public final boolean isHitLimit() {
        return HIT_LIMIT.equals(this.nilItem);
    }

    public final boolean isSensitive() {
        return Integer.valueOf(HIT_TYPE_SENSITIVE).equals(this.textType);
    }

    static {
        Covode.recordClassIndex(50951);
    }

    public final void setNilItem(String str) {
        this.nilItem = str;
    }

    public final void setTextType(Integer num) {
        this.textType = num;
    }
}
