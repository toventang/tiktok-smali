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

public final class l extends w<String> {
    static {
        Covode.recordClassIndex(23020);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return true;
    }

    public l(b<String> bVar) {
        super(IMCMD.DISSOLVE_CONVERSATION.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        final String str = (String) kVar.f38723d[0];
        final boolean booleanValue = ((Boolean) kVar.f38723d[1]).booleanValue();
        if (kVar.l()) {
            d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23021);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    if (booleanValue) {
                        return Boolean.valueOf(com.bytedance.im.core.internal.a.c.e(str));
                    }
                    return Boolean.valueOf(com.bytedance.im.core.internal.a.c.d(str));
                }
            }, new com.bytedance.im.core.internal.e.b<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.l.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(23022);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    if (bool2.booleanValue()) {
                        h a2 = j.a().a(str);
                        if (a2 != null) {
                            a2.setStatus(1);
                            if (booleanValue) {
                                j.a().b(a2);
                            }
                            j.a().d(a2);
                        }
                        l.this.a(str);
                    } else {
                        l.this.b(k.a(-3001));
                    }
                    e.a(kVar, bool2.booleanValue()).a("conversation_id", str).a();
                }
            });
            return;
        }
        b(kVar);
        runnable.run();
        e.a(kVar, false).a("conversation_id", str).a();
    }
}
