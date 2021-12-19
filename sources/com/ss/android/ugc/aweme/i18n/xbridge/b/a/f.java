package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.d;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.ss.android.ugc.aweme.i18n.xbridge.d.a.c;
import com.ss.android.ugc.aweme.i18n.xbridge.d.b;
import com.ss.android.ugc.aweme.i18n.xbridge.d.e;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class f implements IHostMediaDepend {
    static {
        Covode.recordClassIndex(63709);
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f99961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IChooseMediaResultCallback f99962b;

        static {
            Covode.recordClassIndex(63710);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.f$a$a  reason: collision with other inner class name */
        static final class RunnableC2450a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f99963a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f99964b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f99965c;

            static {
                Covode.recordClassIndex(63711);
            }

            RunnableC2450a(a aVar, int i2, String str) {
                this.f99963a = aVar;
                this.f99964b = i2;
                this.f99965c = str;
            }

            public final void run() {
                this.f99963a.f99962b.onFailure(this.f99964b, this.f99965c);
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f99966a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.ies.xbridge.base.runtime.a.e f99967b;

            static {
                Covode.recordClassIndex(63712);
            }

            b(a aVar, com.bytedance.ies.xbridge.base.runtime.a.e eVar) {
                this.f99966a = aVar;
                this.f99967b = eVar;
            }

            public final void run() {
                this.f99966a.f99962b.onSuccess(this.f99967b, "");
            }
        }

        @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.b
        public final void a(com.bytedance.ies.xbridge.base.runtime.a.e eVar) {
            l.d(eVar, "");
            this.f99961a.runOnUiThread(new b(this, eVar));
        }

        @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.b
        public final void a(int i2, String str) {
            l.d(str, "");
            this.f99961a.runOnUiThread(new RunnableC2450a(this, i2, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity, IChooseMediaResultCallback iChooseMediaResultCallback, WeakReference weakReference) {
            super(weakReference);
            this.f99961a = activity;
            this.f99962b = iChooseMediaResultCallback;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend
    public final void handleJsInvoke(Context context, d dVar, IChooseMediaResultCallback iChooseMediaResultCallback) {
        e.b bVar;
        l.d(context, "");
        l.d(dVar, "");
        l.d(iChooseMediaResultCallback, "");
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(context);
        if (a2 == null) {
            iChooseMediaResultCallback.onFailure(0, "Context not provided");
            return;
        }
        a aVar = new a(a2, iChooseMediaResultCallback, new WeakReference(a2));
        l.d(dVar, "");
        Activity a3 = b.a(aVar.f100054c);
        if (!(a3 instanceof com.ss.android.ugc.aweme.base.a.f)) {
            aVar.a(0, "Failed to find proper activity");
            return;
        }
        ((com.ss.android.ugc.aweme.base.a.f) a3).setActivityResultListener(aVar);
        WeakReference weakReference = new WeakReference(a3);
        List<String> list = dVar.f35791e;
        if (list == null) {
            l.b();
        }
        String str = list.get(0);
        String str2 = dVar.f35792f;
        if (str == null || str2 == null) {
            bVar = e.b.UNSUPPORTED;
        } else {
            String lowerCase = str.toLowerCase();
            l.b(lowerCase, "");
            if (l.a((Object) lowerCase, (Object) "image")) {
                String lowerCase2 = str2.toLowerCase();
                l.b(lowerCase2, "");
                if (l.a((Object) lowerCase2, (Object) "camera")) {
                    bVar = e.b.TAKE_PHOTO;
                }
            }
            String lowerCase3 = str.toLowerCase();
            l.b(lowerCase3, "");
            if (l.a((Object) lowerCase3, (Object) "image")) {
                String lowerCase4 = str2.toLowerCase();
                l.b(lowerCase4, "");
                if (l.a((Object) lowerCase4, (Object) "album")) {
                    bVar = e.b.PICK_PHOTO_FROM_ALBUM;
                }
            }
            String lowerCase5 = str.toLowerCase();
            l.b(lowerCase5, "");
            if (l.a((Object) lowerCase5, (Object) "video")) {
                String lowerCase6 = str2.toLowerCase();
                l.b(lowerCase6, "");
                if (l.a((Object) lowerCase6, (Object) "camera")) {
                    bVar = e.b.TAKE_VIDEO;
                }
            }
            String lowerCase7 = str.toLowerCase();
            l.b(lowerCase7, "");
            if (l.a((Object) lowerCase7, (Object) "video")) {
                String lowerCase8 = str2.toLowerCase();
                l.b(lowerCase8, "");
                if (l.a((Object) lowerCase8, (Object) "album")) {
                    bVar = e.b.PICK_VIDEO_FROM_ALBUM;
                }
            }
            bVar = e.b.UNSUPPORTED;
        }
        if (bVar == e.b.UNSUPPORTED) {
            aVar.a(-3, "Invalid fileType and sourceType in params");
            return;
        }
        int i2 = com.ss.android.ugc.aweme.i18n.xbridge.d.f.f100057a[bVar.ordinal()];
        if (i2 == 1) {
            aVar.f100055d = new com.ss.android.ugc.aweme.i18n.xbridge.d.a.b(weakReference, aVar);
            com.ss.android.ugc.aweme.i18n.xbridge.a.a aVar2 = aVar.f100055d;
            if (aVar2 == null) {
                l.a("mIFileMediaFeature");
            }
            aVar2.a(dVar);
        } else if (i2 == 2) {
            aVar.f100055d = new com.ss.android.ugc.aweme.i18n.xbridge.d.a.d(weakReference, aVar);
            com.ss.android.ugc.aweme.i18n.xbridge.a.a aVar3 = aVar.f100055d;
            if (aVar3 == null) {
                l.a("mIFileMediaFeature");
            }
            aVar3.a(dVar);
        } else if (i2 == 3) {
            aVar.f100055d = new c(weakReference, aVar);
            com.ss.android.ugc.aweme.i18n.xbridge.a.a aVar4 = aVar.f100055d;
            if (aVar4 == null) {
                l.a("mIFileMediaFeature");
            }
            aVar4.a(dVar);
        } else if (i2 == 4) {
            aVar.f100055d = new com.ss.android.ugc.aweme.i18n.xbridge.d.a.a(weakReference, aVar);
            com.ss.android.ugc.aweme.i18n.xbridge.a.a aVar5 = aVar.f100055d;
            if (aVar5 == null) {
                l.a("mIFileMediaFeature");
            }
            aVar5.a(dVar);
        }
    }
}
