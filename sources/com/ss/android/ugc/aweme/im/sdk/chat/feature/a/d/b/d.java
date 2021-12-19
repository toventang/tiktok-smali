package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<SayHelloContent> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f100367b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f100368a;
    private View x;
    private a y;

    static {
        Covode.recordClassIndex(64118);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64119);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.ds9);
        l.b(findViewById, "");
        this.x = findViewById;
    }

    public /* synthetic */ d(View view, b bVar) {
        this(view, bVar, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, b bVar, boolean z) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f100368a = z;
    }

    public final void a(ai aiVar, ai aiVar2, SayHelloContent sayHelloContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) sayHelloContent, i2);
        boolean z = false;
        if (aiVar != null && sayHelloContent != null && !com.ss.android.ugc.aweme.im.service.c.d.e() && (!com.ss.android.ugc.aweme.im.service.c.d.c() || this.f100368a)) {
            if (sayHelloContent.isNewStyle()) {
                a aVar = this.y;
                if (!(aVar instanceof b)) {
                    if (aVar != null) {
                        aVar.a(false);
                    }
                    this.y = new b(this);
                }
            } else {
                a aVar2 = this.y;
                if (!(aVar2 instanceof c)) {
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    this.y = new c(this);
                }
            }
            z = true;
        }
        if (!z) {
            View view = this.x;
            if (view == null) {
                l.a("rootLayout");
            }
            view.setVisibility(8);
            return;
        }
        if (this.f100368a) {
            View view2 = this.x;
            if (view2 == null) {
                l.a("rootLayout");
            }
            i.b(view2, 0, 0, 0, 0, false, 16);
        }
        a aVar3 = this.y;
        if (aVar3 == null) {
            l.b();
        }
        if (sayHelloContent == null) {
            l.b();
        }
        aVar3.a(aiVar, aiVar2, sayHelloContent, i2, this.f100368a);
    }
}
