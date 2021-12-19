package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ad.feed.mask.b.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class b implements g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f65956e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f65957a;

    /* renamed from: b  reason: collision with root package name */
    public d f65958b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f65959c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f65960d;

    /* renamed from: f  reason: collision with root package name */
    private Context f65961f;

    /* renamed from: g  reason: collision with root package name */
    private c f65962g;

    static {
        Covode.recordClassIndex(40575);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40576);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.g
    public final boolean b() {
        if (this.f65960d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.b$b  reason: collision with other inner class name */
    static final class RunnableC1474b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f65965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f65966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.mask.a.b f65967c;

        static {
            Covode.recordClassIndex(40577);
        }

        RunnableC1474b(b bVar, boolean z, com.ss.android.ugc.aweme.ad.feed.mask.a.b bVar2) {
            this.f65965a = bVar;
            this.f65966b = z;
            this.f65967c = bVar2;
        }

        public final void run() {
            this.f65965a.f65960d.setVisibility(8);
            if (this.f65966b) {
                this.f65967c.a();
            }
            com.ss.android.ugc.d.a.c.a(new a(false, b.a(this.f65965a).getAid()));
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f65968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.mask.a.c f65969b;

        static {
            Covode.recordClassIndex(40578);
        }

        c(b bVar, com.ss.android.ugc.aweme.ad.feed.mask.a.c cVar) {
            this.f65968a = bVar;
            this.f65969b = cVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f65968a.f65959c;
            if (relativeLayout == null) {
                l.a("widgetContainer");
            }
            relativeLayout.setVisibility(4);
            this.f65969b.a();
            this.f65968a.f65960d.setVisibility(0);
            d dVar = this.f65968a.f65958b;
            if (dVar != null) {
                com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(dVar.a());
                com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(dVar.a(), new com.ss.android.ugc.aweme.commercialize.ad.b((float) n.a(2.0d), androidx.core.content.b.c(dVar.f65976a, R.color.jq)), androidx.core.content.b.c(dVar.f65976a, R.color.f159926j), Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.c(dVar.f65977b.getAwemeRawAd())), 300);
            }
            this.f65968a.f65960d.animate().alpha(1.0f).setDuration(150).start();
            com.ss.android.ugc.d.a.c.a(new a(true, b.a(this.f65968a).getAid()));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.g
    public final void a() {
        int i2;
        d jVar;
        String a2;
        int i3;
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        this.f65960d.setVisibility(8);
        Aweme aweme = this.f65957a;
        if (aweme == null) {
            l.a("mAweme");
        }
        if (aweme.getAwemeRawAd() != null) {
            Aweme aweme2 = this.f65957a;
            if (aweme2 == null) {
                l.a("mAweme");
            }
            AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                l.b();
            }
            l.b(awemeRawAd2, "");
            i2 = awemeRawAd2.getNativeCardType();
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            LinearLayout linearLayout = this.f65960d;
            c cVar = this.f65962g;
            if (cVar == null) {
                l.a("adMaskParams");
            }
            jVar = new j(linearLayout, cVar);
        } else if (i2 == 1) {
            LinearLayout linearLayout2 = this.f65960d;
            c cVar2 = this.f65962g;
            if (cVar2 == null) {
                l.a("adMaskParams");
            }
            jVar = new e(linearLayout2, cVar2);
        } else if (i2 == 2) {
            LinearLayout linearLayout3 = this.f65960d;
            c cVar3 = this.f65962g;
            if (cVar3 == null) {
                l.a("adMaskParams");
            }
            jVar = new i(linearLayout3, cVar3);
        } else if (i2 == 3) {
            LinearLayout linearLayout4 = this.f65960d;
            c cVar4 = this.f65962g;
            if (cVar4 == null) {
                l.a("adMaskParams");
            }
            jVar = new k(linearLayout4, cVar4);
        } else if (i2 != 4) {
            LinearLayout linearLayout5 = this.f65960d;
            c cVar5 = this.f65962g;
            if (cVar5 == null) {
                l.a("adMaskParams");
            }
            jVar = new e(linearLayout5, cVar5);
        } else {
            LinearLayout linearLayout6 = this.f65960d;
            c cVar6 = this.f65962g;
            if (cVar6 == null) {
                l.a("adMaskParams");
            }
            jVar = new l(linearLayout6, cVar6);
        }
        this.f65958b = jVar;
        jVar.c();
        d dVar = this.f65958b;
        if (dVar != null) {
            if (dVar.f65977b.isAd()) {
                TextView a3 = dVar.a();
                l.b(a3, "");
                if (com.ss.android.ugc.aweme.ad.utils.c.a(dVar.f65977b)) {
                    Aweme aweme3 = dVar.f65977b;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || (a2 = splashInfo.getSplashButtonText()) == null) {
                        a2 = "";
                    }
                } else {
                    a2 = com.ss.android.ugc.aweme.commercialize.util.a.a(dVar.f65976a, dVar.f65977b, true);
                }
                a3.setText(a2);
                float a4 = (float) n.a(2.0d);
                Resources resources = dVar.f65976a.getResources();
                if (com.ss.android.ugc.aweme.ad.utils.c.a(dVar.f65977b)) {
                    i3 = R.color.bh;
                } else {
                    i3 = R.color.jq;
                }
                Drawable bVar = new com.ss.android.ugc.aweme.commercialize.ad.b(a4, resources.getColor(i3));
                Aweme aweme4 = dVar.f65977b;
                if (aweme4 != null && aweme4.isAd()) {
                    AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                    if (!TextUtils.isEmpty(awemeRawAd3.getWebUrl()) && (awemeRawAd3.getAnimationType() == 1 || awemeRawAd3.getAnimationType() == 2)) {
                        bVar = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(bVar.mutate(), androidx.core.content.b.c(dVar.f65976a, R.color.f159926j));
                        l.b(bVar, "");
                    }
                }
                TextView a5 = dVar.a();
                l.b(a5, "");
                a5.setBackground(bVar);
            }
            dVar.a().setOnClickListener(dVar);
            dVar.b().setOnClickListener(dVar);
            com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(dVar.a());
            com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(dVar.b());
        }
    }

    public b(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f65960d = linearLayout;
    }

    public static final /* synthetic */ Aweme a(b bVar) {
        Aweme aweme = bVar.f65957a;
        if (aweme == null) {
            l.a("mAweme");
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.g
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f65961f = cVar.b();
        this.f65957a = cVar.c();
        RelativeLayout relativeLayout = cVar.f65974e;
        if (relativeLayout == null) {
            l.a("widgetContainer");
        }
        this.f65959c = relativeLayout;
        this.f65962g = cVar;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.g
    public final boolean a(com.ss.android.ugc.aweme.ad.feed.mask.a.c cVar) {
        l.d(cVar, "");
        if (this.f65958b == null) {
            return false;
        }
        Aweme aweme = this.f65957a;
        if (aweme == null) {
            l.a("mAweme");
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            HashMap hashMap = new HashMap();
            l.b(awemeRawAd, "");
            hashMap.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
            HashMap hashMap2 = null;
            if (hashMap.size() != 0) {
                hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new f().b(hashMap));
            }
            i.a aVar = new i.a();
            aVar.f74815a = awemeRawAd;
            aVar.f74819e = hashMap2;
            aVar.f74817c = false;
            com.ss.android.ugc.aweme.ad.d.a.a("othershow", awemeRawAd, aVar.a());
            com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "othershow", awemeRawAd).a("background_type", String.valueOf(awemeRawAd.getNativeCardType())).c();
        }
        this.f65960d.setAlpha(0.0f);
        RelativeLayout relativeLayout = this.f65959c;
        if (relativeLayout == null) {
            l.a("widgetContainer");
        }
        relativeLayout.setAlpha(1.0f);
        RelativeLayout relativeLayout2 = this.f65959c;
        if (relativeLayout2 == null) {
            l.a("widgetContainer");
        }
        relativeLayout2.animate().alpha(0.0f).setDuration(150).withEndAction(new c(this, cVar)).start();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.g
    public final void a(boolean z, com.ss.android.ugc.aweme.ad.feed.mask.a.b bVar) {
        l.d(bVar, "");
        if (this.f65958b != null) {
            this.f65960d.setAlpha(1.0f);
            this.f65960d.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC1474b(this, z, bVar)).start();
            if (!bVar.b()) {
                RelativeLayout relativeLayout = this.f65959c;
                if (relativeLayout == null) {
                    l.a("widgetContainer");
                }
                relativeLayout.setAlpha(0.0f);
                RelativeLayout relativeLayout2 = this.f65959c;
                if (relativeLayout2 == null) {
                    l.a("widgetContainer");
                }
                relativeLayout2.setVisibility(0);
                RelativeLayout relativeLayout3 = this.f65959c;
                if (relativeLayout3 == null) {
                    l.a("widgetContainer");
                }
                relativeLayout3.animate().alpha(1.0f).setDuration(150).start();
            }
        }
    }
}
