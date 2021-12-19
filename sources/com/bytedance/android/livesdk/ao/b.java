package com.bytedance.android.livesdk.ao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.android.live.core.f.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class b extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f13988a;

    static {
        Covode.recordClassIndex(7763);
    }

    private View a(int i2) {
        if (this.f13988a == null) {
            this.f13988a = new HashMap();
        }
        View view = (View) this.f13988a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13988a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13988a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ao.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0297b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13990a;

        static {
            Covode.recordClassIndex(7765);
        }

        View$OnClickListenerC0297b(b bVar) {
            this.f13990a = bVar;
        }

        public final void onClick(View view) {
            this.f13990a.a(new com.bytedance.android.livesdk.ao.a.a());
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13989a;

        static {
            Covode.recordClassIndex(7764);
        }

        a(b bVar) {
            this.f13989a = bVar;
        }

        public final void onClick(View view) {
            try {
                Object newInstance = x.a("com.bytedance.android.debug_tool.ui.MainDebugFragment").newInstance();
                if (!(newInstance instanceof Fragment)) {
                    newInstance = null;
                }
                Fragment fragment = (Fragment) newInstance;
                if (fragment != null) {
                    this.f13989a.a(fragment);
                }
            } catch (Exception unused) {
                ao.a(y.e(), "live-settings debug page exception", 0);
            }
        }
    }

    public final void a(Fragment fragment) {
        n a2 = getChildFragmentManager().a();
        l.b(a2, "");
        if (!fragment.isAdded()) {
            a2.a(R.id.ad7, fragment, fragment.getClass().getName()).c();
        } else {
            a2.c(fragment).c();
        }
        getChildFragmentManager().b();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((LiveButton) a(R.id.dzz)).setOnClickListener(new a(this));
        ((LiveButton) a(R.id.c3p)).setOnClickListener(new View$OnClickListenerC0297b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.afn, viewGroup, false);
    }
}
