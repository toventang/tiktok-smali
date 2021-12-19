package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public class a extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final C2534a f101866e = new C2534a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f101867a = b.NONE;

    /* renamed from: b  reason: collision with root package name */
    public boolean f101868b;

    /* renamed from: c  reason: collision with root package name */
    public IMUser f101869c;

    /* renamed from: d  reason: collision with root package name */
    public final String f101870d;

    public enum b {
        NONE,
        MUSICIAN,
        ENTERPRISE,
        OTHER;

        static {
            Covode.recordClassIndex(65167);
        }
    }

    static {
        Covode.recordClassIndex(65165);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public int c() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a$a  reason: collision with other inner class name */
    public static final class C2534a {
        static {
            Covode.recordClassIndex(65166);
        }

        private C2534a() {
        }

        public /* synthetic */ C2534a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public com.ss.android.ugc.aweme.im.service.k.b b() {
        return new c(this);
    }

    public final IMUser a() {
        if (this.f101869c == null) {
            com.ss.android.ugc.aweme.im.service.m.a.c("ChatSession", "getFromUser is null");
            long c2 = b.a.c(this.f103869k);
            IMUser b2 = g.b(String.valueOf(c2), this.f101870d);
            if (b2 != null) {
                this.f101869c = b2;
            } else {
                g.a(String.valueOf(c2), this.f101870d, new d(this));
            }
        }
        return this.f101869c;
    }

    public static final class c implements com.ss.android.ugc.aweme.im.service.k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101872a;

        static {
            Covode.recordClassIndex(65168);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f101872a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            String str;
            String str2;
            l.d(eVar, "");
            l.d(aVar, "");
            String valueOf = String.valueOf(b.a.c(aVar.bF_()));
            if (i2 == 0) {
                com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.d.a(eVar, this.f101872a.a(), aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a.ChatSession);
            } else if (i2 == 1 || i2 == 2) {
                if (l.a((Object) valueOf, (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b())) {
                    com.ss.android.ugc.aweme.im.sdk.chat.a.e.a("", "to_myself");
                } else {
                    com.ss.android.ugc.aweme.im.sdk.chat.a.e.a(valueOf, "no_stranger");
                }
                IMUser a2 = this.f101872a.a();
                if (a2 == null) {
                    a2 = new IMUser();
                    a2.setUid(valueOf);
                    if (this.f101872a.f103870l instanceof UrlModel) {
                        Object obj = this.f101872a.f103870l;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                        a2.setAvatarThumb((UrlModel) obj);
                    }
                    a2.setNickName(this.f101872a.f());
                }
                a2.setType(-1);
                com.ss.android.ugc.aweme.im.service.model.g gVar = new com.ss.android.ugc.aweme.im.service.model.g();
                gVar.commerceScene = "msg_list";
                a.C2643a a3 = a.b.a((Context) eVar, a2).a(3);
                HashMap<String, String> hashMap = aVar.u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = "message";
                }
                a.C2643a c2 = a3.c(str);
                HashMap<String, String> hashMap2 = aVar.u;
                if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                    str2 = "cell";
                }
                ChatRoomActivity.a.a(c2.b(str2).a(aVar.bF_()).a(gVar).c(aVar.q).d(a2.getFollowStatus()).b(aVar.r).a(aVar.s).f103883a);
            }
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101873a;

        static {
            Covode.recordClassIndex(65169);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f101873a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            l.d(th, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("ChatSession", "getFromUser fetch user error", th);
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            boolean z;
            if (iMUser != null) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.im.service.m.a.a("ChatSession", "User onQueryResult hasUSer=".concat(String.valueOf(z)));
            this.f101873a.f101869c = iMUser;
        }
    }

    public a(String str, IMUser iMUser) {
        this.f101870d = str;
        this.f101869c = iMUser;
    }
}
