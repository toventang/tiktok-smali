package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.views.i;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

public abstract class a implements b, m {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f91204a;

    /* renamed from: c  reason: collision with root package name */
    public C2200a f91205c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.fe.method.upload.b f91206d;

    /* renamed from: e  reason: collision with root package name */
    public short[] f91207e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f91208f = true;

    static {
        Covode.recordClassIndex(57407);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a$a  reason: collision with other inner class name */
    public static class C2200a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<com.ss.android.ugc.aweme.fe.method.upload.b> f91213a;

        /* renamed from: b  reason: collision with root package name */
        private i f91214b;

        static {
            Covode.recordClassIndex(57410);
        }

        public final void a() {
            i iVar = this.f91214b;
            if (iVar != null) {
                iVar.dismiss();
                this.f91214b = null;
                WeakReference<com.ss.android.ugc.aweme.fe.method.upload.b> weakReference = this.f91213a;
                if (weakReference != null) {
                    weakReference.clear();
                    this.f91213a = null;
                }
            }
        }

        public final void a(Context context) {
            i iVar = this.f91214b;
            if (iVar == null || !iVar.isShowing()) {
                i iVar2 = new i(context, context.getString(R.string.h7d));
                this.f91214b = iVar2;
                iVar2.show();
            }
        }

        public final void a(Context context, com.ss.android.ugc.aweme.fe.method.upload.b bVar) {
            this.f91214b = new i(context, context.getString(R.string.h7d));
            this.f91213a = new WeakReference<>(bVar);
            this.f91214b.setOnCancelListener(new b(this));
            this.f91214b.show();
        }
    }

    public a(WeakReference<Context> weakReference) {
        this.f91204a = weakReference;
        this.f91205c = new C2200a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1.equals("camera-image") == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.a.a(org.json.JSONObject):void");
    }

    private String[] a(Resources resources, JSONArray jSONArray) {
        String[] strArr = {resources.getString(R.string.b0a), resources.getString(R.string.ayo), resources.getString(R.string.b2a), resources.getString(R.string.b2b), resources.getString(R.string.a9e)};
        int length = jSONArray.length() + 1;
        String[] strArr2 = new String[length];
        this.f91207e = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            String optString = jSONArray.optString(i2);
            optString.hashCode();
            switch (optString.hashCode()) {
                case -2031693645:
                    if (optString.equals("camera-image")) {
                        this.f91207e[i2] = 0;
                        strArr2[i2] = strArr[0];
                        continue;
                    }
                    break;
                case -2019804205:
                    if (optString.equals("camera-video")) {
                        this.f91207e[i2] = 2;
                        strArr2[i2] = strArr[2];
                        continue;
                    }
                    break;
                case -1903465347:
                    if (optString.equals("album-image")) {
                        this.f91207e[i2] = 1;
                        strArr2[i2] = strArr[1];
                        continue;
                    }
                    break;
                case -1891575907:
                    if (optString.equals("album-video")) {
                        this.f91207e[i2] = 3;
                        strArr2[i2] = strArr[3];
                        continue;
                    }
                    break;
            }
            this.f91207e[i2] = 4;
            strArr2[i2] = strArr[4];
        }
        return strArr2;
    }

    @Override // com.ss.android.ugc.aweme.base.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        com.ss.android.ugc.aweme.fe.method.upload.b bVar;
        if ((i2 == 1 || i2 == 600 || i2 == 700 || i2 == 800 || i2 == 900 || i2 == 10003) && (bVar = this.f91206d) != null) {
            return bVar.a(i2, i3, intent);
        }
        a(0, "uploadFailed");
        return true;
    }
}
