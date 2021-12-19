package com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import f.a.aa;
import h.f.b.l;

public final class MessagingPrivacyViewModel extends ac {

    /* renamed from: l  reason: collision with root package name */
    public static final a f102941l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f102942a;

    /* renamed from: b  reason: collision with root package name */
    public String f102943b;

    /* renamed from: c  reason: collision with root package name */
    public String f102944c;

    /* renamed from: d  reason: collision with root package name */
    public final t<p> f102945d;

    /* renamed from: e  reason: collision with root package name */
    public final t<p> f102946e;

    /* renamed from: f  reason: collision with root package name */
    public final t<Boolean> f102947f;

    /* renamed from: g  reason: collision with root package name */
    public final f.a.b.a f102948g;

    /* renamed from: h  reason: collision with root package name */
    public final ChatAuthorityService f102949h;

    /* renamed from: i  reason: collision with root package name */
    final IIMService f102950i;

    /* renamed from: j  reason: collision with root package name */
    public final aa f102951j;

    /* renamed from: k  reason: collision with root package name */
    public final aa f102952k;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.privacy.a.a f102953m;
    private final com.ss.android.ugc.aweme.im.sdk.common.controller.b.b n;

    static {
        Covode.recordClassIndex(65991);
    }

    public MessagingPrivacyViewModel() {
        this((byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65992);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f102948g.a();
    }

    public final void a(boolean z) {
        String str;
        Integer num;
        if (z) {
            p value = this.f102945d.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getValue());
            } else {
                num = null;
            }
            str = com.ss.android.ugc.aweme.im.sdk.privacy.a.a.a(num);
        } else {
            str = "";
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(this.f102944c, this.f102943b, z ? 1 : 0, str, this.f102942a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ MessagingPrivacyViewModel(byte r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r0 = com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService.a.f102936a
            if (r0 != 0) goto L_0x0018
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
            java.lang.String r0 = com.ss.android.c.b.f59141e
            com.bytedance.ies.ugc.aweme.network.f r1 = r1.a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService> r0 = com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService.class
            java.lang.Object r0 = r1.a(r0)
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r0 = (com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService) r0
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService.a.f102936a = r0
        L_0x0018:
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r2 = com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService.a.f102936a
            if (r2 != 0) goto L_0x001f
            h.f.b.l.b()
        L_0x001f:
            com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$Companion r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.Companion
            com.ss.android.ugc.aweme.im.service.IIMService r3 = r0.get()
            f.a.aa r0 = f.a.a.b.a.f157156a
            f.a.aa r4 = f.a.a.a.a.a(r0)
            java.lang.String r1 = ""
            h.f.b.l.b(r4, r1)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r5 = f.a.h.a.b(r0)
            h.f.b.l.b(r5, r1)
            com.ss.android.ugc.aweme.im.sdk.privacy.a.a r6 = com.ss.android.ugc.aweme.im.sdk.privacy.a.a.f102913a
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b r7 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a()
            h.f.b.l.b(r7, r1)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel.<init>(byte):void");
    }

    public static final class b<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f102954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MessagingPrivacyViewModel f102955b;

        static {
            Covode.recordClassIndex(65993);
        }

        public b(p pVar, MessagingPrivacyViewModel messagingPrivacyViewModel) {
            this.f102954a = pVar;
            this.f102955b = messagingPrivacyViewModel;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            if (obj != null) {
                this.f102955b.f102946e.setValue(this.f102954a);
                this.f102955b.a(true);
                MessagingPrivacyViewModel messagingPrivacyViewModel = this.f102955b;
                messagingPrivacyViewModel.f102950i.updateChatUserSetting(this.f102954a.getValue());
            }
        }
    }

    private MessagingPrivacyViewModel(ChatAuthorityService chatAuthorityService, IIMService iIMService, aa aaVar, aa aaVar2, com.ss.android.ugc.aweme.im.sdk.privacy.a.a aVar, com.ss.android.ugc.aweme.im.sdk.common.controller.b.b bVar) {
        l.d(chatAuthorityService, "");
        l.d(iIMService, "");
        l.d(aaVar, "");
        l.d(aaVar2, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f102949h = chatAuthorityService;
        this.f102950i = iIMService;
        this.f102951j = aaVar;
        this.f102952k = aaVar2;
        this.f102953m = aVar;
        this.n = bVar;
        this.f102943b = "";
        this.f102944c = "";
        t<p> tVar = new t<>();
        tVar.setValue(null);
        this.f102945d = tVar;
        this.f102946e = new t<>();
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(false);
        this.f102947f = tVar2;
        this.f102948g = new f.a.b.a();
    }
}
