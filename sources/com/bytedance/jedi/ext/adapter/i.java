package com.bytedance.jedi.ext.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.b.f;
import com.bytedance.jedi.ext.adapter.internal.c;
import com.bytedance.jedi.ext.adapter.internal.d;
import com.bytedance.jedi.ext.adapter.internal.h;
import com.bytedance.widget.Widget;
import h.f.b.l;
import java.util.List;

public final class i<VH extends JediViewHolder<? extends g, ?>> extends f<VH> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.jedi.ext.adapter.internal.f f39711a;

    /* renamed from: c  reason: collision with root package name */
    private final m f39712c;

    static {
        Covode.recordClassIndex(24469);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.f
    public final /* synthetic */ e a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        return new JediInvisibleViewHolder(viewGroup);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.f
    public final /* synthetic */ e a(e eVar) {
        JediViewHolder jediViewHolder = (JediViewHolder) eVar;
        l.c(jediViewHolder, "");
        JediViewHolder jediViewHolder2 = (JediViewHolder) super.a(jediViewHolder);
        m mVar = this.f39712c;
        l.c(mVar, "");
        jediViewHolder2.f39563b = mVar;
        com.bytedance.jedi.ext.adapter.internal.f fVar = this.f39711a;
        l.c(fVar, "");
        jediViewHolder2.f39564c = fVar;
        return jediViewHolder2;
    }

    @Override // com.bytedance.jedi.ext.adapter.b.f
    public final /* synthetic */ e a(int i2) {
        h hVar = this.f39680b.f39726c;
        Object obj = null;
        if (hVar == null) {
            return null;
        }
        List<RecyclerView.ViewHolder> list = hVar.a().get(i2);
        if (list != null && (!list.isEmpty())) {
            Object obj2 = (RecyclerView.ViewHolder) list.remove(list.size() - 1);
            if (obj2 instanceof Object) {
                obj = obj2;
            }
        }
        return (JediViewHolder) obj;
    }

    public i(m mVar) {
        c a2;
        d a3;
        l.c(mVar, "");
        this.f39712c = mVar;
        if (mVar instanceof Fragment) {
            Fragment fragment = (Fragment) mVar;
            l.c(fragment, "");
            a3 = d.a.a((androidx.fragment.app.e) null, fragment);
        } else if (mVar instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) mVar;
            l.c(eVar, "");
            a3 = d.a.a(eVar, (Fragment) null);
        } else if (mVar instanceof Widget) {
            Widget widget = (Widget) mVar;
            l.c(widget, "");
            androidx.lifecycle.i lifecycle = widget.getLifecycle();
            l.c(widget, "");
            Object b2 = widget.j().b();
            if (b2 instanceof Fragment) {
                a2 = c.a.a(null, (Fragment) b2);
            } else if (b2 instanceof androidx.fragment.app.e) {
                a2 = c.a.a((androidx.fragment.app.e) b2, null);
            } else {
                throw new IllegalStateException();
            }
            a3 = d.a.a(lifecycle, a2);
        } else if (mVar instanceof JediViewHolder) {
            throw new IllegalStateException("JediViewHolder:" + mVar + " is not support for now");
        } else {
            throw new IllegalStateException("owner:" + mVar + " is not in support list ([FragmentActivity, Fragment, Widget])");
        }
        this.f39711a = new com.bytedance.jedi.ext.adapter.internal.f(a3);
    }
}
