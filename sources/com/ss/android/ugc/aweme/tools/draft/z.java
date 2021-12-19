package com.ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.e;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.facebook.common.h.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.experiment.cf;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.aa;
import com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder;
import com.ss.android.ugc.aweme.tools.draft.c.b;
import com.ss.android.ugc.aweme.utils.dt;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.c.d;
import h.c.g;
import h.f.b.l;
import h.p;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class z extends x implements AwemeDraftViewHolder.a {

    /* renamed from: b  reason: collision with root package name */
    ButtonTitleBar f139956b;

    /* renamed from: c  reason: collision with root package name */
    DmtStatusView f139957c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f139958d;

    /* renamed from: e  reason: collision with root package name */
    TextView f139959e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f139960f;

    /* renamed from: g  reason: collision with root package name */
    FrameLayout f139961g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f139962h;

    /* renamed from: i  reason: collision with root package name */
    public g f139963i;

    /* renamed from: j  reason: collision with root package name */
    public Set<c> f139964j = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    boolean f139965k;

    /* renamed from: l  reason: collision with root package name */
    ObjectAnimator f139966l;

    /* renamed from: m  reason: collision with root package name */
    public b f139967m;
    public Map<c, List<? extends Effect>> n = new LinkedHashMap();
    public t<Boolean> o = new t<>();
    public Map<c, Boolean> p = new HashMap();
    private View q;
    private boolean r;
    private Map<ImageView, a<com.facebook.imagepipeline.j.c>> s = new WeakHashMap();
    private ObjectAnimator t;
    private long u;
    private int v = 0;
    private IDraftService.DraftListener w = new IDraftService.DraftListenerAdapter() {
        /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass1 */

        static {
            Covode.recordClassIndex(91464);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(c cVar) {
            if (z.this.f104785a) {
                z.this.f139963i.b(cVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(c cVar) {
            LighteningExtraInfo lighteningExtraInfo;
            if (cVar != null) {
                z.this.f139963i.a(cVar.r());
                if (cVar.t() && com.ss.android.ugc.gamora.editor.lightening.a.c() && (lighteningExtraInfo = cVar.W.bp) != null) {
                    String scheduleId = lighteningExtraInfo.getScheduleId();
                    if (!TextUtils.isEmpty(scheduleId)) {
                        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().a(scheduleId);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftCheckedChanged(c cVar, boolean z) {
            String string;
            if (z) {
                z.this.f139964j.add(cVar);
            } else {
                z.this.f139964j.remove(cVar);
            }
            z.this.f139959e.setText(com.a.a(z.this.getString(R.string.yk), new Object[]{Integer.valueOf(z.this.f139964j.size())}));
            if (z.this.f139962h) {
                TextView textView = z.this.f139960f;
                z zVar = z.this;
                long j2 = 0;
                for (c cVar2 : zVar.f139964j) {
                    j2 += cVar2.C;
                }
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMaximumFractionDigits(1);
                if (j2 / 1073741824 > 1) {
                    string = zVar.getString(R.string.fpv, decimalFormat.format((double) ((((float) j2) * 1.0f) / 1.07374182E9f)));
                } else {
                    string = zVar.getString(R.string.fpu, decimalFormat.format((double) ((((float) j2) * 1.0f) / 1048576.0f)));
                }
                textView.setText(string);
            }
            if (z.this.f139964j.size() <= 0) {
                z.this.h();
            } else if (z.this.f139961g.getVisibility() != 0) {
                z zVar2 = z.this;
                if (zVar2.f139961g.getVisibility() != 0) {
                    zVar2.f139966l = ObjectAnimator.ofFloat(zVar2.f139961g, "translationY", (float) zVar2.f139961g.getMeasuredHeight(), 0.0f).setDuration(200L);
                    zVar2.f139966l.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(91471);
                        }

                        public final void onAnimationStart(Animator animator) {
                            z.this.f139961g.setVisibility(0);
                        }
                    });
                    zVar2.f139966l.start();
                }
            }
        }
    };
    private Map<c, List<StickerItemModel>> x;
    private boolean y;
    private LinearLayoutManager z;

    static {
        Covode.recordClassIndex(91463);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.a
    public final void a(View view, c cVar) {
    }

    private IDraftService.DraftListener n() {
        return new IDraftService.DraftListenerAdapter() {
            /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass5 */

            static {
                Covode.recordClassIndex(91470);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
            public final void onDraftUpdate(c cVar) {
                z.this.c();
            }
        };
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void l() {
        this.y = false;
        this.f139957c.setVisibility(8);
    }

    public final void c() {
        this.f139957c.f();
        com.ss.android.ugc.aweme.tools.b.f138752a.execute(new ac(this));
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private String m() {
        if (this.f139962h) {
            return "storage_management";
        }
        if (this.v == 1) {
            return "video_shoot_page";
        }
        return "personal_homepage";
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.x
    public final void b() {
        l();
        if (this.f139965k) {
            this.f139965k = false;
            h();
            g();
            return;
        }
        i();
    }

    public final void e() {
        if (this.y) {
            l();
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.axa).a();
        }
    }

    public final void d() {
        Map<c, List<StickerItemModel>> map = this.x;
        if (map == null || map.isEmpty()) {
            fb.a(this.o, true);
        } else {
            this.f139967m.a(this.x, new dt<Map<c, ? extends List<? extends Effect>>>() {
                /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(91466);
                }

                @Override // h.c.d
                public final h.c.f getContext() {
                    return g.INSTANCE;
                }

                @Override // com.ss.android.ugc.aweme.utils.dt
                public final void a(Throwable th) {
                    fb.a(z.this.o, false);
                    q.b("DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : " + q.b(th));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.utils.dt
                public final /* synthetic */ void a(Map<c, ? extends List<? extends Effect>> map) {
                    for (Map.Entry<c, ? extends List<? extends Effect>> entry : map.entrySet()) {
                        final c key = entry.getKey();
                        List list = (List) entry.getValue();
                        l.d(list, "");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (!b.a((Effect) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        z.a(key, list);
                        z.this.n.put(key, arrayList);
                        if (arrayList.isEmpty()) {
                            z.this.p.put(key, true);
                        } else {
                            z.this.f139967m.a(new p<>(key, arrayList), false, (d<? super p<? extends c, Boolean>>) new dt<p<? extends c, ? extends Boolean>>() {
                                /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass3.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(91467);
                                }

                                @Override // h.c.d
                                public final h.c.f getContext() {
                                    return g.INSTANCE;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // com.ss.android.ugc.aweme.utils.dt
                                public final /* synthetic */ void a(p<? extends c, ? extends Boolean> pVar) {
                                    p<? extends c, ? extends Boolean> pVar2 = pVar;
                                    z.this.p.put(pVar2.getFirst(), pVar2.getSecond());
                                }

                                @Override // com.ss.android.ugc.aweme.utils.dt
                                public final void a(Throwable th) {
                                    q.b("DraftBoxFragment : refreshDraftList , downloadEffect --- resumeWithException : " + q.b(th));
                                    z.this.p.put(key, false);
                                }
                            });
                        }
                    }
                    fb.a(z.this.o, true);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        aa.a(getContext(), getContext().getResources().getQuantityString(R.plurals.b4, this.f139964j.size()), getString(R.string.bcm), new ah(this), getString(R.string.bcn));
    }

    public final void h() {
        this.f139964j.clear();
        if (this.f139961g.getVisibility() != 8) {
            FrameLayout frameLayout = this.f139961g;
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "translationY", (float) frameLayout.getMeasuredHeight()).setDuration(200L);
            this.t = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(91472);
                }

                public final void onAnimationEnd(Animator animator) {
                    z.this.f139961g.setVisibility(8);
                }
            });
            this.t.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z j() {
        r.a("delete_drafts", new com.ss.android.ugc.tools.f.b().a("enter_method", "batch_select").a("draft_cnt", this.f139964j.size()).a("enter_from", m()).f149193a);
        this.f139963i.b();
        h();
        this.f139965k = false;
        g();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        for (a<com.facebook.imagepipeline.j.c> aVar : this.s.values()) {
            aVar.close();
        }
        this.s.clear();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tools.draft.x
    public final void onDestroyView() {
        com.ss.android.ugc.aweme.tools.draft.j.c.a().unregisterDraftListener(this.w);
        ObjectAnimator objectAnimator = this.t;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.t.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f139966l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f139966l.cancel();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        g gVar;
        super.onStart();
        h();
        if (!com.ss.android.ugc.aweme.port.in.g.a().c().d()) {
            com.ss.android.ugc.aweme.port.in.g.a().c().a(true);
            return;
        }
        if ((!bg.a() || !cf.a()) && (gVar = this.f139963i) != null) {
            gVar.c();
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (this.f139965k) {
            this.f139956b.getEndBtn().setTextColor(getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66308b));
            this.f139956b.getEndBtn().setText(getText(R.string.yi));
            this.f139956b.getStartBtn().setVisibility(8);
            this.f139956b.getTitleView().setVisibility(8);
        } else {
            this.f139956b.getEndBtn().setTextColor(getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66307a));
            this.f139956b.getEndBtn().setText(getText(R.string.yj));
            this.f139956b.getStartBtn().setVisibility(0);
            this.f139956b.getTitleView().setVisibility(0);
            h();
        }
        this.f139963i.a(this.f139965k);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(getActivity());
    }

    /* access modifiers changed from: package-private */
    public final void a(List<c> list) {
        i.b(new ad(this, list), i.f4826c).a(new ae(this), i.f4824a, null);
    }

    /* access modifiers changed from: package-private */
    public final void b(List<c> list) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : list) {
            if (cVar.W.aE) {
                arrayList.add(cVar);
            }
        }
        if (!arrayList.isEmpty()) {
            c(arrayList);
        }
    }

    private void c(List<c> list) {
        InfoStickerModel j2;
        List<StickerItemModel> list2;
        l.d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : list) {
            if (!(!t2.W.aE || (j2 = t2.j()) == null || (list2 = j2.stickers) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t3 : list2) {
                    T t4 = t3;
                    if (t4.type == 0 && !TextUtils.isEmpty(t4.stickerId)) {
                        arrayList.add(t3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!(arrayList2 == null || arrayList2.isEmpty() || arrayList2 == null)) {
                    linkedHashMap.put(t2, arrayList2);
                }
            }
        }
        this.x = linkedHashMap;
        for (Object obj : linkedHashMap.keySet()) {
            Boolean bool = this.p.get(obj);
            if (bool != null && bool.booleanValue()) {
                this.x.remove(obj);
            }
        }
        for (c cVar : list) {
            if (this.x.containsKey(cVar)) {
                this.p.put(cVar, false);
            } else {
                this.p.put(cVar, true);
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) {
        List<c> list = (List) iVar.d();
        if (com.ss.android.ugc.tools.utils.d.a(list)) {
            return null;
        }
        int size = list.size();
        if (!this.r) {
            r.a("click_draft_entrance", new com.ss.android.ugc.tools.f.b().a("draft_cnt", size).a("enter_from", m()).f149193a);
            this.r = true;
        }
        long j2 = 0;
        if (this.u != 0) {
            r.a("tool_performance_draft_preview_list", new com.ss.android.ugc.tools.f.b().a("count", list.size()).a("duration", System.currentTimeMillis() - this.u).f149193a);
            this.u = 0;
        }
        for (c cVar : list) {
            com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
            aVar.a(cVar);
            if (cVar.W.ao != null) {
                j2 += aVar.a();
            }
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_draft_info", new com.ss.android.ugc.tools.f.b().a("count", list.size()).a("storage_size", j2).f149193a);
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0082 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.ss.android.ugc.aweme.tools.draft.z] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.z.a(java.lang.String):void");
    }

    public final void a(c cVar, long j2) {
        if (this.y) {
            l();
            ak.a(getActivity(), cVar, this.v, j2, n());
        }
    }

    public static void a(c cVar, List<? extends Effect> list) {
        List<StickerItemModel> list2;
        InfoStickerModel j2 = cVar.j();
        if (!(j2 == null || (list2 = j2.stickers) == null || list2.isEmpty())) {
            for (StickerItemModel stickerItemModel : list2) {
                Iterator<? extends Effect> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    EffectTemplate effectTemplate = (EffectTemplate) it.next();
                    if (stickerItemModel.stickerId.equals(effectTemplate.getEffectId()) && !stickerItemModel.path.equals(effectTemplate.getUnzipPath())) {
                        stickerItemModel.path = effectTemplate.getUnzipPath();
                        break;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.a
    public final void a(int i2, final c cVar) {
        if (cVar != null) {
            q.a("draft onEdit: position " + i2 + ", draftId " + cVar.f83180a);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (cVar == null || cVar.W.aE) {
            Boolean bool = this.p.get(cVar);
            if (bool == null || !bool.booleanValue()) {
                getContext();
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = k();
                }
                if (!j.f107226e) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.axb).a();
                    return;
                }
                this.y = true;
                this.f139957c.f();
                this.o.observe(this, new u<Boolean>() {
                    /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(91468);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(Boolean bool) {
                        Boolean bool2 = bool;
                        if (bool2 != null) {
                            z.this.o.removeObserver(this);
                            if (bool2.booleanValue()) {
                                Boolean bool3 = z.this.p.get(cVar);
                                if (bool3 == null || !bool3.booleanValue()) {
                                    List<? extends Effect> list = z.this.n.get(cVar);
                                    if (list == null || list.isEmpty()) {
                                        z.this.a(cVar, currentTimeMillis);
                                        return;
                                    }
                                    z.this.f139967m.a(new p<>(cVar, list), true, (d<? super p<? extends c, Boolean>>) new dt<p<? extends c, ? extends Boolean>>() {
                                        /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass4.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(91469);
                                        }

                                        @Override // h.c.d
                                        public final h.c.f getContext() {
                                            return g.INSTANCE;
                                        }

                                        @Override // com.ss.android.ugc.aweme.utils.dt
                                        public final void a(Throwable th) {
                                            q.b("DraftBoxFragment : onEdit , downloadEffect --- resumeWithException : " + q.b(th));
                                            z.this.e();
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // com.ss.android.ugc.aweme.utils.dt
                                        public final /* synthetic */ void a(p<? extends c, ? extends Boolean> pVar) {
                                            p<? extends c, ? extends Boolean> pVar2 = pVar;
                                            if (((Boolean) pVar2.getSecond()).booleanValue()) {
                                                z.this.p.put(pVar2.getFirst(), pVar2.getSecond());
                                                z.this.a(cVar, currentTimeMillis);
                                                return;
                                            }
                                            z.this.e();
                                        }
                                    });
                                    return;
                                }
                                z.this.a(cVar, currentTimeMillis);
                                return;
                            }
                            z.this.d();
                            z.this.e();
                        }
                    }
                });
                return;
            }
            ak.a(getActivity(), cVar, this.v, currentTimeMillis, n());
            return;
        }
        ak.a(getActivity(), cVar, this.v, currentTimeMillis, n());
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i2 = Build.VERSION.SDK_INT;
        e activity = getActivity();
        if (activity != null) {
            this.q.getLayoutParams().height = com.bytedance.ies.uikit.c.a.a(activity);
        }
        this.f139956b.setTitle(getText(R.string.bcj));
        this.f139956b.getStartBtn().setVisibility(0);
        this.f139956b.getEndBtn().setVisibility(0);
        this.f139956b.getEndBtn().setTextColor(getResources().getColor(com.ss.android.ugc.aweme.ah.a.f66307a));
        this.f139956b.getEndBtn().setText(getText(R.string.yj));
        this.f139956b.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        this.f139956b.getEndBtn().setBackgroundColor(0);
        new SafeHandler(getActivity()).post(new af(this));
        this.f139958d.setOverScrollMode(2);
        if (cf.a()) {
            getActivity();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager();
            this.z = wrapGridLayoutManager;
            this.f139958d.setLayoutManager(wrapGridLayoutManager);
            this.f139958d.a(new au((int) n.b(getContext(), 1.0f)));
            this.f139963i = new n(this.s, this);
        } else {
            getActivity();
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
            this.z = wrapLinearLayoutManager;
            this.f139958d.setLayoutManager(wrapLinearLayoutManager);
            this.f139958d.a(new com.ss.android.ugc.aweme.tools.draft.l.c(androidx.core.content.b.c(getContext(), R.color.c9), (int) n.b(getActivity(), 0.0f), n.b(getActivity(), 0.0f), n.b(getActivity(), 0.0f)));
            this.f139963i = new a(this.s, this);
        }
        aw.f139418b = this.z.s();
        this.f139963i.b(this.f139962h);
        this.f139963i.d(false);
        this.f139963i.a(new ag(this));
        this.f139958d.setAdapter(this.f139963i);
        this.f139957c.setBuilder(DmtStatusView.a.a(getContext()));
        this.f139956b.getEndBtn().setTypeface(Typeface.create(this.f139956b.getEndBtn().getTypeface(), 0), 0);
        this.f139956b.getEndBtn().setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
        this.f139956b.getEndBtn().setTextSize(1, 17.0f);
        this.f139956b.getTitleView().setTextSize(1, 17.0f);
        com.ss.android.ugc.aweme.tools.draft.j.c.a().registerDraftListener(this.w);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f139962h = arguments.getBoolean("is_disk_manage_mode", false);
        }
        this.f139967m = new b(this);
        aw.f139419c = true;
        View a2 = com.a.a(layoutInflater, R.layout.a0w, viewGroup, false);
        this.f139956b = (ButtonTitleBar) v.c(a2, (int) R.id.em8);
        this.q = v.c(a2, (int) R.id.e_f);
        this.f139957c = (DmtStatusView) v.c(a2, (int) R.id.ape);
        this.f139958d = (RecyclerView) v.c(a2, (int) R.id.djs);
        this.f139959e = (TextView) v.c(a2, (int) R.id.ey_);
        if (this.f139962h) {
            if (this.f139960f == null) {
                TextView textView = (TextView) v.c(a2, (int) R.id.ezt);
                this.f139960f = textView;
                textView.setVisibility(0);
            }
            this.f139960f.setVisibility(0);
        }
        FrameLayout frameLayout = (FrameLayout) v.c(a2, (int) R.id.c5c);
        this.f139961g = frameLayout;
        if (this.f139962h) {
            frameLayout.setOnClickListener(new aa(this));
        }
        if (this.f139962h) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f139961g.getLayoutParams();
            layoutParams.height = Math.round(n.b(getContext(), 60.0f));
            this.f139961g.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f139959e.getLayoutParams();
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = 0;
            this.f139959e.setLayoutParams(layoutParams2);
        }
        this.f139956b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.tools.draft.z.AnonymousClass2 */

            static {
                Covode.recordClassIndex(91465);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                z.this.i();
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                z zVar = z.this;
                zVar.f139965k = !zVar.f139965k;
                zVar.g();
            }
        });
        this.f139959e.setOnClickListener(new ab(this));
        return a2;
    }
}
