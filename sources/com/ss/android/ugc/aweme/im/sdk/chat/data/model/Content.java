package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class Content {
    private final List<Template> template;
    private final String tips;

    static {
        Covode.recordClassIndex(64031);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Content */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Content copy$default(Content content, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = content.tips;
        }
        if ((i2 & 2) != 0) {
            list = content.template;
        }
        return content.copy(str, list);
    }

    public final String component1() {
        return this.tips;
    }

    public final List<Template> component2() {
        return this.template;
    }

    public final Content copy(String str, List<Template> list) {
        l.d(str, "");
        return new Content(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return l.a(this.tips, content.tips) && l.a(this.template, content.template);
    }

    public final int hashCode() {
        String str = this.tips;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Template> list = this.template;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Content(tips=" + this.tips + ", template=" + this.template + ")";
    }

    public final List<Template> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public Content(String str, List<Template> list) {
        l.d(str, "");
        this.tips = str;
        this.template = list;
    }
}
