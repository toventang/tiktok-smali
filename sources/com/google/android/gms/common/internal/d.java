package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Account f50382a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f50383b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f50384c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<com.google.android.gms.common.api.a<?>, b> f50385d;

    /* renamed from: e  reason: collision with root package name */
    public final int f50386e;

    /* renamed from: f  reason: collision with root package name */
    public final View f50387f;

    /* renamed from: g  reason: collision with root package name */
    public final String f50388g;

    /* renamed from: h  reason: collision with root package name */
    public final String f50389h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.gms.signin.a f50390i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f50391j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f50392k;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f50402a;

        static {
            Covode.recordClassIndex(31398);
        }
    }

    static {
        Covode.recordClassIndex(31396);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f50393a;

        /* renamed from: b  reason: collision with root package name */
        public String f50394b;

        /* renamed from: c  reason: collision with root package name */
        public String f50395c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.c.b<Scope> f50396d;

        /* renamed from: e  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f50397e;

        /* renamed from: f  reason: collision with root package name */
        private int f50398f;

        /* renamed from: g  reason: collision with root package name */
        private View f50399g;

        /* renamed from: h  reason: collision with root package name */
        private com.google.android.gms.signin.a f50400h = com.google.android.gms.signin.a.f52099a;

        /* renamed from: i  reason: collision with root package name */
        private boolean f50401i;

        static {
            Covode.recordClassIndex(31397);
        }

        public final d a() {
            return new d(this.f50393a, this.f50396d, this.f50397e, this.f50398f, this.f50399g, this.f50394b, this.f50395c, this.f50400h, this.f50401i);
        }

        public final a a(Collection<Scope> collection) {
            if (this.f50396d == null) {
                this.f50396d = new androidx.c.b<>();
            }
            this.f50396d.addAll(collection);
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, com.google.android.gms.signin.a aVar, boolean z) {
        Set<Scope> unmodifiableSet;
        this.f50382a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f50383b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f50385d = map;
        this.f50387f = view;
        this.f50386e = i2;
        this.f50388g = str;
        this.f50389h = str2;
        this.f50390i = aVar;
        this.f50391j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (b bVar : map.values()) {
            hashSet.addAll(bVar.f50402a);
        }
        this.f50384c = Collections.unmodifiableSet(hashSet);
    }
}
