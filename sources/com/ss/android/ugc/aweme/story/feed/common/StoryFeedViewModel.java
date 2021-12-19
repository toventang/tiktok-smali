package com.ss.android.ugc.aweme.story.feed.common;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class StoryFeedViewModel extends DataCenter implements com.ss.android.ugc.aweme.story.base.d {

    /* renamed from: g  reason: collision with root package name */
    public static final b f137597g = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Aweme> f137598c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, List<q>> f137599d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final p f137600e;

    /* renamed from: f  reason: collision with root package name */
    boolean f137601f;

    /* renamed from: h  reason: collision with root package name */
    private final String f137602h;

    /* renamed from: i  reason: collision with root package name */
    private final String f137603i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f137604j = h.i.a((h.f.a.a) e.f137609a);

    /* renamed from: k  reason: collision with root package name */
    private final f.a.b.a f137605k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    private final m f137606l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.param.b f137607m;

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f137620a = new l();

        static {
            Covode.recordClassIndex(90046);
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(90032);
    }

    public final ValueAnimator a() {
        return (ValueAnimator) this.f137604j.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(90034);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryFeedViewModel f137618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137619b;

        static {
            Covode.recordClassIndex(90043);
        }

        public k(StoryFeedViewModel storyFeedViewModel, String str) {
            this.f137618a = storyFeedViewModel;
            this.f137619b = str;
        }

        static final class b extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ Aweme $aweme$inlined;
            final /* synthetic */ UserStory $it;
            final /* synthetic */ Aweme $mine$inlined;
            final /* synthetic */ List $this_subscribeUserStoryChanged$inlined;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(90045);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(UserStory userStory, Aweme aweme, List list, Aweme aweme2, k kVar) {
                super(0);
                this.$it = userStory;
                this.$mine$inlined = aweme;
                this.$this_subscribeUserStoryChanged$inlined = list;
                this.$aweme$inlined = aweme2;
                this.this$0 = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f137618a.a("ON_CURRENT_INFO_CHANGED", (Object) this.$it);
                return z.f158842a;
            }
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ Aweme $aweme$inlined;
            final /* synthetic */ UserStory $it;
            final /* synthetic */ Aweme $mine$inlined;
            final /* synthetic */ List $this_subscribeUserStoryChanged$inlined;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(90044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(UserStory userStory, Aweme aweme, List list, Aweme aweme2, k kVar) {
                super(0);
                this.$it = userStory;
                this.$mine$inlined = aweme;
                this.$this_subscribeUserStoryChanged$inlined = list;
                this.$aweme$inlined = aweme2;
                this.this$0 = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f137618a.e(this.this$0.f137619b);
                this.this$0.f137618a.a("LOAD_USER_STORY_SUCCESS", (Object) this.$it);
                return z.f158842a;
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            UserStory userStory;
            c.a aVar = (c.a) obj;
            List<h.k.k<SUBSCRIBE_DATA, ?>> list = aVar.f136890a;
            Aweme clone = aVar.f136892c.clone();
            h.f.b.l.b(clone, "");
            Aweme aweme = this.f137618a.f137598c.get(this.f137619b);
            if (aweme != null && (userStory = clone.getUserStory()) != null && (!h.f.b.l.a(aweme.getUserStory(), userStory))) {
                aweme.setUserStory(userStory);
                h.k.k[] kVarArr = {f.f137669a, h.f137671a, i.f137672a, j.f137673a, k.f137674a, l.f137675a, m.f137676a, n.f137677a};
                a aVar2 = new a(userStory, aweme, list, clone, this);
                h.f.b.l.d(list, "");
                h.f.b.l.d(kVarArr, "");
                h.f.b.l.d(aVar2, "");
                Iterator<T> it = list.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int i2 = 0;
                    while (true) {
                        if (h.f.b.l.a((Object) next, (Object) kVarArr[i2])) {
                            aVar2.invoke();
                            break loop0;
                        } else {
                            i2++;
                            if (i2 >= 8) {
                            }
                        }
                    }
                }
                h.k.h hVar = g.f137670a;
                b bVar = new b(userStory, aweme, list, clone, this);
                h.f.b.l.d(list, "");
                h.f.b.l.d(hVar, "");
                h.f.b.l.d(bVar, "");
                if (list.contains(hVar)) {
                    bVar.invoke();
                }
            }
        }
    }

    public final boolean b() {
        return TextUtils.equals("westwindow", this.f137602h);
    }

    public final boolean f() {
        return TextUtils.equals("story_archive", this.f137602h);
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f137606l.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    public final boolean h() {
        return TextUtils.equals("homepage_follow", this.f137602h);
    }

    public final boolean i() {
        return TextUtils.equals("homepage_hot", this.f137602h);
    }

    public final boolean j() {
        return h.f.b.l.a((Object) this.f137607m.getFrom(), (Object) "STORY_ENTRANCE_DEFAULT");
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f137605k.a();
        com.ss.android.ugc.aweme.story.publish.f.e(this.f137603i);
    }

    static final class e extends h.f.b.m implements h.f.a.a<ValueAnimator> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f137609a = new e();

        static {
            Covode.recordClassIndex(90037);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ValueAnimator invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(5000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    public final boolean c() {
        if (!TextUtils.equals("personal_homepage", this.f137602h) || com.ss.android.ugc.aweme.story.c.b.f()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (!TextUtils.equals("personal_homepage", this.f137602h) || !com.ss.android.ugc.aweme.story.c.b.f()) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!TextUtils.equals("others_homepage", this.f137602h) || !com.ss.android.ugc.aweme.story.c.b.f()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (TextUtils.equals("homepage_follow", this.f137602h) || TextUtils.equals("homepage_hot", this.f137602h)) {
            return true;
        }
        return false;
    }

    public static final class a implements com.ss.android.ugc.aweme.story.publish.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryFeedViewModel f137608a;

        static {
            Covode.recordClassIndex(90033);
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(com.ss.android.ugc.aweme.story.publish.i iVar) {
            h.f.b.l.d(iVar, "");
        }

        a(StoryFeedViewModel storyFeedViewModel) {
            this.f137608a = storyFeedViewModel;
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(int i2) {
            this.f137608a.a("UPLOADING_USER_STORY_ALL_SUCCESS", Integer.valueOf(i2));
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(String str) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void c(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
            this.f137608a.a("UPLOADING_LOCAL_VIDEO_READY", str);
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void b(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
            if (eVar.f138107b == com.ss.android.ugc.aweme.story.publish.i.SUCCESS) {
                Aweme aweme = eVar.f138109d;
                if (aweme != null) {
                    this.f137608a.a("UPLOADING_USER_STORY_SUCCESS", new p(str, aweme));
                }
            } else if (eVar.f138107b == com.ss.android.ugc.aweme.story.publish.i.FAILED) {
                this.f137608a.a("UPLOADING_USER_STORY_FAIL", v.a(str, eVar.f138108c));
            }
        }

        @Override // com.ss.android.ugc.aweme.story.publish.d
        public final void a(String str, com.ss.android.ugc.aweme.story.publish.e eVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(eVar, "");
            if (eVar.f138109d != null) {
                this.f137608a.a("UPLOADING_USER_STORY_PROGRESS", v.a(str, Float.valueOf(eVar.f138106a)));
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStory $curUserStory$inlined;

        static {
            Covode.recordClassIndex(90035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserStory userStory) {
            super(1);
            this.$curUserStory$inlined = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            h.f.b.l.d(userStory, "");
            return UserStoryKt.copyAll(this.$curUserStory$inlined);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStory $curUserStory;

        static {
            Covode.recordClassIndex(90036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UserStory userStory) {
            super(1);
            this.$curUserStory = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            h.f.b.l.d(userStory, "");
            return UserStoryKt.copyAll(this.$curUserStory);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryFeedViewModel f137613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137614b;

        static {
            Covode.recordClassIndex(90039);
        }

        g(StoryFeedViewModel storyFeedViewModel, String str) {
            this.f137613a = storyFeedViewModel;
            this.f137614b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f137613a.e(this.f137614b);
            this.f137613a.a("LOAD_USER_STORY_FAIL", (Object) null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStory $userStory;

        static {
            Covode.recordClassIndex(90040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(UserStory userStory) {
            super(1);
            this.$userStory = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            h.f.b.l.d(userStory, "");
            return UserStoryKt.copyAll(this.$userStory);
        }
    }

    public static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k[] f137617a;

        static {
            Covode.recordClassIndex(90042);
        }

        public j(h.k.k[] kVarArr) {
            this.f137617a = kVarArr;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            return c.a.a(aVar.f136890a, aVar.f136891b, aVar.f136892c, this.f137617a);
        }
    }

    public static boolean g(String str) {
        String str2;
        h.f.b.l.d(str, "");
        User c2 = in.c();
        if (c2 != null) {
            str2 = c2.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    public static final class i<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f137615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c f137616b;

        static {
            Covode.recordClassIndex(90041);
        }

        public i(Object obj, com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c cVar) {
            this.f137615a = obj;
            this.f137616b = cVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a(this.f137616b.a((Object) aVar.f136891b, (Object) aVar.f136892c), this.f137615a) || !(!aVar.f136890a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    public static String a(Aweme aweme) {
        h.f.b.l.d(aweme, "");
        User author = aweme.getAuthor();
        if (author != null) {
            String uid = author.getUid();
            h.f.b.l.b(uid, "");
            return uid;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return "";
        }
        h.f.b.l.b(userStory, "");
        if (userStory.getStories().size() <= 0) {
            return "";
        }
        String authorUid = userStory.getStories().get(0).getAuthorUid();
        h.f.b.l.b(authorUid, "");
        return authorUid;
    }

    public final boolean c(String str) {
        UserStory userStory;
        h.f.b.l.d(str, "");
        Aweme aweme = this.f137598c.get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.getShouldShowGuide() || !g()) {
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        h.f.b.l.d(str, "");
        if (!g(str) || com.ss.android.ugc.aweme.story.publish.f.f138112b.size() <= 0) {
            return false;
        }
        if (b() || c()) {
            return true;
        }
        if ((!com.ss.android.ugc.aweme.story.c.b.f() || (!h() && !d())) && !this.f137607m.isShouldQueryMyStoryFromCache()) {
            return false;
        }
        return true;
    }

    private final Aweme h(String str) {
        User author;
        Aweme aweme = new Aweme();
        aweme.setAwemeType(40);
        aweme.setStoryFakeAweme(true);
        aweme.setFakeAid(UUID.randomUUID().toString());
        Story story = new Story(0, false, 0, false, 0, false, false, false, false, 511, null);
        story.setFaked(true);
        aweme.setStory(story);
        Aweme aweme2 = this.f137598c.get(str);
        if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
            aweme.setAuthor(author);
        }
        return aweme;
    }

    public final List<q> e(String str) {
        UserStory userStory;
        Aweme aweme = this.f137598c.get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return new ArrayList();
        }
        h.f.b.l.b(userStory, "");
        int totalCount = (int) userStory.getTotalCount();
        userStory.getTotalCount();
        com.ss.android.ugc.aweme.story.publish.f.f138112b.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < totalCount; i4++) {
            long j2 = (long) i4;
            if (j2 >= userStory.getCurrentPosition() && j2 < ((long) userStory.getStories().size()) + userStory.getCurrentPosition()) {
                String aid = userStory.getStories().get(i2).getAid();
                if (aid == null) {
                    aid = "";
                }
                arrayList.add(new q(aid, r.LOADED));
                i2++;
            } else if (!f(str) || i4 < totalCount - com.ss.android.ugc.aweme.story.publish.f.f138112b.size()) {
                arrayList.add(new q("", r.UNLOADING));
            } else {
                String aid2 = com.ss.android.ugc.aweme.story.publish.f.f138112b.get(i3).getAid();
                if (aid2 == null) {
                    aid2 = "";
                }
                arrayList.add(new q(aid2, r.PUBLISH));
                i3++;
            }
        }
        this.f137599d.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryFeedViewModel f137610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137611b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f137612c;

        static {
            Covode.recordClassIndex(90038);
        }

        f(StoryFeedViewModel storyFeedViewModel, String str, boolean z) {
            this.f137610a = storyFeedViewModel;
            this.f137611b = str;
            this.f137612c = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
            if (r2 != null) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bf, code lost:
            if (r2 != null) goto L_0x00d1;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 451
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel.f.accept(java.lang.Object):void");
        }
    }

    public final List<Aweme> d(String str) {
        UserStory userStory;
        User user;
        User user2;
        long originTotalCount;
        h.f.b.l.d(str, "");
        Aweme aweme = this.f137598c.get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return null;
        }
        h.f.b.l.b(userStory, "");
        if (!userStory.getHasMoreAfter() && !userStory.getHasMoreBefore()) {
            userStory.setOriginTotalCount((long) userStory.getStories().size());
            com.ss.android.ugc.aweme.story.j.a.b("huangxin.2020", "getWrappedStories: originTotalCount: " + userStory.getOriginTotalCount() + ", userStory instance: " + System.identityHashCode(userStory));
            if (f(str)) {
                originTotalCount = (userStory.getOriginTotalCount() + ((long) com.ss.android.ugc.aweme.story.publish.f.f138112b.size())) - ((long) com.ss.android.ugc.aweme.story.publish.f.f138118h.a(userStory, true));
            } else {
                originTotalCount = userStory.getOriginTotalCount();
            }
            userStory.setTotalCount(originTotalCount);
        }
        if (userStory.getTotalCount() <= ((long) userStory.getStories().size())) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(userStory.getStories());
            if (f(str)) {
                User c2 = in.c();
                h.f.b.l.b(c2, "");
                if (h.m.p.a(str, c2.getUid(), true)) {
                    List<Aweme> list = com.ss.android.ugc.aweme.story.publish.f.f138112b;
                    if (!list.isEmpty()) {
                        arrayList.addAll(list);
                    }
                }
            }
            if (c(str)) {
                Aweme aweme2 = new Aweme();
                aweme2.setAwemeType(5457744);
                Aweme aweme3 = this.f137598c.get(str);
                if (aweme3 != null) {
                    user2 = aweme3.getAuthor();
                } else {
                    user2 = null;
                }
                aweme2.setAuthor(user2);
                arrayList.add(aweme2);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(userStory.getStories());
        if (f(str)) {
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount() - ((long) com.ss.android.ugc.aweme.story.publish.f.f138112b.size())) {
                long totalCount = ((userStory.getTotalCount() - ((long) com.ss.android.ugc.aweme.story.publish.f.f138112b.size())) - userStory.getCurrentPosition()) - ((long) userStory.getStories().size());
                do {
                    totalCount--;
                    arrayList2.add(h(str));
                } while (totalCount > 0);
            }
            List<Aweme> list2 = com.ss.android.ugc.aweme.story.publish.f.f138112b;
            if (!list2.isEmpty()) {
                arrayList2.addAll(list2);
            }
        } else if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount()) {
            long totalCount2 = (userStory.getTotalCount() - userStory.getCurrentPosition()) - ((long) userStory.getStories().size());
            do {
                totalCount2--;
                arrayList2.add(h(str));
            } while (totalCount2 > 0);
        }
        if (userStory.getCurrentPosition() > 0) {
            long currentPosition = userStory.getCurrentPosition();
            do {
                currentPosition--;
                arrayList2.add(0, h(str));
            } while (currentPosition > 0);
        }
        if (c(str)) {
            Aweme aweme4 = new Aweme();
            aweme4.setAwemeType(5457744);
            Aweme aweme5 = this.f137598c.get(str);
            if (aweme5 != null) {
                user = aweme5.getAuthor();
            } else {
                user = null;
            }
            aweme4.setAuthor(user);
            arrayList2.add(aweme4);
        }
        return arrayList2;
    }

    public StoryFeedViewModel(m mVar, com.ss.android.ugc.aweme.feed.param.b bVar) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(bVar, "");
        this.f137606l = mVar;
        this.f137607m = bVar;
        String eventType = bVar.getEventType();
        this.f137602h = eventType;
        String str = eventType + ":story_feed_view_model";
        this.f137603i = str;
        this.f66996a = mVar;
        if (c() || b()) {
            com.ss.android.ugc.aweme.story.publish.f.f138118h.a(str, new a(this));
        }
        this.f137600e = new p();
    }

    private final void a(String str, boolean z) {
        UserStory userStory;
        long currentPosition;
        long currentPosition2;
        Aweme aweme = this.f137598c.get(str);
        if (!(aweme == null || (userStory = aweme.getUserStory()) == null)) {
            h.f.b.l.b(userStory, "");
            List<q> list = this.f137599d.get(str);
            if (list == null) {
                list = e(str);
            }
            if (z) {
                if (userStory.getCurrentPosition() < 5) {
                    currentPosition2 = 0;
                } else {
                    currentPosition2 = (userStory.getCurrentPosition() + 1) - 5;
                }
                int currentPosition3 = (int) userStory.getCurrentPosition();
                for (int i2 = (int) currentPosition2; i2 < currentPosition3; i2++) {
                    if (i2 < list.size()) {
                        list.set(i2, new q("", r.LOADING));
                    }
                }
                return;
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + 5 >= userStory.getTotalCount()) {
                currentPosition = userStory.getTotalCount();
            } else {
                currentPosition = userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + 5;
            }
            int i3 = (int) currentPosition;
            for (int size = userStory.getStories().size() + ((int) userStory.getCurrentPosition()); size < i3; size++) {
                if (size < list.size() && list.get(size).f137681b == r.UNLOADING) {
                    list.get(size).a(r.LOADING);
                }
            }
        }
    }

    public final int a(String str, List<? extends Aweme> list) {
        UserStory userStory;
        int currentPosition;
        T t;
        h.f.b.l.d(str, "");
        h.f.b.l.d(list, "");
        Aweme aweme = this.f137598c.get(str);
        int i2 = 0;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return 0;
        }
        h.f.b.l.b(userStory, "");
        Integer currentIndex = UserStoryKt.currentIndex(userStory);
        if (currentIndex != null) {
            currentPosition = currentIndex.intValue();
        } else {
            currentPosition = (int) userStory.getCurrentPosition();
        }
        if (list.isEmpty()) {
            return -1;
        }
        Integer num = null;
        if (currentPosition < 0) {
            t = (Aweme) list.get(0);
            currentPosition = 0;
        } else {
            int size = list.size();
            if (1 <= size && currentPosition >= size) {
                currentPosition = list.size() - 1;
                t = (Aweme) list.get(currentPosition);
            } else if (currentPosition < list.size()) {
                t = (Aweme) list.get(currentPosition);
            } else {
                t = null;
                currentPosition = -1;
            }
        }
        if (f(str) && com.ss.android.ugc.aweme.story.publish.f.f138112b.size() > 0) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = next;
                Story story = t2.getStory();
                if (story != null && story.isPublishing()) {
                    currentPosition = i2;
                    t = t2;
                    break;
                }
                i2 = i3;
            }
        }
        if (currentPosition >= 0) {
            num = Integer.valueOf(currentPosition);
        }
        p.a(str, userStory, num, t);
        return currentPosition;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, UserStory userStory) {
        if (f(str)) {
            userStory.setTotalCount((userStory.getOriginTotalCount() + ((long) com.ss.android.ugc.aweme.story.publish.f.f138112b.size())) - ((long) com.ss.android.ugc.aweme.story.publish.f.f138118h.a(userStory, true)));
            e(str);
        }
    }

    private final void a(String str, long j2, boolean z) {
        a(str, z);
        f.a.b.b a2 = StoryApi.f136727a.getUserStory(str, j2, z, 5).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this, str, z), new g(this, str));
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, this.f137605k);
    }

    public final void a(String str, int i2, List<? extends Aweme> list) {
        UserStory userStory;
        h.f.b.l.d(str, "");
        h.f.b.l.d(list, "");
        Aweme aweme = this.f137598c.get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            h.f.b.l.b(userStory, "");
            List<q> list2 = this.f137599d.get(str);
            if (list2 == null) {
                list2 = e(str);
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount() && ((long) (i2 + 1)) >= userStory.getCurrentPosition() + ((long) userStory.getStories().size()) && userStory.getHasMoreAfter() && ((int) userStory.getCurrentPosition()) + userStory.getStories().size() < list2.size() && list2.get(((int) userStory.getCurrentPosition()) + userStory.getStories().size()).f137681b == r.UNLOADING) {
                a(str, userStory.getMaxCursor(), false);
            }
            if (userStory.getCurrentPosition() != 0 && ((long) (i2 - 1)) <= userStory.getCurrentPosition() && userStory.getHasMoreBefore() && ((int) userStory.getCurrentPosition()) - 1 < list2.size() && list2.get(((int) userStory.getCurrentPosition()) - 1).f137681b == r.UNLOADING) {
                a(str, userStory.getMinCursor(), true);
            }
        }
    }
}
