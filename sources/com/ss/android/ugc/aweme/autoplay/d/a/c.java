package com.ss.android.ugc.aweme.autoplay.d.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.b.b;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import com.ss.android.ugc.aweme.discover.mixfeed.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.List;

public abstract class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private r f67334a;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.r f67335d;

    /* renamed from: e  reason: collision with root package name */
    public q f67336e;

    static {
        Covode.recordClassIndex(41474);
    }

    private final String a() {
        String str;
        q qVar = this.f67336e;
        if (qVar == null || (str = qVar.f81857d) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a.d
    public void a(h hVar, r rVar) {
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar2;
        l.d(hVar, "");
        l.d(rVar, "");
        q qVar = hVar.n;
        if (qVar != null) {
            this.f67336e = qVar;
            q qVar2 = hVar.n;
            if (qVar2 != null && (rVar2 = qVar2.f81855b) != null) {
                this.f67335d = rVar2;
                this.f67334a = rVar;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a.d
    public final void a(String str, q qVar) {
        String str2;
        int i2;
        String str3 = "";
        l.d(str, str3);
        l.d(qVar, str3);
        r rVar = this.f67334a;
        if (rVar != null) {
            if (TextUtils.equals(str, "search_result_show")) {
                com.ss.android.ugc.aweme.search.k.c g2 = b.a(rVar).x(qVar.f81856c).g(a());
                List<? extends Aweme> list = qVar.f81854a;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                g2.c("item_num", String.valueOf(i2)).f();
            } else if (TextUtils.equals(str, "search_result_click")) {
                at B = ((at) b.b(rVar).x(qVar.f81856c)).B("click_more_button");
                com.ss.android.ugc.aweme.discover.mixfeed.r rVar2 = this.f67335d;
                if (!(rVar2 == null || (str2 = rVar2.f81859b) == null)) {
                    str3 = str2;
                }
                B.s(str3).g(a()).f();
            }
        }
    }
}
