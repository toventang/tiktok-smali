package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.like.b;
import com.bytedance.android.livesdk.like.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.au;

public class UserInfoLikeHelper implements d, au {

    /* renamed from: a  reason: collision with root package name */
    private ObjectAnimator f21956a;

    /* renamed from: b  reason: collision with root package name */
    private ObjectAnimator f21957b;

    /* renamed from: c  reason: collision with root package name */
    private int f21958c;

    /* renamed from: d  reason: collision with root package name */
    private int f21959d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f21960e;

    /* renamed from: f  reason: collision with root package name */
    private View f21961f;

    static {
        Covode.recordClassIndex(12923);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f21956a.cancel();
        this.f21957b.cancel();
        ObjectAnimator objectAnimator = this.f21960e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f21961f.setAlpha(1.0f);
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(b bVar, int i2) {
        if (i2 >= bVar.c()) {
            if (this.f21957b.isRunning()) {
                this.f21957b.cancel();
            }
            View view = this.f21961f;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.5f, view.getAlpha()), Keyframe.ofFloat(1.0f, 1.0f)));
            this.f21960e = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setStartDelay(200);
            this.f21960e.setDuration(200L);
            this.f21960e.start();
        }
    }

    public UserInfoLikeHelper(m mVar, final ImageView imageView, TextView textView) {
        mVar.getLifecycle().a(this);
        this.f21961f = textView;
        textView.setAlpha(1.0f);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (!(room == null || room.getOwner() == null)) {
            g.a(new z(imageView, room));
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.5f), Keyframe.ofFloat(0.5f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        this.f21956a = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(1000L);
        this.f21956a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f21956a.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.userinfowidget.UserInfoLikeHelper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12924);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                imageView.setScaleX(0.0f);
                imageView.setScaleY(0.0f);
                imageView.setAlpha(0.5f);
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        this.f21957b = ofFloat;
        ofFloat.setDuration(200L);
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        if (i3 >= bVar.d()) {
            if (this.f21959d != i2) {
                this.f21959d = i2;
                if (this.f21957b.isRunning()) {
                    this.f21957b.cancel();
                    this.f21961f.setAlpha(0.0f);
                }
            }
        } else if (i3 >= bVar.c()) {
            if (this.f21958c != i2) {
                this.f21958c = i2;
                this.f21957b.start();
            }
        } else if (!this.f21956a.isRunning()) {
            this.f21956a.start();
        }
    }
}
