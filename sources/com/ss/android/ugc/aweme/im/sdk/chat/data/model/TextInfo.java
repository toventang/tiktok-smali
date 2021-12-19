package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class TextInfo {
    private final List<NamedValue> infos;
    private final MessageTitle title;

    static {
        Covode.recordClassIndex(64089);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInfo copy$default(TextInfo textInfo, MessageTitle messageTitle, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            messageTitle = textInfo.title;
        }
        if ((i2 & 2) != 0) {
            list = textInfo.infos;
        }
        return textInfo.copy(messageTitle, list);
    }

    public final MessageTitle component1() {
        return this.title;
    }

    public final List<NamedValue> component2() {
        return this.infos;
    }

    public final TextInfo copy(MessageTitle messageTitle, List<NamedValue> list) {
        l.d(messageTitle, "");
        l.d(list, "");
        return new TextInfo(messageTitle, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInfo)) {
            return false;
        }
        TextInfo textInfo = (TextInfo) obj;
        return l.a(this.title, textInfo.title) && l.a(this.infos, textInfo.infos);
    }

    public final int hashCode() {
        MessageTitle messageTitle = this.title;
        int i2 = 0;
        int hashCode = (messageTitle != null ? messageTitle.hashCode() : 0) * 31;
        List<NamedValue> list = this.infos;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TextInfo(title=" + this.title + ", infos=" + this.infos + ")";
    }

    public final List<NamedValue> getInfos() {
        return this.infos;
    }

    public final MessageTitle getTitle() {
        return this.title;
    }

    public TextInfo(MessageTitle messageTitle, List<NamedValue> list) {
        l.d(messageTitle, "");
        l.d(list, "");
        this.title = messageTitle;
        this.infos = list;
    }
}
