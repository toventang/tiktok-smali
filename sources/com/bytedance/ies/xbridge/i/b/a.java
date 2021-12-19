package com.bytedance.ies.xbridge.i.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.d;
import com.bytedance.ies.xbridge.base.runtime.a.e;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.bytedance.ies.xbridge.i.a.a;
import com.bytedance.ies.xbridge.i.c.b;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class a extends com.bytedance.ies.xbridge.i.a.a {
    static {
        Covode.recordClassIndex(21572);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.a$a  reason: collision with other inner class name */
    public static final class C0840a implements IChooseMediaResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.AbstractC0838a f36061a;

        static {
            Covode.recordClassIndex(21573);
        }

        C0840a(a.AbstractC0838a aVar) {
            this.f36061a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
        public final void onFailure(int i2, String str) {
            l.c(str, "");
            this.f36061a.a(i2, str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
        public final void onSuccess(e eVar, String str) {
            l.c(eVar, "");
            l.c(str, "");
            ArrayList arrayList = new ArrayList();
            List<e.a> list = eVar.f35800a;
            if (list != null) {
                for (T t : list) {
                    b.C0845b bVar = new b.C0845b(t.f35802b, t.f35803c, t.f35804d, t.f35805e);
                    String str2 = t.f35801a;
                    if (str2 != null) {
                        bVar.f36103a = str2;
                    }
                    arrayList.add(bVar);
                }
            }
            a.AbstractC0838a aVar = this.f36061a;
            b bVar2 = new b();
            bVar2.f36102a = arrayList;
            aVar.a(bVar2, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.i.a.a
    public final void a(com.bytedance.ies.xbridge.i.c.a aVar, a.AbstractC0838a aVar2, com.bytedance.ies.xbridge.e eVar) {
        IHostMediaDepend iHostMediaDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        String a2 = aVar.a();
        String str = aVar.f36093f;
        Locale locale = Locale.ROOT;
        l.a((Object) locale, "");
        if (a2 != null) {
            String lowerCase = a2.toLowerCase(locale);
            l.a((Object) lowerCase, "");
            if (!l.a((Object) lowerCase, (Object) "camera") || str.length() != 0) {
                Context context = (Context) a(Context.class);
                if (context == null) {
                    aVar2.a(0, "Context not provided in host");
                    return;
                }
                List<String> list = aVar.f36088a;
                if (list == null) {
                    l.a("mediaTypes");
                }
                d dVar = new d(list, aVar.a(), aVar.f36090c, aVar.f36091d, aVar.f36092e, aVar.f36093f, aVar.f36094g, aVar.f36095h, aVar.f36096i);
                dVar.f35787a = aVar.f36097j;
                dVar.f35789c = aVar.f36099l;
                dVar.f35788b = aVar.f36098k;
                dVar.f35790d = aVar.f36100m;
                C0840a aVar3 = new C0840a(aVar2);
                com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
                if ((bVar2 == null || (iHostMediaDepend = bVar2.f35874c) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostMediaDepend = bVar.f35874c) == null)) {
                    aVar2.a(0, "hostMediaDepend is null");
                } else {
                    iHostMediaDepend.handleJsInvoke(context, dVar, aVar3);
                }
            } else {
                aVar2.a(-3, "CameraType not provided with sourceType specified as camera in params");
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }
}
