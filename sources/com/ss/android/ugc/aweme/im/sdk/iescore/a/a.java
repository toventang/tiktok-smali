package com.ss.android.ugc.aweme.im.sdk.iescore.a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.MessageBody;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.l;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.x;
import com.ss.android.ugc.aweme.im.sdk.notification.a.e;
import com.ss.android.ugc.aweme.im.service.c.g;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Map;

public final class a implements com.bytedance.ies.im.core.api.b.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102790a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f102791b = i.a((h.f.a.a) C2593a.f102792a);

    @Override // com.bytedance.ies.im.core.api.b.c
    public final com.bytedance.ies.im.core.api.f.a a() {
        return (com.bytedance.ies.im.core.api.f.a) f102791b.getValue();
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102794a = new c();

        static {
            Covode.recordClassIndex(65904);
        }

        c() {
        }

        public final void run() {
            a.e();
        }
    }

    private a() {
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102793a = new b();

        static {
            Covode.recordClassIndex(65903);
        }

        b() {
        }

        public final void run() {
            a.f102790a.d();
        }
    }

    static {
        Covode.recordClassIndex(65901);
    }

    private static int[] f() {
        if (com.ss.android.ugc.aweme.im.service.c.b.a()) {
            return new int[]{0, 1};
        }
        return new int[]{0};
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void b() {
        if (g.b()) {
            com.ss.android.ugc.aweme.cw.g.e().execute(b.f102793a);
        } else {
            d();
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void c() {
        if (g.b()) {
            com.ss.android.ugc.aweme.cw.g.e().execute(c.f102794a);
        } else {
            e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.a.a$a  reason: collision with other inner class name */
    static final class C2593a extends m implements h.f.a.a<com.bytedance.ies.im.core.api.f.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2593a f102792a = new C2593a();

        static {
            Covode.recordClassIndex(65902);
        }

        C2593a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.im.core.api.f.a invoke() {
            com.bytedance.ies.im.core.api.f.a aVar = new com.bytedance.ies.im.core.api.f.a();
            aVar.a(new int[]{0, 1});
            aVar.b(new int[]{0, 1});
            aVar.f33964c = 100;
            aVar.f33970i = ((Boolean) com.ss.android.ugc.aweme.lego.b.a.f107404g.getValue()).booleanValue();
            return aVar;
        }
    }

    public static void e() {
        com.ss.android.ugc.aweme.im.service.m.a.c("ClientBridgeImpl", "onSDKLogout: " + com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a() + ", " + com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b());
        l.a.a().e();
        j.b();
        e.f102841b.g();
    }

    public final void d() {
        int[] f2 = f();
        a().a(f2);
        a().b(f2);
        com.bytedance.ies.im.core.api.b.a().a(f2);
        com.bytedance.ies.im.core.api.b.a().b(f2);
        com.ss.android.ugc.aweme.im.service.m.a.c("ClientBridgeImpl", "onSDKLogin: " + com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b());
        j.a();
        l.a.a().c();
        e.f102841b.e();
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.c.a()) {
            com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(true);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final int a(com.bytedance.ies.im.core.api.f.c cVar) {
        h.f.b.l.d(cVar, "");
        return t.a(cVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void a(ai aiVar) {
        h.f.b.l.d(aiVar, "");
        Map<String, String> localExt = aiVar.getLocalExt();
        h.f.b.l.b(localExt, "");
        localExt.put("send_sdk_time", String.valueOf(SystemClock.uptimeMillis()));
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().equals(String.valueOf(b.a.c(aiVar.getConversationId())))) {
            aiVar.setMsgStatus(2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final MessageBody a(MessageBody messageBody) {
        long j2;
        h.f.b.l.d(messageBody, "");
        Integer num = messageBody.message_type;
        if (num != null && num.intValue() == 1) {
            try {
                if (!TextUtils.isEmpty(messageBody.content)) {
                    long h2 = d.h();
                    SystemContent systemContent = (SystemContent) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j.a(messageBody.content, SystemContent.class);
                    long minVersion = systemContent.getMinVersion();
                    if (systemContent.getMaxVersion() == 0) {
                        j2 = h2;
                    } else {
                        j2 = systemContent.getMaxVersion();
                    }
                    if (minVersion <= h2) {
                        if (j2 > h2) {
                            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "filter system message:".concat(String.valueOf(systemContent)));
                            return null;
                        }
                    }
                }
            } catch (Exception unused) {
                return messageBody;
            }
        }
        Integer num2 = messageBody.message_type;
        if (num2 != null && num2.intValue() == 1002) {
            try {
                if (!TextUtils.isEmpty(messageBody.content) && ((SayHelloContent) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j.a(messageBody.content, SayHelloContent.class)).getType() == 100200) {
                    return null;
                }
            } catch (Exception unused2) {
            }
        }
        return messageBody;
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void a(h.f.a.b<? super com.bytedance.ies.im.core.api.b.c, z> bVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar, "");
        new Handler(Looper.getMainLooper()).post(new c.a.RunnableC0746a(bVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void b(int i2, int i3) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ClientBridgeImpl", "onPullMsg inbox=" + i2 + " reason=" + i3);
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void a(int i2, int i3) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ClientBridgeImpl", "onSDKInitState inbox=" + i2 + " result=" + i3);
        if (i3 == 0) {
            boolean unused = com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.e(i2), false);
        } else if (i3 == 1) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.e(i2), new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.d(false));
        } else if (i3 == 2) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.e(i2), new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.d(true));
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.c
    public final void a(com.bytedance.im.core.d.h hVar, ai aiVar, com.bytedance.ies.im.core.api.f.c cVar) {
        com.bytedance.ies.im.core.api.f.c cVar2;
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(aiVar, "");
        h.f.b.l.d(cVar, "");
        String str = null;
        if (!(cVar instanceof BaseContent)) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        BaseContent baseContent = (BaseContent) cVar2;
        if (baseContent != null) {
            if (aiVar.getMsgType() == 5 && (baseContent instanceof EmojiContent) && baseContent.getType() == 504 && !((EmojiContent) baseContent).isUpdateConversationTime()) {
                aiVar.addLocalExt("awe:create_time", String.valueOf(System.currentTimeMillis()));
                aiVar.setCreatedAt(hVar.getUpdatedTime() + 1);
            }
            Long sendStartTime = baseContent.getSendStartTime();
            if (sendStartTime != null) {
                str = String.valueOf(sendStartTime.longValue());
            }
            aiVar.addLocalExt("send_time", str);
        }
        String valueOf = String.valueOf(cVar.hashCode());
        String a2 = x.a(valueOf, "process_id");
        if (!TextUtils.isEmpty(a2)) {
            aiVar.addLocalExt("process_id", a2);
        }
        String a3 = x.a(valueOf, "enter_from");
        if (!TextUtils.isEmpty(a3)) {
            aiVar.addLocalExt("enter_from", a3);
        }
        String a4 = x.a(valueOf, "message_type");
        if (!TextUtils.isEmpty(a4)) {
            aiVar.addLocalExt("message_type", a4);
        }
        String a5 = x.a(valueOf, "enter_method");
        if (!TextUtils.isEmpty(a5)) {
            aiVar.addLocalExt("enter_method", a5);
        }
        String a6 = x.a(valueOf, "is_share_pop_up");
        if (a6 != null && a6.length() != 0) {
            aiVar.addLocalExt("is_share_pop_up", a6);
        }
    }
}
