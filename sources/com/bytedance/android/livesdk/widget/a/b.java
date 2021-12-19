package com.bytedance.android.livesdk.widget.a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.i f22566a;

    /* renamed from: b  reason: collision with root package name */
    final Rect f22567b;

    /* renamed from: c  reason: collision with root package name */
    private int f22568c;

    static {
        Covode.recordClassIndex(13304);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public static b a(RecyclerView.i iVar) {
        return new b(iVar) {
            /* class com.bytedance.android.livesdk.widget.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13305);
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int a() {
                return this.f22566a.t();
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int b() {
                return this.f22566a.J;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int c() {
                return (this.f22566a.J - this.f22566a.t()) - this.f22566a.v();
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int a(View view) {
                return RecyclerView.i.o(view) - ((RecyclerView.j) view.getLayoutParams()).leftMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int b(View view) {
                return RecyclerView.i.q(view) + ((RecyclerView.j) view.getLayoutParams()).rightMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int c(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.m(view) + jVar.leftMargin + jVar.rightMargin;
            }
        };
    }

    public static b b(RecyclerView.i iVar) {
        return new b(iVar) {
            /* class com.bytedance.android.livesdk.widget.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(13306);
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int a() {
                return this.f22566a.u();
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int b() {
                return this.f22566a.K;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int c() {
                return (this.f22566a.K - this.f22566a.u()) - this.f22566a.w();
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int a(View view) {
                return RecyclerView.i.p(view) - ((RecyclerView.j) view.getLayoutParams()).topMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int b(View view) {
                return RecyclerView.i.r(view) + ((RecyclerView.j) view.getLayoutParams()).bottomMargin;
            }

            @Override // com.bytedance.android.livesdk.widget.a.b
            public final int c(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.n(view) + jVar.topMargin + jVar.bottomMargin;
            }
        };
    }

    private b(RecyclerView.i iVar) {
        this.f22568c = Integer.MIN_VALUE;
        this.f22567b = new Rect();
        this.f22566a = iVar;
    }

    /* synthetic */ b(RecyclerView.i iVar, byte b2) {
        this(iVar);
    }
}
