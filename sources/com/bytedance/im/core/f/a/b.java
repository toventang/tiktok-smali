package com.bytedance.im.core.f.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import java.util.List;

public final class b extends w {

    /* renamed from: a  reason: collision with root package name */
    public long f38071a;

    /* renamed from: b  reason: collision with root package name */
    public long f38072b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38073c;

    static {
        Covode.recordClassIndex(22813);
    }

    public b(boolean z) {
        super(IMCMD.GET_MESSAGES_CHECKINFO_IN_CONVERSATION.getValue());
        this.f38073c = z;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.get_messages_checkinfo_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (a(kVar) && kVar.l()) {
            final String str = (String) kVar.f38723d[0];
            kVar.f38724e.inbox_type.intValue();
            final List<MessagesCheckInfo> list = kVar.f38725f.body.get_messages_checkinfo_in_conversation_body.msgs_checkinfo_list;
            if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                a.a().execute(new Runnable() {
                    /* class com.bytedance.im.core.f.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22814);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0110  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x011d  */
                    /* JADX WARNING: Removed duplicated region for block: B:37:0x0196  */
                    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c3  */
                    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c5  */
                    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 465
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.f.a.b.AnonymousClass1.run():void");
                    }
                });
            }
        }
    }
}
