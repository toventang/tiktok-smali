package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.g;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.view.widget.k;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    boolean f109328a = true;

    /* renamed from: b  reason: collision with root package name */
    private String f109329b = "";

    /* renamed from: c  reason: collision with root package name */
    private final Context f109330c;

    static {
        Covode.recordClassIndex(70027);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a() {
        this.f109328a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$a  reason: collision with other inner class name */
    public static final class CallableC2802a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaModel f109331a;

        static {
            Covode.recordClassIndex(70028);
        }

        CallableC2802a(MediaModel mediaModel) {
            this.f109331a = mediaModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(VEUtils.isCanImport(this.f109331a.f109390b));
        }
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a(String str) {
        l.d(str, "");
        this.f109329b = str;
    }

    public a(Context context) {
        l.d(context, "");
        this.f109330c = context;
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f109335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediaModel f109336b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.widgetcompat.a f109337c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f109338d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f109339e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f109340f;

        static {
            Covode.recordClassIndex(70029);
        }

        b(a aVar, MediaModel mediaModel, com.ss.android.ugc.aweme.widgetcompat.a aVar2, h.f.a.b bVar, long j2, h.f.a.b bVar2) {
            this.f109335a = aVar;
            this.f109336b = mediaModel;
            this.f109337c = aVar2;
            this.f109338d = bVar;
            this.f109339e = j2;
            this.f109340f = bVar2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            Integer num = (Integer) iVar.d();
            String a2 = g.a.a(this.f109336b.f109392d);
            com.ss.android.ugc.aweme.widgetcompat.a aVar = this.f109337c;
            if (aVar != null) {
                k.b(aVar);
            }
            if (num.intValue() >= 0) {
                if (num.intValue() > 0) {
                    this.f109336b.f109396h = (long) num.intValue();
                }
                this.f109338d.invoke(new f(true, "Editor1VideoLegalChecker", System.currentTimeMillis() - this.f109339e, a2, 0, ""));
                return null;
            }
            bj.a("Editor1VideoLegalChecker ImportError:".concat(String.valueOf(num)));
            h.f.a.b bVar = this.f109340f;
            l.b(num, "");
            bVar.invoke(new f(false, "Editor1VideoLegalChecker", System.currentTimeMillis() - this.f109339e, a2, num.intValue(), ""));
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a(MediaModel mediaModel, long j2, long j3, h.f.a.b<? super f, z> bVar, h.f.a.b<? super f, z> bVar2) {
        com.ss.android.ugc.aweme.widgetcompat.a aVar;
        l.d(mediaModel, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f109328a) {
            Context context = this.f109330c;
            aVar = com.ss.android.ugc.aweme.widgetcompat.a.a(context, context.getString(R.string.ewd));
        } else {
            aVar = null;
        }
        i.b(new CallableC2802a(mediaModel), i.f4824a).a(new b(this, mediaModel, aVar, bVar, currentTimeMillis, bVar2), i.f4826c, null);
    }
}
