package com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.utils.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f34725a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f34726b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f34727c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f34728d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f34729e;

    /* renamed from: f  reason: collision with root package name */
    public AwemeRawAd f34730f;

    /* renamed from: g  reason: collision with root package name */
    public AwemeSearchAdModel f34731g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f34732h;

    /* renamed from: i  reason: collision with root package name */
    public int f34733i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f34734j;

    static {
        Covode.recordClassIndex(20820);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public abstract void a(int i2, int i3);

    public abstract boolean a();

    public abstract int getLayoutId$commercialize_search_impl_release();

    public abstract void setTransformButtonVisibility$commercialize_search_impl_release(int i2);

    public final ImageView getArrow$commercialize_search_impl_release() {
        return this.f34727c;
    }

    public final int getDefaultBackgroundColor() {
        return this.f34733i;
    }

    public final AwemeSearchAdModel getMAmemeSearchAdInfo$commercialize_search_impl_release() {
        return this.f34731g;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_search_impl_release() {
        return this.f34730f;
    }

    private final float getColorChangeMillSeconds() {
        float f2;
        AwemeSearchAdModel awemeSearchAdModel = this.f34731g;
        if (awemeSearchAdModel != null) {
            f2 = awemeSearchAdModel.getButtonColorShowSeconds();
        } else {
            f2 = 0.0f;
        }
        return f2 * 1000.0f;
    }

    private final float getShowMillSeconds() {
        float f2;
        AwemeSearchAdModel awemeSearchAdModel = this.f34731g;
        if (awemeSearchAdModel != null) {
            f2 = awemeSearchAdModel.getShowButtonSeconds();
        } else {
            f2 = 0.0f;
        }
        return f2 * 1000.0f;
    }

    public final int getBackGroundColor() {
        int i2 = this.f34733i;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i2;
    }

    public final String getBgColor() {
        String searchAdTransformButtonColor;
        AwemeSearchAdModel awemeSearchAdModel = this.f34731g;
        if (awemeSearchAdModel == null || (searchAdTransformButtonColor = awemeSearchAdModel.getSearchAdTransformButtonColor()) == null || searchAdTransformButtonColor.length() <= 0) {
            return getResources().getString(R.color.bh);
        }
        return searchAdTransformButtonColor;
    }

    public final String getTransformButtonText() {
        String searchAdTransformButtonText;
        AwemeSearchAdModel awemeSearchAdModel = this.f34731g;
        if (awemeSearchAdModel == null || (searchAdTransformButtonText = awemeSearchAdModel.getSearchAdTransformButtonText()) == null || searchAdTransformButtonText.length() <= 0) {
            return "";
        }
        return searchAdTransformButtonText;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a$a  reason: collision with other inner class name */
    public static final class RunnableC0784a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34735a;

        static {
            Covode.recordClassIndex(20821);
        }

        public RunnableC0784a(a aVar) {
            this.f34735a = aVar;
        }

        public final void run() {
            a aVar = this.f34735a;
            aVar.a(Color.parseColor(aVar.getBgColor()), 300);
            this.f34735a.animate().alpha(1.0f).setDuration(150).start();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34736a;

        static {
            Covode.recordClassIndex(20822);
        }

        public b(a aVar) {
            this.f34736a = aVar;
        }

        public final void run() {
            a aVar = this.f34736a;
            if (aVar != null) {
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                int i2 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
                if (i2 < 0) {
                    ValueAnimator a2 = j.a(aVar, i2, 22, 300);
                    l.b(a2, "");
                    a2.start();
                }
            }
        }
    }

    public final void setArrow$commercialize_search_impl_release(ImageView imageView) {
        this.f34727c = imageView;
    }

    public final void setDefaultBackgroundColor(int i2) {
        this.f34733i = i2;
    }

    public final void setMAmemeSearchAdInfo$commercialize_search_impl_release(AwemeSearchAdModel awemeSearchAdModel) {
        this.f34731g = awemeSearchAdModel;
    }

    public final void setMAwemeRawAd$commercialize_search_impl_release(AwemeRawAd awemeRawAd) {
        this.f34730f = awemeRawAd;
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f34734j = context;
    }
}
