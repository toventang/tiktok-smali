package com.ss.android.ugc.aweme.feed.assem.base;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.assem.arch.b.i;
import com.bytedance.assem.arch.b.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public abstract class a<RECEIVER extends d> extends x<RECEIVER> implements i<VideoItemParams> {
    private SparseArray u;

    static {
        Covode.recordClassIndex(58043);
    }

    public View G() {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.u.put(R.id.dlk, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.b.i
    public void a() {
    }

    /* renamed from: a */
    public void b(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    /* renamed from: b */
    public boolean c(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams, List list) {
        l.d(videoItemParams, "");
    }
}
