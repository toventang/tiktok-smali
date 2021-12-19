package com.ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class ay {

    /* renamed from: a  reason: collision with root package name */
    static final h f74173a = i.a((h.f.a.a) b.f74176a);

    /* renamed from: b  reason: collision with root package name */
    public static final ay f74174b = new ay();

    private ay() {
    }

    static final class b extends m implements h.f.a.a<androidx.c.a<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74176a = new b();

        static {
            Covode.recordClassIndex(45768);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.c.a<String, Integer> invoke() {
            return new androidx.c.a();
        }
    }

    static {
        Covode.recordClassIndex(45766);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f74175a;

        static {
            Covode.recordClassIndex(45767);
        }

        public a(List list) {
            this.f74175a = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: androidx.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Aweme aweme : this.f74175a) {
                if (aweme != null) {
                    l.d(aweme, "");
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    String str = null;
                    if (!TextUtils.isEmpty(awemeRawAd != null ? awemeRawAd.getLynxRawData() : null)) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            str = awemeRawAd2.getLynxRawData();
                        }
                        str = new JSONObject(str).optString("star_sec_uid");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ((androidx.c.a) ay.f74173a.getValue()).put(str, 0);
                    }
                }
            }
            return z.f158842a;
        }
    }
}
