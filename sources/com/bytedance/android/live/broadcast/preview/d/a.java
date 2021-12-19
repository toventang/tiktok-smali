package com.bytedance.android.live.broadcast.preview.d;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.broadcast.preview.d.d;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.bytedance.android.live.broadcast.a.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f8173a;

    static {
        Covode.recordClassIndex(4155);
    }

    @Override // com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f8173a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f8173a == null) {
            this.f8173a = new HashMap();
        }
        View view = (View) this.f8173a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f8173a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8d);
        bVar.f22375b = R.style.a2d;
        bVar.a(new ColorDrawable(0));
        bVar.f22380g = 80;
        bVar.f22382i = -1;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0123a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8174a;

        static {
            Covode.recordClassIndex(4156);
        }

        View$OnClickListenerC0123a(a aVar) {
            this.f8174a = aVar;
        }

        public final void onClick(View view) {
            this.f8174a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a_(R.id.d0w).setOnClickListener(new View$OnClickListenerC0123a(this));
        getChildFragmentManager().a().a(R.id.b94, d.a.a("live_take_page")).b();
    }
}
