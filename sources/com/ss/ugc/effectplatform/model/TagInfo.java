package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class TagInfo {
    private final String tag;

    static {
        Covode.recordClassIndex(102467);
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tagInfo.tag;
        }
        return tagInfo.copy(str);
    }

    public final String component1() {
        return this.tag;
    }

    public final TagInfo copy(String str) {
        l.c(str, "");
        return new TagInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TagInfo) && l.a(this.tag, ((TagInfo) obj).tag);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TagInfo(tag=" + this.tag + ")";
    }

    public final String getTag() {
        return this.tag;
    }

    public TagInfo(String str) {
        l.c(str, "");
        this.tag = str;
    }
}
