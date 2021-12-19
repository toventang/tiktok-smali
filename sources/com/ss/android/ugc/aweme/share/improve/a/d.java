package com.ss.android.ugc.aweme.share.improve.a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.a.a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.ad;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.i;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Callable;

public class d implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123695b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final boolean f123696a;

    /* renamed from: c  reason: collision with root package name */
    private final String f123697c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f123698d;

    static {
        Covode.recordClassIndex(81198);
    }

    public d() {
        this(null, false, 7);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.ft0;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "copy";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_link;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public boolean f() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$d  reason: collision with other inner class name */
    static final class C3204d extends m implements h.f.a.a<i> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(81202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3204d(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.$context);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePackage f123699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f123700b;

        static {
            Covode.recordClassIndex(81200);
        }

        b(SharePackage sharePackage, String str) {
            this.f123699a = sharePackage;
            this.f123700b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            SharePackage sharePackage = this.f123699a;
            String str = this.f123700b;
            if (sharePackage != null) {
                String a2 = ad.a(sharePackage.f124594h, str);
                if (!in.d()) {
                    String str2 = sharePackage.f124590d;
                    sharePackage.f124595i.getBoolean("bool_persist");
                    a2 = ad.a(str2, str, a2);
                }
                if (a2 == null) {
                    return "";
                }
                return a2;
            }
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f123701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharePackage f123702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.h f123704d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.k.i f123705e = null;

        static {
            Covode.recordClassIndex(81201);
        }

        c(d dVar, SharePackage sharePackage, Context context, h.h hVar) {
            this.f123701a = dVar;
            this.f123702b = sharePackage;
            this.f123703c = context;
            this.f123704d = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            ShareFlavorService a2 = ShareFlavorService.a.a();
            l.b(str, "");
            String a3 = a2.a(str, this.f123702b);
            d dVar = this.f123701a;
            Context context = this.f123703c;
            l.d(a3, "");
            l.d(context, "");
            Object a4 = d.a(context, "clipboard");
            Objects.requireNonNull(a4, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) a4;
            ClipData newPlainText = ClipData.newPlainText(a3, a3);
            try {
                l.b(newPlainText, "");
                a.C0567a.a(clipboardManager, newPlainText, PrivacyCert.Builder.Companion.with("bpea-228").usage("").tag("BaseCopyAction_copyToClipboard").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                if (dVar.f123696a) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.auq).a();
                }
            } catch (com.bytedance.bpea.basics.a e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
            }
            if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                ((i) this.f123704d.getValue()).dismiss();
            }
        }
    }

    public d(String str, boolean z) {
        l.d(str, "");
        this.f123697c = str;
        this.f123698d = false;
        this.f123696a = z;
    }

    static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6567);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(6567);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        String a2 = ShareFlavorService.a.a().a();
        h.h a3 = h.i.a((h.f.a.a) new C3204d(context));
        if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
            ((com.ss.android.ugc.aweme.views.i) a3.getValue()).show();
        }
        ab b2 = ab.a((Callable) new b(sharePackage, a2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c));
        c cVar = new c(this, sharePackage, context, a3);
        f.a.e.b.b.a((Object) cVar, "doAfterSuccess is null");
        f.a.h.a.a(new f.a.e.e.f.c(b2, cVar)).c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, boolean z, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 4) != 0 ? true : z);
    }

    public final void a(String str, Context context, PrivacyCert privacyCert) {
        l.d(str, "");
        l.d(context, "");
        Object a2 = a(context, "clipboard");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) a2;
        ClipData newPlainText = ClipData.newPlainText(str, str);
        try {
            l.b(newPlainText, "");
            a.C0567a.a(clipboardManager, newPlainText, privacyCert);
            if (this.f123696a) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.auq).a();
            }
        } catch (com.bytedance.bpea.basics.a e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
    }
}
