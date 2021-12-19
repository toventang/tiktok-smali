package com.bytedance.jedi.ext.adapter.b;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.List;

public abstract class e<ITEM> extends RecyclerView.ViewHolder {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ i[] f39673h = {new y(ab.a(e.class), "itemViewMap", "getItemViewMap$ext_adapter_release()Landroid/util/SparseArray;")};

    /* renamed from: a  reason: collision with root package name */
    private final h f39674a = h.i.a((h.f.a.a) a.f39678a);

    /* renamed from: b  reason: collision with root package name */
    private ITEM f39675b;

    /* renamed from: i  reason: collision with root package name */
    public int f39676i;

    public void aq_() {
    }

    public abstract void b(ITEM item);

    public void bW_() {
    }

    static final class a extends m implements h.f.a.a<SparseArray<View>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39678a = new a();

        static {
            Covode.recordClassIndex(24445);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SparseArray<View> invoke() {
            return new SparseArray();
        }
    }

    public final ITEM aI_() {
        ITEM item = this.f39675b;
        if (item == null) {
            l.a();
        }
        return item;
    }

    static {
        Covode.recordClassIndex(24443);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        l.c(view, "");
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.bytedance.jedi.ext.adapter.b.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f39677a;

            static {
                Covode.recordClassIndex(24444);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f39677a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f39677a.aq_();
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f39677a.bW_();
            }
        });
    }

    public void b(ITEM item, int i2, List<Object> list) {
        this.f39676i = i2;
        this.f39675b = item;
        b(item);
    }
}
