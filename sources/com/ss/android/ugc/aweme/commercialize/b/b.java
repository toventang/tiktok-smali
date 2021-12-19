package com.ss.android.ugc.aweme.commercialize.b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f73724a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.b.a.a f73725b;

    /* renamed from: c  reason: collision with root package name */
    private View f73726c;

    /* renamed from: d  reason: collision with root package name */
    private View f73727d;

    /* renamed from: e  reason: collision with root package name */
    private final List<AnchorPublishStruct> f73728e;

    /* renamed from: f  reason: collision with root package name */
    private final m f73729f;

    static {
        Covode.recordClassIndex(45355);
    }

    public final void show() {
        setOnShowListener(c.f73735a);
        super.show();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73731b;

        static {
            Covode.recordClassIndex(45356);
        }

        a(b bVar, int i2) {
            this.f73730a = bVar;
            this.f73731b = i2;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f73730a.f73724a;
            if (recyclerView != null) {
                recyclerView.setVerticalScrollBarEnabled(true);
            }
            RecyclerView recyclerView2 = this.f73730a.f73724a;
            if (recyclerView2 != null) {
                recyclerView2.setScrollBarSize((int) n.b(this.f73730a.getContext(), 4.0f));
            }
            RecyclerView recyclerView3 = this.f73730a.f73724a;
            if (recyclerView3 == null) {
                l.b();
            }
            if (recyclerView3.getHeight() > this.f73731b / 2) {
                RecyclerView recyclerView4 = this.f73730a.f73724a;
                if (recyclerView4 != null) {
                    layoutParams = recyclerView4.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = this.f73731b / 2;
                RecyclerView recyclerView5 = this.f73730a.f73724a;
                if (recyclerView5 != null) {
                    recyclerView5.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final void dismiss() {
        RecyclerView.i iVar;
        RecyclerView recyclerView = this.f73724a;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        List<AnchorPublishStruct> subList = this.f73728e.subList(0, ((LinearLayoutManager) iVar).m() + 1);
        ArrayList arrayList = new ArrayList();
        for (T t : subList) {
            if (t.isNew) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            AnchorListManager.a(arrayList2);
        }
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1651b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73734a;

        static {
            Covode.recordClassIndex(45357);
        }

        View$OnClickListenerC1651b(b bVar) {
            this.f73734a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73734a.dismiss();
        }
    }

    static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f73735a = new c();

        static {
            Covode.recordClassIndex(45358);
        }

        c() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.a) dialogInterface).findViewById(R.id.akq);
            if (frameLayout != null) {
                BottomSheetBehavior a2 = BottomSheetBehavior.a(frameLayout);
                l.b(a2, "");
                a2.b(frameLayout.getHeight());
                a2.f52333i = true;
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setContentView(R.layout.ae7);
        this.f73726c = findViewById(R.id.bvg);
        this.f73724a = (RecyclerView) findViewById(R.id.k6);
        this.f73727d = findViewById(R.id.dqe);
        RecyclerView recyclerView = this.f73724a;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        int b2 = n.b(getContext()) - n.e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b2 == 0) {
                i2 = -1;
            } else {
                i2 = b2;
            }
            window.setLayout(-1, i2);
            window.setGravity(80);
            Window window2 = getWindow();
            if (window2 == null) {
                l.b();
            }
            l.b(window2, "");
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            Window window3 = getWindow();
            if (window3 == null) {
                l.b();
            }
            l.b(window3, "");
            window3.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView2 = this.f73724a;
        if (recyclerView2 != null) {
            recyclerView2.post(new a(this, b2));
        }
        RecyclerView recyclerView3 = this.f73724a;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        com.ss.android.ugc.aweme.commercialize.b.a.a aVar = new com.ss.android.ugc.aweme.commercialize.b.a.a(this.f73728e, this.f73729f);
        this.f73725b = aVar;
        RecyclerView recyclerView4 = this.f73724a;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(aVar);
        }
        View view = this.f73726c;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC1651b(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, List<AnchorPublishStruct> list, m mVar) {
        super(context, R.style.wi);
        l.d(context, "");
        l.d(list, "");
        l.d(mVar, "");
        this.f73728e = list;
        this.f73729f = mVar;
    }
}
