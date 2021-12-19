package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.g;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class s extends o {
    static {
        Covode.recordClassIndex(71238);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new s();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.WIKIPEDIA.getTYPE();
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        l.d(dVar, "");
        a(new a(this, dVar));
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        String str;
        l.d(dVar, "");
        String optString = s().optString("request_id");
        if (optString == null) {
            optString = "";
        }
        String e2 = ac.e(o());
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        com.ss.android.ugc.aweme.common.s a2 = new com.ss.android.ugc.aweme.common.s().a("log_pb", ac.a.f91473a.a(logPbBean));
        Aweme o = o();
        if (o != null) {
            str = o.getAuthorUid();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.common.s a3 = a2.a("author_id", str).a("group_id", e2).a("impr_type", com.ss.android.ugc.aweme.metrics.ac.j(o()));
        String p = p();
        if (p == null) {
            p = "";
        }
        JSONObject a4 = a3.a("enter_from", p).a();
        l.b(a4, "");
        r.a("multi_anchor_entrance_show", a(dVar, a4).f66730a);
    }

    static final class a extends m implements b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(71239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar, d dVar) {
            super(1);
            this.this$0 = sVar;
            this.$eventMapBuilder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            WikipediaInfo wikipediaInfo = new WikipediaInfo();
            wikipediaInfo.setKeyword(anchorCommonStruct2.getKeyword());
            wikipediaInfo.setLang(anchorCommonStruct2.getLanguage());
            wikipediaInfo.setExtra((WikipediaExtra) new f().a(anchorCommonStruct2.getExtra(), WikipediaExtra.class));
            wikipediaInfo.setAnchorId(anchorCommonStruct2.getId());
            o.a(this.this$0, this.$eventMapBuilder, false, false, 6);
            Activity r = this.this$0.r();
            s sVar = this.this$0;
            HashMap hashMap = new HashMap();
            hashMap.put("close", "false");
            hashMap.put("back", "true");
            hashMap.put("hide_nav_bar", "false");
            String authorUid = sVar.o().getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            hashMap.put("author_id", authorUid);
            String aid = sVar.o().getAid();
            if (aid == null) {
                aid = "";
            }
            hashMap.put("group_id", aid);
            hashMap.put("enter_from", sVar.p());
            AnchorCommonStruct anchorCommonStruct3 = sVar.f110994h;
            if (anchorCommonStruct3 == null || (str = anchorCommonStruct3.getId()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            Map<String, String> map = this.$eventMapBuilder.f66730a;
            l.b(map, "");
            com.ss.android.ugc.aweme.commercialize.b.c.a(r, wikipediaInfo, hashMap, map);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final g a(List<AnchorCommonStruct> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        String str = "";
        boolean z = false;
        for (T t : list) {
            T t2 = t;
            try {
                WikipediaExtra wikipediaExtra = (WikipediaExtra) new f().a(t2.getExtra(), WikipediaExtra.class);
                Integer num = null;
                if (wikipediaExtra != null) {
                    num = wikipediaExtra.getStatus();
                }
                if (num != null) {
                    if (num.intValue() == 2) {
                        String authorUid = o().getAuthorUid();
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g2, "");
                        if (TextUtils.equals(authorUid, g2.getCurUserId()) && !a(t2.getId())) {
                            b(t2.getId());
                            str = wikipediaExtra.getWarningMsg();
                            z = true;
                        }
                    }
                }
                if (t2.getType() == ab.WIKIPEDIA.getTYPE()) {
                    if (wikipediaExtra != null) {
                        Integer status = wikipediaExtra.getStatus();
                        if (status != null) {
                            if (status.intValue() == 2) {
                            }
                        }
                    }
                    arrayList.add(t);
                }
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList2 = arrayList;
        if (z) {
            Aweme o = o();
            if (TextUtils.isEmpty(str)) {
                str = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.hf_);
            }
            o.setAnchorWikiOfflineText(str);
        }
        if (arrayList2.size() == 0) {
            return g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) arrayList2.get(0);
        list.remove(anchorCommonStruct);
        b(anchorCommonStruct);
        a(anchorCommonStruct);
        this.f110994h = anchorCommonStruct;
        if (arrayList2.size() == 1) {
            return g.DONE;
        }
        return g.PROCEED;
    }
}
