package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.qrcode.l;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f44219a;

    /* renamed from: b  reason: collision with root package name */
    private b f44220b;

    static {
        Covode.recordClassIndex(27092);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388629;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        return l.a.f119757a.a().booleanValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        MethodCollector.i(6888);
        if (ax.b()) {
            ImageView b2 = HomePageUIFrameServiceImpl.e().b(this.f44220b.getActivity());
            this.f44219a = b2;
            ViewGroup viewGroup = (ViewGroup) b2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f44219a);
            }
        } else {
            this.f44219a = HomePageUIFrameServiceImpl.e().d(this.f44220b.getActivity());
        }
        ImageView imageView = this.f44219a;
        MethodCollector.o(6888);
        return imageView;
    }

    public e(b bVar) {
        this.f44220b = bVar;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        r.a("qr_code_scan_enter", new d().a("enter_from", "homepage_hot").f66730a);
        androidx.fragment.app.e activity = this.f44220b.getActivity();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - QRCodePermissionActivity.f119804c >= 1000) {
            QRCodePermissionActivity.f119804c = currentTimeMillis;
            Intent intent = new Intent(activity, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", false);
            QRCodePermissionActivity.a(activity, intent);
        }
    }
}
