package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public abstract class be<T> {

    /* renamed from: a  reason: collision with root package name */
    protected Context f82423a;

    /* renamed from: b  reason: collision with root package name */
    protected View f82424b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f82425c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f82426d;

    /* renamed from: e  reason: collision with root package name */
    protected ViewGroup f82427e;

    /* renamed from: f  reason: collision with root package name */
    protected r f82428f;

    /* renamed from: g  reason: collision with root package name */
    protected a f82429g;

    /* renamed from: h  reason: collision with root package name */
    protected RecyclerView.a f82430h;

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f82431i;

    public interface a {
        static {
            Covode.recordClassIndex(51303);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(51301);
    }

    public final View c() {
        return this.f82424b;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        a aVar = this.f82429g;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f82425c = (TextView) this.f82424b.findViewById(R.id.dvc);
        this.f82431i = (RecyclerView) this.f82424b.findViewById(R.id.dv_);
        this.f82426d = (TextView) this.f82424b.findViewById(R.id.dvf);
        ViewGroup viewGroup = (ViewGroup) this.f82424b.findViewById(R.id.dve);
        this.f82427e = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.discover.ui.be.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51302);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (be.this.f82429g != null) {
                    be.this.f82429g.a();
                }
            }
        });
        View findViewById = this.f82424b.findViewById(R.id.cmz);
        if (findViewById != null) {
            findViewById.setOnClickListener(new bf(this));
        }
        o.a(false, this.f82424b.findViewById(R.id.bst));
        RecyclerView.a aVar = this.f82430h;
        if (aVar != null) {
            this.f82431i.setAdapter(aVar);
        }
    }

    public final void a(RecyclerView.a aVar) {
        this.f82430h = aVar;
        this.f82431i.setAdapter(aVar);
    }

    protected be(View view, Context context, a aVar) {
        this(view, context, aVar, (byte) 0);
    }

    public void a(List<T> list, r rVar, boolean z) {
        this.f82428f = rVar;
        if (z) {
            this.f82427e.setVisibility(0);
        } else {
            this.f82427e.setVisibility(8);
        }
    }

    public final void b(List<T> list, r rVar, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            arrayList.add(new ao(t, rVar, z));
        }
        ((ad) this.f82430h).a(arrayList);
    }

    private be(View view, Context context, a aVar, byte b2) {
        this.f82424b = view;
        this.f82423a = context;
        this.f82429g = aVar;
        this.f82430h = null;
        b();
    }
}
