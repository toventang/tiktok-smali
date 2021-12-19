package com.ss.android.ugc.aweme.emoji.b;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class d<DATA> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(56037);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public void a(DATA data) {
    }

    public void a(DATA data, int i2) {
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.itemView.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.emoji.utils.k.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f89469a = 0.5f;

            static {
                Covode.recordClassIndex(56222);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    k.a(true, view, this.f89469a);
                } else if (action == 1 || action == 3) {
                    k.a(false, view, this.f89469a);
                }
                return false;
            }
        });
    }

    public d(View view) {
        super(view);
        a();
        b();
    }
}
