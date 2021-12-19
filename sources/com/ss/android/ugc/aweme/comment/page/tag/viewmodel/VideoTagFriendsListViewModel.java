package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import h.a.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

public final class VideoTagFriendsListViewModel extends AssemViewModel<d> {
    public static final b q = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final IMUser f72286j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f72287k;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f72288l;

    /* renamed from: m  reason: collision with root package name */
    public final HashMap<Integer, Set<String>> f72289m;
    public a n;
    public final Set<String> o;
    public final com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.comment.page.tag.api.g> p;
    private final com.bytedance.assem.arch.extensions.i r = new com.bytedance.assem.arch.extensions.i(true, new a(this, null));
    private final h.h s = h.i.a((h.f.a.a) new m(this));
    private final h.h t = h.i.a((h.f.a.a) new q(this));
    private final h.h u;
    private final h.h v;
    private final h.h w;

    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final o f72300a = new o();

        static {
            Covode.recordClassIndex(44581);
        }

        o() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(44562);
    }

    private final VideoTagPage.b n() {
        return (VideoTagPage.b) this.r.getValue();
    }

    private boolean o() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final int h() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final LinkedHashSet<IMUser> i() {
        return (LinkedHashSet) this.t.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final IIMService k() {
        return (IIMService) this.w.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(44564);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<IIMService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72290a = new c();

        static {
            Covode.recordClassIndex(44565);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ d f() {
        return new d();
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ VideoTagFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(44566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.this$0 = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.f72286j.isSecret());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f72291a = new e();

        static {
            Covode.recordClassIndex(44567);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.language.d.c());
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ VideoTagFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(44579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.this$0 = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.g().getPermission());
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<LinkedHashSet<IMUser>> {
        final /* synthetic */ VideoTagFriendsListViewModel this$0;

        static {
            Covode.recordClassIndex(44585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.this$0 = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedHashSet<IMUser> invoke() {
            return new LinkedHashSet(this.this$0.g().getTagged());
        }
    }

    public final boolean m() {
        if (i().size() >= 15) {
            return true;
        }
        return false;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<VideoTagPage.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(44563);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel.a.invoke():java.lang.Object");
        }
    }

    public final VideoTagPage.b g() {
        VideoTagPage.b n2 = n();
        if (n2 == null) {
            return new VideoTagPage.b(null, null, 0, null, 15, null);
        }
        return n2;
    }

    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72292a;

        static {
            Covode.recordClassIndex(44568);
        }

        public f(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72292a = videoTagFriendsListViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public a call() {
            Iterable<IMUser> iterable;
            IIMService k2;
            List<IMUser> recentIMUsers;
            long j2;
            List<IMUser> allFollowIMUsers;
            IIMService k3 = this.f72292a.k();
            if (k3 == null || (allFollowIMUsers = k3.getAllFollowIMUsers()) == null) {
                iterable = z.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t : allFollowIMUsers) {
                    if (!h.f.b.l.a((Object) t.getUid(), (Object) this.f72292a.f72286j.getUid())) {
                        arrayList.add(t);
                    }
                }
                iterable = h.a.n.g((Collection) arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                T t2 = VideoTagApi.a.a().mentionRecentContactQuery(com.ss.android.ugc.aweme.comment.page.tag.api.f.VIDEO_TAG.getType(), 0, false).execute().f42630b;
                h.f.b.l.b(t2, "");
                T t3 = t2;
                HashMap hashMap = new HashMap();
                ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.c> arrayList3 = t3.f72231b;
                if (arrayList3 != null) {
                    for (T t4 : arrayList3) {
                        ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.d> tagUpdateStatus = t4.getTagUpdateStatus();
                        if (tagUpdateStatus != null) {
                            for (T t5 : tagUpdateStatus) {
                                if (t5.getMentionType() == com.ss.android.ugc.aweme.comment.page.tag.api.f.VIDEO_TAG.getType()) {
                                    hashMap.put(String.valueOf(t4.getUid()), Long.valueOf((long) t5.getBlockType()));
                                }
                            }
                        }
                    }
                }
                ArrayList<User> arrayList4 = t3.f72230a;
                if (arrayList4 != null) {
                    for (T t6 : arrayList4) {
                        if (arrayList2.size() < 10) {
                            IMUser fromUser = IMUser.fromUser(t6);
                            Long l2 = (Long) hashMap.get(fromUser.getUid());
                            if (l2 != null) {
                                j2 = l2.longValue();
                            } else {
                                j2 = 0;
                            }
                            fromUser.setVideoTagBlockStatus(j2);
                            h.f.b.l.b(fromUser, "");
                            arrayList2.add(fromUser);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!(arrayList2.size() >= 10 || (k2 = this.f72292a.k()) == null || (recentIMUsers = k2.getRecentIMUsers()) == null)) {
                for (T t7 : recentIMUsers) {
                    if (arrayList2.size() < 10 && !arrayList2.contains(t7) && (!h.f.b.l.a((Object) t7.getUid(), (Object) this.f72292a.f72286j.getUid()))) {
                        arrayList2.add(t7);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (IMUser iMUser : iterable) {
                if (!arrayList2.contains(iMUser)) {
                    if (iMUser.getFollowStatus() == 2) {
                        arrayList5.add(iMUser);
                    } else {
                        arrayList6.add(iMUser);
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            arrayList7.addAll(arrayList2);
            arrayList7.addAll(arrayList5);
            arrayList7.addAll(arrayList6);
            this.f72292a.n = new a(arrayList2, arrayList5, arrayList6, arrayList7);
            return this.f72292a.n;
        }
    }

    public final void l() {
        long j2;
        String aid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (com.bytedance.common.utility.collection.b.a((Collection) g().getTagged())) {
            for (T t2 : i()) {
                if (!TextUtils.isEmpty(t2.getUid())) {
                    String uid = t2.getUid();
                    h.f.b.l.b(uid, "");
                    arrayList.add(uid);
                }
            }
        } else if (com.bytedance.common.utility.collection.b.a((Collection) i())) {
            for (T t3 : g().getTagged()) {
                if (!TextUtils.isEmpty(t3.getUid())) {
                    String uid2 = t3.getUid();
                    h.f.b.l.b(uid2, "");
                    arrayList2.add(uid2);
                }
            }
        } else {
            for (T t4 : g().getTagged()) {
                if (!i().contains(t4)) {
                    String uid3 = t4.getUid();
                    h.f.b.l.b(uid3, "");
                    arrayList2.add(uid3);
                }
            }
            for (T t5 : i()) {
                if (!g().getTagged().contains(t5)) {
                    String uid4 = t5.getUid();
                    h.f.b.l.b(uid4, "");
                    arrayList.add(uid4);
                }
            }
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList) || !com.bytedance.common.utility.collection.b.a((Collection) arrayList2)) {
            com.ss.android.ugc.aweme.comment.page.tag.api.g a2 = this.p.a();
            String obj = arrayList.toString();
            String obj2 = arrayList2.toString();
            Aweme aweme = g().getAweme();
            if (aweme == null || (aid = aweme.getAid()) == null) {
                j2 = 0;
            } else {
                j2 = Long.parseLong(aid);
            }
            a2.a(obj, obj2, j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new s(this), new t(this));
            return;
        }
        a(r.f72303a);
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72297a;

        static {
            Covode.recordClassIndex(44577);
        }

        public l(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72297a = videoTagFriendsListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f72297a.a(AnonymousClass1.f72298a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72304a;

        static {
            Covode.recordClassIndex(44587);
        }

        s(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72304a = videoTagFriendsListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f72304a.a(AnonymousClass1.f72305a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72306a;

        static {
            Covode.recordClassIndex(44589);
        }

        t(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72306a = videoTagFriendsListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f72306a.a(AnonymousClass1.f72307a);
        }
    }

    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f72295b;

        static {
            Covode.recordClassIndex(44573);
        }

        public k(VideoTagFriendsListViewModel videoTagFriendsListViewModel, boolean z) {
            this.f72294a = videoTagFriendsListViewModel;
            this.f72295b = z;
        }

        static final class b extends h.f.b.m implements h.f.a.b<d, d> {
            final /* synthetic */ String $toastStr;

            static {
                Covode.recordClassIndex(44575);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.$toastStr = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ d invoke(d dVar) {
                d dVar2 = dVar;
                h.f.b.l.d(dVar2, "");
                return d.a(dVar2, null, null, null, null, new com.bytedance.assem.arch.extensions.a(this.$toastStr), 15);
            }
        }

        static final class c extends h.f.b.m implements h.f.a.b<d, d> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f72296a = new c();

            static {
                Covode.recordClassIndex(44576);
            }

            c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ d invoke(d dVar) {
                d dVar2 = dVar;
                h.f.b.l.d(dVar2, "");
                return d.a(dVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(b.CHECK_FAILED), null, 23);
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<d, d> {
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(44574);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.this$0 = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ d invoke(d dVar) {
                b bVar;
                d dVar2 = dVar;
                h.f.b.l.d(dVar2, "");
                if (this.this$0.f72295b) {
                    bVar = b.CHECK_SUCCEED;
                } else {
                    bVar = b.DONE_SUCCEED;
                }
                return d.a(dVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(bVar), null, 23);
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.comment.page.tag.api.d dVar;
            this.f72294a.f72287k = false;
            ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.c> arrayList = ((com.ss.android.ugc.aweme.comment.page.tag.api.b) obj).f72229a;
            if (arrayList == null || !(!com.bytedance.common.utility.collection.b.a((Collection) arrayList))) {
                this.f72294a.a(c.f72296a);
                return;
            }
            VideoTagFriendsListViewModel videoTagFriendsListViewModel = this.f72294a;
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_RELATION.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.PRIVACY_SETTING.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.PASS.getType()), new LinkedHashSet());
            for (T t : arrayList) {
                ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.d> tagUpdateStatus = t.getTagUpdateStatus();
                if (!(tagUpdateStatus == null || (dVar = tagUpdateStatus.get(0)) == null)) {
                    int blockType = dVar.getBlockType();
                    Set set = (Set) hashMap.get(Integer.valueOf(blockType));
                    if (set != null) {
                        set.add(String.valueOf(t.getUid()));
                    }
                    Set<String> set2 = videoTagFriendsListViewModel.f72289m.get(Integer.valueOf(blockType));
                    if (set2 != null) {
                        set2.add(String.valueOf(t.getUid()));
                    }
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet<T> linkedHashSet2 = new LinkedHashSet();
            Set set3 = (Set) hashMap.get(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_SELF_REMOVAL.getType()));
            if (set3 != null) {
                for (T t2 : set3) {
                    LinkedHashSet<IMUser> i2 = videoTagFriendsListViewModel.i();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t3 : i2) {
                        if (h.f.b.l.a((Object) t3.getUid(), (Object) t2)) {
                            arrayList2.add(t3);
                        }
                    }
                    for (T t4 : arrayList2) {
                        linkedHashSet.add(videoTagFriendsListViewModel.a((IMUser) t4));
                        linkedHashSet2.add(t4);
                    }
                }
            }
            Set set4 = (Set) hashMap.get(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_RELATION.getType()));
            String str = "";
            if (set4 != null) {
                for (T t5 : set4) {
                    LinkedHashSet<IMUser> i3 = videoTagFriendsListViewModel.i();
                    ArrayList arrayList3 = new ArrayList();
                    for (T t6 : i3) {
                        if (h.f.b.l.a((Object) t6.getUid(), (Object) t5)) {
                            arrayList3.add(t6);
                        }
                    }
                    for (T t7 : arrayList3) {
                        linkedHashSet.add(videoTagFriendsListViewModel.a((IMUser) t7));
                        h.f.b.l.d(t7, str);
                        videoTagFriendsListViewModel.i().remove(t7);
                        videoTagFriendsListViewModel.a(new g(t7));
                    }
                }
            }
            Set set5 = (Set) hashMap.get(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.PRIVACY_SETTING.getType()));
            if (set5 != null) {
                for (T t8 : set5) {
                    LinkedHashSet<IMUser> i4 = videoTagFriendsListViewModel.i();
                    ArrayList arrayList4 = new ArrayList();
                    for (T t9 : i4) {
                        if (h.f.b.l.a((Object) t9.getUid(), (Object) t8)) {
                            arrayList4.add(t9);
                        }
                    }
                    for (T t10 : arrayList4) {
                        linkedHashSet.add(videoTagFriendsListViewModel.a((IMUser) t10));
                        linkedHashSet2.add(t10);
                    }
                }
            }
            for (T t11 : linkedHashSet2) {
                videoTagFriendsListViewModel.a((IMUser) t11, false);
            }
            if (linkedHashSet.size() > 0) {
                String obj2 = linkedHashSet.toString();
                if (obj2.length() >= 2) {
                    String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.gci);
                    h.f.b.l.b(string, str);
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj2.substring(1, obj2.length() - 1);
                    h.f.b.l.b(substring, str);
                    String a2 = com.a.a(string, Arrays.copyOf(new Object[]{substring}, 1));
                    h.f.b.l.b(a2, str);
                    str = a2;
                }
            }
            if (TextUtils.isEmpty(str)) {
                VideoTagFriendsListViewModel.a(0);
                this.f72294a.a(new a(this));
                return;
            }
            VideoTagFriendsListViewModel.a(1);
            this.f72294a.a(new b(str));
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ IMUser $imUser;

        static {
            Covode.recordClassIndex(44569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(IMUser iMUser) {
            super(1);
            this.$imUser = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, new com.bytedance.assem.arch.extensions.a(this.$imUser), null, null, 27);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ IMUser $imUser;

        static {
            Covode.recordClassIndex(44570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(IMUser iMUser) {
            super(1);
            this.$imUser = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, new com.bytedance.assem.arch.extensions.a(this.$imUser), null, null, null, 29);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f72293a = new i();

        static {
            Covode.recordClassIndex(44571);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(b.CHECK_SKIPPED), null, 23);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<d, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f72303a = new r();

        static {
            Covode.recordClassIndex(44586);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            return d.a(dVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(b.DONE_SUCCEED), null, 23);
        }
    }

    public static void a(int i2) {
        com.ss.android.ugc.aweme.common.r.a("tag_block_check_result", new com.ss.android.ugc.aweme.app.f.d().a("has_blocked_account", i2).f66730a);
    }

    public final String b(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        if (o()) {
            String uniqueId = iMUser.getUniqueId();
            h.f.b.l.b(uniqueId, "");
            return uniqueId;
        }
        String nickName = iMUser.getNickName();
        h.f.b.l.b(nickName, "");
        return nickName;
    }

    public final boolean c(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        if (i().size() == 0 || !i().contains(iMUser)) {
            return false;
        }
        return true;
    }

    public static final class j extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ boolean $isCheckAweme;

        static {
            Covode.recordClassIndex(44572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(boolean z) {
            super(1);
            this.$isCheckAweme = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            b bVar;
            d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            if (this.$isCheckAweme) {
                bVar = b.CHECK_SUCCEED;
            } else {
                bVar = b.DONE_SUCCEED;
            }
            return d.a(dVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(bVar), null, 23);
        }
    }

    public static final class p<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72301a;

        static {
            Covode.recordClassIndex(44582);
        }

        public p(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72301a = videoTagFriendsListViewModel;
        }

        @Override // b.g
        public final /* synthetic */ Object then(final b.i iVar) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            h.f.b.l.b(iVar, "");
            if (!iVar.b() && !iVar.c()) {
                h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    this.f72301a.a(new h.f.a.b<d, d>() {
                        /* class com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel.p.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(44584);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ d invoke(d dVar) {
                            d dVar2 = dVar;
                            h.f.b.l.d(dVar2, "");
                            b.i iVar = iVar;
                            h.f.b.l.b(iVar, "");
                            return d.a(dVar2, new com.bytedance.assem.arch.extensions.a(iVar.d()), null, null, null, null, 30);
                        }
                    });
                    return null;
                }
            }
            this.f72301a.a(AnonymousClass1.f72302a);
            return null;
        }
    }

    public final String a(IMUser iMUser) {
        h.f.b.l.d(iMUser, "");
        if (o()) {
            String nickName = iMUser.getNickName();
            h.f.b.l.b(nickName, "");
            return nickName;
        }
        String uniqueId = iMUser.getUniqueId();
        h.f.b.l.b(uniqueId, "");
        return uniqueId;
    }

    public final String d(IMUser iMUser) {
        List<IMUser> list;
        List<IMUser> list2;
        a aVar = this.n;
        List<IMUser> list3 = null;
        if (aVar != null) {
            list = aVar.f72314a;
        } else {
            list = null;
        }
        if (list.contains(iMUser)) {
            return "recent";
        }
        a aVar2 = this.n;
        if (aVar2 != null) {
            list2 = aVar2.f72315b;
        } else {
            list2 = null;
        }
        if (list2.contains(iMUser)) {
            return "friends";
        }
        a aVar3 = this.n;
        if (aVar3 != null) {
            list3 = aVar3.f72316c;
        }
        if (list3.contains(iMUser)) {
            return "following";
        }
        return "";
    }

    public static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoTagFriendsListViewModel f72299a;

        static {
            Covode.recordClassIndex(44580);
        }

        public n(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f72299a = videoTagFriendsListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.c> arrayList = ((com.ss.android.ugc.aweme.comment.page.tag.api.b) obj).f72229a;
            if (arrayList != null) {
                for (T t : arrayList) {
                    ArrayList<com.ss.android.ugc.aweme.comment.page.tag.api.d> tagUpdateStatus = t.getTagUpdateStatus();
                    if (tagUpdateStatus != null) {
                        for (T t2 : tagUpdateStatus) {
                            if (t2.getMentionType() == com.ss.android.ugc.aweme.comment.page.tag.api.f.VIDEO_TAG.getType() && t2.getBlockType() == com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_SELF_REMOVAL.getType()) {
                                this.f72299a.f72288l.add(String.valueOf(t.getUid()));
                            }
                        }
                    }
                }
            }
        }
    }

    public VideoTagFriendsListViewModel(com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.comment.page.tag.api.g> aVar) {
        h.f.b.l.d(aVar, "");
        this.p = aVar;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        IMUser fromUser = IMUser.fromUser(createIUserServicebyMonsterPlugin.getCurrentUser());
        h.f.b.l.b(fromUser, "");
        this.f72286j = fromUser;
        this.u = h.i.a((h.f.a.a) new d(this));
        this.v = h.i.a((h.f.a.a) e.f72291a);
        this.w = h.i.a((h.f.a.a) c.f72290a);
        this.f72288l = new ArrayList();
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.BLOCK_RELATION.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.PRIVACY_SETTING.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(com.ss.android.ugc.aweme.comment.page.tag.api.a.PASS.getType()), new LinkedHashSet());
        this.f72289m = hashMap;
        this.n = new a(z.INSTANCE, z.INSTANCE, z.INSTANCE, z.INSTANCE);
        this.o = new LinkedHashSet();
    }

    public final void a(IMUser iMUser, String str) {
        h.f.b.l.d(iMUser, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("tag_mention_head_click", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", g().getEnterFrom()).a("to_user_id", iMUser.getUid()).a("click_type", str).a("user_type", d(iMUser)).a("search_keyword", "").a("function", "tag").f66730a);
    }

    public final void a(IMUser iMUser, boolean z) {
        h.f.b.l.d(iMUser, "");
        if (!this.f72287k && z != i().contains(iMUser)) {
            if (z) {
                i().add(iMUser);
            } else {
                i().remove(iMUser);
            }
            a(new h(iMUser));
        }
    }
}
