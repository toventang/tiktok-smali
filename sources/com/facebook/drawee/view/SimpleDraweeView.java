package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.drawee.c.b;
import com.facebook.drawee.c.g;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;
import com.zhiliaoapp.musically.R;

public class SimpleDraweeView extends d {
    private static k<? extends b> sDraweecontrollerbuildersupplier;
    private static g sIDraweecontrollerbuildersupplier;
    private b mControllerBuilder;

    static {
        Covode.recordClassIndex(28810);
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    /* access modifiers changed from: protected */
    public b getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public static void initialize(k<? extends b> kVar) {
        sDraweecontrollerbuildersupplier = kVar;
    }

    @Override // com.facebook.drawee.view.c
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public static void initialize(g gVar) {
        sIDraweecontrollerbuildersupplier = gVar;
    }

    public void setActualImageResource(int i2) {
        setActualImageResource(i2, null);
    }

    @Override // com.facebook.drawee.view.c
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(com.facebook.imagepipeline.o.b bVar) {
        b bVar2 = this.mControllerBuilder;
        bVar2.f47315c = bVar;
        bVar2.f47325m = getController();
        setController(bVar2.e());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public void setActualImageResource(int i2, Object obj) {
        setImageURI(com.facebook.common.k.g.a(i2), obj);
    }

    public void setImageURI(Uri uri, Object obj) {
        b bVar = this.mControllerBuilder;
        bVar.f47314b = obj;
        setController(bVar.b(uri).a(getController()).e());
    }

    public void setImageURI(String str, Object obj) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public SimpleDraweeView(Context context, a aVar) {
        super(context, aVar);
        init(context, null);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            com.facebook.imagepipeline.p.b.a();
            if (isInEditMode()) {
                ((a) getHierarchy()).a((e) null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                if (sDraweecontrollerbuildersupplier == null) {
                    i.a(sIDraweecontrollerbuildersupplier.a(), "SimpleDraweeView was not initialized!");
                    sDraweecontrollerbuildersupplier = sIDraweecontrollerbuildersupplier.a();
                }
                this.mControllerBuilder = (b) sDraweecontrollerbuildersupplier.b();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hu, R.attr.hv, R.attr.hw, R.attr.je, R.attr.ts, R.attr.tu, R.attr.tv, R.attr.a6o, R.attr.a7g, R.attr.a7h, R.attr.a7q, R.attr.a7u, R.attr.a7v, R.attr.a7w, R.attr.a9r, R.attr.a9s, R.attr.a_q, R.attr.a_r, R.attr.a_s, R.attr.a_t, R.attr.a_u, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.a_z, R.attr.aa0, R.attr.aa8, R.attr.aa_, R.attr.aaa, R.attr.aab, R.attr.at1});
                try {
                    if (obtainStyledAttributes.hasValue(2)) {
                        setImageURI(Uri.parse(obtainStyledAttributes.getString(2)), (Object) null);
                    } else if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
            com.facebook.imagepipeline.p.b.a();
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(context, attributeSet);
    }
}
