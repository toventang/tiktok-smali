package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.crop.a;
import com.bytedance.android.livesdk.utils.g;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.google.gson.a.c;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends e<a, b> {

    /* renamed from: a  reason: collision with root package name */
    private Fragment f14684a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14685b = "upload_photo";

    /* renamed from: c  reason: collision with root package name */
    private String f14686c;

    /* renamed from: d  reason: collision with root package name */
    private a f14687d;

    static {
        Covode.recordClassIndex(8157);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f14684a = null;
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        @c(a = "min_width")

        /* renamed from: a  reason: collision with root package name */
        int f14688a;
        @c(a = "min_height")

        /* renamed from: b  reason: collision with root package name */
        int f14689b;
        @c(a = "max_width")

        /* renamed from: c  reason: collision with root package name */
        int f14690c;
        @c(a = "max_height")

        /* renamed from: d  reason: collision with root package name */
        int f14691d;
        @c(a = "max_size")

        /* renamed from: e  reason: collision with root package name */
        int f14692e;

        static {
            Covode.recordClassIndex(8158);
        }

        a() {
        }
    }

    static final class b {
        @c(a = "tempFiles")

        /* renamed from: a  reason: collision with root package name */
        a[] f14693a;

        static {
            Covode.recordClassIndex(8159);
        }

        private b(a[] aVarArr) {
            this.f14693a = aVarArr;
        }

        /* synthetic */ b(a[] aVarArr, byte b2) {
            this(aVarArr);
        }

        static class a {
            @c(a = "path")

            /* renamed from: a  reason: collision with root package name */
            String f14694a;
            @c(a = "size")

            /* renamed from: b  reason: collision with root package name */
            int f14695b;
            @c(a = "base64Data")

            /* renamed from: c  reason: collision with root package name */
            String f14696c;

            static {
                Covode.recordClassIndex(8160);
            }

            public a(String str, int i2, String str2) {
                this.f14694a = str;
                this.f14695b = i2;
                this.f14696c = str2;
            }
        }
    }

    public l(Fragment fragment) {
        this.f14684a = fragment;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private void a(Uri uri) {
        com.bytedance.android.livesdk.utils.crop.a a2 = a.C0486a.a(uri);
        a2.a(new m(this));
        a2.show(this.f14684a.getChildFragmentManager(), "upload_photo");
    }

    private boolean b(String str) {
        MethodCollector.i(7610);
        Context context = this.callContext.f35646a;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (this.f14687d.f14688a > options.outWidth || this.f14687d.f14689b > options.outHeight) {
                ao.a(a(context), (int) R.string.gxm);
                MethodCollector.o(7610);
                return false;
            }
            if (options.outWidth > this.f14687d.f14690c || options.outHeight > this.f14687d.f14691d || options.outWidth * options.outHeight > this.f14687d.f14692e) {
                ao.a(a(context), (int) R.string.gxl);
                MethodCollector.o(7610);
                return false;
            }
            MethodCollector.o(7610);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(String str) {
        androidx.fragment.app.e activity = this.f14684a.getActivity();
        if (activity == null) {
            finishWithFailure();
            return null;
        } else if (!b(str)) {
            com.bytedance.android.livesdk.browser.a.a(activity, this.f14684a);
            return null;
        } else {
            Context context = this.callContext.f35646a;
            if (context != null) {
                File file = new File(str);
                if (!file.exists()) {
                    finishWithFailure();
                } else {
                    byte[] a2 = g.a(file);
                    if (!(a2 == null || a2.length == 0)) {
                        if (a2.length >= this.f14687d.f14692e) {
                            ao.a(a(context), y.a((int) R.string.gsn, Integer.valueOf((this.f14687d.f14692e / 1024) / 1024)), 0);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("uri", str);
                                jSONObject.put("file_name", "upload_photo_" + this.f14686c + "crop");
                                finishWithResult(new b(new b.a[]{new b.a(jSONObject.toString(), a2.length, "data:image/jpg;base64," + Base64.encodeToString(a2, 2))}, (byte) 0));
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                                finishWithFailure();
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, com.bytedance.ies.web.jsbridge2.g gVar) {
        this.f14687d = aVar;
        this.f14686c = String.valueOf(System.currentTimeMillis());
        com.bytedance.android.livesdk.browser.a.a(this.f14684a.getActivity(), this.f14684a);
    }

    public final void a(int i2, int i3, Intent intent) {
        MethodCollector.i(7606);
        if (i2 == 40003) {
            if (i3 != -1 || intent == null || intent.getData() == null) {
                finishWithFailure();
                MethodCollector.o(7606);
                return;
            }
            androidx.fragment.app.e activity = this.f14684a.getActivity();
            if (activity == null) {
                finishWithFailure();
                MethodCollector.o(7606);
                return;
            }
            Uri data = intent.getData();
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(activity.getContentResolver().openInputStream(data));
            } catch (Exception unused) {
            }
            if (bitmap == null) {
                n.a(activity, 2131234317, (int) R.string.gxi);
                finishWithFailure();
                MethodCollector.o(7606);
                return;
            }
            a(data);
        }
        MethodCollector.o(7606);
    }
}
