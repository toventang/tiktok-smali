package com.ss.android.ugc.aweme.ad.feed.lynx;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.ad.feed.d;
import com.ss.android.ugc.aweme.ad.feed.e;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class AbstractFeedLynxView implements d, au {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f65926a;

    /* renamed from: b  reason: collision with root package name */
    public AwemeRawAd f65927b;

    /* renamed from: c  reason: collision with root package name */
    public c f65928c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f65929d;

    /* renamed from: e  reason: collision with root package name */
    protected View f65930e;

    /* renamed from: f  reason: collision with root package name */
    public i f65931f;

    /* renamed from: g  reason: collision with root package name */
    protected BulletContainerView f65932g;

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f65933h;

    /* renamed from: i  reason: collision with root package name */
    public final e f65934i;

    static {
        Covode.recordClassIndex(40565);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public void b(String str) {
    }

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.aweme.bullet.e c();

    public void f() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f65935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f65937c = null;

        /* renamed from: d  reason: collision with root package name */
        private final String f65938d;

        static {
            Covode.recordClassIndex(40566);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f65938d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f65935a;
        }

        a(String str, JSONObject jSONObject) {
            this.f65936b = str;
            this.f65938d = str;
            this.f65935a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final BulletContainerView b() {
        BulletContainerView bulletContainerView = this.f65932g;
        if (bulletContainerView == null) {
            l.a("bulletContainerView");
        }
        return bulletContainerView;
    }

    public final void d() {
        this.f65929d = false;
        String a2 = a();
        if (a2 != null) {
            Uri.Builder buildUpon = Uri.parse(a2).buildUpon();
            buildUpon.appendQueryParameter("initialData", e().toString());
            com.ss.android.ugc.aweme.bullet.e c2 = c();
            if (c2 != null) {
                String builder = buildUpon.toString();
                l.b(builder, "");
                Bundle bundle = new Bundle();
                Context context = this.f65933h.getContext();
                c cVar = this.f65928c;
                if (cVar != null) {
                    Aweme aweme = this.f65926a;
                    l.b(context, "");
                    cVar.a(bundle, aweme, context);
                }
                c2.a(builder, bundle);
            }
        }
    }

    public o e() {
        String str;
        String str2;
        List<String> urlList;
        o oVar = new o();
        AwemeRawAd awemeRawAd = this.f65927b;
        String str3 = null;
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                str = String.valueOf(adId.longValue());
            } else {
                str = null;
            }
            oVar.a("adId", str);
            oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
            oVar.a("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str2 = String.valueOf(groupId.longValue());
            } else {
                str2 = null;
            }
            oVar.a("groupId", str2);
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                com.google.gson.i iVar = new com.google.gson.i();
                Iterator<T> it = urlList.iterator();
                while (it.hasNext()) {
                    iVar.a((String) it.next());
                }
                oVar.a("clickTrackUrlList", iVar);
            }
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            oVar.a("pageData", nativeSiteAdInfo);
        }
        Aweme aweme = this.f65926a;
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        oVar.a("itemId", String.valueOf(str3));
        oVar.a("isRTL", Integer.valueOf(gb.a(this.f65933h.getContext()) ? 1 : 0));
        oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
        return oVar;
    }

    public void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        this.f65926a = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f65927b = awemeRawAd;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.d
    public final void a(String str) {
        l.d(str, "");
        com.bytedance.ies.bullet.c.c.i iVar = this.f65931f;
        if (iVar != null) {
            iVar.onEvent(new a(str, null));
        }
    }

    public AbstractFeedLynxView(ViewGroup viewGroup, e eVar) {
        androidx.lifecycle.i lifecycle;
        l.d(viewGroup, "");
        l.d(eVar, "");
        this.f65933h = viewGroup;
        this.f65934i = eVar;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        androidx.core.app.d dVar = null;
        this.f65928c = (c) (!(a2 instanceof c) ? null : a2);
        View inflate = View.inflate(viewGroup.getContext(), R.layout.afd, null);
        l.b(inflate, "");
        this.f65930e = inflate;
        if (inflate == null) {
            l.a("contentView");
        }
        View findViewById = inflate.findViewById(R.id.a0e);
        l.b(findViewById, "");
        this.f65932g = (BulletContainerView) findViewById;
        viewGroup.removeAllViews();
        View view = this.f65930e;
        if (view == null) {
            l.a("contentView");
        }
        viewGroup.addView(view);
        Context context = viewGroup.getContext();
        androidx.core.app.d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }
}
