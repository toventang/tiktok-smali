package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.a.g;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.d.z;
import com.bytedance.android.live.liveinteract.cohost.ui.a.a;
import com.bytedance.android.live.liveinteract.cohost.ui.view.RandomLinkMicMatchViewPager;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class f extends v implements g.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10281e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g.a f10282a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends ImageModel> f10283b = z.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    public int f10284c = 2;

    /* renamed from: d  reason: collision with root package name */
    public p<? extends a.g, Long> f10285d;

    /* renamed from: f  reason: collision with root package name */
    private LiveTextView f10286f;

    /* renamed from: g  reason: collision with root package name */
    private final a.AbstractC0160a f10287g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private HashMap f10288h;

    static {
        Covode.recordClassIndex(5422);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f10288h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f10288h == null) {
            this.f10288h = new HashMap();
        }
        View view = (View) this.f10288h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f10288h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5423);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7x);
        bVar.f22380g = 80;
        bVar.f22379f = 0.0f;
        bVar.f22381h = -1;
        bVar.f22382i = -2;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        g.a aVar = this.f10282a;
        if (aVar != null) {
            aVar.b();
        }
        com.bytedance.android.live.liveinteract.cohost.a.c.a.b(this.f10287g);
        a();
    }

    public static final class b extends a.AbstractC0160a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f10289a;

        static {
            Covode.recordClassIndex(5424);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f10289a = fVar;
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.c.a.AbstractC0160a
        public final void a(p<? extends a.g, Long> pVar) {
            l.d(pVar, "");
            this.f10289a.a(pVar);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f10290a;

        static {
            Covode.recordClassIndex(5425);
        }

        c(f fVar) {
            this.f10290a = fVar;
        }

        public final void onClick(View view) {
            g.a aVar = this.f10290a.f10282a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void a(p<? extends a.g, Long> pVar) {
        LiveTextView liveTextView = this.f10286f;
        if (liveTextView != null) {
            liveTextView.setText(z.a.a(pVar));
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f10291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RandomLinkMicMatchViewPager f10292b;

        static {
            Covode.recordClassIndex(5426);
        }

        d(f fVar, RandomLinkMicMatchViewPager randomLinkMicMatchViewPager) {
            this.f10291a = fVar;
            this.f10292b = randomLinkMicMatchViewPager;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10291a.f10284c++;
            RandomLinkMicMatchViewPager randomLinkMicMatchViewPager = this.f10292b;
            l.b(randomLinkMicMatchViewPager, "");
            randomLinkMicMatchViewPager.setCurrentItem(this.f10291a.f10284c);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        f.a.b.b d2;
        g.a aVar;
        List g2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f10285d == null) {
            dismiss();
        }
        b.a.a("livesdk_cancel_connection_popup_show").a().a("waiting_time", com.bytedance.android.live.liveinteract.cohost.a.c.a.f10046c * 1000).a("enter_from", "connection_icon").a("invitee_list", w.a(m.RANDOM_LINK_MIC_INVITE)).b();
        com.bytedance.android.live.liveinteract.cohost.a.d.z zVar = new com.bytedance.android.live.liveinteract.cohost.a.d.z(this.p);
        l.d(this, "");
        zVar.f10160a = this;
        this.f10282a = zVar;
        this.f10286f = (LiveTextView) view.findViewById(R.id.f5d);
        p<? extends a.g, Long> pVar = this.f10285d;
        if (pVar == null) {
            l.b();
        }
        a(pVar);
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f5_);
        if (liveTextView != null) {
            liveTextView.setOnClickListener(new c(this));
        }
        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(this.f10287g);
        Context context = view.getContext();
        l.b(context, "");
        LayoutInflater from = LayoutInflater.from(getContext());
        l.b(from, "");
        com.bytedance.android.live.liveinteract.cohost.ui.a.a aVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.a.a(context, from);
        RandomLinkMicMatchViewPager randomLinkMicMatchViewPager = (RandomLinkMicMatchViewPager) view.findViewById(R.id.fks);
        randomLinkMicMatchViewPager.setClickable(false);
        randomLinkMicMatchViewPager.setPageMargin(-((int) (((float) y.c()) / 1.25f)));
        randomLinkMicMatchViewPager.setOffscreenPageLimit(2);
        l.b(randomLinkMicMatchViewPager, "");
        if (this.f10283b.size() >= 10) {
            z = true;
        } else {
            z = false;
        }
        randomLinkMicMatchViewPager.setPageTransformer(false, new a.C0167a(randomLinkMicMatchViewPager, z));
        List<? extends ImageModel> list = this.f10283b;
        if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
            aVar2.f10231a.clear();
            aVar2.f10231a.addAll(g2);
        }
        randomLinkMicMatchViewPager.setAdapter(aVar2);
        randomLinkMicMatchViewPager.setCurrentItem(this.f10284c);
        if (this.f10283b.size() >= 10 && (d2 = com.bytedance.android.livesdk.utils.b.b.b(2300, TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new d(this, randomLinkMicMatchViewPager))) != null && (aVar = this.f10282a) != null) {
            aVar.a(d2);
        }
    }
}
