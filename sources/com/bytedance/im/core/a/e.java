package com.bytedance.im.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.proto.ConversationType;
import com.bytedance.im.core.proto.StatusCode;

public final class e {
    static {
        Covode.recordClassIndex(22614);
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f37581a = ConversationType.ONE_TO_ONE_CHAT.getValue();

        /* renamed from: b  reason: collision with root package name */
        public static final int f37582b = ConversationType.GROUP_CHAT.getValue();

        /* renamed from: c  reason: collision with root package name */
        public static final int f37583c = ConversationType.LIVE_CHAT.getValue();

        /* renamed from: d  reason: collision with root package name */
        public static final int f37584d = ConversationType.BROADCAST_CHAT.getValue();

        static {
            Covode.recordClassIndex(22615);
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f37585a = StatusCode.OK.getValue();

        /* renamed from: b  reason: collision with root package name */
        public static final int f37586b = StatusCode.INVALID_TOKEN.getValue();

        /* renamed from: c  reason: collision with root package name */
        public static final int f37587c = StatusCode.EXPIRED_TOKEN.getValue();

        /* renamed from: d  reason: collision with root package name */
        public static final int f37588d = StatusCode.INVALID_TICKET.getValue();

        /* renamed from: e  reason: collision with root package name */
        public static final int f37589e = StatusCode.INVALID_REQUEST.getValue();

        /* renamed from: f  reason: collision with root package name */
        public static final int f37590f = StatusCode.INVALID_CMD.getValue();

        /* renamed from: g  reason: collision with root package name */
        public static final int f37591g = StatusCode.SERVER_ERR.getValue();

        /* renamed from: h  reason: collision with root package name */
        public static final int f37592h = StatusCode.MESSAGE_TARGET_CONVERSATION_NOT_EXIST.getValue();

        static {
            Covode.recordClassIndex(22616);
        }
    }
}
