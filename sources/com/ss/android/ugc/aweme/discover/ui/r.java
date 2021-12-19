package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class r extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final a f82633d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<l> f82634a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f82635b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final Context f82636c;

    /* renamed from: e  reason: collision with root package name */
    private int f82637e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f82638f = -1;

    static {
        Covode.recordClassIndex(51460);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51461);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final l a() {
        return b(this.f82638f);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f82634a.size();
    }

    public final void b() {
        if (this.f82638f < 0) {
            c(0);
        }
        l b2 = b(this.f82638f);
        if (b2 != null) {
            a(b2, true);
        }
    }

    public final void c(int i2) {
        this.f82637e = this.f82638f;
        this.f82638f = i2;
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        l b2 = b(i2);
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    public final l b(int i2) {
        return this.f82634a.get(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        l b2 = b(i2);
        if (b2 == null) {
            l.b();
        }
        if (b2.b() != 0) {
            Context context = this.f82636c;
            l b3 = b(i2);
            if (b3 == null) {
                l.b();
            }
            String string = context.getString(b3.b());
            l.b(string, "");
            return string;
        }
        l b4 = b(i2);
        if (b4 == null) {
            l.b();
        }
        return String.valueOf(b4.f82600b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, i iVar) {
        super(iVar);
        l.d(context, "");
        l.d(iVar, "");
        this.f82636c = context;
    }

    public final void a(l lVar, boolean z) {
        String str;
        l.d(lVar, "");
        String c2 = lVar.c();
        if (z) {
            com.ss.android.ugc.aweme.discover.mob.a.a(c2, "default_landing_page", "default_landing_page");
            return;
        }
        l b2 = b(this.f82637e);
        if (b2 != null) {
            String c3 = b2.c();
            if (this.f82638f == this.f82635b) {
                str = "click";
            } else {
                this.f82635b = -1;
                str = "slide";
            }
            com.ss.android.ugc.aweme.discover.mob.a.a(c2, c3, str);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
        this.f82634a.remove(i2);
        notifyDataSetChanged();
    }
}
