package com.bytedance.android.livesdk.h;

import com.bytedance.android.livesdkapi.e;
import com.bytedance.covode.number.Covode;

public enum b implements e.a {
    GIFT_LIST("gift_list", e.b.String, ""),
    LAST_SHARE_CHANNEL("last_share_channel", e.b.String, ""),
    SHOW_LIVE_PORTRAIT_GUIDE("show_live_portrait_guide", e.b.Boolean, false),
    SHOW_LIVE_LANDSCAPE_GUIDE("show_live_landscape_guide", e.b.Boolean, false),
    FIRST_ENTER_LIVE_START("first_enter_live_start", e.b.Boolean, true),
    CLICK_RECORD_BUTTON_IN_END_LIVE("click_record_button_in_end_live", e.b.Boolean, false),
    HAS_SHOW_FILTER_GUIDE("has_show_filter_guide", e.b.Boolean, false),
    FAST_GIFT_HIDE_CONFIRM_GIFT("fast_gift_hide_confirm_gift", e.b.Long, 0L),
    DECORATION_ANCHOR_ID("room_decoration_anchor_id", e.b.Long, 0L),
    DECORATION_TEXT_PASS_LEVEL("room_decoration_text_pass_level", e.b.Integer, 31),
    DECORATION_CUSTOMIZE_TEXT("room_decoration_customize_text", e.b.String, ""),
    DECORATION_LIST("room_decoration_list", e.b.String, ""),
    SHOW_INTERACT_GUIDE("has_shown_interact_guide", e.b.Long, 0L),
    SEND_DELAY_RED_ENVELOPE("send_delay_red_envelope", e.b.Boolean, true),
    NEED_FAST_GIFT_HINT("need_fast_gift_hint", e.b.Boolean, true),
    SHOW_ROOM_DECORATION_TOAST("show_room_decoration_toast", e.b.Boolean, true),
    LIVE_INTERACT_SETTING_RED_POINT("live_interact_red_point", e.b.Boolean, true),
    LIVE_INTERACT_PK_SETTING_RED_POINT("live_interact_pk_red_point", e.b.Boolean, true),
    LIVE_INTERACT_PK_AUTO_MATCH("live_interact_pk_auto_match", e.b.Boolean, true),
    LIVE_INTERACT_PK_AUTO_START_MATCH("live_interact_pk_auto_start_match", e.b.Boolean, false),
    LIVE_INTERACT_PK_THEME("live_interact_pk_theme", e.b.String, ""),
    LIVE_INTERACT_PK_TIME_INDEX("live_interact_pk_time_index", e.b.Integer, 1),
    LIVE_LAST_SHOW_RED_POINT_TIME("live_last_show_red_point_time", e.b.Long, 0),
    LIVE_INTERACT_BEAUTY_LEVEL("live_interact_beauty_level", e.b.Integer, 2);
    
    private final Object defVal;
    private final String key;
    private final boolean supportPersist = true;
    private final e.b type;

    @Override // com.bytedance.android.livesdkapi.e.a
    public final Object defValue() {
        return this.defVal;
    }

    @Override // com.bytedance.android.livesdkapi.e.a
    public final String key() {
        return this.key;
    }

    @Override // com.bytedance.android.livesdkapi.e.a
    public final boolean supportPersist() {
        return this.supportPersist;
    }

    @Override // com.bytedance.android.livesdkapi.e.a
    public final e.b type() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(10044);
    }

    private b(String str, e.b bVar, Object obj) {
        this.key = str;
        this.type = bVar;
        this.defVal = obj;
    }
}
