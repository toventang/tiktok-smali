package com.bytedance.im.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.a.a.a.e;
import com.bytedance.im.a.a.b.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.w;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.RequestBody;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class a implements w {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f37534d;

    /* renamed from: a  reason: collision with root package name */
    public Set<b> f37535a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Pair<Long, ConversationApplyInfo> f37536b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f37537c = 0;

    /* renamed from: e  reason: collision with root package name */
    private volatile long f37538e = 0;

    static {
        Covode.recordClassIndex(22589);
    }

    private a() {
        s.a();
        this.f37538e = s.f38859a.b(s.a(s.a(0, "delete_audit_create_time")), (Long) 0L);
        q.a().f38792f.add(this);
    }

    public static a a() {
        MethodCollector.i(4190);
        if (f37534d == null) {
            synchronized (a.class) {
                try {
                    if (f37534d == null) {
                        f37534d = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4190);
                    throw th;
                }
            }
        }
        a aVar = f37534d;
        MethodCollector.o(4190);
        return aVar;
    }

    private void b(ConversationApplyInfo conversationApplyInfo) {
        if (!this.f37535a.isEmpty()) {
            for (b bVar : this.f37535a) {
                bVar.b(conversationApplyInfo);
            }
        }
    }

    private void a(ConversationApplyInfo conversationApplyInfo) {
        if (this.f37536b == null) {
            this.f37536b = new Pair<>(0L, null);
        }
        long longValue = ((Long) this.f37536b.first).longValue();
        ConversationApplyInfo conversationApplyInfo2 = (ConversationApplyInfo) this.f37536b.second;
        if (conversationApplyInfo2 != null && conversationApplyInfo.create_time.longValue() > conversationApplyInfo2.create_time.longValue()) {
            this.f37536b = new Pair<>(Long.valueOf(longValue), conversationApplyInfo);
            s.a().b(h.f38770a.b(conversationApplyInfo));
        }
        if (!this.f37535a.isEmpty()) {
            for (b bVar : this.f37535a) {
                bVar.a(conversationApplyInfo);
            }
        }
    }

    @Override // com.bytedance.im.core.d.w
    public final boolean a(NewMessageNotify newMessageNotify) {
        MessageBody messageBody = newMessageNotify.message;
        if (messageBody.message_type.intValue() == MessageType.MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY.getValue()) {
            f.a("imsdk", "ConversationAuditModel handle:" + messageBody.message_type, (Throwable) null);
            b bVar = (b) h.f38770a.a(messageBody.content, b.class);
            if (bVar == null) {
                return true;
            }
            a(new ConversationApplyInfo(Long.valueOf(bVar.f37544a), Long.valueOf(bVar.f37546c), Integer.valueOf(bVar.f37547d), ApplyStatusCode.fromValue(bVar.f37548e), Long.valueOf(bVar.f37549f), Long.valueOf(bVar.f37550g), Long.valueOf(bVar.f37552i), Long.valueOf(bVar.f37551h), bVar.f37545b, Long.valueOf(bVar.f37544a), bVar.f37556m, bVar.a(), bVar.o));
            return true;
        } else if (messageBody.message_type.intValue() != MessageType.MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY.getValue()) {
            return false;
        } else {
            f.a("imsdk", "ConversationAuditModel handle:" + messageBody.message_type, (Throwable) null);
            b bVar2 = (b) h.f38770a.a(messageBody.content, b.class);
            if (bVar2 == null) {
                return true;
            }
            b(new ConversationApplyInfo(Long.valueOf(bVar2.f37544a), Long.valueOf(bVar2.f37546c), Integer.valueOf(bVar2.f37547d), ApplyStatusCode.fromValue(bVar2.f37548e), Long.valueOf(bVar2.f37549f), Long.valueOf(bVar2.f37550g), Long.valueOf(bVar2.f37552i), Long.valueOf(bVar2.f37551h), bVar2.f37545b, Long.valueOf(bVar2.f37555l), bVar2.f37556m, bVar2.a(), bVar2.o));
            return true;
        }
    }

    public static void a(long j2, int i2, com.bytedance.im.core.a.a.b<Boolean> bVar) {
        e eVar = new e(bVar);
        f.a("imsdk", "GetConversationAuditSwitchHandler, conversationShortId = " + j2 + " &conversationType = " + i2, (Throwable) null);
        eVar.a(0, new RequestBody.Builder().addExtension(2022, GetConversationAuditSwitchRequestBody.ADAPTER, new GetConversationAuditSwitchRequestBody.Builder().conv_short_id(Long.valueOf(j2)).conversation_type(Integer.valueOf(i2)).build()).build(), null, new Object[0]);
    }
}
