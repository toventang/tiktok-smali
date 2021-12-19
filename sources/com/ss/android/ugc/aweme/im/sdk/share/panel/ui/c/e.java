package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f103465e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AvatarImageView f103466a;

    /* renamed from: b  reason: collision with root package name */
    public final int f103467b = 2131232794;

    /* renamed from: c  reason: collision with root package name */
    public IMContact f103468c;

    /* renamed from: d  reason: collision with root package name */
    public final SharePanelViewModel f103469d;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f103470f;

    /* renamed from: g  reason: collision with root package name */
    private final RelativeLayout f103471g;

    static {
        Covode.recordClassIndex(66301);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66303);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        l.d(view, "");
        this.f103469d = sharePanelViewModel;
        View c2 = v.c(view, (int) R.id.csg);
        l.b(c2, "");
        this.f103470f = (TextView) c2;
        View c3 = v.c(view, (int) R.id.co6);
        l.b(c3, "");
        this.f103466a = (AvatarImageView) c3;
        View c4 = v.c(view, (int) R.id.bsq);
        l.b(c4, "");
        RelativeLayout relativeLayout = (RelativeLayout) c4;
        this.f103471g = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f103472a;

            static {
                Covode.recordClassIndex(66302);
            }

            {
                this.f103472a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!(b.b() == null || b.b().getUnder16Proxy() == null)) {
                    IIMunder16Proxy under16Proxy = b.b().getUnder16Proxy();
                    if (under16Proxy.c()) {
                        if (under16Proxy != null) {
                            under16Proxy.h();
                            return;
                        }
                        return;
                    }
                }
                SharePanelViewModel sharePanelViewModel = this.f103472a.f103469d;
                if (sharePanelViewModel != null) {
                    IMContact iMContact = this.f103472a.f103468c;
                    if (iMContact == null) {
                        l.b();
                    }
                    sharePanelViewModel.a(iMContact, true);
                }
            }
        });
    }
}
