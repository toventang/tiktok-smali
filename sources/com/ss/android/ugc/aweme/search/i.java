package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.Map;

public enum i {
    TOP("general"),
    USER("user"),
    VIDEO("video"),
    SOUND("music"),
    LIVE("live"),
    SHOP("shop"),
    HASHTAG("hashtag");
    
    public static final a Companion = new a((byte) 0);
    public static final Map<String, i> MAP;
    private final String tabName;

    public static final class a {
        static {
            Covode.recordClassIndex(78917);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static i a(String str) {
            l.d(str, "");
            return i.MAP.get(str);
        }
    }

    public final String getTabName() {
        return this.tabName;
    }

    static {
        Covode.recordClassIndex(78916);
        i[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(values.length), 16));
        for (i iVar : values) {
            linkedHashMap.put(iVar.tabName, iVar);
        }
        MAP = linkedHashMap;
    }

    private i(String str) {
        this.tabName = str;
    }
}
