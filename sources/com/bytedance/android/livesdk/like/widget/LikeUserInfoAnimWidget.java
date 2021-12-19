package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.b;
import com.bytedance.android.livesdk.like.d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public class LikeUserInfoAnimWidget extends LiveRecyclableWidget implements d, au {

    /* renamed from: e  reason: collision with root package name */
    private static final float f18362e;

    /* renamed from: a  reason: collision with root package name */
    public View f18363a;

    /* renamed from: b  reason: collision with root package name */
    public ProgressBar f18364b;

    /* renamed from: c  reason: collision with root package name */
    public LottieAnimationView f18365c;

    /* renamed from: d  reason: collision with root package name */
    public View f18366d;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f18367f;

    /* renamed from: g  reason: collision with root package name */
    private ObjectAnimator f18368g;

    /* renamed from: h  reason: collision with root package name */
    private ObjectAnimator f18369h;

    /* renamed from: i  reason: collision with root package name */
    private int f18370i;

    /* renamed from: j  reason: collision with root package name */
    private int f18371j;

    /* renamed from: k  reason: collision with root package name */
    private AnimatorSet f18372k;

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f18373l;

    /* renamed from: m  reason: collision with root package name */
    private Keyframe[] f18374m;
    private AnimatorSet n;
    private Keyframe[] o;
    private ImageView p;
    private TextView q;
    private AnimatorSet r;
    private Property<View, Integer> s;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        float f2;
        Covode.recordClassIndex(10339);
        if (a.a(y.e())) {
            f2 = -18.0f;
        } else {
            f2 = 18.0f;
        }
        f18362e = f2;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (((Boolean) this.dataChannel.b(ee.class)).booleanValue()) {
            return R.layout.bb_;
        }
        return R.layout.bba;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        b likeHelper;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null && (likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(room.getId())) != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.b(this);
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f18367f.cancel();
        this.f18368g.cancel();
        this.f18369h.cancel();
        this.f18372k.cancel();
        this.f18373l.cancel();
        this.f18365c.d();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        b likeHelper;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null && (likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(room.getId())) != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.a(this);
        }
        this.f18366d.setVisibility(8);
        if (!(room == null || room.getOwner() == null)) {
            g.a(this.p, room.getOwner().getAvatarThumb(), 2131234424);
            this.p.setOnClickListener(new a(room));
        }
        this.f18363a.setScaleX(0.0f);
        this.f18363a.setScaleY(0.0f);
        this.f18363a.setRotation(0.0f);
        this.f18364b.setAlpha(0.0f);
        this.f18364b.setProgress(0);
        this.f18365c.setVisibility(4);
        this.f18370i = 0;
        this.f18371j = 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f18363a = findViewById(R.id.bfv);
        this.f18364b = (ProgressBar) findViewById(R.id.dby);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.a0d);
        this.f18365c = lottieAnimationView;
        lottieAnimationView.setImageAssetsFolder("like/bubble/images");
        this.f18365c.a(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10340);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LikeUserInfoAnimWidget.this.f18365c.setVisibility(4);
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1200);
        this.f18367f = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(10341);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f2;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f3 = 0.0f;
                if (intValue >= 0) {
                    if (intValue < 200) {
                        LikeUserInfoAnimWidget.this.f18364b.setAlpha(0.0f);
                        LikeUserInfoAnimWidget.this.f18363a.setScaleX(f3);
                        LikeUserInfoAnimWidget.this.f18363a.setScaleY(f3);
                    } else if (intValue >= 200 && intValue < 400) {
                        LikeUserInfoAnimWidget.this.f18364b.setAlpha((((float) intValue) * 0.005f) - 1.0f);
                        if (intValue >= 200 || intValue >= 450) {
                            if (intValue < 450 && intValue < 600) {
                                f2 = -0.0012666667f;
                            } else if (intValue >= 600 || intValue > 1200) {
                                f3 = 1.0f;
                                LikeUserInfoAnimWidget.this.f18363a.setScaleX(f3);
                                LikeUserInfoAnimWidget.this.f18363a.setScaleY(f3);
                            } else {
                                f2 = 6.6666704E-5f;
                            }
                            f3 = (((float) (intValue - 600)) * f2) + 0.96f;
                            LikeUserInfoAnimWidget.this.f18363a.setScaleX(f3);
                            LikeUserInfoAnimWidget.this.f18363a.setScaleY(f3);
                        }
                        f3 = 0.0046f * ((float) (intValue - 200));
                        LikeUserInfoAnimWidget.this.f18363a.setScaleX(f3);
                        LikeUserInfoAnimWidget.this.f18363a.setScaleY(f3);
                    }
                }
                LikeUserInfoAnimWidget.this.f18364b.setAlpha(1.0f);
                if (intValue >= 200) {
                }
                if (intValue < 450) {
                }
                if (intValue >= 600) {
                }
                f3 = 1.0f;
                LikeUserInfoAnimWidget.this.f18363a.setScaleX(f3);
                LikeUserInfoAnimWidget.this.f18363a.setScaleY(f3);
            }
        });
        this.f18367f.setDuration(1200L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18363a, "rotation", 0.0f, f18362e, 0.0f);
        this.f18368g = ofFloat;
        ofFloat.setDuration(200L);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f18363a, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)));
        this.f18369h = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.f18374m = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.375f, 1.15f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet = new AnimatorSet();
        this.f18373l = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.f18364b, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, this.f18363a.getAlpha()), Keyframe.ofFloat(0.5f, 0.0f))));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f18372k = animatorSet2;
        animatorSet2.setDuration(400L);
        this.o = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.5f), Keyframe.ofFloat(0.375f, 1.7f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(400L);
        this.f18366d = findViewById(R.id.egd);
        this.p = (ImageView) findViewById(R.id.egc);
        this.q = (TextView) findViewById(R.id.ege);
        this.s = new Property<View, Integer>(Integer.class, "width") {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.AnonymousClass3 */

            static {
                Covode.recordClassIndex(10342);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // android.util.Property
            public final /* synthetic */ Integer get(View view) {
                return Integer.valueOf(view.getLayoutParams().width);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Integer num) {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = num.intValue();
                view2.setLayoutParams(layoutParams);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(b bVar, int i2) {
        ObjectAnimator ofPropertyValuesHolder;
        ObjectAnimator ofPropertyValuesHolder2;
        ObjectAnimator ofPropertyValuesHolder3;
        ObjectAnimator ofPropertyValuesHolder4;
        if (bVar.o()) {
            if (i2 >= bVar.d()) {
                if (this.f18369h.isRunning()) {
                    this.f18369h.cancel();
                    View view = this.f18363a;
                    ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, view.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                    View view2 = this.f18363a;
                    ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, view2.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
                } else {
                    ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.f18363a, PropertyValuesHolder.ofKeyframe("scaleX", this.o));
                    ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this.f18363a, PropertyValuesHolder.ofKeyframe("scaleY", this.o));
                }
                this.n.playTogether(ofPropertyValuesHolder3, ofPropertyValuesHolder4, this.f18373l);
                this.n.start();
                AnimatorSet animatorSet = this.r;
                if (animatorSet != null) {
                    animatorSet.cancel();
                } else {
                    this.r = new AnimatorSet();
                }
                TextView textView = this.q;
                textView.setText(textView.getContext().getString(R.string.emd, h.a(i2)));
                this.f18366d.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this.f18366d, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.15384616f, 1.0f)), PropertyValuesHolder.ofKeyframe(this.s, Keyframe.ofInt(0.0f, y.a(36.0f)), Keyframe.ofInt(0.07692308f, y.a(36.0f)), Keyframe.ofInt(1.0f, this.f18366d.getMeasuredWidth())));
                ofPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
                ofPropertyValuesHolder5.setDuration(1300L);
                ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
                layoutParams.width = this.f18366d.getMeasuredWidth();
                this.q.setLayoutParams(layoutParams);
                ObjectAnimator ofPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(this.f18366d, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(this.s, Keyframe.ofInt(0.0f, this.f18366d.getMeasuredWidth()), Keyframe.ofInt(1.0f, y.a(36.0f))));
                ofPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
                ofPropertyValuesHolder6.setDuration(1000L);
                ofPropertyValuesHolder6.setStartDelay(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                this.r.playSequentially(ofPropertyValuesHolder5, ofPropertyValuesHolder6);
                this.r.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(10343);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        LikeUserInfoAnimWidget.this.f18366d.setVisibility(8);
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        LikeUserInfoAnimWidget.this.f18366d.setVisibility(0);
                    }
                });
                this.r.start();
            } else if (i2 >= bVar.c()) {
                if (this.f18367f.isRunning()) {
                    this.f18367f.cancel();
                    View view3 = this.f18363a;
                    ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view3, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, view3.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                    View view4 = this.f18363a;
                    ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view4, PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, view4.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
                } else {
                    ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f18363a, PropertyValuesHolder.ofKeyframe("scaleX", this.f18374m));
                    ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f18363a, PropertyValuesHolder.ofKeyframe("scaleY", this.f18374m));
                }
                this.f18372k.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, this.f18373l);
                this.f18372k.start();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        if (bVar.o()) {
            if (i3 >= bVar.d()) {
                if (this.f18371j != i2) {
                    this.f18371j = i2;
                    if (this.f18367f.isRunning()) {
                        this.f18364b.setProgress(100);
                        this.f18364b.setAlpha(1.0f);
                        this.f18367f.cancel();
                    }
                    this.f18369h.start();
                }
                this.f18368g.start();
                if (!this.f18365c.f5109b.g()) {
                    this.f18365c.setVisibility(0);
                    if (i3 == bVar.d()) {
                        this.f18365c.setAnimation("like/bubble/full_progress_bubbles.json");
                    } else {
                        this.f18365c.setAnimation("like/bubble/like_after_full_progress_bubbles.json");
                    }
                    this.f18365c.a();
                }
            } else if (i3 >= bVar.c()) {
                if (this.f18370i != i2) {
                    this.f18370i = i2;
                    this.f18367f.start();
                }
                this.f18368g.start();
                this.f18364b.setProgress((int) ((100.0f / ((float) (bVar.d() - bVar.c()))) * ((float) (i3 - bVar.c()))));
            }
        }
    }
}
