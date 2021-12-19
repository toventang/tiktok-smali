package com.ss.android.ugc.aweme.widgetcompat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import java.util.concurrent.Callable;

public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView.a f145066a;

    static {
        Covode.recordClassIndex(94858);
    }

    public WrapLinearLayoutManager() {
    }

    public WrapLinearLayoutManager(byte b2) {
        super(0, false);
    }

    public static void a(final RecyclerView.a aVar) {
        if (aVar != null) {
            i.b(new Callable<Void>() {
                /* class com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(94859);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        aVar.notifyDataSetChanged();
                        return null;
                    } catch (Exception e2) {
                        aVar.getClass().getName();
                        e.b(e2);
                        return null;
                    }
                }
            }, i.f4826c);
        }
    }

    private IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f145066a == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f145066a.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a aVar, RecyclerView.a aVar2) {
        super.a(aVar, aVar2);
        this.f145066a = aVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (IndexOutOfBoundsException e2) {
            if (this.f145066a != null) {
                this.f145066a.getClass().getName();
                e.b(a(e2));
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            if (this.f145066a != null) {
                this.f145066a.getClass().getName();
                if (this.f145066a != null) {
                    e = new IllegalArgumentException(this.f145066a.getClass().getName(), e);
                }
                e.b(e);
            }
        } catch (NullPointerException e4) {
            if (this.f145066a != null) {
                this.f145066a.getClass().getName();
                e.b(e4);
                a(this.f145066a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.a(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException e2) {
            if (this.f145066a == null) {
                return 0;
            }
            this.f145066a.getClass().getName();
            e.b(a(e2));
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.b(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException e2) {
            if (this.f145066a != null) {
                this.f145066a.getClass().getName();
                e.b(a(e2));
            }
            return 0;
        } catch (NullPointerException e3) {
            if (this.f145066a != null) {
                this.f145066a.getClass().getName();
                e.b(e3);
                a(this.f145066a);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final View a(View view, int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.a(view, i2, oVar, sVar);
        } catch (IndexOutOfBoundsException e2) {
            if (this.f145066a == null) {
                return null;
            }
            this.f145066a.getClass().getName();
            e.b(a(e2));
            return null;
        }
    }
}
