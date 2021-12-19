package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.network.response.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.base.PayOrderResultStruct;
import com.bytedance.android.live.wallet.base.SubOrderResultStruct;
import com.bytedance.android.live.wallet.base.b;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.android.livesdk.wallet.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import java.util.HashMap;

public interface IapApi {
    static {
        Covode.recordClassIndex(7242);
    }

    @t(a = "/webcast/wallet_api_tiktok/auto_exchange/")
    f.a.t<d<AutoExchangeData>> autoExchange(@z(a = "auto_exchange") boolean z);

    @t(a = "/hotsoon/props/bundles/buy/")
    @g
    f.a.t<d<f>> buyPackage(@com.bytedance.retrofit2.b.f HashMap<String, String> hashMap);

    @t(a = "/hotsoon/ward/buy/")
    @g
    f.a.t<d<f>> buyWard(@com.bytedance.retrofit2.b.f HashMap<String, String> hashMap);

    @h(a = "/webcast/wallet_api/query_order/")
    f.a.t<d<PayOrderResultStruct>> checkOrderResult(@z(a = "order_id") String str);

    @h(a = "/webcast/sub/contract/status/")
    f.a.t<d<SubOrderResultStruct>> checkSubOrder(@z(a = "to_uid") String str, @z(a = "contract_id") String str2);

    @t(a = "/webcast/wallet_api/diamond_buy/")
    @g
    f.a.t<d<b>> createAmazonOrder(@e(a = "way") int i2, @e(a = "diamond_id") int i3, @e(a = "currency") String str, @e(a = "source") int i4, @e(a = "price_amount_micros") long j2, @e(a = "iap_country_code") String str2, @e(a = "amazon_id") String str3);

    @t(a = "/webcast/wallet_api/diamond_buy/")
    @g
    f.a.t<d<b>> createOrder(@e(a = "way") int i2, @e(a = "diamond_id") int i3, @e(a = "currency") String str, @e(a = "source") int i4, @e(a = "price_amount_micros") long j2, @e(a = "first_recharge") boolean z);

    @h(a = "/hotsoon/diamond/{dealId}/_buy/")
    f.a.t<String> createOrderInfo(@x(a = "dealId") String str, @z(a = "way") int i2, @z(a = "pay_currency") String str2);

    @t(a = "/webcast/wallet_api/diamond_exchange/")
    @g
    f.a.t<d> exchangeCoins(@e(a = "diamond_id") int i2, @e(a = "way") int i3, @e(a = "currency") String str, @e(a = "source") int i4, @e(a = "coins_count") long j2, @e(a = "local_amount") long j3, @e(a = "currency_dot") long j4);

    @h(a = "/webcast/diamond/")
    f.a.t<a<c, DiamondPackageExtra>> fetchDiamondPackage(@z(a = "currency") String str, @z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "type") long j4);

    @h(a = "/hotsoon/wallet/payment_channels/")
    f.a.t<com.bytedance.android.live.network.response.c<com.bytedance.android.live.wallet.model.e>> fetchOptionList();

    @h(a = "/luckycat/tiktokm/v1/user/balance/get")
    f.a.t<d<BalanceStruct>> getBalanceInfo(@z(a = "scene") int i2);

    @t(a = "/webcast/recharge/base_package/")
    @g
    f.a.t<d<BalanceStructExtra>> getExchangeRatio(@e(a = "currency") String str, @e(a = "package_region") String str2, @e(a = "type") long j2, @e(a = "balance") long j3, @e(a = "real_dot") int i2);

    @h(a = "/webcast/wallet_api_tiktok/wallet/info/")
    f.a.t<d<com.bytedance.android.live.wallet.model.g>> getWalletInfoNew();

    @h(a = "/webcast/diamond/first_charge/")
    f.a.t<d<Object>> isFirstCharge();

    @h(a = "/webcast/wallet_api/query_order/")
    f.a.t<CheckOrderOriginalResult> queryOrder(@z(a = "order_id") String str);

    @t(a = "/webcast/sub/contract/create/")
    @g
    f.a.t<d<com.bytedance.android.live.wallet.base.a.a>> subscribeOrder(@e(a = "to_uid") String str, @e(a = "tpl_id") String str2, @e(a = "sku_name") String str3, @e(a = "device_tz") String str4);
}
