package com.bytedance.ies.xbridge.n.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.n.a.e;
import com.bytedance.ies.xbridge.n.d.d;
import h.f.b.l;

public final class e extends com.bytedance.ies.xbridge.n.a.e {
    static {
        Covode.recordClassIndex(21760);
    }

    static final class b implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f36325a;

        static {
            Covode.recordClassIndex(21762);
        }

        b(e.a aVar) {
            this.f36325a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            e.a aVar = this.f36325a;
            com.bytedance.ies.xbridge.n.d.e eVar = new com.bytedance.ies.xbridge.n.d.e();
            eVar.f36352a = "mask";
            aVar.a(eVar, "");
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f36324a;

        static {
            Covode.recordClassIndex(21761);
        }

        a(e.a aVar) {
            this.f36324a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            e.a aVar = this.f36324a;
            com.bytedance.ies.xbridge.n.d.e eVar = new com.bytedance.ies.xbridge.n.d.e();
            eVar.f36352a = "cancel";
            aVar.a(eVar, "");
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f36326a;

        static {
            Covode.recordClassIndex(21763);
        }

        c(e.a aVar) {
            this.f36326a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            e.a aVar = this.f36326a;
            com.bytedance.ies.xbridge.n.d.e eVar = new com.bytedance.ies.xbridge.n.d.e();
            eVar.f36352a = "confirm";
            aVar.a(eVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.n.a.e
    public final void a(d dVar, e.a aVar, com.bytedance.ies.xbridge.e eVar) {
        String str;
        String str2;
        a aVar2;
        b bVar;
        IHostStyleUIDepend iHostStyleUIDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Activity a2 = com.bytedance.ies.xbridge.o.a.a((Context) a(Context.class));
        if (a2 == null) {
            aVar.a("Context not provided in host");
            return;
        }
        boolean z = dVar.f36350f;
        if (dVar.b().length() > 0) {
            str = dVar.b();
        } else {
            str = "confirm";
        }
        String str3 = dVar.f36346b;
        if (str3 == null) {
            l.a("content");
        }
        String str4 = dVar.f36345a;
        if (str4 == null) {
            l.a("title");
        }
        c cVar = new c(aVar);
        Boolean bool = null;
        if (dVar.f36347c) {
            if (dVar.a().length() > 0) {
                str2 = dVar.a();
            } else {
                str2 = "cancel";
            }
            aVar2 = new a(aVar);
        } else {
            str2 = null;
            aVar2 = null;
        }
        if (z) {
            bVar = new b(aVar);
        } else {
            bVar = null;
        }
        DialogBuilder dialogBuilder = new DialogBuilder(a2, str4, str3, str, cVar, str2, aVar2, bVar, z);
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar3 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (!((bVar3 == null || (iHostStyleUIDepend = bVar3.f35877f) == null) && ((bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostStyleUIDepend = bVar2.f35877f) == null))) {
            bool = iHostStyleUIDepend.showDialog(dialogBuilder);
        }
        if (!l.a((Object) bool, (Object) true)) {
            new com.bytedance.ies.xbridge.n.c.a.a().showDialog(dialogBuilder);
        }
    }
}
