package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.concurrent.Callable;

public final class d extends com.bytedance.ui_component.b<EditAudioRecordViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f126886a = {new y(d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private g f126887b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h.d f126888c = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditAudioRecordViewModel> f126889d = b.f126894a;

    /* renamed from: e  reason: collision with root package name */
    private final f f126890e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f126891f;

    /* renamed from: k  reason: collision with root package name */
    private final int f126892k = R.id.c9b;

    static {
        Covode.recordClassIndex(83238);
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f126888c.a(this, f126886a[0]);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditAudioRecordViewModel> b() {
        return this.f126889d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f126891f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f126890e;
    }

    static final class b extends m implements h.f.a.a<EditAudioRecordViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126894a = new b();

        static {
            Covode.recordClassIndex(83241);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditAudioRecordViewModel invoke() {
            return new EditAudioRecordViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        g gVar = this.f126887b;
        if (gVar != null) {
            gVar.c(false);
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        f.a.b.b unused = selectSubscribe(j(), e.f126895a, new ah(), new a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == r0.j()) goto L_0x001b;
     */
    @Override // com.bytedance.ui_component.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d.c():void");
    }

    public d(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f126890e = fVar;
        this.f126891f = bVar;
    }

    static final class a extends m implements h.f.a.m<com.bytedance.jedi.arch.i, p, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, p pVar) {
            final String str;
            l.d(iVar, "");
            if (pVar != null && this.this$0.a().hasRecord()) {
                AudioRecorderParam audioRecorderParam = this.this$0.a().veAudioRecorderParam;
                if (audioRecorderParam != null) {
                    str = audioRecorderParam.getAudioUrl();
                } else {
                    str = null;
                }
                this.this$0.a().veAudioRecorderParam = null;
                if (!(str == null || str.length() == 0)) {
                    b.i.b(new Callable() {
                        /* class com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(83240);
                        }

                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return Boolean.valueOf(com.ss.android.ugc.tools.utils.i.b(str));
                        }
                    }, g.a());
                }
            }
            return z.f158842a;
        }
    }
}
