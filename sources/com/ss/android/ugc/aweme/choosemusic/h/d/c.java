package com.ss.android.ugc.aweme.choosemusic.h.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.am;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.model.ar;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static String f70567d = "";

    /* renamed from: e  reason: collision with root package name */
    public static final a f70568e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f70569a;

    /* renamed from: b  reason: collision with root package name */
    public LogPbBean f70570b;

    /* renamed from: c  reason: collision with root package name */
    public am f70571c;

    public static final class a {
        static {
            Covode.recordClassIndex(43519);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            l.d(str, "");
            c.f70567d = str;
        }
    }

    static {
        Covode.recordClassIndex(43518);
    }

    public final void a(an anVar) {
        Integer num;
        String str;
        String str2;
        l.d(anVar, "");
        a a2 = new a().a("words_source", "sug").a("search_position", "music_create");
        ar wordRecord = anVar.getWordRecord();
        String str3 = null;
        if (wordRecord != null) {
            num = Integer.valueOf(wordRecord.getWordPosition());
        } else {
            num = null;
        }
        a a3 = a2.a("words_position", num);
        LogPbBean logPbBean = this.f70570b;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        a a4 = a3.a("impr_id", str).a("raw_query", this.f70569a).a("words_content", this.f70569a);
        am amVar = this.f70571c;
        if (amVar != null) {
            str2 = amVar.getQueryId();
        } else {
            str2 = null;
        }
        a a5 = a4.a("query_id", str2);
        ar wordRecord2 = anVar.getWordRecord();
        if (wordRecord2 != null) {
            str3 = wordRecord2.getId();
        }
        r.a("sug_input_click", a5.a("group_id", str3).f70563a);
    }
}
