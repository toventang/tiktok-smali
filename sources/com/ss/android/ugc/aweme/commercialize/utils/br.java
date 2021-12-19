package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.x.b.c;
import com.bytedance.x.b.f;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class br {

    /* renamed from: a  reason: collision with root package name */
    public static final br f75699a = new br();

    private br() {
    }

    static {
        Covode.recordClassIndex(46690);
    }

    public static final c b(Aweme aweme) {
        return a(aweme, "icon");
    }

    public static final class a extends m implements b<com.bytedance.x.b.b, h<? extends c>> {
        static {
            Covode.recordClassIndex(46691);
        }

        public a() {
            super(1);
        }

        public final h<c> invoke(com.bytedance.x.b.b bVar) {
            List<c> list;
            h<c> t;
            if (bVar == null || (list = bVar.iconList) == null || (t = n.t(list)) == null) {
                return h.l.c.f158758a;
            }
            return t;
        }
    }

    public static final boolean a(Aweme aweme) {
        if (!a(aweme, false) || !a(aweme, 3)) {
            return false;
        }
        return true;
    }

    public static final boolean a(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.providerType != i2) {
            return false;
        }
        return true;
    }

    public static final c a(Aweme aweme, String str) {
        h hVar;
        AwemeRawAd awemeRawAd;
        ai omVast;
        f fVar;
        List<com.bytedance.x.b.b> list;
        l.d(str, "");
        Object obj = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = h.l.c.f158758a;
        } else {
            hVar = k.d(n.t(list), new a());
        }
        Iterator a2 = hVar.a();
        while (true) {
            if (!a2.hasNext()) {
                break;
            }
            Object next = a2.next();
            if (l.a((Object) ((c) next).program, (Object) str)) {
                obj = next;
                break;
            }
        }
        return (c) obj;
    }

    public static final boolean a(Aweme aweme, SmartImageView smartImageView) {
        c a2;
        Set<String> set;
        T t;
        if (!(!a(aweme, 3) || (a2 = a(aweme, "icon")) == null || (set = a2.staticResource) == null)) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                l.b(t2, "");
                if (t2.length() > 0) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                v a3 = r.a((String) t3);
                a3.E = smartImageView;
                a3.c();
                return true;
            }
        }
        return false;
    }

    public static final boolean a(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.loaded != z) {
            return false;
        }
        return true;
    }
}
