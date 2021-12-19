package com.ss.android.ugc.gamora.editor.sticker.read;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f146911a;

    /* renamed from: b  reason: collision with root package name */
    public int f146912b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f146913c;

    /* renamed from: d  reason: collision with root package name */
    private AVDmtImageTextView f146914d;

    /* renamed from: e  reason: collision with root package name */
    private View f146915e;

    /* renamed from: f  reason: collision with root package name */
    private LottieAnimationView f146916f;

    /* renamed from: g  reason: collision with root package name */
    private ObjectAnimator f146917g;

    /* renamed from: h  reason: collision with root package name */
    private d f146918h;

    /* renamed from: i  reason: collision with root package name */
    private b f146919i;

    static {
        Covode.recordClassIndex(96758);
    }

    public final b getModel() {
        return this.f146919i;
    }

    public final boolean a() {
        if (this.f146912b == 0) {
            return true;
        }
        return false;
    }

    private final void d() {
        ImageView imageView = this.f146913c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        e();
    }

    private final void e() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f146917g;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f146917g) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f146913c;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f146917g;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f146917g) == null)) {
            objectAnimator.end();
        }
        LottieAnimationView lottieAnimationView = this.f146916f;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        super.onDetachedFromWindow();
    }

    private final void c() {
        ImageView imageView = this.f146913c;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f146917g = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f146917g;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f146917g;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f146917g;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    private final void b() {
        Resources resources;
        String str;
        AVDmtImageTextView aVDmtImageTextView = this.f146914d;
        Drawable drawable = null;
        if (aVDmtImageTextView != null) {
            Context context = aVDmtImageTextView.getContext();
            if (context != null) {
                str = context.getString(R.string.dig);
            } else {
                str = null;
            }
            aVDmtImageTextView.setText(str);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f146914d;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.setIconImagePadding(10);
        }
        AVDmtImageTextView aVDmtImageTextView3 = this.f146914d;
        if (aVDmtImageTextView3 != null) {
            Context context2 = aVDmtImageTextView3.getContext();
            if (!(context2 == null || (resources = context2.getResources()) == null)) {
                drawable = resources.getDrawable(2131232513);
            }
            aVDmtImageTextView3.a(drawable);
        }
        ImageView imageView = this.f146913c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        setSelectedView(false);
    }

    public final void setModel(b bVar) {
        this.f146919i = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3605);
        this.f146911a = -1;
        MethodCollector.o(3605);
    }

    public final void a(b bVar) {
        this.f146919i = bVar;
        if (a()) {
            b();
        } else if (bVar != null) {
            b(bVar);
        }
    }

    public final void setSelectedView(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f146914d;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
        if (!z || a()) {
            View view = this.f146915e;
            if (view != null) {
                view.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView = this.f146916f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f146915e;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.f146916f;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setVisibility(0);
        }
    }

    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f146920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f146921b;

        static {
            Covode.recordClassIndex(96759);
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            TextStickerData data;
            l.d(view, "");
            if (this.f146920a.a()) {
                this.f146920a.a(2, false);
                d dVar = this.f146921b;
                dVar.t = 0;
                Iterator<T> it = dVar.x.iterator();
                while (it.hasNext()) {
                    it.next().setSelectedView(false);
                }
                dVar.w = null;
                q qVar = dVar.f146866l;
                if (!(qVar == null || (data = qVar.getData()) == null || data.getAudioTrackIndex() < 0)) {
                    j.b(new ShortVideoCommonParams(dVar.b().mShootWay, es.a(dVar.b()), es.c(dVar.b()), dVar.b().creationId));
                    String speakerID = data.getSpeakerID();
                    if (speakerID != null) {
                        dVar.e(speakerID);
                    }
                    g value = dVar.a().C().getValue();
                    if (value != null) {
                        value.e(data.getAudioTrackIndex());
                    }
                    data.setHasReadTextAudio(false);
                    data.setAudioTrackIndex(-1);
                    data.setSpeakerID(null);
                }
                this.f146920a.setSelectedView(true);
            }
            if (this.f146920a.f146911a == 2) {
                this.f146921b.t = this.f146920a.f146912b;
            }
            if (this.f146920a.f146911a == 0) {
                this.f146920a.a(2, false);
                this.f146921b.d(this.f146920a.f146912b);
            }
            if (this.f146920a.f146911a == 1) {
                this.f146921b.d(this.f146920a.f146912b);
            }
        }

        a(f fVar, d dVar) {
            this.f146920a = fVar;
            this.f146921b = dVar;
        }
    }

    private void b(b bVar) {
        List<String> urlList;
        AVDmtImageTextView aVDmtImageTextView;
        l.d(bVar, "");
        if (bVar.f88093b != null) {
            AVDmtImageTextView aVDmtImageTextView2 = this.f146914d;
            if (aVDmtImageTextView2 != null) {
                aVDmtImageTextView2.setText(bVar.f88093b.getName());
            }
            if (bVar.f146854c.f146905a) {
                AVDmtImageTextView aVDmtImageTextView3 = this.f146914d;
                if (aVDmtImageTextView3 != null) {
                    aVDmtImageTextView3.a(2131232710);
                }
            } else {
                UrlModel iconUrl = bVar.f88093b.getIconUrl();
                if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || urlList.isEmpty() || (aVDmtImageTextView = this.f146914d) == null)) {
                    if (urlList == null) {
                        l.b();
                    }
                    aVDmtImageTextView.a(urlList.get(0));
                }
            }
            setSelectedView(false);
            d dVar = this.f146918h;
            if (dVar == null) {
                l.a("scene");
            }
            if (dVar.b(bVar.f146854c.f146907c)) {
                a(1, false);
            } else {
                a(0, false);
            }
        }
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    public final void a(int i2, boolean z) {
        this.f146911a = i2;
        if (i2 != 0) {
            if (i2 == 1) {
                d();
                if (z) {
                    setSelectedView(true);
                    return;
                }
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
            } else if (this.f146912b == 0) {
                setSelectedView(true);
                return;
            } else {
                ImageView imageView = this.f146913c;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.f146913c;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131230948);
                }
                c();
                return;
            }
        }
        ImageView imageView3 = this.f146913c;
        if (imageView3 != null) {
            imageView3.setImageResource(2131232487);
        }
        ImageView imageView4 = this.f146913c;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        e();
    }

    public final void a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2, d dVar) {
        l.d(viewGroup, "");
        l.d(layoutInflater, "");
        l.d(dVar, "");
        this.f146912b = i2;
        this.f146918h = dVar;
        View a2 = com.a.a(layoutInflater, R.layout.dp, viewGroup, false);
        this.f146913c = (ImageView) a2.findViewById(R.id.btz);
        this.f146916f = (LottieAnimationView) a2.findViewById(R.id.cjl);
        this.f146915e = a2.findViewById(R.id.b8x);
        LottieAnimationView lottieAnimationView = this.f146916f;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.a();
        }
        this.f146914d = (AVDmtImageTextView) a2.findViewById(R.id.bnj);
        a2.setOnClickListener(new a(this, dVar));
        addView(a2);
    }
}
