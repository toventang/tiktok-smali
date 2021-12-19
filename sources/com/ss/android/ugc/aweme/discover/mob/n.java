package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.ax;
import com.ss.android.ugc.aweme.search.k.b;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.e;
import com.ss.android.ugc.aweme.search.n.h;
import com.ss.android.ugc.aweme.utils.w;
import h.f.b.l;
import java.util.Map;

public final class n implements ISearchResultStatistics {

    /* renamed from: a  reason: collision with root package name */
    public static final n f81934a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(50861);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(l lVar) {
        l.d(lVar, "");
        ((c) new ax(lVar.f81929a).o(lVar.f81930b)).c(ac.a.f91473a.a(d.a())).g(d.f81886e).a("music_id", lVar.f81931c).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(f fVar) {
        String str;
        l.d(fVar, "");
        String a2 = d.a();
        c g2 = ((c) new ax(fVar.f81908a).o(fVar.f81910c).p(fVar.f81912e)).c(ac.a.f91473a.a(a2)).g(d.f81886e);
        if (l.a((Object) d.f81887f, (Object) "general_search")) {
            str = "general";
        } else {
            str = d.f81887f;
        }
        ax axVar = (ax) g2.f(str).a(a2).m(fVar.f81913f);
        String str2 = fVar.f81914g;
        l.d(str2, "");
        axVar.c("follow_type", str2);
        ax axVar2 = axVar;
        axVar2.c("is_search_scene", String.valueOf(Integer.valueOf(fVar.f81915h)));
        axVar2.a("to_user_id", fVar.f81909b).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(r rVar) {
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        ad c2;
        Video video;
        ad c3;
        String str7 = "";
        l.d(rVar, str7);
        String a2 = d.a();
        b o = new ax(rVar.f81949a).o(rVar.f81951c);
        Aweme aweme = rVar.f81950b;
        String str8 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        b j2 = o.j(str);
        Aweme aweme2 = rVar.f81950b;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        c c4 = ((c) j2.i(str2)).c(ac.a.f91473a.a(a2));
        q a3 = am.a();
        int i3 = 0;
        if (a3 != null) {
            i2 = a3.a();
        } else {
            i2 = 0;
        }
        c a4 = c4.f(m.b(i2)).g(d.f81886e).d(a2).a(Integer.valueOf(d.f81888g));
        r rVar2 = d.f81890i;
        if (rVar2 != null) {
            str3 = rVar2.f121275j;
        } else {
            str3 = null;
        }
        c d2 = a4.d(str3);
        q a5 = am.a();
        if (a5 == null || (c3 = a5.c()) == null) {
            str4 = null;
        } else {
            str4 = c3.f121172a;
        }
        c a6 = d2.a(str4);
        h b2 = d.a.b();
        if (b2 != null) {
            str5 = b2.getSearchId();
        } else {
            str5 = null;
        }
        c cVar = (c) a6.c("search_id_x", str5).a(w.a(rVar.f81950b, rVar.f81949a, rVar.f81951c));
        if (rVar.f81952d >= 0) {
            cVar.a("duration", String.valueOf(rVar.f81952d));
            Aweme aweme3 = rVar.f81950b;
            if (aweme3 == null || (video = aweme3.getVideo()) == null || (i3 = video.getDuration()) >= 0) {
                double d3 = (double) rVar.f81952d;
                Double.isNaN(d3);
                double d4 = (double) i3;
                Double.isNaN(d4);
                cVar.a("percentage", String.valueOf((d3 * 1.0d) / d4));
            }
        }
        if (!TextUtils.isEmpty(rVar.f81954f)) {
            cVar.a("previous_page", rVar.f81954f);
        }
        if (d.f81889h != null) {
            Map<String, String> map = d.f81889h;
            if (map == null) {
                l.b();
            }
            cVar.b(map);
        }
        if (!TextUtils.isEmpty(rVar.f81955g)) {
            cVar.a("previous_page_position", rVar.f81955g);
        }
        if (l.a((Object) rVar.f81951c, (Object) "playlist")) {
            String str9 = rVar.f81954f;
            if (str9 == null) {
                str9 = str7;
            }
            Map<String, String> a7 = e.a.a(str9);
            String str10 = a7.get("is_from_video");
            if (str10 != null) {
                str7 = str10;
            }
            String str11 = a7.get("list_item_id");
            if (str11 == null) {
                Aweme aweme4 = rVar.f81950b;
                if (aweme4 != null) {
                    str11 = aweme4.getAid();
                } else {
                    str11 = null;
                }
            }
            if (l.a((Object) str7, (Object) "0") || l.a((Object) str7, (Object) "2")) {
                Aweme aweme5 = rVar.f81950b;
                if (aweme5 != null) {
                    str8 = aweme5.getAid();
                }
                cVar.a("search_third_item_id", str8);
            }
            cVar.a("is_from_video", str7);
            cVar.a("list_item_id", str11);
            cVar.a(Integer.valueOf((int) rVar.f81956h));
            cVar.g(a7.get("search_result_id"));
        } else {
            q a8 = am.a();
            if (a8 == null || (c2 = a8.c()) == null) {
                str6 = null;
            } else {
                str6 = c2.f121173b;
            }
            cVar.b(str6);
            h b3 = d.a.b();
            if (b3 != null) {
                str8 = b3.getSearchKeyword();
            }
            cVar.c("search_keyword_x", str8);
        }
        cVar.f();
    }
}
