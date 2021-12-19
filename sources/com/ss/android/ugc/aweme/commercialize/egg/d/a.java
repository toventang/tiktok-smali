package com.ss.android.ugc.aweme.commercialize.egg.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.egg.a;
import com.ss.android.ugc.aweme.commercialize.model.z;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f73933a;

    /* renamed from: b  reason: collision with root package name */
    public String f73934b;

    /* renamed from: c  reason: collision with root package name */
    public String f73935c;

    /* renamed from: d  reason: collision with root package name */
    public String f73936d;

    /* renamed from: e  reason: collision with root package name */
    public String f73937e;

    /* renamed from: f  reason: collision with root package name */
    public String f73938f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f73939g;

    /* renamed from: h  reason: collision with root package name */
    public final int f73940h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f73941i;

    /* renamed from: j  reason: collision with root package name */
    public AtomicBoolean f73942j;

    /* renamed from: k  reason: collision with root package name */
    public c f73943k;

    /* renamed from: l  reason: collision with root package name */
    public b f73944l;

    /* renamed from: m  reason: collision with root package name */
    public final String f73945m;
    public final String n;
    public String o;
    private final C1663a<?> p;

    static {
        Covode.recordClassIndex(45550);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.a$a  reason: collision with other inner class name */
    public static final class C1663a<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f73946a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f73947b = true;

        /* renamed from: c  reason: collision with root package name */
        public int f73948c = 1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f73949d = true;

        /* renamed from: e  reason: collision with root package name */
        public String f73950e = "";

        /* renamed from: f  reason: collision with root package name */
        public String f73951f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f73952g = "";

        /* renamed from: h  reason: collision with root package name */
        public AwemeRawAd f73953h;

        static {
            Covode.recordClassIndex(45551);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public final C1663a<T> a(String str) {
            if (str == null) {
                str = "";
            }
            this.f73950e = str;
            return this;
        }

        public final C1663a<T> b(String str) {
            if (str == null) {
                str = "";
            }
            this.f73951f = str;
            return this;
        }
    }

    final class b {
        static {
            Covode.recordClassIndex(45552);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }
    }

    private a(C1663a<?> aVar) {
        List<String> urlList;
        String str;
        String str2;
        String str3;
        this.p = aVar;
        this.f73936d = "";
        this.f73937e = "";
        this.f73938f = "";
        this.f73939g = aVar.f73947b;
        this.f73940h = aVar.f73948c;
        this.f73941i = aVar.f73949d;
        this.f73942j = new AtomicBoolean(false);
        this.f73945m = aVar.f73950e;
        this.n = aVar.f73951f;
        this.o = aVar.f73952g;
        b bVar = new b();
        l.d(aVar, "");
        T t = aVar.f73946a;
        String str4 = null;
        if (t instanceof ItemLikeEggData) {
            T t2 = t;
            a aVar2 = a.this;
            aVar2.f73933a = t2.getMaterialUrl();
            aVar2.f73934b = t2.getFileType();
            AwemeRawAd awemeRawAd = aVar.f73953h;
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getCreativeIdStr();
                str4 = awemeRawAd.getLogExtra();
            } else {
                str3 = null;
            }
            aVar2.f73944l = new b("like", str3, str4, aVar.f73950e);
        } else if (t instanceof ItemCommentEggData) {
            T t3 = t;
            a aVar3 = a.this;
            aVar3.f73933a = t3.getMaterialUrl();
            aVar3.f73934b = t3.getFileType();
            aVar3.f73935c = t3.getRegex();
            String eggId = t3.getEggId();
            eggId = eggId == null ? "" : eggId;
            l.d(eggId, "");
            aVar3.f73938f = eggId;
            String webUrl = t3.getWebUrl();
            webUrl = webUrl == null ? "" : webUrl;
            l.d(webUrl, "");
            aVar3.f73936d = webUrl;
            String openUrl = t3.getOpenUrl();
            openUrl = openUrl == null ? "" : openUrl;
            l.d(openUrl, "");
            aVar3.f73937e = openUrl;
            AwemeRawAd awemeRawAd2 = aVar.f73953h;
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getCreativeIdStr();
                str4 = awemeRawAd2.getLogExtra();
            } else {
                str2 = null;
            }
            aVar3.f73944l = new b(UGCMonitor.EVENT_COMMENT, str2, str4, aVar.f73951f);
        } else if (t instanceof z) {
            T t4 = t;
            UrlModel sourceUrl = t4.getSourceUrl();
            if (!(sourceUrl == null || (urlList = sourceUrl.getUrlList()) == null || (str = (String) n.b((List) urlList, 0)) == null)) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                str4 = p.b((CharSequence) str).toString();
            }
            l.d(t4, "");
            String sourceType = t4.getSourceType();
            if ((TextUtils.equals(sourceType, a.C1661a.f73924b) || TextUtils.equals(sourceType, a.C1661a.f73925c) || TextUtils.equals(sourceType, a.C1661a.f73926d)) && !TextUtils.isEmpty(str4)) {
                b bVar2 = new b("search", "-1", "", "", t4.getId());
                a aVar4 = a.this;
                aVar4.f73933a = str4;
                aVar4.f73934b = t4.getSourceType();
                aVar4.f73944l = bVar2;
            }
        }
    }

    public /* synthetic */ a(C1663a aVar, byte b2) {
        this(aVar);
    }
}
