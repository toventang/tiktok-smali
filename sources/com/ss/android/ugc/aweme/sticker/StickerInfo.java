package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class StickerInfo implements Serializable {
    public static final a Companion = new a((byte) 0);
    private static final long serialVersionUID = 1;
    @c(a = "effect_intensity")
    private String effectIntensity;
    @c(a = "grade_key")
    private String gradeKey;
    @c(a = "is_default_prop")
    private String hasDefaultProp;
    @c(a = "prop_impr_position")
    private String imprPosition;
    @c(a = "is_audio_graph_output")
    private Boolean isAudioGraphOutput;
    @c(a = "is_auto_use_prop")
    private Boolean isAutoUseProp;
    @c(a = "is_game_type_sticker")
    private boolean isGameTypeSticker;
    @c(a = "is_music_beat")
    private boolean isMusicBeatSticker;
    @c(a = "is_original_sticker")
    private boolean isOriginalSticker;
    @c(a = "is_text_type_sticker")
    private boolean isTextTypeSticker;
    @c(a = "prop_parent_id")
    private String mParentStickerId;
    @c(a = "mention_user")
    private String mentionUserInfo;
    private boolean needFilter;
    @c(a = "prop_source")
    private String propSource;
    @c(a = "rec_id")
    private String recId;
    @c(a = "prop_tab_order")
    private String tabOrder;
    @c(a = "welfare_activity_id")
    private String welfareActivityId;

    static {
        Covode.recordClassIndex(88030);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88031);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getEffectIntensity() {
        return this.effectIntensity;
    }

    public final String getHasDefaultProp() {
        return this.hasDefaultProp;
    }

    public final String getImprPosition() {
        return this.imprPosition;
    }

    public final String getMParentStickerId() {
        return this.mParentStickerId;
    }

    public final String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public final boolean getNeedFilter() {
        return this.needFilter;
    }

    public final String getPropSource() {
        return this.propSource;
    }

    public final String getRecId() {
        return this.recId;
    }

    public final String getTabOrder() {
        return this.tabOrder;
    }

    public final String getWelfareActivityId() {
        return this.welfareActivityId;
    }

    public final Boolean isAudioGraphOutput() {
        return this.isAudioGraphOutput;
    }

    public final Boolean isAutoUseProp() {
        return this.isAutoUseProp;
    }

    public final boolean isGameTypeSticker() {
        return this.isGameTypeSticker;
    }

    public final boolean isMusicBeatSticker() {
        return this.isMusicBeatSticker;
    }

    public final boolean isOriginalSticker() {
        return this.isOriginalSticker;
    }

    public final boolean isTextTypeSticker() {
        return this.isTextTypeSticker;
    }

    public final String getGradeKey() {
        String str = this.gradeKey;
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.gradeKey;
    }

    public final boolean hasImprPosition() {
        String str = this.imprPosition;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final boolean hasTabOrder() {
        String str = this.tabOrder;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public StickerInfo() {
        this.needFilter = true;
        this.recId = "0";
        this.effectIntensity = "";
        this.hasDefaultProp = "";
        this.isAutoUseProp = false;
        this.isAudioGraphOutput = false;
    }

    public final void setAudioGraphOutput(Boolean bool) {
        this.isAudioGraphOutput = bool;
    }

    public final void setAutoUseProp(Boolean bool) {
        this.isAutoUseProp = bool;
    }

    public final void setEffectIntensity(String str) {
        this.effectIntensity = str;
    }

    public final void setGameTypeSticker(boolean z) {
        this.isGameTypeSticker = z;
    }

    public final void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public final void setHasDefaultProp(String str) {
        this.hasDefaultProp = str;
    }

    public final void setImprPosition(String str) {
        this.imprPosition = str;
    }

    public final void setMParentStickerId(String str) {
        this.mParentStickerId = str;
    }

    public final void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public final void setMusicBeatSticker(boolean z) {
        this.isMusicBeatSticker = z;
    }

    public final void setNeedFilter(boolean z) {
        this.needFilter = z;
    }

    public final void setOriginalSticker(boolean z) {
        this.isOriginalSticker = z;
    }

    public final void setPropSource(String str) {
        this.propSource = str;
    }

    public final void setTabOrder(String str) {
        this.tabOrder = str;
    }

    public final void setTextTypeSticker(boolean z) {
        this.isTextTypeSticker = z;
    }

    public final void setWelfareActivityId(String str) {
        this.welfareActivityId = str;
    }

    public final void setRecId(String str) {
        l.d(str, "");
        this.recId = str;
    }

    public StickerInfo(String str, String str2, String str3) {
        this();
        this.propSource = str;
        this.gradeKey = str2;
        this.recId = str3 == null ? "0" : str3;
    }
}
