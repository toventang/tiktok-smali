package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;

public final class MessageResponse extends BaseResponse {
    @c(a = "messages")
    private final MessageItem item;
    @c(a = "log_pb")
    private final LogPbBean mLogPbBean;

    static {
        Covode.recordClassIndex(72532);
    }

    public MessageResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, MessageItem messageItem, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            messageItem = messageResponse.item;
        }
        if ((i2 & 2) != 0) {
            logPbBean = messageResponse.mLogPbBean;
        }
        return messageResponse.copy(messageItem, logPbBean);
    }

    public final MessageItem component1() {
        return this.item;
    }

    public final LogPbBean component2() {
        return this.mLogPbBean;
    }

    public final MessageResponse copy(MessageItem messageItem, LogPbBean logPbBean) {
        return new MessageResponse(messageItem, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) obj;
        return l.a(this.item, messageResponse.item) && l.a(this.mLogPbBean, messageResponse.mLogPbBean);
    }

    public final int hashCode() {
        MessageItem messageItem = this.item;
        int i2 = 0;
        int hashCode = (messageItem != null ? messageItem.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.mLogPbBean;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MessageResponse(item=" + this.item + ", mLogPbBean=" + this.mLogPbBean + ")";
    }

    public final MessageItem getItem() {
        return this.item;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public MessageResponse(MessageItem messageItem, LogPbBean logPbBean) {
        this.item = messageItem;
        this.mLogPbBean = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageResponse(MessageItem messageItem, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : messageItem, (i2 & 2) != 0 ? null : logPbBean);
    }
}
