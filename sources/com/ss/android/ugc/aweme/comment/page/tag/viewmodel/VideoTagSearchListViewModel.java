package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class VideoTagSearchListViewModel extends AssemListViewModel<c, com.bytedance.ies.powerlist.b.a, Boolean> {
    public static final b o = new b((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public List<? extends IMUser> f72308k = z.INSTANCE;

    /* renamed from: l  reason: collision with root package name */
    public List<? extends com.bytedance.ies.powerlist.b.a> f72309l = z.INSTANCE;

    /* renamed from: m  reason: collision with root package name */
    public String f72310m = "";
    public final Set<String> n = new LinkedHashSet();
    private final i p = new i(true, new a(this, null));
    private final h q = h.i.a((h.f.a.a) g.f72313a);
    private final h r = h.i.a((h.f.a.a) d.f72312a);
    private final h s = h.i.a((h.f.a.a) c.f72311a);
    private int t;

    static {
        Covode.recordClassIndex(44591);
    }

    private final VideoTagPage.b k() {
        return (VideoTagPage.b) this.p.getValue();
    }

    private final HashSet<String> l() {
        return (HashSet) this.s.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(44593);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72311a = new c();

        static {
            Covode.recordClassIndex(44594);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    static final class d extends m implements h.f.a.a<IIMService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f72312a = new d();

        static {
            Covode.recordClassIndex(44595);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    static final class g extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f72313a = new g();

        static {
            Covode.recordClassIndex(44598);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new c(new p(z.INSTANCE, ""));
    }

    public static final class a extends m implements h.f.a.a<VideoTagPage.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(44592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b> r1 = com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel.a.invoke():java.lang.Object");
        }
    }

    public final VideoTagPage.b j() {
        VideoTagPage.b k2 = k();
        if (k2 == null) {
            return new VideoTagPage.b(null, null, 0, null, 15, null);
        }
        return k2;
    }

    static final class e extends m implements h.f.a.b<c, c> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(44596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            return c.a(cVar2, null, this.$newListState, 1);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Boolean>> dVar) {
        l().clear();
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<c, c> {
        final /* synthetic */ String $keyword$inlined;
        final /* synthetic */ List $result;
        final /* synthetic */ VideoTagSearchListViewModel this$0;

        static {
            Covode.recordClassIndex(44597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list, VideoTagSearchListViewModel videoTagSearchListViewModel, String str) {
            super(1);
            this.$result = list;
            this.this$0 = videoTagSearchListViewModel;
            this.$keyword$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            return c.a(cVar2, new p(this.$result, this.$keyword$inlined), null, 2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<com.bytedance.ies.powerlist.b.a> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new e(aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.powerlist.page.f<java.lang.Boolean> a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel.a(boolean):com.bytedance.ies.powerlist.page.f");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Boolean bool, h.c.d<? super com.bytedance.ies.powerlist.page.f<Boolean>> dVar) {
        bool.booleanValue();
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        l.b(lowerCase, "");
        if (h.m.p.e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    public final void a(String str, List<? extends IMUser> list) {
        List<IMUser> list2;
        l.d(str, "");
        l.d(list, "");
        this.f72310m = str;
        IIMService iIMService = (IIMService) this.r.getValue();
        if (iIMService == null || (list2 = iIMService.searchFollowIMUser(list, str)) == null) {
            list2 = z.INSTANCE;
        } else {
            Locale locale = Locale.getDefault();
            l.b(locale, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            l.b(lowerCase, "");
            for (T t2 : list) {
                String uniqueId = t2.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String nickName = t2.getNickName();
                    l.b(nickName, "");
                    if (a(nickName, lowerCase)) {
                        t2.setSearchType(1);
                        list2.add(t2);
                    }
                } else {
                    String uniqueId2 = t2.getUniqueId();
                    l.b(uniqueId2, "");
                    if (a(uniqueId2, lowerCase)) {
                        t2.setSearchType(1);
                        list2.add(t2);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t3 : list2) {
            if (hashSet.add(t3.getUid())) {
                arrayList.add(t3);
            }
        }
        this.f72308k = arrayList;
        a((h.f.a.b) new f(arrayList, this, str));
    }
}
