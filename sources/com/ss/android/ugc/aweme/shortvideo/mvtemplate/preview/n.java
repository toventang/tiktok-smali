package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.ss.android.vesdk.VEUtils;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.y;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.Objects;
import org.json.JSONObject;

public final class n extends com.bytedance.scene.group.f implements c {
    public static final a v = new a((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) new l(this));
    private final h.h B = h.i.a((h.f.a.a) new c(this));
    private final h.h C = h.i.a((h.f.a.a) new h(this));

    /* renamed from: f  reason: collision with root package name */
    public int f129418f;

    /* renamed from: g  reason: collision with root package name */
    public String f129419g = "";

    /* renamed from: h  reason: collision with root package name */
    public b f129420h = b.NONE;

    /* renamed from: i  reason: collision with root package name */
    public b f129421i;

    /* renamed from: j  reason: collision with root package name */
    public aj f129422j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f129423k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f129424l;
    public boolean t;
    public Surface u;
    private MvImageChooseAdapter.MyMediaModel w;
    private int x;
    private final h.h y = h.i.a((h.f.a.a) new k(this));
    private View z;

    public enum b {
        NONE,
        FILE_DELETED,
        DISABLE_4K,
        NORMAL_VIDEO_PLAY;

        static {
            Covode.recordClassIndex(84958);
        }
    }

    static {
        Covode.recordClassIndex(84956);
    }

    private final ImageView I() {
        return (ImageView) this.B.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TextureView E() {
        return (TextureView) this.y.getValue();
    }

    public final SimpleDraweeView F() {
        return (SimpleDraweeView) this.A.getValue();
    }

    public final AVLoadingLayout G() {
        return (AVLoadingLayout) this.C.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84957);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f129426b;

        static {
            Covode.recordClassIndex(84961);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j
        public final View c() {
            return this.f129426b;
        }

        e(View view) {
            this.f129426b = view;
        }
    }

    public static final class j extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f129430b;

        static {
            Covode.recordClassIndex(84966);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.j
        public final View c() {
            return this.f129430b;
        }

        j(View view) {
            this.f129430b = view;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void d() {
        H();
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129429a;

        static {
            Covode.recordClassIndex(84965);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void b() {
            this.f129429a.H();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f
        public final void c() {
            b bVar = this.f129429a.f129421i;
            if (bVar != null) {
                bVar.f();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f
        public final void d() {
            b bVar = this.f129429a.f129421i;
            if (bVar != null) {
                bVar.g();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void a() {
            if (fb.b()) {
                b bVar = this.f129429a.f129421i;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            this.f129429a.H();
        }

        i(n nVar) {
            this.f129429a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.e
        public final void a(float f2) {
            b bVar = this.f129429a.f129421i;
            if (bVar != null) {
                bVar.a(f2);
            }
            if (this.f129429a.f129422j == null) {
                return;
            }
            if (f2 < 1.0f) {
                n.a(this.f129429a).l();
            } else if (f2 == 1.0f) {
                n.a(this.f129429a).k();
            }
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(84959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View c2 = this.this$0.c(R.id.ajv);
            h.f.b.l.b(c2, "");
            return c2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(84960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0.f129421i;
            if (bVar != null) {
                bVar.d();
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<AVLoadingLayout> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(84964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVLoadingLayout invoke() {
            View c2 = this.this$0.c(R.id.ci9);
            h.f.b.l.b(c2, "");
            return c2;
        }
    }

    static final class k extends m implements h.f.a.a<TextureView> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(84967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextureView invoke() {
            View c2 = this.this$0.c(R.id.ekc);
            h.f.b.l.b(c2, "");
            return c2;
        }
    }

    static final class l extends m implements h.f.a.a<SimpleDraweeView> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(84968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimpleDraweeView invoke() {
            View c2 = this.this$0.c(R.id.c22);
            h.f.b.l.b(c2, "");
            return c2;
        }
    }

    private final void J() {
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.w;
        if (myMediaModel != null) {
            com.ss.android.ugc.tools.c.a.a(F(), com.ss.android.ugc.tools.utils.h.d(myMediaModel.f109390b).toString(), -1, -1);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void a() {
        if (this.f129422j != null) {
            aj ajVar = this.f129422j;
            if (ajVar == null) {
                h.f.b.l.a("videoEngine");
            }
            if (ajVar.v == 2) {
                aj ajVar2 = this.f129422j;
                if (ajVar2 == null) {
                    h.f.b.l.a("videoEngine");
                }
                ajVar2.k();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void b() {
        if (this.f129422j != null) {
            aj ajVar = this.f129422j;
            if (ajVar == null) {
                h.f.b.l.a("videoEngine");
            }
            if (ajVar.v == 1) {
                aj ajVar2 = this.f129422j;
                if (ajVar2 == null) {
                    h.f.b.l.a("videoEngine");
                }
                ajVar2.l();
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (((com.bytedance.scene.group.f) this).f42883c && this.f129423k) {
            aj ajVar = this.f129422j;
            if (ajVar == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar.k();
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        if (((com.bytedance.scene.group.f) this).f42883c && this.f129423k) {
            aj ajVar = this.f129422j;
            if (ajVar == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar.l();
        }
    }

    public final void H() {
        View c2;
        b bVar = this.f129421i;
        if (!(bVar == null || (c2 = bVar.c()) == null)) {
            e eVar = new e(c2);
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2 = m.a(this.z);
            if (a2 != null) {
                a2.a(eVar.a(), eVar.b(), new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c(), K(), new d(this));
                if (z.f158842a != null) {
                    return;
                }
            }
        }
        b bVar2 = this.f129421i;
        if (bVar2 != null) {
            bVar2.d();
        }
    }

    private static com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a K() {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a();
        aVar.f129251f = 220;
        aVar.f129252g = 220;
        aVar.f129253h = 220;
        aVar.f129254i = 220;
        aVar.a(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.b(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.c(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        aVar.d(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(m.f129417a.getFirst(), m.f129417a.getSecond()));
        return aVar;
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void n_() {
        int i2;
        super.n_();
        if (this.f129422j != null) {
            aj ajVar = this.f129422j;
            if (ajVar == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar.n();
            Surface surface = this.u;
            if (surface != null) {
                surface.release();
            }
            if (this.f129423k) {
                boolean z2 = this.t;
                JSONObject jSONObject = new JSONObject();
                if (this.f129420h == b.DISABLE_4K) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_4k", i2);
                jSONObject.put("error_code", this.f129418f);
                jSONObject.put("error_message", this.f129419g);
                jSONObject.put("display_status", this.f129420h.ordinal());
                aj ajVar2 = this.f129422j;
                if (ajVar2 == null) {
                    h.f.b.l.a("videoEngine");
                }
                jSONObject.put("video_watched_duration", Float.valueOf(((float) ajVar2.w()) / 1000.0f));
                q.a("tool_performance_preview_video_play_status", z2 ? 1 : 0, jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.w = myMediaModel;
    }

    public static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129427a;

        static {
            Covode.recordClassIndex(84962);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(n nVar) {
            this.f129427a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.a, com.ss.ttvideoengine.bb
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            super.a(cVar);
            if (cVar != null) {
                this.f129427a.f129418f = cVar.f153260a;
                n nVar = this.f129427a;
                String cVar2 = cVar.toString();
                h.f.b.l.b(cVar2, "");
                nVar.f129419g = cVar2;
            }
            this.f129427a.t = true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.a, com.ss.ttvideoengine.bb
        public final void c(aj ajVar) {
            super.c(ajVar);
            this.f129427a.F().setVisibility(8);
            this.f129427a.G().setVisibility(8);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.a, com.ss.ttvideoengine.bb
        public final void b(aj ajVar) {
            this.f129427a.f129423k = true;
            if (!((com.bytedance.scene.group.f) this.f129427a).f42883c) {
                n.a(this.f129427a).l();
            }
            n nVar = this.f129427a;
            int u = n.a(nVar).u();
            int v = n.a(this.f129427a).v();
            if (u > 0 && v > 0) {
                int b2 = com.bytedance.common.utility.n.b(nVar.t());
                int a2 = com.bytedance.common.utility.n.a(nVar.t());
                float f2 = (float) v;
                float f3 = (float) u;
                float a3 = (((float) com.bytedance.common.utility.n.a(nVar.t())) * f2) / f3;
                float f4 = (float) b2;
                if (a3 >= f4) {
                    a2 = (int) ((f4 * f3) / f2);
                } else {
                    b2 = (int) a3;
                }
                com.bytedance.common.utility.n.a(nVar.E(), a2, b2);
            }
        }
    }

    public static final class g implements TextureView.SurfaceTextureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129428a;

        static {
            Covode.recordClassIndex(84963);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h.f.b.l.d(surfaceTexture, "");
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            h.f.b.l.d(surfaceTexture, "");
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            h.f.b.l.d(surfaceTexture, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(n nVar) {
            this.f129428a = nVar;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            h.f.b.l.d(surfaceTexture, "");
            if (this.f129428a.f129422j != null && this.f129428a.u == null) {
                this.f129428a.u = new Surface(surfaceTexture);
                n.a(this.f129428a).a(this.f129428a.u);
                if (((com.bytedance.scene.group.f) this.f129428a).f42883c) {
                    this.f129428a.f129424l = true;
                    n.a(this.f129428a).k();
                }
            }
        }
    }

    public static final /* synthetic */ aj a(n nVar) {
        aj ajVar = nVar.f129422j;
        if (ajVar == null) {
            h.f.b.l.a("videoEngine");
        }
        return ajVar;
    }

    @Override // com.bytedance.scene.group.f
    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2;
        super.a(z2);
        if (!z2 && (a2 = m.a(this.z)) != null) {
            a2.a();
        }
        if (this.f129422j == null) {
            return;
        }
        if (this.f129423k) {
            if (z2) {
                aj ajVar = this.f129422j;
                if (ajVar == null) {
                    h.f.b.l.a("videoEngine");
                }
                ajVar.k();
                return;
            }
            aj ajVar2 = this.f129422j;
            if (ajVar2 == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar2.l();
            aj ajVar3 = this.f129422j;
            if (ajVar3 == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar3.a(0, (y) null);
        } else if (!this.f129424l && this.u != null && z2) {
            aj ajVar4 = this.f129422j;
            if (ajVar4 == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar4.k();
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        int i2;
        String str;
        View c2;
        b bVar;
        int i3;
        MvImageChooseAdapter.MyMediaModel myMediaModel;
        String str2;
        MvImageChooseAdapter.MyMediaModel myMediaModel2;
        super.a(bundle);
        E().setVisibility(8);
        F().setVisibility(8);
        I().setVisibility(8);
        MvImageChooseAdapter.MyMediaModel myMediaModel3 = this.w;
        int i4 = 0;
        if (myMediaModel3 != null) {
            i2 = myMediaModel3.f109400l;
        } else {
            i2 = 0;
        }
        String str3 = null;
        if (!((i2 > 0 && (myMediaModel2 = this.w) != null && myMediaModel2.f109401m > 0) || (myMediaModel = this.w) == null || (str2 = myMediaModel.f109390b) == null)) {
            com.ss.android.ugc.aweme.port.in.g.a().u();
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
            if (videoFileInfo != null) {
                MvImageChooseAdapter.MyMediaModel myMediaModel4 = this.w;
                if (myMediaModel4 != null) {
                    myMediaModel4.f109400l = videoFileInfo.width;
                }
                MvImageChooseAdapter.MyMediaModel myMediaModel5 = this.w;
                if (myMediaModel5 != null) {
                    myMediaModel5.f109401m = videoFileInfo.height;
                }
            }
        }
        MvImageChooseAdapter.MyMediaModel myMediaModel6 = this.w;
        if (myMediaModel6 != null) {
            str = myMediaModel6.f109390b;
        } else {
            str = null;
        }
        if (!com.ss.android.ugc.tools.utils.i.a(str)) {
            this.f129420h = b.FILE_DELETED;
            I().setVisibility(0);
        } else if (m.a(this.w)) {
            this.f129420h = b.DISABLE_4K;
            F().setVisibility(0);
            J();
        } else {
            this.f129420h = b.NORMAL_VIDEO_PLAY;
            F().setVisibility(0);
            J();
            E().setVisibility(0);
            G().setVisibility(0);
            Activity t2 = t();
            h.f.b.l.b(t2, "");
            Context applicationContext = t2.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            aj ajVar = new aj(applicationContext, 2);
            this.f129422j = ajVar;
            ajVar.aJ = "preview";
            aj ajVar2 = this.f129422j;
            if (ajVar2 == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar2.h(true);
            aj ajVar3 = this.f129422j;
            if (ajVar3 == null) {
                h.f.b.l.a("videoEngine");
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel7 = this.w;
            if (myMediaModel7 != null) {
                str3 = myMediaModel7.f109390b;
            }
            ajVar3.f(str3);
            aj ajVar4 = this.f129422j;
            if (ajVar4 == null) {
                h.f.b.l.a("videoEngine");
            }
            ajVar4.a(new f(this));
            E().setSurfaceTextureListener(new g(this));
        }
        View c3 = c(R.id.baf);
        this.z = c3;
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a2 = m.a(c3);
        if (a2 != null) {
            MvImageChooseAdapter.MyMediaModel myMediaModel8 = this.w;
            if (myMediaModel8 != null) {
                i3 = myMediaModel8.f109400l;
            } else {
                i3 = 0;
            }
            MvImageChooseAdapter.MyMediaModel myMediaModel9 = this.w;
            if (myMediaModel9 != null) {
                i4 = myMediaModel9.f109401m;
            }
            a2.a(i3, i4);
            a2.setGestureListener(new i(this));
        }
        b bVar2 = this.f129421i;
        if (!(bVar2 == null || (c2 = bVar2.c()) == null || (bVar = this.f129421i) == null || !bVar.a())) {
            b bVar3 = this.f129421i;
            if (bVar3 != null) {
                bVar3.b();
            }
            j jVar = new j(c2);
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c a3 = m.a(this.z);
            if (a3 != null) {
                a3.a(jVar.a(), jVar.b(), new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c(), K());
            }
        }
        ((com.bytedance.scene.group.f) this).f42882b.getLifecycle().a(new PreviewVideoScene$onActivityCreated$3(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.c
    public final void a(int i2, b bVar) {
        h.f.b.l.d(bVar, "");
        this.x = i2;
        this.f129421i = bVar;
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        if (fb.b()) {
            i2 = R.layout.au6;
        } else {
            i2 = R.layout.au5;
        }
        View a2 = com.a.a(layoutInflater, i2, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }
}
