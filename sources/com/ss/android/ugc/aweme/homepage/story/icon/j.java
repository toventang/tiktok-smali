package com.ss.android.ugc.aweme.homepage.story.icon;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.utils.cg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.r;

public final class j extends com.bytedance.assem.arch.d.a implements i, org.greenrobot.eventbus.j {

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.story.publish.a f99437j = g.f137757a.f();

    /* renamed from: k  reason: collision with root package name */
    private final h f99438k = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(63364);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, new org.greenrobot.eventbus.g(j.class, "onStoryPublishEventPost", StoryPublishEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final DrawerViewModel u() {
        return (DrawerViewModel) this.f99438k.getValue();
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        cg.b(this);
    }

    static final class a extends m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(63365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 != null) {
                return DrawerViewModel.a.a(b2);
            }
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        cg.a(this);
        a.f99420a.restoreScheduleInfoFromDraft(b.f99439a);
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        view.setOnClickListener(new c(this));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f99440a;

        static {
            Covode.recordClassIndex(63367);
        }

        c(j jVar) {
            this.f99440a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DrawerViewModel u = this.f99440a.u();
            if (u != null) {
                u.a(1, "click_upper_left_camera");
            }
        }
    }

    static final class b extends m implements h.f.a.b<List<? extends ScheduleInfo>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99439a = new b();

        static {
            Covode.recordClassIndex(63366);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends ScheduleInfo> list) {
            List<? extends ScheduleInfo> list2 = list;
            l.d(list2, "");
            if (!list2.isEmpty()) {
                com.ss.android.ugc.aweme.story.publish.a f2 = g.f137757a.f();
                ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.story.publish.g gVar = new com.ss.android.ugc.aweme.story.publish.g(it.next());
                    gVar.f138141b.a(com.ss.android.ugc.aweme.story.publish.i.FAILED);
                    arrayList.add(gVar);
                }
                f2.a(n.g((Collection) arrayList));
            }
            return z.f158842a;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onStoryPublishEventPost(StoryPublishEvent storyPublishEvent) {
        e b2;
        l.d(storyPublishEvent, "");
        com.ss.android.ugc.aweme.story.publish.a aVar = this.f99437j;
        List<ScheduleInfo> scheduleList = storyPublishEvent.getScheduleList();
        ArrayList arrayList = new ArrayList(n.a((Iterable) scheduleList, 10));
        Iterator<T> it = scheduleList.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ss.android.ugc.aweme.story.publish.g(it.next()));
        }
        aVar.a(n.g((Collection) arrayList));
        if (storyPublishEvent.getSwitch2FeedTab() && (b2 = com.bytedance.assem.arch.extensions.b.b(this)) != null) {
            String f2 = Hox.a.a(b2).f(be.f68531c);
            if (!(!l.a((Object) f2, (Object) "page_feed"))) {
                String f3 = Hox.a.a(b2).f(f2);
                if (!l.a((Object) f2, (Object) "USER")) {
                    Hox a2 = Hox.a.a(b2);
                    Bundle bundle = new Bundle();
                    bundle.putString(be.f68530b, f3);
                    a2.b("USER", bundle);
                }
            }
        }
        DrawerViewModel u = u();
        if (u != null) {
            u.a(4, "close_publish");
        }
    }
}
