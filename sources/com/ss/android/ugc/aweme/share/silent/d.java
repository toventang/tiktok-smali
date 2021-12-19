package com.ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends PopupWindow {

    /* renamed from: c  reason: collision with root package name */
    public static final a f124330c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PullUpLayout f124331a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f124332b;

    /* renamed from: d  reason: collision with root package name */
    private final String f124333d;

    /* renamed from: e  reason: collision with root package name */
    private final UrlModel f124334e;

    static {
        Covode.recordClassIndex(81636);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81637);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f124335a;

        static {
            Covode.recordClassIndex(81638);
        }

        public b(d dVar) {
            this.f124335a = dVar;
        }

        public final void run() {
            d dVar = this.f124335a;
            if (dVar.isShowing()) {
                try {
                    if (!dVar.f124332b.isFinishing()) {
                        PullUpLayout pullUpLayout = dVar.f124331a;
                        if (pullUpLayout == null) {
                            l.a("pullUpLayout");
                        }
                        pullUpLayout.a(0.0f, true);
                        dVar.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Activity activity, String str, UrlModel urlModel) {
        super(activity);
        l.d(activity, "");
        l.d(str, "");
        l.d(urlModel, "");
        MethodCollector.i(11040);
        this.f124332b = activity;
        this.f124333d = str;
        this.f124334e = urlModel;
        setContentView(LayoutInflater.from(activity).inflate(R.layout.azt, (ViewGroup) null));
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(n.a(activity));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a17);
        TextView textView = (TextView) getContentView().findViewById(R.id.e0g);
        l.b(textView, "");
        textView.setText(activity.getResources().getString(R.string.fsi, str));
        e.a((RemoteImageView) getContentView().findViewById(R.id.e0i), urlModel);
        View findViewById = getContentView().findViewById(R.id.ddo);
        l.b(findViewById, "");
        PullUpLayout pullUpLayout = (PullUpLayout) findViewById;
        this.f124331a = pullUpLayout;
        if (pullUpLayout == null) {
            l.a("pullUpLayout");
        }
        pullUpLayout.a(getContentView().findViewById(R.id.apo));
        MethodCollector.o(11040);
    }
}
