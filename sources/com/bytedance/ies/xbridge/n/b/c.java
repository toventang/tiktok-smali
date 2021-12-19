package com.bytedance.ies.xbridge.n.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilderAction;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n.a.c;
import com.bytedance.ies.xbridge.n.d.b;
import com.bytedance.ies.xbridge.n.d.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c extends com.bytedance.ies.xbridge.n.a.c {
    static {
        Covode.recordClassIndex(21757);
    }

    public static final class a implements ShowActionSheetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f36323a;

        static {
            Covode.recordClassIndex(21758);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener
        public final void onDismiss() {
            c.a aVar = this.f36323a;
            com.bytedance.ies.xbridge.n.d.c cVar = new com.bytedance.ies.xbridge.n.d.c();
            cVar.f36340a = c.b.DISMISS;
            aVar.a(cVar, "");
        }

        a(c.a aVar) {
            this.f36323a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener
        public final void onSelect(int i2) {
            c.a aVar = this.f36323a;
            com.bytedance.ies.xbridge.n.d.c cVar = new com.bytedance.ies.xbridge.n.d.c();
            cVar.f36340a = c.b.SELECT;
            c.C0874c cVar2 = new c.C0874c();
            cVar2.f36343a = Integer.valueOf(i2);
            cVar.f36341b = cVar2;
            aVar.a(cVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.n.a.c
    public final void a(b bVar, c.a aVar, e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null || !(context instanceof androidx.fragment.app.e)) {
            aVar.a("Context not provided in host");
            return;
        }
        String str = bVar.f36332a;
        String str2 = bVar.f36333b;
        ArrayList arrayList = new ArrayList();
        List<b.a> list = bVar.f36334c;
        if (list == null) {
            l.a("actions");
        }
        for (T t : list) {
            String str3 = t.f36336a;
            if (str3 == null) {
                l.a("title");
            }
            String str4 = t.f36337b;
            String str5 = t.f36338c;
            if (str5 == null) {
                l.a(StringSet.type);
            }
            arrayList.add(new ActionSheetBuilderAction(str3, str4, str5));
        }
        a aVar2 = new a(aVar);
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar3 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        Boolean bool = null;
        if (!((bVar3 == null || (iHostStyleUIDepend = bVar3.f35877f) == null) && ((bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostStyleUIDepend = bVar2.f35877f) == null))) {
            bool = iHostStyleUIDepend.showActionSheet(new ActionSheetBuilder(context, str, str2, arrayList), aVar2);
        }
        if (true ^ l.a((Object) bool, (Object) true)) {
            aVar.a("Failed to show actionSheet in host");
        }
    }
}
