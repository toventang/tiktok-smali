package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class w extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public View f99933a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<View> f99934b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private Context f99935c;

    static {
        Covode.recordClassIndex(63689);
    }

    public static w a(Context context, View view) {
        return new w(context, view);
    }

    private w(Context context, View view) {
        super(view);
        this.f99935c = context;
        this.f99933a = view;
    }
}
