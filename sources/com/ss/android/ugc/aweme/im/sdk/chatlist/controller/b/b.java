package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f101890a;

    /* renamed from: b  reason: collision with root package name */
    private final String f101891b;

    /* renamed from: c  reason: collision with root package name */
    private final String f101892c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.b<String, Boolean> f101893d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.b<Integer, z> f101894e;

    static {
        Covode.recordClassIndex(65192);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a
    public final void a(com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
        boolean z;
        l.d(aVar, "");
        if (i2 == 0) {
            com.ss.android.ugc.aweme.im.service.k.b bVar = aVar.w;
            if (bVar != null) {
                bVar.a(this.f101890a, aVar, i2);
            }
            this.f101894e.invoke(Integer.valueOf(aVar.c()));
        } else if (i2 == 1 || i2 == 2) {
            if (aVar.u == null) {
                aVar.u = new HashMap<>();
            }
            HashMap<String, String> hashMap = aVar.u;
            l.b(hashMap, "");
            hashMap.put("enter_from", this.f101891b);
            if (this.f101892c.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                HashMap<String, String> hashMap2 = aVar.u;
                l.b(hashMap2, "");
                hashMap2.put("enter_method", "cell");
            } else {
                HashMap<String, String> hashMap3 = aVar.u;
                l.b(hashMap3, "");
                hashMap3.put("enter_method", this.f101892c);
            }
            com.ss.android.ugc.aweme.im.service.k.b bVar2 = aVar.w;
            if (bVar2 != null) {
                bVar2.a(this.f101890a, aVar, i2);
            }
            if (aVar.c() == 20) {
                h.f.a.b<String, Boolean> bVar3 = this.f101893d;
                String bF_ = aVar.bF_();
                l.b(bF_, "");
                if (bVar3.invoke(bF_).booleanValue()) {
                    return;
                }
            }
            if (i2 != 2 || !(aVar instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a)) {
                aVar.q = 0;
            }
        }
    }

    public /* synthetic */ b(e eVar, String str, String str2) {
        this(eVar, str, str2, new h.f.a.b<String, Boolean>(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.f102632a) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65193);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(String str) {
                return Boolean.valueOf(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(a.C0745a.a().a(str)));
            }
        }, new h.f.a.b<Integer, z>(com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.f101846a) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65194);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Integer num) {
                String str;
                String str2;
                int intValue = num.intValue();
                a.d dVar = a.d.f101850a;
                l.d(dVar, "");
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    androidx.c.a aVar = new androidx.c.a();
                    if (intValue == 20) {
                        str2 = "group";
                    } else {
                        str2 = "private";
                    }
                    aVar.put("chat_type", str2);
                    aVar.put("target", "report");
                    dVar.invoke("chat_list_feedback", aVar);
                } else {
                    androidx.c.a aVar2 = new androidx.c.a();
                    if (intValue == 1) {
                        str = "message_box";
                    } else {
                        str = "message";
                    }
                    aVar2.put("enter_from", str);
                    dVar.invoke("chat_list_long_press", aVar2);
                }
                return z.f158842a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private b(e eVar, String str, String str2, h.f.a.b<? super String, Boolean> bVar, h.f.a.b<? super Integer, z> bVar2) {
        l.d(eVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f101890a = eVar;
        this.f101891b = str;
        this.f101892c = str2;
        this.f101893d = bVar;
        this.f101894e = bVar2;
    }
}
