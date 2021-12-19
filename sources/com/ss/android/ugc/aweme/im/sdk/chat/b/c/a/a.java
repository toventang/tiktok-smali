package com.ss.android.ugc.aweme.im.sdk.chat.b.c.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.tooltip.a.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class a {
    static {
        Covode.recordClassIndex(63836);
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
        final /* synthetic */ View.OnClickListener $copyOnClick;
        final /* synthetic */ boolean $copySupport;
        final /* synthetic */ View.OnClickListener $deleteOnClick;
        final /* synthetic */ boolean $deleteSupport = true;
        final /* synthetic */ View.OnClickListener $replyOnClick;
        final /* synthetic */ boolean $replySupport;
        final /* synthetic */ View.OnClickListener $reportOnClick;
        final /* synthetic */ boolean $reportSupport;
        final /* synthetic */ View.OnClickListener $shareOnClick;
        final /* synthetic */ boolean $shareSupport;
        final /* synthetic */ z.e $tooltip;

        static {
            Covode.recordClassIndex(63838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(boolean z, View.OnClickListener onClickListener, z.e eVar, boolean z2, View.OnClickListener onClickListener2, boolean z3, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, boolean z4, View.OnClickListener onClickListener5) {
            super(1);
            this.$copySupport = z;
            this.$copyOnClick = onClickListener;
            this.$tooltip = eVar;
            this.$replySupport = z2;
            this.$replyOnClick = onClickListener2;
            this.$shareSupport = z3;
            this.$shareOnClick = onClickListener3;
            this.$deleteOnClick = onClickListener4;
            this.$reportSupport = z4;
            this.$reportOnClick = onClickListener5;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2460a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100162a;

            static {
                Covode.recordClassIndex(63839);
            }

            View$OnClickListenerC2460a(b bVar) {
                this.f100162a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f100162a.$copyOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f100162a.$tooltip.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC2461b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100163a;

            static {
                Covode.recordClassIndex(63840);
            }

            View$OnClickListenerC2461b(b bVar) {
                this.f100163a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f100163a.$replyOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f100163a.$tooltip.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100164a;

            static {
                Covode.recordClassIndex(63841);
            }

            c(b bVar) {
                this.f100164a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f100164a.$shareOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f100164a.$tooltip.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        static final class d implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100165a;

            static {
                Covode.recordClassIndex(63842);
            }

            d(b bVar) {
                this.f100165a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f100165a.$deleteOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f100165a.$tooltip.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        static final class e implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100166a;

            static {
                Covode.recordClassIndex(63843);
            }

            e(b bVar) {
                this.f100166a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f100166a.$reportOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f100166a.$tooltip.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            l.d(dVar2, "");
            if (this.$copySupport) {
                d.b bVar = new d.b();
                bVar.f45495a = R.raw.icon_doc_on_doc;
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    bVar.f45499e = R.attr.bc;
                } else {
                    bVar.f45496b = R.attr.aa;
                }
                bVar.f45497c = R.string.ce4;
                bVar.f45500f = new View$OnClickListenerC2460a(this);
                dVar2.a(bVar);
            }
            if (this.$replySupport) {
                d.b bVar2 = new d.b();
                bVar2.f45495a = R.raw.icon_arrow_turn_up_left;
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    bVar2.f45499e = R.attr.bc;
                } else {
                    bVar2.f45496b = R.attr.aa;
                }
                bVar2.f45497c = R.string.che;
                bVar2.f45500f = new View$OnClickListenerC2461b(this);
                dVar2.a(bVar2);
            }
            if (this.$shareSupport) {
                d.b bVar3 = new d.b();
                bVar3.f45495a = R.raw.icon_arrow_turn_up_right;
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    bVar3.f45499e = R.attr.bc;
                } else {
                    bVar3.f45496b = R.attr.aa;
                }
                bVar3.f45497c = R.string.cik;
                bVar3.f45500f = new c(this);
                dVar2.a(bVar3);
            }
            if (this.$deleteSupport) {
                d.b bVar4 = new d.b();
                bVar4.f45495a = R.raw.icon_trash_bin;
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    bVar4.f45499e = R.attr.av;
                    bVar4.f45496b = R.attr.av;
                } else {
                    bVar4.f45496b = R.attr.aa;
                }
                bVar4.f45497c = R.string.ce6;
                bVar4.f45500f = new d(this);
                dVar2.a(bVar4);
            }
            if (this.$reportSupport) {
                d.b bVar5 = new d.b();
                bVar5.f45495a = R.raw.icon_flag;
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.e()) {
                    bVar5.f45499e = R.attr.av;
                    bVar5.f45496b = R.attr.av;
                } else {
                    bVar5.f45496b = R.attr.aa;
                }
                bVar5.f45497c = R.string.chg;
                bVar5.f45500f = new e(this);
                dVar2.a(bVar5);
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$a  reason: collision with other inner class name */
    public static final class C2459a extends m implements h.f.a.b<e, h.z> {
        final /* synthetic */ View $v$inlined;

        static {
            Covode.recordClassIndex(63837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2459a(View view) {
            super(1);
            this.$v$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics()));
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.$v$inlined.getContext(), R.color.b6));
            return h.z.f158842a;
        }
    }
}
