package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class bf {

    /* renamed from: a  reason: collision with root package name */
    public static final bf f74182a = new bf();

    private bf() {
    }

    static {
        Covode.recordClassIndex(45778);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f74183a;

        static {
            Covode.recordClassIndex(45779);
        }

        public a(List list) {
            this.f74183a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Aweme aweme : this.f74183a) {
                if (aweme != null && aweme.isAd()) {
                    bf.a("feedApi", aweme);
                }
            }
            return z.f158842a;
        }
    }

    private static String a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            return "{ adid = " + awemeRawAd.getAdId() + ", cid = " + awemeRawAd.getCreativeId() + ", title = " + awemeRawAd.getTitle() + ", buttonText = " + awemeRawAd.getButtonText() + " }";
        }
        return "";
    }

    public static void a(String str, Aweme aweme) {
        l.d(str, "");
        l.d(aweme, "");
        com.ss.android.ugc.aweme.framework.a.a.a(3, "MaskDebugLog", b(str, aweme));
    }

    private static String b(String str, Aweme aweme) {
        return str + " : aid=  " + aweme.getAid() + ", isad= " + aweme.isAd() + ", desc= " + aweme.getDesc() + ", awemeRawAd= " + a(aweme.getAwemeRawAd()) + ", shareUrl = " + aweme.getShareUrl();
    }
}
