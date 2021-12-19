package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.d;
import com.ss.android.ugc.aweme.im.service.k.b;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.b.l;
import java.util.HashMap;

public final class c extends d {
    static {
        Covode.recordClassIndex(65172);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final int c() {
        return 20;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final b b() {
        return new a(this);
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f101875a;

        static {
            Covode.recordClassIndex(65173);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f101875a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            String str;
            String str2;
            IMConversation iMConversation;
            l.d(eVar, "");
            l.d(aVar, "");
            if (i2 == 1 || i2 == 2) {
                a.C2643a a2 = a.b.a(eVar, 3, this.f101875a.bF_()).a(3);
                HashMap<String, String> hashMap = aVar.u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = "message";
                }
                a.C2643a c2 = a2.c(str);
                HashMap<String, String> hashMap2 = aVar.u;
                if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                    str2 = "chat_list";
                }
                ChatRoomActivity.a.a(c2.b(str2).c(aVar.q).b(aVar.r).a(aVar.s).f103883a);
            } else if (i2 == 0) {
                h a3 = a.C0745a.a().a(this.f101875a.f103869k);
                if (a3 != null) {
                    iMConversation = com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.b(a3);
                } else {
                    iMConversation = null;
                }
                d.a(eVar, iMConversation, aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a.ChatSession);
            }
        }
    }
}
