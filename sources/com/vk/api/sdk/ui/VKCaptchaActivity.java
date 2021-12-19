package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.vk.api.sdk.f.g;
import com.vk.api.sdk.f.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VKCaptchaActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static String f156361d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f156362e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    EditText f156363a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f156364b;

    /* renamed from: c  reason: collision with root package name */
    public ProgressBar f156365c;

    static {
        Covode.recordClassIndex(103843);
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
            Covode.recordClassIndex(103844);
        }

        private a() {
        }

        /* renamed from: com.vk.api.sdk.ui.VKCaptchaActivity$a$a  reason: collision with other inner class name */
        public static final class RunnableC4125a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f156366a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f156367b;

            static {
                Covode.recordClassIndex(103845);
            }

            public RunnableC4125a(Context context, String str) {
                this.f156366a = context;
                this.f156367b = str;
            }

            public final void run() {
                Intent putExtra = new Intent(this.f156366a, VKCaptchaActivity.class).addFlags(268435456).putExtra("key_url", this.f156367b);
                l.a((Object) putExtra, "");
                Context context = this.f156366a;
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
        overridePendingTransition(0, 0);
    }

    public final void a() {
        f156361d = null;
        h.b();
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        h.b();
        super.onDestroy();
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKCaptchaActivity f156368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f156369b;

        static {
            Covode.recordClassIndex(103846);
        }

        b(VKCaptchaActivity vKCaptchaActivity, Bitmap bitmap) {
            this.f156368a = vKCaptchaActivity;
            this.f156369b = bitmap;
        }

        public final void run() {
            ImageView imageView = this.f156368a.f156364b;
            if (imageView == null) {
                l.a("image");
            }
            imageView.setImageBitmap(this.f156369b);
            ProgressBar progressBar = this.f156368a.f156365c;
            if (progressBar == null) {
                l.a("progress");
            }
            progressBar.setVisibility(8);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKCaptchaActivity f156370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f156371b;

        static {
            Covode.recordClassIndex(103847);
        }

        c(VKCaptchaActivity vKCaptchaActivity, String str) {
            this.f156370a = vKCaptchaActivity;
            this.f156371b = str;
        }

        public final void run() {
            MethodCollector.i(1476);
            String str = this.f156371b;
            l.a((Object) str, "");
            byte[] a2 = com.vk.api.sdk.f.f.a(str);
            if (a2 != null) {
                VKCaptchaActivity vKCaptchaActivity = this.f156370a;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length);
                l.a((Object) decodeByteArray, "");
                com.vk.api.sdk.l.a(new b(vKCaptchaActivity, decodeByteArray));
            }
            MethodCollector.o(1476);
        }
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

    static final class f implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKCaptchaActivity f156374a;

        static {
            Covode.recordClassIndex(103850);
        }

        f(VKCaptchaActivity vKCaptchaActivity) {
            this.f156374a = vKCaptchaActivity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f156374a.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(148);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        int ceil = (int) Math.ceil((double) (g.a().density * 12.0f));
        int max = (int) (Math.max(1.0f, g.a().density) * 130.0f);
        linearLayout.setPadding(ceil, ceil, ceil, ceil);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, (int) (Math.max(1.0f, g.a().density) * 50.0f));
        layoutParams.bottomMargin = ceil;
        frameLayout.setLayoutParams(layoutParams);
        this.f156365c = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.f156365c;
        if (progressBar == null) {
            l.a("progress");
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.f156365c;
        if (progressBar2 == null) {
            l.a("progress");
        }
        frameLayout.addView(progressBar2);
        this.f156364b = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.f156364b;
        if (imageView == null) {
            l.a("image");
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.f156364b;
        if (imageView2 == null) {
            l.a("image");
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.f156363a = editText;
        editText.setInputType(176);
        EditText editText2 = this.f156363a;
        if (editText2 == null) {
            l.a("input");
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(max, -2);
        EditText editText3 = this.f156363a;
        if (editText3 == null) {
            l.a("input");
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.f156363a;
        if (view == null) {
            l.a("input");
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.hd1).setPositiveButton(17039370, new d(this)).setNegativeButton(17039360, new e(this)).setOnCancelListener(new f(this)).show();
        EditText editText4 = this.f156363a;
        if (editText4 == null) {
            l.a("input");
        }
        editText4.requestFocus();
        com.vk.api.sdk.l.a().submit(new c(this, a(getIntent(), "key_url")));
        MethodCollector.o(148);
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKCaptchaActivity f156373a;

        static {
            Covode.recordClassIndex(103849);
        }

        e(VKCaptchaActivity vKCaptchaActivity) {
            this.f156373a = vKCaptchaActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f156373a.a();
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VKCaptchaActivity f156372a;

        static {
            Covode.recordClassIndex(103848);
        }

        d(VKCaptchaActivity vKCaptchaActivity) {
            this.f156372a = vKCaptchaActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            VKCaptchaActivity vKCaptchaActivity = this.f156372a;
            EditText editText = vKCaptchaActivity.f156363a;
            if (editText == null) {
                l.a("input");
            }
            VKCaptchaActivity.f156361d = editText.getText().toString();
            h.b();
            vKCaptchaActivity.finish();
        }
    }
}
