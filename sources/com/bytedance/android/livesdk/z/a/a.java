package com.bytedance.android.livesdk.z.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.z.b.b;
import com.bytedance.android.livesdk.z.b.c;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends v {

    /* renamed from: a  reason: collision with root package name */
    LiveTextView f22921a;

    /* renamed from: b  reason: collision with root package name */
    LiveTextView f22922b;

    /* renamed from: c  reason: collision with root package name */
    public long f22923c;

    /* renamed from: d  reason: collision with root package name */
    public int f22924d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.b.a f22925e = new f.a.b.a();

    static {
        Covode.recordClassIndex(13544);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        com.bytedance.android.livesdk.an.a.a().a(new c());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f22925e.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6n);
        bVar.f22385l = 48;
        bVar.f22380g = 17;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f22921a = (LiveTextView) view.findViewById(R.id.afu);
        this.f22922b = (LiveTextView) view.findViewById(R.id.afv);
        ((LiveTextView) view.findViewById(R.id.ca4)).setOnClickListener(new b(this));
        view.findViewById(R.id.ca1).setOnClickListener(new c(this));
        Resources resources = getResources();
        long j2 = this.f22923c;
        String quantityString = resources.getQuantityString(R.plurals.gf, (int) j2, Integer.valueOf((int) j2));
        int i2 = this.f22924d;
        ((LiveTextView) view.findViewById(R.id.ca2)).setText(quantityString + resources.getQuantityString(R.plurals.gg, i2, Integer.valueOf(i2)));
        this.f22925e.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.a.class).d(new d(this)));
        this.f22925e.a(com.bytedance.android.livesdk.an.a.a().a(b.class).d(new e(this)));
        a.C0498a.f22936a.a();
    }
}
