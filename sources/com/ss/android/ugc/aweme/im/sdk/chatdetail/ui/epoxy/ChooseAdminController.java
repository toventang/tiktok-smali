package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy;

import android.content.Context;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.airbnb.epoxy.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class ChooseAdminController extends Typed2EpoxyController<List<? extends IMUser>, IMUser> {
    private final Context context;
    public final b<IMUser, z> onSelectStateChange;

    static {
        Covode.recordClassIndex(65059);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<IMUser, z> {
        final /* synthetic */ IMUser $selectedUser$inlined;
        final /* synthetic */ ChooseAdminController this$0;

        static {
            Covode.recordClassIndex(65060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChooseAdminController chooseAdminController, IMUser iMUser) {
            super(1);
            this.this$0 = chooseAdminController;
            this.$selectedUser$inlined = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(IMUser iMUser) {
            b<IMUser, z> bVar = this.this$0.onSelectStateChange;
            l.b(iMUser, "");
            bVar.invoke(iMUser);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseAdminController(Context context2, b<? super IMUser, z> bVar) {
        super(com.airbnb.epoxy.m.a(), com.airbnb.epoxy.m.a());
        l.d(context2, "");
        l.d(bVar, "");
        this.context = context2;
        this.onSelectStateChange = bVar;
    }

    /* access modifiers changed from: protected */
    public final void buildModels(List<? extends IMUser> list, IMUser iMUser) {
        String str;
        l.d(list, "");
        for (T t : list) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.b a2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.b().b((CharSequence) t.getUid()).a((IMUser) t);
            if (iMUser != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            a2.a(l.a((Object) str, (Object) t.getUid())).a((b<? super IMUser, z>) new a(this, iMUser)).a((n) this);
        }
    }
}
