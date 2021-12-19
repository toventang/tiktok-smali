package com.bytedance.android.livesdk.newvideogift;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.model.message.ch;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.android.livesdk.newvideogift.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public class VideoGiftView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f19855a;

    /* renamed from: b  reason: collision with root package name */
    View f19856b;

    /* renamed from: c  reason: collision with root package name */
    TextView f19857c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f19858d;

    /* renamed from: e  reason: collision with root package name */
    ch.a f19859e;

    /* renamed from: f  reason: collision with root package name */
    b f19860f;

    /* renamed from: g  reason: collision with root package name */
    Runnable f19861g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19862h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Object> f19863i = new HashMap();

    static {
        Covode.recordClassIndex(11765);
    }

    private int getResourceLayout() {
        return R.layout.bgc;
    }

    public final void b() {
        b bVar = this.f19860f;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f19861g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        b();
    }

    public final void a() {
        if (this.f19859e != null) {
            this.f19856b.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f19856b, "alpha", 0.0f, 0.0f).setDuration(this.f19859e.f19482d);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f19856b, "alpha", 0.0f, 1.0f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f19856b, "alpha", 1.0f, 1.0f).setDuration(this.f19859e.f19483e - 500);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f19856b, "alpha", 1.0f, 0.0f).setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2, duration3, duration4);
            animatorSet.start();
        }
    }

    public void setPortrait(boolean z) {
        this.f19862h = z;
    }

    /* access modifiers changed from: package-private */
    public void setTextEffect(ch chVar) {
        ch.a aVar;
        if (chVar != null) {
            if (this.f19862h) {
                aVar = chVar.f19477a;
            } else {
                aVar = chVar.f19478b;
            }
            this.f19859e = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(r rVar) {
        String str;
        this.f19863i.put("effect_id", Long.valueOf(rVar.f19674b));
        this.f19863i.put("gift_id", Long.valueOf(rVar.f19682j));
        this.f19863i.put("msg_id", Long.valueOf(rVar.f19673a));
        Map<String, Object> map = this.f19863i;
        if (rVar.f19679g != null) {
            str = String.valueOf(rVar.f19679g.getId());
        } else {
            str = "";
        }
        map.put("from_user_id", str);
        i.b().a("ttlive_gift", this.f19863i);
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8605);
        a.a(LayoutInflater.from(context), getResourceLayout(), this, true);
        this.f19855a = (FrameLayout) findViewById(R.id.fhs);
        this.f19856b = findViewById(R.id.eje);
        this.f19858d = (ImageView) findViewById(R.id.ejf);
        this.f19857c = (TextView) findViewById(R.id.ejg);
        this.f19863i.put("desc", "play large gift animation");
        MethodCollector.o(8605);
    }
}
