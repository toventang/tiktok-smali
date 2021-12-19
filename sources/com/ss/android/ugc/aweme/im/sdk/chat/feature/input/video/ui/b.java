package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.ies.foundation.fragment.a implements DialogInterface.OnDismissListener {

    /* renamed from: j  reason: collision with root package name */
    public static final a f100817j = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f100818e;

    /* renamed from: f  reason: collision with root package name */
    public ProgressBar f100819f;

    /* renamed from: g  reason: collision with root package name */
    public View f100820g;

    /* renamed from: h  reason: collision with root package name */
    public View f100821h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC2495b f100822i;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f100823k;

    /* renamed from: l  reason: collision with root package name */
    private TuxDualBallView f100824l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f100825m;
    private final h.h n = h.i.a((h.f.a.a) new n(this));
    private final k o = new k(this);
    private final h.h p = h.i.a((h.f.a.a) m.f100846a);
    private HashMap q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$b  reason: collision with other inner class name */
    public interface AbstractC2495b {
        static {
            Covode.recordClassIndex(64500);
        }

        void a(Aweme aweme, c cVar);
    }

    static {
        Covode.recordClassIndex(64498);
    }

    private final long e() {
        return ((Number) this.p.getValue()).longValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.q == null) {
            this.q = new HashMap();
        }
        View view = (View) this.q.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.q.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final FavoriteVideoPickerViewModel c() {
        return (FavoriteVideoPickerViewModel) this.n.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64499);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f100826a;

        static {
            Covode.recordClassIndex(64501);
        }

        public static final class a extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final a f100827b = new a();

            private a() {
                super("detail", (byte) 0);
            }

            static {
                Covode.recordClassIndex(64502);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b$c$b  reason: collision with other inner class name */
        public static final class C2496b extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final C2496b f100828b = new C2496b();

            private C2496b() {
                super("panel", (byte) 0);
            }

            static {
                Covode.recordClassIndex(64503);
            }
        }

        private c(String str) {
            this.f100826a = str;
        }

        public /* synthetic */ c(String str, byte b2) {
            this(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        e();
    }

    static final class m extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f100846a = new m();

        static {
            Covode.recordClassIndex(64513);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<FavoriteVideoPickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FavoriteVideoPickerViewModel invoke() {
            b bVar = this.this$0;
            h.f.b.l.d(bVar, "");
            ac a2 = ae.a(bVar, (ad.b) null).a(FavoriteVideoPickerViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public static final class k extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100843a;

        static {
            Covode.recordClassIndex(64511);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(b bVar) {
            this.f100843a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            int i4;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int m2 = ((LinearLayoutManager) layoutManager).m() + 1;
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i4 = adapter.getItemCount() - 6;
            } else {
                i4 = 0;
            }
            if (m2 >= i4) {
                FavoriteVideoPickerViewModel c2 = this.f100843a.c();
                if ((!h.f.b.l.a((Object) c2.f100797b.getValue(), (Object) true)) && c2.f100796a >= 0) {
                    c2.a();
                }
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100842a;

        static {
            Covode.recordClassIndex(64510);
        }

        j(b bVar) {
            this.f100842a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.b.a(this.f100842a, c.d.f45284a);
        }
    }

    public static final /* synthetic */ RecyclerView a(b bVar) {
        RecyclerView recyclerView = bVar.f100818e;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        return recyclerView;
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f100839b;

        static {
            Covode.recordClassIndex(64508);
        }

        h(b bVar, View view) {
            this.f100838a = bVar;
            this.f100839b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((com.ss.android.ugc.aweme.im.sdk.common.data.a.c) obj).a() != null) {
                new com.bytedance.tux.g.b(this.f100839b).e(R.string.fl3).a(3000L).b();
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f100841b;

        static {
            Covode.recordClassIndex(64509);
        }

        i(b bVar, View view) {
            this.f100840a = bVar;
            this.f100841b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC2495b bVar;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a) obj;
            if (aVar != null && (bVar = this.f100840a.f100822i) != null) {
                bVar.a(aVar.f100791a, aVar.f100792b);
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f100830b;

        static {
            Covode.recordClassIndex(64504);
        }

        d(b bVar, View view) {
            this.f100829a = bVar;
            this.f100830b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            List<? extends Aweme> list = (List) obj;
            View view = this.f100829a.f100821h;
            if (view == null) {
                h.f.b.l.a("emptyView");
            }
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            RecyclerView.a adapter = b.a(this.f100829a).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerAdapter");
            a aVar = (a) adapter;
            h.f.b.l.b(list, "");
            h.f.b.l.d(list, "");
            aVar.f100812a = list;
            aVar.notifyDataSetChanged();
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f100835b;

        static {
            Covode.recordClassIndex(64506);
        }

        f(b bVar, View view) {
            this.f100834a = bVar;
            this.f100835b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView.a adapter = b.a(this.f100834a).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerAdapter");
            a aVar = (a) adapter;
            int i2 = aVar.f100813b;
            aVar.f100813b = h.a.n.a((List) aVar.f100812a, obj);
            boolean z = false;
            if (i2 != -1) {
                aVar.notifyItemChanged(i2, false);
            }
            b bVar = this.f100834a;
            if (obj != null) {
                z = true;
            }
            bVar.a(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f100845b;

        static {
            Covode.recordClassIndex(64512);
        }

        l(b bVar, ConstraintLayout constraintLayout) {
            this.f100844a = bVar;
            this.f100845b = constraintLayout;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a aVar;
            ClickAgent.onClick(view);
            FavoriteVideoPickerViewModel c2 = this.f100844a.c();
            t<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a> tVar = c2.f100799d;
            Aweme value = c2.f100800e.getValue();
            if (value != null) {
                h.f.b.l.b(value, "");
                aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a(value, c.C2496b.f100828b);
            } else {
                aVar = null;
            }
            tVar.setValue(aVar);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        aVar.put("duration", String.valueOf(System.currentTimeMillis() - e()));
        r.a("video_stay_time", aVar);
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FavoriteVideoPickerViewModel f100831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f100832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f100833c;

        static {
            Covode.recordClassIndex(64505);
        }

        e(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel, b bVar, View view) {
            this.f100831a = favoriteVideoPickerViewModel;
            this.f100832b = bVar;
            this.f100833c = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ProgressBar progressBar = this.f100832b.f100819f;
            if (progressBar == null) {
                h.f.b.l.a("progressBar");
            }
            h.f.b.l.b(bool, "");
            int i3 = 8;
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = this.f100832b.f100820g;
            if (view == null) {
                h.f.b.l.a("loadingViewContainer");
            }
            List<Aweme> value = this.f100831a.f100798c.getValue();
            if ((value == null || value.isEmpty()) && bool.booleanValue()) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f100837b;

        static {
            Covode.recordClassIndex(64507);
        }

        g(b bVar, View view) {
            this.f100836a = bVar;
            this.f100837b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            Aweme aweme = (Aweme) ((com.ss.android.ugc.aweme.im.sdk.common.data.a.c) obj).a();
            if (aweme != null) {
                b bVar = this.f100836a;
                bVar.getContext();
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107229h = b.d();
                }
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                    new com.bytedance.tux.g.b(bVar).e(R.string.de8).b();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("video_from", "from_chat_favorite_video_panel");
                bundle.putString("extra_detail_title_text", bVar.getResources().getString(R.string.cwa));
                bundle.putInt("video_type", 1);
                bundle.putString("userid", com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString());
                bundle.putString("sec_userid", com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.c().toString());
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putInt("from_post_list", 0);
                bundle.putString("enter_from", "chat_liked_panel");
                if (gb.a(bVar.requireContext())) {
                    i2 = R.anim.dx;
                } else {
                    i2 = R.anim.dv;
                }
                if (gb.a(bVar.requireContext())) {
                    i3 = R.anim.f354do;
                } else {
                    i3 = R.anim.dq;
                }
                bVar.startActivityForResult(SmartRouter.buildRoute(bVar.getActivity(), "aweme://aweme/detail/").withParam(bundle).withAnimation(i3, i2).buildIntent(), 6248);
            }
        }
    }

    public final void a(boolean z) {
        MethodCollector.i(5595);
        int i2 = 0;
        if (this.f100823k == null) {
            View view = getView();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    parent = null;
                }
                FrameLayout frameLayout = (View) parent;
                while (true) {
                    if (frameLayout != null) {
                        if (frameLayout.getId() == R.id.ad7 && (frameLayout instanceof FrameLayout)) {
                            break;
                        }
                        ViewParent parent2 = frameLayout.getParent();
                        if (!(parent2 instanceof View)) {
                            parent2 = null;
                        }
                        frameLayout = (View) parent2;
                    } else {
                        frameLayout = null;
                        break;
                    }
                }
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2 != null) {
                    ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
                    constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.lr);
                    int dimensionPixelSize2 = constraintLayout.getResources().getDimensionPixelSize(R.dimen.ls);
                    com.bytedance.tux.h.i.a((View) constraintLayout, Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2), false, 16);
                    constraintLayout.setBackgroundColor(-1);
                    frameLayout2.addView(constraintLayout, frameLayout2.getChildCount());
                    Context requireContext = requireContext();
                    h.f.b.l.b(requireContext, "");
                    TuxButton tuxButton = new TuxButton(requireContext, null, 0, 6);
                    ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -2);
                    aVar.f2051h = 0;
                    tuxButton.setLayoutParams(aVar);
                    tuxButton.setButtonSize(3);
                    tuxButton.setButtonVariant(0);
                    tuxButton.setText(R.string.fkw);
                    tuxButton.setTextColor(-1);
                    constraintLayout.addView(tuxButton);
                    tuxButton.setOnClickListener(new l(this, constraintLayout));
                    this.f100823k = constraintLayout;
                }
            }
            MethodCollector.o(5595);
            return;
        }
        ViewGroup viewGroup = this.f100823k;
        if (viewGroup != null) {
            h.f.b.l.c(viewGroup, "");
            if (!z) {
                i2 = 8;
            }
            viewGroup.setVisibility(i2);
            MethodCollector.o(5595);
            return;
        }
        MethodCollector.o(5595);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.e2u);
        h.f.b.l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f100818e = recyclerView;
        if (recyclerView == null) {
            h.f.b.l.a("recyclerView");
        }
        getActivity();
        recyclerView.setLayoutManager(new WrapGridLayoutManager(3, 1));
        recyclerView.setAdapter(new a(c()));
        recyclerView.a(new com.ss.android.ugc.aweme.ai.c(recyclerView.getResources().getDimensionPixelSize(R.dimen.m1)));
        recyclerView.a(this.o);
        RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f3833l = 0;
        }
        FavoriteVideoPickerViewModel c2 = c();
        c2.f100798c.observe(this, new d(this, view));
        c2.f100797b.observe(this, new e(c2, this, view));
        c2.f100800e.observe(this, new f(this, view));
        c2.f100801f.observe(this, new g(this, view));
        c2.f100802g.observe(this, new h(this, view));
        c2.f100799d.observe(this, new i(this, view));
        View findViewById2 = view.findViewById(R.id.awd);
        h.f.b.l.b(findViewById2, "");
        this.f100821h = findViewById2;
        View findViewById3 = view.findViewById(R.id.ci_);
        h.f.b.l.b(findViewById3, "");
        this.f100820g = findViewById3;
        View findViewById4 = view.findViewById(R.id.ci9);
        h.f.b.l.b(findViewById4, "");
        TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById4;
        this.f100824l = tuxDualBallView;
        if (tuxDualBallView == null) {
            h.f.b.l.a("loadingView");
        }
        tuxDualBallView.b();
        View findViewById5 = view.findViewById(R.id.dc1);
        h.f.b.l.b(findViewById5, "");
        this.f100819f = (ProgressBar) findViewById5;
        View findViewById6 = view.findViewById(R.id.e2j);
        h.f.b.l.b(findViewById6, "");
        ImageView imageView = (ImageView) findViewById6;
        this.f100825m = imageView;
        if (imageView == null) {
            h.f.b.l.a("closeButton");
        }
        imageView.setOnClickListener(new j(this));
        c().a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a7a, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Serializable serializable = null;
        if (i2 != 6248 || i3 != -1) {
            c().b(null);
        } else if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("send_video");
            if (serializableExtra instanceof Aweme) {
                serializable = serializableExtra;
            }
            Aweme aweme = (Aweme) serializable;
            if (aweme != null) {
                c().b(aweme);
            }
        }
    }
}
