package com.ss.android.ugc.aweme.comment.i;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f71979a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f71980b;

    /* renamed from: c  reason: collision with root package name */
    public String f71981c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f71982d;

    static {
        Covode.recordClassIndex(44235);
    }

    private b() {
        this.f71981c = "";
        this.f71982d = 0;
    }

    public final ViewGroup a() {
        ViewGroup viewGroup = this.f71979a;
        if (viewGroup == null) {
            l.a("barrageContainer");
        }
        return viewGroup;
    }

    public final Fragment b() {
        Fragment fragment = this.f71980b;
        if (fragment == null) {
            l.a("fragment");
        }
        return fragment;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f71983a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f71984b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f71985c;

        /* renamed from: d  reason: collision with root package name */
        public final Fragment f71986d;

        static {
            Covode.recordClassIndex(44236);
        }

        public a(ViewGroup viewGroup, Fragment fragment) {
            l.d(viewGroup, "");
            l.d(fragment, "");
            this.f71985c = viewGroup;
            this.f71986d = fragment;
        }
    }
}
