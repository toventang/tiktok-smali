package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ac;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.widgetcompat.b;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class al extends a implements a.AbstractC3368a {
    public String q;
    private TextView r;
    private boolean s;

    static {
        Covode.recordClassIndex(84609);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void c() {
        super.c();
        f.a(this, ac.b.f128897a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void a(boolean z) {
        b(z);
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void b(boolean z) {
        this.s = z;
        if (this.f128883c != null) {
            this.f128883c.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String g2 = g();
        this.f128883c = new MvImageChooseAdapter(getContext(), this.f128882b, 2, this.n);
        this.f128883c.n = this.o;
        this.f128883c.f128851g = this.f128885e;
        this.f128883c.a(this.s);
        this.f128883c.f128850f = new am(this);
        final WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, this.f128882b);
        wrapGridLayoutManager.a(new GridLayoutManager.c() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.al.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84610);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (al.this.f128883c.getItemViewType(i2) == 1) {
                    return ((GridLayoutManager) wrapGridLayoutManager).f3760b;
                }
                return 1;
            }
        });
        wrapGridLayoutManager.u = this.f128882b;
        this.f128884d.setHasFixedSize(true);
        this.f128884d.setLayoutManager(wrapGridLayoutManager);
        this.f128884d.a(new b(this.f128882b, (int) n.b(getContext(), 1.0f)));
        this.f128883c.f128856l = this.f128884d;
        this.f128884d.setAdapter(this.f128883c);
        if (this.f128890j) {
            this.f128883c.c(this.f128892l);
        }
        if (this.f128883c != null) {
            this.f128883c.f128845a = this.f128889i;
            this.f128883c.f128846b = g2;
        }
        if (!TextUtils.isEmpty(this.q)) {
            this.f128887g.setVisibility(0);
            this.f128887g.setText(this.q);
        } else {
            this.f128887g.setVisibility(8);
        }
        this.f128888h.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void a(List<MvImageChooseAdapter.MyMediaModel> list, boolean z) {
        if (list != null) {
            this.f128888h.setVisibility(8);
            if (list.isEmpty()) {
                this.r.setVisibility(0);
                this.r.setText(R.string.cgk);
                if (this.n) {
                    b.a.f132249a.end(OpenAlbumPanelPerformanceMonitor.f132344a, "imageLoaded");
                    this.n = false;
                }
            } else {
                this.r.setVisibility(8);
            }
            if (z) {
                this.f128883c.a(list);
            } else {
                this.f128883c.b(list);
            }
            d.a("tool_performance_fetch_album_assets", new com.ss.android.ugc.tools.f.b().a("duration", System.currentTimeMillis() - this.f128893m.longValue()).a(StringSet.type, 2).a("count", list.size()).f149193a);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view, MediaModel mediaModel, Object obj) {
        if (obj == null || !((Boolean) obj).booleanValue()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getContext().getString(R.string.dq6)).a();
            return;
        }
        this.f128885e.a();
        if (this.f128883c.f128852h) {
            if (this.f128885e != null && (mediaModel instanceof MvImageChooseAdapter.MyMediaModel)) {
                this.f128885e.a((MvImageChooseAdapter.MyMediaModel) mediaModel, view);
            }
        } else if (this.f128885e != null) {
            this.f128885e.a(mediaModel);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f128886f = com.a.a(layoutInflater, R.layout.a8y, viewGroup, false);
        this.f128884d = (RecyclerView) this.f128886f.findViewById(R.id.bmb);
        this.f128884d.setRecycledViewPool(MediaRecycledViewPoolViewModel.a.a(getActivity()));
        this.f128887g = (TextView) this.f128886f.findViewById(R.id.bgc);
        this.r = (TextView) this.f128886f.findViewById(R.id.cvk);
        this.f128888h = (DmtLoadingLayout) this.f128886f.findViewById(R.id.bme);
        if (this.f128884d instanceof FastScrollRecyclerView) {
            ((FastScrollRecyclerView) this.f128884d).setFastScrollEnabled(true);
            ((FastScrollRecyclerView) this.f128884d).setFastScrollListener(this.p);
        }
        return this.f128886f;
    }
}
