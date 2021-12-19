package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.utils.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.ecommerce.common.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f85074a;

    /* renamed from: b  reason: collision with root package name */
    public final String f85075b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f85076c;

    static {
        Covode.recordClassIndex(53175);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f85076c == null) {
            this.f85076c = new SparseArray();
        }
        View view = (View) this.f85076c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85076c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f85076c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85077a;

        static {
            Covode.recordClassIndex(53176);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
        }

        a(b bVar) {
            this.f85077a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            Dialog dialog = this.f85077a.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        super((byte) 0);
        l.d(str, "");
        l.d(str2, "");
        this.f85074a = str;
        this.f85075b = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        NormalTitleBar normalTitleBar = (NormalTitleBar) a(R.id.em8);
        ImageView startBtn = normalTitleBar.getStartBtn();
        l.b(startBtn, "");
        startBtn.setVisibility(8);
        normalTitleBar.setTitle(this.f85074a);
        normalTitleBar.setOnTitleBarClickListener(new a(this));
        BulletContainerView bulletContainerView = (BulletContainerView) a(R.id.a0n);
        bulletContainerView.a(BulletService.f().a());
        IBulletService f2 = BulletService.f();
        Context requireContext = requireContext();
        l.b(requireContext, "");
        bulletContainerView.a(f2.a(requireContext), 17, 0, 0, 0, 0);
        h.a.a(bulletContainerView, c.a(this.f85075b), null, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.p6, viewGroup, false);
    }
}
