package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    @c(a = "audio_uri")
    public String audioUri;
    @c(a = "auto_captions")
    public List<b> autoCaptions;
    @c(a = "disable")
    public long disable;
    @c(a = "location")
    public int location;
    @c(a = "margin_bottom")
    public Integer marginBottom;
    @c(a = "margin_start")
    public Integer marginStart;
    @c(a = "margin_top")
    public Integer marginTop;
    @c(a = "select_lang")
    public String selectLang;
    @c(a = "task_id")
    public String taskId;
    @c(a = "utterances")
    public List<h> utterances;
    @c(a = "video_width")
    public Integer videoWidth;

    static {
        Covode.recordClassIndex(88112);
    }

    public d() {
    }

    public static int com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.d */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d copy$default(d dVar, String str, List list, int i2, List list2, String str2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dVar.audioUri;
        }
        if ((i3 & 2) != 0) {
            list = dVar.utterances;
        }
        if ((i3 & 4) != 0) {
            i2 = dVar.location;
        }
        if ((i3 & 8) != 0) {
            list2 = dVar.autoCaptions;
        }
        if ((i3 & 16) != 0) {
            str2 = dVar.selectLang;
        }
        if ((i3 & 32) != 0) {
            j2 = dVar.disable;
        }
        return dVar.copy(str, list, i2, list2, str2, j2);
    }

    public final String component1() {
        return this.audioUri;
    }

    public final List<h> component2() {
        return this.utterances;
    }

    public final int component3() {
        return this.location;
    }

    public final List<b> component4() {
        return this.autoCaptions;
    }

    public final String component5() {
        return this.selectLang;
    }

    public final long component6() {
        return this.disable;
    }

    public final d copy(String str, List<h> list, int i2, List<b> list2, String str2, long j2) {
        return new d(str, list, i2, list2, str2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.audioUri, dVar.audioUri) && l.a(this.utterances, dVar.utterances) && this.location == dVar.location && l.a(this.autoCaptions, dVar.autoCaptions) && l.a(this.selectLang, dVar.selectLang) && this.disable == dVar.disable;
    }

    public final int hashCode() {
        String str = this.audioUri;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<h> list = this.utterances;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.location)) * 31;
        List<b> list2 = this.autoCaptions;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.selectLang;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode3 + i2) * 31) + com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.disable);
    }

    public final String toString() {
        return "CaptionStruct(audioUri=" + this.audioUri + ", utterances=" + this.utterances + ", location=" + this.location + ", autoCaptions=" + this.autoCaptions + ", selectLang=" + this.selectLang + ", disable=" + this.disable + ")";
    }

    public final String getAudioUri() {
        return this.audioUri;
    }

    public final List<b> getAutoCaptions() {
        return this.autoCaptions;
    }

    public final long getDisable() {
        return this.disable;
    }

    public final int getLocation() {
        return this.location;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginStart() {
        return this.marginStart;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public final String getSelectLang() {
        return this.selectLang;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final List<h> getUtterances() {
        return this.utterances;
    }

    public final Integer getVideoWidth() {
        return this.videoWidth;
    }

    public final void setAudioUri(String str) {
        this.audioUri = str;
    }

    public final void setAutoCaptions(List<b> list) {
        this.autoCaptions = list;
    }

    public final void setDisable(long j2) {
        this.disable = j2;
    }

    public final void setLocation(int i2) {
        this.location = i2;
    }

    public final void setMarginBottom(Integer num) {
        this.marginBottom = num;
    }

    public final void setMarginStart(Integer num) {
        this.marginStart = num;
    }

    public final void setMarginTop(Integer num) {
        this.marginTop = num;
    }

    public final void setSelectLang(String str) {
        this.selectLang = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public final void setUtterances(List<h> list) {
        this.utterances = list;
    }

    public final void setVideoWidth(Integer num) {
        this.videoWidth = num;
    }

    public d(String str, List<h> list, int i2, List<b> list2, String str2, long j2) {
        this.audioUri = str;
        this.utterances = list;
        this.location = i2;
        this.autoCaptions = list2;
        this.selectLang = str2;
        this.disable = j2;
        this.taskId = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, List list, int i2, List list2, String str2, long j2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : str, list, (i3 & 4) != 0 ? a.LEFT_BOTTOM.getValue() : i2, (i3 & 8) != 0 ? null : list2, (i3 & 16) == 0 ? str2 : null, (i3 & 32) != 0 ? 0 : j2);
    }
}
