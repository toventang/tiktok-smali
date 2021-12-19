package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.b.d;
import com.bytedance.android.live.design.app.b.h;
import com.bytedance.android.live.design.app.b.i;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.h;
import com.bytedance.android.livesdk.at.i;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeEnableV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargePath;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public Context f22799a;

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f22800b;

    /* renamed from: c  reason: collision with root package name */
    public b<bd, z> f22801c = new w(this);

    /* renamed from: d  reason: collision with root package name */
    private g<com.bytedance.android.live.base.model.user.b> f22802d = new g<com.bytedance.android.live.base.model.user.b>() {
        /* class com.bytedance.android.livesdk.widgets.giftwidget.b.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13442);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.android.livesdk.at.g, f.a.z
        public final /* synthetic */ void onNext(com.bytedance.android.live.base.model.user.b bVar) {
            super.onNext(bVar);
            ((IWalletService) a.a(IWalletService.class)).walletCenter().d();
        }
    };

    static {
        Covode.recordClassIndex(13441);
    }

    public final void a() {
        Context context = this.f22799a;
        if (context != null) {
            String a2 = com.a.a(context.getResources().getString(R.string.glu), new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()});
            b.a aVar = new b.a(this.f22799a);
            aVar.f18296m = true;
            aVar.f18285b = a2;
            aVar.a(R.string.gn0, (DialogInterface.OnClickListener) new z(this), false).b(R.string.gn1, aa.f22687a, false).a().show();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(bd bdVar) {
        if (!CanRechargeSetting.INSTANCE.getValue()) {
            a();
        } else {
            c(bdVar);
        }
    }

    private void c(bd bdVar) {
        if (!u.a().b().e()) {
            f b2 = u.a().b();
            Context context = this.f22799a;
            j.a a2 = j.a();
            a2.f14158a = y.a((int) R.string.gw1);
            a2.f14160c = 1002;
            a2.f14162e = "live_detail";
            a2.f14163f = "gift_send";
            a2.f14161d = "enableGift";
            b2.a(context, a2.a()).b(this.f22802d);
        } else if (!u.a().b().a(h.RECHARGE)) {
            if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1) {
                d(bdVar);
            } else if (this.f22799a instanceof Activity) {
                ((IWalletService) a.a(IWalletService.class)).openWallet(p.a(this.f22799a));
            }
        }
    }

    private void d(bd bdVar) {
        if (!d.u.b() || !LiveFirstRechargeEnableV2Setting.INSTANCE.getValue() || !LiveFirstRechargePath.INSTANCE.getValue() || "other_recharge".equals(bdVar.f14202c)) {
            Context context = this.f22799a;
            if (context != null && (context instanceof e) && bdVar != null) {
                boolean booleanValue = ((Boolean) this.f22800b.b(ee.class)).booleanValue();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_bundle_is_anchor", booleanValue);
                bundle.putString("KEY_CHARGE_REASON", bdVar.f14200a);
                bundle.putLong("key_bundle_need_coins", bdVar.f14201b);
                bundle.putString("key_bundle_gift_from", bdVar.f14203d);
                bundle.putString("key_bundle_previous_page", bdVar.f14202c);
                bundle.putInt("key_bundle_charge_source", 0);
                ((IWalletService) a.a(IWalletService.class)).showRechargeDialog((e) this.f22799a, bundle, this.f22800b, null);
                return;
            }
            return;
        }
        d.u.a(this.f22799a, bdVar.f14200a);
    }

    public final void a(bd bdVar) {
        if (this.f22799a != null) {
            long[] jArr = {u.a().b().a().getId()};
            i iVar = new i();
            boolean b2 = i.b(this.f22799a, "saved_uid_recharge", jArr[0]);
            if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || b2) {
                b(bdVar);
                return;
            }
            b.a aVar = new b.a(this.f22799a);
            aVar.f18284a = y.a((int) R.string.e7n, Integer.valueOf(LiveRechargeAgeThresholdSetting.INSTANCE.getValue()));
            aVar.f18285b = y.a((int) R.string.e7k);
            b.a b3 = aVar.a((CharSequence) y.a((int) R.string.e7l), (DialogInterface.OnClickListener) new x(this, iVar, jArr, bdVar), false).b((CharSequence) y.a((int) R.string.e7j), (DialogInterface.OnClickListener) new y(this), false);
            b3.f18296m = false;
            b3.a().show();
            com.bytedance.android.livesdk.service.c.f.d.a(-1);
        }
    }

    public final void a(String str) {
        LiveDialog.a aVar = new LiveDialog.a(this.f22799a);
        h.a aVar2 = new h.a();
        aVar2.f9396a = this.f22799a.getString(R.string.ei_);
        aVar2.f9398c = new ab(this, str);
        com.bytedance.android.live.design.app.b.h a2 = aVar2.a();
        i.a aVar3 = new i.a();
        aVar3.f9396a = this.f22799a.getString(R.string.ei9);
        aVar3.f9398c = new ac(str);
        d.a a3 = new d.a().a(a2).a(aVar3.a());
        a3.f9404b = 1;
        com.bytedance.android.live.design.app.b.d a4 = a3.a();
        aVar.a(R.string.eia);
        if (str.equals("reject")) {
            aVar.b(R.string.eib);
        } else if (str.equals("frequency")) {
            aVar.b(R.string.eic);
        }
        aVar.a(a4);
        aVar.a().show();
        com.bytedance.android.livesdk.service.c.e.a.a(str);
    }
}
