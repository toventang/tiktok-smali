package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103415a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f103416b = n.a(56.0d);

    private a() {
    }

    static {
        Covode.recordClassIndex(66271);
    }

    public static void a(SharePackage sharePackage, View view) {
        l.d(sharePackage, "");
        l.d(view, "");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.cp2);
        ImageView imageView = (ImageView) view.findViewById(R.id.c1_);
        e eVar = new e();
        eVar.a(com.bytedance.common.utility.n.b(d.a(), 2.0f));
        String str = sharePackage.f124590d;
        int hashCode = str.hashCode();
        if (hashCode != 3178685) {
            if (hashCode == 603552178 && str.equals("good_window")) {
                l.b(remoteImageView, "");
                ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
                int i2 = f103416b;
                layoutParams.width = i2;
                layoutParams.height = i2;
                remoteImageView.setLayoutParams(layoutParams);
                eVar.f47476b = true;
                l.b(imageView, "");
                imageView.setVisibility(0);
            }
        } else if (str.equals("good")) {
            imageView.setImageResource(2131232800);
            l.b(imageView, "");
            imageView.setVisibility(0);
        }
        l.b(remoteImageView, "");
        com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) remoteImageView.getHierarchy();
        l.b(aVar, "");
        aVar.a(eVar);
    }
}
