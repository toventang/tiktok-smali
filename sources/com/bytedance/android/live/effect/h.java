package com.bytedance.android.live.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.am;
import com.bytedance.android.livesdk.j.cu;
import com.bytedance.android.livesdk.j.cv;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.u;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class h extends v {

    /* renamed from: c  reason: collision with root package name */
    public static final b f9851c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.effect.api.a.g f9852a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.effect.model.b f9853b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f9854d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f9855e = i.a((h.f.a.a) d.f9864a);

    /* renamed from: f  reason: collision with root package name */
    private a f9856f;

    /* renamed from: g  reason: collision with root package name */
    private int f9857g;

    /* renamed from: h  reason: collision with root package name */
    private float f9858h;

    /* renamed from: i  reason: collision with root package name */
    private float f9859i;

    /* renamed from: j  reason: collision with root package name */
    private float f9860j;

    /* renamed from: k  reason: collision with root package name */
    private final ak.a f9861k = ak.a.PANEL_BEAUTY_FILTER;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f9862l;

    public enum a {
        BEAUTY,
        FILTER;

        static {
            Covode.recordClassIndex(5040);
        }
    }

    static {
        Covode.recordClassIndex(5039);
    }

    private final com.bytedance.android.live.effect.a.a f() {
        return (com.bytedance.android.live.effect.a.a) this.f9854d.getValue();
    }

    private final com.bytedance.android.live.effect.a.b g() {
        return (com.bytedance.android.live.effect.a.b) this.f9855e.getValue();
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f9862l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f9862l == null) {
            this.f9862l = new HashMap();
        }
        View view = (View) this.f9862l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f9862l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(5041);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f9861k;
    }

    static final class d extends m implements h.f.a.a<com.bytedance.android.live.effect.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9864a = new d();

        static {
            Covode.recordClassIndex(5043);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.effect.a.b invoke() {
            return new com.bytedance.android.live.effect.a.b();
        }
    }

    static final class c extends m implements h.f.a.a<com.bytedance.android.live.effect.a.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(5042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.effect.a.a invoke() {
            com.bytedance.android.live.effect.api.a.g gVar = this.this$0.f9852a;
            com.bytedance.android.live.effect.model.b bVar = this.this$0.f9853b;
            com.bytedance.android.live.effect.a.a aVar = new com.bytedance.android.live.effect.a.a();
            aVar.f9631a = gVar;
            aVar.f9632b = bVar;
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b79);
        bVar.f22375b = R.style.a37;
        bVar.f22380g = 80;
        bVar.f22382i = -1;
        bVar.f22385l = 3;
        return bVar;
    }

    public final void e() {
        if (j.b.f9740a.c()) {
            View a_ = a_(R.id.b2m);
            l.b(a_, "");
            a_.setVisibility(0);
            return;
        }
        View a_2 = a_(R.id.b2m);
        l.b(a_2, "");
        a_2.setVisibility(8);
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 21) {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.addFlags(Integer.MIN_VALUE);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                window.setStatusBarColor(0);
            }
        }
    }

    public final void d() {
        a aVar = this.f9856f;
        if (aVar != null) {
            int i2 = i.f9869b[aVar.ordinal()];
            if (i2 == 1) {
                LiveTextView liveTextView = (LiveTextView) a_(R.id.ew4);
                l.b(liveTextView, "");
                liveTextView.setAlpha(0.9f);
                View a_ = a_(R.id.bud);
                l.b(a_, "");
                a_.setAlpha(0.9f);
                View a_2 = a_(R.id.bud);
                l.b(a_2, "");
                a_2.setVisibility(0);
                LiveTextView liveTextView2 = (LiveTextView) a_(R.id.ezh);
                l.b(liveTextView2, "");
                liveTextView2.setAlpha(0.5f);
                View a_3 = a_(R.id.bx1);
                l.b(a_3, "");
                a_3.setVisibility(8);
            } else if (i2 == 2) {
                LiveTextView liveTextView3 = (LiveTextView) a_(R.id.ew4);
                l.b(liveTextView3, "");
                liveTextView3.setAlpha(0.5f);
                View a_4 = a_(R.id.bud);
                l.b(a_4, "");
                a_4.setVisibility(8);
                LiveTextView liveTextView4 = (LiveTextView) a_(R.id.ezh);
                l.b(liveTextView4, "");
                liveTextView4.setAlpha(0.9f);
                View a_5 = a_(R.id.bud);
                l.b(a_5, "");
                a_5.setAlpha(0.9f);
                View a_6 = a_(R.id.bx1);
                l.b(a_6, "");
                a_6.setVisibility(0);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f9867a;

        static {
            Covode.recordClassIndex(5046);
        }

        g(h hVar) {
            this.f9867a = hVar;
        }

        public final void onClick(View view) {
            this.f9867a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f9865a;

        static {
            Covode.recordClassIndex(5044);
        }

        e(h hVar) {
            this.f9865a = hVar;
        }

        public final void onClick(View view) {
            this.f9865a.a(a.BEAUTY);
            this.f9865a.d();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        j.b.f9740a.a(this.p);
    }

    /* renamed from: com.bytedance.android.live.effect.h$h  reason: collision with other inner class name */
    static final class C0150h extends m implements h.f.a.b<FilterModel, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(5047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0150h(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterModel filterModel) {
            l.d(filterModel, "");
            this.this$0.e();
            j jVar = j.b.f9740a;
            jVar.a(this.this$0.p, jVar.f9728a.indexOf(filterModel), false, true);
            return z.f158842a;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f9866a;

        static {
            Covode.recordClassIndex(5045);
        }

        f(h hVar) {
            this.f9866a = hVar;
        }

        public final void onClick(View view) {
            this.f9866a.a(a.FILTER);
            this.f9866a.d();
            View a_ = this.f9866a.a_(R.id.b2m);
            l.b(a_, "");
            a_.setVisibility(8);
            b.a.a("live_take_filter_click").a(this.f9866a.p).c("click").b("live_take").b();
        }
    }

    public final void a(a aVar) {
        if (this.f9856f != aVar) {
            n a2 = getChildFragmentManager().a();
            l.b(a2, "");
            int i2 = i.f9868a[aVar.ordinal()];
            if (i2 == 1) {
                Fragment a3 = getChildFragmentManager().a("PreViewFilterFragment");
                if (a3 != null) {
                    a2.b(a3);
                }
                Fragment a4 = getChildFragmentManager().a("PreViewBeautyFragment");
                if (a4 == null) {
                    a2.a(R.id.ae6, f(), "PreViewBeautyFragment");
                } else {
                    a2.c(a4);
                }
            } else if (i2 == 2) {
                Fragment a5 = getChildFragmentManager().a("PreViewBeautyFragment");
                if (a5 != null) {
                    a2.b(a5);
                }
                Fragment a6 = getChildFragmentManager().a("PreViewFilterFragment");
                if (a6 == null) {
                    a2.a(R.id.ae6, g(), "PreViewFilterFragment");
                } else {
                    a2.c(a6);
                }
            }
            a2.e();
            this.f9856f = aVar;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        User owner;
        if (p.c()) {
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
            l.b(bVar, "");
            Integer a2 = bVar.a();
            List<FilterModel> list = j.b.f9740a.f9728a;
            l.b(list, "");
            if (a2.intValue() < list.size()) {
                l.b(a2, "");
                FilterModel filterModel = list.get(a2.intValue());
                l.b(filterModel, "");
                str = filterModel.getFilterId();
            } else {
                str = "";
            }
            Object b2 = DataChannelGlobal.f34575d.b(am.class);
            if (b2 == null) {
                b2 = "";
            }
            u uVar = (u) DataChannelGlobal.f34575d.b(cv.class);
            String str2 = null;
            if (uVar == null || uVar.getFirst() == null || !l.a((Object) str, uVar.getFirst())) {
                if (!com.bytedance.common.utility.m.a(str) && (!l.a((Object) str, (Object) "0")) && a2.intValue() != this.f9857g) {
                    Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    com.bytedance.android.livesdk.ab.b a3 = b.a.a("live_take_filter_select").a(this.p).b("live_take").f("click").a("filter_id", str).a("is_live_take_default", l.a(b2, str) ? 1 : 0).a("impr_position", a2.intValue() + 1);
                    if (!(room == null || (owner = room.getOwner()) == null)) {
                        str2 = owner.getIdStr();
                    }
                    a3.g(str2).b();
                    DataChannelGlobal.f34575d.c(am.class);
                    DataChannelGlobal.f34575d.a(cv.class, new u(str, Float.valueOf(j.b.f9740a.a(str)), Long.valueOf(System.currentTimeMillis())));
                    c.a.b("ttlive_click_change_filter").b("preview").a("select_filter_id", str).a("select_filter_position", a2).a();
                }
                l.b(str, "");
                b.b(str);
            }
        }
        com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.Q;
        l.b(bVar2, "");
        Float a4 = bVar2.a();
        com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.R;
        l.b(bVar3, "");
        Float a5 = bVar3.a();
        com.bytedance.android.livesdk.ap.b<Float> bVar4 = com.bytedance.android.livesdk.ap.a.S;
        l.b(bVar4, "");
        Float a6 = bVar4.a();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(cu.class);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!l.a(this.f9858h, a4)) {
            b bVar5 = b.f9657a;
            l.b(a4, "");
            bVar5.a("smooth", a4.floatValue(), 1, l.a(a4, LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18949b));
            com.bytedance.android.livesdkapi.depend.model.a aVar = new com.bytedance.android.livesdkapi.depend.model.a();
            aVar.f22995a = 1111;
            concurrentHashMap.put("smooth", new com.bytedance.android.livesdk.ab.c.d(aVar, a4.floatValue(), currentTimeMillis));
        }
        if (!l.a(this.f9859i, a5)) {
            b bVar6 = b.f9657a;
            l.b(a5, "");
            bVar6.a("enlarge_eyes", a5.floatValue(), 2, l.a(a5, LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b));
            com.bytedance.android.livesdkapi.depend.model.a aVar2 = new com.bytedance.android.livesdkapi.depend.model.a();
            aVar2.f22995a = 1112;
            concurrentHashMap.put("enlarge_eyes", new com.bytedance.android.livesdk.ab.c.d(aVar2, a5.floatValue(), currentTimeMillis));
        }
        if (!l.a(this.f9860j, a6)) {
            b bVar7 = b.f9657a;
            l.b(a6, "");
            bVar7.a("reshaping", a6.floatValue(), 3, l.a(a6, LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b));
            com.bytedance.android.livesdkapi.depend.model.a aVar3 = new com.bytedance.android.livesdkapi.depend.model.a();
            aVar3.f22995a = 1112;
            concurrentHashMap.put("reshaping", new com.bytedance.android.livesdk.ab.c.d(aVar3, a6.floatValue(), currentTimeMillis));
        }
        DataChannelGlobal.f34575d.a(cu.class, concurrentHashMap);
        com.bytedance.android.livesdk.ap.b<Integer> bVar8 = com.bytedance.android.livesdk.ap.a.O;
        l.b(bVar8, "");
        Integer a7 = bVar8.a();
        List<FilterModel> list2 = j.b.f9740a.f9728a;
        l.b(a7, "");
        FilterModel filterModel2 = list2.get(a7.intValue());
        l.b(filterModel2, "");
        String filterId = filterModel2.getFilterId();
        float a8 = j.b.f9740a.a(filterId);
        if (p.c()) {
            DataChannelGlobal.f34575d.a(am.class, filterId);
        }
        if (p.d()) {
            l.b(filterId, "");
            b.b(filterId);
        }
        DataChannelGlobal.f34575d.a(cv.class, new u(filterId, Float.valueOf(a8), Long.valueOf(System.currentTimeMillis())));
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
        l.b(bVar, "");
        Integer a2 = bVar.a();
        l.b(a2, "");
        this.f9857g = a2.intValue();
        com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.Q;
        l.b(bVar2, "");
        Float a3 = bVar2.a();
        l.b(a3, "");
        this.f9858h = a3.floatValue();
        com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.R;
        l.b(bVar3, "");
        Float a4 = bVar3.a();
        l.b(a4, "");
        this.f9859i = a4.floatValue();
        com.bytedance.android.livesdk.ap.b<Float> bVar4 = com.bytedance.android.livesdk.ap.a.S;
        l.b(bVar4, "");
        Float a5 = bVar4.a();
        l.b(a5, "");
        this.f9860j = a5.floatValue();
        ((ConstraintLayout) a_(R.id.x7)).setOnClickListener(new e(this));
        ((ConstraintLayout) a_(R.id.x9)).setOnClickListener(new f(this));
        a_(R.id.an1).setOnClickListener(new g(this));
        a aVar = this.f9856f;
        this.f9856f = null;
        if (aVar == null) {
            aVar = a.BEAUTY;
        }
        a(aVar);
        d();
        e();
        DataChannel a6 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a6 != null) {
            a6.a((androidx.lifecycle.m) this, l.class, (h.f.a.b) new C0150h(this));
        }
    }
}
