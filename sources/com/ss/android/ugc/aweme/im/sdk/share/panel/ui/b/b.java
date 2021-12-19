package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.a;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.share.a.c;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public SharePanelWidget f103417a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.b.b f103418b;

    /* renamed from: c  reason: collision with root package name */
    public final c f103419c;

    static {
        Covode.recordClassIndex(66272);
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.b, com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.c
    public final View a() {
        SharePanelWidget sharePanelWidget = this.f103417a;
        if (sharePanelWidget == null) {
            return null;
        }
        View view = sharePanelWidget.f103548e;
        if (view == null) {
            l.a("editLayout");
        }
        return view;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.b, com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.c
    public final View b() {
        SharePanelWidget sharePanelWidget = this.f103417a;
        if (sharePanelWidget != null) {
            return sharePanelWidget.f103551h;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.b, com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.c
    public final List<IMContact> c() {
        SharePanelWidget sharePanelWidget = this.f103417a;
        if (sharePanelWidget == null) {
            return null;
        }
        SharePanelViewModel sharePanelViewModel = sharePanelWidget.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        return n.g((Collection) sharePanelViewModel.b());
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.b, com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.c
    public final void d() {
        SharePanelWidget sharePanelWidget = this.f103417a;
        if (sharePanelWidget != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.f103545b;
            if (sharePanelViewModel == null) {
                l.a("viewModel");
            }
            sharePanelViewModel.b().clear();
            a aVar = sharePanelWidget.f103550g;
            if (aVar != null) {
                aVar.b().d();
                aVar.d();
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar = sharePanelWidget.f103547d;
            if (bVar == null) {
                l.a("headAdapter");
            }
            bVar.notifyDataSetChanged();
            RecyclerView recyclerView = sharePanelWidget.f103546c;
            if (recyclerView == null) {
                l.a("headRecyclerView");
            }
            recyclerView.b(0);
            sharePanelWidget.b();
            sharePanelWidget.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.im.service.share.b.b bVar, c cVar) {
        super(bVar);
        l.d(bVar, "");
        l.d(cVar, "");
        this.f103418b = bVar;
        this.f103419c = cVar;
    }
}
