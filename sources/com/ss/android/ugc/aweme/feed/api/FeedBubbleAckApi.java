package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import f.a.b;
import l.b.c;
import l.b.e;
import l.b.o;

public interface FeedBubbleAckApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91928a = a.f91929a;

    static {
        Covode.recordClassIndex(57871);
    }

    @o(a = "/tiktok/v1/bubble/ack/")
    @e
    b sendBubbleAck(@c(a = "biz") int i2, @c(a = "type") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f91929a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(57872);
        }
    }
}
