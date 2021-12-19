package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;

public class MediaGrid extends SquareFrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public SimpleDraweeView f156505a = ((SimpleDraweeView) findViewById(R.id.cl8));

    /* renamed from: b  reason: collision with root package name */
    public CheckView f156506b = ((CheckView) findViewById(R.id.a59));

    /* renamed from: c  reason: collision with root package name */
    public ImageView f156507c = ((ImageView) findViewById(R.id.bak));

    /* renamed from: d  reason: collision with root package name */
    public TextView f156508d = ((TextView) findViewById(R.id.fg0));

    /* renamed from: e  reason: collision with root package name */
    public Item f156509e;

    /* renamed from: f  reason: collision with root package name */
    public b f156510f;

    /* renamed from: g  reason: collision with root package name */
    private a f156511g;

    public interface a {
        static {
            Covode.recordClassIndex(103918);
        }

        void a(Item item, RecyclerView.ViewHolder viewHolder);

        void b(Item item, RecyclerView.ViewHolder viewHolder);
    }

    static {
        Covode.recordClassIndex(103917);
    }

    public Item getMedia() {
        return this.f156509e;
    }

    public void setOnMediaGridClickListener(a aVar) {
        this.f156511g = aVar;
    }

    public void setCheckEnabled(boolean z) {
        this.f156506b.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.f156506b.setChecked(z);
    }

    public void setCheckedNum(int i2) {
        this.f156506b.setCheckedNum(i2);
    }

    public void onClick(View view) {
        a aVar = this.f156511g;
        if (aVar == null) {
            return;
        }
        if (view == this.f156505a) {
            aVar.a(this.f156509e, this.f156510f.f156515d);
        } else if (view == this.f156506b) {
            aVar.b(this.f156509e, this.f156510f.f156515d);
        }
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        com.a.a(LayoutInflater.from(context), R.layout.akb, this, true);
        this.f156505a.setOnClickListener(this);
        this.f156506b.setOnClickListener(this);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f156512a;

        /* renamed from: b  reason: collision with root package name */
        Drawable f156513b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f156514c;

        /* renamed from: d  reason: collision with root package name */
        RecyclerView.ViewHolder f156515d;

        static {
            Covode.recordClassIndex(103919);
        }

        public b(int i2, Drawable drawable, boolean z, RecyclerView.ViewHolder viewHolder) {
            this.f156512a = i2;
            this.f156513b = drawable;
            this.f156514c = z;
            this.f156515d = viewHolder;
        }
    }
}
