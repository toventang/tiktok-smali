package com.ss.android.ugc.aweme.account.login.v2.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f65082a = i.a((h.f.a.a) b.f65085a);

    static {
        Covode.recordClassIndex(39999);
    }

    private final List<a> a() {
        return (List) this.f65082a.getValue();
    }

    static final class b extends h.f.b.m implements h.f.a.a<List<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65085a = new b();

        static {
            Covode.recordClassIndex(40001);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<a> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return a().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return a().get(i2).f65084b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(androidx.fragment.app.i iVar) {
        super(iVar);
        h.f.b.l.d(iVar, "");
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        return a().get(i2).f65083a;
    }

    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        if (!a().contains(aVar)) {
            a().add(aVar);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Fragment f65083a;

        /* renamed from: b  reason: collision with root package name */
        public final String f65084b;

        static {
            Covode.recordClassIndex(40000);
        }

        public a(Fragment fragment, String str) {
            h.f.b.l.d(fragment, "");
            h.f.b.l.d(str, "");
            this.f65083a = fragment;
            this.f65084b = str;
        }
    }
}
