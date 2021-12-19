package com.ss.android.ugc.aweme.ecommerce.router;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class SchemaFallbackConfig {
    @c(a = "fallback")
    private final String fallback;
    @c(a = "key")
    private final String key;

    static {
        Covode.recordClassIndex(54674);
    }

    public SchemaFallbackConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SchemaFallbackConfig copy$default(SchemaFallbackConfig schemaFallbackConfig, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = schemaFallbackConfig.key;
        }
        if ((i2 & 2) != 0) {
            str2 = schemaFallbackConfig.fallback;
        }
        return schemaFallbackConfig.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.fallback;
    }

    public final SchemaFallbackConfig copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new SchemaFallbackConfig(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemaFallbackConfig)) {
            return false;
        }
        SchemaFallbackConfig schemaFallbackConfig = (SchemaFallbackConfig) obj;
        return l.a(this.key, schemaFallbackConfig.key) && l.a(this.fallback, schemaFallbackConfig.fallback);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.fallback;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SchemaFallbackConfig(key=" + this.key + ", fallback=" + this.fallback + ")";
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final String getKey() {
        return this.key;
    }

    public SchemaFallbackConfig(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.key = str;
        this.fallback = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchemaFallbackConfig(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
