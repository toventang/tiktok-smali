package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class d implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b {

    /* renamed from: a  reason: collision with root package name */
    public VideoImageMixedView f129478a;

    /* renamed from: b  reason: collision with root package name */
    public c f129479b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> f129480c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public e f129481d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d f129482e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f129483f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a f129484g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a f129485h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a f129486i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f129487j;

    /* renamed from: k  reason: collision with root package name */
    private String f129488k;

    /* renamed from: l  reason: collision with root package name */
    private String f129489l;

    /* renamed from: m  reason: collision with root package name */
    private String f129490m;
    private Drawable n;
    private Drawable o;
    private String p;
    private int q = -1;
    private ArrayList<CutSameVideoImageExtraData> r;
    private int s = 1;
    private int t = 1;
    private List<String> u = new ArrayList();
    private int v;
    private ChooseMediaViewModel w;
    private boolean x;

    static {
        Covode.recordClassIndex(84990);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final List<MvImageChooseAdapter.MyMediaModel> a() {
        return this.f129480c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void a(View view, String str) {
        l.d(view, "");
        VideoImageMixedView videoImageMixedView = (VideoImageMixedView) view;
        this.f129478a = videoImageMixedView;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView.a(str, false);
        VideoImageMixedView videoImageMixedView2 = this.f129478a;
        if (videoImageMixedView2 == null) {
            l.a("videoImageMixedView");
        }
        TextView sureTextView = videoImageMixedView2.getSureTextView();
        Context context = sureTextView.getContext();
        sureTextView.setText(context != null ? context.getString(R.string.dgs) : null);
        sureTextView.setTextColor(1461065763);
        Drawable a2 = com.ss.android.ugc.tools.view.a.a(0, 253106211, 0, (int) com.ss.android.ttve.utils.b.b(videoImageMixedView.getContext(), 2.0f));
        l.b(a2, "");
        this.o = a2;
        if (a2 == null) {
            l.a("unClickDrawable");
        }
        sureTextView.setBackground(a2);
        VideoImageMixedView videoImageMixedView3 = this.f129478a;
        if (videoImageMixedView3 == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView3.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void a(View view) {
        c bVar;
        MethodCollector.i(11492);
        l.d(view, "");
        VideoImageMixedView videoImageMixedView = (VideoImageMixedView) view;
        this.f129478a = videoImageMixedView;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView.setVisibility(0);
        if (h()) {
            bVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.a();
        } else {
            bVar = new b();
        }
        this.f129479b = bVar;
        VideoImageMixedView videoImageMixedView2 = this.f129478a;
        if (videoImageMixedView2 == null) {
            l.a("videoImageMixedView");
        }
        ViewStub viewStub = (ViewStub) videoImageMixedView2.findViewById(R.id.fjt);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById = videoImageMixedView2.findViewById(R.id.cl7);
        if (findViewById == null) {
            l.b();
        }
        videoImageMixedView2.f129432a = (RecyclerView) findViewById;
        RecyclerView recyclerView = videoImageMixedView2.f129432a;
        if (recyclerView == null) {
            l.a("mediaSelectRecyclerView");
        }
        Context context = videoImageMixedView2.getContext();
        l.b(context, "");
        recyclerView.setLayoutManager(new VideoImageMixedView.a(videoImageMixedView2, context));
        i iVar = new i();
        iVar.f3830i = 0;
        iVar.f3832k = 250;
        iVar.f3831j = 0;
        iVar.f3833l = 250;
        RecyclerView recyclerView2 = videoImageMixedView2.f129432a;
        if (recyclerView2 == null) {
            l.a("mediaSelectRecyclerView");
        }
        recyclerView2.setItemAnimator(iVar);
        VideoImageMixedView videoImageMixedView3 = this.f129478a;
        if (videoImageMixedView3 == null) {
            l.a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyclerView = videoImageMixedView3.getMediaSelectRecyclerView();
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        mediaSelectRecyclerView.setAdapter(cVar);
        Context context2 = view.getContext();
        l.b(context2, "");
        String string = context2.getResources().getString(R.string.c4d);
        l.b(string, "");
        this.f129488k = string;
        Context context3 = view.getContext();
        l.b(context3, "");
        String string2 = context3.getResources().getString(R.string.dgw);
        l.b(string2, "");
        this.f129489l = string2;
        Context context4 = view.getContext();
        l.b(context4, "");
        String string3 = context4.getResources().getString(R.string.f9v);
        l.b(string3, "");
        this.f129490m = string3;
        Context context5 = view.getContext();
        l.b(context5, "");
        int color = context5.getResources().getColor(R.color.bh);
        int b2 = (int) com.ss.android.ttve.utils.b.b(view.getContext(), 2.0f);
        Drawable a2 = com.ss.android.ugc.tools.view.a.a(0, color, 0, b2);
        l.b(a2, "");
        this.n = a2;
        Drawable a3 = com.ss.android.ugc.tools.view.a.a(0, 253106211, 0, b2);
        l.b(a3, "");
        this.o = a3;
        VideoImageMixedView videoImageMixedView4 = this.f129478a;
        if (videoImageMixedView4 == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView4.a(this.p, i());
        m();
        if (!this.f129483f && f.f125945d) {
            b.i.b(e.c.f129499a, b.i.f4824a);
        }
        if (h()) {
            c cVar2 = this.f129479b;
            if (cVar2 == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar2.a(this.s);
            c cVar3 = this.f129479b;
            if (cVar3 == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar3.a(this.r);
            VideoImageMixedView videoImageMixedView5 = this.f129478a;
            if (videoImageMixedView5 == null) {
                l.a("videoImageMixedView");
            }
            videoImageMixedView5.a(true);
        } else {
            c cVar4 = this.f129479b;
            if (cVar4 == null) {
                l.a("videoImageMixedAdapter");
            }
            n nVar = new n(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.f(cVar4));
            VideoImageMixedView videoImageMixedView6 = this.f129478a;
            if (videoImageMixedView6 == null) {
                l.a("videoImageMixedView");
            }
            nVar.a(videoImageMixedView6.getMediaSelectRecyclerView());
        }
        c cVar5 = this.f129479b;
        if (cVar5 == null) {
            l.a("videoImageMixedAdapter");
        }
        cVar5.f129447f = new a(this);
        VideoImageMixedView videoImageMixedView7 = this.f129478a;
        if (videoImageMixedView7 == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView7.getSureTextView().setOnClickListener(new b(this));
        MethodCollector.o(11492);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void a(c cVar) {
        int i2;
        this.f129481d = cVar.f129465a;
        this.f129482e = cVar.f129466b;
        this.q = cVar.f129467c;
        this.f129483f = cVar.f129468d;
        this.f129484g = cVar.f129469e;
        this.f129485h = cVar.f129470f;
        this.f129486i = cVar.f129471g;
        this.t = cVar.f129473i;
        this.s = cVar.f129474j;
        this.p = cVar.f129472h;
        this.u = cVar.f129476l;
        this.r = cVar.f129477m;
        int i3 = this.q;
        if (i3 == 10 || i3 == 16) {
            i2 = cVar.f129475k;
        } else {
            i2 = e.a();
        }
        this.v = i2;
        this.w = cVar.n;
        this.x = cVar.o;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void a(boolean z) {
        if (z) {
            VideoImageMixedView videoImageMixedView = this.f129478a;
            if (videoImageMixedView == null) {
                l.a("videoImageMixedView");
            }
            videoImageMixedView.setVisibility(0);
            return;
        }
        this.f129480c.clear();
        if (this.f129479b != null) {
            c cVar = this.f129479b;
            if (cVar == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar.f129443b.clear();
            c cVar2 = this.f129479b;
            if (cVar2 == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar2.notifyDataSetChanged();
            VideoImageMixedView videoImageMixedView2 = this.f129478a;
            if (videoImageMixedView2 == null) {
                l.a("videoImageMixedView");
            }
            videoImageMixedView2.a(false);
            VideoImageMixedView videoImageMixedView3 = this.f129478a;
            if (videoImageMixedView3 == null) {
                l.a("videoImageMixedView");
            }
            TextView sureTextView = videoImageMixedView3.getSureTextView();
            VideoImageMixedView videoImageMixedView4 = this.f129478a;
            if (videoImageMixedView4 == null) {
                l.a("videoImageMixedView");
            }
            sureTextView.setText(videoImageMixedView4.getContext().getString(R.string.dgs));
            VideoImageMixedView videoImageMixedView5 = this.f129478a;
            if (videoImageMixedView5 == null) {
                l.a("videoImageMixedView");
            }
            a(videoImageMixedView5.getSureTextView(), false);
        }
        VideoImageMixedView videoImageMixedView6 = this.f129478a;
        if (videoImageMixedView6 == null) {
            l.a("videoImageMixedView");
        }
        videoImageMixedView6.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> e() {
        return g();
    }

    public final boolean i() {
        if (this.q == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final CutSameVideoImageExtraData b() {
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        return cVar.b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final View f() {
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        return videoImageMixedView.getSureTextView();
    }

    public final boolean h() {
        if (this.q == 10) {
            return true;
        }
        return false;
    }

    private final int j() {
        int size = (this.v - this.f129480c.size()) - this.u.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    private final void k() {
        Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f129480c.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            it.next().v = i2;
            i2++;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void d() {
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        videoImageMixedView.a(cVar.a());
    }

    public final ArrayList<MvImageChooseAdapter.MyMediaModel> g() {
        if (!h()) {
            return this.f129480c;
        }
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        return cVar.f129443b;
    }

    private final void l() {
        Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f129480c.iterator();
        while (it.hasNext()) {
            MvImageChooseAdapter.MyMediaModel next = it.next();
            l.b(next, "");
            if (h.a(next.f109390b, false)) {
                next.f109396h = 3000;
                next.f109400l = 720;
                next.f109401m = 1280;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final View c() {
        if (!h() || this.f129478a == null || this.f129479b == null) {
            return null;
        }
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyclerView = videoImageMixedView.getMediaSelectRecyclerView();
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        RecyclerView.ViewHolder f2 = mediaSelectRecyclerView.f(cVar.a());
        if (f2 == null) {
            return null;
        }
        l.b(f2, "");
        return f2.itemView;
    }

    private final void m() {
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        TextView sureTextView = videoImageMixedView.getSureTextView();
        int size = this.f129480c.size();
        boolean a2 = a(this.f129480c);
        boolean z = false;
        if (!a2 && size != 1 && !i() && !this.f129483f) {
            String str = this.f129489l;
            if (str == null) {
                l.a("nextStepText");
            }
            String a3 = com.a.a(str, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            l.b(a3, "");
            sureTextView.setText(a3);
        } else if (this.f129483f) {
            if (size == 1) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.b22));
            } else {
                String str2 = this.f129490m;
                if (str2 == null) {
                    l.a("sureText");
                }
                String a4 = com.a.a(str2, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                l.b(a4, "");
                sureTextView.setText(a4);
            }
        } else if (i()) {
            String str3 = this.f129490m;
            if (str3 == null) {
                l.a("sureText");
            }
            String a5 = com.a.a(str3, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            l.b(a5, "");
            sureTextView.setText(a5);
        } else if (size == 1) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.dgs));
        } else {
            String str4 = this.f129489l;
            if (str4 == null) {
                l.a("nextStepText");
            }
            String a6 = com.a.a(str4, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            l.b(a6, "");
            sureTextView.setText(a6);
        }
        if (h()) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.b22));
        }
        if (size == 0) {
            a(sureTextView, false);
            if (!h()) {
                VideoImageMixedView videoImageMixedView2 = this.f129478a;
                if (videoImageMixedView2 == null) {
                    l.a("videoImageMixedView");
                }
                videoImageMixedView2.a(false);
            }
            if (this.f129483f || i() || h()) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.b22));
            } else {
                sureTextView.setText(sureTextView.getContext().getString(R.string.dgs));
            }
        } else {
            if (a2) {
                if (size >= this.s) {
                    z = true;
                }
                a(sureTextView, z);
            } else {
                if (size >= this.t) {
                    z = true;
                }
                a(sureTextView, z);
            }
            VideoImageMixedView videoImageMixedView3 = this.f129478a;
            if (videoImageMixedView3 == null) {
                l.a("videoImageMixedView");
            }
            videoImageMixedView3.a(true);
        }
        ChooseMediaViewModel chooseMediaViewModel = this.w;
        if (chooseMediaViewModel != null) {
            VideoImageMixedView videoImageMixedView4 = this.f129478a;
            if (videoImageMixedView4 == null) {
                l.a("videoImageMixedView");
            }
            chooseMediaViewModel.a(videoImageMixedView4.getSureTextView().getText().toString());
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f129491a;

        static {
            Covode.recordClassIndex(84991);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f129491a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                Iterator<MvImageChooseAdapter.MyMediaModel> it = this.f129491a.f129480c.iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    MvImageChooseAdapter.MyMediaModel next = it.next();
                    String str = myMediaModel.f109390b;
                    l.b(next, "");
                    if (l.a((Object) str, (Object) next.f109390b)) {
                        next.v = -1;
                    } else {
                        next.v = i2;
                        i2++;
                    }
                }
                this.f129491a.f129480c.remove(myMediaModel);
                this.f129491a.a(myMediaModel);
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar = this.f129491a.f129484g;
                if (aVar != null) {
                    aVar.a(myMediaModel);
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar2 = this.f129491a.f129485h;
                if (aVar2 != null) {
                    aVar2.a(myMediaModel);
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar3 = this.f129491a.f129486i;
                if (aVar3 != null) {
                    aVar3.a(myMediaModel);
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar4 = this.f129491a.f129484g;
                if (aVar4 != null) {
                    aVar4.d();
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar5 = this.f129491a.f129485h;
                if (aVar5 != null) {
                    aVar5.d();
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar6 = this.f129491a.f129486i;
                if (aVar6 != null) {
                    aVar6.d();
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e eVar = this.f129491a.f129481d;
                if (eVar != null) {
                    eVar.a(myMediaModel);
                }
                r.a("edit_clip_delete", f.b(myMediaModel.b()).f149193a);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(int i2, int i3) {
            this.f129491a.a(i2, i3, false);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e eVar = this.f129491a.f129481d;
            if (eVar != null) {
                eVar.a(myMediaModel, view);
            }
            if (myMediaModel != null) {
                r.a("edit_clip_preview", f.b(myMediaModel.b()).a("edit_way", "click").f149193a);
            }
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f129492a;

        static {
            Covode.recordClassIndex(84992);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1100);
            this.f129492a = dVar;
        }

        public static final class a implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129493a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f129494b;

            static {
                Covode.recordClassIndex(84993);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a
            public final void a(boolean z) {
                if (!z) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar = this.f129493a.f129492a.f129482e;
                    if (dVar != null) {
                        dVar.a(true, this.f129493a.f129492a.g());
                    }
                } else if (this.f129493a.f129492a.f129480c.size() > 1 || this.f129493a.f129492a.f129483f) {
                    View view = this.f129494b;
                    if (view != null) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.h6h).a();
                    }
                } else if (bt.a()) {
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar2 = this.f129493a.f129492a.f129482e;
                    if (dVar2 != null) {
                        dVar2.a(true, this.f129493a.f129492a.g());
                    }
                } else {
                    View view2 = this.f129494b;
                    if (view2 != null) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(view2.getContext()).a(R.string.h6j).a();
                    }
                }
            }

            a(b bVar, View view) {
                this.f129493a = bVar;
                this.f129494b = view;
            }
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            b.a.f132249a.start("av_video_edit", "click onNext btn");
            if (!this.f129492a.f129487j) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar = this.f129492a.f129482e;
                if (dVar != null) {
                    dVar.a(false, this.f129492a.g());
                }
            } else if (this.f129492a.h() || this.f129492a.i()) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar2 = this.f129492a.f129482e;
                if (dVar2 != null) {
                    dVar2.a(true, this.f129492a.g());
                }
            } else if (!d.a(this.f129492a.f129480c)) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar3 = this.f129492a.f129482e;
                if (dVar3 != null) {
                    dVar3.a(true, this.f129492a.g());
                }
            } else {
                cr a2 = cr.a();
                l.b(a2, "");
                if (a2.f125296b) {
                    cr.a().f125295a = null;
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d dVar4 = this.f129492a.f129482e;
                    if (dVar4 != null) {
                        dVar4.a();
                    }
                }
                e.a(this.f129492a.f129480c, new a(this, view));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final View b(int i2) {
        View c2;
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        RecyclerView.i layoutManager = videoImageMixedView.getMediaSelectRecyclerView().getLayoutManager();
        if (layoutManager == null || (c2 = layoutManager.c(i2)) == null) {
            return null;
        }
        return c2.findViewById(R.id.ffs);
    }

    public static boolean a(List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        if (k.a(list)) {
            return false;
        }
        if (list == null) {
            l.b();
        }
        for (MediaModel mediaModel : list) {
            if (mediaModel.b()) {
                return true;
            }
        }
        return false;
    }

    public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return -1;
        }
        c cVar = this.f129479b;
        if (cVar == null) {
            l.a("videoImageMixedAdapter");
        }
        cVar.a(myMediaModel);
        this.f129480c.remove(myMediaModel);
        ChooseMediaViewModel chooseMediaViewModel = this.w;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.a(myMediaModel);
        }
        k();
        m();
        if (h()) {
            VideoImageMixedView videoImageMixedView = this.f129478a;
            if (videoImageMixedView == null) {
                l.a("videoImageMixedView");
            }
            c cVar2 = this.f129479b;
            if (cVar2 == null) {
                l.a("videoImageMixedAdapter");
            }
            videoImageMixedView.a(cVar2.a());
        }
        return j();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void a(int i2) {
        VideoImageMixedView videoImageMixedView = this.f129478a;
        if (videoImageMixedView == null) {
            l.a("videoImageMixedView");
        }
        RecyclerView.i layoutManager = videoImageMixedView.getMediaSelectRecyclerView().getLayoutManager();
        if (layoutManager != null && layoutManager.c(i2) == null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).a(i2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final void b(int i2, int i3) {
        a(i2, i3, true);
    }

    private final void a(TextView textView, boolean z) {
        if (z) {
            if (textView != null) {
                textView.setTextColor(-1);
                Drawable drawable = this.n;
                if (drawable == null) {
                    l.a("clickDrawable");
                }
                textView.setBackground(drawable);
            }
            this.f129487j = true;
            return;
        }
        if (textView != null) {
            textView.setTextColor(1461065763);
            Drawable drawable2 = this.o;
            if (drawable2 == null) {
                l.a("unClickDrawable");
            }
            textView.setBackground(drawable2);
        }
        this.f129487j = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final int a(int i2, int i3) {
        int size = this.f129480c.size();
        if (i3 == 6) {
            return 10;
        }
        if (this.f129483f) {
            l();
            return 12;
        } else if (i2 == 1) {
            return i2;
        } else {
            if (size == 1) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f129480c.get(0);
                l.b(myMediaModel, "");
                if (myMediaModel.b()) {
                    return 13;
                }
                return 11;
            } else if (!a(this.f129480c)) {
                return 11;
            } else {
                l();
                return 2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b
    public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z, boolean z2) {
        int a2;
        if (!z) {
            a2 = a(myMediaModel);
        } else if (myMediaModel == null) {
            a2 = -1;
        } else {
            this.f129480c.add(myMediaModel);
            c cVar = this.f129479b;
            if (cVar == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar.b(myMediaModel);
            ChooseMediaViewModel chooseMediaViewModel = this.w;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.c(new ChooseMediaViewModel.g(myMediaModel));
            }
            k();
            m();
            VideoImageMixedView videoImageMixedView = this.f129478a;
            if (videoImageMixedView == null) {
                l.a("videoImageMixedView");
            }
            c cVar2 = this.f129479b;
            if (cVar2 == null) {
                l.a("videoImageMixedAdapter");
            }
            videoImageMixedView.a(cVar2.a());
            a2 = j();
        }
        if (z2) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar = this.f129486i;
            if (aVar != null) {
                aVar.b(a2);
            }
        } else {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar2 = this.f129485h;
            if (aVar2 != null) {
                aVar2.b(a2);
            }
        }
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar3 = this.f129484g;
        if (aVar3 != null) {
            aVar3.b(a2);
        }
        if (!z) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar4 = this.f129485h;
            if (aVar4 != null) {
                aVar4.d();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar5 = this.f129486i;
            if (aVar5 != null) {
                aVar5.d();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar6 = this.f129484g;
            if (aVar6 != null) {
                aVar6.d();
            }
        } else if (a2 == 0) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar7 = this.f129485h;
            if (aVar7 != null) {
                aVar7.d();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar8 = this.f129486i;
            if (aVar8 != null) {
                aVar8.d();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar9 = this.f129484g;
            if (aVar9 != null) {
                aVar9.d();
            }
        }
        return this.f129480c.size();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (i2 < 0 || i2 >= this.f129480c.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i3 < 0 || i3 >= this.f129480c.size()) {
            z3 = false;
        }
        if (z2 && z3) {
            MvImageChooseAdapter.MyMediaModel remove = this.f129480c.remove(i2);
            l.b(remove, "");
            MvImageChooseAdapter.MyMediaModel myMediaModel = remove;
            this.f129480c.add(i3, myMediaModel);
            k();
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar = this.f129484g;
            if (aVar != null) {
                aVar.e();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar2 = this.f129486i;
            if (aVar2 != null) {
                aVar2.e();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a aVar3 = this.f129485h;
            if (aVar3 != null) {
                aVar3.e();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e eVar = this.f129481d;
            if (eVar != null) {
                eVar.a(i2, i3);
            }
            f.a(myMediaModel.b());
        }
        if (z) {
            c cVar = this.f129479b;
            if (cVar == null) {
                l.a("videoImageMixedAdapter");
            }
            cVar.a(i2, i3);
        }
    }
}
