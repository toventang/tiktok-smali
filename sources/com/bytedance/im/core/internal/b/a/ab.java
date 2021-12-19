package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.proto.IMCMD;

public final class ab extends w<String> {
    static {
        Covode.recordClassIndex(22919);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return true;
    }

    ab() {
        super(IMCMD.LEAVE_CONVERSATION.getValue());
    }

    public ab(b<String> bVar) {
        super(IMCMD.LEAVE_CONVERSATION.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        final String str = (String) kVar.f38723d[0];
        final boolean booleanValue = ((Boolean) kVar.f38723d[1]).booleanValue();
        if (kVar.l()) {
            d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.ab.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22920);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    com.bytedance.im.core.internal.a.c.e(str);
                    return true;
                }
            }, new com.bytedance.im.core.internal.e.b<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.ab.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22921);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Boolean bool) {
                    if (bool.booleanValue()) {
                        h a2 = j.a().a(str);
                        j.a().b(a2);
                        if (a2 != null && booleanValue) {
                            new j().b(a2);
                        }
                        ab.this.a(str);
                    }
                    runnable.run();
                    e.a(kVar, true).a("conversation_id", str).a();
                }
            });
            return;
        }
        b(kVar);
        runnable.run();
        e.a(kVar, false).a("conversation_id", str).a();
    }
}
