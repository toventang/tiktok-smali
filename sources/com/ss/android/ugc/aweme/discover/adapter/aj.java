package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.d.a;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.j.m;
import com.ss.android.ugc.aweme.discover.j.q;
import com.ss.android.ugc.aweme.discover.jedi.b;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.discover.ui.av;
import com.ss.android.ugc.aweme.discover.ui.ax;
import com.ss.android.ugc.aweme.discover.ui.v;
import com.ss.android.ugc.aweme.discover.ui.x;
import com.ss.android.ugc.aweme.discover.ui.y;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.l.k;
import com.ss.android.ugc.aweme.search.l.p;
import com.ss.android.ugc.aweme.search.model.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aj<T extends Fragment> extends k<T> {

    /* renamed from: b  reason: collision with root package name */
    public d f80368b;

    /* renamed from: c  reason: collision with root package name */
    public T f80369c;

    /* renamed from: f  reason: collision with root package name */
    private Context f80370f;

    static {
        Covode.recordClassIndex(50024);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == j.f121154b) {
            return this.f80370f.getString(R.string.d5f);
        }
        if (i2 == j.f121155c) {
            return this.f80370f.getString(R.string.h8g);
        }
        if (i2 == j.f121157e) {
            return this.f80370f.getString(R.string.dcu);
        }
        if (i2 == j.f121158f) {
            return this.f80370f.getString(R.string.fy9);
        }
        if (i2 == j.f121159g) {
            return this.f80370f.getString(R.string.aam);
        }
        if (i2 == j.f121156d) {
            return this.f80370f.getString(R.string.fhm);
        }
        if (i2 == j.f121160h) {
            return this.f80370f.getString(R.string.ef6);
        }
        return super.getPageTitle(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.adapter.k
    public final Fragment d(int i2) {
        am qVar;
        String str = "";
        if (i2 == j.f121154b) {
            Context context = this.f80370f;
            if (context instanceof com.ss.android.ugc.aweme.d.d) {
                com.ss.android.ugc.aweme.d.d dVar = (com.ss.android.ugc.aweme.d.d) context;
                l.d(dVar, str);
                a.f79330a.post(new p(dVar));
            }
        }
        d dVar2 = this.f80368b;
        if (i2 == j.f121154b) {
            qVar = (am) k.INSTANCE.computeIfAbsent(b.class, ax.f82348a);
        } else if (i2 == j.f121155c) {
            qVar = new q();
        } else if (i2 == j.f121157e) {
            if (h.a()) {
                qVar = new x();
            } else {
                qVar = new m();
            }
        } else if (i2 == j.f121158f) {
            qVar = new y();
        } else if (i2 == j.f121159g) {
            qVar = new com.ss.android.ugc.aweme.discover.j.h();
        } else if (i2 == j.f121156d) {
            qVar = new com.ss.android.ugc.aweme.discover.j.k();
        } else if (i2 == j.f121160h) {
            qVar = new v();
        } else {
            qVar = new q();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(av.G, dVar2);
        qVar.setArguments(bundle);
        qVar.B = i2;
        qVar.q.setTabIndex(i2);
        com.ss.android.ugc.aweme.search.n.h hVar = qVar.q;
        if (i2 == j.f121154b) {
            str = "general";
        } else if (i2 == j.f121156d) {
            str = "video";
        } else if (i2 == j.f121155c) {
            str = "user";
        } else if (i2 == j.f121157e) {
            str = "music";
        } else if (i2 == j.f121159g) {
            str = "challenge";
        }
        hVar.setSearchPosition(str);
        return qVar;
    }

    public aj(i iVar, Context context, int i2) {
        super(iVar, i2);
        this.f80370f = context;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.a, androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.lego.c.b
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f80369c = (T) ((Fragment) obj);
        super.setPrimaryItem(viewGroup, i2, obj);
    }
}
