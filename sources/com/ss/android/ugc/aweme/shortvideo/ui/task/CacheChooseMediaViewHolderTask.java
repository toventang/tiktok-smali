package com.ss.android.ugc.aweme.shortvideo.ui.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CacheChooseMediaViewHolderTask implements au, a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f131907a;

    static {
        Covode.recordClassIndex(86422);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        k.f129142a.clear();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        MethodCollector.i(9808);
        String.valueOf(System.currentTimeMillis() - System.currentTimeMillis());
        int a2 = b.a().a(true, "creative_tools_mt_album_optimization_v2_cache_viewholder", 0);
        if (a2 != 0) {
            Context context = this.f131907a;
            l.d(context, "");
            k.f129143b = a2;
            LayoutInflater from = LayoutInflater.from(context);
            for (int i2 = 0; i2 < a2; i2++) {
                System.currentTimeMillis();
                k.f129142a.add(new MvImageChooseAdapter.e(from.inflate(R.layout.a8z, (ViewGroup) null)));
                System.currentTimeMillis();
            }
        }
        MethodCollector.o(9808);
    }

    public CacheChooseMediaViewHolderTask(Context context, i iVar) {
        l.d(context, "");
        l.d(iVar, "");
        this.f131907a = context;
        iVar.a(this);
    }
}
