package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class bj extends bk {
    private bg D;
    private String E = "";

    /* renamed from: a  reason: collision with root package name */
    View f101408a;

    /* renamed from: b  reason: collision with root package name */
    Boolean f101409b;

    static {
        Covode.recordClassIndex(64850);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final b<Boolean, z> bC_() {
        if (this.f101408a != null) {
            return new a(this);
        }
        return null;
    }

    public final void i() {
        LinearLayout.LayoutParams layoutParams = null;
        this.f101409b = null;
        View view = this.f101408a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            LinearLayout.LayoutParams layoutParams3 = layoutParams;
            if (layoutParams3 != null) {
                view.setVisibility(4);
                h.a(layoutParams3, 0);
                layoutParams3.gravity = 8388613;
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk
    public final void a() {
        super.a();
        this.f101319j = (TuxIconView) a(R.id.e_l);
        this.f101408a = (View) a(R.id.cf5);
        this.D = new bg(this.f101319j);
    }

    static final class a extends m implements b<Boolean, z> {
        final /* synthetic */ bj this$0;

        static {
            Covode.recordClassIndex(64851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(bj bjVar) {
            super(1);
            this.this$0 = bjVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                View view = ((bk) this.this$0).y;
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bj.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f101410a;

                        static {
                            Covode.recordClassIndex(64852);
                        }

                        {
                            this.f101410a = r1;
                        }

                        public final void run() {
                            View view;
                            bj bjVar = this.f101410a.this$0;
                            View view2 = bjVar.f101408a;
                            if (view2 != null && (view = ((bk) bjVar).y) != null) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                                    layoutParams = null;
                                }
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                if (layoutParams2 != null) {
                                    boolean z = true;
                                    if (!gb.a(view2.getContext()) ? view2.getX() < view.getX() : view2.getWidth() > view.getWidth()) {
                                        z = false;
                                    }
                                    if (bjVar.f101409b == null || !l.a(Boolean.valueOf(z), bjVar.f101409b)) {
                                        bjVar.f101409b = Boolean.valueOf(z);
                                        if (z) {
                                            h.a(layoutParams2, 0);
                                            layoutParams2.gravity = 8388611;
                                        } else {
                                            h.a(layoutParams2, 0);
                                            layoutParams2.gravity = 8388613;
                                        }
                                        view2.setLayoutParams(layoutParams2);
                                        view2.setVisibility(0);
                                    }
                                }
                            }
                        }
                    });
                }
            } else {
                this.this$0.i();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        super.a(onClickListener);
        this.f101319j.setOnClickListener(onClickListener);
        this.t.a(this.f101319j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view, bVar);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk
    public final com.bytedance.tux.tag.a a(ReferenceInfo referenceInfo, Context context) {
        BaseContent baseContent;
        l.d(referenceInfo, "");
        l.d(context, "");
        ReferenceInfoHint a2 = c.a(referenceInfo);
        if (a2 != null) {
            baseContent = a2.getParsedContent();
        } else {
            baseContent = null;
        }
        if (!(baseContent instanceof ShareAwemeContent)) {
            baseContent = null;
        }
        ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
        if (shareAwemeContent != null) {
            return bk.a.a(context, shareAwemeContent.getAuthorUsername());
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk
    public final /* bridge */ /* synthetic */ void a(ai aiVar, ai aiVar2, TextContent textContent, int i2) {
        a(aiVar, aiVar2, textContent, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk
    public final void a(ai aiVar, ai aiVar2, TextContent textContent, int i2) {
        l.d(aiVar, "");
        if (this.E.length() == 0 || (!l.a((Object) this.E, (Object) aiVar.getUuid()))) {
            String uuid = aiVar.getUuid();
            l.b(uuid, "");
            this.E = uuid;
            i();
        }
        super.a(aiVar, aiVar2, textContent, i2);
        bg bgVar = this.D;
        if (bgVar != null) {
            bgVar.a(this.s);
        }
    }
}
