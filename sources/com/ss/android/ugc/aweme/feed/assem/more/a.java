package com.ss.android.ugc.aweme.feed.assem.more;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.lighten.a.h;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ i[] u = {new y(a.class, "videoMoreVM", "getVideoMoreVM()Lcom/ss/android/ugc/aweme/feed/assem/more/VideoMoreVM;", 0)};
    public static final c v = new c((byte) 0);
    private static final int x = ((int) n.b(h.f39857a, 10.0f));
    private final h.h.d w;
    private SparseArray y;

    public static final class b extends m implements h.f.a.b<b, b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58277);
        }

        public b() {
            super(1);
        }

        public final b invoke(b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t5;
    }

    public final VideoMoreVM F() {
        return (VideoMoreVM) this.w.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.y.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(58278);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$a  reason: collision with other inner class name */
    public static final class C2238a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2238a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static {
        Covode.recordClassIndex(58275);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoMoreVM.class);
        this.w = k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2238a(a2), k.b.f28699a, k.a(this), b.INSTANCE, null, null, k.b(this), k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        B().setOnClickListener(new d(this));
        Rect rect = new Rect();
        B().getHitRect(rect);
        int i2 = rect.top;
        int i3 = x;
        rect.top = i2 - i3;
        rect.left -= i3;
        rect.bottom += i3;
        rect.right += i3;
        s().setTouchDelegate(new TouchDelegate(rect, B()));
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92266a;

        static {
            Covode.recordClassIndex(58279);
        }

        d(a aVar) {
            this.f92266a = aVar;
        }

        public final void onClick(View view) {
            String uid;
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200)) {
                VideoItemParams videoItemParams = (VideoItemParams) this.f92266a.F().g();
                if (!(videoItemParams == null || (dataCenter = videoItemParams.dataCenter) == null)) {
                    dataCenter.a("video_more_click", (Object) null);
                }
                VideoMoreVM F = this.f92266a.F();
                VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                if (videoItemParams2 != null) {
                    if (com.ss.android.ugc.aweme.share.y.f124429b && com.ss.android.ugc.aweme.im.service.c.k.c()) {
                        Aweme aweme = videoItemParams2.mAweme;
                        l.b(aweme, "");
                        com.ss.android.ugc.aweme.share.y.c(aweme);
                    }
                    if (videoItemParams2.mEventType == null) {
                        videoItemParams2.setEventType("");
                    }
                    f fVar = (f) new f().a("homepage_hot").g(videoItemParams2.mAweme).d(ac.b(videoItemParams2.mAweme, videoItemParams2.mPageType));
                    Aweme aweme2 = videoItemParams2.mAweme;
                    l.b(aweme2, "");
                    if (aweme2.getAuthor() == null) {
                        uid = "";
                    } else {
                        Aweme aweme3 = videoItemParams2.mAweme;
                        l.b(aweme3, "");
                        User author = aweme3.getAuthor();
                        if (author == null) {
                            l.b();
                        }
                        uid = author.getUid();
                    }
                    fVar.f109569b = uid;
                    Aweme aweme4 = videoItemParams2.mAweme;
                    l.b(aweme4, "");
                    fVar.V = com.ss.android.ugc.aweme.story.b.h.a(aweme4.getAuthor());
                    fVar.u = Boolean.valueOf(com.ss.android.ugc.aweme.story.d.a.g(videoItemParams2.mAweme));
                    Aweme aweme5 = videoItemParams2.mAweme;
                    l.b(aweme5, "");
                    fVar.v = com.ss.android.ugc.aweme.story.d.a.b(aweme5);
                    fVar.f109570c = ((FeedBaseViewModel) F).o;
                    f fVar2 = (f) com.ss.android.ugc.aweme.upvote.event.c.a(fVar, videoItemParams2.mAweme, "homepage_hot");
                    String str = videoItemParams2.mEventType;
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1271119582) {
                            if (hashCode == 1691937916 && str.equals("homepage_hot")) {
                                fVar2.a("homepage_hot");
                                fVar2.f();
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                            }
                        } else if (str.equals("homepage_follow")) {
                            fVar2.a("homepage_follow");
                            fVar2.f();
                            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                        }
                    }
                    if (videoItemParams2.mAwemeFromPage == 2) {
                        fVar2.a(videoItemParams2.mEventType);
                    }
                    fVar2.f();
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                }
            }
        }
    }
}
