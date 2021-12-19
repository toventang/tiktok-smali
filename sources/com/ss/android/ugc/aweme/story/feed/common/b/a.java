package com.ss.android.ugc.aweme.story.feed.common.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.b.c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.story.b.j;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar;
import com.ss.android.ugc.aweme.story.publish.e;
import com.ss.android.ugc.aweme.story.publish.f;
import com.ss.android.ugc.aweme.story.publish.g;
import com.ss.android.ugc.aweme.story.publish.i;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.story.feed.common.b {

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f137648i;

    /* renamed from: j  reason: collision with root package name */
    private View f137649j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Float> f137650k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, d> f137651l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private String f137652m = "";
    private int n;
    private int o = -1;
    private Aweme p;

    static {
        Covode.recordClassIndex(90057);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void g() {
        StoryFeedViewModel c2 = c();
        c2.a("UPLOADING_USER_STORY_PROGRESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        c2.a("UPLOADING_USER_STORY_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        c2.a("UPLOADING_USER_STORY_FAIL", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        c2.a("UPLOADING_LOCAL_VIDEO_READY", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        c2.a("UPLOADING_USER_STORY_ALL_SUCCESS", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.f137648i.setVisibility(8);
        View a2 = com.a.a(LayoutInflater.from(e()), R.layout.b33, this.f137648i, true);
        l.b(a2, "");
        this.f137649j = a2;
        if (a2 == null) {
            l.a("uploadingBar");
        }
        ((TuxTextView) a2.findViewById(R.id.dmf)).setOnClickListener(new View$OnClickListenerC3617a(this));
        View view = this.f137649j;
        if (view == null) {
            l.a("uploadingBar");
        }
        ((TuxIconView) view.findViewById(R.id.fnk)).setOnClickListener(new b(this));
    }

    public a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f137648i = viewGroup;
    }

    private final void a(String str) {
        String str2;
        Aweme aweme = this.p;
        if (aweme != null) {
            str2 = aweme.getScheduleId();
        } else {
            str2 = null;
        }
        if (!l.a((Object) str2, (Object) str)) {
            h.c(f.f(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void a(int i2) {
        View view = this.f137649j;
        if (view == null) {
            l.a("uploadingBar");
        }
        view.setVisibility(8);
        this.o = i2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137654a;

        static {
            Covode.recordClassIndex(90059);
        }

        b(a aVar) {
            this.f137654a = aVar;
        }

        public final void onClick(View view) {
            String scheduleId;
            ClickAgent.onClick(view);
            final Aweme c2 = this.f137654a.a().c(this.f137654a.b().getCurrentItem());
            if (com.ss.android.ugc.aweme.story.d.a.h(c2) && c2 != null && (scheduleId = c2.getScheduleId()) != null && scheduleId.length() != 0) {
                if (c2 != null) {
                    c2.getScheduleId();
                }
                ((com.bytedance.tux.dialog.b) c.a(a.C1094a.a(this.f137654a.e()).d(this.f137654a.e().getString(R.string.b65)), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                    /* class com.ss.android.ugc.aweme.story.feed.common.b.a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(90060);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        l.d(bVar2, "");
                        String string = this.this$0.f137654a.e().getString(R.string.f160031j);
                        l.b(string, "");
                        bVar2.a(string, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                        String string2 = this.this$0.f137654a.e().getString(R.string.asg);
                        l.b(string2, "");
                        bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.story.feed.common.b.a.b.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(90061);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                l.d(aVar, "");
                                Aweme aweme = c2;
                                if (aweme == null) {
                                    l.b();
                                }
                                String f2 = f.f(aweme.getScheduleId());
                                String str = this.this$0.this$0.f137654a.d().f137634h;
                                l.b(str, "");
                                h.a(f2, str, "cancel");
                                com.ss.android.ugc.aweme.story.feed.common.a d2 = this.this$0.this$0.f137654a.d();
                                String aid = c2.getAid();
                                l.b(aid, "");
                                d2.b(aid);
                                this.this$0.this$0.f137654a.a().getCount();
                                StoryListProgressBar storyListProgressBar = this.this$0.this$0.f137654a.f137645f;
                                if (storyListProgressBar == null) {
                                    l.a("progressBar");
                                }
                                storyListProgressBar.a(this.this$0.this$0.f137654a.a().getCount());
                                String scheduleId = c2.getScheduleId();
                                l.b(scheduleId, "");
                                l.d(scheduleId, "");
                                com.ss.android.ugc.aweme.story.publish.h.f138142a.removePublishTask(scheduleId);
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }).a(false)).a().b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3617a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137653a;

        static {
            Covode.recordClassIndex(90058);
        }

        View$OnClickListenerC3617a(a aVar) {
            this.f137653a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme c2 = this.f137653a.a().c(this.f137653a.b().getCurrentItem());
            if (com.ss.android.ugc.aweme.story.d.a.h(c2) && c2 != null) {
                String scheduleId = c2.getScheduleId();
                int i2 = 0;
                if (scheduleId != null && scheduleId.length() != 0) {
                    if (c2 != null) {
                        c2.getScheduleId();
                    } else {
                        l.b();
                    }
                    String scheduleId2 = c2.getScheduleId();
                    l.b(scheduleId2, "");
                    l.d(scheduleId2, "");
                    g c3 = f.c(scheduleId2);
                    if (c3 != null && c3.f138141b.f138107b == i.FAILED && com.ss.android.ugc.aweme.story.publish.h.f138142a.retryPublish(scheduleId2)) {
                        c3.f138141b.f138106a = 0.0f;
                        c3.f138141b.a("");
                        c3.f138141b.a(i.UPLOADING);
                        f.f138115e = true;
                        List<g> list = f.f138116f;
                        if (list == null) {
                            i2 = 1;
                        } else if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            i2 = 0;
                            while (it.hasNext()) {
                                if (it.next().f138141b.f138107b == i.UPLOADING && (i2 = i2 + 1) < 0) {
                                    n.b();
                                }
                            }
                        }
                        f.f138114d = i2;
                    }
                    String f2 = f.f(c2.getScheduleId());
                    String str = this.f137653a.d().f137634h;
                    l.b(str, "");
                    h.a(f2, str, "publish");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void b(int i2) {
        Aweme c2 = a().c(i2);
        if (c2 != null) {
            String scheduleId = c2.getScheduleId();
            if (scheduleId == null) {
                scheduleId = "";
            }
            l.d(scheduleId, "");
            List<g> list = f.f138116f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (TextUtils.equals(scheduleId, next.f138140a.getScheduleId())) {
                        e eVar = next.f138141b;
                        if (eVar != null) {
                            int i3 = b.f137655a[eVar.f138107b.ordinal()];
                            if (i3 == 1) {
                                View view = this.f137649j;
                                if (view == null) {
                                    l.a("uploadingBar");
                                }
                                c.a(view, d.UPLOADING, eVar.f138106a, null);
                            } else if (i3 != 2) {
                                View view2 = this.f137649j;
                                if (view2 == null) {
                                    l.a("uploadingBar");
                                }
                                view2.setVisibility(8);
                            } else {
                                View view3 = this.f137649j;
                                if (view3 == null) {
                                    l.a("uploadingBar");
                                }
                                c.a(view3, d.UPLOAD_FAIL, 0.0f, eVar.f138108c);
                                a(c2.getScheduleId());
                            }
                        }
                    }
                }
            }
        } else {
            c2 = null;
        }
        this.p = c2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        int i2;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (d().f137632f != null) {
            String str2 = null;
            if (bVar2 != null && (str = bVar2.f67014a) != null) {
                switch (str.hashCode()) {
                    case -208800987:
                        if (str.equals("UPLOADING_USER_STORY_ALL_SUCCESS")) {
                            if (((Integer) bVar2.a()).intValue() > 1) {
                                i2 = R.string.h6z;
                            } else {
                                i2 = R.string.g8l;
                            }
                            cf cfVar = this.f137646g;
                            if (cfVar == null) {
                                l.a("params");
                            }
                            new com.bytedance.tux.g.b(cfVar.f91768c).e(i2).b();
                            return;
                        }
                        return;
                    case 271694622:
                        if (str.equals("UPLOADING_USER_STORY_FAIL")) {
                            p pVar = (p) bVar2.a();
                            String str3 = (String) pVar.component1();
                            String str4 = (String) pVar.component2();
                            this.f137651l.put(str3, d.UPLOAD_FAIL);
                            Aweme c2 = a().c(b().getCurrentItem());
                            if (com.ss.android.ugc.aweme.story.d.a.h(c2)) {
                                if (h.m.p.a(str3, c2 != null ? c2.getScheduleId() : null, true)) {
                                    View view = this.f137649j;
                                    if (view == null) {
                                        l.a("uploadingBar");
                                    }
                                    c.a(view, d.UPLOAD_FAIL, 0.0f, str4);
                                    if (c2 != null) {
                                        str2 = c2.getScheduleId();
                                    }
                                    a(str2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 1555587043:
                        if (str.equals("UPLOADING_USER_STORY_SUCCESS")) {
                            p pVar2 = (p) bVar2.a();
                            Object first = pVar2.getFirst();
                            Object second = pVar2.getSecond();
                            this.f137650k.put(first, Float.valueOf(1.0f));
                            this.f137651l.put(first, d.UPLOAD_SUCCESS);
                            Aweme c3 = a().c(b().getCurrentItem());
                            if (!com.ss.android.ugc.aweme.story.d.a.h(c3)) {
                                String authorUid = c3 != null ? c3.getAuthorUid() : null;
                                User c4 = in.c();
                                l.b(c4, "");
                                if (!h.m.p.a(authorUid, c4.getUid(), true)) {
                                    return;
                                }
                            }
                            List<Aweme> e2 = a().e();
                            ArrayList arrayList = new ArrayList(n.a((Iterable) e2, 10));
                            for (T t : e2) {
                                if (com.ss.android.ugc.aweme.story.d.a.h(t) && l.a((Object) t.getScheduleId(), first)) {
                                    t = (T) second;
                                }
                                arrayList.add(t);
                            }
                            a().a(arrayList);
                            d().a(b().getCurrentItem(), false);
                            d().a(com.ss.android.ugc.aweme.story.b.g.ON_PUBLISH_SUCCESS, (com.ss.android.ugc.aweme.story.b.a) null);
                            return;
                        }
                        return;
                    case 2005298957:
                        if (str.equals("UPLOADING_LOCAL_VIDEO_READY")) {
                            String str5 = (String) bVar2.a();
                            int currentItem = b().getCurrentItem();
                            Aweme c5 = a().c(currentItem);
                            if (com.ss.android.ugc.aweme.story.d.a.h(c5)) {
                                if (c5 != null) {
                                    str2 = c5.getScheduleId();
                                }
                                if (h.m.p.a(str5, str2, true)) {
                                    aj ajVar = d().f137628b;
                                    if (ajVar != null) {
                                        ajVar.a(c5, this.o);
                                    }
                                    com.ss.android.ugc.aweme.story.feed.common.a d2 = d();
                                    com.ss.android.ugc.aweme.story.b.g gVar = com.ss.android.ugc.aweme.story.b.g.ON_PAGE_SELECTED;
                                    if (c5 == null) {
                                        l.b();
                                    }
                                    d2.a(gVar, new j(c5, d().f137630d, currentItem, a().getCount(), false));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 2025168429:
                        if (str.equals("UPLOADING_USER_STORY_PROGRESS")) {
                            p pVar3 = (p) bVar2.a();
                            String str6 = (String) pVar3.getFirst();
                            float floatValue = ((Number) pVar3.getSecond()).floatValue();
                            this.f137650k.put(str6, Float.valueOf(floatValue));
                            this.f137651l.put(str6, d.UPLOADING);
                            Aweme c6 = a().c(b().getCurrentItem());
                            if (com.ss.android.ugc.aweme.story.d.a.h(c6)) {
                                if (h.m.p.a(str6, c6 != null ? c6.getScheduleId() : null, true)) {
                                    View view2 = this.f137649j;
                                    if (view2 == null) {
                                        l.a("uploadingBar");
                                    }
                                    c.a(view2, d.UPLOADING, floatValue, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void a(Aweme aweme, int i2) {
        l.d(aweme, "");
        c();
        this.f137652m = StoryFeedViewModel.a(aweme);
        this.n = i2;
    }
}
