package com.ss.android.ugc.aweme.comment.gift;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.util.rxutils.a.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.common.r;
import f.a.d.f;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class h extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    GiftStruct f71886a;

    /* renamed from: b  reason: collision with root package name */
    long f71887b = -1;

    /* renamed from: c  reason: collision with root package name */
    final f f71888c;

    /* renamed from: d  reason: collision with root package name */
    final View f71889d;

    /* renamed from: e  reason: collision with root package name */
    final e f71890e;

    /* renamed from: f  reason: collision with root package name */
    final String f71891f;

    /* renamed from: g  reason: collision with root package name */
    final GiftViewModel f71892g;

    /* renamed from: h  reason: collision with root package name */
    final String f71893h;

    /* renamed from: i  reason: collision with root package name */
    final String f71894i;

    /* renamed from: j  reason: collision with root package name */
    final String f71895j;

    /* renamed from: k  reason: collision with root package name */
    private final Fragment f71896k;

    static {
        Covode.recordClassIndex(44205);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, Fragment fragment, e eVar, String str, GiftViewModel giftViewModel, String str2, String str3, String str4) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        l.d(eVar, "");
        l.d(str, "");
        l.d(giftViewModel, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f71889d = view;
        this.f71896k = fragment;
        this.f71890e = eVar;
        this.f71891f = str;
        this.f71892g = giftViewModel;
        this.f71893h = str2;
        this.f71894i = str3;
        this.f71895j = str4;
        this.f71888c = new f(fragment, eVar, giftViewModel, str2, str3, str4);
        a.a(view).g(1, TimeUnit.SECONDS).d(new f(this) {
            /* class com.ss.android.ugc.aweme.comment.gift.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f71897a;

            static {
                Covode.recordClassIndex(44206);
            }

            {
                this.f71897a = r1;
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
                h hVar = this.f71897a;
                if (hVar.f71886a != null) {
                    long j2 = hVar.f71887b;
                    GiftStruct giftStruct = hVar.f71886a;
                    if (giftStruct == null) {
                        l.b();
                    }
                    if (j2 == giftStruct.getId()) {
                        hVar.f71892g.b().setValue(null);
                        return;
                    }
                    GiftStruct giftStruct2 = hVar.f71886a;
                    if (giftStruct2 == null) {
                        l.b();
                    }
                    Long valueOf = Long.valueOf(giftStruct2.getId());
                    if (!(valueOf == null || valueOf.longValue() == 0)) {
                        d a2 = new d().a("enter_from", hVar.f71893h).a("gift_tab", hVar.f71891f).a("group_id", hVar.f71894i).a("author_id", hVar.f71895j).a("gift_id", valueOf.longValue());
                        l.b(a2, "");
                        r.a("choose_gift", a2.f66730a);
                    }
                    GiftViewModel giftViewModel = hVar.f71892g;
                    GiftStruct giftStruct3 = hVar.f71886a;
                    if (giftStruct3 == null) {
                        l.b();
                    }
                    long id = giftStruct3.getId();
                    GiftStruct giftStruct4 = hVar.f71886a;
                    if (giftStruct4 == null) {
                        l.b();
                    }
                    giftViewModel.a(id, giftStruct4.getEffectAsset());
                    Long value = hVar.f71892g.d().getValue();
                    if (value == null || value.longValue() != -1) {
                        GiftStruct giftStruct5 = hVar.f71886a;
                        if (giftStruct5 == null) {
                            l.b();
                        }
                        long diamondCount = (long) giftStruct5.getDiamondCount();
                        Long value2 = hVar.f71892g.d().getValue();
                        if (value2 == null) {
                            value2 = 0L;
                        }
                        l.b(value2, "");
                        if (diamondCount > value2.longValue()) {
                            hVar.f71888c.a("video_gift_select_insufficient_balance");
                            d a3 = new d().a("enter_method", "select_gift").a("enter_from", hVar.f71893h).a("group_id", hVar.f71894i).a("author_id", hVar.f71895j).a("current_balance", hVar.f71892g.d().getValue());
                            l.b(a3, "");
                            r.a("enter_coin_recharge", a3.f66730a);
                            return;
                        }
                    }
                    hVar.f71892g.b().setValue(hVar.f71886a);
                }
            }
        });
    }
}
