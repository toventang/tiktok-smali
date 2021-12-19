package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b;

public class a extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    protected int f100863a;

    /* renamed from: b  reason: collision with root package name */
    protected b.a f100864b;

    /* renamed from: c  reason: collision with root package name */
    protected final SparseArray<View> f100865c;

    static {
        Covode.recordClassIndex(64522);
    }

    public final int b() {
        return this.f100863a;
    }

    public final boolean a() {
        if (this.f100863a != -1) {
            return true;
        }
        return false;
    }

    public void setOnPanelChangeListener(b.a aVar) {
        this.f100864b = aVar;
    }

    public final void a(View view) {
        if (this.f100865c.get(1) == null) {
            this.f100865c.put(1, view);
            addView(view, new ViewGroup.LayoutParams(-1, -1));
            view.setVisibility(8);
        }
    }

    public void a(int i2) {
        if (this.f100863a != i2) {
            if (i2 == -1) {
                setVisibility(8);
                this.f100863a = i2;
                b.a aVar = this.f100864b;
                if (aVar != null) {
                    aVar.a(i2, null);
                    return;
                }
                return;
            }
            View view = this.f100865c.get(i2);
            if (view != null) {
                setVisibility(0);
                int size = this.f100865c.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int keyAt = this.f100865c.keyAt(i3);
                    if (keyAt != i2) {
                        this.f100865c.get(keyAt).setVisibility(8);
                    }
                }
                view.setVisibility(0);
                this.f100863a = i2;
                b.a aVar2 = this.f100864b;
                if (aVar2 != null) {
                    aVar2.a(i2, view);
                }
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public a(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5313);
        this.f100863a = -1;
        this.f100865c = new SparseArray<>();
        MethodCollector.o(5313);
    }
}
