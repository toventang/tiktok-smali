package com.ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.lynx.a.b;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class SinglePageLynxViewContainer extends FrameLayout implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private a f81448a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f81449b;

    static {
        Covode.recordClassIndex(50613);
    }

    private View a() {
        if (this.f81449b == null) {
            this.f81449b = new SparseArray();
        }
        View view = (View) this.f81449b.get(R.id.djh);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.djh);
        this.f81449b.put(R.id.djh, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(152, new g(SinglePageLynxViewContainer.class, "onJsBroadcastReceiver", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a extends RecyclerView.a<com.ss.android.ugc.aweme.discover.lynx.e.a> implements com.ss.android.ugc.aweme.discover.lynx.c.a {

        /* renamed from: a  reason: collision with root package name */
        public String f81450a;

        /* renamed from: b  reason: collision with root package name */
        public d f81451b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f81452c;

        static {
            Covode.recordClassIndex(50614);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.e.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            if (this.f81451b == null) {
                return 0;
            }
            return 1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewRecycled(com.ss.android.ugc.aweme.discover.lynx.e.a aVar) {
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar2 = aVar;
            l.d(aVar2, "");
            super.onViewRecycled(aVar2);
            aVar2.D();
        }

        @Override // com.ss.android.ugc.aweme.discover.lynx.c.a
        public final void a(int i2, b bVar) {
            l.d(bVar, "");
            this.f81450a = bVar.f81412c;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.discover.lynx.e.a aVar, int i2) {
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(this);
            aVar2.C();
            com.ss.android.ugc.aweme.discover.lynx.delegate.d c2 = aVar2.c();
            if (c2 != null) {
                c2.f81477b.f81421l = true;
            }
            d dVar = this.f81451b;
            if (dVar == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.discover.lynx.e.a.a(aVar2, dVar, this.f81452c, 26);
        }

        private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(4129);
            l.d(viewGroup, "");
            com.ss.android.ugc.aweme.discover.lynx.e.a a3 = a.C1902a.a(viewGroup, null);
            try {
                if (a3.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(a3.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = a3.getClass().getName();
            MethodCollector.o(4129);
            return a3;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cg.b(this);
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (l.a((Object) jVar.f91311b.optString("eventName"), (Object) "close_search_single_page_view")) {
            String optString = jVar.f91311b.optString("reactId");
            a aVar = this.f81448a;
            if (aVar == null) {
                l.a("dynamicViewAdapter");
            }
            if (l.a((Object) aVar.f81450a, (Object) optString)) {
                a(null, null);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SinglePageLynxViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    public final void a(d dVar, Map<String, String> map) {
        if (dVar == null) {
            if (a() != null) {
                a aVar = this.f81448a;
                if (aVar == null) {
                    l.a("dynamicViewAdapter");
                }
                aVar.f81451b = null;
                a aVar2 = this.f81448a;
                if (aVar2 == null) {
                    l.a("dynamicViewAdapter");
                }
                aVar2.f81452c = null;
                a aVar3 = this.f81448a;
                if (aVar3 == null) {
                    l.a("dynamicViewAdapter");
                }
                aVar3.notifyDataSetChanged();
            }
            setVisibility(8);
            cg.b(this);
            return;
        }
        if (a() == null) {
            com.a.a(LayoutInflater.from(getContext()), R.layout.auy, this, true);
            RecyclerView recyclerView = (RecyclerView) a();
            l.b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.f81448a = new a();
            RecyclerView recyclerView2 = (RecyclerView) a();
            l.b(recyclerView2, "");
            a aVar4 = this.f81448a;
            if (aVar4 == null) {
                l.a("dynamicViewAdapter");
            }
            recyclerView2.setAdapter(aVar4);
        }
        a aVar5 = this.f81448a;
        if (aVar5 == null) {
            l.a("dynamicViewAdapter");
        }
        aVar5.f81451b = dVar;
        a aVar6 = this.f81448a;
        if (aVar6 == null) {
            l.a("dynamicViewAdapter");
        }
        aVar6.f81452c = map;
        a aVar7 = this.f81448a;
        if (aVar7 == null) {
            l.a("dynamicViewAdapter");
        }
        aVar7.notifyDataSetChanged();
        setVisibility(0);
        cg.a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SinglePageLynxViewContainer(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4359);
        MethodCollector.o(4359);
    }
}
