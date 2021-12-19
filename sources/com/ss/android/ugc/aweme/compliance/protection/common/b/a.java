package com.ss.android.ugc.aweme.compliance.protection.common.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.common.a.d;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.f;
import h.f.b.l;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(48323);
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.services.teenmode.a f77960a;

        static {
            Covode.recordClassIndex(48325);
        }

        public b(com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar) {
            this.f77960a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.compliance.protection.common.a.f77938a = false;
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/v1/compliance/guadig/settings/", 1);
            com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar = this.f77960a;
            if (aVar != null) {
                Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                aVar.a((Exception) th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.b.a$a  reason: collision with other inner class name */
    public static final class C1808a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.services.teenmode.a f77959a;

        static {
            Covode.recordClassIndex(48324);
        }

        public C1808a(com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar) {
            this.f77959a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            boolean z2;
            int i2;
            com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b bVar;
            Integer num;
            Integer num2;
            d dVar = (d) obj;
            if (dVar != null) {
                if (dVar.status_code == 0) {
                    com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/v1/compliance/guadig/settings/", 0);
                    FamilyPiaringManager familyPiaringManager = FamilyPiaringManager.f77979b;
                    com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar2 = dVar.f77954a;
                    boolean b2 = com.ss.android.ugc.aweme.compliance.protection.common.a.b();
                    com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar3 = FamilyPiaringManager.f77978a;
                    familyPiaringManager.a(bVar2);
                    boolean b3 = FamilyPiaringManager.b();
                    if (FamilyPiaringManager.b(bVar3) != IFamilyPairingService.a.CHILD || FamilyPiaringManager.a() == IFamilyPairingService.a.CHILD) {
                        if (FamilyPiaringManager.a() == IFamilyPairingService.a.CHILD && b3 != b2) {
                            FamilyPiaringManager.a(b3);
                        }
                    } else if (FamilyPiaringManager.a() != IFamilyPairingService.a.UNLINK_LOCKED && b2) {
                        FamilyPiaringManager.a(false);
                    }
                    com.ss.android.ugc.aweme.compliance.protection.common.a.a aVar = dVar.f77955b;
                    com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar2 = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b;
                    if (aVar2 != null) {
                        z = aVar2.isRestrictModeSelf();
                    } else {
                        z = false;
                    }
                    if (aVar == null || (num2 = aVar.f77943b) == null || num2.intValue() != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (aVar == null || (num = aVar.f77942a) == null) {
                        i2 = 0;
                    } else {
                        i2 = num.intValue();
                    }
                    com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b = new com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a(z2, i2);
                    boolean b4 = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.b();
                    if (com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a()) {
                        if (b4) {
                            bVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.OPEN;
                        } else {
                            bVar = com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.b.CLOSE;
                        }
                        com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(bVar);
                    }
                    if (b4 != z) {
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g2, "");
                        User curUser = g2.getCurUser();
                        l.b(curUser, "");
                        if (!curUser.isUserCancelled()) {
                            com.ss.android.ugc.aweme.compliance.protection.common.a.e();
                            com.ss.android.ugc.aweme.compliance.protection.common.a.a(null);
                        } else {
                            com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77964d = true;
                        }
                    }
                    com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77962b);
                    com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar3 = this.f77959a;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                } else {
                    com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/v1/compliance/guadig/settings/", 1);
                }
            }
            com.ss.android.ugc.aweme.compliance.protection.common.a.f77938a = false;
        }
    }
}
