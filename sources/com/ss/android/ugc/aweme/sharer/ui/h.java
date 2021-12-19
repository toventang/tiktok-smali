package com.ss.android.ugc.aweme.sharer.ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface h {
    static {
        Covode.recordClassIndex(81917);
    }

    void a(Context context);

    void a(Context context, SharePackage sharePackage);

    void a(ImageView imageView);

    void a(TextView textView);

    int b();

    String c();

    int ch_();

    boolean d();

    boolean e();

    boolean f();

    int g();

    public static final class a {
        static {
            Covode.recordClassIndex(81918);
        }

        public static void a(h hVar, TextView textView) {
            l.d(textView, "");
            textView.setText(textView.getResources().getString(hVar.b()));
        }
    }
}
