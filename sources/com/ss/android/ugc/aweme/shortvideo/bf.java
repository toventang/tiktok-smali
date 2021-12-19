package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.utils.dj;
import com.ss.android.ugc.aweme.utils.i;
import com.ss.android.ugc.aweme.video.hashtag.c;
import com.ss.android.ugc.aweme.video.hashtag.d;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.a;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class bf implements u<b>, ak.a<AVChallenge>, ak.e, d {

    /* renamed from: a  reason: collision with root package name */
    public static String f125018a = "video_challenge";

    /* renamed from: b  reason: collision with root package name */
    public static String f125019b = "photo_publish";

    /* renamed from: c  reason: collision with root package name */
    public static String f125020c = "challenge_create";

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f125021d;

    /* renamed from: e  reason: collision with root package name */
    public DmtStatusView f125022e;

    /* renamed from: f  reason: collision with root package name */
    public eh f125023f;

    /* renamed from: g  reason: collision with root package name */
    public String f125024g;

    /* renamed from: h  reason: collision with root package name */
    public ak.d f125025h;

    /* renamed from: i  reason: collision with root package name */
    public ak.c f125026i;

    /* renamed from: j  reason: collision with root package name */
    public ak.b f125027j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f125028k;

    /* renamed from: l  reason: collision with root package name */
    public c f125029l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.video.hashtag.b> f125030m = new ArrayList<>();
    public ak.f n;
    public BaseTitleHelper o;
    public HashTagMobHelper p;
    public String q;
    public boolean r = false;
    private ViewGroup s;
    private ViewGroup t;
    private ViewGroup u;
    private ViewGroup v;
    private FrameLayout w;
    private boolean x;

    @Override // com.ss.android.ugc.aweme.port.in.ak.a
    public final void a() {
        b(null);
    }

    static {
        Covode.recordClassIndex(82138);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void b() {
        a(0);
        this.f125021d.setVisibility(8);
        this.f125022e.f();
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void c() {
        a(0);
        this.f125021d.setVisibility(8);
        this.f125022e.h();
    }

    public final void d() {
        this.s.setVisibility(8);
        this.t.setVisibility(0);
        this.f125030m.clear();
        this.f125029l.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.a
    public final void a(List<AVChallenge> list) {
        b(list);
    }

    private void a(int i2) {
        FrameLayout frameLayout = this.w;
        if (frameLayout != null) {
            frameLayout.setVisibility(i2);
        }
        DmtStatusView dmtStatusView = this.f125022e;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(i2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        b bVar2 = bVar;
        if (bVar2 != null && TextUtils.equals(bVar2.f67014a, ak.f115583a) && (str = this.f125024g) != null && str.endsWith("#")) {
            a("");
        }
    }

    private void b(List<AVChallenge> list) {
        a("", null);
        List<com.ss.android.ugc.aweme.video.hashtag.b> a2 = a.a(list, this.f125025h.a());
        if (a2.isEmpty()) {
            a(0);
            this.f125021d.setVisibility(8);
            this.f125022e.g();
            return;
        }
        a(8);
        this.f125021d.setVisibility(0);
        this.f125030m.clear();
        this.f125030m.addAll(a2);
        this.f125029l.f143404a = true;
        this.f125029l.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.video.hashtag.d
    public final void a(AVChallenge aVChallenge) {
        d();
        this.f125028k = false;
        HashTagMentionEditText hashTagMentionEditText = this.f125023f.f128419c;
        int selectionStart = hashTagMentionEditText.getSelectionStart();
        String substring = hashTagMentionEditText.getText().toString().substring(0, selectionStart);
        if (dj.a(substring) || substring.endsWith("#")) {
            com.ss.android.ugc.aweme.video.hashtag.a b2 = dj.b(substring, aVChallenge.getChallengeName());
            hashTagMentionEditText.getText().replace(substring.lastIndexOf("#"), selectionStart, b2.f143396c);
            hashTagMentionEditText.a(true);
            String trim = b2.f143396c.trim();
            if (!dj.a(trim)) {
                hashTagMentionEditText.C.add(trim);
            }
        }
    }

    public final void a(String str) {
        if (!com.ss.android.ugc.aweme.port.in.c.u.a()) {
            this.u.setVisibility(8);
            if (this.v.getVisibility() == 0) {
                e eVar = (e) i.a(this.v.getContext());
                Fragment a2 = eVar.getSupportFragmentManager().a("publish_add_video");
                if (a2 != null) {
                    eVar.getSupportFragmentManager().a().a(a2).b();
                }
                this.v.setVisibility(8);
            }
            this.s.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.x = true;
                this.f125027j.a(1);
                return;
            }
            this.x = false;
            this.f125026i.a(str, f125020c);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void a(AVSearchChallengeList aVSearchChallengeList) {
        if (!this.x) {
            if (aVSearchChallengeList != null) {
                a(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
            }
            String str = null;
            List<g> list = aVSearchChallengeList == null ? null : aVSearchChallengeList.items;
            this.f125030m.clear();
            if (!this.f125028k || h.a(list)) {
                a(0);
                this.f125021d.setVisibility(8);
                this.f125022e.g();
                this.s.setVisibility(8);
                this.t.setVisibility(0);
            } else {
                HashTagMobHelper hashTagMobHelper = this.p;
                if (hashTagMobHelper != null) {
                    hashTagMobHelper.f128460b = aVSearchChallengeList.logPb;
                    this.p.f128462d = aVSearchChallengeList.keyword;
                    this.p.f128461c = aVSearchChallengeList.recommendWordMob;
                }
                String str2 = aVSearchChallengeList.keyword;
                c cVar = this.f125029l;
                LogPbBean logPbBean = aVSearchChallengeList.logPb;
                cVar.f143405b = str2;
                cVar.f143406c = logPbBean;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    g gVar = list.get(i2);
                    ArrayList<com.ss.android.ugc.aweme.video.hashtag.b> arrayList = this.f125030m;
                    boolean z = true;
                    if (i2 != 0 || !com.bytedance.ies.abmock.b.a().a(true, "display_new_challenge_as_not_found", false) || !gVar.f128515a.isNew(str2)) {
                        z = false;
                    }
                    arrayList.add(com.ss.android.ugc.aweme.video.hashtag.b.a(gVar, z));
                }
                HashTagMobHelper hashTagMobHelper2 = this.p;
                Integer valueOf = Integer.valueOf(this.f125030m.size());
                if (valueOf != null) {
                    valueOf.intValue();
                    s a2 = new s().a("words_num", String.valueOf(valueOf.intValue())).a("words_source", "sug").a("search_position", "challenge_create").a("raw_query", hashTagMobHelper2.f128462d).a("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.f128461c;
                    s a3 = a2.a("query_id", recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                    if (hashTagMobHelper2.f128460b == null) {
                        str = "";
                    } else {
                        LogPbBean logPbBean2 = hashTagMobHelper2.f128460b;
                        if (logPbBean2 != null) {
                            str = logPbBean2.getImprId();
                        }
                    }
                    r.a("trending_show", a3.a("impr_id", str).a());
                }
                this.f125022e.d();
                a(8);
                this.f125021d.setVisibility(0);
                this.s.setVisibility(0);
                this.t.setVisibility(8);
            }
            this.f125029l.notifyDataSetChanged();
        }
    }

    private static void a(String str, LogPbBean logPbBean) {
        s sVar = new s();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        s a2 = sVar.a("search_keyword", str);
        if (logPbBean != null) {
            str2 = com.ss.android.ugc.aweme.port.in.c.f115623b.b(logPbBean);
        }
        r.b("search_tag", a2.a("log_pb", str2).a());
    }

    public bf(String str, eh ehVar, View view) {
        this.q = str;
        this.f125023f = ehVar;
        ehVar.q = com.ss.android.ugc.aweme.port.in.c.u.c();
        this.f125021d = (RecyclerView) view.findViewById(R.id.bej);
        this.s = (ViewGroup) view.findViewById(R.id.ben);
        this.t = (ViewGroup) view.findViewById(R.id.ve);
        this.u = (ViewGroup) view.findViewById(R.id.hb);
        this.v = (ViewGroup) view.findViewById(R.id.hl);
        this.f125022e = (DmtStatusView) view.findViewById(R.id.e_o);
        this.w = (FrameLayout) view.findViewById(R.id.e_v);
        ViewGroup viewGroup = this.s;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.topMargin = (int) (((float) layoutParams.topMargin) + com.ss.android.ugc.tools.utils.r.a(viewGroup.getContext(), 8.0f));
        viewGroup.setLayoutParams(layoutParams);
    }
}
