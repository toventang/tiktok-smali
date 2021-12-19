package com.ss.android.ugc.aweme.challenge.recommend;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;

public class RecommendHashTagViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private t<b> f69997a;

    static {
        Covode.recordClassIndex(43177);
    }

    public final t<b> a() {
        if (this.f69997a == null) {
            this.f69997a = new t<>();
        }
        return this.f69997a;
    }

    public final void a(ak.f fVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f69997a == null) {
            this.f69997a = new t<>();
        }
        t<b> tVar = this.f69997a;
        l.d(tVar, "");
        if (!in.d()) {
            RecommendHashTagApi.HashTagApi hashTagApi = RecommendHashTagApi.f69991a;
            if (hashTagApi == null) {
                l.b();
            }
            if (fVar != null) {
                str = fVar.f115587d;
                str2 = fVar.f115585b;
                str3 = fVar.f115584a;
                str4 = fVar.f115586c;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            hashTagApi.fetchRecommendHashTagsMT(str, str2, str3, str4).a(new RecommendHashTagApi.a(tVar), i.f4826c, null);
        }
    }
}
