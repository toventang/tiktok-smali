package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.df.o;
import com.ss.android.ugc.aweme.df.p;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.views.t;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import com.ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class b extends Dialog {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135970c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SimpleDraweeView f135971a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f135972b;

    /* renamed from: d  reason: collision with root package name */
    private AVLoadingLayout f135973d;

    /* renamed from: e  reason: collision with root package name */
    private KeepSurfaceTextureView f135974e;

    /* renamed from: f  reason: collision with root package name */
    private VideoViewComponent f135975f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f135976g;

    /* renamed from: h  reason: collision with root package name */
    private Video f135977h;

    /* renamed from: i  reason: collision with root package name */
    private c f135978i;

    /* renamed from: j  reason: collision with root package name */
    private final Effect f135979j;

    /* renamed from: k  reason: collision with root package name */
    private final a f135980k;

    static {
        Covode.recordClassIndex(88834);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88835);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135984a;

        static {
            Covode.recordClassIndex(88839);
        }

        e(b bVar) {
            this.f135984a = bVar;
        }

        public final void run() {
            this.f135984a.a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$b  reason: collision with other inner class name */
    public static final class C3543b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135981a;

        static {
            Covode.recordClassIndex(88836);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            if (this.f135981a.f135971a != null) {
                SimpleDraweeView simpleDraweeView = this.f135981a.f135971a;
                if (simpleDraweeView == null) {
                    l.b();
                }
                simpleDraweeView.setVisibility(0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3543b(b bVar) {
            this.f135981a = bVar;
        }
    }

    public final void dismiss() {
        VideoViewComponent videoViewComponent = this.f135975f;
        if (videoViewComponent != null) {
            if (this.f135978i != null) {
                videoViewComponent.a(this.f135978i);
            }
            VideoViewComponent videoViewComponent2 = this.f135975f;
            if (videoViewComponent2 == null) {
                l.b();
            }
            videoViewComponent2.d();
        }
        super.dismiss();
    }

    public final void show() {
        if (this.f135979j != null) {
            p a2 = o.a(i.f115645a, com.ss.android.ugc.aweme.port.in.l.f115658a.s().a());
            a2.a().putString("upload_pic_sticker_show", a2.a("upload_pic_sticker_show", "") + this.f135979j.getEffectId() + ",").apply();
        }
        super.show();
    }

    public static final class c extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135982a;

        static {
            Covode.recordClassIndex(88837);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f135982a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            l.d(lVar, "");
            this.f135982a.a(false);
            if (this.f135982a.f135971a != null) {
                SimpleDraweeView simpleDraweeView = this.f135982a.f135971a;
                if (simpleDraweeView == null) {
                    l.b();
                }
                simpleDraweeView.setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
            l.d(oVar, "");
            this.f135982a.a(false);
            if (this.f135982a.f135971a != null) {
                SimpleDraweeView simpleDraweeView = this.f135982a.f135971a;
                if (simpleDraweeView == null) {
                    l.b();
                }
                simpleDraweeView.setVisibility(8);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135983a;

        static {
            Covode.recordClassIndex(88838);
        }

        d(b bVar) {
            this.f135983a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f135983a.dismiss();
        }
    }

    public final void a(boolean z) {
        int i2;
        AVLoadingLayout aVLoadingLayout = this.f135973d;
        if (aVLoadingLayout != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            aVLoadingLayout.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.ai6);
        Window window = getWindow();
        if (window == null) {
            l.b();
        }
        l.b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            l.b();
        }
        l.b(window2, "");
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        l.b(paint, "");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            l.b();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        findViewById(R.id.dqn).setOnClickListener(new d(this));
        a aVar2 = this.f135980k;
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.b()) && !TextUtils.isEmpty(aVar2.a())) {
            this.f135974e = (KeepSurfaceTextureView) findViewById(R.id.fhs);
            this.f135971a = (SimpleDraweeView) findViewById(R.id.by4);
            this.f135973d = (AVLoadingLayout) findViewById(R.id.ci9);
            this.f135976g = (TextView) findViewById(R.id.aek);
            View findViewById = findViewById(R.id.fgj);
            if (Build.VERSION.SDK_INT >= 21) {
                l.b(findViewById, "");
                SimpleDraweeView simpleDraweeView = this.f135971a;
                if (simpleDraweeView == null) {
                    l.b();
                }
                findViewById.setOutlineProvider(new t((int) n.b(simpleDraweeView.getContext(), 4.0f)));
                findViewById.setClipToOutline(true);
            }
            View findViewById2 = findViewById(R.id.ck_);
            Drawable a2 = com.ss.android.ugc.tools.view.a.a(-1, -1, 0, (int) n.b(getContext(), 4.0f));
            l.b(findViewById2, "");
            findViewById2.setBackground(a2);
            Drawable a3 = com.ss.android.ugc.tools.view.a.a(303437859, 303437859, 0, 0);
            Context context = getContext();
            l.b(context, "");
            com.facebook.drawee.f.a a4 = new com.facebook.drawee.f.b(context.getResources()).a();
            a4.a(1, a3);
            a4.a(5, a3);
            SimpleDraweeView simpleDraweeView2 = this.f135971a;
            if (simpleDraweeView2 == null) {
                l.b();
            }
            simpleDraweeView2.setHierarchy(a4);
            a aVar3 = this.f135980k;
            if (aVar3 != null) {
                if (!TextUtils.isEmpty(aVar3.b())) {
                    com.ss.android.ugc.tools.c.a.a(this.f135971a, this.f135980k.b(), -1, -1);
                }
                if (TextUtils.isEmpty(this.f135980k.f135968c)) {
                    TextView textView = this.f135976g;
                    if (textView == null) {
                        l.b();
                    }
                    textView.setVisibility(8);
                } else {
                    TextView textView2 = this.f135976g;
                    if (textView2 == null) {
                        l.b();
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = this.f135976g;
                    if (textView3 == null) {
                        l.b();
                    }
                    textView3.setText(this.f135980k.f135968c);
                }
            }
            this.f135978i = new c(this);
            KeepSurfaceTextureView keepSurfaceTextureView = this.f135974e;
            if (keepSurfaceTextureView == null) {
                l.b();
            }
            j a5 = j.a(keepSurfaceTextureView);
            VideoViewComponent videoViewComponent = new VideoViewComponent();
            this.f135975f = videoViewComponent;
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f135974e;
            if (keepSurfaceTextureView2 == null) {
                l.b();
            }
            videoViewComponent.a(keepSurfaceTextureView2);
            VideoViewComponent videoViewComponent2 = this.f135975f;
            if (videoViewComponent2 == null) {
                l.b();
            }
            videoViewComponent2.b(this.f135978i);
            a5.a(new C3543b(this));
            if (this.f135975f != null && (aVar = this.f135980k) != null && !TextUtils.isEmpty(aVar.a())) {
                if (this.f135977h == null) {
                    this.f135977h = new Video();
                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                    videoUrlModel.setBytevc1(false);
                    ArrayList arrayList = new ArrayList();
                    a aVar4 = this.f135980k;
                    if (aVar4 == null) {
                        l.b();
                    }
                    String a6 = aVar4.a();
                    if (a6 == null) {
                        l.b();
                    }
                    arrayList.add(a6);
                    videoUrlModel.setUrlList(arrayList);
                    videoUrlModel.setUrlKey(this.f135980k.f135967b);
                    videoUrlModel.setUri(this.f135980k.f135967b);
                    Video video = this.f135977h;
                    if (video == null) {
                        l.b();
                    }
                    video.setPlayAddr(videoUrlModel);
                    Video video2 = this.f135977h;
                    if (video2 == null) {
                        l.b();
                    }
                    video2.setSourceId(this.f135980k.f135967b);
                }
                a(true);
                VideoViewComponent videoViewComponent3 = this.f135975f;
                if (videoViewComponent3 == null) {
                    l.b();
                }
                Video video3 = this.f135977h;
                if (video3 == null) {
                    l.b();
                }
                videoViewComponent3.a(video3);
                Handler handler = this.f135972b;
                if (handler != null) {
                    handler.postDelayed(new e(this), 5000);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, Effect effect, a aVar) {
        super(context, R.style.gf);
        l.d(context, "");
        this.f135979j = effect;
        this.f135980k = aVar;
    }
}
