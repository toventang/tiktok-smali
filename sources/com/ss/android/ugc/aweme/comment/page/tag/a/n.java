package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class n extends com.bytedance.assem.arch.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final d f72196l = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public View f72197j;

    /* renamed from: k  reason: collision with root package name */
    TuxButton f72198k;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72199m;
    private final com.bytedance.assem.arch.extensions.i n;
    private final h.h o;
    private String p;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44467);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44465);
    }

    public final VideoTagFriendsListViewModel u() {
        return (VideoTagFriendsListViewModel) this.f72199m.getValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(44469);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.n$n  reason: collision with other inner class name */
    static final class C1623n extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1623n(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<VideoTagPage.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(44468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b> r1 = com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.a.n.c.invoke():java.lang.Object");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.this$0.v().getTagged().isEmpty());
        }
    }

    public final VideoTagPage.b v() {
        VideoTagPage.b bVar = (VideoTagPage.b) this.n.getValue();
        if (bVar == null) {
            return new VideoTagPage.b(null, null, 0, null, 15, null);
        }
        return bVar;
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f72202a;

        static {
            Covode.recordClassIndex(44479);
        }

        m(n nVar) {
            this.f72202a = nVar;
        }

        public final void run() {
            int i2;
            View view = this.f72202a.f72197j;
            if (view == null) {
                h.f.b.l.a("widget");
            }
            if (this.f72202a.u().i().size() > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        VideoTagFriendsListViewModel u = u();
        String str = this.p;
        h.f.b.l.d(str, "");
        r.a("close_tag_mention_page", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", u.g().getEnterFrom()).a("close_type", str).a("tag_num", u.i().size()).a("function", "tag").f66730a);
        super.p();
    }

    public n() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        C1623n nVar = new C1623n(this);
        h.k.c a2 = ab.a(VideoTagFriendsListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), nVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), nVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), nVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f72199m = bVar;
        this.n = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
        this.o = h.i.a((h.f.a.a) new e(this));
        this.p = "click_close";
    }

    public final void x() {
        this.p = "click_done";
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            VideoTagFriendsListViewModel u = u();
            Intent intent = new Intent();
            boolean z = false;
            if (u.i().size() != u.g().getTagged().size()) {
                z = true;
            }
            List<IMUser> k2 = h.a.n.k(u.i());
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) k2, 10));
            for (IMUser iMUser : k2) {
                if (!z && !u.g().getTagged().contains(iMUser)) {
                    z = true;
                }
                arrayList.add(IMUser.toInteractionTagUserInfo(iMUser));
            }
            ArrayList arrayList2 = arrayList;
            if (z) {
                Aweme aweme = u.g().getAweme();
                if (aweme != null) {
                    InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
                    if (interactionTagInfo != null) {
                        interactionTagInfo.setTaggedUsers(arrayList2);
                    } else {
                        aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", arrayList2));
                    }
                    new InteractionTagInfoEvent(aweme).post();
                }
                intent.putExtra("tagged_user_list", new ArrayList(arrayList2));
                intent.putExtra("need_update", z);
            }
            b2.setResult(-1, intent);
            b2.finish();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f72201a);
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        TuxButton tuxButton = this.f72198k;
        if (tuxButton == null) {
            h.f.b.l.a("button");
        }
        tuxButton.setLoading(z);
        u().f72287k = z;
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a((Object) this.this$0.v().getEnterFrom(), (Object) "video_post_page")) {
                this.this$0.u().l();
            } else {
                this.this$0.x();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        VideoTagFriendsListViewModel u;
        h.f.b.l.d(view, "");
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            com.bytedance.assem.arch.extensions.d.a(this, new g(this));
            LinearLayout linearLayout = (LinearLayout) s().findViewById(R.id.w1);
            h.f.b.l.b(linearLayout, "");
            this.f72197j = linearLayout;
            TuxButton tuxButton = (TuxButton) s().findViewById(R.id.aoj);
            tuxButton.setOnClickListener(new f(this));
            h.f.b.l.b(tuxButton, "");
            this.f72198k = tuxButton;
            if (w()) {
                View view2 = this.f72197j;
                if (view2 == null) {
                    h.f.b.l.a("widget");
                }
                view2.setVisibility(0);
            }
            a(u, com.bytedance.assem.arch.viewModel.l.a(u().f25686c), null, new h(this));
            f.a.a(this, u(), p.f72204a, (com.bytedance.assem.arch.viewModel.k) null, new i(this, b2), 6);
            f.a.a(this, u(), q.f72205a, (com.bytedance.assem.arch.viewModel.k) null, new j(this, b2), 6);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f72200a;

        static {
            Covode.recordClassIndex(44471);
        }

        f(n nVar) {
            this.f72200a = nVar;
        }

        public final void onClick(View view) {
            long j2;
            String aid;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 500)) {
                n nVar = this.f72200a;
                if (!nVar.u().f72287k) {
                    nVar.a(true);
                    VideoTagFriendsListViewModel u = nVar.u();
                    if (u.i().isEmpty()) {
                        u.a(VideoTagFriendsListViewModel.i.f72293a);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (u.g().getTagged().isEmpty()) {
                        Iterator<T> it = u.i().iterator();
                        while (it.hasNext()) {
                            String uid = it.next().getUid();
                            h.f.b.l.b(uid, "");
                            arrayList.add(uid);
                        }
                    } else {
                        for (T t : u.i()) {
                            if (!u.g().getTagged().contains(t) && !TextUtils.isEmpty(t.getUid())) {
                                String uid2 = t.getUid();
                                h.f.b.l.b(uid2, "");
                                arrayList.add(uid2);
                            }
                        }
                    }
                    boolean a2 = true ^ h.f.b.l.a((Object) u.g().getEnterFrom(), (Object) "video_post_page");
                    if (com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                        u.a(new VideoTagFriendsListViewModel.j(a2));
                        return;
                    }
                    com.ss.android.ugc.aweme.comment.page.tag.api.g a3 = u.p.a();
                    String obj = arrayList.toString();
                    String str = "[" + com.ss.android.ugc.aweme.comment.page.tag.api.f.VIDEO_TAG.getType() + ']';
                    Aweme aweme = u.g().getAweme();
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        j2 = 0;
                    } else {
                        j2 = Long.parseLong(aid);
                    }
                    f.a.b.b a4 = a3.a(obj, str, a2, j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new VideoTagFriendsListViewModel.k(u, a2), new VideoTagFriendsListViewModel.l(u));
                    h.f.b.l.b(a4, "");
                    u.a(a4);
                }
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(n nVar, androidx.fragment.app.e eVar) {
            super(2);
            this.this$0 = nVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends String> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || !(!TextUtils.isEmpty(t)))) {
                this.this$0.a(false);
                new com.bytedance.tux.g.b(this.$activity).a(t).b();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<p, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            String string;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(dVar, "");
            n nVar = this.this$0;
            if (!nVar.w()) {
                View view = nVar.f72197j;
                if (view == null) {
                    h.f.b.l.a("widget");
                }
                view.postDelayed(new m(nVar), 50);
            }
            TuxButton tuxButton = nVar.f72198k;
            if (tuxButton == null) {
                h.f.b.l.a("button");
            }
            if (!tuxButton.f44736a) {
                TuxButton tuxButton2 = nVar.f72198k;
                if (tuxButton2 == null) {
                    h.f.b.l.a("button");
                }
                if (nVar.u().i().size() > 0) {
                    Context context = nVar.s().getContext();
                    h.f.b.l.b(context, "");
                    String string2 = context.getResources().getString(R.string.c8q, Integer.valueOf(nVar.u().i().size()));
                    h.f.b.l.b(string2, "");
                    string = com.a.a(string2, Arrays.copyOf(new Object[0], 0));
                    h.f.b.l.b(string, "");
                } else {
                    Context context2 = nVar.s().getContext();
                    h.f.b.l.b(context2, "");
                    string = context2.getResources().getString(R.string.gc8);
                }
                tuxButton2.setText(string);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.b>, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(44475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(n nVar, androidx.fragment.app.e eVar) {
            super(2);
            this.this$0 = nVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.b> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.b> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                int i2 = o.f72203a[t.ordinal()];
                if (i2 == 1) {
                    this.this$0.a(true);
                    this.this$0.u().l();
                } else if (i2 == 2) {
                    n nVar = this.this$0;
                    Context ar_ = nVar.ar_();
                    if (ar_ != null) {
                        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(ar_);
                        bVar.c(R.string.gc9, new k(nVar));
                        bVar.b(R.string.gc7, new l(nVar));
                        ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(ar_).a(R.string.gca).b(R.string.gc_)).a(bVar).a(false)).a().b().show();
                    }
                } else if (i2 == 3) {
                    this.this$0.x();
                } else if (i2 == 4 || i2 == 5) {
                    this.this$0.a(false);
                    new com.bytedance.tux.g.b(this.$activity).e(R.string.gcc).b();
                }
            }
            return z.f158842a;
        }
    }
}
