package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final PrivacyRestrictionApi f77381a = ((PrivacyRestrictionApi) RetrofitFactory.a().a(com.ss.android.ugc.aweme.compliance.common.a.a.f77273a).a(PrivacyRestrictionApi.class));

    /* renamed from: b  reason: collision with root package name */
    static long f77382b;

    /* renamed from: c  reason: collision with root package name */
    static final long f77383c = 1800000;

    /* renamed from: d  reason: collision with root package name */
    public static final d f77384d = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(47864);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77387a = new c();

        static {
            Covode.recordClassIndex(47868);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/agreement/record/agree/v1", 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77386a = new b();

        static {
            Covode.recordClassIndex(47867);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/setting/restriction/v1", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th), com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d$d  reason: collision with other inner class name */
    public static final class C1787d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1787d f77388a = new C1787d();

        static {
            Covode.recordClassIndex(47869);
        }

        C1787d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/agreement/record/agree/v1", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th), com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77385a = new a();

        static {
            Covode.recordClassIndex(47865);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            o oVar;
            final PrivacyRestrictionResponse privacyRestrictionResponse = (PrivacyRestrictionResponse) obj;
            if (privacyRestrictionResponse.status_code == 0) {
                d.f77382b = System.currentTimeMillis();
                l.b(privacyRestrictionResponse, "");
                l.d(privacyRestrictionResponse, "");
                f.a(privacyRestrictionResponse);
                n privacySettingRestriction = privacyRestrictionResponse.getPrivacySettingRestriction();
                if (privacySettingRestriction != null) {
                    oVar = privacySettingRestriction.getTargetRestrictionItem(0, "group_chat");
                } else {
                    oVar = null;
                }
                String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
                if (!(a2 == null || a2.length() == 0 || oVar == null)) {
                    a.f77375b.storeString(a2, dg.a().b(oVar));
                }
                com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c>() {
                    /* class com.ss.android.ugc.aweme.compliance.privacy.data.d.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(47866);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
                        Map<String, o> map;
                        com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
                        l.d(cVar2, "");
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Fetch Restriction success");
                        n privacySettingRestriction = privacyRestrictionResponse.getPrivacySettingRestriction();
                        Map<String, o> map2 = null;
                        if (privacySettingRestriction != null) {
                            map = privacySettingRestriction.getAccount();
                        } else {
                            map = null;
                        }
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, map);
                        n privacySettingRestriction2 = privacyRestrictionResponse.getPrivacySettingRestriction();
                        if (privacySettingRestriction2 != null) {
                            map2 = privacySettingRestriction2.getVideoPrivacy();
                        }
                        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_v", map2);
                        PrivacyRestrictionResponse privacyRestrictionResponse = privacyRestrictionResponse;
                        l.b(privacyRestrictionResponse, "");
                        return com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(privacyRestrictionResponse));
                    }
                });
                com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/privacy/setting/restriction/v1", 0);
            }
        }
    }
}
