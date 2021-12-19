package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.c;
import com.bytedance.android.live.wallet.model.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.u;
import com.bytedance.android.livesdk.model.k;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveOpenExchangeCoinsDialog extends e<c, Object> {
    static {
        Covode.recordClassIndex(8039);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public void onTerminate() {
    }

    public String chargeReason(c cVar) {
        if (cVar.f13218d == 0) {
            return "ug_exchange";
        }
        return "anchor_income";
    }

    public void finishResult(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("complete", i2);
        } catch (JSONException unused) {
            finishWithFailure();
        }
        finishWithResult(jSONObject);
    }

    public void goExchangeToCoins(final c cVar) {
        ((IWalletService) a.a(IWalletService.class)).walletCenter().a(cVar, new com.bytedance.android.livesdkapi.depend.d.b.a() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8041);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.a
            public final void b() {
                ao.a(y.e(), (int) R.string.e25);
                LiveOpenExchangeCoinsDialog.this.finishResult(0);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.b.a
            public final void a() {
                if (cVar.f13219e == 0) {
                    ao.a(y.e(), (int) R.string.e24);
                }
                if (cVar.f13219e == 2) {
                    b.a.a("livesdk_withdraw_exchange_success").a().a("exchange_level", cVar.f13224j).b();
                } else {
                    b a2 = b.a.a("livesdk_recharge_exchange_success").a().a("exchange_level", cVar.f13224j).a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                    if (cVar.f13219e == 0 && DataChannelGlobal.f34575d.b(u.class) != null) {
                        a2.a("is_anchor", !((k) DataChannelGlobal.f34575d.b(u.class)).isAudience());
                    }
                    a2.b();
                }
                com.bytedance.android.livesdk.an.a.a().a(new d());
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.wallet.d(true, (int) cVar.f13220f));
                LiveOpenExchangeCoinsDialog.this.finishResult(1);
            }
        });
    }

    public String requestPage(c cVar) {
        if (cVar.f13219e == 0) {
            return "live_detail";
        }
        if (cVar.f13219e == 1) {
            return "my_profile";
        }
        return "";
    }

    private int textId(c cVar) {
        if (cVar.f13218d == 0) {
            return R.string.e22;
        }
        RevenueExchange revenueExchange = ((IWalletService) a.a(IWalletService.class)).walletCenter().f().f13234c;
        if (revenueExchange == null || !revenueExchange.isRevenue()) {
            return R.string.e4b;
        }
        return R.string.e4c;
    }

    /* access modifiers changed from: protected */
    public void invoke(final c cVar, g gVar) {
        boolean z;
        if (com.bytedance.android.livesdk.ap.a.cD.a().booleanValue()) {
            IWalletService iWalletService = (IWalletService) a.a(IWalletService.class);
            Context context = gVar.f35646a;
            AnonymousClass1 r1 = new com.bytedance.android.live.wallet.a() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                boolean f14486a = true;

                static {
                    Covode.recordClassIndex(8040);
                }

                @Override // com.bytedance.android.live.wallet.a
                public final void a() {
                    if (cVar.f13219e == 2) {
                        b.a.a("livesdk_withdraw_exchange_confirm").a().a("exchange_level", cVar.f13224j).b();
                    } else {
                        b a2 = b.a.a("livesdk_recharge_exchange_confirm").a().a("exchange_level", cVar.f13224j).a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                        if (cVar.f13219e == 0 && DataChannelGlobal.f34575d.b(u.class) != null) {
                            a2.a("is_anchor", !((k) DataChannelGlobal.f34575d.b(u.class)).isAudience());
                        }
                        a2.b();
                    }
                    if (!this.f14486a) {
                        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cD, (Object) false);
                    }
                    LiveOpenExchangeCoinsDialog.this.goExchangeToCoins(cVar);
                }

                @Override // com.bytedance.android.live.wallet.a
                public final void b() {
                    if (cVar.f13219e == 2) {
                        b.a.a("livesdk_withdraw_exchange_cancel").a().a("exchange_level", cVar.f13224j).b();
                    } else {
                        b a2 = b.a.a("livesdk_recharge_exchange_cancel").a().a("exchange_level", cVar.f13224j).a("exchange_coins", cVar.f13220f).a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                        if (cVar.f13219e == 0 && DataChannelGlobal.f34575d.b(u.class) != null) {
                            a2.a("is_anchor", !((k) DataChannelGlobal.f34575d.b(u.class)).isAudience());
                        }
                        a2.b();
                    }
                    LiveOpenExchangeCoinsDialog.this.finishResult(2);
                }

                @Override // com.bytedance.android.live.wallet.a
                public final void a(Boolean bool) {
                    this.f14486a = !bool.booleanValue();
                }
            };
            String a2 = y.a(textId(cVar), cVar.f13216b + cVar.f13223i);
            if (cVar.f13218d == 0) {
                z = true;
            } else {
                z = false;
            }
            iWalletService.showExchangeConfirmDialog(context, r1, new com.bytedance.android.live.wallet.b(R.string.e23, a2, R.string.e20, R.string.e1z, R.string.e21, z));
            return;
        }
        goExchangeToCoins(cVar);
    }
}
