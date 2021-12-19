package com.ss.android.ugc.aweme.port.internal;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.cb;
import com.ss.android.ugc.aweme.shortvideo.cc;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.a.n;
import h.f.b.m;
import h.i;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class l implements x<ai> {

    /* renamed from: a  reason: collision with root package name */
    public final cc f115682a;

    /* renamed from: b  reason: collision with root package name */
    public final cb f115683b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f115684c = i.a((h.f.a.a) a.f115691a);

    /* renamed from: d  reason: collision with root package name */
    private int f115685d;

    /* renamed from: e  reason: collision with root package name */
    private int f115686e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.publish.h f115687f;

    /* renamed from: g  reason: collision with root package name */
    private final IAVPublishService.OnPublishCallback f115688g;

    /* renamed from: h  reason: collision with root package name */
    private final String f115689h;

    /* renamed from: i  reason: collision with root package name */
    private final q f115690i;

    static {
        Covode.recordClassIndex(74634);
    }

    public final IAVPublishService a() {
        return (IAVPublishService) this.f115684c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishPause() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishResume() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSynthetiseSuccess(String str) {
    }

    static final class a extends m implements h.f.a.a<IAVPublishService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115691a = new a();

        static {
            Covode.recordClassIndex(74635);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVPublishService invoke() {
            return AVExternalServiceImpl.a().publishService();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f115692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f115693b;

        static {
            Covode.recordClassIndex(74636);
        }

        b(l lVar, q qVar) {
            this.f115692a = lVar;
            this.f115693b = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f115692a.a().getCover(this.f115693b);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishCancel() {
        this.f115686e = Math.max(this.f115686e, this.f115685d);
        this.f115685d = 0;
    }

    private final void b() {
        this.f115687f.b(this);
        if (a().isParallelPublishTaskFinished()) {
            this.f115683b.c();
            this.f115688g.onStopPublish();
            return;
        }
        this.f115682a.a(5);
        d();
    }

    private final void c() {
        Object obj = null;
        this.f115682a.b(null);
        this.f115682a.c(null);
        a(this.f115690i, new f(this));
        List<q> allPublishModel = a().getAllPublishModel();
        h.f.b.l.b(allPublishModel, "");
        Iterator it = n.g((Collection) allPublishModel).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!h.f.b.l.a(next, this.f115690i)) {
                obj = next;
                break;
            }
        }
        q qVar = (q) obj;
        if (qVar != null) {
            a(qVar, new e(this));
        }
    }

    private final void d() {
        List<q> allPublishModel = a().getAllPublishModel();
        h.f.b.l.b(allPublishModel, "");
        List g2 = n.g((Collection) allPublishModel);
        g2.remove(this.f115690i);
        if (g2.size() > 0) {
            if (g2.size() == 1) {
                Object obj = g2.get(0);
                h.f.b.l.b(obj, "");
                a((q) obj, new g(this));
                return;
            }
            Object obj2 = g2.get(0);
            h.f.b.l.b(obj2, "");
            Object obj3 = g2.get(1);
            h.f.b.l.b(obj3, "");
            a((q) obj2, new h(this, (q) obj3));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onError(et etVar) {
        b();
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f115694a;

        static {
            Covode.recordClassIndex(74637);
        }

        c(h.f.a.b bVar) {
            this.f115694a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            Bitmap bitmap = (Bitmap) iVar.d();
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f115694a.invoke(bitmap);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(74639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            h.f.b.l.d(bitmap2, "");
            this.this$0.f115682a.b(bitmap2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(74640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            h.f.b.l.d(bitmap2, "");
            this.this$0.f115682a.a(bitmap2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ q $thirdPublishModel;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(74643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar, q qVar) {
            super(1);
            this.this$0 = lVar;
            this.$thirdPublishModel = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            final Bitmap bitmap2 = bitmap;
            h.f.b.l.d(bitmap2, "");
            this.this$0.a(this.$thirdPublishModel, new h.f.a.b<Bitmap, z>(this) {
                /* class com.ss.android.ugc.aweme.port.internal.l.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(74644);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    h.f.b.l.d(bitmap2, "");
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.this$0.this$0.f115682a.c(bitmap2);
                        cb cbVar = this.this$0.this$0.f115683b;
                        AnonymousClass1 r3 = new h.f.a.a<z>(this) {
                            /* class com.ss.android.ugc.aweme.port.internal.l.h.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(74645);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ z invoke() {
                                this.this$0.this$0.this$0.f115682a.a(bitmap2);
                                this.this$0.this$0.this$0.f115682a.b(bitmap2);
                                this.this$0.this$0.this$0.f115682a.c(null);
                                return z.f158842a;
                            }
                        };
                        h.f.b.l.d(r3, "");
                        cbVar.f125071g.a();
                        cbVar.d();
                        ImageView imageView = cbVar.f125067c;
                        if (imageView == null) {
                            h.f.b.l.a("mBGCoverFirst");
                        }
                        float x = imageView.getX();
                        ImageView imageView2 = cbVar.f125068d;
                        if (imageView2 == null) {
                            h.f.b.l.a("mBGCoverSecond");
                        }
                        float x2 = x - imageView2.getX();
                        ImageView imageView3 = cbVar.f125067c;
                        if (imageView3 == null) {
                            h.f.b.l.a("mBGCoverFirst");
                        }
                        float y = imageView3.getY();
                        ImageView imageView4 = cbVar.f125068d;
                        if (imageView4 == null) {
                            h.f.b.l.a("mBGCoverSecond");
                        }
                        float y2 = y - imageView4.getY();
                        com.ss.android.ugc.aweme.shortvideo.z zVar = new com.ss.android.ugc.aweme.shortvideo.z();
                        ImageView imageView5 = cbVar.f125067c;
                        if (imageView5 == null) {
                            h.f.b.l.a("mBGCoverFirst");
                        }
                        ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                        ImageView imageView6 = cbVar.f125067c;
                        if (imageView6 == null) {
                            h.f.b.l.a("mBGCoverFirst");
                        }
                        ViewPropertyAnimator duration = alpha.translationY(((float) ((-imageView6.getHeight()) * 2)) / 3.0f).setDuration(300);
                        ImageView imageView7 = cbVar.f125069e;
                        if (imageView7 == null) {
                            h.f.b.l.a("mBGCoverThird");
                        }
                        imageView7.setAlpha(0.0f);
                        ImageView imageView8 = cbVar.f125069e;
                        if (imageView8 == null) {
                            h.f.b.l.a("mBGCoverThird");
                        }
                        imageView8.setTranslationX((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d));
                        ImageView imageView9 = cbVar.f125069e;
                        if (imageView9 == null) {
                            h.f.b.l.a("mBGCoverThird");
                        }
                        imageView9.setTranslationY((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d));
                        ImageView imageView10 = cbVar.f125069e;
                        if (imageView10 == null) {
                            h.f.b.l.a("mBGCoverThird");
                        }
                        ViewPropertyAnimator duration2 = imageView10.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300);
                        ImageView imageView11 = cbVar.f125068d;
                        if (imageView11 == null) {
                            h.f.b.l.a("mBGCoverSecond");
                        }
                        zVar.a(new cb.k(cbVar, zVar, duration, duration2, imageView11.animate().translationX(x2).translationY(y2).setDuration(300).withEndAction(new cb.l(cbVar, zVar, r3))));
                        cbVar.f125071g.a(zVar);
                    } else {
                        this.this$0.this$0.f115682a.a(bitmap2);
                        this.this$0.this$0.f115682a.b(bitmap2);
                        this.this$0.this$0.f115682a.c(null);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(74638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            h.f.b.l.d(bitmap2, "");
            if (Build.VERSION.SDK_INT >= 21) {
                cb cbVar = this.this$0.f115683b;
                cbVar.f125071g.a();
                cbVar.d();
                ImageView imageView = cbVar.f125068d;
                if (imageView == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                imageView.setAlpha(0.0f);
                ImageView imageView2 = cbVar.f125068d;
                if (imageView2 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                imageView2.setTranslationX((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d));
                ImageView imageView3 = cbVar.f125068d;
                if (imageView3 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                imageView3.setTranslationY((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d));
                com.ss.android.ugc.aweme.shortvideo.z zVar = new com.ss.android.ugc.aweme.shortvideo.z();
                ImageView imageView4 = cbVar.f125068d;
                if (imageView4 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                zVar.a(new cb.g(cbVar, zVar, imageView4.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300).withEndAction(new cb.h(cbVar, zVar))));
                cbVar.f125071g.a(zVar);
            }
            this.this$0.f115682a.b(bitmap2);
            this.this$0.f115682a.c(null);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(74641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            final Bitmap bitmap2 = bitmap;
            h.f.b.l.d(bitmap2, "");
            if (Build.VERSION.SDK_INT >= 21) {
                cb cbVar = this.this$0.f115683b;
                AnonymousClass1 r6 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.port.internal.l.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(74642);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.this$0.f115682a.a(bitmap2);
                        this.this$0.this$0.f115682a.b(null);
                        this.this$0.this$0.f115682a.c(null);
                        return z.f158842a;
                    }
                };
                h.f.b.l.d(r6, "");
                cbVar.f125071g.a();
                cbVar.d();
                ImageView imageView = cbVar.f125067c;
                if (imageView == null) {
                    h.f.b.l.a("mBGCoverFirst");
                }
                float x = imageView.getX();
                ImageView imageView2 = cbVar.f125068d;
                if (imageView2 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                float x2 = x - imageView2.getX();
                ImageView imageView3 = cbVar.f125067c;
                if (imageView3 == null) {
                    h.f.b.l.a("mBGCoverFirst");
                }
                float y = imageView3.getY();
                ImageView imageView4 = cbVar.f125068d;
                if (imageView4 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                float y2 = y - imageView4.getY();
                com.ss.android.ugc.aweme.shortvideo.z zVar = new com.ss.android.ugc.aweme.shortvideo.z();
                ImageView imageView5 = cbVar.f125067c;
                if (imageView5 == null) {
                    h.f.b.l.a("mBGCoverFirst");
                }
                ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                ImageView imageView6 = cbVar.f125067c;
                if (imageView6 == null) {
                    h.f.b.l.a("mBGCoverFirst");
                }
                ViewPropertyAnimator duration = alpha.translationY(((float) ((-imageView6.getHeight()) * 2)) / 3.0f).setDuration(300);
                ImageView imageView7 = cbVar.f125068d;
                if (imageView7 == null) {
                    h.f.b.l.a("mBGCoverSecond");
                }
                zVar.a(new cb.i(cbVar, zVar, duration, imageView7.animate().translationX(x2).translationY(y2).setDuration(300).withEndAction(new cb.j(cbVar, zVar, r6))));
                cbVar.f125071g.a(zVar);
            } else {
                this.this$0.f115682a.a(bitmap2);
                this.this$0.f115682a.b(null);
                this.this$0.f115682a.c(null);
            }
            return z.f158842a;
        }
    }

    public final void a(q qVar, h.f.a.b<? super Bitmap, z> bVar) {
        b.i.b(new b(this, qVar), b.i.f4824a).a(new c(bVar), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onProgressUpdate(int i2, boolean z) {
        int i3 = this.f115686e;
        if (i2 < i3) {
            this.f115682a.a(i3);
            return;
        }
        this.f115682a.a(i2);
        this.f115685d = i2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSuccess(ai aiVar, boolean z) {
        bj.d("PublishParallel ParallelPublishForUICallback " + this.f115689h + " onSuccess");
        b();
    }

    public l(cb cbVar, com.ss.android.ugc.aweme.shortvideo.publish.h hVar, IAVPublishService.OnPublishCallback onPublishCallback, String str, q qVar) {
        h.f.b.l.d(cbVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(onPublishCallback, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(qVar, "");
        this.f115683b = cbVar;
        this.f115687f = hVar;
        this.f115688g = onPublishCallback;
        this.f115689h = str;
        this.f115690i = qVar;
        cc ccVar = cbVar.f125072h;
        this.f115682a = ccVar;
        bj.d("PublishParallel ParallelPublishForUICallback " + str + " created");
        if (h.f.b.l.a((Object) a().getCurrentPublishTaskId(), (Object) str)) {
            c();
            return;
        }
        this.f115686e = 5;
        List<q> allPublishModel = a().getAllPublishModel();
        if (allPublishModel.size() >= 2 && ccVar.f125102d.getValue() == null) {
            q qVar2 = allPublishModel.get(1);
            h.f.b.l.b(qVar2, "");
            a(qVar2, new d(this));
        }
    }
}
