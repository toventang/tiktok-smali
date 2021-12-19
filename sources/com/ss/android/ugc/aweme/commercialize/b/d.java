package com.ss.android.ugc.aweme.commercialize.b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<WikipediaInfo> f73736a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<WikipediaInfo, z> f73737b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<z> f73738c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f73739d;

    static {
        Covode.recordClassIndex(45364);
    }

    static final class c implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73741a;

        static {
            Covode.recordClassIndex(45367);
        }

        c(d dVar) {
            this.f73741a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            h.f.a.a<z> aVar = this.f73741a.f73738c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class a extends m implements h.f.a.b<WikipediaInfo, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(45365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(WikipediaInfo wikipediaInfo) {
            l.d(wikipediaInfo, "");
            h.f.a.b<WikipediaInfo, z> bVar = this.this$0.f73737b;
            if (bVar != null) {
                bVar.invoke(wikipediaInfo);
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73740a;

        static {
            Covode.recordClassIndex(45366);
        }

        b(d dVar) {
            this.f73740a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73740a.dismiss();
            h.f.a.a<z> aVar = this.f73740a.f73738c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ae9);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dr3);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new com.ss.android.ugc.aweme.commercialize.b.a.c(this.f73736a, this.f73739d, new a(this)));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.f73736a.size() > 7) {
            marginLayoutParams.height = (int) n.b(recyclerView.getContext(), 422.0f);
        } else if (this.f73736a.size() <= 4) {
            marginLayoutParams.height = (int) n.b(recyclerView.getContext(), 250.0f);
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            marginLayoutParams.height = -2;
        }
        recyclerView.setLayoutParams(marginLayoutParams);
        ((ImageView) findViewById(R.id.btp)).setOnClickListener(new b(this));
        int b2 = n.b(getContext()) - n.e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b2 == 0) {
                b2 = -1;
            }
            window.setLayout(-1, b2);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        setOnCancelListener(new c(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.feed.model.WikipediaInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, List<WikipediaInfo> list, Map<String, String> map, h.f.a.b<? super WikipediaInfo, z> bVar, h.f.a.a<z> aVar) {
        super(context, R.style.wi);
        l.d(context, "");
        l.d(list, "");
        l.d(map, "");
        this.f73736a = list;
        this.f73739d = map;
        this.f73737b = bVar;
        this.f73738c = aVar;
    }
}
