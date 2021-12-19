package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.OPERATION_TYPE;
import java.util.ArrayList;
import java.util.List;

public final class ah extends w<an> {
    static {
        Covode.recordClassIndex(22941);
    }

    public ah() {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue());
    }

    public static boolean a(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        if (modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS || modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_REPEAT_REQUEST) {
            return true;
        }
        return false;
    }

    public ah(b<an> bVar) {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue(), bVar);
    }

    public final void a(final an anVar) {
        if (anVar == null || anVar.invalid()) {
            a(-1015, anVar);
            return;
        }
        anVar.setMsgType(MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue());
        d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.ah.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22944);
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
                r2 = com.bytedance.im.core.internal.a.i.c(r3.getClientMessageId());
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Boolean a() {
                /*
                // Method dump skipped, instructions count: 422
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.ah.AnonymousClass3.a():java.lang.Boolean");
            }
        }, (com.bytedance.im.core.internal.e.b) null);
    }

    public static List<ag> b(an anVar) {
        List<ModifyPropertyContent> propertyContentList;
        if (anVar == null || (propertyContentList = anVar.getPropertyContentList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ModifyPropertyContent modifyPropertyContent : propertyContentList) {
            if (modifyPropertyContent.operation != null) {
                ag agVar = new ag();
                agVar.msgUuid = anVar.getClientMessageId();
                agVar.conversationId = anVar.getConversationId();
                agVar.uid = Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a());
                agVar.sec_uid = com.bytedance.im.core.a.d.a().f37562b.c();
                agVar.idempotent_id = modifyPropertyContent.idempotent_id;
                agVar.key = modifyPropertyContent.key;
                agVar.value = modifyPropertyContent.value;
                agVar.status = 1;
                agVar.create_time = Long.valueOf(System.currentTimeMillis());
                if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.ADD_PROPERTY_ITEM.getValue()) {
                    agVar.deleted = 0;
                } else if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.REMOVE_PROPERTY_ITEM.getValue()) {
                    agVar.deleted = 1;
                }
                arrayList.add(agVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || !kVar.l() || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.modify_message_property_body == null || !a(kVar.f38725f.body.modify_message_property_body.status)) {
            return false;
        }
        return true;
    }

    public final void a(int i2, an anVar) {
        if (anVar == null || !anVar.getMute()) {
            b(k.a(i2));
            q.a().a(i2, anVar);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r3 = (com.bytedance.im.core.d.an) r5.f38723d[0];
     */
    @Override // com.bytedance.im.core.internal.b.a.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final com.bytedance.im.core.internal.d.k r5, java.lang.Runnable r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0006
            java.lang.Object[] r0 = r5.f38723d
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object[] r1 = r5.f38723d
            r0 = 0
            r3 = r1[r0]
            com.bytedance.im.core.d.an r3 = (com.bytedance.im.core.d.an) r3
            if (r3 != 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r4.a(r5)
            com.bytedance.im.core.internal.b.a.ah$1 r2 = new com.bytedance.im.core.internal.b.a.ah$1
            r2.<init>(r5, r3, r0)
            com.bytedance.im.core.internal.b.a.ah$2 r1 = new com.bytedance.im.core.internal.b.a.ah$2
            r1.<init>(r3, r5, r0)
            java.util.concurrent.Executor r0 = com.bytedance.im.core.internal.e.a.a()
            com.bytedance.im.core.internal.e.d.a(r2, r1, r0)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.ah.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
    }
}
