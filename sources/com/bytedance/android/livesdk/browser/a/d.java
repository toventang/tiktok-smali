package com.bytedance.android.livesdk.browser.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.utils.g;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.ref.WeakReference;

public class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public ValueCallback<Uri[]> f14262a;

    /* renamed from: b  reason: collision with root package name */
    String f14263b;

    /* renamed from: c  reason: collision with root package name */
    boolean f14264c;

    /* renamed from: d  reason: collision with root package name */
    private ValueCallback<Uri> f14265d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Fragment> f14266e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f14267f;

    static {
        Covode.recordClassIndex(7907);
    }

    static Intent c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    static Intent d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    private Context e() {
        WeakReference<Fragment> weakReference = this.f14266e;
        if (weakReference != null && weakReference.get() != null) {
            return this.f14266e.get().getActivity();
        }
        WeakReference<Activity> weakReference2 = this.f14267f;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        return this.f14267f.get();
    }

    /* access modifiers changed from: package-private */
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a2 = a(b(), c(), d());
        a2.putExtra("android.intent.extra.INTENT", intent);
        return a2;
    }

    public View getVideoLoadingProgressView() {
        MethodCollector.i(8491);
        Context e2 = e();
        if (e2 != null) {
            FrameLayout frameLayout = new FrameLayout(e2);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LiveLoadingView liveLoadingView = new LiveLoadingView(e2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(liveLoadingView, layoutParams);
            MethodCollector.o(8491);
            return frameLayout;
        }
        MethodCollector.o(8491);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Intent b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f14263b = g.a() + File.separator + System.currentTimeMillis() + ".jpg";
        intent.putExtra("output", TTLiveFileProvider.getUri(e(), e().getPackageName() + ".ttlive_provider", new File(this.f14263b)));
        return intent;
    }

    public d(Activity activity) {
        this.f14267f = new WeakReference<>(activity);
    }

    static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public d(Fragment fragment) {
        this.f14266e = new WeakReference<>(fragment);
    }

    static Intent a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        WeakReference<Fragment> weakReference = this.f14266e;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Activity> weakReference2 = this.f14267f;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.f14267f.get().startActivityForResult(intent, 2048);
                return;
            }
            return;
        }
        this.f14266e.get().startActivityForResult(intent, 2048);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.a.d.a(int, int, android.content.Intent):void");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final String str;
        Activity activity;
        Fragment fragment;
        if (fileChooserParams.getAcceptTypes().length > 0) {
            str = fileChooserParams.getAcceptTypes()[0];
        } else {
            str = "";
        }
        WeakReference<Activity> weakReference = this.f14267f;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            WeakReference<Fragment> weakReference2 = this.f14266e;
            if (weakReference2 == null || (fragment = weakReference2.get()) == null) {
                activity = null;
            } else {
                activity = fragment.getActivity();
            }
        }
        f.a(activity).a(new com.bytedance.android.livesdk.ah.b.d() {
            /* class com.bytedance.android.livesdk.browser.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7908);
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void b(String... strArr) {
                valueCallback.onReceiveValue(null);
                d.this.f14262a = null;
            }

            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00be */
            @Override // com.bytedance.android.livesdk.ah.b.d
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(java.lang.String... r11) {
                /*
                // Method dump skipped, instructions count: 200
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.a.d.AnonymousClass1.a(java.lang.String[]):void");
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA");
        return true;
    }
}
