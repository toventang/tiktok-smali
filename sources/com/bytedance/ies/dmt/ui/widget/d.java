package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class d {

    /* renamed from: a  reason: collision with root package name */
    int f33635a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable f33636b;

    /* renamed from: c  reason: collision with root package name */
    int f33637c;

    /* renamed from: d  reason: collision with root package name */
    int f33638d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f33639e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f33640f;

    /* renamed from: g  reason: collision with root package name */
    public a f33641g;

    /* renamed from: h  reason: collision with root package name */
    public int f33642h;

    /* renamed from: i  reason: collision with root package name */
    public String f33643i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f33644j;

    /* renamed from: k  reason: collision with root package name */
    public String f33645k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f33646l;

    /* renamed from: m  reason: collision with root package name */
    int f33647m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    boolean v;
    public int w;

    static {
        Covode.recordClassIndex(20028);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d f33648a = new d();

        /* renamed from: b  reason: collision with root package name */
        private Context f33649b;

        static {
            Covode.recordClassIndex(20029);
        }

        public final a a() {
            this.f33648a.r = true;
            return this;
        }

        public final a d(int i2) {
            this.f33648a.w = i2;
            return this;
        }

        public final a a(String str) {
            this.f33648a.f33639e = str;
            this.f33648a.o = true;
            return this;
        }

        public final a b(String str) {
            this.f33648a.f33640f = str;
            this.f33648a.p = true;
            return this;
        }

        public final a c(int i2) {
            this.f33648a.f33640f = this.f33649b.getString(i2);
            this.f33648a.p = true;
            return this;
        }

        public a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f33649b = applicationContext;
        }

        public final a a(int i2) {
            this.f33648a.f33635a = i2;
            this.f33648a.f33636b = this.f33649b.getResources().getDrawable(i2);
            this.f33648a.n = true;
            return this;
        }

        public final a b(int i2) {
            this.f33648a.f33639e = this.f33649b.getString(i2);
            if (!TextUtils.isEmpty(this.f33648a.f33639e)) {
                this.f33648a.o = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        public final a a(a aVar, View.OnClickListener onClickListener) {
            this.f33648a.f33641g = aVar;
            this.f33648a.f33642h = 1962999813;
            this.f33648a.f33643i = this.f33649b.getString(1963196433);
            this.f33648a.f33644j = onClickListener;
            this.f33648a.t = true;
            this.f33648a.s = true;
            return this;
        }

        public final a a(int i2, int i3, int i4) {
            this.f33648a.f33635a = i2;
            this.f33648a.f33636b = this.f33649b.getResources().getDrawable(i2);
            this.f33648a.n = true;
            this.f33648a.f33637c = i3;
            this.f33648a.f33638d = i4;
            return this;
        }

        public final a a(a aVar, int i2, View.OnClickListener onClickListener) {
            this.f33648a.f33641g = aVar;
            this.f33648a.f33643i = this.f33649b.getString(i2);
            this.f33648a.f33644j = onClickListener;
            this.f33648a.s = true;
            return this;
        }
    }
}
