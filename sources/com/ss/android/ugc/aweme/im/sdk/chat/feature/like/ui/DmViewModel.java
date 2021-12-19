package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import android.content.Context;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.m;
import h.h;
import h.i;
import h.p;

public final class DmViewModel extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f100876c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f100877a = i.a((h.f.a.a) c.f100882a);

    /* renamed from: b  reason: collision with root package name */
    final h f100878b = i.a((h.f.a.a) d.f100883a);

    /* renamed from: d  reason: collision with root package name */
    private final h f100879d = i.a((h.f.a.a) e.f100884a);

    /* renamed from: e  reason: collision with root package name */
    private final h f100880e = i.a((h.f.a.a) b.f100881a);

    static {
        Covode.recordClassIndex(64532);
    }

    public final t<String> a() {
        return (t) this.f100879d.getValue();
    }

    public final t<Boolean> b() {
        return (t) this.f100880e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64533);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static DmViewModel a(Context context) {
            return (DmViewModel) com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.b.a(context, DmViewModel.class);
        }
    }

    static final class b extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100881a = new b();

        static {
            Covode.recordClassIndex(64534);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    static final class c extends m implements h.f.a.a<t<ai>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100882a = new c();

        static {
            Covode.recordClassIndex(64535);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<ai> invoke() {
            return new t();
        }
    }

    static final class d extends m implements h.f.a.a<t<p<? extends String, ? extends Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f100883a = new d();

        static {
            Covode.recordClassIndex(64536);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<p<? extends String, ? extends Boolean>> invoke() {
            return new t();
        }
    }

    static final class e extends m implements h.f.a.a<t<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f100884a = new e();

        static {
            Covode.recordClassIndex(64537);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<String> invoke() {
            return new t();
        }
    }
}
