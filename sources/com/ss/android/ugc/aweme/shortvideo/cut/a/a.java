package com.ss.android.ugc.aweme.shortvideo.cut.a;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.g.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.mediaplayer.h;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.tools.i;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class a extends Fragment {

    /* renamed from: m  reason: collision with root package name */
    private static final double f125406m = ((double) i.FAST.value());

    /* renamed from: a  reason: collision with root package name */
    TextureView f125407a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f125408b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout f125409c;

    /* renamed from: d  reason: collision with root package name */
    VideoEditView f125410d;

    /* renamed from: e  reason: collision with root package name */
    TextView f125411e;

    /* renamed from: f  reason: collision with root package name */
    boolean f125412f;

    /* renamed from: g  reason: collision with root package name */
    public MediaPlayerModule f125413g;

    /* renamed from: h  reason: collision with root package name */
    public CutMultiVideoViewModel f125414h;

    /* renamed from: i  reason: collision with root package name */
    public VideoEditViewModel f125415i;

    /* renamed from: j  reason: collision with root package name */
    public VideoShare2GifEditContext f125416j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f125417k = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.ugc.aweme.shortvideo.cut.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(82317);
        }

        public final void handleMessage(Message message) {
            int i2;
            super.handleMessage(message);
            if (message.what == 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = a.this.f125414h;
                long longValue = ((Long) message.obj).longValue();
                List<VideoSegment> j2 = a.this.f125415i.j();
                cutMultiVideoViewModel.f125327b.setValue(Long.valueOf(longValue));
                int i3 = 0;
                if (cutMultiVideoViewModel.f125326a.getValue() != null) {
                    i2 = cutMultiVideoViewModel.f125326a.getValue().f2398b.intValue();
                } else {
                    i2 = 0;
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < j2.size(); i4++) {
                    if (!j2.get(i4).f125485i) {
                        arrayList.add(j2.get(i4));
                    }
                }
                long j3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    j3 += ((VideoSegment) arrayList.get(i5)).f125478b;
                    if (j3 > longValue) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                if (longValue > 0) {
                    cutMultiVideoViewModel.f125326a.setValue(e.a(Integer.valueOf(i2), Integer.valueOf(i3)));
                }
            }
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public Runnable f125418l = new Runnable() {
        /* class com.ss.android.ugc.aweme.shortvideo.cut.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(82318);
        }

        public final void run() {
            if (a.this.f125413g != null) {
                a.this.f125417k.obtainMessage(0, Long.valueOf(a.this.f125413g.f109435b.g())).sendToTarget();
                a.this.f125417k.postDelayed(a.this.f125418l, 30);
            }
        }
    };
    private u<h> n = new b(this);

    static {
        Covode.recordClassIndex(82316);
        g.a().u();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (getActivity() != null) {
            new b(this).e(R.string.dr5).b();
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f125411e.setText(getString(R.string.d6p, com.a.a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.f125410d.getSelectedTime())})));
        e<Long, Long> singleVideoPlayBoundary = this.f125410d.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2397a != null && singleVideoPlayBoundary.f2398b != null) {
            this.f125416j.f123500m = singleVideoPlayBoundary.f2397a.longValue();
            this.f125416j.n = singleVideoPlayBoundary.f2398b.longValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            b();
            return;
        }
        this.f125414h = (CutMultiVideoViewModel) ae.a(getActivity(), (ad.b) null).a(CutMultiVideoViewModel.class);
        this.f125415i = (VideoEditViewModel) ae.a(getActivity(), (ad.b) null).a(VideoEditViewModel.class);
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        this.f125416j = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f125407a = (TextureView) view.findViewById(R.id.ekb);
        this.f125408b = (ImageView) view.findViewById(R.id.d5j);
        this.f125409c = (FrameLayout) view.findViewById(R.id.b6s);
        this.f125410d = (VideoEditView) view.findViewById(R.id.fg1);
        this.f125411e = (TextView) view.findViewById(R.id.f9e);
        this.f125407a.setOnClickListener(new c(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f125407a.setClipToOutline(true);
            this.f125407a.setOutlineProvider(new com.ss.android.ugc.aweme.shortvideo.cut.a.a.b(en.a(4.0d, com.ss.android.ugc.aweme.port.in.i.f115645a)));
        }
        this.f125409c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.a.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(82319);
            }

            public final void onGlobalLayout() {
                int i2;
                if (a.this.f125416j != null) {
                    a.this.f125409c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int height = a.this.f125409c.getHeight();
                    int width = a.this.f125409c.getWidth();
                    int[] b2 = com.ss.android.ugc.aweme.shortvideo.af.b.b(a.this.f125416j.f123488a);
                    if (b2[0] == 0) {
                        int i3 = b2[2];
                        int i4 = b2[3];
                        a.this.f125416j.f123494g = i3;
                        a.this.f125416j.f123495h = i4;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        if (i3 < i4) {
                            layoutParams.width = (i3 * height) / i4;
                            layoutParams.height = height;
                            layoutParams.leftMargin = (width - layoutParams.width) / 2;
                            layoutParams.topMargin = 0;
                        } else {
                            layoutParams.width = width;
                            layoutParams.height = (i4 * width) / i3;
                            layoutParams.topMargin = (height - layoutParams.height) / 2;
                            if (layoutParams.topMargin >= 0) {
                                i2 = layoutParams.topMargin;
                            } else {
                                i2 = 0;
                            }
                            layoutParams.topMargin = i2;
                            layoutParams.leftMargin = 0;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        layoutParams.setMarginStart(layoutParams.leftMargin);
                        a.this.f125416j.f123496i = layoutParams.width;
                        a.this.f125416j.f123497j = layoutParams.height;
                        a.this.f125409c.setLayoutParams(layoutParams);
                    }
                }
            }
        });
        this.f125410d.setMinVideoLength(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f125410d.setMaxVideoLength(15000);
        if (this.f125410d.a(getActivity(), this.f125414h, this.f125416j.f123488a) || getActivity() == null) {
            this.f125415i.f126130c.observe(this, new d(this));
            this.f125415i.f126132e.observe(this, new e(this));
            this.f125415i.f126131d.observe(this, new f(this));
            this.f125415i.f126133f.observe(this, new g(this));
            this.f125415i.f126134g.observe(this, new h(this));
            this.f125415i.f126139l.observe(this, new i(this));
            try {
                String str = dj.f126462e + "video2gif_workspace";
                com.ss.android.ugc.aweme.video.e.e(str);
                com.ss.android.ugc.aweme.mediaplayer.i iVar = new com.ss.android.ugc.aweme.mediaplayer.i(str, this.f125407a);
                com.ss.android.ugc.aweme.mediaplayer.g gVar = new com.ss.android.ugc.aweme.mediaplayer.g();
                gVar.f109450c = true;
                gVar.f109448a = (float) f125406m;
                gVar.f109449b = 0.0f;
                gVar.f109452e = this.f125410d.getMaxCutDuration();
                MediaPlayerModule mediaPlayerModule = new MediaPlayerModule(iVar, gVar);
                this.f125413g = mediaPlayerModule;
                mediaPlayerModule.f109434a = this.f125416j.f123488a;
                this.f125413g.f109441h.observe(this, this.n);
                MediaPlayerModule mediaPlayerModule2 = this.f125413g;
                TextureView textureView = this.f125407a;
                mediaPlayerModule2.f109440g = textureView.getSurfaceTextureListener();
                textureView.setSurfaceTextureListener(mediaPlayerModule2);
                getLifecycle().a(this.f125413g);
            } catch (Exception e2) {
                e2.printStackTrace();
                b();
            }
        } else {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a1u, viewGroup, false);
    }
}
