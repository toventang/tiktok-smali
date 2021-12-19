package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import java.util.Map;

public final class t extends w<ai> {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38564a = true;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<Long, ai> f38565b = new LruCache<>(d.a().b().at);

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return false;
    }

    static {
        Covode.recordClassIndex(23040);
    }

    public t() {
        super(IMCMD.GET_MESSAGE_INFO_BY_SERVER_ID.getValue());
    }

    public t(b<ai> bVar) {
        super(IMCMD.GET_MESSAGE_INFO_BY_SERVER_ID.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.get_message_by_id_body == null || kVar.f38725f.body.get_message_by_id_body.msg_info == null || kVar.f38725f.body.get_message_by_id_body.msg_info.body == null) {
            return false;
        }
        return true;
    }

    public final void a(long j2, h hVar) {
        if (hVar == null) {
            u.a a2 = u.a();
            a2.a("conversation is null");
            a(a2.f38031a);
            return;
        }
        a(j2, hVar.getConversationId(), Long.valueOf(hVar.getConversationShortId()), Integer.valueOf(hVar.getConversationType()), Integer.valueOf(hVar.getInboxType()));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        boolean z;
        String str;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        if (a(kVar)) {
            GetMessageByIdResponseBody getMessageByIdResponseBody = kVar.f38725f.body.get_message_by_id_body;
            Map<String, String> map = getMessageByIdResponseBody.msg_info.body.ext;
            if (map == null || !map.containsKey("s:client_message_id") || TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = "";
            } else {
                str = map.get("s:client_message_id");
            }
            ai a2 = f.a(str, (ai) null, getMessageByIdResponseBody.msg_info.body);
            a2.setMessageStatus(getMessageByIdResponseBody.msg_info.status);
            this.f38565b.put(Long.valueOf(a2.getMsgId()), a2);
            a(a2);
        } else {
            b(kVar);
        }
        e.a(kVar, z).a();
    }

    private void a(long j2, String str, Long l2, Integer num, Integer num2) {
        a(num2.intValue(), new RequestBody.Builder().get_message_by_id_body(new GetMessageByIdRequestBody.Builder().conversation_id(str).conversation_short_id(l2).conversation_type(num).server_message_id(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
