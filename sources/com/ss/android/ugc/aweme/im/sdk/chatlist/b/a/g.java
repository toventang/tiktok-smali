package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.d;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.b.l;
import java.util.HashMap;

public class g extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f101885i = new a((byte) 0);

    static {
        Covode.recordClassIndex(65183);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a, com.ss.android.ugc.aweme.im.service.k.a
    public int c() {
        return 1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65184);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a, com.ss.android.ugc.aweme.im.service.k.a
    public com.ss.android.ugc.aweme.im.service.k.b b() {
        return new b(this);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public String f() {
        IMUser a2 = a();
        if (a2 == null) {
            com.ss.android.ugc.aweme.im.service.m.a.e("StrangerSession", "getName user invalid");
            return "";
        }
        String nickName = a2.getNickName();
        l.b(nickName, "");
        return nickName;
    }

    public static final class b implements com.ss.android.ugc.aweme.im.service.k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f101886a;

        static {
            Covode.recordClassIndex(65185);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(g gVar) {
            this.f101886a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            String str;
            String str2;
            String str3 = "";
            l.d(eVar, str3);
            l.d(aVar, str3);
            IMUser a2 = this.f101886a.a();
            if (i2 == 0) {
                d.a(eVar, this.f101886a.a(), aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a.StrangerSession);
            } else if (i2 != 1 && i2 != 2) {
            } else {
                if (a2 == null) {
                    com.ss.android.ugc.aweme.im.service.m.a.e("StrangerSession", "doAction click user invalid");
                    return;
                }
                a2.setType(4);
                a.C2643a a3 = a.b.a((Context) eVar, a2).a(2);
                HashMap<String, String> hashMap = aVar.u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = str3;
                }
                a.C2643a c2 = a3.c(str);
                HashMap<String, String> hashMap2 = aVar.u;
                if (!(hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null)) {
                    str3 = str2;
                }
                ChatRoomActivity.a.a(c2.b(str3).a(this.f101886a.f103869k).c(aVar.q).d(a2.getFollowStatus()).b(aVar.r).a(aVar.s).f103883a);
                com.ss.android.ugc.aweme.im.sdk.chat.a.e.a(aVar.bF_(), "stranger");
            }
        }
    }

    public g(String str, IMUser iMUser) {
        super(str, iMUser);
    }
}
