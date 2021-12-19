package com.ss.android.ugc.gamora.editor.lightening.c;

import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ac;
import com.ss.android.ugc.gamora.editor.c.b;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;

public final class c extends j<b> implements com.bytedance.o.a, b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f146147a = {new y(c.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(c.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new y(c.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f146148c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b f146149b = this;

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f146150d = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f146151e = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f146152f = com.bytedance.o.b.a.a(getDiContainer(), ac.class);

    /* renamed from: g  reason: collision with root package name */
    private boolean f146153g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146154h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.editor.e.c.class);

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.o.f f146155i;

    static {
        Covode.recordClassIndex(96045);
    }

    private final androidx.fragment.app.e c() {
        return (androidx.fragment.app.e) this.f146150d.a(this, f146147a[0]);
    }

    private final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.f146151e.a(this, f146147a[1]);
    }

    private final com.ss.android.ugc.gamora.editor.e.c e() {
        return (com.ss.android.ugc.gamora.editor.e.c) this.f146154h.a(this, f146147a[3]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96046);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ b getApiComponent() {
        return this.f146149b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146155i;
    }

    public static final class b implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f146156a;

        static {
            Covode.recordClassIndex(96047);
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void a() {
            this.f146156a.invoke();
        }

        b(h.f.a.a aVar) {
            this.f146156a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.c.c$c  reason: collision with other inner class name */
    static final class C3902c extends m implements h.f.a.a<h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3902c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.b();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<float[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146157a = new f();

        static {
            Covode.recordClassIndex(96051);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ float[] invoke() {
            int i2;
            int i3;
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            int[] f2 = createIAVServiceProxybyMonsterPlugin.getStoryService().f();
            if (h.a.i.b(f2) >= 0) {
                i2 = f2[0];
            } else {
                i2 = 0;
            }
            float f3 = (float) i2;
            if (1 <= h.a.i.b(f2)) {
                i3 = f2[1];
            } else {
                i3 = 1;
            }
            return new float[]{f3, (float) i3};
        }
    }

    public final void b() {
        a.a(d());
        d().ttStoryUploadModel = new TTStoryUploadModel(0, 0, 1);
        com.ss.android.ugc.gamora.editor.c.c.a(new b.C3871b(d(), new d(this), new e(this)));
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.c.b
    public final void a() {
        if (com.ss.android.ugc.gamora.editor.lightening.a.b(d()) && !this.f146153g) {
            this.f146153g = true;
            if (!g.a().A().b()) {
                C3902c cVar = new C3902c(this);
                g.a().o().i().a(c(), "lightning_open_login_page");
                g.a().A().a(c(), "video_edit_page", "click_shoot", null, new b(cVar));
                return;
            }
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            this.this$0.a(str2);
            return h.z.f158842a;
        }
    }

    public c(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f146155i = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b4, code lost:
        if (r0.getStoryService().b() == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.c.c.a(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.m<String, DraftSaveResult, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, DraftSaveResult draftSaveResult) {
            String str2 = str;
            l.d(str2, "");
            l.d(draftSaveResult, "");
            this.this$0.a(str2);
            return h.z.f158842a;
        }
    }
}
