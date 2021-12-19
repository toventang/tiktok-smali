package com.bytedance.android.live.effect.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.f;
import com.bytedance.android.live.effect.model.b;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0142a f9630c = new C0142a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f9631a;

    /* renamed from: b  reason: collision with root package name */
    public b f9632b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f9633d;

    static {
        Covode.recordClassIndex(4887);
    }

    /* renamed from: com.bytedance.android.live.effect.a.a$a  reason: collision with other inner class name */
    public static final class C0142a {
        static {
            Covode.recordClassIndex(4888);
        }

        private C0142a() {
        }

        public /* synthetic */ C0142a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f9633d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f9633d == null) {
            this.f9633d = new HashMap();
        }
        View view2 = (View) this.f9633d.get(Integer.valueOf((int) R.id.e6b));
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.e6b);
                this.f9633d.put(Integer.valueOf((int) R.id.e6b), view2);
            }
        }
        AdjustPercentBar adjustPercentBar = (AdjustPercentBar) view2;
        l.b(adjustPercentBar, "");
        g gVar = this.f9631a;
        b bVar = this.f9632b;
        l.d(adjustPercentBar, "");
        f fVar = new f();
        fVar.f9826a = adjustPercentBar;
        fVar.f9828c = gVar;
        fVar.f9829d = bVar;
        getChildFragmentManager().a().a(R.id.s8, fVar).e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9t, viewGroup, false);
    }
}
