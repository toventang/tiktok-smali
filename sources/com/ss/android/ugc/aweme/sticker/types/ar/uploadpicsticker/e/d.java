package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class d {

    /* renamed from: j */
    public static final b f136006j = new b((byte) 0);

    /* renamed from: a */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a f136007a;

    /* renamed from: b */
    public final View f136008b;

    /* renamed from: c */
    public final View f136009c;

    /* renamed from: d */
    public final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a f136010d;

    /* renamed from: e */
    public c f136011e;

    /* renamed from: f */
    public boolean f136012f;

    /* renamed from: g */
    public boolean f136013g;

    /* renamed from: h */
    public final Activity f136014h;

    /* renamed from: i */
    public final com.ss.android.ugc.tools.f.d f136015i;

    /* renamed from: k */
    private final RecyclerView f136016k;

    /* renamed from: l */
    private final View f136017l;

    /* renamed from: m */
    private final View f136018m;
    private final View n;
    private final boolean o;
    private final View p;
    private final View q;
    private final View r;
    private final ViewGroup s;

    static {
        Covode.recordClassIndex(88855);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(88859);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final List<j> a() {
        return this.f136010d.b();
    }

    public final void g() {
        this.f136016k.b(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d$d */
    public static final class RunnableC3545d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f136025a;

        static {
            Covode.recordClassIndex(88861);
        }

        RunnableC3545d(d dVar) {
            this.f136025a = dVar;
        }

        public final void run() {
            this.f136025a.i();
            this.f136025a.f136013g = false;
        }
    }

    public final void d() {
        this.f136010d.f135935f = true;
        this.f136010d.notifyDataSetChanged();
    }

    public final void e() {
        this.f136010d.f();
        this.f136010d.notifyDataSetChanged();
    }

    public final void f() {
        this.f136012f = true;
        this.f136011e.dismiss();
    }

    public final boolean h() {
        if (!this.f136014h.isFinishing()) {
            return true;
        }
        return false;
    }

    public final View j() {
        if (this.o) {
            return this.p;
        }
        return this.n;
    }

    public final void b() {
        this.f136008b.setVisibility(8);
        if (this.o) {
            k();
            return;
        }
        View view = this.n;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f136018m;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void c() {
        this.f136010d.e();
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a aVar = this.f136010d;
        aVar.notifyItemRemoved(aVar.getItemCount());
        if (this.f136013g) {
            this.f136016k.post(new RunnableC3545d(this));
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f136026a;

        static {
            Covode.recordClassIndex(88862);
        }

        public e(d dVar) {
            this.f136026a = dVar;
        }

        public final void run() {
            if (!this.f136026a.f136014h.isFinishing() && this.f136026a.f136012f) {
                try {
                    this.f136026a.f136011e.show();
                    this.f136026a.f136012f = false;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private final void k() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.r;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.f136008b.setBackgroundResource(R.drawable.h9);
        ViewGroup viewGroup = this.s;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = 0;
        }
        ViewGroup viewGroup2 = this.s;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(marginLayoutParams2);
        }
        this.f136013g = false;
    }

    public final void i() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.q;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.r;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        this.f136008b.setBackgroundResource(R.drawable.h_);
        ViewGroup viewGroup = this.s;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = (int) r.a(this.f136014h, 50.0f);
        }
        ViewGroup viewGroup2 = this.s;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(marginLayoutParams2);
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
        l.d(aVar, "");
        this.f136010d.a(aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f136022a;

        /* renamed from: b */
        final /* synthetic */ d f136023b;

        /* renamed from: c */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c f136024c;

        static {
            Covode.recordClassIndex(88858);
        }

        a(View view, d dVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar) {
            this.f136022a = view;
            this.f136023b = dVar;
            this.f136024c = cVar;
        }

        public final void onClick(View view) {
            String str;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar;
            ClickAgent.onClick(view);
            if (this.f136022a.getAlpha() == 1.0f && (cVar = this.f136024c) != null) {
                cVar.a(this.f136023b.f136010d.b());
            }
            List g2 = n.g((Collection) this.f136023b.f136010d.f135934e.keySet());
            ArrayList arrayList = new ArrayList();
            for (Object obj : g2) {
                if (((com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a) obj).f135951i == 2) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                str = UGCMonitor.TYPE_PHOTO;
            } else {
                str = "video";
            }
            if (!g2.isEmpty()) {
                g2.get(0);
            }
            com.ss.android.ugc.tools.f.d dVar = this.f136023b.f136015i;
            if (dVar != null) {
                this.f136023b.a().size();
                dVar.a(str);
            }
        }
    }

    public final void a(String str) {
        this.f136010d.a(str);
    }

    public final void a(List<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            this.f136010d.a(list);
        }
    }

    private final void a(String str, boolean z) {
        int i2;
        com.ss.android.ugc.tools.f.d dVar;
        if (UploadPicStickerARPresenter.v && (dVar = this.f136015i) != null) {
            dVar.a(str, z);
        }
        View view = this.f136009c;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void a(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar, String str) {
        float f2;
        this.f136007a = aVar;
        this.f136010d.f135931b = aVar;
        boolean z = false;
        this.f136008b.setVisibility(0);
        if (aVar == null || !aVar.f135925c) {
            if (this.o) {
                k();
            } else {
                View view = this.n;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.f136018m;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            if (aVar == null) {
                return;
            }
        } else {
            if (this.o) {
                if (this.f136013g) {
                    i();
                } else {
                    z = true;
                }
                this.f136013g = z;
            } else {
                View view3 = this.n;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = this.f136018m;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
            }
            View j2 = j();
            if (j2 != null) {
                if (this.f136010d.c() >= aVar.f135926d) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.4f;
                }
                j2.setAlpha(f2);
            }
        }
        Boolean bool = aVar.f135928f;
        if (bool != null) {
            a(str, bool.booleanValue());
        }
    }

    public /* synthetic */ d(ViewStubCompat viewStubCompat, Activity activity, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar) {
        this(viewStubCompat, null, null, false, null, null, null, null, activity, null, cVar);
    }

    public static /* synthetic */ void a(d dVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        dVar.a(aVar, (String) null);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements q<Integer, Boolean, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(3);
            this.this$0 = dVar;
        }

        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Integer num, Boolean bool, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
            int i2;
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar2 = aVar;
            l.d(aVar2, "");
            View j2 = this.this$0.j();
            if (j2 != null) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a aVar3 = this.this$0.f136007a;
                if (aVar3 != null) {
                    i2 = aVar3.f135926d;
                } else {
                    i2 = 0;
                }
                if (intValue >= i2) {
                    j2.setAlpha(1.0f);
                } else {
                    j2.setAlpha(0.4f);
                }
                com.ss.android.ugc.tools.f.d dVar = this.this$0.f136015i;
                if (dVar != null) {
                    dVar.a(aVar2.f135943a, aVar2.f135948f, "media_tray");
                }
            }
            if (booleanValue) {
                Activity activity = this.this$0.f136014h;
                String string = this.this$0.f136014h.getString(R.string.b25);
                l.b(string, "");
                String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1));
                l.b(a2, "");
                j.a.b(activity, a2, 0).a();
            }
            return z.f158842a;
        }
    }

    public d(ViewStubCompat viewStubCompat, View view, View view2, boolean z, View view3, View view4, View view5, ViewGroup viewGroup, Activity activity, com.ss.android.ugc.tools.f.d dVar, final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar) {
        l.d(viewStubCompat, "");
        l.d(activity, "");
        this.f136018m = view;
        this.n = view2;
        this.o = z;
        this.p = view3;
        this.q = view4;
        this.r = view5;
        this.s = viewGroup;
        this.f136014h = activity;
        this.f136015i = dVar;
        View a2 = viewStubCompat.a();
        l.b(a2, "");
        this.f136008b = a2;
        View findViewById = a2.findViewById(R.id.c7p);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f136016k = recyclerView;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a(activity, cVar, new c(this));
        this.f136010d = aVar;
        this.f136011e = new c(activity);
        this.f136012f = true;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
        RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((ab) itemAnimator).f3953m = false;
        View findViewById2 = a2.findViewById(R.id.c13);
        l.b(findViewById2, "");
        this.f136017l = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(88856);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar = cVar;
                if (cVar != null) {
                    cVar.b();
                }
            }
        });
        View findViewById3 = a2.findViewById(R.id.bxa);
        l.b(findViewById3, "");
        this.f136009c = findViewById3;
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d.AnonymousClass2 */

            /* renamed from: a */
            final /* synthetic */ d f136020a;

            static {
                Covode.recordClassIndex(88857);
            }

            {
                this.f136020a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                com.ss.android.ugc.tools.f.d dVar = this.f136020a.f136015i;
                if (dVar != null) {
                    dVar.a("giphy", "video_shoot_page");
                }
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c cVar = cVar;
                if (cVar != null) {
                    cVar.c();
                }
            }
        });
        a2.setVisibility(8);
        ((ImageView) a2.findViewById(R.id.dxf)).setColorFilter(-1);
        View j2 = j();
        if (j2 != null) {
            if (z) {
                k();
            }
            j2.setVisibility(8);
            j2.setOnClickListener(new a(j2, this, cVar));
        }
    }
}
