package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2632a f103566e = new C2632a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f103567a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f103568b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f103569c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b f103570d;

    /* renamed from: f  reason: collision with root package name */
    private final h f103571f;

    /* renamed from: g  reason: collision with root package name */
    private final h f103572g;

    /* renamed from: h  reason: collision with root package name */
    private final h f103573h;

    /* renamed from: i  reason: collision with root package name */
    private final h f103574i;

    /* renamed from: j  reason: collision with root package name */
    private final SharePackage f103575j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.share.b.a.b f103576k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f103577l;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final C2633a f103579a = new C2633a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private final h f103580b = i.a((h.f.a.a) c.f103584a);

        /* renamed from: c  reason: collision with root package name */
        private final h f103581c = i.a((h.f.a.a) C2634b.f103583a);

        /* renamed from: d  reason: collision with root package name */
        private final h f103582d = i.a((h.f.a.a) d.f103585a);

        static {
            Covode.recordClassIndex(66355);
        }

        /* access modifiers changed from: package-private */
        public final Set<IMContact> a() {
            return (Set) this.f103580b.getValue();
        }

        /* access modifiers changed from: package-private */
        public final LinkedHashSet<IMContact> b() {
            return (LinkedHashSet) this.f103581c.getValue();
        }

        /* access modifiers changed from: package-private */
        public final Set<IMContact> c() {
            return (Set) this.f103582d.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$a  reason: collision with other inner class name */
        public static final class C2633a {
            static {
                Covode.recordClassIndex(66356);
            }

            private C2633a() {
            }

            public /* synthetic */ C2633a(byte b2) {
                this();
            }

            public static void a(IMContact iMContact, Set<IMContact> set, boolean z) {
                l.d(iMContact, "");
                l.d(set, "");
                if (z) {
                    set.add(iMContact);
                } else {
                    set.remove(iMContact);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$b$b  reason: collision with other inner class name */
        static final class C2634b extends m implements h.f.a.a<LinkedHashSet<IMContact>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2634b f103583a = new C2634b();

            static {
                Covode.recordClassIndex(66357);
            }

            C2634b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LinkedHashSet<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        static final class c extends m implements h.f.a.a<Set<IMContact>> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f103584a = new c();

            static {
                Covode.recordClassIndex(66358);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Set<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        static final class d extends m implements h.f.a.a<Set<IMContact>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f103585a = new d();

            static {
                Covode.recordClassIndex(66359);
            }

            d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Set<IMContact> invoke() {
                return new LinkedHashSet();
            }
        }

        public final List<String> h() {
            return com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.b(n.k(b()));
        }

        public final void d() {
            a().clear();
            b().clear();
            c().clear();
        }

        public final boolean f() {
            if (!a().isEmpty() || !c().isEmpty()) {
                return false;
            }
            return true;
        }

        public final boolean e() {
            if (a().size() + b().size() + c().size() < 2) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            Set<IMContact> c2 = c();
            if ((c2 instanceof Collection) && c2.isEmpty()) {
                return false;
            }
            Iterator<T> it = c2.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.ss.android.ugc.aweme.social.c.a) {
                    return true;
                }
            }
            return false;
        }

        private static boolean a(IMContact iMContact) {
            int i2 = e.a.f37582b;
            if (!(iMContact instanceof IMConversation)) {
                iMContact = null;
            }
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation == null || i2 != iMConversation.getConversationType()) {
                return false;
            }
            return true;
        }

        private static boolean b(IMContact iMContact) {
            if (!(iMContact instanceof IMUser) || ((IMUser) iMContact).getFollowStatus() != 2) {
                return false;
            }
            return true;
        }

        public final void a(IMContact iMContact, boolean z) {
            l.d(iMContact, "");
            if (a(iMContact)) {
                C2633a.a(iMContact, a(), z);
            } else if (!b(iMContact)) {
                C2633a.a(iMContact, c(), z);
            } else if (!IMUser.isSelf(((IMUser) iMContact).getUid())) {
                C2633a.a(iMContact, b(), z);
            }
        }
    }

    static {
        Covode.recordClassIndex(66352);
    }

    private final AnimatorSet e() {
        return (AnimatorSet) this.f103573h.getValue();
    }

    public final int a() {
        return ((Number) this.f103571f.getValue()).intValue();
    }

    public final b b() {
        return (b) this.f103574i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$a  reason: collision with other inner class name */
    public static final class C2632a {
        static {
            Covode.recordClassIndex(66354);
        }

        private C2632a() {
        }

        public /* synthetic */ C2632a(byte b2) {
            this();
        }

        public static boolean a(SharePackage sharePackage) {
            if (!com.ss.android.ugc.aweme.im.service.c.b.a() || com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(sharePackage)) {
                return false;
            }
            return true;
        }
    }

    static final class f extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f103588a = new f();

        static {
            Covode.recordClassIndex(66364);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    public final void c() {
        boolean z = this.f103577l;
        if (z) {
            a(z);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f103587a = new e();

        static {
            Covode.recordClassIndex(66363);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            return Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
        }
    }

    private final void f() {
        LinearLayout linearLayout = this.f103570d.f103398a;
        if (linearLayout.getVisibility() != 0) {
            linearLayout.setVisibility(0);
            ((AnimatorSet) this.f103572g.getValue()).start();
        }
    }

    public final void d() {
        if (this.f103570d.f103398a.getVisibility() != 8) {
            a(false);
            e().start();
        }
    }

    private final void g() {
        if (!C2632a.a(this.f103575j) || b().g() || b().e() || !b().f()) {
            d();
            this.f103576k.b(false);
            return;
        }
        f();
        this.f103576k.b(true);
    }

    static final class c extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.f103570d.f103398a, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.setStartDelay(100);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.this$0.a());
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(this.this$0.f103567a);
            animatorSet.playTogether(ofInt, ofFloat);
            return animatorSet;
        }
    }

    static final class d extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.f103570d.f103398a, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ValueAnimator ofInt = ValueAnimator.ofInt(this.this$0.a(), 0);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(this.this$0.f103567a);
            ofInt.addListener(new C2635a(this));
            animatorSet.playTogether(ofFloat, ofInt);
            return animatorSet;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a$d$a  reason: collision with other inner class name */
        public static final class C2635a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f103586a;

            static {
                Covode.recordClassIndex(66362);
            }

            public final void onAnimationCancel(Animator animator) {
                l.c(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                l.c(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                l.c(animator, "");
            }

            public C2635a(d dVar) {
                this.f103586a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.c(animator, "");
                this.f103586a.this$0.f103570d.f103398a.setVisibility(8);
            }
        }
    }

    static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103589a;

        static {
            Covode.recordClassIndex(66365);
        }

        g(a aVar) {
            this.f103589a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f103589a.f103570d.f103398a.getLayoutParams();
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f103589a.f103570d.f103398a.setLayoutParams(layoutParams);
        }
    }

    public final void a(Collection<? extends IMContact> collection) {
        l.d(collection, "");
        b().d();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            b().a(it.next(), true);
        }
        g();
    }

    public final boolean a(boolean z) {
        if (this.f103568b == z) {
            return false;
        }
        this.f103568b = z;
        this.f103570d.f103399b.setChecked(this.f103568b);
        this.f103576k.a(this.f103568b);
        return true;
    }

    public final boolean a(h.f.a.b<? super com.bytedance.im.core.d.h, z> bVar) {
        l.d(bVar, "");
        if (!com.ss.android.ugc.aweme.im.service.c.b.a()) {
            com.ss.android.ugc.aweme.im.service.m.a.c("CreateGroupChatWidget", "group chat not supported");
            d();
        } else if (this.f103569c) {
            com.ss.android.ugc.aweme.im.service.m.a.c("CreateGroupChatWidget", "is requesting");
        } else {
            b b2 = b();
            if (b2.a().isEmpty() && b2.b().isEmpty() && b2.c().isEmpty()) {
                com.ss.android.ugc.aweme.im.service.m.a.c("CreateGroupChatWidget", "empty contact list");
            } else if (b().e()) {
                com.ss.android.ugc.aweme.im.service.m.a.c("CreateGroupChatWidget", "contact list size is less than 2");
            } else if (!b().f()) {
                com.ss.android.ugc.aweme.im.service.m.a.c("CreateGroupChatWidget", "contact list contains group chat or single-follow user");
            } else {
                this.f103569c = true;
                e.a.a();
                com.ss.android.ugc.aweme.im.sdk.group.a.e.a(b().h(), bVar);
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(b().h());
                return true;
            }
        }
        return false;
    }

    public final void a(IMContact iMContact, boolean z) {
        l.d(iMContact, "");
        b().a(iMContact, z);
        g();
    }

    public /* synthetic */ a(com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b bVar, SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar2) {
        this(bVar, sharePackage, bVar2, false);
    }

    public a(com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b bVar, SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.b.a.b bVar2, boolean z) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f103570d = bVar;
        this.f103575j = sharePackage;
        this.f103576k = bVar2;
        this.f103577l = z;
        this.f103571f = i.a((h.f.a.a) e.f103587a);
        this.f103567a = new g(this);
        this.f103572g = i.a((h.f.a.a) new c(this));
        this.f103573h = i.a((h.f.a.a) new d(this));
        this.f103574i = i.a((h.f.a.a) f.f103588a);
        ae.a(bVar.f103398a);
        bVar.f103399b.setClickable(false);
        bVar.f103398a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f103578a;

            static {
                Covode.recordClassIndex(66353);
            }

            {
                this.f103578a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                a aVar = this.f103578a;
                aVar.a(!aVar.f103568b);
            }
        });
        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("share");
    }
}
