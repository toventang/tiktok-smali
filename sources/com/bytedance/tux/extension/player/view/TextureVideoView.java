package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.d;
import com.bytedance.tux.extension.player.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class TextureVideoView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f44987a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f44988b;

    static {
        Covode.recordClassIndex(27457);
    }

    private View a(int i2) {
        if (this.f44988b == null) {
            this.f44988b = new HashMap();
        }
        View view = (View) this.f44988b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f44988b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Bitmap getVideoFrame() {
        if (e.f44963a == d.PLAYER_IDLE) {
            return this.f44987a;
        }
        TextureView textureView = (TextureView) a(R.id.fh_);
        l.a((Object) textureView, "");
        return textureView.getBitmap();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.f44987a = bitmap;
        if (bitmap != null) {
            ((ImageView) a(R.id.agf)).setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TextureVideoView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(8949);
        a.a(LayoutInflater.from(getContext()), R.layout.bj4, this, true);
        MethodCollector.o(8949);
    }
}
