package com.ss.android.ugc.aweme.sticker.types.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.google.c.a.q;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.sticker.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.g;
import com.ss.android.ugc.aweme.sticker.types.c.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.c;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public final class b implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f136061b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.effect.a f136062a;

    /* renamed from: c  reason: collision with root package name */
    private final d f136063c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f136064d;

    /* renamed from: e  reason: collision with root package name */
    private final q<List<String>> f136065e;

    static {
        Covode.recordClassIndex(88879);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88880);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.c.b$b  reason: collision with other inner class name */
    static final class CallableC3548b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f136066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f136067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f136068c;

        static {
            Covode.recordClassIndex(88881);
        }

        CallableC3548b(b bVar, String str, String str2) {
            this.f136066a = bVar;
            this.f136067b = str;
            this.f136068c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bitmap bitmap;
            VEFrame e2 = this.f136066a.f136062a.e(this.f136067b);
            if (e2 != null) {
                bitmap = e2.toBitmap();
            } else {
                bitmap = null;
            }
            return Boolean.valueOf(c.a(bitmap, new File(this.f136068c), 100, Bitmap.CompressFormat.PNG));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.g
    public final void b(String str) {
        this.f136063c.b(str);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.g
    public final void a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && i.b(new File(e.a(this.f136064d.q))) < 10) {
            String a2 = e.a(this.f136064d.q);
            dt d2 = this.f136064d.f124757b.d();
            if (d2 != null) {
                str2 = d2.segmentBeginTime;
            } else {
                str2 = null;
            }
            String a3 = new com.ss.android.ugc.aweme.photo.c(a2, str2, str).a();
            d dVar = this.f136063c;
            File parentFile = new File(a3).getParentFile();
            l.b(parentFile, "");
            dVar.a(parentFile.getPath(), a3);
            b.i.b(new CallableC3548b(this, str, a3), b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.g
    public final void a(Effect effect, Context context) {
        String a2;
        l.d(context, "");
        if (effect != null) {
            List<String> b2 = this.f136065e.b();
            l.b(b2, "");
            List<String> list = b2;
            l.d(context, "");
            l.d(effect, "");
            l.d(list, "");
            if (!list.isEmpty()) {
                String c2 = e.c(effect.getEffectId());
                if (!new File(c2).exists() && (a2 = c.a(effect)) != null && a2.length() != 0) {
                    Downloader.with(context).url(list.get(0) + a2).ignoreDataVerify(true).savePath(e.a()).name(new File(c2).getName()).subThreadListener(new c.a(a2)).download();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("url prefix cannot be empty");
        }
    }

    public b(com.ss.android.ugc.asve.recorder.effect.a aVar, d dVar, ShortVideoContext shortVideoContext, q<List<String>> qVar) {
        l.d(aVar, "");
        l.d(dVar, "");
        l.d(shortVideoContext, "");
        l.d(qVar, "");
        this.f136062a = aVar;
        this.f136063c = dVar;
        this.f136064d = shortVideoContext;
        this.f136065e = qVar;
    }
}
