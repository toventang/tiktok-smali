package leakcanary.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;
import leakcanary.a;
import leakcanary.g;

public final class o implements b<Activity, z> {

    /* renamed from: a  reason: collision with root package name */
    public final g f159483a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<a.C4197a> f159484b;

    /* renamed from: c  reason: collision with root package name */
    private final a f159485c = new a(this);

    static {
        Covode.recordClassIndex(105879);
    }

    public static final class a extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f159486a;

        static {
            Covode.recordClassIndex(105880);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(o oVar) {
            this.f159486a = oVar;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDestroyed(i iVar, Fragment fragment) {
            l.c(iVar, "");
            l.c(fragment, "");
            if (this.f159486a.f159484b.invoke().f159362c) {
                this.f159486a.f159483a.a(fragment);
            }
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentCreated(i iVar, Fragment fragment, Bundle bundle) {
            l.c(iVar, "");
            l.c(fragment, "");
            if (this.f159486a.f159484b.invoke().f159362c) {
                this.f159486a.f159483a.b(fragment);
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Activity activity) {
        Activity activity2 = activity;
        l.c(activity2, "");
        if (activity2 instanceof e) {
            ((e) activity2).getSupportFragmentManager().a((i.b) this.f159485c, true);
        }
        return z.f158842a;
    }

    public o(g gVar, h.f.a.a<a.C4197a> aVar) {
        l.c(gVar, "");
        l.c(aVar, "");
        this.f159483a = gVar;
        this.f159484b = aVar;
    }
}
