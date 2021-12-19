package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.n.h;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.a.c;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import java.io.File;

public final class bn extends e<a, b> implements h.a, com.bytedance.android.livesdk.browser.jsbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    h f14589a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f14590b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f14591c;

    /* renamed from: d  reason: collision with root package name */
    private int f14592d;

    static {
        Covode.recordClassIndex(8116);
    }

    static final class a {
        @c(a = "aspect_x")

        /* renamed from: a  reason: collision with root package name */
        int f14595a;
        @c(a = "aspect_y")

        /* renamed from: b  reason: collision with root package name */
        int f14596b;
        @c(a = "min_width")

        /* renamed from: c  reason: collision with root package name */
        int f14597c;
        @c(a = "min_height")

        /* renamed from: d  reason: collision with root package name */
        int f14598d;
        @c(a = "max_size")

        /* renamed from: e  reason: collision with root package name */
        int f14599e;

        static {
            Covode.recordClassIndex(8118);
        }

        a() {
        }
    }

    @Override // com.bytedance.android.live.n.h.a
    public final void a() {
        b();
    }

    public final void b() {
        h hVar = this.f14589a;
        if (hVar != null) {
            hVar.b();
            this.f14589a = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        f.a.b.b bVar = this.f14591c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14590b = null;
        this.f14589a.b();
    }

    public bn(Fragment fragment) {
        this.f14590b = fragment;
    }

    static final class b {
        @c(a = "uri")

        /* renamed from: a  reason: collision with root package name */
        String f14600a;
        @c(a = "url")

        /* renamed from: b  reason: collision with root package name */
        String f14601b;

        static {
            Covode.recordClassIndex(8119);
        }

        private b(String str, String str2) {
            this.f14600a = str;
            this.f14601b = str2;
        }

        /* synthetic */ b(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, g gVar) {
        int i2;
        a aVar2 = aVar;
        if (aVar2.f14599e > 0) {
            i2 = aVar2.f14599e;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        this.f14592d = i2;
        h a2 = l.a(null, this.f14590b, "upload_photo_method", aVar2.f14595a, aVar2.f14596b, aVar2.f14597c, aVar2.f14598d, this);
        this.f14589a = a2;
        a2.c();
    }

    @Override // com.bytedance.android.live.n.h.a
    public final void a(final String str, String str2) {
        this.f14589a.a();
        File file = new File(str);
        if (!file.exists()) {
            b();
            return;
        }
        long length = file.length();
        int i2 = this.f14592d;
        if (length >= ((long) i2)) {
            ao.a(y.e(), y.a((int) R.string.gsn, Integer.valueOf((i2 / 1024) / 1024)), 0);
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
        ((UploadApi) com.bytedance.android.live.network.e.a().a(UploadApi.class)).upload(multipartTypedOutput).a(new f()).a_(new ae<d<com.bytedance.android.live.base.model.user.c>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.bn.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8117);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
                bn.this.f14591c = bVar;
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                Context context = bn.this.f14590b.getContext();
                if (context != null) {
                    com.bytedance.android.live.core.e.b.a.a(context, th, null);
                }
                bn.this.b();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(d<com.bytedance.android.live.base.model.user.c> dVar) {
                d<com.bytedance.android.live.base.model.user.c> dVar2 = dVar;
                ((com.bytedance.android.live.base.model.user.c) dVar2.data).f7456b = str;
                bn bnVar = bn.this;
                com.bytedance.android.live.base.model.user.c cVar = (com.bytedance.android.live.base.model.user.c) dVar2.data;
                String str = str;
                if (bnVar.f14589a != null) {
                    bnVar.f14589a.b();
                    bnVar.f14589a = null;
                }
                String str2 = cVar.f7455a;
                com.bytedance.android.livesdk.browser.f.d.a();
                bnVar.finishWithResult(new b(str2, com.bytedance.android.livesdk.browser.f.d.a(str), (byte) 0));
            }
        });
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.c.a
    public final void a(int i2, int i3, Intent intent) {
        h hVar = this.f14589a;
        if (hVar != null) {
            hVar.a(i2, i3, intent);
        }
    }
}
