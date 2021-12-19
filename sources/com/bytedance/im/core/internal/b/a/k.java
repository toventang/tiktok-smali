package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.bg;
import com.bytedance.im.core.d.o;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.RequestBody;

public final class k extends w<ai> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f38496a;

    /* renamed from: b  reason: collision with root package name */
    ai f38497b;

    /* renamed from: c  reason: collision with root package name */
    RequestBody f38498c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38499d;

    /* renamed from: e  reason: collision with root package name */
    private long f38500e;

    /* renamed from: f  reason: collision with root package name */
    private int f38501f;

    /* renamed from: g  reason: collision with root package name */
    private int f38502g;

    static {
        Covode.recordClassIndex(23017);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(com.bytedance.im.core.internal.d.k kVar) {
        return true;
    }

    public k() {
        this(false, null);
    }

    public final void a(o oVar) {
        if (oVar == null) {
            f.b("imsdk", "DeleteMsgHandlerretryDeleteReq, request invalid", (Throwable) null);
            return;
        }
        this.f38499d = true;
        this.f38496a = oVar.isStranger;
        this.f38501f = oVar.retryTimes.intValue();
        this.f38500e = oVar.userDelTime.longValue();
        f.b("imsdk", "DeleteMsgHandlerretryDeleteReq, cid:" + oVar.conversationId + ", retryTimes:" + this.f38501f + ", userDelTime:" + this.f38500e, (Throwable) null);
        if (oVar.isStranger) {
            a(oVar.inboxType.intValue(), new RequestBody.Builder().delete_stranger_message_body(oVar.toStrangeMsgReqBody()).build(), null, new Object[0]);
            return;
        }
        a(oVar.inboxType.intValue(), new RequestBody.Builder().delete_message_body(oVar.toMsgReqBody()).build(), null, new Object[0]);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(boolean r2, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ai> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000e
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.DELETE_STRANGER_MESSAGE
        L_0x0004:
            int r0 = r0.getValue()
            r1.<init>(r0, r3)
            r1.f38496a = r2
            return
        L_0x000e:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.DELETE_MESSAGE
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.k.<init>(boolean, com.bytedance.im.core.a.a.b):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(com.bytedance.im.core.internal.d.k kVar, Runnable runnable) {
        RequestBody requestBody;
        RequestBody requestBody2;
        if (kVar.l()) {
            a(this.f38497b);
            return;
        }
        if (this.f38496a) {
            if (!(this.f38499d || (requestBody2 = this.f38498c) == null || requestBody2.delete_stranger_message_body == null)) {
                int i2 = this.f38502g;
                Long l2 = this.f38498c.delete_stranger_message_body.server_message_id;
                DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody = this.f38498c.delete_stranger_message_body;
                if (bg.f37912b != null) {
                    bg.f37912b.a(i2, l2, deleteStrangerMessageRequestBody);
                }
            }
        } else if (!(this.f38499d || (requestBody = this.f38498c) == null || requestBody.delete_message_body == null)) {
            int i3 = this.f38502g;
            Long l3 = this.f38498c.delete_message_body.message_id;
            DeleteMessageRequestBody deleteMessageRequestBody = this.f38498c.delete_message_body;
            if (bg.f37912b != null) {
                bg.f37912b.a(i3, l3, deleteMessageRequestBody);
            }
        }
        b(kVar);
    }
}
