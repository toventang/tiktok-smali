package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;

public abstract class a<VM extends BasePrivacySettingViewModel> extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final VM f77677a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f77678b = h.i.a((h.f.a.a) new i(this));

    static {
        Covode.recordClassIndex(48069);
    }

    public boolean a(int i2) {
        return false;
    }

    public final o b() {
        return (o) this.f77678b.getValue();
    }

    public abstract String c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$a  reason: collision with other inner class name */
    public static final class C1801a extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1801a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(this.this$0.b(), this.this$0.f77467d);
            return z.f158842a;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f77680b = false;

        static {
            Covode.recordClassIndex(48073);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
        public final boolean d() {
            return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(this.f77679a.b()).f77440b;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
        public final boolean c() {
            if (!com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(this.f77679a.b()).f77439a) {
                return false;
            }
            if (!this.f77680b || !com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f77679a = aVar;
        }
    }

    static final class i extends m implements h.f.a.a<o> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, this.this$0.c());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ int $optionTag;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, int i2) {
            super(0);
            this.this$0 = aVar;
            this.$optionTag = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            p pVar;
            o b2 = this.this$0.b();
            if (b2 != null) {
                pVar = b2.getTargetRestrictionOption(Integer.valueOf(this.$optionTag));
            } else {
                pVar = null;
            }
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(pVar, this.this$0.f77467d);
            return z.f158842a;
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77682b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f77683c;

        static {
            Covode.recordClassIndex(48077);
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
        public final boolean d() {
            p pVar;
            o b2 = this.f77681a.b();
            if (b2 != null) {
                pVar = b2.getTargetRestrictionOption(Integer.valueOf(this.f77682b));
            } else {
                pVar = null;
            }
            return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(pVar).f77440b;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
        public final boolean c() {
            p pVar;
            o b2 = this.f77681a.b();
            if (b2 != null) {
                pVar = b2.getTargetRestrictionOption(Integer.valueOf(this.f77682b));
            } else {
                pVar = null;
            }
            if (!com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(pVar).f77439a || !com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(this.f77681a.b()).f77439a) {
                return false;
            }
            if (!this.f77683c || !com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
                return true;
            }
            return false;
        }

        h(a aVar, int i2, boolean z) {
            this.f77681a = aVar;
            this.f77682b = i2;
            this.f77683c = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b
    public int getItemCount() {
        if (!com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(b()).f77440b) {
            return 0;
        }
        return super.getItemCount();
    }

    public String d() {
        Integer valueOf;
        o b2 = b();
        if (b2 == null || (valueOf = Integer.valueOf(b2.getTipsType())) == null || valueOf.intValue() != 1) {
            return null;
        }
        return this.f77467d.getString(R.string.fn6);
    }

    public void b(int i2) {
        this.f77677a.a(i2);
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends j implements h.f.a.b<Integer, z> {
        static {
            Covode.recordClassIndex(48072);
        }

        c(a aVar) {
            super(1, aVar, a.class, "onSelect", "onSelect(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            ((a) this.receiver).b(num.intValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class g extends j implements h.f.a.b<Integer, z> {
        static {
            Covode.recordClassIndex(48076);
        }

        g(a aVar) {
            super(1, aVar, a.class, "onSelect", "onSelect(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            ((a) this.receiver).b(num.intValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends j implements h.f.a.b<Integer, Boolean> {
        static {
            Covode.recordClassIndex(48071);
        }

        b(a aVar) {
            super(1, aVar, a.class, "interceptSelect", "interceptSelect(I)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(((a) this.receiver).a(num.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class f extends j implements h.f.a.b<Integer, Boolean> {
        static {
            Covode.recordClassIndex(48075);
        }

        f(a aVar) {
            super(1, aVar, a.class, "interceptSelect", "interceptSelect(I)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(((a) this.receiver).a(num.intValue()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VM vm, Context context) {
        super(context);
        l.d(vm, "");
        l.d(context, "");
        this.f77677a = vm;
        if ((context instanceof Activity) && context != null) {
            vm.f77670a = new WeakReference<>(context);
        }
        String c2 = c();
        l.d(c2, "");
        vm.f77671b = c2;
    }

    public static /* synthetic */ g a(a aVar, g gVar) {
        l.d(gVar, "");
        gVar.a(aVar.f77677a);
        gVar.b(new C1801a(aVar));
        gVar.b(new b(aVar));
        gVar.a(new c(aVar));
        gVar.a(new d(aVar));
        return gVar;
    }

    public final g a(g gVar, int i2, boolean z) {
        l.d(gVar, "");
        gVar.a(this.f77677a);
        gVar.b(new e(this, i2));
        gVar.b(new f(this));
        gVar.a(new g(this));
        gVar.a(new h(this, i2, z));
        return gVar;
    }
}
