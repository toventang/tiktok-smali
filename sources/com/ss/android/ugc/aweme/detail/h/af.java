package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public abstract class af extends b {
    public static final a I = new a((byte) 0);
    private boolean F;

    /* renamed from: a  reason: collision with root package name */
    private boolean f79677a;

    static {
        Covode.recordClassIndex(49513);
    }

    public void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
    }

    public void ab() {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.detail.h.b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(381, new g(af.class, "onStoryCommentBubbleItemClicked", com.ss.android.ugc.aweme.story.b.d.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    public void o() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49514);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.comment.g.c
    public final void c() {
        this.F = true;
        bM();
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.comment.g.c
    public final void d() {
        this.F = false;
        bN();
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final Aweme y() {
        return bL();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void v() {
        super.v();
        this.N.post(new e(this));
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f79681a;

        static {
            Covode.recordClassIndex(49518);
        }

        e(af afVar) {
            this.f79681a = afVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.feed.adapter.b bVar = this.f79681a.W;
            l.b(bVar, "");
            if (bVar.getCount() > 0 && this.f79681a.bD()) {
                this.f79681a.ab();
            }
        }
    }

    public final boolean ad() {
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        return l.a((Object) bVar.getEventType(), (Object) "story_archive");
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public void p() {
        super.p();
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        String eventType = bVar.getEventType();
        l.b(eventType, "");
        if (r(eventType)) {
            q(this.f79695g);
        }
    }

    public final void ae() {
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        String eventType = bVar.getEventType();
        l.b(eventType, "");
        boolean r = r(eventType);
        IStoryService storyService = AVExternalServiceImpl.a().storyService();
        Activity activity = this.bv;
        l.b(activity, "");
        storyService.startStoryActivity(activity, new EnterStoryParam(null, "click_story_bottom_camera", "story", r, false, false, !com.ss.android.ugc.aweme.story.c.b.i(), 49, null));
    }

    public final String af() {
        Aweme bL;
        AwemeStatistics statistics;
        long commentCount;
        long j2 = 0;
        if (CommentServiceImpl.e().c(bL()) || (bL = bL()) == null || (statistics = bL.getStatistics()) == null) {
            commentCount = 0;
        } else {
            commentCount = statistics.getCommentCount();
        }
        if (commentCount >= 0) {
            j2 = commentCount;
        }
        try {
            String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
            l.b(a2, "");
            return a2;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return "0";
        }
    }

    private static Aweme bX() {
        Aweme aweme = new Aweme();
        aweme.setAid("0");
        aweme.setAwemeType(40);
        Aweme aweme2 = new Aweme();
        aweme2.setAwemeType(5457744);
        aweme2.setStory(new Story(0, false, 0, false, 0, false, false, true, false, 383, null));
        aweme.setUserStory(new UserStory(n.c(aweme2), 1, 0, false, 0, 0, false, false, 0, 0, null, false, false, false, 16372, null));
        return aweme;
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f79678a;

        static {
            Covode.recordClassIndex(49515);
        }

        b(af afVar) {
            this.f79678a = afVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f79678a.a((com.ss.android.ugc.aweme.arch.widgets.base.b) obj);
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f79679a;

        static {
            Covode.recordClassIndex(49516);
        }

        c(af afVar) {
            this.f79679a = afVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f79679a.a((com.ss.android.ugc.aweme.arch.widgets.base.b) obj);
        }
    }

    public static final class d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f79680a;

        static {
            Covode.recordClassIndex(49517);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(af afVar) {
            this.f79680a = afVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            aa aaVar = this.f79680a.f79694f;
            if (!(aaVar instanceof com.ss.android.ugc.aweme.story.api.a)) {
                aaVar = null;
            }
            com.ss.android.ugc.aweme.story.api.a aVar = (com.ss.android.ugc.aweme.story.api.a) aaVar;
            if (aVar != null) {
                aVar.c(i2);
            }
        }
    }

    private static boolean r(String str) {
        return TextUtils.equals(str, "westwindow");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(com.ss.android.ugc.aweme.feed.param.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public final void j(String str) {
        l.d(str, "");
        a(bL(), 3, str);
    }

    public static String a(long j2) {
        if (j2 <= 999) {
            return String.valueOf(j2);
        }
        String string = com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.hci);
        l.b(string, "");
        return string;
    }

    @r(a = ThreadMode.MAIN)
    public void onStoryCommentBubbleItemClicked(com.ss.android.ugc.aweme.story.b.d dVar) {
        l.d(dVar, "");
        if (!this.bd) {
            a(bL(), dVar.f136845a, true, "bubble");
        }
    }

    private final void q(boolean z) {
        if (bD()) {
            com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
            l.b(bVar, "");
            if (TextUtils.equals(bVar.getEventType(), "westwindow") && !z) {
                ArrayList arrayList = new ArrayList();
                com.ss.android.ugc.aweme.feed.adapter.b bVar2 = this.W;
                l.b(bVar2, "");
                List<Aweme> e2 = bVar2.e();
                l.b(e2, "");
                arrayList.addAll(e2);
                arrayList.add(bX());
                this.W.a(arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void onCommentListPageDialogEvent(com.ss.android.ugc.aweme.comment.c.e eVar) {
        l.d(eVar, "");
        Activity activity = this.bv;
        if (activity != null && !activity.isFinishing() && eVar.f71753b == activity.hashCode()) {
            if (eVar.f71752a == 1) {
                this.f79677a = true;
                bM();
                return;
            }
            this.f79677a = false;
            bN();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void onVideoEvent(ag agVar) {
        String str;
        if (agVar != null && 14 == agVar.f93450a) {
            Object obj = agVar.f93451b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Aweme bL = bL();
            if (bL != null) {
                str = bL.getAid();
            } else {
                str = null;
            }
            if (m.a(str, str2)) {
                o();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void a(boolean z) {
        if (!this.f79677a && !this.F) {
            if (z) {
                bM();
            } else {
                bN();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        Integer valueOf;
        String str = null;
        if (cVar != null && (valueOf = Integer.valueOf(cVar.f71746a)) != null) {
            if ((valueOf.intValue() == 3 || valueOf.intValue() == 4 || valueOf.intValue() == 8) && (cVar.f71747b instanceof Object[])) {
                Object obj = cVar.f71747b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    Aweme bL = bL();
                    if (bL != null) {
                        str = bL.getAid();
                    }
                    if (m.a(str, (String) objArr[0])) {
                        o();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public void b(List<Aweme> list, boolean z) {
        super.b(list, z);
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        String eventType = bVar.getEventType();
        l.b(eventType, "");
        if (r(eventType)) {
            q(z);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.b
    public void a(List<Aweme> list, boolean z) {
        super.a(list, z);
        com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
        l.b(bVar, "");
        String eventType = bVar.getEventType();
        l.b(eventType, "");
        if (r(eventType)) {
            q(z);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r1.equals("story_archive") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r1.equals("chat_list") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r1.equals("follow_request") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r1.equals("notification_page") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r3 = true;
     */
    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b, com.ss.android.ugc.aweme.detail.h.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.h.af.a(android.view.View, android.os.Bundle):void");
    }
}
