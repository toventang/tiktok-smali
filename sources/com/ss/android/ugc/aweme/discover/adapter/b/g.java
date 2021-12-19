package com.ss.android.ugc.aweme.discover.adapter.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.k.bd;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.i;
import com.ss.android.ugc.aweme.utils.gu;
import com.ss.android.ugc.aweme.utils.hl;
import h.f.b.l;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static String f80504a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final g f80505b = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(50091);
    }

    public static void a(String str) {
        l.d(str, "");
        f80504a = str;
    }

    public static final void a(int i2, e eVar) {
        String str;
        if (eVar != null) {
            bd bdVar = new bd();
            Word word = eVar.f121523f;
            String str2 = null;
            if (word != null) {
                str = word.getId();
            } else {
                str = null;
            }
            bk bkVar = (bk) bdVar.i(str);
            Word word2 = eVar.f121523f;
            if (word2 != null) {
                str2 = word2.getWord();
            }
            bkVar.w(str2).v("sug").d(Integer.valueOf(i2)).w(eVar.f121519b).u("enrich_sug").a(eVar.f121528k).f();
        }
    }

    public static final void a(String str, int i2, e eVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (eVar != null && !eVar.f121527j) {
            eVar.f121527j = true;
            Map<String, String> map = eVar.f121528k;
            String str7 = null;
            if (map != null && l.a(eVar)) {
                i iVar = eVar.f121524g;
                if (iVar != null) {
                    str5 = iVar.getUserId();
                } else {
                    str5 = null;
                }
                if (hl.a(str5)) {
                    i iVar2 = eVar.f121524g;
                    if (iVar2 != null) {
                        str6 = iVar2.getUserId();
                    } else {
                        str6 = null;
                    }
                    map.put("sug_user_id", str6);
                }
            }
            bl blVar = new bl();
            i iVar3 = eVar.f121524g;
            if (iVar3 != null) {
                str3 = iVar3.getUserRelationType();
            } else {
                str3 = null;
            }
            bk y = blVar.t(str3).y(str);
            SearchResultActivity a2 = gu.a();
            if (a2 != null) {
                y.a(SearchEnterViewModel.a.a(a2).b().obtainLogData("tab_name"));
            }
            Word word = eVar.f121523f;
            if (word != null) {
                str4 = word.getId();
            } else {
                str4 = null;
            }
            bk bkVar = (bk) y.i(str4);
            Word word2 = eVar.f121523f;
            if (word2 != null) {
                str7 = word2.getWord();
            }
            bk bkVar2 = (bk) bkVar.w(str7).v("sug").w(eVar.f121519b).d(Integer.valueOf(i2)).u(str2).a(eVar.f121528k);
            String str8 = f80504a;
            if (str8 == null) {
                str8 = "";
            }
            bkVar2.E(str8).f();
        }
    }

    public static final void b(String str, int i2, e eVar, String str2) {
        String str3;
        String str4;
        Map<String, String> map;
        if (eVar != null) {
            if (!l.a(eVar) && (map = eVar.f121528k) != null) {
                map.remove("sug_user_id");
            }
            bj bjVar = new bj();
            i iVar = eVar.f121524g;
            String str5 = null;
            if (iVar != null) {
                str3 = iVar.getUserRelationType();
            } else {
                str3 = null;
            }
            bk y = bjVar.t(str3).y(str);
            SearchResultActivity a2 = gu.a();
            if (a2 != null) {
                y.a(SearchEnterViewModel.a.a(a2).b().obtainLogData("tab_name"));
            }
            Word word = eVar.f121523f;
            if (word != null) {
                str4 = word.getId();
            } else {
                str4 = null;
            }
            bk bkVar = (bk) y.i(str4);
            Word word2 = eVar.f121523f;
            if (word2 != null) {
                str5 = word2.getWord();
            }
            bk u = bkVar.w(str5).v("sug").w(eVar.f121519b).d(Integer.valueOf(i2)).u(str2);
            String str6 = f80504a;
            if (str6 == null) {
                str6 = "";
            }
            u.E(str6).a(eVar.f121528k).f();
        }
    }
}
