package com.ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static Bundle f113886a;

    /* renamed from: b  reason: collision with root package name */
    public static int f113887b;

    /* renamed from: c  reason: collision with root package name */
    public static int f113888c;

    /* renamed from: d  reason: collision with root package name */
    static WeakReference<NoticeView> f113889d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f113890e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f113891f = new n();

    /* renamed from: g  reason: collision with root package name */
    private static int f113892g;

    /* renamed from: h  reason: collision with root package name */
    private static int f113893h;

    public static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "comments" : "mentions" : "likes" : "followers";
    }

    private n() {
    }

    static {
        Covode.recordClassIndex(73239);
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            pushGuideInfo pushGuideInfo = iESSettingsProxy.getPushGuideInfo();
            l.b(pushGuideInfo, "");
            Integer closeCountLimit = pushGuideInfo.getCloseCountLimit();
            if (closeCountLimit == null) {
                l.b();
            }
            f113887b = closeCountLimit.intValue();
            IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            pushGuideInfo pushGuideInfo2 = iESSettingsProxy2.getPushGuideInfo();
            l.b(pushGuideInfo2, "");
            Integer showupInterval = pushGuideInfo2.getShowupInterval();
            if (showupInterval == null) {
                l.b();
            }
            f113888c = showupInterval.intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            f113887b = 3;
            f113888c = 15;
        }
    }

    public static long a(Context context) {
        return com.ss.android.ugc.aweme.co.b.b().e(context, "key_times_push_notification_guide");
    }

    public static void a(NoticeView noticeView) {
        l.d(noticeView, "");
        f113889d = new WeakReference<>(noticeView);
    }

    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f113894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f113895b;

        static {
            Covode.recordClassIndex(73240);
        }

        public a(int i2, Context context) {
            this.f113894a = i2;
            this.f113895b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            try {
                fg.c(this.f113895b);
            } catch (Exception unused) {
                Context context = this.f113895b;
                Intent intent = new Intent("android.settings.SETTINGS");
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
            r.a("push_pre_permission_auth", new d().a("scene_id", "1001").a("trigger_method", n.a(this.f113894a)).f66730a);
        }
    }

    public static void a(Bundle bundle, int i2) {
        if (bundle == null) {
            f113886a = null;
        }
        if (f113890e && i2 <= f113892g + f113893h && !o.a(com.bytedance.ies.ugc.appcontext.d.a())) {
            f113886a = bundle;
        }
    }

    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f113896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f113897b;

        static {
            Covode.recordClassIndex(73241);
        }

        public b(int i2, Context context) {
            this.f113896a = i2;
            this.f113897b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            NoticeView noticeView;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            com.ss.android.ugc.aweme.co.b.b().a(this.f113897b, "key_cross_push_notification_guide", System.currentTimeMillis());
            com.ss.android.ugc.aweme.co.b.b().a(this.f113897b, "key_times_push_notification_guide", n.a(this.f113897b) + 1);
            WeakReference<NoticeView> weakReference = n.f113889d;
            if (!(weakReference == null || (noticeView = weakReference.get()) == null || noticeView.getVisibility() != 0)) {
                noticeView.setVisibility(8);
            }
            r.a("push_pre_permission_deny", new d().a("scene_id", "1001").a("trigger_method", n.a(this.f113896a)).f66730a);
        }
    }

    public static View a(Context context, Bundle bundle) {
        View inflate;
        MethodCollector.i(722);
        if (gb.a(context)) {
            inflate = LayoutInflater.from(context).inflate(R.layout.lh, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.lg, (ViewGroup) null);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) com.bytedance.common.utility.n.b(context, 162.0f));
        l.b(inflate, "");
        inflate.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.f56);
        TextView textView2 = (TextView) inflate.findViewById(R.id.f55);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.c02);
        l.b(textView, "");
        textView.setText(bundle.getString("username"));
        l.b(textView2, "");
        textView2.setText(bundle.getString("content"));
        try {
            Serializable serializable = bundle.getSerializable("avatar_thumb");
            if (serializable != null) {
                e.a(remoteImageView, (UrlModel) serializable);
                MethodCollector.o(722);
                return inflate;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
            MethodCollector.o(722);
            throw nullPointerException;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(boolean z, int i2, int i3) {
        f113890e = z;
        f113892g = i2;
        f113893h = i3;
    }
}
