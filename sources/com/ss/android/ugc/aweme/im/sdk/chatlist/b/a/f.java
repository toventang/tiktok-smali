package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class f extends g {

    /* renamed from: h  reason: collision with root package name */
    public static final a f101882h = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public String f101883g;

    static {
        Covode.recordClassIndex(65180);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.d
    public final String bF_() {
        return "stranger_1";
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a, com.ss.android.ugc.aweme.im.service.k.a, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g
    public final int c() {
        return 2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65181);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a, com.ss.android.ugc.aweme.im.service.k.a, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g
    public final com.ss.android.ugc.aweme.im.service.k.b b() {
        return new b(this);
    }

    public final String h() {
        String str = this.f101883g;
        if (str == null) {
            l.a("lastConversationId");
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g
    public final String f() {
        String string = d.a().getString(R.string.d44);
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f101883g;
        if (str == null) {
            l.a("lastConversationId");
        }
        return hashCode + str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final String g() {
        String str = this.f101883g;
        if (str == null) {
            l.a("lastConversationId");
        }
        String valueOf = String.valueOf(b.a.c(str));
        IMUser a2 = g.a(valueOf, this.f101870d);
        com.ss.android.ugc.aweme.im.service.m.a.b("StrangerCellSession", "wrapContent: " + valueOf + ", " + this.f101870d);
        if (a2 != null) {
            StringBuilder sb = new StringBuilder();
            String displayName = a2.getDisplayName();
            l.b(displayName, "");
            if (!TextUtils.isEmpty(displayName) && displayName.length() > 6) {
                StringBuilder sb2 = new StringBuilder();
                Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                String substring = displayName.substring(0, 6);
                l.b(substring, "");
                displayName = sb2.append(substring).append("...").toString();
            }
            return sb.append(displayName).append("：").append(this.n).toString();
        }
        com.ss.android.ugc.aweme.im.service.m.a.e("StrangerCellSession", "wrapContent user null: " + valueOf + ", " + this.f101870d);
        String str2 = this.n;
        l.b(str2, "");
        return str2;
    }

    public static final class b implements com.ss.android.ugc.aweme.im.service.k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f101884a;

        static {
            Covode.recordClassIndex(65182);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f101884a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            l.d(eVar, "");
            l.d(aVar, "");
            if (i2 == 1 || i2 == 2) {
                l.d(eVar, "");
                Intent intent = new Intent(eVar, StrangerListActivity.class);
                com.ss.android.ugc.tiktok.security.a.a.a(intent, eVar);
                eVar.startActivity(intent);
                c.a(new m(11, -1));
                r.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("stranger").setValue(null));
                r.onEventV3("im_click_stranger_message");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f101883g;
        if (str == null) {
            l.a("lastConversationId");
        }
        f fVar = (f) obj;
        if (TextUtils.equals(str, fVar.h()) && TextUtils.equals(this.f103871m, fVar.f103871m) && TextUtils.equals(this.n, fVar.n) && this.o == fVar.o && this.q == fVar.q) {
            return true;
        }
        return false;
    }

    private f(String str, IMUser iMUser) {
        super(str, iMUser);
    }

    public /* synthetic */ f(String str, IMUser iMUser, byte b2) {
        this(str, iMUser);
    }
}
