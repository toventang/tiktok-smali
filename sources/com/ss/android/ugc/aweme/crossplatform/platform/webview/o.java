package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ce.b;
import h.f.b.l;
import java.io.File;

public final class o extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    public static final a f78908e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ValueCallback<Uri> f78909a;

    /* renamed from: b  reason: collision with root package name */
    public ValueCallback<Uri[]> f78910b;

    /* renamed from: c  reason: collision with root package name */
    public String f78911c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78912d;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f78913f;

    static {
        Covode.recordClassIndex(48971);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static Intent c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    private static Intent d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f78913f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    private final Intent a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a2 = a(b(), c(), d());
        a2.putExtra("android.intent.extra.INTENT", intent);
        return a2;
    }

    private final Intent b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File a2 = a(d.a(), Environment.DIRECTORY_DCIM);
        if (a2 == null) {
            a2 = new File(a(d.a()), Environment.DIRECTORY_DCIM);
        }
        l.b(a2, "");
        File file = new File(a2.getAbsolutePath() + File.separator + "browser-photos");
        file.mkdirs();
        this.f78911c = file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        Context context = getContext();
        String str = this.f78911c;
        if (str == null) {
            l.b();
        }
        intent.putExtra("output", a(context, new File(str)));
        return intent;
    }

    private static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    private static Intent a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    static final class b implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f78914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueCallback f78915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WebChromeClient.FileChooserParams f78916c;

        static {
            Covode.recordClassIndex(48973);
        }

        b(o oVar, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            this.f78914a = oVar;
            this.f78915b = valueCallback;
            this.f78916c = fileChooserParams;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            String str;
            l.b(iArr, "");
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            this.f78914a.f78910b = this.f78915b;
            o oVar = this.f78914a;
            String[] acceptTypes = this.f78916c.getAcceptTypes();
            l.b(acceptTypes, "");
            if (acceptTypes.length == 0) {
                str = "";
            } else {
                str = this.f78916c.getAcceptTypes()[0];
            }
            oVar.a(str, "");
        }
    }

    private static Uri a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    private static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.o.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r4 == null) goto L_0x001d;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.o.onActivityResult(int, int, android.content.Intent):void");
    }
}
