package com.bytedance.android.livesdk.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import f.a.b.a;

public abstract class b<T> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private final a f21771a = new a();
    public boolean z;

    static {
        Covode.recordClassIndex(12830);
    }

    public void a() {
        this.z = true;
    }

    public abstract void a(T t, int i2);

    public void b() {
        this.z = false;
    }

    public boolean c() {
        return false;
    }

    public void e() {
        this.f21771a.a();
    }

    public final void a(f.a.b.b bVar) {
        this.f21771a.a(bVar);
    }

    public b(View view) {
        super(view);
    }
}
