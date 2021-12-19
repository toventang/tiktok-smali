package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GameTag {
    public static final a Companion = new a((byte) 0);
    @c(a = "full_name")
    public String fullName;
    @c(a = "id")
    public Long id;
    private boolean selected;
    @c(a = "short_name")
    public String shortName;
    @c(a = "show_name")
    public String showName;

    static {
        Covode.recordClassIndex(11276);
    }

    public GameTag() {
        this(null, null, null, null, 15, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11277);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Map<String, String> a(GameTag gameTag) {
            if (gameTag == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key_id", String.valueOf(gameTag.id));
            String str = gameTag.showName;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            linkedHashMap.put("key_show_name", str);
            String str3 = gameTag.shortName;
            if (str3 == null) {
                str3 = str2;
            }
            linkedHashMap.put("key_short_name", str3);
            String str4 = gameTag.fullName;
            if (str4 != null) {
                str2 = str4;
            }
            linkedHashMap.put("key_full_name", str2);
            return linkedHashMap;
        }

        public static GameTag a(Map<String, String> map) {
            long j2;
            if (map == null || map.isEmpty()) {
                return null;
            }
            GameTag gameTag = new GameTag(null, null, null, null, 15, null);
            String str = map.get("key_id");
            if (str != null) {
                j2 = Long.parseLong(str);
            } else {
                j2 = 0;
            }
            gameTag.id = Long.valueOf(j2);
            String str2 = map.get("key_show_name");
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            gameTag.showName = str2;
            String str4 = map.get("key_short_name");
            if (str4 == null) {
                str4 = str3;
            }
            gameTag.shortName = str4;
            String str5 = map.get("key_full_name");
            if (str5 != null) {
                str3 = str5;
            }
            gameTag.fullName = str3;
            return gameTag;
        }
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean isNonGameItem() {
        Long l2 = this.id;
        if (l2 != null && l2.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isOtherGameItem() {
        Long l2 = this.id;
        if (l2 != null && l2.longValue() == -1) {
            return true;
        }
        return false;
    }

    public final boolean isNonGameOrOtherGameItem() {
        Long l2 = this.id;
        if (l2 != null && l2.longValue() == -1) {
            return true;
        }
        Long l3 = this.id;
        if (l3 != null && l3.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "GameTag(id=" + this.id + ", showName=" + this.showName + ", shortName=" + this.shortName + ", fullName=" + this.fullName + ", selected=" + this.selected + ')';
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public GameTag(Long l2, String str, String str2, String str3) {
        this.id = l2;
        this.showName = str;
        this.shortName = str2;
        this.fullName = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GameTag(Long l2, String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0L : l2, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
