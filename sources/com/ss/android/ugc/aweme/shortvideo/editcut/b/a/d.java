package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.n;
import com.ss.android.ugc.aweme.shortvideo.editcut.t;
import com.ss.android.ugc.aweme.utils.db;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import java.util.ArrayList;
import java.util.List;

public final class d extends a implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f128137a = {new y(d.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new y(d.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(d.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new y(d.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new y(d.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(d.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f128138d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public c f128139b;

    /* renamed from: c  reason: collision with root package name */
    public z f128140c;

    /* renamed from: e  reason: collision with root package name */
    private final String f128141e = "MultiEditModeBottomScene";

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f128142f = com.bytedance.o.b.a.a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f128143g = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f128144h = com.bytedance.o.b.a.a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f128145i = com.bytedance.o.b.a.a(getDiContainer(), n.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f128146j = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f128147k = com.bytedance.o.b.a.a(getDiContainer(), db.class);

    /* renamed from: l  reason: collision with root package name */
    private TextView f128148l;
    private RecyclerView t;
    private View u;

    static {
        Covode.recordClassIndex(83990);
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.a.a G() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.f128143g.a(this, f128137a[1]);
    }

    private final EditAdjustClipsBottomViewModel H() {
        return (EditAdjustClipsBottomViewModel) this.f128146j.a(this, f128137a[4]);
    }

    public final VideoEditViewModel C() {
        return (VideoEditViewModel) this.f128142f.a(this, f128137a[0]);
    }

    public final CutMultiVideoViewModel D() {
        return (CutMultiVideoViewModel) this.f128144h.a(this, f128137a[2]);
    }

    public final n E() {
        return (n) this.f128145i.a(this, f128137a[3]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
    public final void a(View view) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
    public final void a(List<? extends MediaModel> list) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83991);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128141e;
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        if (this.f128139b != null) {
            c cVar = this.f128139b;
            if (cVar == null) {
                l.a("cutVideoListViewHolder");
            }
            cVar.a();
        }
    }

    public final void F() {
        Bundle b2;
        Activity activity;
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            l.a("videoListView");
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (!(adapter instanceof z)) {
            adapter = null;
        }
        z zVar = (z) adapter;
        if (zVar != null && (b2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125946e.b(this.f42913m, zVar.a(), zVar.b())) != null && (activity = this.f42913m) != null) {
            b2.putInt("key_choose_scene", 13);
            com.bytedance.scene.ktx.c.a(this, com.ss.android.ugc.aweme.shortvideo.r.a.a().a(activity, b2), new i(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
    public final void c(View view) {
        F();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
    public final void b(View view) {
        E().u();
    }

    static final class c extends m implements h.f.a.b<p, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(p pVar) {
            l.d(pVar, "");
            z zVar = this.this$0.f128140c;
            if (zVar != null) {
                zVar.notifyDataSetChanged();
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$d  reason: collision with other inner class name */
    static final class C3342d extends m implements h.f.a.b<com.bytedance.jedi.arch.n<Integer, VideoSegment>, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3342d(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.n<Integer, VideoSegment> nVar) {
            com.bytedance.jedi.arch.n<Integer, VideoSegment> nVar2 = nVar;
            l.d(nVar2, "");
            z zVar = this.this$0.f128140c;
            if (zVar != null) {
                zVar.b((VideoSegment) nVar2.f39404b.getSecond());
            }
            return h.z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.jedi.arch.n<Integer, VideoSegment>, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.n<Integer, VideoSegment> nVar) {
            com.bytedance.jedi.arch.n<Integer, VideoSegment> nVar2 = nVar;
            l.d(nVar2, "");
            z zVar = this.this$0.f128140c;
            if (zVar != null) {
                zVar.a((VideoSegment) nVar2.f39404b.getSecond());
            }
            return h.z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>>, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>> dVar) {
            com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>> dVar2 = dVar;
            l.d(dVar2, "");
            z zVar = this.this$0.f128140c;
            if (zVar != null) {
                zVar.b((List<VideoSegment>) dVar2.f39404b);
            }
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            z zVar = this.this$0.f128140c;
            if (!(zVar instanceof com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e)) {
                zVar = null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e eVar = (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e) zVar;
            if (eVar != null) {
                eVar.a(booleanValue);
            }
            return h.z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends t>, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.d<? extends t> dVar) {
            l.d(dVar, "");
            z zVar = this.this$0.f128140c;
            if (zVar != null) {
                List<VideoSegment> k2 = this.this$0.C().k();
                l.b(k2, "");
                ArrayList arrayList = new ArrayList();
                for (T t : k2) {
                    if (!t.f125485i) {
                        arrayList.add(t);
                    }
                }
                zVar.a(arrayList);
                zVar.notifyDataSetChanged();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.eyc);
        l.b(c2, "");
        this.f128148l = (TextView) c2;
        View c3 = c(R.id.ffc);
        l.b(c3, "");
        this.t = (RecyclerView) c3;
        View c4 = c(R.id.kl);
        l.b(c4, "");
        this.u = c4;
        Activity t2 = t();
        l.b(t2, "");
        c cVar = new c(t2, this, C(), D());
        this.f128139b = cVar;
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            l.a("videoListView");
        }
        View view = this.u;
        if (view == null) {
            l.a("animateDot");
        }
        cVar.a(recyclerView, view, new b(com.ss.android.ugc.aweme.shortvideo.editcut.a.b.b(G()), com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(G()), false), new h(this));
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 == null) {
            l.a("videoListView");
        }
        z zVar = (z) recyclerView2.getAdapter();
        this.f128140c = zVar;
        if (zVar != null) {
            zVar.f126305g = (db) this.f128147k.a(this, f128137a[5]);
        }
        z zVar2 = this.f128140c;
        if (!(zVar2 instanceof com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e)) {
            zVar2 = null;
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e eVar = (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e) zVar2;
        if (eVar != null) {
            eVar.f125877i = this;
        }
        f.a.b.b unused = H().a(this, e.f128151a, new ah(), new C3342d(this));
        f.a.b.b unused2 = H().a(this, g.f128155a, new ah(), new e(this));
        f.a.b.b unused3 = H().a(this, h.f128157a, new ah(), new f(this));
        f.a.b.b unused4 = H().a(this, i.f128159a, new ah(), new g(this));
        f.a.b.b unused5 = H().a(this, j.f128161a, new ah(), new b(this));
        f.a.b.b unused6 = H().a(this, f.f128153a, new ah(), new c(this));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.d2, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class h implements z.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f128149a;

        static {
            Covode.recordClassIndex(83998);
        }

        h(d dVar) {
            this.f128149a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.z.b
        public final void a(int i2, String str) {
            if (i2 == 10003) {
                this.f128149a.F();
                return;
            }
            int a2 = this.f128149a.C().a(str);
            if (a2 >= 0) {
                this.f128149a.D().a(i2, a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.m<Integer, Intent, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(83999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Integer num, Intent intent) {
            ArrayList parcelableArrayListExtra;
            num.intValue();
            Intent intent2 = intent;
            if (!(intent2 == null || (parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty())) {
                this.this$0.E().b(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i.a(parcelableArrayListExtra, true, null, 4));
            }
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar, R.id.b4i);
        l.d(fVar, "");
        l.d(bVar, "");
    }
}
