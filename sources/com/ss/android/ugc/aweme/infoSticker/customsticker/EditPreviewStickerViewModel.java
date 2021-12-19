package com.ss.android.ugc.aweme.infoSticker.customsticker;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerNetInterceptor;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.au;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import java.io.File;

public final class EditPreviewStickerViewModel extends BaseJediViewModel<EditPreviewStickerState> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f104596c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.a f104597a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f104598b = h.i.a((h.f.a.a) b.f104599a);

    static {
        Covode.recordClassIndex(67011);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67012);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        f.a.b.a aVar = this.f104597a;
        if (aVar != null) {
            aVar.dispose();
        }
        c(c.f104600a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditPreviewStickerState(null, null, null, null, null, null, null, null, null, 511, null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<CustomStickerApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104599a = new b();

        static {
            Covode.recordClassIndex(67013);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CustomStickerApi invoke() {
            au C = com.ss.android.ugc.aweme.port.in.g.a().C();
            String itemName = EffectPlatformFactory.a().getHosts().get(0).getItemName();
            h.f.b.l.b(itemName, "");
            return C.createRetrofitWithInterceptors(itemName, true, CustomStickerApi.class, n.a(new CustomStickerNetInterceptor()));
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPreviewStickerViewModel f104608a;

        static {
            Covode.recordClassIndex(67019);
        }

        public f(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f104608a = editPreviewStickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f104608a.a(new com.ss.android.ugc.aweme.infoSticker.customsticker.api.a(null, 1, null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104600a = new c();

        static {
            Covode.recordClassIndex(67014);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            h.f.b.l.d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, new p(), null, null, 447, null);
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPreviewStickerViewModel f104611a;

        static {
            Covode.recordClassIndex(67021);
        }

        h(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f104611a = editPreviewStickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            CutoutData cutoutData = (CutoutData) obj;
            EditPreviewStickerViewModel editPreviewStickerViewModel = this.f104611a;
            if (editPreviewStickerViewModel.f104597a != null) {
                f.a.b.a aVar = editPreviewStickerViewModel.f104597a;
                if (aVar == null) {
                    h.f.b.l.b();
                }
                if (aVar.isDisposed()) {
                    return;
                }
            }
            editPreviewStickerViewModel.c(new k(cutoutData));
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPreviewStickerViewModel f104612a;

        static {
            Covode.recordClassIndex(67022);
        }

        i(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f104612a = editPreviewStickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof com.ss.android.ugc.aweme.infoSticker.customsticker.api.a) {
                this.f104612a.a((com.ss.android.ugc.aweme.infoSticker.customsticker.api.a) th);
            } else {
                this.f104612a.a(new com.ss.android.ugc.aweme.infoSticker.customsticker.api.a(null, 1, null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<EditPreviewStickerState, EditPreviewStickerState> {
        final /* synthetic */ com.ss.android.ugc.aweme.infoSticker.customsticker.api.a $msg;

        static {
            Covode.recordClassIndex(67023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.infoSticker.customsticker.api.a aVar) {
            super(1);
            this.$msg = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            h.f.b.l.d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, this.$msg, null, null, null, 479, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<EditPreviewStickerState, EditPreviewStickerState> {
        final /* synthetic */ CutoutData $data;

        static {
            Covode.recordClassIndex(67024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(CutoutData cutoutData) {
            super(1);
            this.$data = cutoutData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            h.f.b.l.d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, null, this.$data, null, 383, null);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<EditPreviewStickerState, EditPreviewStickerState> {
        final /* synthetic */ MediaModel $mediaModel;

        static {
            Covode.recordClassIndex(67025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(MediaModel mediaModel) {
            super(1);
            this.$mediaModel = mediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            h.f.b.l.d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, this.$mediaModel, null, null, null, null, 495, null);
        }
    }

    public final void a(com.ss.android.ugc.aweme.infoSticker.customsticker.api.a aVar) {
        c(new j(aVar));
    }

    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPreviewStickerViewModel f104601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f104602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f104603c;

        static {
            Covode.recordClassIndex(67015);
        }

        public d(EditPreviewStickerViewModel editPreviewStickerViewModel, String str, int[] iArr) {
            this.f104601a = editPreviewStickerViewModel;
            this.f104602b = str;
            this.f104603c = iArr;
        }

        @Override // f.a.w
        public final void subscribe(v<File> vVar) {
            h.f.b.l.d(vVar, "");
            Bitmap a2 = com.ss.android.ugc.tools.utils.c.a(this.f104602b, this.f104603c);
            EditPreviewStickerViewModel editPreviewStickerViewModel = this.f104601a;
            h.f.b.l.b(a2, "");
            editPreviewStickerViewModel.c(new m(a2.getWidth(), a2.getHeight()));
            File a3 = com.ss.android.ugc.aweme.infoSticker.customsticker.helper.a.a(a2);
            if (a3 != null) {
                vVar.a(a3);
            } else {
                vVar.b(new IllegalStateException("Compress Error"));
            }
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPreviewStickerViewModel f104604a;

        static {
            Covode.recordClassIndex(67016);
        }

        public e(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f104604a = editPreviewStickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final long currentTimeMillis = System.currentTimeMillis();
            ((CustomStickerApi) this.f104604a.f104598b.getValue()).cutoutSticker(new TypedFile("image/*", (File) obj)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f104605a;

                static {
                    Covode.recordClassIndex(67017);
                }

                {
                    this.f104605a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    CutoutResponse cutoutResponse = (CutoutResponse) obj;
                    EditPreviewStickerViewModel editPreviewStickerViewModel = this.f104605a.f104604a;
                    long j2 = currentTimeMillis;
                    f.a.b.a aVar = editPreviewStickerViewModel.f104597a;
                    if (aVar == null || !aVar.isDisposed()) {
                        f.a.b.b a2 = t.a(new g(cutoutResponse, j2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(editPreviewStickerViewModel), new i(editPreviewStickerViewModel));
                        f.a.b.a aVar2 = editPreviewStickerViewModel.f104597a;
                        if (aVar2 != null) {
                            aVar2.a(a2);
                        }
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f104607a;

                static {
                    Covode.recordClassIndex(67018);
                }

                {
                    this.f104607a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f104607a.f104604a.a(new com.ss.android.ugc.aweme.infoSticker.customsticker.api.a(null, 1, null));
                }
            });
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<EditPreviewStickerState, EditPreviewStickerState> {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        static {
            Covode.recordClassIndex(67026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(int i2, int i3) {
            super(1);
            this.$width = i2;
            this.$height = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            h.f.b.l.d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.n(h.v.a(Integer.valueOf(this.$width), Integer.valueOf(this.$height))), 255, null);
        }
    }

    static final class g<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CutoutResponse f104609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f104610b;

        static {
            Covode.recordClassIndex(67020);
        }

        g(CutoutResponse cutoutResponse, long j2) {
            this.f104609a = cutoutResponse;
            this.f104610b = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
            if (r1 == null) goto L_0x0067;
         */
        @Override // f.a.w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(f.a.v<com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData> r9) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.g.subscribe(f.a.v):void");
        }
    }
}
