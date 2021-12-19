package com.ss.android.ugc.aweme.favorites.a;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ag;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.experiment.cl;
import com.ss.android.ugc.aweme.experiment.hd;
import com.ss.android.ugc.aweme.experiment.he;
import com.ss.android.ugc.aweme.favorites.ui.af;
import com.ss.android.ugc.aweme.favorites.ui.c;
import com.ss.android.ugc.aweme.favorites.ui.e;
import com.ss.android.ugc.aweme.favorites.ui.k;
import com.ss.android.ugc.aweme.favorites.ui.l;
import com.ss.android.ugc.aweme.favorites.ui.p;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.ui.b;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;

public final class f extends cr {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Fragment> f90430a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private Context f90431d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Integer> f90432e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private int f90433f;

    static {
        Covode.recordClassIndex(56767);
    }

    public final void a() {
        if (this.f90430a.get(this.f90433f) instanceof l) {
            ((l) this.f90430a.get(this.f90433f)).t().notifyDataSetChanged();
        }
    }

    public final void c(int i2) {
        cs csVar;
        for (int i3 = 0; i3 < getCount(); i3++) {
            if (!(!(a(i3) instanceof cs) || (csVar = (cs) a(i3)) == null || csVar.getFragmentManager() == null)) {
                if (i3 == i2) {
                    csVar.setUserVisibleHint(true);
                } else {
                    csVar.setUserVisibleHint(false);
                }
                csVar.g();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.profile.ui.cr
    public final CharSequence getPageTitle(int i2) {
        int intValue = this.f90432e.get(i2).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 8) {
                            switch (intValue) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                    String string = this.f90431d.getString(R.string.ahk);
                                    if (string == null || "collect_hashtag".equals(string)) {
                                        return string;
                                    }
                                    return string.substring(0, 1).toUpperCase(Locale.ROOT) + string.substring(1).toLowerCase(Locale.ROOT);
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    String string2 = this.f90431d.getString(R.string.ahn);
                                    if (string2 == null || "music".equals(string2)) {
                                        return string2;
                                    }
                                    return string2.substring(0, 1).toUpperCase(Locale.ROOT) + string2.substring(1).toLowerCase(Locale.ROOT);
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    return this.f90431d.getString(R.string.bwm);
                                default:
                                    switch (intValue) {
                                        case 16:
                                            String string3 = this.f90431d.getString(R.string.ahi);
                                            if (string3 == null || "tool".equals(string3)) {
                                                return string3;
                                            }
                                            return string3.substring(0, 1).toUpperCase(Locale.ROOT) + string3.substring(1).toLowerCase(Locale.ROOT);
                                        case 17:
                                            return this.f90431d.getString(R.string.c1p);
                                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                                            return this.f90431d.getString(R.string.p_);
                                        case 19:
                                            return this.f90431d.getString(R.string.c5l);
                                        default:
                                            switch (intValue) {
                                                case 25:
                                                    String string4 = this.f90431d.getString(R.string.hfd);
                                                    if (string4 == null || "wishlist_products_tab_name".equals(string4)) {
                                                        return string4;
                                                    }
                                                    return string4.substring(0, 1).toUpperCase(Locale.ROOT) + string4.substring(1).toLowerCase(Locale.ROOT);
                                                case 26:
                                                    return this.f90431d.getString(R.string.bsz);
                                                case 27:
                                                    return this.f90431d.getString(R.string.f3a);
                                                default:
                                                    return "";
                                            }
                                    }
                            }
                        } else {
                            String string5 = this.f90431d.getString(R.string.ahp);
                            if (string5 == null || "video".equals(string5)) {
                                return string5;
                            }
                            return string5.substring(0, 1).toUpperCase(Locale.ROOT) + string5.substring(1).toLowerCase(Locale.ROOT);
                        }
                    }
                }
            }
            return this.f90431d.getString(R.string.c1d);
        }
        return this.f90431d.getString(R.string.cbg);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i iVar, Context context) {
        super(iVar);
        ag agVar;
        Fragment cVar;
        this.f90431d = context;
        if (cl.a()) {
            agVar = new af();
        } else {
            b newBasicAwemeListFragment = ae.f115954a.newBasicAwemeListFragment((int) context.getResources().getDimension(R.dimen.jt), 4, com.ss.android.ugc.aweme.account.b.g().getCurUserId(), com.ss.android.ugc.aweme.account.b.g().getCurSecUserId(), false, true);
            newBasicAwemeListFragment.A();
            newBasicAwemeListFragment.d(true);
            newBasicAwemeListFragment.c("collection");
            agVar = newBasicAwemeListFragment;
        }
        Fragment lVar = he.f90210a ? new k() : new l();
        com.ss.android.ugc.aweme.favorites.ui.f fVar = new com.ss.android.ugc.aweme.favorites.ui.f();
        p pVar = new p();
        if (hd.f90205b) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a b2 = StickerServiceImpl.c().b();
        a aVar = null;
        IShoppingAdsService d2 = ShoppingAdsServiceImpl.d();
        if (d2 != null && d2.a()) {
            aVar = d2.b();
        }
        if (!cl.b()) {
            this.f90430a.add(agVar == 1 ? 1 : 0);
            this.f90432e.add(8);
            this.f90430a.add(lVar);
            this.f90432e.add(11);
            this.f90433f = this.f90430a.size() - 1;
            this.f90430a.add(b2);
            this.f90432e.add(16);
            if (com.ss.android.ugc.aweme.comment.d.a.a()) {
                this.f90430a.add(fVar);
                this.f90432e.add(26);
            }
            if (com.ss.android.ugc.aweme.question.b.a.f119907a) {
                this.f90430a.add(pVar);
                this.f90432e.add(27);
            }
            this.f90430a.add(cVar);
            this.f90432e.add(10);
            if (aVar != null) {
                this.f90430a.add(aVar);
                this.f90432e.add(25);
            }
        } else {
            this.f90430a.add(agVar == 1 ? 1 : 0);
            this.f90432e.add(8);
            this.f90430a.add(cVar);
            this.f90432e.add(10);
            this.f90430a.add(lVar);
            this.f90432e.add(11);
            this.f90433f = this.f90430a.size() - 1;
            this.f90430a.add(b2);
            this.f90432e.add(16);
            if (com.ss.android.ugc.aweme.comment.d.a.a()) {
                this.f90430a.add(fVar);
                this.f90432e.add(26);
            }
            if (com.ss.android.ugc.aweme.question.b.a.f119907a) {
                this.f90430a.add(pVar);
                this.f90432e.add(27);
            }
            if (aVar != null) {
                this.f90430a.add(aVar);
                this.f90432e.add(25);
            }
        }
        ArrayList<Fragment> arrayList = this.f90430a;
        ArrayList<Integer> arrayList2 = this.f90432e;
        ((cr) this).f117096b = arrayList;
        ((cr) this).f117097c = arrayList2;
    }
}
