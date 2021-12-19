package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final e f34399a;

    /* renamed from: b  reason: collision with root package name */
    public final e f34400b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerPageState f34401c;

    static {
        Covode.recordClassIndex(20551);
    }

    public static final class a extends i {

        /* renamed from: d  reason: collision with root package name */
        public final e f34402d;

        /* renamed from: e  reason: collision with root package name */
        public final e f34403e;

        static {
            Covode.recordClassIndex(20552);
        }

        public /* synthetic */ a(e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, e eVar2) {
            super(eVar, eVar2, PowerPageState.End, (byte) 0);
            l.c(eVar, "");
            this.f34402d = eVar;
            this.f34403e = eVar2;
        }
    }

    public static final class c extends i {

        /* renamed from: d  reason: collision with root package name */
        public final e f34407d;

        /* renamed from: e  reason: collision with root package name */
        public final e f34408e;

        static {
            Covode.recordClassIndex(20554);
        }

        public /* synthetic */ c(e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, e eVar2) {
            super(eVar, eVar2, PowerPageState.Loaded, (byte) 0);
            l.c(eVar, "");
            this.f34407d = eVar;
            this.f34408e = eVar2;
        }
    }

    public static final class d extends i {

        /* renamed from: d  reason: collision with root package name */
        public final e f34409d;

        /* renamed from: e  reason: collision with root package name */
        public final e f34410e;

        static {
            Covode.recordClassIndex(20555);
        }

        public /* synthetic */ d(e eVar) {
            this(eVar, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e eVar, e eVar2) {
            super(eVar, eVar2, PowerPageState.Loading, (byte) 0);
            l.c(eVar, "");
            this.f34409d = eVar;
            this.f34410e = eVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        if (this.f34399a == eVar || eVar == e.Refresh) {
            return true;
        }
        return false;
    }

    public static final class e extends i {

        /* renamed from: d  reason: collision with root package name */
        public final e f34411d;

        /* renamed from: e  reason: collision with root package name */
        public final e f34412e;

        static {
            Covode.recordClassIndex(20556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private e(e eVar) {
            super(eVar, null, PowerPageState.Reset, (byte) 0);
            l.c(eVar, "");
            this.f34411d = eVar;
            this.f34412e = null;
        }

        public /* synthetic */ e(e eVar, byte b2) {
            this(eVar);
        }
    }

    public static final class b extends i {

        /* renamed from: d  reason: collision with root package name */
        public final e f34404d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f34405e;

        /* renamed from: f  reason: collision with root package name */
        public final e f34406f;

        static {
            Covode.recordClassIndex(20553);
        }

        public /* synthetic */ b(e eVar, Exception exc) {
            this(eVar, exc, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Exception exc, e eVar2) {
            super(eVar, eVar2, PowerPageState.Error, (byte) 0);
            l.c(eVar, "");
            l.c(exc, "");
            this.f34404d = eVar;
            this.f34405e = exc;
            this.f34406f = eVar2;
        }
    }

    private i(e eVar, e eVar2, PowerPageState powerPageState) {
        this.f34399a = eVar;
        this.f34400b = eVar2;
        this.f34401c = powerPageState;
    }

    public /* synthetic */ i(e eVar, e eVar2, PowerPageState powerPageState, byte b2) {
        this(eVar, eVar2, powerPageState);
    }
}
