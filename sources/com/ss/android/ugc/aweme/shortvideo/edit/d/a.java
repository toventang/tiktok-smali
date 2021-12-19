package com.ss.android.ugc.aweme.shortvideo.edit.d;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.an;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.b.l;
import h.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f127001a;

    /* renamed from: b  reason: collision with root package name */
    public int f127002b;

    /* renamed from: c  reason: collision with root package name */
    public String f127003c;

    /* renamed from: d  reason: collision with root package name */
    public aj f127004d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC3298a f127005e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f127006f;

    /* renamed from: g  reason: collision with root package name */
    public int f127007g;

    /* renamed from: h  reason: collision with root package name */
    public an f127008h;

    /* renamed from: i  reason: collision with root package name */
    public final r f127009i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    public g f127010j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a f127011k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$a  reason: collision with other inner class name */
    public interface AbstractC3298a {
        static {
            Covode.recordClassIndex(83331);
        }

        void a();

        void a(String str, aj ajVar);

        void b();
    }

    static {
        Covode.recordClassIndex(83330);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127014a;

        static {
            Covode.recordClassIndex(83334);
        }

        c(a aVar) {
            this.f127014a = aVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            this.f127014a.c();
            AbstractC3298a aVar = this.f127014a.f127005e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public static final class e implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127016a;

        static {
            Covode.recordClassIndex(83336);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e$a  reason: collision with other inner class name */
        static final class CallableC3299a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f127017a;

            static {
                Covode.recordClassIndex(83337);
            }

            CallableC3299a(e eVar) {
                this.f127017a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f127017a.f127016a.f127006f = true;
                this.f127017a.f127016a.f127011k.B().setValue(true);
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e(a aVar) {
            this.f127016a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            l.d(exc, "");
            AbstractC3298a aVar = this.f127016a.f127005e;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            l.d(strArr, "");
            i.b(new CallableC3299a(this), i.f4826c).a(new b(this), i.f4824a, null);
        }

        static final class b<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f127018a;

            static {
                Covode.recordClassIndex(83338);
            }

            b(e eVar) {
                this.f127018a = eVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(i iVar) {
                String str;
                int i2;
                int j2;
                StickerItemModel stickerItemModel;
                StickerItemModel stickerItemModel2;
                StickerItemModel stickerItemModel3;
                a aVar = this.f127018a.f127016a;
                aj ajVar = aVar.f127004d;
                String str2 = null;
                if (ajVar == null || (stickerItemModel3 = ajVar.f127114c) == null) {
                    str = null;
                } else {
                    str = stickerItemModel3.pinAlgorithmFile;
                }
                if (com.ss.android.ugc.tools.utils.i.a(str)) {
                    aj ajVar2 = aVar.f127004d;
                    if (!(ajVar2 == null || (stickerItemModel2 = ajVar2.f127114c) == null)) {
                        str2 = stickerItemModel2.pinAlgorithmFile;
                    }
                    com.ss.android.ugc.aweme.video.e.c(str2);
                }
                aVar.f127003c = al.a();
                com.ss.android.ugc.aweme.video.e.a(aVar.f127003c, true);
                aj ajVar3 = aVar.f127004d;
                if (!(ajVar3 == null || (stickerItemModel = ajVar3.f127114c) == null)) {
                    stickerItemModel.setPinAlgorithmFile(aVar.f127003c);
                }
                this.f127018a.f127016a.f127007g = this.f127018a.f127016a.f127010j.k();
                g gVar = this.f127018a.f127016a.f127010j;
                int i3 = this.f127018a.f127016a.f127002b;
                aj ajVar4 = this.f127018a.f127016a.f127004d;
                if (ajVar4 != null) {
                    i2 = ajVar4.f127114c.startTime;
                } else {
                    i2 = 0;
                }
                aj ajVar5 = this.f127018a.f127016a.f127004d;
                if (ajVar5 != null) {
                    j2 = ajVar5.f127114c.endTime;
                } else {
                    j2 = this.f127018a.f127016a.f127010j.j();
                }
                gVar.b(i3, i2, j2);
                if (this.f127018a.f127016a.f127010j.l(this.f127018a.f127016a.f127002b) < 0) {
                    this.f127018a.f127016a.a();
                }
                return z.f158842a;
            }
        }
    }

    public final void a() {
        this.f127006f = false;
        this.f127010j.m(this.f127002b);
        this.f127010j.a(this.f127007g, x.f.EDITOR_SEEK_FLAG_LastSeek, new c(this));
    }

    public final void b() {
        an anVar;
        an anVar2 = this.f127008h;
        if (anVar2 != null && anVar2.isShowing() && (anVar = this.f127008h) != null) {
            anVar.dismiss();
        }
    }

    public final void c() {
        VEEditorAutoStartStopArbiter value = this.f127011k.D().getValue();
        if (value != null) {
            l.b(value, "");
            if (value.f156727g) {
                this.f127010j.t();
            }
        }
    }

    static final class d implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127015a;

        static {
            Covode.recordClassIndex(83335);
        }

        d(a aVar) {
            this.f127015a = aVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            this.f127015a.c();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            this.f127015a.f127010j.a(this.f127015a.f127002b, byteBufferArr);
            al.a(this.f127015a.f127003c, byteBufferArr[0]);
            AbstractC3298a aVar = this.f127015a.f127005e;
            if (aVar != null) {
                aVar.a(this.f127015a.f127003c, this.f127015a.f127004d);
            }
            this.f127015a.f127010j.d(this.f127015a.f127009i);
        }
    }

    public final void a(aj ajVar) {
        l.d(ajVar, "");
        g gVar = this.f127010j;
        StickerItemModel stickerItemModel = ajVar.f127114c;
        l.b(stickerItemModel, "");
        gVar.m(stickerItemModel.getId());
    }

    public a(g gVar, Context context, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(gVar, "");
        l.d(context, "");
        l.d(aVar, "");
        this.f127010j = gVar;
        this.f127011k = aVar;
    }

    static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127012a;

        static {
            Covode.recordClassIndex(83332);
        }

        b(a aVar) {
            this.f127012a = aVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 != 4098) {
                if (i2 == 4132) {
                    this.f127012a.a();
                }
            } else if (this.f127012a.f127006f) {
                i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.d.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f127013a;

                    static {
                        Covode.recordClassIndex(83333);
                    }

                    {
                        this.f127013a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        this.f127013a.f127012a.f127006f = false;
                        this.f127013a.f127012a.f127011k.B().setValue(false);
                        a aVar = this.f127013a.f127012a;
                        aVar.f127010j.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek, new d(aVar));
                        return z.f158842a;
                    }
                }, i.f4826c);
            }
        }
    }
}
