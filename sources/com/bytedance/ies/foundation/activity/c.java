package com.bytedance.ies.foundation.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f33830a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(20079);
    }

    public final void onActivityDestroyed(Activity activity) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, d.f33833a, 6);
    }

    public final void onActivityPaused(Activity activity) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, e.f33834a, 6);
    }

    public final void onActivityResumed(Activity activity) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, h.f33835a, 6);
    }

    public final void onActivityStarted(Activity activity) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, j.f33836a, 6);
    }

    public final void onActivityStopped(Activity activity) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, k.f33837a, 6);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h.f.b.l.d(activity, "");
        a(this, activity, false, null, new C0738c(bundle), 6);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(bundle, "");
        a(this, activity, false, null, new i(bundle), 6);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33831a = new a();

        static {
            Covode.recordClassIndex(20080);
        }

        a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.a();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $savedInstanceState;

        static {
            Covode.recordClassIndex(20082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(Bundle bundle) {
            super(3);
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.a(this.$savedInstanceState);
            return h.z.f158842a;
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f33832a = new ac();

        static {
            Covode.recordClassIndex(20083);
        }

        ac() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.a(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ boolean $hasFocus;

        static {
            Covode.recordClassIndex(20084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(boolean z) {
            super(3);
            this.$hasFocus = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.a(aVar2, this.$hasFocus);
            return h.z.f158842a;
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ int $layoutResID;

        static {
            Covode.recordClassIndex(20085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(Activity activity, int i2) {
            super(3);
            this.$activity = activity;
            this.$layoutResID = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.b(this.$activity);
            return h.z.f158842a;
        }
    }

    static final class af extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(20086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(Activity activity, View view) {
            super(3);
            this.$activity = activity;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.c(this.$activity);
            return h.z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.q<b, a, Resources, Resources> {
        final /* synthetic */ z.e $result;

        static {
            Covode.recordClassIndex(20087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.e eVar) {
            super(3);
            this.$result = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Resources invoke(b bVar, a aVar, Resources resources) {
            b bVar2 = bVar;
            Resources resources2 = resources;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            if (resources2 != null) {
                this.$result.element = (T) bVar2.a(resources2);
            }
            return this.$result.element;
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.c$c  reason: collision with other inner class name */
    static final class C0738c extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $savedInstanceState;

        static {
            Covode.recordClassIndex(20088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0738c(Bundle bundle) {
            super(3);
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.b(aVar2, this.$savedInstanceState);
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f33833a = new d();

        static {
            Covode.recordClassIndex(20089);
        }

        d() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.d(aVar2);
            return h.z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f33834a = new e();

        static {
            Covode.recordClassIndex(20090);
        }

        e() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.b(aVar2);
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $resultCode;

        static {
            Covode.recordClassIndex(20091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2, Intent intent) {
            super(3);
            this.$resultCode = i2;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.a(this.$resultCode, this.$data);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;

        static {
            Covode.recordClassIndex(20092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2, int i3, Intent intent) {
            super(3);
            this.$requestCode = i2;
            this.$resultCode = i3;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            bVar2.a(this.$requestCode, this.$resultCode, this.$data);
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f33835a = new h();

        static {
            Covode.recordClassIndex(20093);
        }

        h() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.f(aVar2);
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $outState;

        static {
            Covode.recordClassIndex(20094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(3);
            this.$outState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.a(aVar2, this.$outState);
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f33836a = new j();

        static {
            Covode.recordClassIndex(20095);
        }

        j() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.c(aVar2);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f33837a = new k();

        static {
            Covode.recordClassIndex(20096);
        }

        k() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.e(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $savedInstanceState;

        static {
            Covode.recordClassIndex(20097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Bundle bundle) {
            super(3);
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.h(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f33838a = new m();

        static {
            Covode.recordClassIndex(20098);
        }

        m() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.j(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f33839a = new n();

        static {
            Covode.recordClassIndex(20099);
        }

        n() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.k(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f33840a = new o();

        static {
            Covode.recordClassIndex(20100);
        }

        o() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.i(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $outState;

        static {
            Covode.recordClassIndex(20101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(Bundle bundle) {
            super(3);
            this.$outState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.c(aVar2, this.$outState);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f33841a = new q();

        static {
            Covode.recordClassIndex(20102);
        }

        q() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.l(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f33842a = new r();

        static {
            Covode.recordClassIndex(20103);
        }

        r() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.m(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $savedInstanceState;

        static {
            Covode.recordClassIndex(20104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(Bundle bundle) {
            super(3);
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.g(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f33843a = new t();

        static {
            Covode.recordClassIndex(20105);
        }

        t() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.n(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f33844a = new u();

        static {
            Covode.recordClassIndex(20106);
        }

        u() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.o(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f33845a = new v();

        static {
            Covode.recordClassIndex(20107);
        }

        v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.p(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Bundle $outState;

        static {
            Covode.recordClassIndex(20108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(Bundle bundle) {
            super(3);
            this.$outState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.d(aVar2, this.$outState);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f33846a = new x();

        static {
            Covode.recordClassIndex(20109);
        }

        x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.q(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f33847a = new y();

        static {
            Covode.recordClassIndex(20110);
        }

        y() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.r(aVar2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z extends h.f.b.m implements h.f.a.q<b, a, h.z, h.z> {
        final /* synthetic */ Configuration $newConfig;

        static {
            Covode.recordClassIndex(20111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(Configuration configuration) {
            super(3);
            this.$newConfig = configuration;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(b bVar, a aVar, h.z zVar) {
            b bVar2 = bVar;
            a aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar2, "");
            bVar2.a(aVar2, this.$newConfig);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aa extends h.f.b.m implements h.f.a.q<b, a, Boolean, Boolean> {
        final /* synthetic */ KeyEvent $event;
        final /* synthetic */ int $keyCode;

        static {
            Covode.recordClassIndex(20081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(int i2, KeyEvent keyEvent) {
            super(3);
            this.$keyCode = i2;
            this.$event = keyEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Boolean invoke(b bVar, a aVar, Boolean bool) {
            b bVar2 = bVar;
            Boolean bool2 = bool;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            boolean z = false;
            if (bVar2.a(this.$keyCode, this.$event) || (bool2 != null && bool2.booleanValue())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0023 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0059 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final <T> T a(Activity activity, boolean z2, T t2, h.f.a.q<? super b, ? super a, ? super T, ? extends T> qVar) {
        if (!(activity instanceof a)) {
            activity = null;
        }
        a aVar = (a) activity;
        if (aVar != null) {
            Iterator<b> it = this.f33830a.iterator();
            t2 = t2;
            while (it.hasNext()) {
                b next = it.next();
                h.f.b.l.b(next, "");
                t2 = (Object) qVar.invoke(next, aVar, t2);
            }
            if (z2) {
                t2 = t2;
                for (com.bytedance.ies.foundation.base.c cVar : aVar.getViewModel().getProcessors()) {
                    t2 = (Object) qVar.invoke(cVar, aVar, t2);
                }
            }
            if (aVar.innerProcessors != null) {
                t2 = t2;
                for (d dVar : aVar.innerProcessors) {
                    t2 = (Object) qVar.invoke(dVar, aVar, t2);
                }
            }
        }
        return t2;
    }

    static /* synthetic */ Object a(c cVar, Activity activity, boolean z2, Object obj, h.f.a.q qVar, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return cVar.a(activity, z2, obj, qVar);
    }
}
