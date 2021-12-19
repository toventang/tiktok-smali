package com.ss.android.ugc.aweme.feed.assem.b;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.g;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class b extends com.ss.android.ugc.aweme.feed.assem.base.a<b> {
    public com.ss.android.ugc.aweme.upvote.a.a u;
    private final i v = new i(bQ_(), new a(this, null));
    private final h w = new g(ab.a(VideoViewModel.class), this, c.INSTANCE, d.INSTANCE, C2225b.INSTANCE);
    private SparseArray x;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$b  reason: collision with other inner class name */
    public static final class C2225b extends m implements h.f.a.b<ck, ck> {
        public static final C2225b INSTANCE = new C2225b();

        static {
            Covode.recordClassIndex(58035);
        }

        public C2225b() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58033);
    }

    private final a F() {
        return (a) this.v.getValue();
    }

    private final VideoViewModel H() {
        return (VideoViewModel) this.w.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.x == null) {
            this.x = new SparseArray();
        }
        View view = (View) this.x.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.x.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class c extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58036);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58037);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return com.ss.android.ugc.aweme.upvote.service.a.f142308a.a();
    }

    public static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(58034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.assem.b.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.feed.assem.b.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.feed.assem.b.a> r1 = com.ss.android.ugc.aweme.feed.assem.b.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.b.b.a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        View s = s();
        if (!(s instanceof FrameLayout)) {
            s = null;
        }
        FrameLayout frameLayout = (FrameLayout) s;
        if (frameLayout != null) {
            this.u = com.ss.android.ugc.aweme.upvote.service.a.f142308a.a(frameLayout, this);
            f.a.a(this, H(), c.f92065a, (k) null, e.f92063a, 6);
            f.a.a(this, H(), d.f92066a, (k) null, f.f92064a, 6);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        boolean z;
        String str5;
        String aid;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str6 = "";
        l.d(videoItemParams2, str6);
        com.ss.android.ugc.aweme.upvote.a.a aVar = this.u;
        if (aVar != null) {
            String str7 = videoItemParams2.mEventType;
            l.b(str7, str6);
            Aweme aweme = videoItemParams2.mAweme;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = str6;
            }
            Aweme aweme2 = videoItemParams2.mAweme;
            if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                str2 = str6;
            }
            Aweme aweme3 = videoItemParams2.mAweme;
            if (aweme3 == null || (str3 = aweme3.getRequestId()) == null) {
                str3 = str6;
            }
            Aweme aweme4 = videoItemParams2.mAweme;
            String str8 = null;
            if (aweme4 != null) {
                user = aweme4.getAuthor();
            } else {
                user = null;
            }
            com.ss.android.ugc.aweme.upvote.event.b bVar = new com.ss.android.ugc.aweme.upvote.event.b(str7, str, str2, str3, String.valueOf(com.ss.android.ugc.aweme.story.b.h.a(user)));
            a F = F();
            if (F != null) {
                str4 = F.f92062a;
            } else {
                str4 = null;
            }
            boolean z2 = false;
            if (str4 != null) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.upvote.service.a aVar2 = com.ss.android.ugc.aweme.upvote.service.a.f142308a;
            Aweme aweme5 = videoItemParams2.mAweme;
            if (!(aweme5 == null || (aid = aweme5.getAid()) == null)) {
                str6 = aid;
            }
            Integer b2 = aVar2.b(str6);
            if (b2 != null && b2.intValue() == 0) {
                z2 = true;
            }
            if (z) {
                Aweme aweme6 = videoItemParams2.mAweme;
                if (aweme6 != null) {
                    str5 = aweme6.getAid();
                } else {
                    str5 = null;
                }
                aVar.a(str5, z2, bVar);
                if (z2) {
                    a F2 = F();
                    if (F2 != null) {
                        str8 = F2.f92062a;
                    }
                    aVar.a(str8);
                    return;
                }
                return;
            }
            Aweme aweme7 = videoItemParams2.mAweme;
            if (aweme7 != null) {
                str8 = aweme7.getAid();
            }
            aVar.a(str8, true, bVar);
        }
    }

    static final class e extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f92063a = new e();

        static {
            Covode.recordClassIndex(58038);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.ss.android.ugc.aweme.upvote.a.a aVar2;
            b bVar2 = bVar;
            l.d(bVar2, "");
            if (!(aVar == null || (aVar2 = bVar2.u) == null)) {
                aVar2.a(true);
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f92064a = new f();

        static {
            Covode.recordClassIndex(58039);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            com.ss.android.ugc.aweme.upvote.a.a aVar2;
            b bVar2 = bVar;
            l.d(bVar2, "");
            if (!(aVar == null || (aVar2 = bVar2.u) == null)) {
                aVar2.a(false);
            }
            return z.f158842a;
        }
    }
}
