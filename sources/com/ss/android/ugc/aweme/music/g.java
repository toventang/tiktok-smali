package com.ss.android.ugc.aweme.music;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.favorites.g.a;
import com.ss.android.ugc.aweme.favorites.g.f;
import com.ss.android.ugc.aweme.music.b.l;
import com.ss.android.ugc.aweme.music.f.e;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.as;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class g extends cs implements u<b>, h.a, c<Music>, f, b, m, as, as, i, j {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f111489a;

    /* renamed from: b  reason: collision with root package name */
    DmtStatusView f111490b;

    /* renamed from: c  reason: collision with root package name */
    protected aq.b f111491c;

    /* renamed from: d  reason: collision with root package name */
    protected MusicDownloadPlayHelper f111492d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f111493e = true;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.e.b f111494j;

    /* renamed from: k  reason: collision with root package name */
    public String f111495k;

    /* renamed from: l  reason: collision with root package name */
    public String f111496l;

    /* renamed from: m  reason: collision with root package name */
    DataCenter f111497m;
    protected ViewStub n;
    protected View o;
    protected boolean p;
    private String q = "popular_song";
    private l r;
    private MusicModel s;
    private a t;
    private int u = 7;
    private String v = "";
    private boolean w = true;
    private boolean y;
    private boolean z = true;

    static {
        Covode.recordClassIndex(71617);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    public final void a(BaseResponse baseResponse) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Music> list, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(g.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(70, new org.greenrobot.eventbus.g(g.class, "onEvent", e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(194, new org.greenrobot.eventbus.g(g.class, "onMusicCollect", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.s;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, final MusicModel musicModel, String str2) {
        final androidx.fragment.app.e activity = getActivity();
        final RecordConfig build = new RecordConfig.Builder().musicOrigin(str2).musicPath(str).build();
        AVExternalServiceImpl.a().asyncService("OriginMusic", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.music.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(71619);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(activity, build, musicModel, true);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Music> list, boolean z2) {
        if (ab_()) {
            this.z = false;
            p();
            this.f111490b.d();
            this.r.ai_();
            a(list);
            this.r.d(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void a(String str, String str2) {
        this.f111495k = str;
        this.f111496l = str2;
    }

    private void q() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111492d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111492d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return ab_();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return getActivity();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        q();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        p();
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (ab_()) {
            this.r.ag_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        if (!ab_()) {
            return null;
        }
        return this.f111489a;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f111492d.n = false;
    }

    private static boolean o() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean n2 = n();
        com.ss.android.ugc.aweme.lancet.j.f107229h = n2;
        return n2;
    }

    private void p() {
        l lVar = this.r;
        if (lVar != null) {
            lVar.e();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111492d;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
            this.f111492d.n = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (ab_()) {
            this.o.setVisibility(4);
            this.f111490b.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        DmtStatusView dmtStatusView = this.f111490b;
        if (dmtStatusView == null || !this.p) {
            c();
            return;
        }
        dmtStatusView.setVisibility(4);
        this.o.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.as
    public final boolean k() {
        if (!ab_()) {
            return false;
        }
        if (this.f111489a.getChildCount() > 0) {
            this.f111489a.b(0);
        }
        c();
        return true;
    }

    private TuxTextView t() {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.c4));
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.music.b, com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (ab_()) {
            this.o.setVisibility(4);
            this.f111490b.g();
            aq.b bVar = this.f111491c;
            if (bVar != null && this.z) {
                bVar.a();
            }
            this.z = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (ab_() && getActivity() != null) {
            getActivity();
            if (!o()) {
                new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                this.f111490b.h();
                this.w = true;
            } else if (this.f111494j != null && !TextUtils.isEmpty(this.f111495k)) {
                this.f111494j.a(1, this.f111495k, this.f111496l);
                this.w = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.b
    public final void b(String str) {
        this.v = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void d_(boolean z2) {
        this.p = z2;
    }

    public final void e_(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @r
    public void onEvent(e eVar) {
        q();
    }

    @Override // com.ss.android.ugc.aweme.music.b
    public final void a(aq.b bVar) {
        this.f111491c = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (ab_()) {
            this.r.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z2) {
        super.onHiddenChanged(z2);
        if (z2) {
            p();
        } else {
            this.f111492d.n = false;
        }
    }

    @r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/aweme/v1/original/music/list/?")) {
            EventBus.a().d(aVar);
            c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (z2) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111492d;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.n = false;
            }
            if (this.y) {
                k();
                return;
            }
            return;
        }
        p();
    }

    private void a(List<Music> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            this.f111489a.setVisibility(0);
            this.r.a(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (ab_()) {
            this.w = true;
            this.f111490b.h();
            this.z = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f67014a;
            str.hashCode();
            if (str.equals("music_loading")) {
                l lVar = this.r;
                if (lVar instanceof l) {
                    boolean booleanValue = ((Boolean) this.f111497m.a("music_loading")).booleanValue();
                    if (lVar.f111357b >= 0) {
                        lVar.f111358c.post(new com.ss.android.ugc.aweme.music.b.m(lVar, booleanValue));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel) {
        if (musicModel != null) {
            Boolean bool = false;
            this.f111492d.n = bool.booleanValue();
            this.f111497m.a("music_loading", (Object) true);
            this.s = musicModel;
            if (this.f111493e) {
                this.f111492d.a(musicModel, this.u, false);
            } else {
                this.f111492d.b(musicModel, this.u, true);
            }
        }
    }

    @r
    public void onMusicCollect(com.ss.android.ugc.aweme.music.f.b bVar) {
        if (bVar != null && bVar.f111484b != null) {
            if (1 == bVar.f111483a) {
                this.t.a(1, bVar.f111484b.getMusicId(), 1);
            } else if (bVar.f111483a == 0) {
                this.t.a(1, bVar.f111484b.getMusicId(), 0);
            }
        }
    }

    public final void a(String str) {
        new com.bytedance.tux.g.b(this).a(str).b();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Music> list, boolean z2) {
        if (ab_()) {
            if (z2) {
                this.r.ai_();
            } else {
                this.r.a("");
                this.r.ah_();
            }
            if (!com.bytedance.ies.abmock.b.a().a(true, "share_useNotifySingle", false)) {
                a(list);
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Music music : list) {
                    if (music != null) {
                        arrayList.add(music.convertToMusicModel());
                    }
                }
                this.f111489a.setVisibility(0);
                l lVar = this.r;
                lVar.f111359d.clear();
                lVar.f111359d.addAll(arrayList);
                if (lVar.v) {
                    lVar.notifyItemRangeChanged(lVar.f111361f - 1, lVar.getItemCount() - lVar.f111361f);
                    lVar.notifyItemChanged(lVar.getItemCount() - 1);
                    return;
                }
                lVar.notifyItemRangeChanged(lVar.f111361f, lVar.getItemCount() - lVar.f111361f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        String string;
        String string2;
        this.f111489a = (RecyclerView) view.findViewById(R.id.drv);
        this.f111490b = (DmtStatusView) view.findViewById(R.id.e_o);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f111495k = arguments.getString("user_id");
        this.f111496l = arguments.getString("sec_user_id");
        this.y = arguments.getBoolean("is_me", false);
        if (getContext() != null) {
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
            try {
                TuxTextView t2 = t();
                t2.setText(R.string.cyv);
                t2.setOnClickListener(new i(this));
                boolean z2 = this.y;
                Context context = getContext();
                if (context == null) {
                    tuxTextView = null;
                } else {
                    tuxTextView = t();
                    if (z2) {
                        string = getString(R.string.ddl);
                        string2 = getString(R.string.ddk);
                    } else {
                        string = getString(R.string.dnr);
                        string2 = getString(R.string.dnq, "@" + this.v);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + "\n" + string2);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bx)), 0, string.length(), 18);
                    tuxTextView.setText(spannableStringBuilder);
                    tuxTextView.setLineSpacing(n.b(context, 12.0f), 1.0f);
                }
                a2.b(tuxTextView).c(t2);
                int b2 = (int) n.b(getContext(), 24.0f);
                this.f111490b.setPadding(b2, 0, b2, 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f111490b.setBuilder(a2);
        }
        com.ss.android.ugc.aweme.common.e.b bVar = new com.ss.android.ugc.aweme.common.e.b();
        this.f111494j = bVar;
        bVar.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.music.ui.c.a());
        this.f111494j.a_(this);
        a aVar = new a();
        this.t = aVar;
        aVar.a_(this);
        l lVar = new l(this, this.f111495k, this.P);
        this.r = lVar;
        lVar.d(true);
        this.f111492d.b();
        this.f111492d.f111798h = new h(this);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        this.f111489a.setLayoutManager(wrapLinearLayoutManager);
        da.a.a("origin_music_old_fragment").a(this.f111489a);
        this.r.a(this);
        this.f111489a.setAdapter(this.r);
        this.r.a(new ArrayList());
        getActivity();
        if (!o()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
        } else if (this.N) {
            c();
        }
        this.r.d(true);
        this.r.a(new h.a() {
            /* class com.ss.android.ugc.aweme.music.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71618);
            }

            @Override // com.ss.android.ugc.aweme.common.a.h.a
            public final void l() {
                if (g.this.f111494j != null && !TextUtils.isEmpty(g.this.f111495k)) {
                    g.this.f111494j.a(4, g.this.f111495k, g.this.f111496l);
                }
            }
        });
        DataCenter a3 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.f111497m = a3;
        a3.a("music_loading", (u<b>) this);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel, int i2, boolean z2) {
        this.f111492d.f111801k = this.q;
        this.f111492d.f111803m = i2;
        this.f111492d.b(musicModel, this.u, true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9375);
        View a2 = com.a.a(layoutInflater, R.layout.aq7, viewGroup, false);
        this.f111492d = new MusicDownloadPlayHelper(this);
        ViewStub viewStub = (ViewStub) a2.findViewById(R.id.ed6);
        this.n = viewStub;
        View inflate = viewStub.inflate();
        this.o = inflate;
        inflate.setVisibility(4);
        MethodCollector.o(9375);
        return a2;
    }
}
