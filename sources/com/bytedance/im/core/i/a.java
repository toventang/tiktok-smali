package com.bytedance.im.core.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ak;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import java.util.List;

public final class a extends ak {
    static {
        Covode.recordClassIndex(22831);
    }

    private boolean i() {
        h a2 = a();
        if (a2 == null || !a2.isStranger()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.d.ak
    public final void c() {
        if (!i()) {
            super.c();
        }
    }

    @Override // com.bytedance.im.core.d.ak
    public final void b() {
        if (i()) {
            f.a().a(this.f37718a, new b<List<ai>>() {
                /* class com.bytedance.im.core.i.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22832);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    a.super.b();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* bridge */ /* synthetic */ void a(List<ai> list) {
                    a.super.b();
                }
            });
        } else {
            super.b();
        }
    }

    public a(String str, boolean z) {
        super(str, z);
        f.b("imsdk", "ExtendMessageModel constructor, conversationId:".concat(String.valueOf(str)), (Throwable) null);
    }

    @Override // com.bytedance.im.core.d.ak
    public final void a(final int i2, final String str, final b bVar) {
        if (i()) {
            f.a().a(this.f37718a, new b<List<ai>>() {
                /* class com.bytedance.im.core.i.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22833);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    a.super.a((a) i2, (int) str, (String) bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* bridge */ /* synthetic */ void a(List<ai> list) {
                    a.super.a((a) i2, (int) str, (String) bVar);
                }
            });
        } else {
            super.a(i2, str, bVar);
        }
    }

    @Override // com.bytedance.im.core.d.v, com.bytedance.im.core.d.ak
    public final void a(List<ai> list, int i2, String str) {
        if (i()) {
            f a2 = f.a();
            String str2 = this.f37718a;
            ai g2 = g();
            h a3 = a2.a(str2);
            if (!(a3 == null || g2 == null)) {
                f.b("imsdk", "StrangerManager updateLastMessage, cid:" + str2 + ", msgUuid:" + g2.getUuid() + ", msgSvrId:" + g2.getMsgId() + ", msgIndex:" + g2.getIndex() + ", msgOrderIndex:" + g2.getOrderIndex(), (Throwable) null);
                g.a(a3, g2);
            }
        }
        super.a(list, i2, str);
    }
}
