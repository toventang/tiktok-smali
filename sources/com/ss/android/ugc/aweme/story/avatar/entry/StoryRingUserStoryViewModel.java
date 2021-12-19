package com.ss.android.ugc.aweme.story.avatar.entry;

import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import h.z;

public final class StoryRingUserStoryViewModel implements au, com.ss.android.ugc.aweme.story.avatar.f, com.ss.android.ugc.aweme.story.base.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f136781f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final t<Aweme> f136782a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    final f.a.b.a f136783b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public User f136784c;

    /* renamed from: d  reason: collision with root package name */
    b f136785d;

    /* renamed from: e  reason: collision with root package name */
    final MineUserStoryFetcher f136786e;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.m f136787g;

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f136794a = new f();

        static {
            Covode.recordClassIndex(89374);
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final j f136799a = new j();

        static {
            Covode.recordClassIndex(89378);
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(89368);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89369);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(User user) {
            String uid;
            if (user == null || (uid = user.getUid()) == null || !com.ss.android.ugc.aweme.story.avatar.a.f136768d.a()) {
                return false;
            }
            if (com.ss.android.ugc.aweme.story.i.d.f137808a.a(uid) == null && !com.ss.android.ugc.aweme.story.avatar.a.f136768d.a(user)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.f
    public final androidx.lifecycle.m z() {
        return this.f136787g;
    }

    @v(a = i.a.ON_DESTROY)
    public final void clear() {
        this.f136783b.dispose();
        com.ss.android.ugc.aweme.story.avatar.a.f136768d.a(this);
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f136787g.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    public final void a(Aweme aweme) {
        this.f136782a.setValue(aweme);
    }

    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k[] f136792a;

        static {
            Covode.recordClassIndex(89372);
        }

        public d(h.k.k[] kVarArr) {
            this.f136792a = kVarArr;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            return c.a.a(aVar.f136890a, aVar.f136891b, aVar.f136892c, this.f136792a);
        }
    }

    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k[] f136797a;

        static {
            Covode.recordClassIndex(89376);
        }

        public h(h.k.k[] kVarArr) {
            this.f136797a = kVarArr;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            return c.a.a(aVar.f136890a, aVar.f136891b, aVar.f136892c, this.f136797a);
        }
    }

    public final void a(b bVar) {
        if (h.f.b.l.a(bVar, this.f136785d)) {
            this.f136785d = null;
        }
    }

    public static final class c<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f136790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c f136791b;

        static {
            Covode.recordClassIndex(89371);
        }

        public c(Object obj, com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c cVar) {
            this.f136790a = obj;
            this.f136791b = cVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a(this.f136791b.a((Object) aVar.f136891b, (Object) aVar.f136892c), this.f136790a) || !(!aVar.f136890a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRingUserStoryViewModel f136793a;

        static {
            Covode.recordClassIndex(89373);
        }

        public e(StoryRingUserStoryViewModel storyRingUserStoryViewModel) {
            this.f136793a = storyRingUserStoryViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Aweme clone = ((c.a) obj).f136892c.clone();
            h.f.b.l.b(clone, "");
            User user = this.f136793a.f136784c;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str, (Object) clone.getAuthorUid())) {
                this.f136793a.a(clone);
            }
        }
    }

    public static final class g<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f136795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c f136796b;

        static {
            Covode.recordClassIndex(89375);
        }

        public g(Object obj, com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c cVar) {
            this.f136795a = obj;
            this.f136796b = cVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            c.a aVar = (c.a) obj;
            h.f.b.l.d(aVar, "");
            if (!h.f.b.l.a(this.f136796b.a((Object) aVar.f136891b, (Object) aVar.f136892c), this.f136795a) || !(!aVar.f136890a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRingUserStoryViewModel f136798a;

        static {
            Covode.recordClassIndex(89377);
        }

        public i(StoryRingUserStoryViewModel storyRingUserStoryViewModel) {
            this.f136798a = storyRingUserStoryViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Aweme clone = ((c.a) obj).f136892c.clone();
            h.f.b.l.b(clone, "");
            User user = this.f136798a.f136784c;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) str, (Object) clone.getAuthorUid())) {
                this.f136798a.a(clone);
            }
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Aweme, z> {
        final /* synthetic */ String $uid$inlined;
        final /* synthetic */ boolean $useCache$inlined;
        final /* synthetic */ StoryRingUserStoryViewModel this$0;

        static {
            Covode.recordClassIndex(89379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.this$0 = storyRingUserStoryViewModel;
            this.$useCache$inlined = z;
            this.$uid$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Aweme aweme) {
            String uid;
            Aweme aweme2 = aweme;
            h.f.b.l.d(aweme2, "");
            User author = aweme2.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                this.this$0.a(uid, aweme2);
            }
            this.this$0.a(new b(this.$uid$inlined, this.$useCache$inlined));
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Aweme, z> {
        final /* synthetic */ String $uid$inlined;
        final /* synthetic */ boolean $useCache$inlined;
        final /* synthetic */ StoryRingUserStoryViewModel this$0;

        static {
            Covode.recordClassIndex(89380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.this$0 = storyRingUserStoryViewModel;
            this.$useCache$inlined = z;
            this.$uid$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Aweme aweme) {
            String uid;
            Aweme aweme2 = aweme;
            h.f.b.l.d(aweme2, "");
            User author = aweme2.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                this.this$0.a(uid, aweme2);
            }
            this.this$0.a(new b(this.$uid$inlined, this.$useCache$inlined));
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ String $uid$inlined;
        final /* synthetic */ boolean $useCache$inlined;
        final /* synthetic */ StoryRingUserStoryViewModel this$0;

        static {
            Covode.recordClassIndex(89381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.this$0 = storyRingUserStoryViewModel;
            this.$useCache$inlined = z;
            this.$uid$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            com.ss.android.ugc.aweme.story.j.a.a("StoryRingUserStoryViewModel", th2);
            this.this$0.a(new b(this.$uid$inlined, this.$useCache$inlined));
            this.this$0.a(this.$uid$inlined, null);
            return z.f158842a;
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRingUserStoryViewModel f136800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f136801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f136802c;

        static {
            Covode.recordClassIndex(89382);
        }

        n(StoryRingUserStoryViewModel storyRingUserStoryViewModel, String str, boolean z) {
            this.f136800a = storyRingUserStoryViewModel;
            this.f136801b = str;
            this.f136802c = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            User author;
            String uid;
            Aweme aweme = (Aweme) obj;
            if (!(aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null)) {
                this.f136800a.a(uid, aweme);
            }
            this.f136800a.a(new b(this.f136801b, this.f136802c));
        }
    }

    static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRingUserStoryViewModel f136803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f136804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f136805c;

        static {
            Covode.recordClassIndex(89383);
        }

        o(StoryRingUserStoryViewModel storyRingUserStoryViewModel, String str, boolean z) {
            this.f136803a = storyRingUserStoryViewModel;
            this.f136804b = str;
            this.f136805c = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            com.ss.android.ugc.aweme.story.j.a.a("StoryRingUserStoryViewModel", th);
            this.f136803a.a(new b(this.f136804b, this.f136805c));
            this.f136803a.a(this.f136804b, null);
        }
    }

    public StoryRingUserStoryViewModel(com.ss.android.ugc.aweme.story.avatar.e eVar) {
        h.f.b.l.d(eVar, "");
        androidx.lifecycle.m b2 = eVar.b();
        this.f136787g = b2;
        this.f136786e = new MineUserStoryFetcher(getLifecycle());
        b2.getLifecycle().a(this);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f136788a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f136789b;

        static {
            Covode.recordClassIndex(89370);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f136788a, bVar.f136788a) && this.f136789b == bVar.f136789b;
        }

        public final int hashCode() {
            String str = this.f136788a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f136789b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "QueryParam(uid=" + this.f136788a + ", useCache=" + this.f136789b + ")";
        }

        public b(String str, boolean z) {
            h.f.b.l.d(str, "");
            this.f136788a = str;
            this.f136789b = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.f
    public final void a(String str, Aweme aweme) {
        String str2;
        User user;
        h.f.b.l.d(str, "");
        User user2 = this.f136784c;
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        if (!(!h.f.b.l.a((Object) str, (Object) str2))) {
            a(aweme);
            if (aweme == null && (user = this.f136784c) != null) {
                user.setStoryStatus(0);
            }
        }
    }
}
