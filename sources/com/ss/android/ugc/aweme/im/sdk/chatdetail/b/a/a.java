package com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public IMUser f101513a;

    /* renamed from: b  reason: collision with root package name */
    public String f101514b;

    /* renamed from: c  reason: collision with root package name */
    public String f101515c;

    /* renamed from: d  reason: collision with root package name */
    public h f101516d;

    /* renamed from: e  reason: collision with root package name */
    public long f101517e;

    /* renamed from: f  reason: collision with root package name */
    public ApplyStatusCode f101518f = ApplyStatusCode.INVALID;

    /* renamed from: g  reason: collision with root package name */
    public long f101519g;

    /* renamed from: h  reason: collision with root package name */
    public String f101520h;

    /* renamed from: i  reason: collision with root package name */
    public String f101521i;

    /* renamed from: j  reason: collision with root package name */
    public IMUser f101522j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, String> f101523k;

    static {
        Covode.recordClassIndex(64924);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a$a  reason: collision with other inner class name */
    public static final class C2523a implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101524a;

        static {
            Covode.recordClassIndex(64925);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2523a(a aVar) {
            this.f101524a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            this.f101524a.f101513a = iMUser;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            l.d(th, "");
            l.d(th, "");
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.im.service.i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101525a;

        static {
            Covode.recordClassIndex(64926);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f101525a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(IMUser iMUser) {
            this.f101525a.f101522j = iMUser;
        }

        @Override // com.ss.android.ugc.aweme.im.service.i.a
        public final void a(Throwable th) {
            l.d(th, "");
            l.d(th, "");
        }
    }

    public static final class c implements com.bytedance.im.core.a.a.b<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101526a;

        static {
            Covode.recordClassIndex(64927);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f101526a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* bridge */ /* synthetic */ void a(h hVar) {
            this.f101526a.f101516d = hVar;
        }
    }

    public final a a(ConversationApplyInfo conversationApplyInfo) {
        String str;
        String str2;
        l.d(conversationApplyInfo, "");
        this.f101514b = String.valueOf(conversationApplyInfo.user_id.longValue());
        this.f101515c = conversationApplyInfo.sec_uid;
        Long l2 = conversationApplyInfo.apply_id;
        l.b(l2, "");
        this.f101517e = l2.longValue();
        this.f101518f = conversationApplyInfo.apply_status;
        Long l3 = conversationApplyInfo.create_time;
        l.b(l3, "");
        this.f101519g = l3.longValue();
        Long l4 = conversationApplyInfo.invite_user_id;
        String str3 = null;
        if (l4 != null) {
            str = String.valueOf(l4.longValue());
        } else {
            str = null;
        }
        this.f101520h = str;
        String str4 = conversationApplyInfo.sec_invite_uid;
        if (str4 != null) {
            str2 = str4.toString();
        } else {
            str2 = null;
        }
        this.f101521i = str2;
        this.f101523k = conversationApplyInfo.ext;
        if (conversationApplyInfo.user_id != null && this.f101513a == null) {
            g.a(this.f101514b, this.f101515c, new C2523a(this));
        }
        if (conversationApplyInfo.invite_user_id != null && this.f101522j == null) {
            g.a(this.f101520h, this.f101521i, new b(this));
        }
        if (conversationApplyInfo.conv_short_id != null && this.f101516d == null) {
            com.bytedance.ies.im.core.api.b.a a2 = a.C0745a.a();
            Long l5 = conversationApplyInfo.conv_short_id;
            if (l5 != null) {
                str3 = String.valueOf(l5.longValue());
            }
            a2.a(str3, new c(this));
        }
        return this;
    }
}
