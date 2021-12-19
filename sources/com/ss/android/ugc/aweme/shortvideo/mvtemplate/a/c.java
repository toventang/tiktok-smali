package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.view.style.h;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public i f128779a;

    /* renamed from: b  reason: collision with root package name */
    public b f128780b;

    /* renamed from: c  reason: collision with root package name */
    List<Bitmap> f128781c;

    /* renamed from: d  reason: collision with root package name */
    int f128782d;

    /* renamed from: e  reason: collision with root package name */
    g f128783e;

    /* renamed from: f  reason: collision with root package name */
    int[] f128784f;

    /* renamed from: g  reason: collision with root package name */
    r f128785g;

    /* renamed from: h  reason: collision with root package name */
    Handler f128786h;

    /* renamed from: i  reason: collision with root package name */
    HandlerThread f128787i;

    /* renamed from: j  reason: collision with root package name */
    Handler f128788j;

    /* renamed from: k  reason: collision with root package name */
    h f128789k;

    /* renamed from: l  reason: collision with root package name */
    public t<Bitmap> f128790l;

    /* renamed from: m  reason: collision with root package name */
    public t<Boolean> f128791m;
    boolean n;
    private int o;
    private int p;

    public interface b {
        static {
            Covode.recordClassIndex(84498);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(84495);
    }

    /* access modifiers changed from: package-private */
    public final Bitmap a() {
        g gVar = this.f128783e;
        if (gVar == null) {
            return null;
        }
        int i2 = this.o;
        if (i2 == 0) {
            return gVar.c();
        }
        return gVar.a(i2);
    }

    public c() {
        this.f128781c = Collections.synchronizedList(new ArrayList());
        this.f128782d = 7;
        HandlerThread handlerThread = new HandlerThread("mv_cover_creator");
        this.f128787i = handlerThread;
        handlerThread.start();
        this.f128786h = new Handler(this.f128787i.getLooper()) {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84496);
            }

            public final void handleMessage(Message message) {
                c cVar = c.this;
                if (message.what != 1001) {
                    cVar.f128788j.sendEmptyMessage(1003);
                    return;
                }
                int[] iArr = {cVar.f128781c.size()};
                if (iArr[0] >= cVar.f128782d - 1) {
                    if (iArr[0] == cVar.f128782d - 1) {
                        cVar.f128781c.add(cVar.a());
                    }
                    cVar.f128788j.sendEmptyMessage(1003);
                } else if (cVar.f128783e == null) {
                    cVar.f128788j.sendEmptyMessage(1003);
                } else {
                    cVar.f128783e.a(cVar.f128784f[iArr[0]], new h(cVar, iArr));
                }
            }
        };
        this.f128788j = new a(this);
    }

    private void a(String str) {
        b bVar = this.f128780b;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<c> f128793a;

        static {
            Covode.recordClassIndex(84497);
        }

        a(c cVar) {
            this.f128793a = new WeakReference<>(cVar);
        }

        public final void handleMessage(Message message) {
            if (this.f128793a.get() != null) {
                if (message.what == 1002) {
                    List<Bitmap> list = (List) message.obj;
                    if (this.f128793a.get().f128779a != null) {
                        this.f128793a.get().f128779a.a(list);
                        if (list != null && !list.isEmpty() && list.get(0) != null) {
                            if (this.f128793a.get().f128791m != null) {
                                if (!Boolean.TRUE.equals(this.f128793a.get().f128791m.getValue())) {
                                    this.f128793a.get().f128791m.setValue(true);
                                } else {
                                    return;
                                }
                            }
                            if (this.f128793a.get().f128790l != null) {
                                this.f128793a.get().f128790l.setValue(list.get(0));
                            }
                        }
                    }
                } else if (message.what == 1003) {
                    c cVar = this.f128793a.get();
                    if (cVar.f128779a != null) {
                        cVar.f128779a.a(cVar.f128781c);
                    }
                    if (cVar.f128783e != null) {
                        cVar.f128783e.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    if (!(cVar.f128783e == null || cVar.f128785g == null)) {
                        cVar.f128783e.d(cVar.f128785g);
                    }
                    if (cVar.f128787i != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        cVar.f128787i.quitSafely();
                    }
                    if (cVar.f128789k != null) {
                        cVar.f128789k.dismiss();
                    }
                    if (cVar.f128791m != null) {
                        cVar.f128791m.setValue(false);
                    }
                    cVar.f128779a = null;
                }
            }
        }
    }

    private boolean a(Context context) {
        if (context == null) {
            this.f128788j.sendEmptyMessage(1003);
            return false;
        } else if (context instanceof Activity) {
            if (!((Activity) context).isFinishing()) {
                return true;
            }
            this.f128788j.sendEmptyMessage(1003);
            return false;
        } else if (!((Activity) context).isFinishing()) {
            return true;
        } else {
            this.f128788j.sendEmptyMessage(1003);
            return false;
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(8613);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(8613);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8613);
        return delete;
    }

    private static int[] b(int i2, int i3) {
        int[] iArr = new int[i3];
        int i4 = i2 / i3;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = i4 * i5;
        }
        return iArr;
    }

    public final c a(int i2, int i3) {
        this.o = i2;
        this.p = i3;
        return this;
    }

    public final void a(Context context, g gVar, int i2, i iVar) {
        if (a(context)) {
            h a2 = h.a(context, context.getString(R.string.g4k));
            this.f128789k = a2;
            a2.setIndeterminate(true);
            this.f128779a = iVar;
            this.f128782d = i2;
            this.f128783e = gVar;
            if (gVar == null) {
                this.f128788j.sendEmptyMessage(1003);
                return;
            }
            this.f128784f = b(gVar.j(), this.f128782d);
            this.f128785g = new g(this);
            gVar.u();
            gVar.c(this.f128785g);
            gVar.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    public c(g gVar, String str, int i2, b bVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a aVar) {
        this(gVar, str, i2, null, bVar, aVar);
    }

    public c(g gVar, String str, int i2, f.a.d.g<Bitmap, Bitmap> gVar2, b bVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a aVar) {
        this.f128781c = Collections.synchronizedList(new ArrayList());
        this.f128782d = 7;
        long currentTimeMillis = System.currentTimeMillis();
        this.f128780b = bVar;
        if (gVar == null) {
            a("MvChooseCoverBitmap veEditor is null");
        } else if (TextUtils.isEmpty(str)) {
            a("MvChooseCoverBitmap imgPath is null");
        } else {
            this.f128783e = gVar;
            try {
                if (i.a(str)) {
                    k.a().e().a(Uri.fromFile(new File(str)));
                    a(new File(str));
                }
                this.f128785g = new d(this, currentTimeMillis, str, gVar2, aVar);
                gVar.u();
                gVar.c(this.f128785g);
                int a2 = gVar.a(i2, x.f.EDITOR_SEEK_FLAG_LastSeek);
                if (a2 != 0) {
                    a("MvChooseCoverBitmap start time " + i2 + ", seek error " + a2);
                }
            } catch (Exception e2) {
                e2.getMessage();
                a("MvChooseCoverBitmap exception" + e2.toString());
            }
        }
    }
}
