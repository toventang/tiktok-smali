package com.google.android.material.a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

public final class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f52135a = new Matrix();

    static {
        Covode.recordClassIndex(32415);
    }

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ Matrix get(ImageView imageView) {
        this.f52135a.set(imageView.getImageMatrix());
        return this.f52135a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
