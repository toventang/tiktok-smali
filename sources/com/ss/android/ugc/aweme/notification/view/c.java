package com.ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.b;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.f;
import com.ss.android.ugc.aweme.notification.adapter.FilterViewModel;
import com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder;
import com.ss.android.ugc.aweme.notification.adapter.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public final i f113939a;

    /* renamed from: b  reason: collision with root package name */
    private PowerList f113940b;

    /* renamed from: c  reason: collision with root package name */
    private View f113941c;

    /* renamed from: d  reason: collision with root package name */
    private FilterViewModel f113942d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f113943e;

    static {
        Covode.recordClassIndex(73261);
    }

    public final void b() {
        PowerList powerList = this.f113940b;
        if (powerList == null) {
            l.a("mRecyclerView");
        }
        powerList.O.i();
    }

    public final void a() {
        this.f113942d.a().postValue(Integer.valueOf(a.b.a()));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113945a;

        static {
            Covode.recordClassIndex(73263);
        }

        a(c cVar) {
            this.f113945a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113945a.dismiss();
        }
    }

    public final void a(List<f> list) {
        l.d(list, "");
        PowerList powerList = this.f113940b;
        if (powerList == null) {
            l.a("mRecyclerView");
        }
        powerList.getState().b(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, i iVar) {
        super(context);
        l.d(context, "");
        l.d(iVar, "");
        this.f113943e = context;
        this.f113939a = iVar;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.li, null, false);
        setContentView(a2);
        View findViewById = a2.findViewById(R.id.b2y);
        l.b(findViewById, "");
        this.f113940b = (PowerList) findViewById;
        View findViewById2 = a2.findViewById(R.id.tp);
        l.b(findViewById2, "");
        this.f113941c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(b.c(context, R.color.c9)));
        setFocusable(true);
        setAnimationStyle(R.style.a1f);
        View view = this.f113941c;
        if (view == null) {
            l.a("mBlankView");
        }
        view.setOnClickListener(new a(this));
        PowerList powerList = this.f113940b;
        if (powerList == null) {
            l.a("mRecyclerView");
        }
        powerList.a(GroupFilterViewHolder.class);
        Activity a3 = o.a(context);
        Objects.requireNonNull(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        e eVar = (e) a3;
        ac a4 = ae.a(eVar, (ad.b) null).a(FilterViewModel.class);
        l.b(a4, "");
        FilterViewModel filterViewModel = (FilterViewModel) a4;
        this.f113942d = filterViewModel;
        filterViewModel.b().observe(eVar, new u(this) {
            /* class com.ss.android.ugc.aweme.notification.view.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f113944a;

            static {
                Covode.recordClassIndex(73262);
            }

            {
                this.f113944a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                f fVar = (f) obj;
                i iVar = this.f113944a.f113939a;
                l.b(fVar, "");
                iVar.a(fVar);
            }
        });
    }
}
