package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.g;
import h.f.b.l;

public final class TextContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    private final boolean isDefault;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(64087);
    }

    public TextContent() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = textContent.text;
        }
        if ((i2 & 2) != 0) {
            z = textContent.isDefault;
        }
        return textContent.copy(str, z);
    }

    public static final TextContent obtain(TextContent textContent) {
        return Companion.obtain(textContent);
    }

    public static final TextContent obtain(String str) {
        return Companion.obtain(str);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isDefault;
    }

    public final TextContent copy(String str, boolean z) {
        return new TextContent(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContent)) {
            return false;
        }
        TextContent textContent = (TextContent) obj;
        return l.a(this.text, textContent.text) && this.isDefault == textContent.isDefault;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String toString() {
        return "TextContent(text=" + this.text + ", isDefault=" + this.isDefault + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64088);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final TextContent obtain(String str) {
            TextContent textContent = new TextContent(str, false, 2, null);
            textContent.setType(700);
            return textContent;
        }

        public final TextContent obtain(TextContent textContent) {
            l.d(textContent, "");
            TextContent textContent2 = new TextContent(textContent.getText(), false, 2, null);
            textContent2.type = 700;
            textContent2.prevId = textContent.prevId;
            textContent2.rootId = textContent.rootId;
            return textContent2;
        }
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("text");
        a2.f124595i.putString("share_text", this.text);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        String msgHint = super.getMsgHint();
        l.b(msgHint, "");
        return msgHint;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final boolean isValid() {
        String str = this.text;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public TextContent(String str, boolean z) {
        this.text = str;
        this.isDefault = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextContent(String str, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z);
    }
}
