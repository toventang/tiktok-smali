package com.ss.android.ugc.aweme.profile.editprofile.vm;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class ProfileEditProfileViewModel extends ac {

    /* renamed from: i  reason: collision with root package name */
    public static final a f116250i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f116251a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f116252b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<Integer> f116253c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public t<String> f116254d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public t<List<Integer>> f116255e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public t<Boolean> f116256f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public t<Boolean> f116257g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f116258h;

    /* renamed from: j  reason: collision with root package name */
    private final h f116259j = i.a((h.f.a.a) d.f116262a);

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116260a = new b();

        static {
            Covode.recordClassIndex(75042);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f116261a = new c();

        static {
            Covode.recordClassIndex(75043);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75040);
    }

    public final com.ss.android.ugc.aweme.profile.editprofile.a.b a() {
        return (com.ss.android.ugc.aweme.profile.editprofile.a.b) this.f116259j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75041);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.editprofile.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f116262a = new d();

        static {
            Covode.recordClassIndex(75044);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.profile.editprofile.a.b invoke() {
            return new com.ss.android.ugc.aweme.profile.editprofile.a.b();
        }
    }

    public static String a(List<Integer> list) {
        return n.a(list, ",", "[", "]", 0, (CharSequence) null, (h.f.a.b) null, 56);
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileEditProfileViewModel f116263a;

        static {
            Covode.recordClassIndex(75045);
        }

        public e(ProfileEditProfileViewModel profileEditProfileViewModel) {
            this.f116263a = profileEditProfileViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f116263a.f116257g.setValue(false);
            this.f116263a.f116253c.clear();
            this.f116263a.f116253c.addAll(this.f116263a.f116252b);
            this.f116263a.f116256f.setValue(true);
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileEditProfileViewModel f116264a;

        static {
            Covode.recordClassIndex(75046);
        }

        public f(ProfileEditProfileViewModel profileEditProfileViewModel) {
            this.f116264a = profileEditProfileViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f116264a.f116257g.setValue(false);
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                    this.f116264a.f116254d.setValue(aVar.getErrorMsg());
                    this.f116264a.f116255e.setValue(this.f116264a.f116253c);
                }
            }
            this.f116264a.f116254d.setValue(y.a((int) R.string.g21));
            this.f116264a.f116255e.setValue(this.f116264a.f116253c);
        }
    }

    public ProfileEditProfileViewModel(f.a.b.a aVar) {
        l.d(aVar, "");
        this.f116258h = aVar;
    }

    public final void a(com.bytedance.ies.powerlist.e eVar) {
        l.d(eVar, "");
        this.f116251a.clear();
        List<Integer> list = this.f116251a;
        List<com.bytedance.ies.powerlist.b.a> c2 = eVar.b().c();
        ArrayList arrayList = new ArrayList(n.a((Iterable) c2, 10));
        for (T t : c2) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesItem");
            arrayList.add(Integer.valueOf(t.f116166a));
        }
        list.addAll(n.g((Collection) arrayList));
        if (this.f116253c.isEmpty()) {
            this.f116253c.addAll(this.f116251a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0032 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> a(com.ss.android.ugc.aweme.profile.model.User r11) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.vm.ProfileEditProfileViewModel.a(com.ss.android.ugc.aweme.profile.model.User):java.util.List");
    }
}
