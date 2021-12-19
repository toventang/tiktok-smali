package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableFrameLayout;
import com.bytedance.android.livesdk.livesetting.rank.RankComboColorSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class ComboView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f22470a;

    static {
        Covode.recordClassIndex(13264);
    }

    public ComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f22470a == null) {
            this.f22470a = new HashMap();
        }
        View view = (View) this.f22470a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f22470a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void a(ImageModel imageModel, int i2) {
        l.d(imageModel, "");
        p.a((ImageView) a(R.id.a9e), imageModel, 0);
        LiveTextView liveTextView = (LiveTextView) a(R.id.a98);
        l.b(liveTextView, "");
        liveTextView.setText(y.a((int) R.string.dt6, Integer.valueOf(i2)));
        ((ShapeControllableFrameLayout) a(R.id.a9f)).setBackgroundColor(Color.parseColor(RankComboColorSetting.INSTANCE.getValue()));
    }

    private /* synthetic */ ComboView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10799);
        LayoutInflater.from(context).inflate(R.layout.bbf, this);
        MethodCollector.o(10799);
    }
}
