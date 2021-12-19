package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.i18n.musically.cut.n;
import com.ss.android.ugc.aweme.j.c;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t extends c implements IVideoChoose {

    /* renamed from: b  reason: collision with root package name */
    protected TextView f99913b;

    /* renamed from: c  reason: collision with root package name */
    protected DmtLoadingLayout f99914c;

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f99915d;

    /* renamed from: e  reason: collision with root package name */
    protected n f99916e;

    /* renamed from: f  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.mediachoose.helper.c f99917f;

    /* renamed from: g  reason: collision with root package name */
    public long f99918g = di.a();

    /* renamed from: h  reason: collision with root package name */
    protected n.a f99919h;

    /* renamed from: i  reason: collision with root package name */
    public IVideoChoose.Callback f99920i;

    /* renamed from: j  reason: collision with root package name */
    private MultiSelectView f99921j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f99922k;

    /* renamed from: l  reason: collision with root package name */
    private m f99923l;

    /* renamed from: m  reason: collision with root package name */
    private int f99924m;
    private int n;
    private int o;
    private volatile boolean p = false;
    private c.a q = new c.a() {
        /* class com.ss.android.ugc.aweme.i18n.musically.cut.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(63684);
        }

        @Override // com.ss.android.ugc.aweme.mediachoose.helper.c.a
        public final void a(boolean z, List<MediaModel> list) {
            int size;
            StringBuilder append = new StringBuilder("onMediaLoaded,success:").append(z).append(",size:");
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            t.a(append.append(size).toString());
            if (t.this.f104785a) {
                t.this.f99914c.setVisibility(8);
                if (z) {
                    t.this.c();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(63683);
    }

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final Fragment fragment() {
        return this;
    }

    public final void b() {
        m mVar = this.f99923l;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        if (!this.p) {
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.mediachoose.helper.c cVar = this.f99917f;
        if (cVar != null) {
            cVar.f109419f.remove(this.q);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        boolean z;
        StringBuilder append = new StringBuilder("refreshData,dataLoaded:").append(this.p).append(",manager valid:");
        if (this.f99917f != null) {
            z = true;
        } else {
            z = false;
        }
        a(append.append(z).toString());
        final ArrayList arrayList = new ArrayList();
        if (this.f99917f != null) {
            this.p = true;
            List<MediaModel> a2 = a(this.f99917f.a());
            if (!a2.isEmpty()) {
                this.f99914c.setVisibility(0);
            }
            final List<MediaModel> c2 = this.f99917f.c();
            arrayList.addAll(a2);
            final ArrayList arrayList2 = new ArrayList();
            s.b(new Runnable() {
                /* class com.ss.android.ugc.aweme.i18n.musically.cut.t.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(63685);
                }

                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaModel mediaModel = (MediaModel) it.next();
                        String str = mediaModel.f109390b;
                        if (!TextUtils.isEmpty(str)) {
                            h.h(str);
                            String h2 = h.h(str);
                            if (h2 == null) {
                                h2 = "";
                            }
                            if (!str.contains("amweme/") && !str.contains("hotsoon/") && h2.endsWith("mp4")) {
                                arrayList2.add(mediaModel);
                            }
                        }
                    }
                    s.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.i18n.musically.cut.t.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(63686);
                        }

                        public final void run() {
                            try {
                                n nVar = t.this.f99916e;
                                ArrayList arrayList = arrayList2;
                                nVar.f99878b.clear();
                                nVar.f99878b.addAll(arrayList);
                                nVar.a(nVar.f99878b.size());
                                nVar.f99887k.b();
                                t.this.f99915d.setAdapter(t.this.f99916e);
                                t.this.f99916e.f99882f = t.this.f99919h;
                                t.this.f99914c.setVisibility(8);
                                if (arrayList2.size() == 0) {
                                    t.this.f99913b.setText(t.this.getResources().getString(R.string.di4));
                                } else {
                                    t.this.f99913b.setText((CharSequence) null);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                }
            });
        }
    }

    public static void a(String str) {
        q.a("MusVideoChooseFragment:".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z) {
        this.f99916e.f99881e = z;
        n nVar = this.f99916e;
        nVar.a(nVar.f99878b.size());
        nVar.f99887k.b();
        if (!com.bytedance.common.utility.h.a(nVar.f99886j)) {
            nVar.f99886j.clear();
        }
        this.f99923l.notifyDataSetChanged();
    }

    private static List<MediaModel> a(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.f109396h > 3000) {
                arrayList.add(mediaModel);
            }
        }
        a("filterVideosMoreThan3Seconds,originSize:" + list.size() + "resultSize:" + arrayList.size());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f99924m = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.n = getArguments().getInt("ARG_TEXT_COLOR", b.c(getContext(), R.color.a_));
        this.o = getArguments().getInt("ARG_SHADOW_COLOR", b.c(getContext(), R.color.a3));
        this.f99922k = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
        this.f99919h = new u(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        MethodCollector.i(11312);
        super.onActivityCreated(bundle);
        if (this.f99917f == null && getActivity() != null) {
            Context applicationContext = getActivity().getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            com.ss.android.ugc.aweme.mediachoose.helper.c.a(applicationContext, as.a());
            com.ss.android.ugc.aweme.mediachoose.helper.c cVar = com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a;
            this.f99917f = cVar;
            cVar.f109419f.add(this.q);
        }
        boolean a2 = com.bytedance.common.utility.h.a(this.f99917f.a());
        a("initData,hasNoMedia:" + a2 + ",dataLoaded:" + this.p);
        if (a2) {
            this.f99914c.setVisibility(0);
            this.f99917f.a(4, -1, -1, null);
        }
        if (this.f99916e == null) {
            this.f99916e = new n(getActivity(), this, this.f99924m);
            m mVar = new m(this.f99916e);
            this.f99923l = mVar;
            e activity = getActivity();
            l.d(activity, "");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) com.bytedance.common.utility.n.b(activity, 96.0f));
            View view = new View(activity);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(0);
            mVar.a(view);
        }
        this.f99916e.f99884h = this.o;
        this.f99916e.f99883g = this.n;
        this.f99916e.f99885i = false;
        this.f99921j.setOnModeChangeListener(new v(this));
        loadData();
        this.f99921j.setVisibility(8);
        this.f99915d.setPadding(0, 0, 0, 0);
        MethodCollector.o(11312);
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        MethodCollector.i(11156);
        View inflate = layoutInflater.inflate(R.layout.big, (ViewGroup) null);
        ((ViewStub) inflate.findViewById(R.id.fju)).inflate();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bd0);
        this.f99915d = recyclerView;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(null, this.f99924m));
        this.f99915d.a(new com.ss.android.ugc.aweme.widgetcompat.b(this.f99924m, (int) com.bytedance.common.utility.n.b(getContext(), 1.0f)));
        this.f99913b = (TextView) inflate.findViewById(R.id.f0c);
        this.f99914c = (DmtLoadingLayout) inflate.findViewById(R.id.fgl);
        MultiSelectView multiSelectView = (MultiSelectView) inflate.findViewById(R.id.cp0);
        this.f99921j = multiSelectView;
        if (this.f99922k) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        multiSelectView.setVisibility(i2);
        MethodCollector.o(11156);
        return inflate;
    }
}
