package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import h.f.a.q;
import h.f.b.l;
import java.io.File;
import org.json.JSONObject;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f135787f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final String f135788a;

    /* renamed from: b  reason: collision with root package name */
    public final String f135789b;

    /* renamed from: c  reason: collision with root package name */
    public final String f135790c;

    /* renamed from: d  reason: collision with root package name */
    public final String f135791d = (dj.f126465h + "background_v");

    /* renamed from: e  reason: collision with root package name */
    public final String f135792e = (dj.f126465h + "background_a");

    /* renamed from: g  reason: collision with root package name */
    private final m f135793g;

    /* renamed from: h  reason: collision with root package name */
    private final Effect f135794h;

    static {
        Covode.recordClassIndex(88755);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88756);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements ISDKService.SplitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f135796b;

        static {
            Covode.recordClassIndex(88757);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            this.f135796b.invoke(false, this.f135795a.f135791d, this.f135795a.f135792e);
        }

        b(d dVar, q qVar) {
            this.f135795a = dVar;
            this.f135796b = qVar;
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i2, int i3) {
            h.a(this.f135795a.f135789b, this.f135795a.f135791d);
            i.a(this.f135795a.f135790c, this.f135795a.f135792e);
            this.f135796b.invoke(true, this.f135795a.f135791d, this.f135795a.f135792e);
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return this.f135794h.getUnzipPath() + new JSONObject(this.f135794h.getSdkExtra()).optJSONObject("vl").optString("vPath");
        } catch (Exception unused) {
            com.ss.android.ugc.tools.utils.q.b("BackgroundVideo, parse sticker extra fail, " + this.f135794h + ".sdkExtra");
            return "";
        }
    }

    public d(m mVar, Effect effect) {
        l.d(mVar, "");
        l.d(effect, "");
        this.f135793g = mVar;
        this.f135794h = effect;
        String str = effect.getUnzipPath() + File.separator + "res_split";
        this.f135788a = str;
        this.f135789b = str + File.separator + "background_v";
        this.f135790c = str + File.separator + "background_a";
    }
}
