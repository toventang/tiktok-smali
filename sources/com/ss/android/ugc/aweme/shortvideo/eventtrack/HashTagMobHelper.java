package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.b;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import h.f.b.l;
import java.util.List;

public final class HashTagMobHelper extends ac {

    /* renamed from: g  reason: collision with root package name */
    public static final a f128458g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f128459a;

    /* renamed from: b  reason: collision with root package name */
    public LogPbBean f128460b;

    /* renamed from: c  reason: collision with root package name */
    public RecommendWordMob f128461c;

    /* renamed from: d  reason: collision with root package name */
    public String f128462d;

    /* renamed from: e  reason: collision with root package name */
    public BaseTitleHelper f128463e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends b> f128464f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f128465h;

    /* renamed from: i  reason: collision with root package name */
    private String f128466i;

    static {
        Covode.recordClassIndex(84231);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84232);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f128462d != null) {
            List<? extends b> list = this.f128464f;
            if (!(list == null || list.isEmpty())) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    b bVar = (b) list.get(i2);
                    if (l.a((Object) this.f128462d, (Object) bVar.f143397a.challengeName)) {
                        a("input_sharp", bVar, Integer.valueOf(i2), "input");
                        return;
                    }
                }
            }
        }
    }

    public final void a(String str) {
        String str2;
        if (l.a((Object) str, (Object) "click_tag_button")) {
            this.f128465h = true;
        } else if (this.f128465h) {
            this.f128465h = false;
            return;
        }
        this.f128466i = str;
        s sVar = new s();
        BaseTitleHelper baseTitleHelper = this.f128463e;
        if (baseTitleHelper != null) {
            str2 = baseTitleHelper.f143429c;
        } else {
            str2 = null;
        }
        r.a("show_tag", sVar.a("title", str2).a("creation_id", this.f128459a).a("enter_method", str).a());
    }

    public final void a(b bVar, Integer num) {
        String str;
        if (bVar != null && num != null) {
            num.intValue();
            s a2 = new s().a("enter_method", this.f128466i).a("tag_id", bVar.f143397a.getCid()).a("tag_source", bVar.f143402f).a("tag_content", bVar.f143397a.challengeName).a("rank", String.valueOf(num.intValue())).a("creation_id", this.f128459a);
            BaseTitleHelper baseTitleHelper = this.f128463e;
            if (baseTitleHelper != null) {
                str = baseTitleHelper.f143429c;
            } else {
                str = null;
            }
            r.a("show_tag_words", a2.a("title", str).a());
        }
    }

    public final void b(b bVar, Integer num) {
        String str;
        if (bVar != null && num != null) {
            num.intValue();
            String str2 = bVar.f143397a.cid;
            s a2 = new s().a("words_content", bVar.f143397a.challengeName).a("words_position", String.valueOf(num.intValue())).a("words_source", "sug").a("search_position", "challenge_create").a("raw_query", this.f128462d).a("rank", "-1");
            RecommendWordMob recommendWordMob = this.f128461c;
            String str3 = null;
            if (recommendWordMob != null) {
                str = recommendWordMob.getQueryId();
            } else {
                str = null;
            }
            s a3 = a2.a("query_id", str).a("group_id", str2);
            if (this.f128460b != null && !bVar.f143403g) {
                LogPbBean logPbBean = this.f128460b;
                if (logPbBean != null) {
                    str3 = logPbBean.getImprId();
                }
            } else {
                str3 = "";
            }
            r.a("trending_words_show", a3.a("impr_id", str3).a());
        }
    }

    public final void a(String str, b bVar, Integer num, String str2) {
        String str3;
        if (bVar != null && num != null) {
            num.intValue();
            String cid = bVar.f143397a.getCid();
            s a2 = new s().a("enter_method", str);
            String str4 = "";
            if (cid == null) {
                cid = str4;
            }
            s a3 = a2.a("tag_id", cid);
            if (str2 == null) {
                str2 = bVar.f143402f;
            }
            s a4 = a3.a("tag_source", str2).a("tag_content", bVar.f143397a.challengeName).a("rank", String.valueOf(num.intValue())).a("creation_id", this.f128459a);
            BaseTitleHelper baseTitleHelper = this.f128463e;
            if (baseTitleHelper != null) {
                str3 = baseTitleHelper.f143429c;
            } else {
                str3 = null;
            }
            s a5 = a4.a("title", str3);
            if (this.f128460b != null) {
                str4 = c.f115623b.b(this.f128460b);
            }
            r.a("add_tag", a5.a("log_pb", str4).a());
        }
    }
}
