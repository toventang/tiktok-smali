package com.ss.android.ugc.aweme.sticker.effectconfig;

import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final e f134820a;

    /* renamed from: b  reason: collision with root package name */
    public final c f134821b;

    /* renamed from: c  reason: collision with root package name */
    public final EffectConfigViewModel f134822c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f134823d;

    static {
        Covode.recordClassIndex(88133);
    }

    public final boolean a() {
        if (TextUtils.isEmpty(this.f134823d.aE)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f134823d.aE);
            String optString = jSONObject.optString("effect_key");
            JSONObject jSONObject2 = jSONObject.getJSONObject("effect_meta_info_value");
            c cVar = this.f134821b;
            l.b(optString, "");
            String jSONObject3 = jSONObject2.toString();
            l.b(jSONObject3, "");
            cVar.a(optString, jSONObject3);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134831a;

        static {
            Covode.recordClassIndex(88140);
        }

        public c(b bVar) {
            this.f134831a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final a aVar = (a) obj;
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.sticker.effectconfig.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f134832a;

                static {
                    Covode.recordClassIndex(88141);
                }

                {
                    this.f134832a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.f134832a.f134831a.a(aVar);
                    return z.f158842a;
                }
            }, g.a());
        }
    }

    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134824a;

        static {
            Covode.recordClassIndex(88134);
        }

        public a(b bVar) {
            this.f134824a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final a aVar = (a) obj;
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.sticker.effectconfig.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f134825a;

                static {
                    Covode.recordClassIndex(88135);
                }

                {
                    this.f134825a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f134825a.f134824a.a());
                }
            }, g.a()).a(new b.g(this) {
                /* class com.ss.android.ugc.aweme.sticker.effectconfig.b.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f134826a;

                static {
                    Covode.recordClassIndex(88136);
                }

                {
                    this.f134826a = r1;
                }

                @Override // b.g
                public final /* synthetic */ Object then(i iVar) {
                    boolean z;
                    l.b(iVar, "");
                    Object d2 = iVar.d();
                    l.b(d2, "");
                    if (((Boolean) d2).booleanValue()) {
                        this.f134826a.f134824a.a(aVar);
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, g.a(), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b$b  reason: collision with other inner class name */
    public static final class C3513b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134828a;

        static {
            Covode.recordClassIndex(88137);
        }

        public C3513b(b bVar) {
            this.f134828a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final a aVar = (a) obj;
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.sticker.effectconfig.b.C3513b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3513b f134829a;

                static {
                    Covode.recordClassIndex(88138);
                }

                {
                    this.f134829a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f134829a.f134828a.a());
                }
            }, g.a()).a(new b.g() {
                /* class com.ss.android.ugc.aweme.sticker.effectconfig.b.C3513b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(88139);
                }

                @Override // b.g
                public final /* synthetic */ Object then(i iVar) {
                    a aVar;
                    l.b(iVar, "");
                    Object d2 = iVar.d();
                    l.b(d2, "");
                    if (((Boolean) d2).booleanValue() && (aVar = aVar) != null) {
                        aVar.a();
                    }
                    return iVar.d();
                }
            }, i.f4826c, null);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.sticker.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134835b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f134836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONArray f134837d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f134838e;

        static {
            Covode.recordClassIndex(88142);
        }

        @Override // com.ss.android.ugc.aweme.sticker.e.c, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            a aVar;
            super.onSuccessed(downloadInfo);
            if (downloadInfo != null) {
                downloadInfo.getSavePath();
                downloadInfo.getName();
                if (this.f134836c == this.f134837d.length() - 1 && (aVar = this.f134838e) != null) {
                    aVar.a();
                }
            }
        }

        d(b bVar, String str, int i2, JSONArray jSONArray, a aVar) {
            this.f134834a = bVar;
            this.f134835b = str;
            this.f134836c = i2;
            this.f134837d = jSONArray;
            this.f134838e = aVar;
        }
    }

    public final void a(a aVar) {
        if (!TextUtils.isEmpty(this.f134823d.aF)) {
            try {
                JSONArray jSONArray = new JSONObject(this.f134823d.aF).getJSONArray("effect_image_list");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String optString = jSONObject.optString("effect_key");
                        String optString2 = jSONObject.optString("effect_image_value");
                        e eVar = this.f134820a;
                        l.b(optString2, "");
                        d dVar = new d(this, optString, i2, jSONArray, aVar);
                        l.d(eVar, "");
                        l.d(optString2, "");
                        l.d(dVar, "");
                        DownloadInfo downloadInfo = new DownloadInfo();
                        if (TextUtils.isEmpty(optString2)) {
                            dVar.onFailed(downloadInfo, new BaseException(0, "url=null"));
                        }
                        if (!j.f107226e || !j.b() || j.c()) {
                            j.f107226e = d.a();
                        }
                        if (!j.f107226e) {
                            dVar.onFailed(downloadInfo, new BaseException(0, "network error"));
                        }
                        byte[] bytes = optString2.getBytes(h.m.d.f158808a);
                        l.b(bytes, "");
                        File file = new File(EffectPlatform.f89012a.getAbsolutePath() + File.separator + Base64.encodeToString(bytes, 2));
                        Downloader.with(eVar).url(optString2).savePath(file.getParent() + File.separator).name(file.getName()).mainThreadListener(dVar).retryCount(1).download();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public b(e eVar, ShortVideoContext shortVideoContext, c cVar, EffectConfigViewModel effectConfigViewModel) {
        l.d(eVar, "");
        l.d(shortVideoContext, "");
        l.d(cVar, "");
        l.d(effectConfigViewModel, "");
        this.f134820a = eVar;
        this.f134823d = shortVideoContext;
        this.f134821b = cVar;
        this.f134822c = effectConfigViewModel;
    }
}
