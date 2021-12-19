package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import java.util.List;

public final class f extends w<int[]> {
    static {
        Covode.recordClassIndex(22993);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public f(b<int[]> bVar) {
        super(IMCMD.CHECK_MESSAGES_BY_USER.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.check_messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        int[] iArr = (int[]) kVar.f38723d[0];
        if (z) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = kVar.f38725f.body.check_messages_per_user_body;
            if (checkMessagesPerUserResponseBody == null) {
                b(kVar);
                return;
            }
            List<InboxMessagesPerUserResponseBody> list = checkMessagesPerUserResponseBody.messages;
            if (list == null || list.isEmpty()) {
                b(kVar);
            } else if (iArr == null || iArr.length == 0) {
                b(kVar);
            } else {
                for (InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody : list) {
                    if (inboxMessagesPerUserResponseBody != null) {
                        Integer num = inboxMessagesPerUserResponseBody.inbox_type;
                        Boolean bool = inboxMessagesPerUserResponseBody.has_more;
                        if (!(num == null || bool == null)) {
                            for (int i2 = 0; i2 < iArr.length; i2++) {
                                if (iArr[i2] == num.intValue() && !bool.booleanValue()) {
                                    iArr[i2] = -1;
                                }
                            }
                        }
                    }
                }
                a(iArr);
            }
        } else {
            b(kVar);
        }
    }
}
