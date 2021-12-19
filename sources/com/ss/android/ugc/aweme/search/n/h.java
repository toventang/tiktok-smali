package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.Map;

public final class h implements Serializable {
    private String searchId;
    private String searchKeyword;
    private String searchPosition;
    private final Map<String, String> searchTrackMap;
    private int tabIndex;

    static {
        Covode.recordClassIndex(79175);
    }

    public h() {
        this(0, null, null, null, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_search_source_SearchMutableData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.search.n.h */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h copy$default(h hVar, int i2, String str, String str2, String str3, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = hVar.tabIndex;
        }
        if ((i3 & 2) != 0) {
            str = hVar.searchPosition;
        }
        if ((i3 & 4) != 0) {
            str2 = hVar.searchId;
        }
        if ((i3 & 8) != 0) {
            str3 = hVar.searchKeyword;
        }
        if ((i3 & 16) != 0) {
            map = hVar.searchTrackMap;
        }
        return hVar.copy(i2, str, str2, str3, map);
    }

    public final int component1() {
        return this.tabIndex;
    }

    public final String component2() {
        return this.searchPosition;
    }

    public final String component3() {
        return this.searchId;
    }

    public final String component4() {
        return this.searchKeyword;
    }

    public final Map<String, String> component5() {
        return this.searchTrackMap;
    }

    public final h copy(int i2, String str, String str2, String str3, Map<String, String> map) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(map, "");
        return new h(i2, str, str2, str3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.tabIndex == hVar.tabIndex && l.a(this.searchPosition, hVar.searchPosition) && l.a(this.searchId, hVar.searchId) && l.a(this.searchKeyword, hVar.searchKeyword) && l.a(this.searchTrackMap, hVar.searchTrackMap);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_search_source_SearchMutableData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_search_source_SearchMutableData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.tabIndex) * 31;
        String str = this.searchPosition;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_search_source_SearchMutableData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.searchId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.searchKeyword;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.searchTrackMap;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "SearchMutableData(tabIndex=" + this.tabIndex + ", searchPosition=" + this.searchPosition + ", searchId=" + this.searchId + ", searchKeyword=" + this.searchKeyword + ", searchTrackMap=" + this.searchTrackMap + ")";
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public final String getSearchPosition() {
        return this.searchPosition;
    }

    public final Map<String, String> getSearchTrackMap() {
        return this.searchTrackMap;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    public final void setTabIndex(int i2) {
        this.tabIndex = i2;
    }

    public final void setSearchId(String str) {
        l.d(str, "");
        this.searchId = str;
    }

    public final void setSearchKeyword(String str) {
        l.d(str, "");
        this.searchKeyword = str;
    }

    public final void setSearchPosition(String str) {
        l.d(str, "");
        this.searchPosition = str;
    }

    public h(int i2, String str, String str2, String str3, Map<String, String> map) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(map, "");
        this.tabIndex = i2;
        this.searchPosition = str;
        this.searchId = str2;
        this.searchKeyword = str3;
        this.searchTrackMap = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, int r13, h.f.b.g r14) {
        /*
            r7 = this;
            r4 = r10
            r6 = r12
            r3 = r9
            r2 = r8
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0009
            r2 = 0
        L_0x0009:
            r0 = r13 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0010
            r3 = r5
        L_0x0010:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0015
            r4 = r5
        L_0x0015:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0033
        L_0x0019:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x002e
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r0 = "tns_ban_type"
            java.lang.String r1 = "normal"
            r6.put(r0, r1)
            java.lang.String r0 = "use_scenario"
            r6.put(r0, r1)
        L_0x002e:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L_0x0033:
            r5 = r11
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.n.h.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, h.f.b.g):void");
    }
}
