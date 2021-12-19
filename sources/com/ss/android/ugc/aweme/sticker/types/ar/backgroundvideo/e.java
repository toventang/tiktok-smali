package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import android.text.TextUtils;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import h.f.a.q;
import h.f.b.l;
import h.i.c;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f135797f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final String f135798a;

    /* renamed from: b  reason: collision with root package name */
    public String f135799b;

    /* renamed from: c  reason: collision with root package name */
    public String f135800c;

    /* renamed from: d  reason: collision with root package name */
    public final String f135801d = (dj.f126465h + "background_v");

    /* renamed from: e  reason: collision with root package name */
    public final String f135802e = (dj.f126465h + "background_a");

    /* renamed from: g  reason: collision with root package name */
    private final m f135803g;

    /* renamed from: h  reason: collision with root package name */
    private final Effect f135804h;

    static {
        Covode.recordClassIndex(88758);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88759);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements ISDKService.SplitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f135805a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f135806b;

        static {
            Covode.recordClassIndex(88760);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            this.f135806b.invoke(false, this.f135805a.f135801d, this.f135805a.f135802e);
        }

        b(e eVar, q qVar) {
            this.f135805a = eVar;
            this.f135806b = qVar;
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i2, int i3) {
            h.a(this.f135805a.f135799b, this.f135805a.f135801d);
            i.a(this.f135805a.f135800c, this.f135805a.f135802e);
            this.f135806b.invoke(true, this.f135805a.f135801d, this.f135805a.f135802e);
        }
    }

    /* access modifiers changed from: package-private */
    public final String[] a() {
        JSONArray optJSONArray;
        String[] strArr = {"", ""};
        if (TextUtils.isEmpty(this.f135804h.getSdkExtra())) {
            return strArr;
        }
        try {
            JSONObject optJSONObject = new JSONObject(this.f135804h.getSdkExtra()).optJSONObject("vl");
            if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("multi_vPath")) == null)) {
                if (optJSONArray.length() > 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("multi_aPath");
                    int a2 = h.j.h.a(h.j.h.a(0, optJSONArray.length()), c.Default);
                    strArr[0] = this.f135804h.getUnzipPath() + optJSONArray.getString(a2);
                    if (optJSONArray2 != null && a2 < optJSONArray2.length()) {
                        strArr[1] = this.f135804h.getUnzipPath() + optJSONArray2.getString(a2);
                    }
                }
            }
            return strArr;
        } catch (Exception unused) {
            com.ss.android.ugc.tools.utils.q.b("BackgroundVideo, parse sticker extra fail, " + this.f135804h + ".sdkExtra");
            return strArr;
        }
    }

    public e(m mVar, Effect effect) {
        l.d(mVar, "");
        l.d(effect, "");
        this.f135803g = mVar;
        this.f135804h = effect;
        String str = effect.getUnzipPath() + File.separator + "res_split";
        this.f135798a = str;
        this.f135799b = str + File.separator + "background_v";
        this.f135800c = str + File.separator + "background_a";
    }
}
