package com.ss.android.ugc.aweme.dsp.widget.a;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f84054b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f84055a;

    /* renamed from: c  reason: collision with root package name */
    private TextureView f84056c;

    static {
        Covode.recordClassIndex(52408);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52409);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final TextureView getTextureView() {
        return this.f84056c;
    }

    public final void setTextureView(TextureView textureView) {
        this.f84056c = textureView;
    }

    public final void setDisplayMode(int i2) {
        a aVar = this.f84055a;
        aVar.f84047c = i2;
        aVar.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        l.d(surfaceTextureListener, "");
        TextureView textureView = this.f84056c;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private c(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4345);
        a aVar = new a();
        this.f84055a = aVar;
        TextureView textureView = new TextureView(context);
        this.f84056c = textureView;
        addView(textureView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        aVar.f84048d = this;
        aVar.a();
        aVar.f84049e = this.f84056c;
        aVar.a();
        MethodCollector.o(4345);
    }

    public final void a(int i2, int i3) {
        String.valueOf("onPrepared, width:" + i2 + ", height:" + i3);
        this.f84055a.a(i2, i3);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        String.valueOf("onSizeChanged, w:" + i2 + ", h:" + i3 + ", oldW:" + i4 + ", oldH:" + i5);
        this.f84055a.a();
    }
}
