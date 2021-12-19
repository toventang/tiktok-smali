package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class MusicCategory {
    public final String categoryId;
    public final String categoryName;

    static {
        Covode.recordClassIndex(71667);
    }

    public MusicCategory() {
        this(null, null, 3, null);
    }

    public MusicCategory(String str) {
        this(str, null, 2, null);
    }

    public static /* synthetic */ MusicCategory copy$default(MusicCategory musicCategory, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicCategory.categoryName;
        }
        if ((i2 & 2) != 0) {
            str2 = musicCategory.categoryId;
        }
        return musicCategory.copy(str, str2);
    }

    public final MusicCategory copy(String str, String str2) {
        return new MusicCategory(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicCategory)) {
            return false;
        }
        MusicCategory musicCategory = (MusicCategory) obj;
        return l.a(this.categoryName, musicCategory.categoryName) && l.a(this.categoryId, musicCategory.categoryId);
    }

    public final int hashCode() {
        String str = this.categoryName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.categoryId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MusicCategory(categoryName=" + this.categoryName + ", categoryId=" + this.categoryId + ")";
    }

    public MusicCategory(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicCategory(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
