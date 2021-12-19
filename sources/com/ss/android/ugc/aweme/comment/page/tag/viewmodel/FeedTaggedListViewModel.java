package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.page.tag.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.LinkedHashSet;
import java.util.Set;

public final class FeedTaggedListViewModel extends AssemViewModel<f> {

    /* renamed from: j  reason: collision with root package name */
    public final Set<String> f72275j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public boolean f72276k;

    /* renamed from: l  reason: collision with root package name */
    private final i f72277l = new i(true, new a(this, null));

    /* renamed from: m  reason: collision with root package name */
    private final h f72278m = h.i.a((h.f.a.a) c.f72280a);

    static {
        Covode.recordClassIndex(44555);
    }

    public final d.C1624d g() {
        return (d.C1624d) this.f72277l.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f72278m.getValue()).booleanValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ f f() {
        return new f();
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72280a = new c();

        static {
            Covode.recordClassIndex(44558);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.language.d.c());
        }
    }

    public static final class a extends m implements h.f.a.a<d.C1624d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyData;

        static {
            Covode.recordClassIndex(44556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyData = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.comment.page.tag.d$d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.page.tag.d.C1624d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r0 = r0.f25687d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 != 0) goto L_0x000f
                h.f.b.l.a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.d$d> r1 = com.ss.android.ugc.aweme.comment.page.tag.d.C1624d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyData
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel.a.invoke():java.lang.Object");
        }
    }

    public static final class b extends m implements h.f.a.b<f, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72279a = new b();

        static {
            Covode.recordClassIndex(44557);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            return new f(fVar2.f72327a, new com.bytedance.assem.arch.extensions.a(e.EDIT_CLICK));
        }
    }

    public final void a(String str, String str2) {
        String str3;
        String authorUid;
        String str4 = "";
        l.d(str, str4);
        l.d(str2, str4);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", str);
        Aweme aweme = g().f72245a;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = str4;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
        Aweme aweme2 = g().f72245a;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        r.a("click_tagged_user", a3.a("author_id", str4).a("enter_from", g().f72247c).a("click_type", str2).a("anchor_type", g().f72248d).f66730a);
    }
}
