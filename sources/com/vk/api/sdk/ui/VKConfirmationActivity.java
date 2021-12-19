package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.vk.api.sdk.f.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VKConfirmationActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f156375a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f156376b = new a((byte) 0);

    static {
        Covode.recordClassIndex(103851);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103852);
        }

        private a() {
        }

        /* renamed from: com.vk.api.sdk.ui.VKConfirmationActivity$a$a  reason: collision with other inner class name */
        public static final class RunnableC4126a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f156377a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f156378b;

            static {
                Covode.recordClassIndex(103853);
            }

            public RunnableC4126a(Context context, String str) {
                this.f156377a = context;
                this.f156378b = str;
            }

            public final void run() {
                Intent putExtra = new Intent(this.f156377a, VKConfirmationActivity.class).addFlags(268435456).putExtra("key_message", this.f156378b);
                l.a((Object) putExtra, "");
                Context context = this.f156377a;
                com.ss.android.ugc.tiktok.security.a.a.a(putExtra, context);
                context.startActivity(putExtra);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void finish() {
        super.finish();
        h.b();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        h.b();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class d implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKConfirmationActivity f156381a;

        static {
            Covode.recordClassIndex(103856);
        }

        d(VKConfirmationActivity vKConfirmationActivity) {
            this.f156381a = vKConfirmationActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            VKConfirmationActivity.f156375a = false;
            this.f156381a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(635);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        new AlertDialog.Builder(this, 5).setTitle(R.string.hd2).setMessage(a(getIntent(), "key_message")).setPositiveButton(17039370, new b(this)).setNegativeButton(17039360, new c(this)).setOnCancelListener(new d(this)).show();
        MethodCollector.o(635);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKConfirmationActivity f156379a;

        static {
            Covode.recordClassIndex(103854);
        }

        b(VKConfirmationActivity vKConfirmationActivity) {
            this.f156379a = vKConfirmationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            VKConfirmationActivity.f156375a = true;
            this.f156379a.finish();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKConfirmationActivity f156380a;

        static {
            Covode.recordClassIndex(103855);
        }

        c(VKConfirmationActivity vKConfirmationActivity) {
            this.f156380a = vKConfirmationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            VKConfirmationActivity.f156375a = false;
            this.f156380a.finish();
        }
    }
}
