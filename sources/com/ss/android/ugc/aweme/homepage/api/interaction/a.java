package com.ss.android.ugc.aweme.homepage.api.interaction;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends t<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f99152a;

    /* renamed from: b  reason: collision with root package name */
    public b f99153b = new C2421a();

    static {
        Covode.recordClassIndex(63164);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.a$a  reason: collision with other inner class name */
    public static final class C2421a implements b {
        static {
            Covode.recordClassIndex(63165);
        }

        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        public final int a() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        public final void a(int i2, boolean z) {
        }

        C2421a() {
        }
    }

    /* renamed from: a */
    public final Integer getValue() {
        return Integer.valueOf(this.f99153b.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final /* synthetic */ void setValue(Integer num) {
        a(num.intValue());
    }

    public final void a(int i2) {
        this.f99153b.a(i2);
        super.setValue(Integer.valueOf(i2));
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f99152a = true;
        this.f99153b = bVar;
    }

    public final void a(int i2, boolean z) {
        b(i2, z);
    }

    private void b(int i2, boolean z) {
        this.f99153b.a(i2, z);
        super.setValue(Integer.valueOf(i2));
    }
}
