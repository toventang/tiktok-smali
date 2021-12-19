package com.bytedance.android.livesdk.rank.impl;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.dc;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.watch.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class b extends v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f20650a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final a f20651b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private HashMap f20652c;

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20652c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20652c == null) {
            this.f20652c = new HashMap();
        }
        View view = (View) this.f20652c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20652c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12203);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(12202);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b80);
        bVar.f22381h = -1;
        bVar.f22382i = -2;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0415b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20653a;

        static {
            Covode.recordClassIndex(12204);
        }

        View$OnClickListenerC0415b(b bVar) {
            this.f20653a = bVar;
        }

        public final void onClick(View view) {
            this.f20653a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20654a;

        static {
            Covode.recordClassIndex(12205);
        }

        c(b bVar) {
            this.f20654a = bVar;
        }

        public final void onClick(View view) {
            Boolean bool;
            i childFragmentManager;
            v adminSettingDialog;
            DataChannel dataChannel = this.f20654a.p;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.b(ee.class);
            } else {
                bool = null;
            }
            if (p.a(bool)) {
                DataChannel dataChannel2 = this.f20654a.p;
                if (dataChannel2 != null) {
                    dataChannel2.a(dc.class, "pop_window");
                }
                Fragment parentFragment = this.f20654a.getParentFragment();
                if (!(parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null || (adminSettingDialog = ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getAdminSettingDialog()) == null)) {
                    l.b(childFragmentManager, "");
                    adminSettingDialog.show(childFragmentManager, "LiveAdminSettingDialog");
                }
            } else {
                ((d) com.bytedance.android.live.t.a.a(d.class)).openShareSettingsDialog(this.f20654a.getActivity(), "pop_window");
            }
            this.f20654a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.b(cp.class);
        } else {
            bool = null;
        }
        if (p.b(bool)) {
            dismiss();
            return;
        }
        ((LiveButton) a_(R.id.cyp)).setOnClickListener(new View$OnClickListenerC0415b(this));
        ((LiveTextView) a_(R.id.e02)).setOnClickListener(new c(this));
    }
}
