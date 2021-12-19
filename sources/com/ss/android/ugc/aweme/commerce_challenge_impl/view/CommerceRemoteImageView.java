package com.ss.android.ugc.aweme.commerce_challenge_impl.view;

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

public class CommerceRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    private final d f73581a;

    static {
        Covode.recordClassIndex(45279);
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
                /* class com.ss.android.ugc.aweme.commerce_challenge_impl.view.CommerceRemoteImageView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(45281);
                }

                public final void getOutline(View view, Outline outline) {
                    float aspectRatio = CommerceRemoteImageView.this.getAspectRatio();
                    float height = (float) CommerceRemoteImageView.this.getHeight();
                    float width = (float) CommerceRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f2 = height * aspectRatio;
                        float f3 = (width - f2) / 2.0f;
                        outline.setRoundRect((int) f3, 0, (int) (f3 + f2), CommerceRemoteImageView.this.getBottom(), n.b(CommerceRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    /* access modifiers changed from: package-private */
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

    public final void b(f fVar) {
        if (Build.VERSION.SDK_INT < 21) {
            getLayoutParams().height = (getLayoutParams().width * fVar.getHeight()) / fVar.getWidth();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public CommerceRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    public void setImageURI(Uri uri, Object obj) {
        e eVar = (e) getControllerBuilder();
        eVar.f47319g = this.f73581a;
        eVar.f47314b = obj;
        e a2 = eVar.b(uri);
        a2.f47325m = getController();
        setController(a2.e());
    }

    private CommerceRemoteImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f73581a = new c<f>() {
            /* class com.ss.android.ugc.aweme.commerce_challenge_impl.view.CommerceRemoteImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(45280);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                CommerceRemoteImageView.this.a(fVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                CommerceRemoteImageView.this.a(fVar);
            }
        };
    }
}
