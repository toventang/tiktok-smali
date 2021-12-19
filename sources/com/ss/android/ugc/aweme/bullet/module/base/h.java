package com.ss.android.ugc.aweme.bullet.module.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.commercialize.utils.bg;
import h.f.b.l;
import java.io.File;
import java.util.HashMap;

public final class h extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    public static final a f69453e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ValueCallback<Uri> f69454a;

    /* renamed from: b  reason: collision with root package name */
    public ValueCallback<Uri[]> f69455b;

    /* renamed from: c  reason: collision with root package name */
    public String f69456c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69457d;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f69458f;

    static {
        Covode.recordClassIndex(42813);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42814);
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
        HashMap hashMap = this.f69458f;
        if (hashMap != null) {
            hashMap.clear();
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
        this.f69456c = bg.a() + File.separator + System.currentTimeMillis() + ".jpg";
        Context context = getContext();
        String str = this.f69456c;
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

    static final class b implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f69459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueCallback f69460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f69461c;

        static {
            Covode.recordClassIndex(42815);
        }

        b(h hVar, ValueCallback valueCallback, String[] strArr) {
            this.f69459a = hVar;
            this.f69460b = valueCallback;
            this.f69461c = strArr;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            String str;
            l.b(iArr, "");
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length && iArr[i2] == 0) {
                this.f69459a.f69455b = this.f69460b;
                h hVar = this.f69459a;
                String[] strArr2 = this.f69461c;
                if (strArr2 == null || strArr2.length == 0) {
                    str = "";
                } else {
                    str = strArr2[0];
                }
                hVar.a(str, "");
                i2++;
            }
        }
    }

    private static Uri a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.h.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r3 == null) goto L_0x001d;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.h.onActivityResult(int, int, android.content.Intent):void");
    }
}
