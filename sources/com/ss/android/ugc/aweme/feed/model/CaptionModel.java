package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class CaptionModel implements Serializable {
    @c(a = "caption_infos")
    public List<CaptionItemModel> captionList;
    @c(a = "enable_auto_caption")
    public int enableAutoCaption;
    @c(a = "has_original_audio")
    public int hasOriginalAudio;
    @c(a = "original_language_info")
    public CaptionLanguage originalCaptionLanguage;

    static {
        Covode.recordClassIndex(59357);
    }

    public CaptionModel() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.CaptionModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionModel copy$default(CaptionModel captionModel, int i2, int i3, CaptionLanguage captionLanguage, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = captionModel.hasOriginalAudio;
        }
        if ((i4 & 2) != 0) {
            i3 = captionModel.enableAutoCaption;
        }
        if ((i4 & 4) != 0) {
            captionLanguage = captionModel.originalCaptionLanguage;
        }
        if ((i4 & 8) != 0) {
            list = captionModel.captionList;
        }
        return captionModel.copy(i2, i3, captionLanguage, list);
    }

    public final int component1() {
        return this.hasOriginalAudio;
    }

    public final int component2() {
        return this.enableAutoCaption;
    }

    public final CaptionLanguage component3() {
        return this.originalCaptionLanguage;
    }

    public final List<CaptionItemModel> component4() {
        return this.captionList;
    }

    public final CaptionModel copy(int i2, int i3, CaptionLanguage captionLanguage, List<CaptionItemModel> list) {
        return new CaptionModel(i2, i3, captionLanguage, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionModel)) {
            return false;
        }
        CaptionModel captionModel = (CaptionModel) obj;
        return this.hasOriginalAudio == captionModel.hasOriginalAudio && this.enableAutoCaption == captionModel.enableAutoCaption && l.a(this.originalCaptionLanguage, captionModel.originalCaptionLanguage) && l.a(this.captionList, captionModel.captionList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.hasOriginalAudio) * 31) + com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.enableAutoCaption)) * 31;
        CaptionLanguage captionLanguage = this.originalCaptionLanguage;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (captionLanguage != null ? captionLanguage.hashCode() : 0)) * 31;
        List<CaptionItemModel> list = this.captionList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CaptionModel(hasOriginalAudio=" + this.hasOriginalAudio + ", enableAutoCaption=" + this.enableAutoCaption + ", originalCaptionLanguage=" + this.originalCaptionLanguage + ", captionList=" + this.captionList + ")";
    }

    public final List<CaptionItemModel> getCaptionList() {
        return this.captionList;
    }

    public final int getEnableAutoCaption() {
        return this.enableAutoCaption;
    }

    public final int getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    public final CaptionLanguage getOriginalCaptionLanguage() {
        return this.originalCaptionLanguage;
    }

    public CaptionModel(int i2, int i3, CaptionLanguage captionLanguage, List<CaptionItemModel> list) {
        this.hasOriginalAudio = i2;
        this.enableAutoCaption = i3;
        this.originalCaptionLanguage = captionLanguage;
        this.captionList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionModel(int i2, int i3, CaptionLanguage captionLanguage, List list, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? null : captionLanguage, (i4 & 8) != 0 ? null : list);
    }
}
