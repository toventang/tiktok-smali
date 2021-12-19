package com.bytedance.ies.im.core.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.a;
import com.bytedance.im.core.proto.MessageBody;

public final class c implements com.bytedance.im.core.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34134a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(20325);
    }

    @Override // com.bytedance.im.core.a.c
    public final MessageBody a(MessageBody messageBody) {
        Integer num;
        if (messageBody != null && ((num = messageBody.message_type) == null || num.intValue() != 60001)) {
            if (messageBody.message_type.intValue() > 50000) {
                return messageBody;
            }
            if (messageBody.message_type.intValue() >= 0 && messageBody.message_type.intValue() <= 1999) {
                return a.f().a(messageBody);
            }
        }
        return null;
    }
}
