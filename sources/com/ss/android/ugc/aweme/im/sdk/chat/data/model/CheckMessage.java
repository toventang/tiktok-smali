package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

public class CheckMessage {
    public int raw_check_code;
    public int status_code;
    public StatusMsg status_msg;

    public static class StatusMsg {
        public SystemContent msg_content;
        public int msg_type;

        static {
            Covode.recordClassIndex(64027);
        }
    }

    static {
        Covode.recordClassIndex(64026);
    }

    public static SystemContent getContent(CheckMessage checkMessage) {
        StatusMsg statusMsg;
        if (checkMessage == null || (statusMsg = checkMessage.status_msg) == null || statusMsg.msg_content == null) {
            return null;
        }
        return checkMessage.status_msg.msg_content;
    }
}
