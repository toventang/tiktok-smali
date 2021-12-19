package com.bytedance.android.livesdk.feed.banner;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f17280a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f17281b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f17282c;

    /* renamed from: d  reason: collision with root package name */
    public List<ImageView> f17283d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17284e;

    /* renamed from: f  reason: collision with root package name */
    public final View f17285f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f17286g;

    static {
        Covode.recordClassIndex(9591);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.List<android.widget.ImageView> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<android.widget.ImageView> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(View view, boolean z) {
        this.f17284e = z;
        this.f17285f = view;
        this.f17282c = (TextView) view.findViewById(R.id.dh5);
        this.f17280a = (ImageView) view.findViewById(R.id.dh0);
        this.f17281b = (ImageView) view.findViewById(R.id.dgv);
        ArrayList arrayList = new ArrayList(3);
        this.f17283d = arrayList;
        arrayList.add(view.findViewById(R.id.ox));
        this.f17283d.add(view.findViewById(R.id.oy));
        this.f17283d.add(view.findViewById(R.id.oz));
        if (z) {
            this.f17281b.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.lk);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.dgx);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.f17282c.setTextColor(view.getContext().getResources().getColor(R.color.x0));
            this.f17282c.setTextSize(TypedValue.applyDimension(2, 24.0f, view.getContext().getResources().getDisplayMetrics()));
            for (ImageView imageView3 : this.f17283d) {
                int a2 = (int) ap.a(view.getContext(), 54.0f);
                int a3 = (int) ap.a(imageView3.getContext(), 10.0f);
                int a4 = (int) ap.a(imageView3.getContext(), 3.0f);
                imageView3.getLayoutParams().height = a2;
                imageView3.getLayoutParams().width = a2;
                if (imageView3.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
                    layoutParams.topMargin = a4;
                    layoutParams.leftMargin = -((int) ap.a(view.getContext(), 8.0f));
                    imageView3.setLayoutParams(layoutParams);
                }
                imageView3.setPadding(imageView3.getPaddingLeft(), a3, imageView3.getRight(), a3);
            }
            this.f17286g = new int[]{2131234031, 2131234032, 2131234030};
            return;
        }
        this.f17286g = new int[]{2131234029, 2131234033, 2131234028};
    }
}
