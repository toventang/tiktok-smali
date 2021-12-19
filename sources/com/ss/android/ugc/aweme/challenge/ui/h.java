package com.ss.android.ugc.aweme.challenge.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.fs;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;
import h.f.b.z;
import h.p;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class h extends s.d {
    public static final a Companion = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private transient h.f.a.a<p<Long, String>> f70149a;
    private WeakReference<e> activity;
    private String source;
    private Aweme toJumpAweme;

    public static final class b extends com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.challenge.g.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f70150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f70151b;

        static {
            Covode.recordClassIndex(43255);
        }

        public static final class a implements fs.a {
            static {
                Covode.recordClassIndex(43256);
            }

            a() {
            }

            @Override // com.ss.android.ugc.aweme.utils.fs.a
            public final void a(String str, Map<String, String> map) {
                l.d(str, "");
                l.d(map, "");
                r.a(str, map);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dd, code lost:
            if (((com.ss.android.ugc.aweme.common.e.a) r0).isNewDataEmpty() == false) goto L_0x00df;
         */
        @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
            // Method dump skipped, instructions count: 229
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.h.b.c():void");
        }

        b(h hVar, z.e eVar) {
            this.f70150a = hVar;
            this.f70151b = eVar;
        }
    }

    static {
        Covode.recordClassIndex(43253);
    }

    public h() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final boolean sendCustomRequest(com.ss.android.ugc.aweme.common.e.b<? extends com.ss.android.ugc.aweme.common.e.a<?, ?>> bVar, int i2) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43254);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final WeakReference<e> getActivity() {
        return this.activity;
    }

    public final h.f.a.a<p<Long, String>> getPreloadInfoInvoke() {
        return this.f70149a;
    }

    public final String getSource() {
        return this.source;
    }

    public final Aweme getToJumpAweme() {
        return this.toJumpAweme;
    }

    public final void setActivity(WeakReference<e> weakReference) {
        this.activity = weakReference;
    }

    public final void setPreloadInfoInvoke(h.f.a.a<p<Long, String>> aVar) {
        this.f70149a = aVar;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.toJumpAweme = aweme;
    }

    public final void setSource(String str) {
        l.d(str, "");
        this.source = str;
    }

    public h(String str) {
        l.d(str, "");
        this.source = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b, com.ss.android.ugc.aweme.challenge.ui.s.d
    public final void onJumpToDetail(String str) {
        l.d(str, "");
        super.onJumpToDetail(str);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.d
    public final int getDetailAwemeViewType(int i2, Aweme aweme) {
        if (aweme == null || aweme.getNewLiveRoomData() == null) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final com.ss.android.ugc.aweme.common.e.b<? extends com.ss.android.ugc.aweme.common.e.a<?, ?>> getPresenter(int i2, e eVar) {
        z.e eVar2 = new z.e();
        T t = (T) new com.ss.android.ugc.aweme.challenge.g.a();
        if (eVar != null) {
            ChallengeDetailViewModel a2 = ChallengeDetailViewModel.a.a(eVar);
            l.d(t, "");
            a2.f70246b.setValue(new p<>(Integer.valueOf(i2), t));
        }
        eVar2.element = t;
        eVar2.element.a(this.source);
        b bVar = new b(this, eVar2);
        bVar.a((com.ss.android.ugc.aweme.common.b) eVar2.element);
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        l.d(cVar, "");
        l.d(aweme, "");
        r.a("feed_enter", new d().a("enter_from", "challenge").a("group_id", aweme.getAid()).a("tag_id", cVar.f70219d).a("search_id", com.ss.android.ugc.aweme.challenge.g.a.f69953a.get(aweme.getAid())).a("rank_index", String.valueOf(cVar.f70221f)).a("process_id", cVar.f70220e).f66730a);
        this.toJumpAweme = aweme;
        cVar.f70216a = "from_challenge";
        cVar.f70217b = "challenge_id";
        return cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.d
    public final com.ss.android.ugc.aweme.challenge.a.a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i2, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
        l.d(viewGroup, "");
        if (i2 != 1) {
            return new i(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.w5, viewGroup, false), str, dVar);
        }
        com.ss.android.ugc.aweme.challenge.a.a createLiveChallengeDetailViewHolder = y.f70227a.createLiveChallengeDetailViewHolder();
        l.b(createLiveChallengeDetailViewHolder, "");
        return createLiveChallengeDetailViewHolder;
    }
}
