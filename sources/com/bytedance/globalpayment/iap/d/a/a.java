package com.bytedance.globalpayment.iap.d.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.b;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public class a implements com.bytedance.globalpayment.iap.d.b.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f30337a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17610);
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void b(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToSubscriptionManagerPage();
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void c(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryHasSubscriptionProducts();
        } else {
            b.e().a().b(IapPaymentMethod.AMAZON, new d(1, "query has subscription not support amazon!"), null);
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            b.e().a().a(new d(1, "google not support get user data"), (IapChannelUserData) null);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(new com.bytedance.globalpayment.iap.a.a() {
                /* class com.bytedance.globalpayment.iap.d.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17611);
                }

                @Override // com.bytedance.globalpayment.iap.a.a
                public final void a(String str, String str2) {
                    b.e().a().a(new d(0, "get user data success from amazon"), new IapChannelUserData(IapPaymentMethod.AMAZON, str, str2));
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod, com.bytedance.globalpayment.iap.a.a aVar) {
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(aVar);
        } else {
            aVar.a("", "");
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final com.bytedance.globalpayment.iap.common.ability.f.a a(IapPaymentMethod iapPaymentMethod, Object... objArr) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().getGoogleState((com.bytedance.globalpayment.iap.common.ability.g.b.d) objArr[0], (Activity) objArr[1]);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().getAmazonState((com.bytedance.globalpayment.iap.common.ability.g.b.d) objArr[0], (Activity) objArr[1]);
        }
        return null;
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod, com.bytedance.globalpayment.iap.a.b bVar) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(bVar);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryUnAckEdOrderFromChannel(bVar);
        } else {
            bVar.onQueryFinished(iapPaymentMethod, new AbsResult().withErrorCode(1).withMessage("invalid payment_method"), null);
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToNotExpiredSubscriptionManagerPage(str, str2);
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod, List<String> list, boolean z, c<AbsIapProduct> cVar) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, z, cVar);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryProductDetails(list, z, cVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.d.b.a
    public final void a(IapPaymentMethod iapPaymentMethod, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().consumeProduct(z, str, consumeIapProductListener);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().consumeProduct(str, consumeIapProductListener);
        }
    }
}
