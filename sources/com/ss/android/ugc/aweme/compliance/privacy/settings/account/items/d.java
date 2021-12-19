package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;

public final class d extends a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77536a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77537b = i.a((h.f.a.a) c.f77543a);

    /* renamed from: c  reason: collision with root package name */
    private final h f77538c = i.a((h.f.a.a) a.f77541a);

    /* renamed from: d  reason: collision with root package name */
    private final int f77539d = R.string.ne;

    /* renamed from: e  reason: collision with root package name */
    private final int f77540e = R.raw.icon_paperplane;

    static {
        Covode.recordClassIndex(47984);
    }

    private final o i() {
        return (o) this.f77538c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77537b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77539d;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77541a = new a();

        static {
            Covode.recordClassIndex(47985);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "group_chat");
        }
    }

    static final class c extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77543a = new c();

        static {
            Covode.recordClassIndex(47987);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "chatsets");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77540e);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean c() {
        if (super.c() || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(i()).f77439a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        if (super.d() || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(i()).f77440b) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e.a
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f77536a.f77451c.observe(eVar, new b(this));
    }

    public d(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77536a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_message_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").f66730a);
        r.a("enter_group_chat_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_and_safety_settings").a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        SmartRouter.buildRoute(context, "aweme://chatcontrol/setting").open(1);
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77542a;

        static {
            Covode.recordClassIndex(47986);
        }

        b(d dVar) {
            this.f77542a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            boolean z;
            boolean z2;
            p targetRestrictionOption;
            com.ss.android.ugc.aweme.compliance.api.model.d dVar;
            q qVar = (q) obj;
            d dVar2 = this.f77542a;
            Integer num2 = null;
            if (qVar == null || (dVar = qVar.f76689e) == null) {
                num = null;
            } else {
                num = Integer.valueOf(dVar.f76647a);
            }
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean enableTImChatEveryone = iESSettingsProxy.getEnableTImChatEveryone();
            o e2 = dVar2.e();
            if (!(e2 == null || (targetRestrictionOption = e2.getTargetRestrictionOption(1)) == null)) {
                num2 = Integer.valueOf(targetRestrictionOption.getShowType());
            }
            if (num2 != null && (num2.intValue() == 1 || num2.intValue() == 2)) {
                z = false;
            } else {
                z = true;
            }
            if (n.a((Iterable) am.a((Object[]) new Integer[]{1, 2, 3}), (Object) num) && (z || num == null || num.intValue() != 1)) {
                l.b(enableTImChatEveryone, "");
                if (enableTImChatEveryone.booleanValue() || l.a(Boolean.valueOf(z), enableTImChatEveryone)) {
                    z2 = true;
                    com.ss.android.ugc.aweme.compliance.common.c.a.a("Privacy_DM_user_setting", z2, ag.a(v.a("chatSet", num), v.a("enableTImChatEveryone", enableTImChatEveryone), v.a("restrictionShowType", num2)));
                }
            }
            z2 = false;
            com.ss.android.ugc.aweme.compliance.common.c.a.a("Privacy_DM_user_setting", z2, ag.a(v.a("chatSet", num), v.a("enableTImChatEveryone", enableTImChatEveryone), v.a("restrictionShowType", num2)));
        }
    }
}
