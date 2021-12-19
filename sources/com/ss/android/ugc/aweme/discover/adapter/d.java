package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.f.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.ug.g;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class d extends a implements com.ss.android.ugc.aweme.discover.tooltip.a {

    /* renamed from: d  reason: collision with root package name */
    List<? extends Banner> f80538d = z.INSTANCE;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.tooltip.a f80539e;

    static {
        Covode.recordClassIndex(50105);
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.a
    public final void aV_() {
        this.f80539e.aV_();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f80538d.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.ss.android.ugc.aweme.discover.tooltip.a aVar, Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        l.d(aVar, "");
        this.f80539e = aVar;
    }

    @Override // com.bytedance.ies.uikit.f.a
    public final View a(int i2, View view, ViewGroup viewGroup) {
        e eVar;
        l.d(viewGroup, "");
        if (view == null) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.xu, viewGroup, false);
            l.b(view, "");
            eVar = new e(this, view);
            view.setTag(eVar);
        } else {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder");
            eVar = (e) tag;
        }
        if (getCount() > 0) {
            Banner banner = (Banner) this.f80538d.get(i2);
            if (!(banner == null || banner == eVar.f80542b)) {
                eVar.f80542b = banner;
                Banner banner2 = eVar.f80542b;
                if (banner2 == null) {
                    l.b();
                }
                String schema = banner2.getSchema();
                if (!TextUtils.isEmpty(schema) && (com.ss.android.ugc.aweme.miniapp_api.d.c(schema) || !g.a())) {
                    c cVar = c.a.f109704a;
                    l.b(cVar, "");
                    cVar.a().preloadMiniApp(schema);
                }
                eVar.f80543c = i2;
                Banner banner3 = eVar.f80542b;
                if (banner3 == null) {
                    l.b();
                }
                if (banner3.getBannerUrl() != null) {
                    Banner banner4 = eVar.f80542b;
                    if (banner4 == null) {
                        l.b();
                    }
                    UrlModel bannerUrl = banner4.getBannerUrl();
                    l.b(bannerUrl, "");
                    if (!b.a((Collection) bannerUrl.getUrlList())) {
                        int[] a2 = em.a(600);
                        Banner banner5 = eVar.f80542b;
                        if (banner5 == null) {
                            l.b();
                        }
                        v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(banner5.getBannerUrl())).b(em.a(600)).a(a2);
                        a3.f39907c = true;
                        v a4 = a3.a("BannerViewHolder");
                        a4.E = eVar.f80541a;
                        a4.c();
                    }
                }
                float a5 = (float) n.a(4.0d);
                View view2 = eVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.commercialize.ad.b bVar = new com.ss.android.ugc.aweme.commercialize.ad.b(a5, context.getResources().getColor(R.color.aw));
                bVar.setAlpha(76);
                View findViewById = eVar.itemView.findViewById(R.id.aau);
                l.b(findViewById, "");
                TuxTextView tuxTextView = (TuxTextView) findViewById;
                if (tuxTextView != null) {
                    tuxTextView.setBackgroundDrawable(bVar);
                    Banner banner6 = eVar.f80542b;
                    if (banner6 == null) {
                        l.b();
                    }
                    if (banner6.getAdData() != null) {
                        Banner banner7 = eVar.f80542b;
                        if (banner7 == null) {
                            l.b();
                        }
                        Banner.BannerAdData adData = banner7.getAdData();
                        l.b(adData, "");
                        if (adData.getAdLabel() != null) {
                            Banner banner8 = eVar.f80542b;
                            if (banner8 == null) {
                                l.b();
                            }
                            Banner.BannerAdData adData2 = banner8.getAdData();
                            l.b(adData2, "");
                            tuxTextView.setText(adData2.getAdLabel().text);
                            tuxTextView.setVisibility(0);
                        }
                    }
                    tuxTextView.setVisibility(8);
                }
            }
            if (eVar.f80541a != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    SmartImageView smartImageView = eVar.f80541a;
                    if (smartImageView == null) {
                        l.b();
                    }
                    smartImageView.setForeground(viewGroup.getContext().getDrawable(R.drawable.a5d));
                } else {
                    com.ss.android.ugc.aweme.notification.g.a.a(eVar.f80541a);
                }
            }
        }
        return view;
    }
}
