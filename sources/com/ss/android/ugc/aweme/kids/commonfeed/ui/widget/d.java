package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.commonfeed.report.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class d extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f106374a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f106375b;

    /* renamed from: c  reason: collision with root package name */
    private ReportErrorView f106376c;

    static {
        Covode.recordClassIndex(67981);
    }

    public final void setErrorVisibility(boolean z) {
        if (z) {
            ReportErrorView reportErrorView = this.f106376c;
            if (reportErrorView == null) {
                l.a("reportErrorView");
            }
            reportErrorView.setVisibility(4);
            return;
        }
        ReportErrorView reportErrorView2 = this.f106376c;
        if (reportErrorView2 == null) {
            l.a("reportErrorView");
        }
        reportErrorView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, List<a> list) {
        super(context, null);
        l.d(context, "");
        l.d(list, "");
        MethodCollector.i(5499);
        LayoutInflater.from(context).inflate(R.layout.ad_, this);
        View findViewById = findViewById(R.id.dlx);
        l.b(findViewById, "");
        this.f106374a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.dlw);
        l.b(findViewById2, "");
        this.f106375b = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.dln);
        l.b(findViewById3, "");
        this.f106376c = (ReportErrorView) findViewById3;
        com.ss.android.ugc.aweme.kids.commonfeed.b.d dVar = new com.ss.android.ugc.aweme.kids.commonfeed.b.d(context);
        l.d(list, "");
        dVar.f106005a.clear();
        dVar.f106005a.addAll(list);
        dVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.f106375b;
        if (recyclerView == null) {
            l.a("listView");
        }
        recyclerView.setAdapter(dVar);
        RecyclerView recyclerView2 = this.f106375b;
        if (recyclerView2 == null) {
            l.a("listView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        k kVar = new k(context);
        kVar.a(getResources().getDrawable(R.drawable.ax6));
        RecyclerView recyclerView3 = this.f106375b;
        if (recyclerView3 == null) {
            l.a("listView");
        }
        recyclerView3.b(kVar);
        ReportErrorView reportErrorView = this.f106376c;
        if (reportErrorView == null) {
            l.a("reportErrorView");
        }
        reportErrorView.setVisibility(4);
        MethodCollector.o(5499);
    }
}
