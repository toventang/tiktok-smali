package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.c.ad;
import com.bytedance.android.livesdk.chatroom.e.o;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.v;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class cy extends com.bytedance.android.live.a implements View.OnClickListener, o.a {

    /* renamed from: i  reason: collision with root package name */
    private static final a f16085i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.l.b f16086a;

    /* renamed from: b  reason: collision with root package name */
    private int f16087b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16088c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16089d;

    /* renamed from: e  reason: collision with root package name */
    private dv f16090e;

    /* renamed from: f  reason: collision with root package name */
    private final o f16091f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16092g;

    /* renamed from: h  reason: collision with root package name */
    private f.a.b.a f16093h;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f16094j;

    static {
        Covode.recordClassIndex(8904);
    }

    private View a(int i2) {
        if (this.f16094j == null) {
            this.f16094j = new HashMap();
        }
        View view = (View) this.f16094j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f16094j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    static final class a {
        static {
            Covode.recordClassIndex(8905);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        if (this.f16087b == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16094j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public cy() {
        o oVar = new o();
        oVar.a(this);
        this.f16091f = oVar;
        this.f16093h = new f.a.b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f16092g = false;
        this.f16091f.b();
        this.f16093h.dispose();
        this.f16093h.a();
    }

    public final void a() {
        if (this.f16088c && !this.f16089d) {
            if (b()) {
                RecyclerView recyclerView = (RecyclerView) a(R.id.ean);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                View a2 = a(R.id.ci9);
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                LiveLoadingView liveLoadingView = (LiveLoadingView) a(R.id.dby);
                if (liveLoadingView != null) {
                    liveLoadingView.setVisibility(0);
                }
                LiveTextView liveTextView = (LiveTextView) a(R.id.dmf);
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            }
            this.f16091f.a(ag.a(v.a("cursor", String.valueOf(this.f16087b)), v.a("count", "11")));
            this.f16089d = true;
        }
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cy f16095a;

        static {
            Covode.recordClassIndex(8906);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(cy cyVar) {
            this.f16095a = cyVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null && linearLayoutManager.m() >= linearLayoutManager.A() - 2) {
                    this.f16095a.a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final g f16101a = new g();

        static {
            Covode.recordClassIndex(8911);
        }

        g() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            bf.a().c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f16102a = new h();

        static {
            Covode.recordClassIndex(8912);
        }

        h() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            bf.a().b();
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cy f16096a;

        static {
            Covode.recordClassIndex(8907);
        }

        c(cy cyVar) {
            this.f16096a = cyVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ad adVar = (ad) obj;
            if (adVar != null) {
                this.f16096a.onEvent(adVar);
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cy f16097a;

        static {
            Covode.recordClassIndex(8908);
        }

        d(cy cyVar) {
            this.f16097a = cyVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f16097a.dismissAllowingStateLoss();
            com.bytedance.android.livesdk.l.b bVar = this.f16097a.f16086a;
            if (bVar != null) {
                bVar.dismiss();
            }
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.dmf) {
                a();
            } else if (valueOf.intValue() == R.id.eaf) {
                dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            l.b(window, "");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            double b2 = (double) y.b();
            Double.isNaN(b2);
            attributes.height = (int) (b2 * 0.7d);
            window.setAttributes(attributes);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.e a2;
        super.onCreate(bundle);
        this.f16092g = true;
        setStyle(1, R.style.a29);
        this.f16093h.a(com.bytedance.android.livesdk.an.a.a().a(ad.class).d(new c(this)));
        this.f16093h.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.f.class).d(new d(this)));
        Context context = getContext();
        if (context != null && (a2 = p.a(context)) != null) {
            this.f16090e = new dv(a2);
        }
    }

    public final void onEvent(ad adVar) {
        if (adVar.f15077a != null) {
            b.a aVar = new b.a(getContext());
            aVar.f18284a = y.a((int) R.string.eif, adVar.f15077a.f18987a);
            b.a b2 = aVar.b(R.string.eig).a(R.string.eih, (DialogInterface.OnClickListener) new e(this, adVar), false).b(R.string.gle, (DialogInterface.OnClickListener) f.f16100a, false);
            b2.f18289f = g.f16101a;
            b2.f18290g = h.f16102a;
            com.bytedance.android.livesdk.l.b a2 = b2.a();
            this.f16086a = a2;
            if (a2 != null) {
                a2.show();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.o.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.live.o oVar) {
        Collection<? extends ar> collection;
        String str = "";
        l.d(oVar, str);
        if (this.f16092g) {
            this.f16089d = false;
            this.f16087b = oVar.f23159b;
            boolean z = true;
            if (oVar.f23160c != 1) {
                z = false;
            }
            this.f16088c = z;
            RecyclerView recyclerView = (RecyclerView) a(R.id.ean);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            View a2 = a(R.id.ci9);
            if (a2 != null) {
                a2.setVisibility(8);
            }
            dv dvVar = this.f16090e;
            if (dvVar != null) {
                l.d(oVar, str);
                List<ar> list = dvVar.f16185a;
                List<ar> list2 = oVar.f23164g;
                if (list2 == null || (collection = n.g((Iterable) list2)) == null) {
                    collection = z.INSTANCE;
                }
                list.addAll(collection);
                String str2 = oVar.f23161d;
                if (str2 != null) {
                    str = str2;
                }
                dvVar.f16186b = str;
                dvVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.o.a
    public final void a(Throwable th) {
        if (this.f16092g) {
            this.f16089d = false;
            com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.gvx);
            if (b()) {
                RecyclerView recyclerView = (RecyclerView) a(R.id.ean);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                View a2 = a(R.id.ci9);
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                LiveLoadingView liveLoadingView = (LiveLoadingView) a(R.id.dby);
                if (liveLoadingView != null) {
                    liveLoadingView.setVisibility(8);
                }
                LiveTextView liveTextView = (LiveTextView) a(R.id.dmf);
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f16100a = new f();

        static {
            Covode.recordClassIndex(8910);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cy f16098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ad f16099b;

        static {
            Covode.recordClassIndex(8909);
        }

        e(cy cyVar, ad adVar) {
            this.f16098a = cyVar;
            this.f16099b = adVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (r1 > 0) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r10, int r11) {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.cy.e.onClick(android.content.DialogInterface, int):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        LiveTextView liveTextView = (LiveTextView) a(R.id.dmf);
        if (liveTextView != null) {
            liveTextView.setOnClickListener(this);
        }
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) a(R.id.eaf);
        if (liveAutoRtlImageView != null) {
            liveAutoRtlImageView.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.ean);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f16090e);
        }
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.ean);
        if (recyclerView2 != null) {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.ean);
        if (recyclerView3 != null) {
            recyclerView3.a(new b(this));
        }
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(13375);
        l.d(layoutInflater, "");
        View inflate = layoutInflater.inflate(R.layout.b7g, viewGroup);
        MethodCollector.o(13375);
        return inflate;
    }
}
