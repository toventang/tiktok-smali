package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LiveSubscribeLynxMap {
    private final String anchor_badge_preview_page;
    private final String anchor_badge_preview_popup;
    private final String anchor_badge_setting_page;
    private final String anchor_badge_setting_popup;
    private final String anchor_badge_setting_popup_android;
    private final String anchor_describe_management_page;
    private final String anchor_emotes_setting_page;
    private final String anchor_emotes_setting_popup;
    private final String anchor_subscribe_faq;
    private final String anchor_user_guide_page;
    private final String anchor_user_guide_popup;
    private final String anchor_user_terms_page;
    private final String anchor_user_terms_popup;
    private final String user_subscribe_data;
    private final String user_subscribe_detail;
    private final String user_subscribe_entry;
    private final String user_subscribe_list;
    private final String user_subscribe_state;
    private final String user_subscribe_template;

    static {
        Covode.recordClassIndex(10802);
    }

    public LiveSubscribeLynxMap() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ LiveSubscribeLynxMap copy$default(LiveSubscribeLynxMap liveSubscribeLynxMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i2, Object obj) {
        String str20 = str2;
        String str21 = str;
        String str22 = str8;
        String str23 = str7;
        String str24 = str3;
        String str25 = str4;
        String str26 = str5;
        String str27 = str6;
        String str28 = str14;
        String str29 = str13;
        String str30 = str9;
        String str31 = str10;
        String str32 = str11;
        String str33 = str12;
        String str34 = str15;
        String str35 = str19;
        String str36 = str16;
        String str37 = str17;
        String str38 = str18;
        if ((i2 & 1) != 0) {
            str21 = liveSubscribeLynxMap.user_subscribe_entry;
        }
        if ((i2 & 2) != 0) {
            str20 = liveSubscribeLynxMap.user_subscribe_template;
        }
        if ((i2 & 4) != 0) {
            str24 = liveSubscribeLynxMap.user_subscribe_state;
        }
        if ((i2 & 8) != 0) {
            str25 = liveSubscribeLynxMap.user_subscribe_data;
        }
        if ((i2 & 16) != 0) {
            str26 = liveSubscribeLynxMap.user_subscribe_list;
        }
        if ((i2 & 32) != 0) {
            str27 = liveSubscribeLynxMap.user_subscribe_detail;
        }
        if ((i2 & 64) != 0) {
            str23 = liveSubscribeLynxMap.anchor_badge_setting_popup;
        }
        if ((i2 & 128) != 0) {
            str22 = liveSubscribeLynxMap.anchor_badge_setting_popup_android;
        }
        if ((i2 & 256) != 0) {
            str30 = liveSubscribeLynxMap.anchor_badge_setting_page;
        }
        if ((i2 & 512) != 0) {
            str31 = liveSubscribeLynxMap.anchor_badge_preview_popup;
        }
        if ((i2 & 1024) != 0) {
            str32 = liveSubscribeLynxMap.anchor_badge_preview_page;
        }
        if ((i2 & 2048) != 0) {
            str33 = liveSubscribeLynxMap.anchor_emotes_setting_popup;
        }
        if ((i2 & 4096) != 0) {
            str29 = liveSubscribeLynxMap.anchor_emotes_setting_page;
        }
        if ((i2 & 8192) != 0) {
            str28 = liveSubscribeLynxMap.anchor_subscribe_faq;
        }
        if ((i2 & 16384) != 0) {
            str34 = liveSubscribeLynxMap.anchor_user_guide_popup;
        }
        if ((32768 & i2) != 0) {
            str36 = liveSubscribeLynxMap.anchor_user_guide_page;
        }
        if ((65536 & i2) != 0) {
            str37 = liveSubscribeLynxMap.anchor_user_terms_popup;
        }
        if ((131072 & i2) != 0) {
            str38 = liveSubscribeLynxMap.anchor_user_terms_page;
        }
        if ((i2 & 262144) != 0) {
            str35 = liveSubscribeLynxMap.anchor_describe_management_page;
        }
        return liveSubscribeLynxMap.copy(str21, str20, str24, str25, str26, str27, str23, str22, str30, str31, str32, str33, str29, str28, str34, str36, str37, str38, str35);
    }

    public final String component1() {
        return this.user_subscribe_entry;
    }

    public final String component10() {
        return this.anchor_badge_preview_popup;
    }

    public final String component11() {
        return this.anchor_badge_preview_page;
    }

    public final String component12() {
        return this.anchor_emotes_setting_popup;
    }

    public final String component13() {
        return this.anchor_emotes_setting_page;
    }

    public final String component14() {
        return this.anchor_subscribe_faq;
    }

    public final String component15() {
        return this.anchor_user_guide_popup;
    }

    public final String component16() {
        return this.anchor_user_guide_page;
    }

    public final String component17() {
        return this.anchor_user_terms_popup;
    }

    public final String component18() {
        return this.anchor_user_terms_page;
    }

    public final String component19() {
        return this.anchor_describe_management_page;
    }

    public final String component2() {
        return this.user_subscribe_template;
    }

    public final String component3() {
        return this.user_subscribe_state;
    }

    public final String component4() {
        return this.user_subscribe_data;
    }

    public final String component5() {
        return this.user_subscribe_list;
    }

    public final String component6() {
        return this.user_subscribe_detail;
    }

    public final String component7() {
        return this.anchor_badge_setting_popup;
    }

    public final String component8() {
        return this.anchor_badge_setting_popup_android;
    }

    public final String component9() {
        return this.anchor_badge_setting_page;
    }

    public final LiveSubscribeLynxMap copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        l.d(str9, "");
        l.d(str10, "");
        l.d(str11, "");
        l.d(str12, "");
        l.d(str13, "");
        l.d(str14, "");
        l.d(str15, "");
        l.d(str16, "");
        l.d(str17, "");
        l.d(str18, "");
        l.d(str19, "");
        return new LiveSubscribeLynxMap(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveSubscribeLynxMap)) {
            return false;
        }
        LiveSubscribeLynxMap liveSubscribeLynxMap = (LiveSubscribeLynxMap) obj;
        return l.a(this.user_subscribe_entry, liveSubscribeLynxMap.user_subscribe_entry) && l.a(this.user_subscribe_template, liveSubscribeLynxMap.user_subscribe_template) && l.a(this.user_subscribe_state, liveSubscribeLynxMap.user_subscribe_state) && l.a(this.user_subscribe_data, liveSubscribeLynxMap.user_subscribe_data) && l.a(this.user_subscribe_list, liveSubscribeLynxMap.user_subscribe_list) && l.a(this.user_subscribe_detail, liveSubscribeLynxMap.user_subscribe_detail) && l.a(this.anchor_badge_setting_popup, liveSubscribeLynxMap.anchor_badge_setting_popup) && l.a(this.anchor_badge_setting_popup_android, liveSubscribeLynxMap.anchor_badge_setting_popup_android) && l.a(this.anchor_badge_setting_page, liveSubscribeLynxMap.anchor_badge_setting_page) && l.a(this.anchor_badge_preview_popup, liveSubscribeLynxMap.anchor_badge_preview_popup) && l.a(this.anchor_badge_preview_page, liveSubscribeLynxMap.anchor_badge_preview_page) && l.a(this.anchor_emotes_setting_popup, liveSubscribeLynxMap.anchor_emotes_setting_popup) && l.a(this.anchor_emotes_setting_page, liveSubscribeLynxMap.anchor_emotes_setting_page) && l.a(this.anchor_subscribe_faq, liveSubscribeLynxMap.anchor_subscribe_faq) && l.a(this.anchor_user_guide_popup, liveSubscribeLynxMap.anchor_user_guide_popup) && l.a(this.anchor_user_guide_page, liveSubscribeLynxMap.anchor_user_guide_page) && l.a(this.anchor_user_terms_popup, liveSubscribeLynxMap.anchor_user_terms_popup) && l.a(this.anchor_user_terms_page, liveSubscribeLynxMap.anchor_user_terms_page) && l.a(this.anchor_describe_management_page, liveSubscribeLynxMap.anchor_describe_management_page);
    }

    public final int hashCode() {
        String str = this.user_subscribe_entry;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.user_subscribe_template;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.user_subscribe_state;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.user_subscribe_data;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.user_subscribe_list;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.user_subscribe_detail;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.anchor_badge_setting_popup;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.anchor_badge_setting_popup_android;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.anchor_badge_setting_page;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.anchor_badge_preview_popup;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.anchor_badge_preview_page;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.anchor_emotes_setting_popup;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.anchor_emotes_setting_page;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.anchor_subscribe_faq;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.anchor_user_guide_popup;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.anchor_user_guide_page;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.anchor_user_terms_popup;
        int hashCode17 = (hashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.anchor_user_terms_page;
        int hashCode18 = (hashCode17 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.anchor_describe_management_page;
        if (str19 != null) {
            i2 = str19.hashCode();
        }
        return hashCode18 + i2;
    }

    public final String toString() {
        return "LiveSubscribeLynxMap(user_subscribe_entry=" + this.user_subscribe_entry + ", user_subscribe_template=" + this.user_subscribe_template + ", user_subscribe_state=" + this.user_subscribe_state + ", user_subscribe_data=" + this.user_subscribe_data + ", user_subscribe_list=" + this.user_subscribe_list + ", user_subscribe_detail=" + this.user_subscribe_detail + ", anchor_badge_setting_popup=" + this.anchor_badge_setting_popup + ", anchor_badge_setting_popup_android=" + this.anchor_badge_setting_popup_android + ", anchor_badge_setting_page=" + this.anchor_badge_setting_page + ", anchor_badge_preview_popup=" + this.anchor_badge_preview_popup + ", anchor_badge_preview_page=" + this.anchor_badge_preview_page + ", anchor_emotes_setting_popup=" + this.anchor_emotes_setting_popup + ", anchor_emotes_setting_page=" + this.anchor_emotes_setting_page + ", anchor_subscribe_faq=" + this.anchor_subscribe_faq + ", anchor_user_guide_popup=" + this.anchor_user_guide_popup + ", anchor_user_guide_page=" + this.anchor_user_guide_page + ", anchor_user_terms_popup=" + this.anchor_user_terms_popup + ", anchor_user_terms_page=" + this.anchor_user_terms_page + ", anchor_describe_management_page=" + this.anchor_describe_management_page + ")";
    }

    public final String getAnchor_badge_preview_page() {
        return this.anchor_badge_preview_page;
    }

    public final String getAnchor_badge_preview_popup() {
        return this.anchor_badge_preview_popup;
    }

    public final String getAnchor_badge_setting_page() {
        return this.anchor_badge_setting_page;
    }

    public final String getAnchor_badge_setting_popup() {
        return this.anchor_badge_setting_popup;
    }

    public final String getAnchor_badge_setting_popup_android() {
        return this.anchor_badge_setting_popup_android;
    }

    public final String getAnchor_describe_management_page() {
        return this.anchor_describe_management_page;
    }

    public final String getAnchor_emotes_setting_page() {
        return this.anchor_emotes_setting_page;
    }

    public final String getAnchor_emotes_setting_popup() {
        return this.anchor_emotes_setting_popup;
    }

    public final String getAnchor_subscribe_faq() {
        return this.anchor_subscribe_faq;
    }

    public final String getAnchor_user_guide_page() {
        return this.anchor_user_guide_page;
    }

    public final String getAnchor_user_guide_popup() {
        return this.anchor_user_guide_popup;
    }

    public final String getAnchor_user_terms_page() {
        return this.anchor_user_terms_page;
    }

    public final String getAnchor_user_terms_popup() {
        return this.anchor_user_terms_popup;
    }

    public final String getUser_subscribe_data() {
        return this.user_subscribe_data;
    }

    public final String getUser_subscribe_detail() {
        return this.user_subscribe_detail;
    }

    public final String getUser_subscribe_entry() {
        return this.user_subscribe_entry;
    }

    public final String getUser_subscribe_list() {
        return this.user_subscribe_list;
    }

    public final String getUser_subscribe_state() {
        return this.user_subscribe_state;
    }

    public final String getUser_subscribe_template() {
        return this.user_subscribe_template;
    }

    public LiveSubscribeLynxMap(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        l.d(str9, "");
        l.d(str10, "");
        l.d(str11, "");
        l.d(str12, "");
        l.d(str13, "");
        l.d(str14, "");
        l.d(str15, "");
        l.d(str16, "");
        l.d(str17, "");
        l.d(str18, "");
        l.d(str19, "");
        this.user_subscribe_entry = str;
        this.user_subscribe_template = str2;
        this.user_subscribe_state = str3;
        this.user_subscribe_data = str4;
        this.user_subscribe_list = str5;
        this.user_subscribe_detail = str6;
        this.anchor_badge_setting_popup = str7;
        this.anchor_badge_setting_popup_android = str8;
        this.anchor_badge_setting_page = str9;
        this.anchor_badge_preview_popup = str10;
        this.anchor_badge_preview_page = str11;
        this.anchor_emotes_setting_popup = str12;
        this.anchor_emotes_setting_page = str13;
        this.anchor_subscribe_faq = str14;
        this.anchor_user_guide_popup = str15;
        this.anchor_user_guide_page = str16;
        this.anchor_user_terms_popup = str17;
        this.anchor_user_terms_page = str18;
        this.anchor_describe_management_page = str19;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LiveSubscribeLynxMap(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, h.f.b.g r42) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
