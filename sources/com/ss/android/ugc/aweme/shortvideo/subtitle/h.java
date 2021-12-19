package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.property.ef;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.ugc.aweme.utils.bj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final u f130945a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f130946b;

    /* renamed from: c  reason: collision with root package name */
    public o f130947c;

    /* renamed from: d  reason: collision with root package name */
    final InputMethodManager f130948d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.story.h.c.a.b f130949e;

    /* renamed from: f  reason: collision with root package name */
    TextView f130950f;

    /* renamed from: g  reason: collision with root package name */
    public EditCaptionScene.f f130951g;

    /* renamed from: h  reason: collision with root package name */
    public final v f130952h;

    /* renamed from: i  reason: collision with root package name */
    public String f130953i = "";

    /* renamed from: j  reason: collision with root package name */
    public boolean f130954j;

    /* renamed from: k  reason: collision with root package name */
    public int f130955k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<com.ss.android.ugc.aweme.sticker.data.h> f130956l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public boolean f130957m;
    public final LinearLayout n;
    public final ViewGroup o;
    public final EditCaptionScene p;
    private final h.h q = i.a((h.f.a.a) new a(this));
    private final ArrayList<com.ss.android.ugc.aweme.sticker.data.h> r = new ArrayList<>();

    static {
        Covode.recordClassIndex(85824);
    }

    public final androidx.fragment.app.e a() {
        return (androidx.fragment.app.e) this.q.getValue();
    }

    static final class a extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(85827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            Activity t = this.this$0.p.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return t;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.da.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f130961a;

        static {
            Covode.recordClassIndex(85829);
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void b() {
            this.f130961a.f130948d.toggleSoftInput(0, 2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(h hVar) {
            this.f130961a = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (!this.f130945a.f131027f.equals(this.r)) {
            return true;
        }
        return false;
    }

    public static final class e extends com.ss.android.ugc.aweme.da.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f130965a;

        static {
            Covode.recordClassIndex(85832);
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void d() {
            this.f130965a.f130954j = false;
            this.f130965a.f130949e.a();
            o oVar = this.f130965a.f130947c;
            if (oVar != null) {
                oVar.d(this.f130965a.f130955k);
            }
            if (this.f130965a.f130951g != null) {
                RecyclerView recyclerView = this.f130965a.f130946b;
                EditCaptionScene.f fVar = this.f130965a.f130951g;
                if (fVar == null) {
                    l.b();
                }
                recyclerView.c(fVar);
                this.f130965a.f130951g = null;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(h hVar) {
            this.f130965a = hVar;
        }
    }

    public static final class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f130962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f130963b;

        static {
            Covode.recordClassIndex(85830);
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void c(int i2) {
        }

        public static final class a extends com.ss.android.ugc.aweme.da.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f130964a;

            static {
                Covode.recordClassIndex(85831);
            }

            @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
            public final void c() {
            }

            @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
            public final void d() {
                this.f130964a.f130962a.f130954j = false;
                this.f130964a.f130962a.f130949e.a();
                o oVar = this.f130964a.f130962a.f130947c;
                if (oVar != null) {
                    oVar.d(this.f130964a.f130962a.f130955k);
                }
                if (this.f130964a.f130962a.f130951g != null) {
                    RecyclerView recyclerView = this.f130964a.f130962a.f130946b;
                    EditCaptionScene.f fVar = this.f130964a.f130962a.f130951g;
                    if (fVar == null) {
                        l.b();
                    }
                    recyclerView.c(fVar);
                    this.f130964a.f130962a.f130951g = null;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(d dVar) {
                this.f130964a = dVar;
            }
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void b(int i2) {
            this.f130963b.b(new a(this));
            this.f130962a.f130957m = false;
        }

        d(h hVar, v vVar) {
            this.f130962a = hVar;
            this.f130963b = vVar;
        }
    }

    public static final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f130960a;

        static {
            Covode.recordClassIndex(85828);
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void c(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(h hVar) {
            this.f130960a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void b(int i2) {
            if (this.f130960a.f130951g != null) {
                RecyclerView recyclerView = this.f130960a.f130946b;
                EditCaptionScene.f fVar = this.f130960a.f130951g;
                if (fVar == null) {
                    l.b();
                }
                recyclerView.c(fVar);
                this.f130960a.f130951g = null;
            }
            this.f130960a.f130957m = false;
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void a(int i2) {
            if (this.f130960a.f130951g == null) {
                this.f130960a.f130951g = new EditCaptionScene.f(0, i2);
                RecyclerView recyclerView = this.f130960a.f130946b;
                EditCaptionScene.f fVar = this.f130960a.f130951g;
                if (fVar == null) {
                    l.b();
                }
                recyclerView.a(fVar);
                RecyclerView.i layoutManager = this.f130960a.f130946b.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).a(this.f130960a.f130945a.f131028g, (int) n.b(this.f130960a.a(), 100.0f));
            }
            this.f130960a.f130957m = true;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f130953i = str;
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(85833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(R.string.x9, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.h.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(85834);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.a(this.this$0.this$0.f130952h);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.b7t, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    public final void a(EditText editText) {
        l.d(editText, "");
        this.f130948d.showSoftInput(editText, 1);
    }

    public final void a(v vVar) {
        if (this.f130957m) {
            this.f130949e.a(new d(this, vVar));
            View currentFocus = a().getCurrentFocus();
            if (currentFocus != null) {
                this.f130948d.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        } else {
            vVar.b(new e(this));
        }
        this.f130945a.a();
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f130966a;

        static {
            Covode.recordClassIndex(85835);
        }

        g(h hVar) {
            this.f130966a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h hVar = this.f130966a;
            hVar.a(hVar.f130952h);
        }
    }

    private static Object a(androidx.fragment.app.e eVar, String str) {
        Object obj;
        MethodCollector.i(6100);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(6100);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }

    public final void a(ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList, int i2, int i3, int i4) {
        l.d(arrayList, "");
        this.f130955k = i4;
        this.f130954j = true;
        this.r.clear();
        this.r.addAll(arrayList);
        this.f130956l.clear();
        Iterator<com.ss.android.ugc.aweme.sticker.data.h> it = arrayList.iterator();
        while (it.hasNext()) {
            com.ss.android.ugc.aweme.sticker.data.h next = it.next();
            ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList2 = this.f130956l;
            l.b(next, "");
            arrayList2.add(new com.ss.android.ugc.aweme.sticker.data.h(next));
        }
        u uVar = this.f130945a;
        String str = this.f130953i;
        l.d(str, "");
        uVar.f131023b = str;
        u uVar2 = this.f130945a;
        ArrayList<com.ss.android.ugc.aweme.sticker.data.h> arrayList3 = this.f130956l;
        l.d(arrayList3, "");
        uVar2.f131027f = arrayList3;
        uVar2.f131028g = i2;
        uVar2.f131031j = i3;
        uVar2.notifyDataSetChanged();
        RecyclerView.i layoutManager = this.f130946b.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).a(i2, (int) n.b(a(), 100.0f));
        this.f130949e.a(new b(this));
        this.f130952h.c(new c(this));
    }

    public h(LinearLayout linearLayout, ViewGroup viewGroup, EditCaptionScene editCaptionScene, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        TextView textView;
        l.d(linearLayout, "");
        l.d(viewGroup, "");
        l.d(editCaptionScene, "");
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        this.n = linearLayout;
        this.o = viewGroup;
        this.p = editCaptionScene;
        Object a2 = a(a(), "input_method");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f130948d = (InputMethodManager) a2;
        u uVar = new u(this, videoPublishEditModel, aVar);
        this.f130945a = uVar;
        View findViewById = linearLayout.findViewById(R.id.at6);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        linearLayout.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(uVar);
        recyclerView.b(new EditCaptionScene.f((int) n.b(recyclerView.getContext(), 0.0f), (int) n.b(recyclerView.getContext(), 40.0f)));
        recyclerView.setItemAnimator(null);
        l.b(findViewById, "");
        this.f130946b = recyclerView;
        this.f130950f = (TextView) linearLayout.findViewById(R.id.a1p);
        if (ef.a() && (textView = this.f130950f) != null) {
            textView.setText(R.string.bjf);
        }
        this.f130952h = new v(viewGroup, viewGroup.findViewById(R.id.eei), linearLayout);
        TextView textView2 = this.f130950f;
        if (textView2 == null) {
            l.b();
        }
        textView2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f130958a;

            static {
                Covode.recordClassIndex(85825);
            }

            {
                this.f130958a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h hVar = this.f130958a;
                if (!hVar.b()) {
                    hVar.a(hVar.f130952h);
                } else if (ef.a()) {
                    Activity t = hVar.p.t();
                    l.b(t, "");
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(t).b(R.string.xb), new f(hVar)).a().b().show();
                } else {
                    new a.C0731a(hVar.p.t()).b(R.string.xb).b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.x9, (DialogInterface.OnClickListener) new g(hVar), false).a().b().show();
                }
            }
        });
        ((TextView) linearLayout.findViewById(R.id.ef9)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.h.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f130959a;

            static {
                Covode.recordClassIndex(85826);
            }

            {
                this.f130959a = r1;
            }

            public final void onClick(View view) {
                long startTime;
                ClickAgent.onClick(view);
                h hVar = this.f130959a;
                u uVar = hVar.f130945a;
                if (uVar.f131028g == -1) {
                    startTime = uVar.f131027f.get(0).getStartTime();
                } else {
                    startTime = uVar.f131027f.get(uVar.f131028g).getStartTime();
                }
                hVar.f130955k = (int) startTime;
                o oVar = hVar.f130947c;
                if (oVar != null) {
                    oVar.a(hVar.b(), hVar.f130945a.f131028g, hVar.f130956l);
                }
                hVar.a(hVar.f130952h);
            }
        });
        androidx.fragment.app.e a3 = a();
        l.d(a3, "");
        this.f130949e = new com.ss.android.ugc.aweme.story.h.c.a.b(a3, bj.f142677a);
    }
}
