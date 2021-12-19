package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ExtraParams implements Parcelable {
    public static final Parcelable.Creator<ExtraParams> CREATOR = new Parcelable.Creator<ExtraParams>() {
        /* class com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88333);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExtraParams[] newArray(int i2) {
            return new ExtraParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExtraParams createFromParcel(Parcel parcel) {
            return new ExtraParams(parcel);
        }
    };
    @c(a = "clickable_open_url")
    private String clickableOpenUrl;
    @c(a = "clickable_web_url")
    private String clickableWebUrl;
    @c(a = "gif_type")
    int gifType;
    @c(a = "interaction_icon")
    String interactionIcon;
    @c(a = "interaction_text")
    String interactionText;
    @c(a = "interaction_type")
    int interactionType;
    @c(a = "interaction_url")
    String interactionUrl;
    @c(a = "lottie_type")
    int lottieType;
    @c(a = "manual_close")
    int manualClose;

    public int describeContents() {
        return 0;
    }

    public ExtraParams() {
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    static {
        Covode.recordClassIndex(88332);
    }

    public boolean isGifValid() {
        int i2 = this.gifType;
        if (1 == i2 || 2 == i2) {
            return true;
        }
        return false;
    }

    public boolean isLottieValid() {
        int i2 = this.lottieType;
        if (1 == i2 || 2 == i2) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType != 1 || TextUtils.isEmpty(this.interactionText)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.interactionUrl) || !TextUtils.isEmpty(this.clickableOpenUrl) || !TextUtils.isEmpty(this.clickableWebUrl)) {
            return true;
        }
        return false;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i2) {
        this.interactionType = i2;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    protected ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
    }
}
