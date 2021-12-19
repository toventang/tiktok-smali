package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class MessageItem {
    @c(a = "notice")
    private final NoticeItems notices;

    static {
        Covode.recordClassIndex(72531);
    }

    public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, NoticeItems noticeItems, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noticeItems = messageItem.notices;
        }
        return messageItem.copy(noticeItems);
    }

    public final NoticeItems component1() {
        return this.notices;
    }

    public final MessageItem copy(NoticeItems noticeItems) {
        return new MessageItem(noticeItems);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MessageItem) && l.a(this.notices, ((MessageItem) obj).notices);
        }
        return true;
    }

    public final int hashCode() {
        NoticeItems noticeItems = this.notices;
        if (noticeItems != null) {
            return noticeItems.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MessageItem(notices=" + this.notices + ")";
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public MessageItem(NoticeItems noticeItems) {
        this.notices = noticeItems;
    }
}
