package com.ss.android.ugc.aweme.tools.mvtemplate.f;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.view.MvRatioFrameLayout;
import com.ss.android.ugc.aweme.views.t;
import com.ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.ss.android.ugc.tools.view.widget.CircularProgressView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class b extends Fragment implements c {

    /* renamed from: a  reason: collision with root package name */
    public CircularProgressView f140833a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f140834b;

    /* renamed from: c  reason: collision with root package name */
    View f140835c;

    /* renamed from: d  reason: collision with root package name */
    public MvThemeData f140836d;

    /* renamed from: e  reason: collision with root package name */
    public e f140837e;

    /* renamed from: f  reason: collision with root package name */
    boolean f140838f;

    /* renamed from: g  reason: collision with root package name */
    public f f140839g;

    /* renamed from: h  reason: collision with root package name */
    private AnimatedImageView f140840h;

    /* renamed from: i  reason: collision with root package name */
    private DmtLoadingLayout f140841i;

    /* renamed from: j  reason: collision with root package name */
    private View f140842j;

    /* renamed from: k  reason: collision with root package name */
    private Video f140843k;

    /* renamed from: l  reason: collision with root package name */
    private int f140844l;

    static {
        Covode.recordClassIndex(91963);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c
    public final void a() {
        a(false);
        AnimatedImageView animatedImageView = this.f140840h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c
    public final void b() {
        AnimatedImageView animatedImageView = this.f140840h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    public final int d() {
        View view = this.f140835c;
        if (view != null) {
            return view.getMeasuredWidth();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c
    public final void c() {
        this.f140838f = true;
        a(false);
        AnimatedImageView animatedImageView = this.f140840h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    public final void f() {
        Video video;
        e eVar = this.f140837e;
        if (eVar != null && !eVar.isPlaying() && (video = this.f140843k) != null) {
            this.f140837e.tryResume(video);
        }
    }

    public final void g() {
        e eVar = this.f140837e;
        if (eVar != null) {
            eVar.stop();
            this.f140838f = false;
            AnimatedImageView animatedImageView = this.f140840h;
            if (animatedImageView != null) {
                animatedImageView.setVisibility(0);
            }
        }
    }

    public final void e() {
        if (this.f140837e == null || !a(this.f140836d)) {
            DmtLoadingLayout dmtLoadingLayout = this.f140841i;
            if (dmtLoadingLayout != null) {
                dmtLoadingLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f140843k == null) {
            this.f140843k = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f140836d.e());
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setUrlKey(this.f140836d.f140622e);
            videoUrlModel.setUri(this.f140836d.f140622e);
            this.f140843k.setPlayAddr(videoUrlModel);
            this.f140843k.setSourceId(this.f140836d.i());
        }
        this.f140837e.tryResume(this.f140843k);
        View view = this.f140835c;
        if (view != null) {
            view.postDelayed(new d(this), 300);
        }
    }

    private static boolean a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f140618a == null || TextUtils.isEmpty(mvThemeData.e()) || TextUtils.isEmpty(mvThemeData.f140622e) || TextUtils.isEmpty(mvThemeData.i())) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        int i2;
        int i3;
        View view = this.f140842j;
        int i4 = 0;
        if (view != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        CircularProgressView circularProgressView = this.f140833a;
        if (circularProgressView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            circularProgressView.setVisibility(i2);
        }
        TextView textView = this.f140834b;
        if (textView != null) {
            if (!z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = new a(this.f140839g);
        this.f140837e = aVar;
        aVar.addPlayerListener(this);
        if (getArguments() != null) {
            this.f140844l = getArguments().getInt("position");
        }
    }

    public final void a(boolean z) {
        int i2;
        DmtLoadingLayout dmtLoadingLayout = this.f140841i;
        if (dmtLoadingLayout != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dmtLoadingLayout.setVisibility(i2);
        }
    }

    public static b a(MvThemeData mvThemeData, int i2, f fVar) {
        b bVar = new b();
        bVar.f140836d = mvThemeData;
        bVar.f140839g = fVar;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i2);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f140835c == null) {
            this.f140835c = a.a(layoutInflater, R.layout.aai, viewGroup, false);
        }
        this.f140840h = (AnimatedImageView) this.f140835c.findViewById(R.id.by4);
        this.f140841i = (DmtLoadingLayout) this.f140835c.findViewById(R.id.ci9);
        this.f140833a = (CircularProgressView) this.f140835c.findViewById(R.id.byw);
        this.f140842j = this.f140835c.findViewById(R.id.chv);
        this.f140834b = (TextView) this.f140835c.findViewById(R.id.dby);
        this.f140833a.setVisibility(4);
        this.f140834b.setVisibility(4);
        this.f140833a.setColor(-1);
        this.f140833a.setThickness((int) n.b(this.f140835c.getContext(), 2.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f140835c.setOutlineProvider(new t((int) n.b(this.f140840h.getContext(), 8.0f)));
            this.f140835c.setClipToOutline(true);
        }
        MvRatioFrameLayout mvRatioFrameLayout = (MvRatioFrameLayout) this.f140835c.findViewById(R.id.dqk);
        f fVar = this.f140839g;
        if (fVar != null) {
            TextureView create = ((com.ss.android.ugc.aweme.tools.mvtemplate.c.a) fVar.a((Type) com.ss.android.ugc.aweme.tools.mvtemplate.c.a.class, (String) null)).getKeepSurfaceTextureViewFactory().create(requireActivity());
            create.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mvRatioFrameLayout.addView(create, 0);
            this.f140837e.wrap(create);
        }
        this.f140835c.setTag(Integer.valueOf(this.f140844l));
        this.f140835c.post(new c(this, viewGroup));
        MvThemeData mvThemeData = this.f140836d;
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.g())) {
            com.ss.android.ugc.tools.c.a.a(this.f140840h, this.f140836d.g(), 1, 1);
        }
        if (this.f140844l == 0 && !this.f140837e.isPlaying()) {
            e();
        }
        return this.f140835c;
    }
}
