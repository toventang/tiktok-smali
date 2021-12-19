package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.e;
import com.ss.android.ugc.aweme.ufr.g;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.v;
import java.util.Map;
import java.util.Objects;

public final class d extends ConstraintLayout implements com.ss.android.ugc.aweme.recommend.b {

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.recommend.c f68487g;

    /* renamed from: h  reason: collision with root package name */
    f.a.b.a f68488h;

    /* renamed from: i  reason: collision with root package name */
    String f68489i;

    /* renamed from: j  reason: collision with root package name */
    Map<String, String> f68490j;

    /* renamed from: k  reason: collision with root package name */
    final String f68491k;

    /* renamed from: l  reason: collision with root package name */
    private e f68492l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.inbox.widget.b f68493m;
    private boolean n;
    private SparseArray o;

    static {
        Covode.recordClassIndex(42168);
    }

    private View b(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final View getContainer() {
        return this;
    }

    private final boolean c() {
        com.ss.android.ugc.aweme.inbox.widget.b bVar = this.f68493m;
        if (bVar == null || bVar.f104374b == -1) {
            return false;
        }
        RemoteImageView remoteImageView = (RemoteImageView) b(R.id.d38);
        l.b(remoteImageView, "");
        RemoteImageView remoteImageView2 = (RemoteImageView) b(R.id.d38);
        l.b(remoteImageView2, "");
        ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
        layoutParams.width = bVar.f104374b;
        layoutParams.height = bVar.f104374b;
        remoteImageView.setLayoutParams(layoutParams);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void b() {
        TuxIconView tuxIconView = (TuxIconView) b(R.id.d3_);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void setActionListener(com.ss.android.ugc.aweme.recommend.c cVar) {
        l.d(cVar, "");
        this.f68487g = cVar;
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.f68489i = str;
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void setUFRSubscription(f.a.b.a aVar) {
        l.d(aVar, "");
        this.f68488h = aVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f68494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.recommend.f f68495b;

        static {
            Covode.recordClassIndex(42169);
        }

        a(d dVar, com.ss.android.ugc.aweme.recommend.f fVar) {
            this.f68494a = dVar;
            this.f68495b = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.recommend.c cVar;
            if (((com.ss.android.ugc.aweme.ufr.d) obj).f141689a == g.AUTHORIZED && (cVar = this.f68494a.f68487g) != null) {
                cVar.b(this.f68495b);
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f68496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.recommend.f f68497b;

        static {
            Covode.recordClassIndex(42170);
        }

        b(d dVar, com.ss.android.ugc.aweme.recommend.f fVar) {
            this.f68496a = dVar;
            this.f68497b = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.bytedance.tux.g.b(this.f68496a).e(R.string.cmc).b();
            com.ss.android.ugc.aweme.common.f.a("PermissionItemView", "UFR error!", (Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC1548d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f68500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.recommend.f f68501b;

        static {
            Covode.recordClassIndex(42172);
        }

        View$OnClickListenerC1548d(d dVar, com.ss.android.ugc.aweme.recommend.f fVar) {
            this.f68500a = dVar;
            this.f68501b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.recommend.f fVar = this.f68501b;
            l.d(fVar, "");
            com.ss.android.ugc.aweme.av.a.a().a(fVar, v.a(true, Long.valueOf(System.currentTimeMillis())));
            fVar.name();
            com.ss.android.ugc.aweme.recommend.c cVar = this.f68500a.f68487g;
            if (cVar != null) {
                cVar.c(this.f68501b);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f68498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.recommend.f f68499b;

        static {
            Covode.recordClassIndex(42171);
        }

        c(d dVar, com.ss.android.ugc.aweme.recommend.f fVar) {
            this.f68498a = dVar;
            this.f68499b = fVar;
        }

        public final void onClick(View view) {
            Class<? extends com.ss.android.ugc.aweme.ufr.a> f2;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                com.ss.android.ugc.aweme.recommend.c cVar = this.f68498a.f68487g;
                if (cVar != null) {
                    cVar.a(this.f68499b);
                }
                d dVar = this.f68498a;
                com.ss.android.ugc.aweme.recommend.f fVar = this.f68499b;
                f.a.b.a aVar = dVar.f68488h;
                if (aVar != null) {
                    if (fVar == com.ss.android.ugc.aweme.recommend.f.CONTACT) {
                        f2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.c();
                    } else {
                        f2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.f();
                    }
                    Context context = dVar.getContext();
                    l.b(context, "");
                    User c2 = in.c();
                    l.b(c2, "");
                    f.a.b.b a2 = com.ss.android.ugc.aweme.ufr.b.a(context, f2, c2.getUid(), dVar.f68489i, dVar.f68491k, true, true, dVar.f68490j).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(dVar, fVar), new b(dVar, fVar));
                    l.b(a2, "");
                    f.a.j.a.a(a2, aVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void setUFRExternalParams(Map<String, String> map) {
        l.d(map, "");
        this.f68490j = map;
        if (!this.n && l.a((Object) "bottom", (Object) map.get("position"))) {
            this.n = true;
            TuxButton tuxButton = (TuxButton) b(R.id.d3e);
            l.b(tuxButton, "");
            TuxButton tuxButton2 = (TuxButton) b(R.id.d3e);
            l.b(tuxButton2, "");
            ViewGroup.LayoutParams layoutParams = tuxButton2.getLayoutParams();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
            tuxButton.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10841);
        this.f68489i = "";
        this.f68492l = e.INBOX_SMALL;
        this.f68491k = "click";
        LayoutInflater.from(context).inflate(R.layout.aaq, this);
        setLayoutParams(new ConstraintLayout.a(-1, -2));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        i.a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
        MethodCollector.o(10841);
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void a(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.inbox.widget.b bVar2;
        l.d(bVar, "");
        if (!l.a(this.f68493m, bVar)) {
            this.f68493m = bVar;
            c();
            if (bVar.f104377e != -1) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.inbox.widget.b bVar3 = null;
            if (z) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                ((TuxTextView) b(R.id.d3o)).setTuxFont(bVar2.f104377e);
            }
            if (bVar.f104378f != -1) {
                ((TuxTextView) b(R.id.d3o)).a((float) bVar.f104378f);
            }
            if (bVar.f104379g != -1) {
                bVar3 = bVar;
            }
            if (bVar3 != null) {
                ((TuxTextView) b(R.id.d3d)).setTuxFont(bVar3.f104379g);
            }
            if (bVar.f104380h != -1) {
                ((TuxTextView) b(R.id.d3d)).a((float) bVar.f104380h);
            }
            if (bVar.f104381i != -1) {
                ((TuxTextView) b(R.id.d3d)).setTextColor(bVar.f104381i);
            }
            if (bVar.f104382j != -1) {
                TuxTextView tuxTextView = (TuxTextView) b(R.id.d3d);
                l.b(tuxTextView, "");
                if (tuxTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TuxTextView tuxTextView2 = (TuxTextView) b(R.id.d3d);
                    l.b(tuxTextView2, "");
                    TuxTextView tuxTextView3 = (TuxTextView) b(R.id.d3d);
                    l.b(tuxTextView3, "");
                    ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = bVar.f104382j;
                    tuxTextView2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final void setStyle(e eVar) {
        l.d(eVar, "");
        if (this.f68492l != eVar) {
            this.f68492l = eVar;
            if (!c()) {
                if (e.f68502a[eVar.ordinal()] != 1) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics())));
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    i.a((View) this, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 10.0f, system4.getDisplayMetrics()))), false, 16);
                    RemoteImageView remoteImageView = (RemoteImageView) b(R.id.d38);
                    l.b(remoteImageView, "");
                    RemoteImageView remoteImageView2 = (RemoteImageView) b(R.id.d38);
                    l.b(remoteImageView2, "");
                    ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system5.getDisplayMetrics()));
                    Resources system6 = Resources.getSystem();
                    l.a((Object) system6, "");
                    layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system6.getDisplayMetrics()));
                    remoteImageView.setLayoutParams(layoutParams);
                    return;
                }
                Resources system7 = Resources.getSystem();
                l.a((Object) system7, "");
                Integer valueOf4 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system7.getDisplayMetrics())));
                Resources system8 = Resources.getSystem();
                l.a((Object) system8, "");
                Integer valueOf5 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system8.getDisplayMetrics())));
                Resources system9 = Resources.getSystem();
                l.a((Object) system9, "");
                Integer valueOf6 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system9.getDisplayMetrics())));
                Resources system10 = Resources.getSystem();
                l.a((Object) system10, "");
                i.a((View) this, valueOf4, valueOf5, valueOf6, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system10.getDisplayMetrics()))), false, 16);
                RemoteImageView remoteImageView3 = (RemoteImageView) b(R.id.d38);
                l.b(remoteImageView3, "");
                RemoteImageView remoteImageView4 = (RemoteImageView) b(R.id.d38);
                l.b(remoteImageView4, "");
                ViewGroup.LayoutParams layoutParams2 = remoteImageView4.getLayoutParams();
                Resources system11 = Resources.getSystem();
                l.a((Object) system11, "");
                layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system11.getDisplayMetrics()));
                Resources system12 = Resources.getSystem();
                l.a((Object) system12, "");
                layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system12.getDisplayMetrics()));
                remoteImageView3.setLayoutParams(layoutParams2);
            }
        }
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.recommend.b
    public final void a(com.ss.android.ugc.aweme.recommend.f fVar, e eVar, int i2) {
        int i3;
        l.d(fVar, "");
        if (eVar != null) {
            setStyle(eVar);
        }
        if (fVar == com.ss.android.ugc.aweme.recommend.f.CONTACT) {
            if (i2 == 1 || i2 == 2) {
                i3 = R.raw.icon_color_contact;
            } else {
                i3 = R.raw.icon_color_contact_circle;
            }
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) b(R.id.d38), i3);
            ((TuxTextView) b(R.id.d3o)).setText(R.string.att);
            ((TuxTextView) b(R.id.d3d)).setText(R.string.ats);
        } else if (fVar == com.ss.android.ugc.aweme.recommend.f.FACEBOOK) {
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) b(R.id.d38), (int) R.raw.icon_color_facebook_circle);
            ((TuxTextView) b(R.id.d3o)).setText(R.string.bt2);
            ((TuxTextView) b(R.id.d3d)).setText(R.string.bt1);
        }
        setOnClickListener(new c(this, fVar));
        ((TuxIconView) b(R.id.d3_)).setOnClickListener(new View$OnClickListenerC1548d(this, fVar));
    }
}
