package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f85995a;

    /* renamed from: b  reason: collision with root package name */
    public int f85996b;

    /* renamed from: c  reason: collision with root package name */
    public int f85997c;

    /* renamed from: d  reason: collision with root package name */
    public long f85998d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f85999e;

    /* renamed from: f  reason: collision with root package name */
    public int f86000f;

    /* renamed from: g  reason: collision with root package name */
    public String f86001g;

    /* renamed from: h  reason: collision with root package name */
    public String f86002h;

    /* renamed from: i  reason: collision with root package name */
    public List<ImageView> f86003i;

    /* renamed from: j  reason: collision with root package name */
    public List<String> f86004j;

    /* renamed from: k  reason: collision with root package name */
    public List<String> f86005k;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f86006l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a f86007m;
    public com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b n;
    public String o;
    public boolean p;
    public boolean q;
    public b r;
    public c s;
    public View t;
    public int u;
    private com.ss.android.ugc.aweme.ecommerce.gallery.a.c v;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f86008a;

        /* renamed from: b  reason: collision with root package name */
        public int f86009b;

        /* renamed from: c  reason: collision with root package name */
        public int f86010c;

        /* renamed from: d  reason: collision with root package name */
        public long f86011d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f86012e;

        /* renamed from: f  reason: collision with root package name */
        public String f86013f;

        /* renamed from: g  reason: collision with root package name */
        public String f86014g;

        /* renamed from: h  reason: collision with root package name */
        public List<String> f86015h;

        /* renamed from: i  reason: collision with root package name */
        public List<String> f86016i;

        /* renamed from: j  reason: collision with root package name */
        public List<String> f86017j;

        /* renamed from: k  reason: collision with root package name */
        public com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a f86018k;

        /* renamed from: l  reason: collision with root package name */
        public com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b f86019l;

        /* renamed from: m  reason: collision with root package name */
        public String f86020m;
        public boolean n;
        public b o;
        public boolean p;
        public View q;
        public c r;

        static {
            Covode.recordClassIndex(53844);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(53845);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(53846);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(53843);
    }

    public final List<ImageView> a() {
        List<ImageView> list = this.f86003i;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final com.ss.android.ugc.aweme.ecommerce.gallery.a.c b() {
        if (this.v == null) {
            this.v = new com.ss.android.ugc.aweme.ecommerce.gallery.a.a();
        }
        return this.v;
    }

    public final Drawable a(Context context) {
        if (this.f85996b != 0) {
            return context.getResources().getDrawable(this.f85996b);
        }
        return null;
    }
}
