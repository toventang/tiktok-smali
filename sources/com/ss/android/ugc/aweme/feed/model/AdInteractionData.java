package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AdInteractionData implements Serializable {
    @c(a = "gesture_guidance")
    private AdGestureGuidance gestureGuidance;
    @c(a = "interaction_type")
    private int interactionType;
    @c(a = "music")
    private UrlModel music;
    @c(a = "popup_image")
    private UrlModel popupImage;

    static {
        Covode.recordClassIndex(59289);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AdInteractionData copy$default(AdInteractionData adInteractionData, int i2, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = adInteractionData.interactionType;
        }
        if ((i3 & 2) != 0) {
            adGestureGuidance = adInteractionData.gestureGuidance;
        }
        if ((i3 & 4) != 0) {
            urlModel = adInteractionData.popupImage;
        }
        if ((i3 & 8) != 0) {
            urlModel2 = adInteractionData.music;
        }
        return adInteractionData.copy(i2, adGestureGuidance, urlModel, urlModel2);
    }

    public final int component1() {
        return this.interactionType;
    }

    public final AdGestureGuidance component2() {
        return this.gestureGuidance;
    }

    public final UrlModel component3() {
        return this.popupImage;
    }

    public final UrlModel component4() {
        return this.music;
    }

    public final AdInteractionData copy(int i2, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        return new AdInteractionData(i2, adGestureGuidance, urlModel, urlModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInteractionData)) {
            return false;
        }
        AdInteractionData adInteractionData = (AdInteractionData) obj;
        return this.interactionType == adInteractionData.interactionType && l.a(this.gestureGuidance, adInteractionData.gestureGuidance) && l.a(this.popupImage, adInteractionData.popupImage) && l.a(this.music, adInteractionData.music);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.interactionType) * 31;
        AdGestureGuidance adGestureGuidance = this.gestureGuidance;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (adGestureGuidance != null ? adGestureGuidance.hashCode() : 0)) * 31;
        UrlModel urlModel = this.popupImage;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.music;
        if (urlModel2 != null) {
            i2 = urlModel2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AdInteractionData(interactionType=" + this.interactionType + ", gestureGuidance=" + this.gestureGuidance + ", popupImage=" + this.popupImage + ", music=" + this.music + ")";
    }

    public final AdGestureGuidance getGestureGuidance() {
        return this.gestureGuidance;
    }

    public final int getInteractionType() {
        return this.interactionType;
    }

    public final UrlModel getMusic() {
        return this.music;
    }

    public final UrlModel getPopupImage() {
        return this.popupImage;
    }

    public final void setGestureGuidance(AdGestureGuidance adGestureGuidance) {
        this.gestureGuidance = adGestureGuidance;
    }

    public final void setInteractionType(int i2) {
        this.interactionType = i2;
    }

    public final void setMusic(UrlModel urlModel) {
        this.music = urlModel;
    }

    public final void setPopupImage(UrlModel urlModel) {
        this.popupImage = urlModel;
    }

    public AdInteractionData(int i2, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        this.interactionType = i2;
        this.gestureGuidance = adGestureGuidance;
        this.popupImage = urlModel;
        this.music = urlModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdInteractionData(int i2, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i3, g gVar) {
        this(i2, (i3 & 2) != 0 ? null : adGestureGuidance, (i3 & 4) != 0 ? null : urlModel, (i3 & 8) != 0 ? null : urlModel2);
    }
}
