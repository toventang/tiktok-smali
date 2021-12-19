package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRecycledViewPoolViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ac;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends a implements a.AbstractC3368a {
    public static final a v = new a((byte) 0);
    public MultiSelectView q;
    public MvImageChooseAdapter.c r;
    public boolean s = true;
    public boolean t;
    public long u = di.a();
    private TextView w;
    private MvChoosePhotoActivity.b x;
    private final h.h y = i.a((h.f.a.a) new h(this));
    private HashMap z;

    static {
        Covode.recordClassIndex(84768);
    }

    private final com.ss.android.ugc.aweme.mediachoose.g h() {
        return (com.ss.android.ugc.aweme.mediachoose.g) this.y.getValue();
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c
    public final View a(int i2) {
        if (this.z == null) {
            this.z = new HashMap();
        }
        View view = (View) this.z.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.z.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c
    public final void a() {
        HashMap hashMap = this.z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84769);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void c() {
        super.c();
        f.a(this, ac.c.f128898a);
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ MediaModel $item;
        final /* synthetic */ View $v;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(84776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar, MediaModel mediaModel, View view) {
            super(0);
            this.this$0 = lVar;
            this.$item = mediaModel;
            this.$v = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MvImageChooseAdapter.c cVar = this.this$0.r;
            if (cVar != null) {
                MediaModel mediaModel = this.$item;
                if (mediaModel instanceof MvImageChooseAdapter.MyMediaModel) {
                    cVar.a((MvImageChooseAdapter.MyMediaModel) mediaModel, this.$v);
                    this.this$0.t = false;
                }
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.mediachoose.c> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(84777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.mediachoose.c invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            return new com.ss.android.ugc.aweme.mediachoose.c(activity);
        }
    }

    private final boolean i() {
        Bundle arguments = getArguments();
        if ((arguments == null || !arguments.getBoolean("forbid_init_multi_mode", false)) && ((this.s && com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.c()) || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.o))) {
            return true;
        }
        return false;
    }

    public static final class d implements MultiSelectView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f129145a;

        static {
            Covode.recordClassIndex(84772);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(l lVar) {
            this.f129145a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.a
        public final void a(boolean z) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f129145a.f128883c;
            h.f.b.l.b(mvImageChooseAdapter, "");
            mvImageChooseAdapter.a(z);
            if (z) {
                this.f129145a.b(true);
            } else {
                this.f129145a.b(false);
            }
        }
    }

    public final void a(MvChoosePhotoActivity.b bVar) {
        h.f.b.l.d(bVar, "");
        this.x = bVar;
    }

    public static final class f extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f129147e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ WrapGridLayoutManager f129148f;

        static {
            Covode.recordClassIndex(84775);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f129147e.f128883c.getItemViewType(i2) == 1) {
                return ((GridLayoutManager) this.f129148f).f3760b;
            }
            return 1;
        }

        f(l lVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f129147e = lVar;
            this.f129148f = wrapGridLayoutManager;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void a(boolean z2) {
        String str;
        this.s = z2;
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.a(z2);
        }
        this.f128890j = z2;
        if (getActivity() != null) {
            com.ss.android.ugc.aweme.mediachoose.g h2 = h();
            if (z2) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            h2.a(str);
        }
    }

    public final void b(boolean z2) {
        String str;
        com.ss.android.ugc.aweme.mediachoose.g h2 = h();
        if (z2) {
            str = "enter_from_multi";
        } else {
            str = "enter_from_single";
        }
        h2.a(str);
        MvChoosePhotoActivity.b bVar = this.x;
        if (bVar != null) {
            bVar.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mediachoose.f, z> {
        final /* synthetic */ MediaModel $mediaModel;
        final /* synthetic */ h.f.a.a $onSuccess;
        final /* synthetic */ String $scene;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(84770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, MediaModel mediaModel, String str, h.f.a.a aVar) {
            super(1);
            this.this$0 = lVar;
            this.$mediaModel = mediaModel;
            this.$scene = str;
            this.$onSuccess = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mediachoose.f fVar) {
            com.ss.android.ugc.aweme.mediachoose.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            f.a(fVar2);
            q.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            l.a(this.$mediaModel, fVar2.f109384b, 0, 0, fVar2.f109385c, this.$scene);
            if (this.this$0.getActivity() == null || !this.this$0.f104785a) {
                this.this$0.t = false;
            } else {
                this.$onSuccess.invoke();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.mediachoose.f, z> {
        final /* synthetic */ MediaModel $mediaModel;
        final /* synthetic */ String $scene;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(84771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, MediaModel mediaModel, String str) {
            super(1);
            this.this$0 = lVar;
            this.$mediaModel = mediaModel;
            this.$scene = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mediachoose.f fVar) {
            com.ss.android.ugc.aweme.mediachoose.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            f.a(fVar2);
            this.this$0.t = false;
            l lVar = this.this$0;
            MediaModel mediaModel = this.$mediaModel;
            String str = fVar2.f109384b;
            int i2 = fVar2.f109387e;
            long j2 = fVar2.f109385c;
            String str2 = this.$scene;
            String str3 = fVar2.f109388f;
            if (lVar.getActivity() != null && lVar.f104785a) {
                aa.a(lVar.getActivity(), i2, (int) lVar.u);
                q.a("aweme_movie_import_error_rate", 1, new ar().a("errorCode", String.valueOf(i2)).a("errorMsg", str3).a());
                l.a(mediaModel, str, 1, i2, j2, str2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f128883c = new MvImageChooseAdapter(getContext(), this.f128882b, 1, this.n);
        this.f128883c.n = this.o;
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        h.f.b.l.b(mvImageChooseAdapter, "");
        mvImageChooseAdapter.a(this.f128890j);
        this.f128883c.f128853i = true;
        this.f128883c.f128851g = this.r;
        this.f128883c.f128850f = new e(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, this.f128882b);
        wrapGridLayoutManager.a(new f(this, wrapGridLayoutManager));
        this.f128884d.setHasFixedSize(true);
        this.f128884d.setItemViewCacheSize(this.f128882b);
        RecyclerView recyclerView = this.f128884d;
        h.f.b.l.b(recyclerView, "");
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        this.f128884d.a(new com.ss.android.ugc.aweme.widgetcompat.b(this.f128882b, (int) n.b(getContext(), 1.0f)));
        this.f128883c.f128856l = this.f128884d;
        RecyclerView recyclerView2 = this.f128884d;
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f128883c);
        this.f128883c.f128845a = this.f128889i;
        this.f128883c.f128846b = g();
        DmtLoadingLayout dmtLoadingLayout = this.f128888h;
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        if (this.f128890j) {
            this.f128883c.c(this.f128892l);
        }
        if (i()) {
            MvImageChooseAdapter mvImageChooseAdapter2 = this.f128883c;
            h.f.b.l.b(mvImageChooseAdapter2, "");
            mvImageChooseAdapter2.a(true);
            if (this.q != null) {
                MultiSelectView multiSelectView = this.q;
                if (multiSelectView == null) {
                    h.f.b.l.a("multiSelectView");
                }
                multiSelectView.setVisibility(8);
            }
            h().a("enter_from_multi");
        }
    }

    static final class e implements MvImageChooseAdapter.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f129146a;

        static {
            Covode.recordClassIndex(84773);
        }

        e(l lVar) {
            this.f129146a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.d
        public final void a(View view, final MediaModel mediaModel) {
            String str;
            Resources resources;
            if (mediaModel != null) {
                MvImageChooseAdapter.c cVar = this.f129146a.r;
                if (cVar != null) {
                    cVar.a();
                }
                MvImageChooseAdapter mvImageChooseAdapter = this.f129146a.f128883c;
                h.f.b.l.b(mvImageChooseAdapter, "");
                if (mvImageChooseAdapter.f128852h) {
                    l lVar = this.f129146a;
                    if (view != null && !lVar.t) {
                        lVar.t = true;
                        lVar.a(true, mediaModel, new g(lVar, mediaModel, view));
                    }
                } else if (!com.ss.android.ugc.tools.utils.i.a(mediaModel.f109390b)) {
                    com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this.f129146a.getActivity());
                    androidx.fragment.app.e activity = this.f129146a.getActivity();
                    if (activity == null || (resources = activity.getResources()) == null) {
                        str = null;
                    } else {
                        str = resources.getString(R.string.cd4);
                    }
                    aVar.a(str).a();
                } else {
                    this.f129146a.a(false, mediaModel, new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l.e.AnonymousClass1 */
                        final /* synthetic */ e this$0;

                        static {
                            Covode.recordClassIndex(84774);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            MvImageChooseAdapter.c cVar = this.this$0.f129146a.r;
                            if (cVar != null) {
                                cVar.a(mediaModel);
                            }
                            return z.f158842a;
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a
    public final void a(List<? extends MvImageChooseAdapter.MyMediaModel> list, boolean z2) {
        if (list != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f128888h;
            h.f.b.l.b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            if (list.isEmpty()) {
                TextView textView = this.w;
                if (textView == null) {
                    h.f.b.l.a("noVideoHintTextView");
                }
                textView.setVisibility(0);
                TextView textView2 = this.w;
                if (textView2 == null) {
                    h.f.b.l.a("noVideoHintTextView");
                }
                textView2.setText(R.string.aj6);
                if (this.n) {
                    b.a.f132249a.end(OpenAlbumPanelPerformanceMonitor.f132344a, "imageLoaded");
                    this.n = false;
                }
            } else {
                TextView textView3 = this.w;
                if (textView3 == null) {
                    h.f.b.l.a("noVideoHintTextView");
                }
                textView3.setVisibility(8);
            }
            if (z2) {
                this.f128883c.a((List<MvImageChooseAdapter.MyMediaModel>) list);
            } else {
                this.f128883c.b((List<MvImageChooseAdapter.MyMediaModel>) list);
            }
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = this.f128893m;
            h.f.b.l.b(l2, "");
            com.ss.android.ugc.aweme.utils.d.a("tool_performance_fetch_album_assets", bVar.a("duration", currentTimeMillis - l2.longValue()).a(StringSet.type, 1).a("count", list.size()).f149193a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c2;
        MethodCollector.i(10357);
        h.f.b.l.d(layoutInflater, "");
        int i2 = 0;
        this.f128886f = com.a.a(layoutInflater, R.layout.big, viewGroup, false);
        this.f128884d = (RecyclerView) this.f128886f.findViewById(R.id.bd0);
        this.f128884d.setRecycledViewPool(MediaRecycledViewPoolViewModel.a.a(getActivity()));
        View findViewById = this.f128886f.findViewById(R.id.f0c);
        h.f.b.l.b(findViewById, "");
        this.w = (TextView) findViewById;
        this.f128888h = (DmtLoadingLayout) this.f128886f.findViewById(R.id.fgl);
        if (!this.s || this.f128890j) {
            c2 = '\b';
        } else {
            c2 = 0;
        }
        if (!i() && c2 == 0) {
            View findViewById2 = this.f128886f.findViewById(R.id.fju);
            if (findViewById2 != null) {
                ((ViewStub) findViewById2).inflate();
                View findViewById3 = this.f128886f.findViewById(R.id.cp0);
                h.f.b.l.b(findViewById3, "");
                MultiSelectView multiSelectView = (MultiSelectView) findViewById3;
                this.q = multiSelectView;
                if (multiSelectView == null) {
                    h.f.b.l.a("multiSelectView");
                }
                if (!this.s || this.f128890j) {
                    i2 = 8;
                }
                multiSelectView.setVisibility(i2);
                MultiSelectView multiSelectView2 = this.q;
                if (multiSelectView2 == null) {
                    h.f.b.l.a("multiSelectView");
                }
                multiSelectView2.setOnModeChangeListener(new d(this));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.o(10357);
                throw nullPointerException;
            }
        }
        if (this.f128884d instanceof FastScrollRecyclerView) {
            RecyclerView recyclerView = this.f128884d;
            if (recyclerView != null) {
                ((FastScrollRecyclerView) recyclerView).setFastScrollEnabled(true);
                RecyclerView recyclerView2 = this.f128884d;
                if (recyclerView2 != null) {
                    ((FastScrollRecyclerView) recyclerView2).setFastScrollListener(this.p);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
                    MethodCollector.o(10357);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
                MethodCollector.o(10357);
                throw nullPointerException3;
            }
        }
        View view = this.f128886f;
        MethodCollector.o(10357);
        return view;
    }

    public final void a(boolean z2, MediaModel mediaModel, h.f.a.a<z> aVar) {
        String str;
        long j2;
        if (z2) {
            str = "preview";
            j2 = 0;
        } else {
            str = "select";
            j2 = this.u;
        }
        h().a(mediaModel, j2, -1, new b(this, mediaModel, str, aVar), new c(this, mediaModel, str));
    }

    public static void a(MediaModel mediaModel, String str, int i2, int i3, long j2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j2);
            q.a("aweme_video_import_duration", jSONObject, new ar().a("status", String.valueOf(i2)).a("scene_name", str2).a("errorCode", Integer.valueOf(i3)).a(StringSet.type, str).a("width", Integer.valueOf(mediaModel.f109400l)).a("height", Integer.valueOf(mediaModel.f109401m)).a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
