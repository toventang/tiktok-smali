package com.bytedance.android.ecommerce.ocr.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class OcrTitleView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f7268a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f7269b;

    static {
        Covode.recordClassIndex(3487);
    }

    public void setFlashLightClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f7269b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setTorch(boolean z) {
        int i2;
        ImageView imageView = this.f7269b;
        if (z) {
            i2 = R.drawable.b1z;
        } else {
            i2 = R.drawable.b1y;
        }
        imageView.setBackgroundResource(i2);
    }

    public OcrTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        MethodCollector.i(6306);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b3t, this);
        this.f7268a = (ImageView) inflate.findViewById(R.id.evy);
        this.f7269b = (ImageView) inflate.findViewById(R.id.f1v);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.jb, R.attr.ma, R.attr.mb, R.attr.u7});
            if (obtainStyledAttributes.getBoolean(1, true) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                this.f7268a.setBackgroundResource(resourceId);
            }
            if (obtainStyledAttributes.getBoolean(2, true)) {
                this.f7269b.setBackgroundResource(R.drawable.b1y);
            }
            obtainStyledAttributes.recycle();
        }
        this.f7268a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.ocr.view.OcrTitleView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3488);
            }

            public final void onClick(View view) {
                Context context = OcrTitleView.this.getContext();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        });
        MethodCollector.o(6306);
    }
}
