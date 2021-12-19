package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.lancet.k;

public class WrapContentRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    private final d f144589a;

    static {
        Covode.recordClassIndex(94613);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public final void a() {
        super.a();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.views.WrapContentRemoteImageView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(94615);
                }

                public final void getOutline(View view, Outline outline) {
                    float aspectRatio = WrapContentRemoteImageView.this.getAspectRatio();
                    float height = (float) WrapContentRemoteImageView.this.getHeight();
                    float width = (float) WrapContentRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f2 = height * aspectRatio;
                        float f3 = (width - f2) / 2.0f;
                        outline.setRoundRect((int) f3, 0, (int) (f3 + f2), WrapContentRemoteImageView.this.getBottom(), n.b(WrapContentRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    public final void a(f fVar) {
        if (Build.VERSION.SDK_INT < 21) {
            getLayoutParams().width = (getLayoutParams().height * fVar.getWidth()) / fVar.getHeight();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    public void setImageURI(Uri uri, Object obj) {
        e eVar = (e) getControllerBuilder();
        eVar.f47319g = this.f144589a;
        eVar.f47314b = obj;
        e a2 = eVar.b(uri);
        a2.f47325m = getController();
        setController(a2.e());
    }

    public final void a(String str, d<f> dVar) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        e eVar = (e) getControllerBuilder();
        eVar.f47319g = dVar;
        eVar.f47314b = null;
        e a2 = eVar.b(uri);
        a2.f47325m = getController();
        setController(a2.e());
    }

    private WrapContentRemoteImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f144589a = new c<f>() {
            /* class com.ss.android.ugc.aweme.views.WrapContentRemoteImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94614);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                WrapContentRemoteImageView.this.a(fVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                WrapContentRemoteImageView.this.a(fVar);
            }
        };
    }
}
