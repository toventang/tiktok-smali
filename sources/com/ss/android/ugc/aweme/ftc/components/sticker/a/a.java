package com.ss.android.ugc.aweme.ftc.components.sticker.a;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import h.f.b.l;
import h.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f97905a;

    /* renamed from: b  reason: collision with root package name */
    public int f97906b;

    /* renamed from: c  reason: collision with root package name */
    public String f97907c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ftc.components.sticker.a f97908d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC2365a f97909e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f97910f;

    /* renamed from: g  reason: collision with root package name */
    public int f97911g;

    /* renamed from: h  reason: collision with root package name */
    public am f97912h;

    /* renamed from: i  reason: collision with root package name */
    public final r f97913i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    public g f97914j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a f97915k;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2365a {
        static {
            Covode.recordClassIndex(62221);
        }

        void a();

        void a(String str, com.ss.android.ugc.aweme.ftc.components.sticker.a aVar);

        void b();
    }

    static {
        Covode.recordClassIndex(62220);
    }

    public static final class e implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97920a;

        static {
            Covode.recordClassIndex(62226);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$e$a  reason: collision with other inner class name */
        static final class CallableC2366a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f97921a;

            static {
                Covode.recordClassIndex(62227);
            }

            CallableC2366a(e eVar) {
                this.f97921a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f97921a.f97920a.f97910f = true;
                this.f97921a.f97920a.f97915k.B().setValue(true);
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e(a aVar) {
            this.f97920a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            l.d(exc, "");
            AbstractC2365a aVar = this.f97920a.f97909e;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            l.d(strArr, "");
            i.b(new CallableC2366a(this), i.f4826c).a(new b(this), i.f4824a, null);
        }

        static final class b<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f97922a;

            static {
                Covode.recordClassIndex(62228);
            }

            b(e eVar) {
                this.f97922a = eVar;
            }

            @Override // b.g
            public final /* synthetic */ Object then(i iVar) {
                String str;
                int i2;
                int j2;
                StickerItemModel stickerItemModel;
                StickerItemModel stickerItemModel2;
                StickerItemModel stickerItemModel3;
                a aVar = this.f97922a.f97920a;
                com.ss.android.ugc.aweme.ftc.components.sticker.a aVar2 = aVar.f97908d;
                String str2 = null;
                if (aVar2 == null || (stickerItemModel3 = aVar2.f97894b) == null) {
                    str = null;
                } else {
                    str = stickerItemModel3.pinAlgorithmFile;
                }
                if (com.ss.android.ugc.tools.utils.i.a(str)) {
                    com.ss.android.ugc.aweme.ftc.components.sticker.a aVar3 = aVar.f97908d;
                    if (!(aVar3 == null || (stickerItemModel2 = aVar3.f97894b) == null)) {
                        str2 = stickerItemModel2.pinAlgorithmFile;
                    }
                    com.ss.android.ugc.aweme.video.e.c(str2);
                }
                aVar.f97907c = al.a();
                com.ss.android.ugc.aweme.video.e.a(aVar.f97907c, true);
                com.ss.android.ugc.aweme.ftc.components.sticker.a aVar4 = aVar.f97908d;
                if (!(aVar4 == null || (stickerItemModel = aVar4.f97894b) == null)) {
                    stickerItemModel.setPinAlgorithmFile(aVar.f97907c);
                }
                this.f97922a.f97920a.f97911g = this.f97922a.f97920a.f97914j.k();
                g gVar = this.f97922a.f97920a.f97914j;
                int i3 = this.f97922a.f97920a.f97906b;
                com.ss.android.ugc.aweme.ftc.components.sticker.a aVar5 = this.f97922a.f97920a.f97908d;
                if (aVar5 != null) {
                    i2 = aVar5.f97894b.startTime;
                } else {
                    i2 = 0;
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.a aVar6 = this.f97922a.f97920a.f97908d;
                if (aVar6 != null) {
                    j2 = aVar6.f97894b.endTime;
                } else {
                    j2 = this.f97922a.f97920a.f97914j.j();
                }
                gVar.b(i3, i2, j2);
                this.f97922a.f97920a.f97914j.l(this.f97922a.f97920a.f97906b);
                return z.f158842a;
            }
        }
    }

    static final class c implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97918a;

        static {
            Covode.recordClassIndex(62224);
        }

        c(a aVar) {
            this.f97918a = aVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            this.f97918a.f97914j.t();
            AbstractC2365a aVar = this.f97918a.f97909e;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public final void a() {
        am amVar;
        am amVar2 = this.f97912h;
        if (amVar2 != null && amVar2.isShowing() && (amVar = this.f97912h) != null) {
            amVar.dismiss();
        }
    }

    static final class d implements VEListener.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97919a;

        static {
            Covode.recordClassIndex(62225);
        }

        d(a aVar) {
            this.f97919a = aVar;
        }

        @Override // com.ss.android.vesdk.VEListener.s
        public final void a() {
            this.f97919a.f97914j.t();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            this.f97919a.f97914j.a(this.f97919a.f97906b, byteBufferArr);
            al.a(this.f97919a.f97907c, byteBufferArr[0]);
            AbstractC2365a aVar = this.f97919a.f97909e;
            if (aVar != null) {
                aVar.a(this.f97919a.f97907c, this.f97919a.f97908d);
            }
            this.f97919a.f97914j.d(this.f97919a.f97913i);
        }
    }

    public a(g gVar, Context context, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(gVar, "");
        l.d(context, "");
        l.d(aVar, "");
        this.f97914j = gVar;
        this.f97915k = aVar;
    }

    static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97916a;

        static {
            Covode.recordClassIndex(62222);
        }

        b(a aVar) {
            this.f97916a = aVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 != 4098) {
                if (i2 == 4132) {
                    this.f97916a.f97910f = false;
                    a aVar = this.f97916a;
                    aVar.f97914j.m(aVar.f97906b);
                    aVar.f97914j.a(aVar.f97911g, x.f.EDITOR_SEEK_FLAG_LastSeek, new c(aVar));
                }
            } else if (this.f97916a.f97910f) {
                i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.ftc.components.sticker.a.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f97917a;

                    static {
                        Covode.recordClassIndex(62223);
                    }

                    {
                        this.f97917a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        this.f97917a.f97916a.f97910f = false;
                        this.f97917a.f97916a.f97915k.B().setValue(false);
                        a aVar = this.f97917a.f97916a;
                        aVar.f97914j.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek, new d(aVar));
                        return z.f158842a;
                    }
                }, i.f4826c);
            }
        }
    }
}
