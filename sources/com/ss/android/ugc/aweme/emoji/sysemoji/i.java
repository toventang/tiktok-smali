package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class i extends com.ss.android.ugc.aweme.emoji.g.a implements Serializable {
    public static final a Companion = new a((byte) 0);
    @c(a = "business_type")
    private int businessType = 7;
    @c(a = "emoji_list")
    private List<String> emojiList;
    @c(a = "mini_support")
    private String miniSupportSysVersion;
    private int position;
    @c(a = "preview_emoji")
    private String previewEmoji;
    @c(a = "support_skin_type")
    private int supportSkinBusinessType = 1;

    static {
        Covode.recordClassIndex(56173);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56174);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }

    public final String getMiniSupportSysVersion() {
        return this.miniSupportSysVersion;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getSupportSkinBusinessType() {
        return this.supportSkinBusinessType;
    }

    public final String getPreviewEmoji() {
        String str = this.previewEmoji;
        if (str != null) {
            return str;
        }
        List<String> list = this.emojiList;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public final void setBusinessType(int i2) {
        this.businessType = i2;
    }

    public final void setEmojiList(List<String> list) {
        this.emojiList = list;
    }

    public final void setMiniSupportSysVersion(String str) {
        this.miniSupportSysVersion = str;
    }

    public final void setPosition(int i2) {
        this.position = i2;
    }

    public final void setPreviewEmoji(String str) {
        this.previewEmoji = str;
    }

    public final void setSupportSkinBusinessType(int i2) {
        this.supportSkinBusinessType = i2;
    }

    public final void updatePreviewEmoji(String str) {
        if (str != null) {
            this.previewEmoji = str;
        }
    }
}
